package sort;

import cheatsheet.CheatSheet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SortBySubjectRevTest {
    @Test
    void compare_firstCheatSheetIsSmaller_success() {
        SortBySubjectRev sortBySubjectRev = new SortBySubjectRev();
        CheatSheet smallerCheatSheet = new CheatSheet("gorilla", "C", "hello1");
        CheatSheet biggerCheatSheet = new CheatSheet("elephant", "Java", "hello2");
        assertTrue(sortBySubjectRev.compare(smallerCheatSheet, biggerCheatSheet) > 0);
    }

    @Test
    void compare_secondCheatSheetIsSmaller_success() {
        SortBySubjectRev sortBySubjectRev = new SortBySubjectRev();
        CheatSheet smallerCheatSheet = new CheatSheet("gorilla", "C", "hello1");
        CheatSheet biggerCheatSheet = new CheatSheet("elephant", "Java", "hello2");
        assertTrue(sortBySubjectRev.compare(biggerCheatSheet, smallerCheatSheet) < 0);
    }

    @Test
    void compare_bothCheatSheetsEqual_success() {
        SortBySubjectRev sortBySubjectRev = new SortBySubjectRev();
        CheatSheet smallerCheatSheet = new CheatSheet("gorilla", "C", "hello1");
        CheatSheet biggerCheatSheet = new CheatSheet("elephant", "C", "hello2");
        assertEquals(sortBySubjectRev.compare(biggerCheatSheet, smallerCheatSheet), 0);
    }
}