package data.document.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import data.document.entities.Document;

public interface DocumentRepository extends MongoRepository<Document, String> {
    public Optional<Document> findById(String id);
    public Optional<Document> findOneById(String id);
    public List<Document> findAll();
}
    