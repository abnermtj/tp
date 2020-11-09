package command;

import cheatsheet.CheatSheetList;
import exception.CommandException;
import org.junit.jupiter.api.Test;
import parser.CommandFlag;
import stubs.EditorStub;
import ui.Printer;

import java.io.ByteArrayInputStream;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FindCommandTest {
/*
    @Test
    void execute_validName_success() throws CommandException {
        CheatSheetList cheatSheetList = new CheatSheetList();
        EditorStub editorStub = new EditorStub();

        AddCommand addCommand = new AddCommand(new Printer(), cheatSheetList, editorStub);
        HashMap<CommandFlag, String> addCommandMap = new HashMap<>();
        addCommandMap.put(CommandFlag.NAME, "Test1");
        addCommandMap.put(CommandFlag.SUBJECT, "Java1");
        addCommand.setFlagsToDescriptionsMap(addCommandMap);
        editorStub.writeContent("Content1");
        addCommand.execute();

        FindCommand findCommand = new FindCommand(new Printer(), cheatSheetList);
        HashMap<CommandFlag, String> findCommandMap = new HashMap<>();
        findCommandMap.put(CommandFlag.NAME, "Test1");
        findCommand.setFlagsToDescriptionsMap(findCommandMap);
        findCommand.execute();

        String data = "Hello, World!\r\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }*/
}
