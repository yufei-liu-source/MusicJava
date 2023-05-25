package fr.dauphine.miageif.Agile;


/**
 * Write a description of class Music here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Music implements Observer
{
    // 2 attributs
    private String nom;
    private int edition;

    //reference of class Awards
    private Award worstSongAwards;

    private String albumName;


    /**
     * Constructor for objects of class Music
     */
    public Music()
    {

    }

    public Music(String nom, int edition)
    {
        this.nom = nom;
        this.edition = edition;

    }

    public int howOldAreYou()
    {
        // put your code here
        return 2023 - edition;
    }

    public void validateEdition(int edition) {
        if (edition < 0 || edition > 2023) {
            throw new IllegalArgumentException("Invalid edition year.");
        }
    }

    public String toSting(){
        return "The music " + nom + " came out in " + edition;
    }

    public int getEdition(){
        return this.edition;
    }

    public void setEdition(int e){
        this.edition = e;
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public Award getWorstSongAwards(){
        return this.worstSongAwards;
    }

    public void setWorstSongAwards(Award worstSongAwards){
        this.worstSongAwards = worstSongAwards;
    }

    @Override
    public void update(String albumName) {
        this.albumName = albumName;
        System.out.println("Music: " + nom + " from " + edition + " now belongs to Album: " + albumName);
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}

