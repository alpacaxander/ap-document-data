package data.document.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import data.document.data.DocumentRepository;
import data.document.entities.Document;

@RestController
public class DocumentController {

    @Autowired
    DocumentRepository documentRepository;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/getall")
    @ResponseBody
    List<Document> getAll() {
        return documentRepository.findAll();
    }
    
    @GetMapping("/")
    public String sample() {
        return "Sample Text";
    }
}