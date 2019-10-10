package com.example.remotedb_firebase;

public class ListPlanets {
    private String head;
    private String description;

    public ListPlanets(String head, String description) {
        this.head = head;
        this.description = description;
    }

    public String getHead() {
        return head;
    }

    public String getDescription() {
        return description;
    }
}
