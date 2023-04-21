package fr.dauphine.miageif.Agile.UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import fr.dauphine.miageif.Agile.Award;
import fr.dauphine.miageif.Agile.Music;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TestYearAfterAwards.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AwardTest {
    Music baby = new Music();
    Award worstSongAwards = new Award();
    /**
     * Default constructor for test class TestYearAfterAwards
     */
    public AwardTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        baby.setWorstSongAwards(worstSongAwards);
        worstSongAwards.setMusic(baby);
        worstSongAwards.setYear(2013);
        baby.setEdition(2010);

    }

    @Test
    public void testHowManyYearsAfterAward(){
        int result = worstSongAwards.howManyYearsAfterAward();
        assertEquals(10, result);

    }

    @Test
    public void testMusicAwardAssociation() {
        Music music = new Music("Test Song", 2010);
        Award award = new Award();

        music.setWorstSongAwards(award);
        award.setMusic(music);

        assertEquals(music, award.getMusic(), "The Award object should have the correct Music object associated.");
        assertEquals(award, music.getWorstSongAwards(), "The Music object should have the correct Award object associated.");
    }


    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}

