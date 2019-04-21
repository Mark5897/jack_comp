/**
 * Handles storing the type of keyword.
 * @author vincentii
 * @version 1.0
 */
public enum Keyword {
    CLASS,
    METHOD,
    FUNCTION,
    CONSTRUCTOR,
    INT,
    BOOLEAN,
    CHAR,
    VOID,
    VAR,
    STATIC,
    FIELD,
    LET,
    DO,
    IF,
    ELSE,
    WHILE,
    RETURN,
    TRUE,
    FALSE,
    NULL,
    THIS;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }

}