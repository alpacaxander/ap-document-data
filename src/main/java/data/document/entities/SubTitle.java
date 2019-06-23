package data.document.entities;

import data.document.entities.Document.Section;

public class SubTitle extends Section {

    private String text;

    public SubTitle() {
        this.type = "subtitle";
    }

    public SubTitle(String text) {
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