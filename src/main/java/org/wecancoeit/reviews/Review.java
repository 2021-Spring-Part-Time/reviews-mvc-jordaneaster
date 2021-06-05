package org.wecancoeit.reviews;

import javax.persistence.Lob;


public class Review {

    public Long id;
    public String title;
    public String imageURL;
    public String message;
    @Lob
    public String description;


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Review(Long id, String title, String imageURL, String message, String description){
        this.id = id;
        this.title = title;
        this.imageURL = imageURL;
        this.message = message;
        this.description = description;

    }
}
