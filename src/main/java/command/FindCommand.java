package command;

import cheatsheet.CheatSheet;
import cheatsheet.CheatSheetList;
import exception.CommandException;
import parser.CommandFlag;
import ui.Printer;
import ui.TablePrinter;

import java.util.ArrayList;

/**
 * Command to find a specific cheatsheet in CheatSheetList via name or index.
 */
public class FindCommand extends FinderCommand {
    private CheatSheetList cheatSheetList;
    public static final String invoker = "/find";

    /**
     * Constructor for FindCommand.
     * Required Argument: NAME, SUBJECT, SECTIONKEYWORD (at LEAST one of these three)
     *
     * @param printer The printer object handles the user interaction
     * @param cheatSheetList The cheatSheetList object holds the current list of cheatsheets.
     */
    public FindCommand(Printer printer, CheatSheetList cheatSheetList) {
        super(printer, cheatSheetList);
        this.cheatSheetList = cheatSheetList;
        flagsToDescriptions.put(CommandFlag.NAME, null);
        flagsToDescriptions.put(CommandFlag.SUBJECT, null);
        flagsToDescriptions.put(CommandFlag.SECTIONKEYWORD, null);
        alternativeFlags.add(CommandFlag.NAME);
        alternativeFlags.add(CommandFlag.SUBJECT);
        alternativeFlags.add(CommandFlag.SECTIONKEYWORD);
    }

    /**
     * Searches through every cheatsheet in CheatSheetList to find for cheatsheets that matched
     * the name or subject or keyword of what the user entered.
     * Prints a table with all cheatsheets that met the criteria of the user input.
     * Header of each column in table: Index, Name, Subject, Preview
     * If there is cheatsheet in the list, the program enters sorting mode that allows user to sort by name or subject.
     *
     * @throws CommandException Thrown if no cheatsheet in CheatSheetList matched the name or subject or keyword
     *                          that the user entered.
     */
    @Override
    public void execute() throws CommandException {

        ArrayList<CheatSheet> matchedContents = new ArrayList<>();


        String name = flagsToDescriptions.get(CommandFlag.NAME);
        String subject = flagsToDescriptions.get(CommandFlag.SUBJECT);
        String keyword = flagsToDescriptions.get(CommandFlag.SECTIONKEYWORD);

        for (CheatSheet cs : cheatSheetList.getList()) {

            if (checkCheatSheetMatchesWithFields(cs, name, subject, keyword)) {
                matchedContents.add(cs);
            }
        }

        if (matchedContents.isEmpty()) {
            throw new CommandException("No matching content found");
        }

        TablePrinter tp = new TablePrinter(printer, matchedContents);
        tp.execute();
        SortFilter sortFilter = new SortFilter(matchedContents, printer);
        sortFilter.execute();
    }
}
