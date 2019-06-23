package data.document.entities;

import data.document.entities.Document.Section;

public class Paragraph extends Section {

    private String text;

    public Paragraph() {
        this.type = "paragraph";
    }

    public Paragraph(String text) {
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