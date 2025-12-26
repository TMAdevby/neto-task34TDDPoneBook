import org.example.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    PhoneBook phoneBook;

    @BeforeEach
    void setUp(){
        phoneBook = new PhoneBook();
    }

    @Test
    void shouldAddNumberSuccessfully() {

        boolean added = phoneBook.add("Alex","+911234567");

        assertTrue(added, "Contact should be added successfully");
        assertEquals("+911234567", phoneBook.get("Alex"));
    }

    @Test
    void shouldDontAddDuplicate() {

        phoneBook.add("Alex","+911234567");

        boolean added = phoneBook.add("Alex","+777777777");

        assertFalse(added, "Contact shouldn't be added successfully");
        assertEquals("+911234567", phoneBook.get("Alex"));
    }
}
