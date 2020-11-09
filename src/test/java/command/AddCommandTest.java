/*
package command;

import cheatsheet.CheatSheetList;
import exception.CommandException;

import org.junit.jupiter.api.Test;
import parser.CommandFlag;
import stubs.EditorStub;
import ui.Printer;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AddCommandTest {
    @Test
    void execute_nameAndSubject_success() throws CommandException {
        CheatSheetList cheatSheetList = new CheatSheetList();
        EditorStub editorStub = new EditorStub();
        AddCommand addCommand = new AddCommand(new Printer(), cheatSheetList, editorStub);
        HashMap<CommandFlag, String> map = new HashMap<>();
        map.put(CommandFlag.NAME, "Test1");
        map.put(CommandFlag.SUBJECT, "Java1");
        addCommand.setFlagsToDescriptionsMap(map);
        editorStub.writeContent("Content1");
        addCommand.execute();
        assertEquals(cheatSheetList.getSize(), 1);
    }

    @Test
    void execute_nameOnly_success() throws CommandException {
        CheatSheetList cheatSheetList = new CheatSheetList();
        EditorStub editorStub = new EditorStub();
        AddCommand addCommand = new AddCommand(new Printer(), cheatSheetList, editorStub);
        HashMap<CommandFlag, String> map = new HashMap<>();
        map.put(CommandFlag.NAME, "Test1");
        map.put(CommandFlag.SUBJECT, null);
        addCommand.setFlagsToDescriptionsMap(map);
        editorStub.writeContent("Content1");
        addCommand.execute();
        assertEquals(cheatSheetList.getSize(), 1);
    }

    @Test
    void execute_SubjectOnly_exceptionThrown() throws CommandException {
        CheatSheetList cheatSheetList = new CheatSheetList();
        EditorStub editorStub = new EditorStub();
        AddCommand addCommand = new AddCommand(new Printer(), cheatSheetList, editorStub);
        HashMap<CommandFlag, String> map = new HashMap<>();
        map.put(CommandFlag.NAME, null);
        map.put(CommandFlag.SUBJECT, "Java1");
        addCommand.setFlagsToDescriptionsMap(map);
        editorStub.writeContent("Content1");
        assertThrows(CommandException.class, addCommand::execute);
    }
}
*/
