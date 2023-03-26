/**
 * Takes in user input and splits it into 2 parts
 * First part is the function name
 * Second part is the todo to be executed in that function
 * Returns the two parts using get methods
 *
 * @param userInput
 */

package seedu.badMaths;

public class Parser {

    protected String userInput;

    public Parser(String userInput) { // Delete. 2
        this.userInput = userInput;
    }

    public String getCommand() {
        if (userInput.contains(".")) {
            return userInput.substring(0, userInput.indexOf(".")); // Delete
        } else {
            return "Invalid command";
        }
    }

    public String getToDo() {
        if (userInput.contains(".") && userInput.contains(" ")) {
            return userInput.substring(userInput.indexOf(".") + 2); // returns 2
        } else {
            return "Invalid todo";
        }
    }

}
