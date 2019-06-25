package data.document;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Optional;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import data.document.api.DocumentController;
import data.document.entities.Document;
import data.document.entities.Paragraph;
import data.document.entities.Snippet;
import data.document.entities.SubTitle;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Api {

    @Autowired
    DocumentController documentController;

    Document[] startingDocuments = new Document[] {
        new Document("title 1"),
        new Document("title 2", Arrays.asList(new Document.Section[] {
            new Paragraph("paragraph 1")
        })),
        new Document("title 3", Arrays.asList(new Document.Section[] {
            new SubTitle("subtitle 1"),
            new Paragraph("paragraph 2"),
            new Snippet("snippet 1"),
            new Paragraph("paragraph 3")
        }))
    };

	@BeforeClass
	public void create() {
        for (Document document: startingDocuments) {
            documentController.create(document);
        }
    } // TODO test fails ie documents with the same title should throw
    
    @Test
    public void read() {
        assertTrue(startingDocuments.length == documentController.getAll().size());
        Optional<Document> secondDocument = documentController.getByTitle("title 2");
        assertTrue(secondDocument.isPresent());
        assertTrue(((Paragraph)secondDocument.get().getSections().get(0)).getText().equals("paragraph 1"));
    }
    
    @Test
    public void update() {
        assertTrue(documentController.getByTitle("title 3").get().getSections().size() == 4);
        documentController.update("title 3", new Document("new title", Arrays.asList(new Document.Section[] {
            new SubTitle("new subtitle"),
            new Paragraph("new paragraph"),
            new Snippet("new snippet")
        })));
        assertTrue(documentController.getByTitle("new title").get().getSections().size() == 3);
    }
    
    @Test
    public void delete() {
        assertTrue(documentController.getByTitle("title 1").isPresent());
        documentController.delete("title 1");
        assertFalse(documentController.getByTitle("title 1").isPresent());
    }

}
