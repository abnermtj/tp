package sort;

import cheatsheet.CheatSheet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortByNameTest {

    @Test
    void compare_firstCheatSheetIsSmaller_success() {
        SortByName sortByName = new SortByName();
        CheatSheet smallerCheatSheet = new CheatSheet("apple", "C", "hello1");
        CheatSheet biggerCheatSheet = new CheatSheet("elephant", "Cpp", "hello2");
        assertTrue(sortByName.compare(smallerCheatSheet, biggerCheatSheet) < 0);
    }

    @Test
    void compare_secondCheatSheetIsSmaller_success() {
        SortByName sortByName = new SortByName();
        CheatSheet smallerCheatSheet = new CheatSheet("apple", "C", "hello1");
        CheatSheet biggerCheatSheet = new CheatSheet("elephant", "Cpp", "hello2");
        assertTrue(sortByName.compare(biggerCheatSheet, smallerCheatSheet) > 0);
    }
}