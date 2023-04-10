package seedu.badmaths.ui;

import seedu.badmaths.note.Note;
import seedu.badmaths.note.NotePriority;

import java.util.ArrayList;

public class Ui {

    private static String logo = "\n" +
            "____            _   __  __       _   _\n" +
            "|  _ \\          | | |  \\/  |     | | | |\n" +
            "| |_) | __ _  __| | | \\  / | __ _| |_| |__  ___\n" +
            "|  _ < / _` |/ _` | | |\\/| |/ _` | __| '_ \\/ __|\n" +
            "| |_) | (_| | (_| | | |  | | (_| | |_| | | \\__ \\\n" +
            "|____/ \\__,_|\\__,_| |_|  |_|\\__,_|\\__|_| |_|___/";


    public static void printWelcomeMessage() {
        System.out.println(logo + "\nYou can type 'Help' to learn what I can do for you :)");
    }
    public static void printLogo(){
        System.out.println(logo);
    }
    public static void printTanHasNoAmplitude(){
        System.out.println("Psss... Tangent graph has no amplitude.");
    }
    public static void printNegativeFrequencyEntered(){
        System.out.println("Frequency cannot be negative.");
    }
    public static void printZeroFrequencyEntered(){
        System.out.println("Frequency cannot be zero.");
    }

    public static void printIncorrectFormatEntered() {
        System.out.println("Please enter the format as required.");
    }

    public static void printNegativeAmplitudeEntered() {
        System.out.println("Amplitude cannot be negative!");
    }

    public static void printAmplitude(double amplitude) {
        System.out.println("This is the amplitude: " + amplitude);
    }

    public static void printPhase(double phase) {
        System.out.println("This is the phase: " + phase);
    }

    public static void printVerticalShift(double verticalShift) {
        System.out.println("This is the vertical shift: " + verticalShift);
    }

    public static void printFrequency(Double freq) {
        System.out.println("This is the freq (Hz): " + freq);
    }

    //@@author WilsonLee2000
    public static void printInvalidNumberEntered() {
        System.out.println("Input must be an integer!");
    }

    //@@author ZiqiuZeng
    public static void printMark(String text) {
        System.out.println("You have marked this note as done:");
        System.out.println(text);
    }

    //@@author ZiqiuZeng
    public static void printUnmark(String text) {
        System.out.println("You have unmarked this note:");
        System.out.println(text);
    }

    //@@author WilsonLee2000
    public static void printAddNote(String text, int size) {
        System.out.println("You have added this note:");
        System.out.println(text);
        System.out.println("Now you have " + size + " notes in the list.");
    }

    //@@author WilsonLee2000
    public static void printDelete(String text, int size) {
        System.out.println("You have removed this note:");
        System.out.println(text);
        System.out.println("Now you have " + (size - 1) + " notes in the list.");
    }

    //@@author WilsonLee2000
    public static void printNotes(ArrayList<Note> notes) {
        if (notes.size() == 0) {
            System.out.println("You have no notes yet. :(");
        } else {
            System.out.println("Here are the notes you have stored:");
            for (int i = 0; i < notes.size(); i++) {
                System.out.println((i + 1) + ". " + notes.get(i).toString());
            }
            System.out.println("Now you have " + notes.size() + " notes in the list.");
        }
    }

    //@@author WilsonLee2000
    public static void printSpecificNote(int index, ArrayList<Note> notes) {
        if (index >= 0 && index < notes.size()) {
            Note note = notes.get(index);
            System.out.println("Here is the note you are looking for: ");
            System.out.println((index + 1) + ": " + note.toString());
        } else {
            System.out.println("Invalid note index");
        }
    }

    //@@author ZiqiuZeng
    public static void printFindNotes(ArrayList<Note> notes) {
        if (notes.size() == 0) {
            System.out.println("Sorry, no relevant results were found for this query. Please try other keywords.");
        } else {
            System.out.println("Here are the notes you are searching for:");
            for (int i = 0; i < notes.size(); i++) {
                System.out.println((i + 1) + ". " + notes.get(i).toString());
            }
        }
    }

    //@@author ZiqiuZeng
    public static void printPriority(int index, ArrayList<Note> notes) {
        NotePriority.Priority priority = notes.get(index).getPriority();
        String priorityStr = priority.name();
        System.out.println("You have changed its priority to " + priorityStr);
        System.out.println((index + 1) + ": " + notes.get(index).toString());
    }

    //@@author ZiqiuZeng
    public static void printNotesByReviewCount(ArrayList<Note> notes) {
        // Sort notes by review count in descending order
        notes.sort((note1, note2) -> Integer.compare(note2.getReviewCount(), note1.getReviewCount()));

        // Print out notes by review count
        System.out.println("Notes sorted by review count:");
        for (Note note : notes) {
            System.out.println(note.getText() + " (review count: " + note.getReviewCount() + ")");
        }
    }

    //@@author ZiqiuZeng
    public static void printNotesByPriority(ArrayList<Note> notes) {
        ArrayList<Note> highPriorityNotes = new ArrayList<>();
        ArrayList<Note> mediumPriorityNotes = new ArrayList<>();
        ArrayList<Note> lowPriorityNotes = new ArrayList<>();

        for (Note note : notes) {
            if (note.getPriority() == NotePriority.Priority.HIGH) {
                highPriorityNotes.add(note);
            } else if (note.getPriority() == NotePriority.Priority.MEDIUM) {
                mediumPriorityNotes.add(note);
            } else {
                lowPriorityNotes.add(note);
            }
        }

        System.out.println("High priority notes:");
        for (Note note : highPriorityNotes) {
            System.out.println(note.toString());
        }

        System.out.println("Medium priority notes:");
        for (Note note : mediumPriorityNotes) {
            System.out.println(note.toString());
        }

        System.out.println("Low priority notes:");
        for (Note note : lowPriorityNotes) {
            System.out.println(note.toString());
        }
    }

    public static void printQuadraticFormatError() {
        System.out.println("Please use the format as shown below:");
        System.out.println("ax^2 + bx + c");;
    }

    public static void printQuadraticAnswer(ArrayList<Double> xStore, String vertexCoordinate, boolean isMinimum) {
        if (xStore.get(0).isNaN() || xStore.get(1).isNaN()) {
            System.out.println("x is imaginary.");
        } else {
            System.out.println("x1 = " + xStore.get(0) + " , x2 = " + xStore.get(1));
            if (isMinimum) {
                System.out.println("There is a minimum point: " + vertexCoordinate);
            } else {
                System.out.println("There is a maximum point: " + vertexCoordinate);
            }
        }
    }

    public static void printLineBreak() {
        System.out.println("----------------------------------------------------------------------");
    }
}
