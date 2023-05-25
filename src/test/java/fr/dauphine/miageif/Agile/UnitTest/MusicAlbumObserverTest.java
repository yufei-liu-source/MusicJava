package fr.dauphine.miageif.Agile.UnitTest;
import fr.dauphine.miageif.Agile.Album;
import fr.dauphine.miageif.Agile.Music;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusicAlbumObserverTest {
    private Album album;
    private Music music1;
    private Music music2;

    @BeforeEach
    public void setup() {
        album = new Album("WorstOfFrance");
        music1 = new Music("la boheme", 2023);
        music2 = new Music("See you again", 2024);
        album.addMusicTrack(music1);
        album.addMusicTrack(music2);
    }

    @Test
    public void testMusicGetsUpdatedWhenAlbumNameChanges() {
        album.setName("BestOfFrance");
        assertEquals("BestOfFrance", music1.getAlbumName());
        assertEquals("BestOfFrance", music2.getAlbumName());
    }

}
