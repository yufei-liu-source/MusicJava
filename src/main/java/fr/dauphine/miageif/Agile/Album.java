package fr.dauphine.miageif.Agile;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private List<Music> musicTracks;

    public Album() {
        musicTracks = new ArrayList<>();
    }

    public void addMusicTrack(Music music) {
        musicTracks.add(music);
    }

    public List<Music> getMusicTracks() {
        return musicTracks;
    }

    public Music searchMusicTrackByTitle(String title) {
        return musicTracks.stream()
                .filter(m -> m.getNom().equals(title))
                .findFirst()
                .orElse(null);
    }

    public Music playMusicTrackByTitle(String title) {
        Music musicToPlay = searchMusicTrackByTitle(title);
        // Implement logic for playing the music track, if needed.
        return musicToPlay;
    }
}

