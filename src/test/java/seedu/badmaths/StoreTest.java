package seedu.badmaths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class StoreTest {

    @Test
    void checkIsInvalidToDo() {
        String todo = "82738232";
        ArrayList<Note> notesArray = new ArrayList<>();
        NotesList notes = new NotesList(notesArray);
        Store storeTest = new Store(notes, todo);
        boolean test = storeTest.isInvalidTodo(todo);
        assertEquals(false, test);
    }
    @Test
    void storeValidInputCommand() {
        ArrayList<Note> notesArray = new ArrayList<>();
        String toDo = "index";
        NotesList notes = new NotesList(notesArray);
        Store storeTest = new Store(notes, toDo);
        storeTest.storeNotes();
        assertEquals(1, notes.getSize()); // (expected, actual)
    }
}
