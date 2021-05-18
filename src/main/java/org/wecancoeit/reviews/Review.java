package org.wecancoeit.reviews;

public class Review {

    public Long id;
    public String title;
    public String image;
    public String genre;
    public String description;

    public Review(Long id, String title, String image, String genre, String description){
        this.id = id;
        this.title = title;
        this.image = image;
        this.genre = genre;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }
}
