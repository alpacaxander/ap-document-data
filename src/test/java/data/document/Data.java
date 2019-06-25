package data.document;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import data.document.api.DocumentController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Data {

    @Autowired
    DocumentController documentController;

	@BeforeClass
	public void create() {
        
    }
    
    @Test
    public void read() {
        assertTrue(false);
    }
    
    @Test
    public void update() {
        assertTrue(false);
    }
    
    @Test
    public void delete() {
        assertTrue(false);
    }

}
