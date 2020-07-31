


	import java.util.logging.Logger;
	import org.springframework.beans.factory.annotation.Value;
	import org.hibernate.annotations.common.util.impl.LoggerFactory;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.stereotype.Component;

	@Component 
public class CommandLineRunnerDemo implements CommandLineRunner{
	
	
	

		
	    private static final org.jboss.logging.Logger logger = LoggerFactory.logger(CommandLineRunnerDemo.class); 
	 
	    @Override 
	    public void run(String...args) throws Exception { 
	        logger.info("Hello Command Line Runner !!!"); 
	    } 
	} 

}
