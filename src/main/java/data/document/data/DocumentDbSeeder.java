package data.document.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import data.document.entities.Document;

@Component
public class DocumentDbSeeder implements CommandLineRunner {

    @Autowired
    DocumentRepository documentDbRepository;

    public DocumentDbSeeder() {}

    public void run(String... args) {
        prepDatabase();
    }
  
    public void prepDatabase() {
        documentDbRepository.save( new Document("title 9876543221"));
    }

}
