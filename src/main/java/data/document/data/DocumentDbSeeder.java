package data.document.data;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import data.document.entities.Document;
import data.document.entities.Paragraph;
import data.document.entities.Document.Section;

@Component
public class DocumentDbSeeder implements CommandLineRunner {

    @Autowired
    DocumentRepository documentDbRepository;

    public DocumentDbSeeder() {}

    public void run(String... args) {
        prepDatabase();
    }
  
    public void prepDatabase() {
        Section[] sections = new Section[] {new Paragraph("paragraph 1")};
        documentDbRepository.save( new Document("title 9876543221", Arrays.asList(sections)));
    }

}
