package data.document.entities;

import data.document.entities.Document.Section;

public class Snippet extends Section {

    private String text;

    public Snippet() {
        this.type = "code";
    }

    public Snippet(String text) {
        this();
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }

}