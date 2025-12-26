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

        assertEquals(1, phoneBook.add("Alex","+911234567"));
        assertEquals("+911234567", phoneBook.getNumber("Alex"));

    }

    @Test
    void shouldDontAddDuplicate() {

        assertEquals(1, phoneBook.add("Alex","+911234567"));
        assertEquals(1, phoneBook.add("Alex","+777777777"));
        assertEquals("+911234567", phoneBook.getNumber("Alex"));
    }

    @Test
    void shouldReturnNameByNumber(){

        phoneBook.add("Alex","+911234567");

        assertEquals("Alex", phoneBook.findByNumber("+911234567"));
        assertNull(phoneBook.findByNumber("+777777777"));
    }

    @Test
    void shouldReturnNumberByName(){

        phoneBook.add("Alex","+911234567");

        assertEquals("+911234567",phoneBook.findByName("Alex"));
        assertNull(phoneBook.findByName("Lee"));

    }

}
