/**
 * Takes in user input and splits it into 2 parts
 * First part is the function name
 * Second part is the todo to be executed in that function
 * Returns the two parts using get methods
 *
 * @param userInput
 */

package seedu.badMaths;

import seedu.badMaths.ui.Ui;

public class Parser {

    protected String userInput;

    public Parser(String userInput) { // Bye. abdscscs
        this.userInput = userInput;
    }

    public String getCommand() {
        if (userInput.contains(".")) {
            return userInput.substring(0, userInput.indexOf(".")); // Bye
        } else {
            return "Invalid command";
        }
    }

    public String getToDo() {
        if (userInput.contains(".") && userInput.contains(" ")) {
            return userInput.substring(userInput.indexOf(".") + 2); // absbsds
        } else {
            return "Invalid todo";

        }
    }
}
