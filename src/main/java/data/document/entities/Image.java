package data.document.entities;

import data.document.entities.Document.Section;

public class Image extends Section {

    private byte[] data;

    public Image() {
        this.type = "image";
    }

    public Image(byte[] data) {
        this();
        this.data = data;
    }

    public byte[] getdata() {
        return data;
    }

    @Override
    public String toString() {
        return new String(data);
    }

}