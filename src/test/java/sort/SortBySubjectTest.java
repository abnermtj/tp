package sort;

import cheatsheet.CheatSheet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SortBySubjectTest {
    @Test
    void firstCheatSheetIsSmaller_success() {
        SortBySubject sortBySubject = new SortBySubject();
        CheatSheet smallerCheatSheet = new CheatSheet("gorilla", "C", "hello1");
        CheatSheet biggerCheatSheet = new CheatSheet("elephant", "Java", "hello2");
        assertTrue(sortBySubject.compare(smallerCheatSheet, biggerCheatSheet) < 0);
    }

    @Test
    void secondCheatSheetIsSmaller_success() {
        SortBySubject sortBySubject = new SortBySubject();
        CheatSheet smallerCheatSheet = new CheatSheet("gorilla", "C", "hello1");
        CheatSheet biggerCheatSheet = new CheatSheet("elephant", "Java", "hello2");
        assertTrue(sortBySubject.compare(biggerCheatSheet, smallerCheatSheet) > 0);
    }

    @Test
    void compare_bothCheatSheetsEqual_success() {
        SortBySubject sortBySubject = new SortBySubject();
        CheatSheet smallerCheatSheet = new CheatSheet("gorilla", "C", "hello1");
        CheatSheet biggerCheatSheet = new CheatSheet("elephant", "C", "hello2");
        assertEquals(sortBySubject.compare(biggerCheatSheet, smallerCheatSheet), 0);
    }
}