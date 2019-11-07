package com.penguin.springbootapp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.validator.routines.UrlValidator;

import java.util.Objects;
import java.util.stream.Stream;

public class Book {

    @JsonFormat(shape=JsonFormat.Shape.ARRAY)
    private String title;
    private String author;
    private String image;
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getURL() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonIgnore
    public boolean isEmptyValues() {
        return Stream.of(title, author, image, url)
                .anyMatch(Objects::isNull);
    }

    @JsonIgnore
    public boolean isSecureValue() {
        return url.startsWith("https") ? true : false;}

    @JsonIgnore
    public boolean isUrlValid() {
        String[] schemes = {"http", "https"};
        UrlValidator urlValidator = new UrlValidator(schemes);
        if (urlValidator.isValid(url)) {
            return true;
        }
        return false;
    }
}
