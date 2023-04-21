package fr.dauphine.miageif.Agile.UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import fr.dauphine.miageif.Agile.Music;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TestMusicAge.
 *
 * @author  Yufei&Qilian
 * @version 20/04/2023
 */
public class MusicTest
{
    Music music = new Music();
    /**
     * Default constructor for test class TestMusic
     */
    public MusicTest() {
    }
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        music = new Music("Love Story", 2021);
    }

    @Test
    public void testAge(){
        Music SymphonyNo5 = new Music();
        SymphonyNo5.setEdition(1804);
        int result = SymphonyNo5.howOldAreYou();
        assertEquals(219, result);
    }

    @Test
    public void testAgeFailed(){
        Music SymphonyNo5 = new Music();
        SymphonyNo5.setEdition(1804);
        int result = SymphonyNo5.howOldAreYou();
        assertEquals(220, result);
    }

    @Test
    public void testHowOldAreYou() {
        int age = music.howOldAreYou();
        assertEquals(2, age, "The age calculation should return the correct number of years.");
    }

    @Test
    public void testDefaultConstructor() {
        Music defaultMusic = new Music();
        assertNotNull(defaultMusic, "The default constructor should create a non-null Music object.");
    }

    @Test
    public void testConstructorWithParameters() {
        Music customMusic = new Music("Custom Song", 2005);
        assertEquals("Custom Song", customMusic.getNom(), "The constructor should set the correct 'nom' attribute.");
        assertEquals(2005, customMusic.getEdition(), "The constructor should set the correct 'edition' attribute.");
    }

    @Test
    public void testGetEdition() {
        int edition = music.getEdition();
        assertEquals(2021, edition, "The getEdition method should return the correct edition year.");
    }

    @Test
    public void testSetEdition() {
        music.setEdition(2022);
        int updatedEdition = music.getEdition();
        assertEquals(2022, updatedEdition, "The setEdition method should update the edition year.");
    }
    @Test
    public void testValidateEditionException() {
        Music music = new Music("Test Song", 2010);
        assertThrows(IllegalArgumentException.class, () -> music.validateEdition(-1), "The validateEdition method should throw an IllegalArgumentException for invalid edition years.");
    }
    /**
     * Tears down the test fixture.
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}

