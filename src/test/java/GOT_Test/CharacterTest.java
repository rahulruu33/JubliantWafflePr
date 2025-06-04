package GOT_Test;

import com.springboot.GameOfThrones.CharacterGot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {
    @Test
    public void testGetName() {
        CharacterGot character = new CharacterGot("Jon Snow", "Stark");
        assertEquals("Jon Snow", character.getName());
    }

    @Test
    public void testGetHouse() {
        CharacterGot character = new CharacterGot("Jon Snow", "Stark");
        assertEquals("Stark", character.getHouse());
    }

    @Test
    public void testIntroduce() {
        CharacterGot character = new CharacterGot("Jon Snow", "Stark");
        assertEquals("I am Jon Snow of House Stark.", character.introduce());
    }
}
