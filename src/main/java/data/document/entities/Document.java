package data.document.entities;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class Document {

    @Id
    private String id;
    private String title;
    private ArrayList<String> sections;

    public Document() {}

    public Document(String title) {
        this.title = title;
        this.sections = new ArrayList<>();
    }
    
    public Document(String title, ArrayList<String> sections) {
        this.title = title;
        this.sections = sections;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getSections(){
        return sections;
    }

    public boolean equals(Object obj) {
        return getTitle().equals(((Document) obj).getTitle());
    }

    @Override
    public String toString() {
        String sectionString = "";
        for (String s: getSections()) {
            sectionString += s + ", ";
        }
        if (sectionString.length() != 0) {
            sectionString = sectionString.substring(0, sectionString.length()-2);
        }

        return String.format(
            "Document[title='%s', sections='%s']",
            title, sectionString);
    }

}