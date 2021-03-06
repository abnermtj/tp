package command;

import cheatsheet.CheatSheetList;
import storage.DataFileDestroyer;
import ui.Printer;

public class ClearCommand extends Command {
    protected DataFileDestroyer fileDestroyer;

    public ClearCommand(Printer printer, DataFileDestroyer fileDestroyer) {
        super(printer);
        this.fileDestroyer = fileDestroyer;
    }

    @Override
    public void execute() {
        printer.printClearCheatSheetMessage(CheatSheetList.getSize());
        CheatSheetList.clear();
        fileDestroyer.executeFunction();
    }
}
