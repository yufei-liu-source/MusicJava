package fr.dauphine.miageif.Agile.AlbumTest;

import fr.dauphine.miageif.Agile.Album;
import fr.dauphine.miageif.Agile.Music;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlbumStepDefinitions {
    private Album album;
    private Music music;

    @Given("I have an empty album")
    public void i_have_an_empty_album() {
        album = new Album();
    }

    @When("I add a music track with title {string} and edition {int}")
    public void i_add_a_music_track_with_title_and_edition(String title, int edition) {
        music = new Music(title, edition);
        album.addMusicTrack(music);
    }

    @Then("the album should contain {int} music tracks")
    public void the_album_should_contain_music_tracks(int numberOfTracks) {
        assertEquals(numberOfTracks, album.getMusicTracks().size());
    }

    @Then("the album should have a music track with title {string} and edition {int}")
    public void the_album_should_have_a_music_track_with_title_and_edition(String title, int edition) {
        assertTrue(album.getMusicTracks().stream().anyMatch(m -> m.getNom().equals(title) && m.getEdition() == edition));
    }
}

