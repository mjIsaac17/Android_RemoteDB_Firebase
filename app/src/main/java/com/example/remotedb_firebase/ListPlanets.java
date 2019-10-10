package com.example.remotedb_firebase;

public class ListPlanets {
    private String head;
    private String description;
    private String image;

    public ListPlanets(String head, String description, String image) {
        this.head = head;
        this.description = description;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public String getHead() {
        return head;
    }

    public String getDescription() {
        return description;
    }
}
