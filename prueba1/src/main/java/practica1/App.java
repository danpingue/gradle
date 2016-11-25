package practica1;

import org.apache.log4j.*; 
/**
 * Prueba 1
 *
 */
public class App 
{
	static Logger log=Logger.getLogger(App.class);
	
	static int getVal(){
		log.info("Returning 1");
		
		return 1;
	}
}
