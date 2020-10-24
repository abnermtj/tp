package parser;

public enum ArgumentFlagEnum {
    NAME("/n"),
    DESCRIPTION("/d"),
    INDEX("/i"),
    SUBJECT("/l"),
    SECTIONKEYWORD("/k");

    private final String associatedKeyWord;

    ArgumentFlagEnum(String associatedKeyword) {
        this.associatedKeyWord = associatedKeyword;
    }

    public String getAssociatedKeyWord() {
        return this.associatedKeyWord;
    }
}
