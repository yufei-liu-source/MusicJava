package fr.dauphine.miageif.Agile;


/**
 * Write a description of class GrammyAwards here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Award
{
    // 2 attributs of class
    private int year;
    private String name;

    // reference of class Music
    private Music music;

    /**
     * Constructor for objects of class GrammyAwards
     */
    public Award()
    {

    }

    public int howManyYearsAfterAward(){
        return music.howOldAreYou() - (this.year - music.getEdition());
    }

    public Music getMusic(){
        return this.music;
    }

    public void setMusic(Music music){
        this.music= music;
    }

    public void setYear(int year){
        this.year = year;
    }

}

