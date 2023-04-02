package seedu.badMaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParserTest {

    @Test
    void getCommandShouldReturnCommand() {
        String userInput = "Store store this";
        Parser parserTest = new Parser(userInput);
        String commandTest = parserTest.getCommand();
        assertEquals(commandTest, "Store");
    }

    @Test
    void getCommandShouldIgnoreTrailingSpaces() {
        String userInput = "       Store store this     ";
        Parser parserTest = new Parser(userInput);
        String commandTest = parserTest.getCommand();
        assertEquals(commandTest, "Store");
    }

    @Test
    void getToDoShouldReturnInvalidForSingleWordInput() {
        String userInput = "Help";
        Parser parserTest = new Parser(userInput);
        String toDoTest = parserTest.getToDo();
        assertEquals(toDoTest, "Invalid todo");
    }
    @Test
    void getToDoShouldIgnoreMultipleSpaces() {
        String userInput = "Quadratic      lol";
        Parser parserTest = new Parser(userInput);
        String toDoTest = parserTest.getToDo();
        assertEquals(toDoTest, "lol");
    }
}
