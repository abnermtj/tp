package sort;

import cheatsheet.CheatSheet;

import java.util.Comparator;

public class SortByLanguageRev implements Comparator<CheatSheet> {
    public int compare(CheatSheet a, CheatSheet b) {
        Boolean isAFavorited = a.getIsFavourite();
        Boolean isBFavorited = b.getIsFavourite();
        int favComparator = isBFavorited.compareTo(isAFavorited);
        if (favComparator != 0) {
            return favComparator;
        }
        return b.getSubject().compareTo(a.getSubject());
    }
}
