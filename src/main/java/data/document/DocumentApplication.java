package data.document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import data.document.data.DocumentDbClient;


@SpringBootApplication
public class DocumentApplication {

    @Autowired
    DocumentDbClient documentDbClient;

    public static void main(String[] args) {
        SpringApplication.run(DocumentApplication.class, args);
    }

}
