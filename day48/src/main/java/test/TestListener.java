package test;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class TestListener
 *
 */
@WebListener
public class TestListener implements ServletContextListener { 

    /**
     * Default constructor. 
     */
    public TestListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { // 톰캣 시작에 대해서
         // TODO Auto-generated method stub
    	
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { // 톰캣 종료의 대해서
    	ServletContext sc=sce.getServletContext();
    	// sc.setAttribute("객체명", 객체);
    	
//    	sc.setAttribute("dabang", dabang);
    	DaBang db =new DaBang();
    	db.main();
    	System.out.println("TestListener: contextInitialized(): 톰캣 시작이 감지");
    }
	
}
