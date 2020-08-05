
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


import tech.dipc.taskms.task.TaskEmployee;
import tech.dipc.taskms.user.UserEmployee;
@RunWith(SpringRunner.class)
@SpringBootTest (classes = TaskmsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

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

                              // Testing for Task
     
     
      @Test
     public void testGetDetails() throws Exception{
     HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/details",
        HttpMethod.GET, entity, String.class);  
        assertNotNull(response.getBody());
    }
  	
        		
      @Test
     public void testPostDetails() throws Exception{
    	
    	 HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<String>(null, headers);
            ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/postdetails",
            HttpMethod.POST, entity, String.class);  
            assertNotNull(response.getBody());
     }
     
     
      @Test
     public void testDeleteDetails() throws Exception{
     
            int eid = 2;
            UserEmployee del1 = restTemplate.getForObject(getRootUrl() + "/employee/" + eid, UserEmployee.class);
            assertNotNull(del1);
            restTemplate.delete(getRootUrl() + "/employee/" + eid);
           del1 = restTemplate.getForObject(getRootUrl() + "/employee/" + eid, UserEmployee.class);
           }

      
      @Test
     public void testPutDetails() throws Exception{
         HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<String>(null, headers);
            ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/putdetails",
            HttpMethod.PUT, entity, String.class);  
            assertNotNull(response.getBody());
     }
     
     
     
     
     
                                   // Testing for User
     
     
     
     
     @Test
     public void testGetEmployee() throws Exception{
     HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/employee",
        HttpMethod.GET, entity, String.class);  
        assertNotNull(response.getBody());
    }
  	
        		
   @Test
     public void testPostEmployee() throws Exception{
    	
    	 HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<String>(null, headers);
            ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/postemployee",
            HttpMethod.POST, entity, String.class);  
            assertNotNull(response.getBody());
     }
     
     
   @Test
     public void testDeleteEmployee() throws Exception{
	   
	   
	   int cid=1;
       TaskEmployee del2 = restTemplate.getForObject(getRootUrl() + "/details/" + cid, TaskEmployee.class);
       assertNotNull(del2);
       restTemplate.delete(getRootUrl() + "/details/" + cid);
       del2 = restTemplate.getForObject(getRootUrl() + "/details/" + cid, TaskEmployee.class);
      }
     
   
     @Test
     public void testPutEmployee() throws Exception{
         HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<String>(null, headers);
            ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/putemployee",
            HttpMethod.PUT, entity, String.class);  
            assertNotNull(response.getBody());
     }
     
}
     
     



    
     