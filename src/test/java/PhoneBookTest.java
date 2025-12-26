import org.example.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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

    @Test
    void shouldReturnAllNamesInAlphabeticalOrder(){

        phoneBook.add("Serge","+611234567");
        phoneBook.add("Alex","+911234567");
        phoneBook.add("Mikle","+511234567");
        phoneBook.add("Pavel","+311234567");

        List<String> names = phoneBook.getAllNamesInOrder();

        List<String> expected = Arrays.asList("Alex","Mikle","Pavel","Serge");

        assertEquals(expected,names,"Names should be returned in alphabetical order");

    }

}
