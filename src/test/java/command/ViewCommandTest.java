/*
package command;

import cheatsheet.CheatSheetList;
import exception.CommandException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import parser.CommandFlag;
import stubs.EditorStub;
import stubs.PrinterStub;
import ui.Printer;


import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ViewCommandTest {

    private static CheatSheetList cheatSheetList;
    private static EditorStub editorStub;

    @BeforeAll
    public static void setUp() throws CommandException {
        cheatSheetList = new CheatSheetList();
        editorStub = new EditorStub();

        for (int i = 0; i < 10; i++) {
            AddCommand addCommand = new AddCommand(new Printer(), cheatSheetList, editorStub);
            HashMap<CommandFlag, String> addMap = new HashMap<>();
            addMap.put(CommandFlag.NAME, "Test" + i);
            addMap.put(CommandFlag.SUBJECT, "Java" + i);
            addCommand.setFlagsToDescriptionsMap(addMap);
            editorStub.writeContent("Content" + i);
            addCommand.execute();
        }
    }

    @Test
    void execute_validName_success() throws CommandException {
        PrinterStub printerStub = new PrinterStub();
        ViewCommand viewCommand = new ViewCommand(printerStub, cheatSheetList);
        HashMap<CommandFlag, String> map = new HashMap<>();
        map.put(CommandFlag.NAME, "Test1");
        map.put(CommandFlag.INDEX, null);
        viewCommand.setFlagsToDescriptionsMap(map);
        viewCommand.execute();
        assertEquals(printerStub.getCheatSheetName(), "Test1");
    }

    @Test
    void execute_validIndex_success() throws CommandException {
        PrinterStub printerStub = new PrinterStub();
        ViewCommand viewCommand = new ViewCommand(printerStub, cheatSheetList);
        HashMap<CommandFlag, String> map = new HashMap<>();
        map.put(CommandFlag.NAME, null);
        map.put(CommandFlag.INDEX, "3");
        viewCommand.setFlagsToDescriptionsMap(map);
        viewCommand.execute();
        assertEquals(printerStub.getCheatSheetName(), "Test2");
    }

    @Test
    void execute_inValidNumberedIndex_exceptionThrown() {
        PrinterStub printerStub = new PrinterStub();
        ViewCommand viewCommand = new ViewCommand(printerStub, cheatSheetList);
        HashMap<CommandFlag, String> map = new HashMap<>();
        map.put(CommandFlag.NAME, null);
        map.put(CommandFlag.INDEX, "11");
        viewCommand.setFlagsToDescriptionsMap(map);
        assertThrows(CommandException.class, viewCommand::execute);
    }

    @Test
    void execute_inValidLetterIndex_exceptionThrown() {
        PrinterStub printerStub = new PrinterStub();
        ViewCommand viewCommand = new ViewCommand(printerStub, cheatSheetList);
        HashMap<CommandFlag, String> map = new HashMap<>();
        map.put(CommandFlag.NAME, null);
        map.put(CommandFlag.INDEX, "asd");
        viewCommand.setFlagsToDescriptionsMap(map);
        assertThrows(CommandException.class, viewCommand::execute);
    }

    @Test
    void execute_inValidName_exceptionThrown() {
        PrinterStub printerStub = new PrinterStub();
        ViewCommand viewCommand = new ViewCommand(printerStub, cheatSheetList);
        HashMap<CommandFlag, String> map = new HashMap<>();
        map.put(CommandFlag.NAME, "Test11");
        map.put(CommandFlag.INDEX, null);
        viewCommand.setFlagsToDescriptionsMap(map);
        assertThrows(CommandException.class, viewCommand::execute);
    }
}
*/
