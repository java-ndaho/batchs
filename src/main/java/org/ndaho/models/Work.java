package org.ndaho.models;

public class Work {
    private String title;
    private String genre;
    private String annee ;
    private String summary ;
    private Artist mainArtist ;
    private Long id ;
    private static int lastId;


    public Work() {
        this.id= Long.valueOf(lastId++);
    }

    public Work(String title) {
        this();
        this.title = title;
    }

    public static int getLastId() {
        return lastId;
    }

    public static void setLastId(int lastId) {
        Work.lastId = lastId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Artist getMainArtist() {
        return mainArtist;
    }

    public void setMainArtist(Artist mainArtist) {
        this.mainArtist = mainArtist;
    }

    private String description ;

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getTitle() {
        return title;
    }
}
