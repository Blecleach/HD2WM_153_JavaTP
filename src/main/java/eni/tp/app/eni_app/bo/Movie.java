package eni.tp.app.eni_app.bo;


public class Movie {
    public int id;
    public String title;
    public int note=4;
    // temporaire à remplacer par avis
    public int year;
    public int duration;
    public String synopsis;


    public Movie(int id, String title, int year, int duration, String synopsis) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.synopsis = synopsis;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

//    public void setYear(int year) {
//        this.year = year;
//    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

//    public String getSynopsis() {
//        return synopsis;
//    }
//
//    public void setSynopsis(String synopsis) {
//        this.synopsis = synopsis;
//    }

    public int getNote() {
        // à supprimer
        return note;
    }
}
