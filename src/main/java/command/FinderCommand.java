package command;

import cheatsheet.CheatSheet;
import cheatsheet.CheatSheetList;
import exception.CommandException;
import parser.ArgumentFlagEnum;
import ui.Printer;

public abstract class FinderCommand extends Command {
    public FinderCommand(Printer printer) {
        super(printer);
    }

    protected CheatSheet getCheatSheetFromNameOrIndex() throws CommandException {
        CheatSheet desiredCheatSheet = null;
        if (descriptionMap.get(ArgumentFlagEnum.NAME) != null) {
            String name = descriptionMap.get(ArgumentFlagEnum.NAME);
            desiredCheatSheet = CheatSheetList.get(name);
        } else if (descriptionMap.get(ArgumentFlagEnum.INDEX) != null) {
            int index = Integer.parseInt(descriptionMap.get(ArgumentFlagEnum.INDEX));
            desiredCheatSheet = CheatSheetList.get(index);
        }

        if (desiredCheatSheet == null) {
            throw new CommandException("Please enter a valid name or an index");
        }

        return desiredCheatSheet;
    }
}

