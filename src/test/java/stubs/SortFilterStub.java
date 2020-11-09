package stubs;

import cheatsheet.CheatSheet;
import command.SortFilter;
import exception.CommandException;
import sort.SortBySubject;
import sort.SortBySubjectRev;
import sort.SortByName;
import sort.SortByNameRev;
import ui.ConsoleColorsEnum;
import ui.Printer;
import ui.TablePrinter;

import java.util.ArrayList;
import java.util.Scanner;

public class SortFilterStub extends SortFilter {

    public SortFilterStub(ArrayList<CheatSheet> cheatSheetArrayList, Printer printer) {
        super(cheatSheetArrayList, printer);
    }

    public void execute(TablePrinter tp) {
    }

    public void execute() {
    }

}
