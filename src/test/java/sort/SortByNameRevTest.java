package sort;

import cheatsheet.CheatSheet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortByNameRevTest {
    @Test
    void compare_firstCheatSheetIsSmaller_success() {
        SortByNameRev sortByNameRev = new SortByNameRev();
        CheatSheet smallerCheatSheet = new CheatSheet("apple", "C", "hello1");
        CheatSheet biggerCheatSheet = new CheatSheet("elephant", "Cpp", "hello2");
        assertTrue(sortByNameRev.compare(smallerCheatSheet, biggerCheatSheet) > 0);
    }

    @Test
    void compare_secondCheatSheetIsSmaller_success() {
        SortByNameRev sortByNameRev = new SortByNameRev();
        CheatSheet smallerCheatSheet = new CheatSheet("apple", "C", "hello1");
        CheatSheet biggerCheatSheet = new CheatSheet("elephant", "Cpp", "hello2");
        assertTrue(sortByNameRev.compare(biggerCheatSheet, smallerCheatSheet) < 0);
    }
}