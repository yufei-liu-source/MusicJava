package fr.dauphine.miageif.Agile.MusicStreamingTest;

import fr.dauphine.miageif.Agile.Album;
import fr.dauphine.miageif.Agile.Music;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusicStreamingStepDefinitions {
    private Album musicStreaming;
    private Music searchedMusic;
    private Music playingMusic;

    @Given("the music streaming service has the following music tracks")
    public void the_music_streaming_service_has_the_following_music_tracks(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> musicData = dataTable.asLists(String.class);
        musicStreaming = new Album();

        for (List<String> row : musicData.subList(1, musicData.size())) {
            String title = row.get(0);
            int edition = Integer.parseInt(row.get(1));
            Music music = new Music(title, edition);
            musicStreaming.addMusicTrack(music);
        }
    }

    @When("I search for the music track with title {string}")
    public void i_search_for_the_music_track_with_title(String title) {
        searchedMusic = musicStreaming.searchMusicTrackByTitle(title);
    }

    @Then("I should see the music track with title {string} and edition {int}")
    public void i_should_see_the_music_track_with_title_and_edition(String title, int edition) {
        assertEquals(title, searchedMusic.getNom());
        assertEquals(edition, searchedMusic.getEdition());
    }

    @When("I select the music track with title {string}")
    public void i_select_the_music_track_with_title(String title) {
        playingMusic = musicStreaming.playMusicTrackByTitle(title);
    }

    @Then("the music track {string} should start playing")
    public void the_music_track_should_start_playing(String title) {
        assertEquals(title, playingMusic.getNom());
    }
}

