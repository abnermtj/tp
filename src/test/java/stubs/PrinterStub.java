package stubs;

import cheatsheet.CheatSheet;
import ui.Printer;

public class PrinterStub extends Printer {
    private String cheatSheetName;

    public void printViewCheatSheetMessage(CheatSheet cheatSheet) {
        cheatSheetName = cheatSheet.getName();
    }

    public String getCheatSheetName() {
        return cheatSheetName;
    }
}
