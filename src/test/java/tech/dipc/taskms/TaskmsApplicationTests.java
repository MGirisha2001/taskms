
package tech.dipc.taskms;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)

@SpringBootTest(classes = TaskmsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class TaskmsApplicationTests {
	

	     @Autowired
     private TestRestTemplate restTemplate;

     @LocalServerPort
     private int port;

     private String getRootUrl() {
         return "http://localhost:" + port;
     }

     @Test
     public void contextLoads() {

     }

    @Test
     public void testGetAllEmployees() throws Exception{
     HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/details",
        HttpMethod.GET, entity, String.class);  
        assertNotNull(response.getBody());
    }
  	
        		
    @Test
     public void testPostAllEmployees() throws Exception{
         HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<String>(null, headers);
            ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/postdetails",
            HttpMethod.POST, entity, String.class);  
            assertNotNull(response.getBody());
     }
     
     
     @Test
     public void testDeleteAllEmployees() throws Exception{
         HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<String>(null, headers);
            ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/details/{eid}",
            HttpMethod.DELETE, entity, String.class);  
            assertNotNull(response.getBody());
        }
     
     @Test
     public void testPutAllEmployees() throws Exception{
         HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<String>(null, headers);
            ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/putdetails",
            HttpMethod.PUT, entity, String.class);  
            assertNotNull(response.getBody());
     }
     
}
     
     



     