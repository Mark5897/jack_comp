/**
 * Handles the type of the token.
 * @author vincentii
 * @version 1.0
 */
public enum TokenType {
    KEYWORD,
    SYMBOL,
    INT_CONST,
    STRING_CONST,
    IDENTIFIER;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }

}