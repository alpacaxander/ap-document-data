package data.document.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Document {

    @Id
    private String id;
    private String title;
    private List<Section> sections;

    public Document() {}

    public Document(String title) {
        this.title = title;
        this.sections = new ArrayList<>();
    }
    
    public Document(String title, List<Section> sections) {
        this.title = title;
        this.sections = sections;
    }

    public String getTitle() {
        return title;
    }

    public List<Section> getSections(){
        return sections;
    }

    public boolean equals(Object obj) {
        return getTitle().equals(((Document) obj).getTitle());
    }

    @Override
    public String toString() {
        String sectionString = "";
        for (Section s: getSections()) {
            sectionString += s + ", ";
        }
        if (sectionString.length() != 0) {
            sectionString = sectionString.substring(0, sectionString.length()-2);
        }

        return String.format(
            "Document[title='%s', sections='%s']",
            title, sectionString);
    }

    public static abstract class Section {
        @Id
        private String id;
        protected String type;
    }

}