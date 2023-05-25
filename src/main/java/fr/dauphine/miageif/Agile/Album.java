package fr.dauphine.miageif.Agile;

import java.util.ArrayList;
import java.util.List;

public class Album implements Subject{
    private List<Music> musicTracks;
    private List<Observer> observers;
    private String name;

    public Album(String name) {
        this.name = name;
        this.musicTracks = new ArrayList<>();
        this.observers = new ArrayList<>();
    }
    public Album() {
        this.musicTracks = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name);
        }
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

    public void addMusicTrack(Music music) {
        musicTracks.add(music);
        music.setAlbumName(this.name);
        registerObserver(music);
    }

    public void removeMusic(Music music) {
        musicTracks.remove(music);
        removeObserver(music);
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

