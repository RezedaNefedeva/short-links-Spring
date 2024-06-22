package com.rezeda.diplomSpring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShortLink {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String link, smallLink;

    public ShortLink(String link, String smallLink) {
        this.link = link;
        this.smallLink = smallLink;
    }

    public ShortLink() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSmallLink() {
        return smallLink;
    }

    public void setSmallLink(String smallLink) {
        this.smallLink = smallLink;
    }
}
