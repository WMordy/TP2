package ma.inpt.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.inpt.aseds.JPA_DAO;
import ma.inpt.aseds.Message;
import ma.inpt.aseds.Person;

public class FormHandler implements HttpRequestHandler
{

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException
    {
    	  ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		  JPA_DAO JpaDao = ctx.getBean(JPA_DAO.class);
		  String name = request.getParameter("name");
	      String email = request.getParameter("email");
	      String phone = request.getParameter("phone");
	      String message = request.getParameter("message");
	      Person prs ;
	      try {
	        prs = JpaDao.findByCriteria(name).get(0);
	        System.out.println("find  the person "+ prs.getName());
	        }
	      catch(Exception e) {
	    	  prs =  new Person(name,phone,email);
	    	  System.out.println(e.getMessage());
	      }
	    		 
	
		Message msg = new Message(message,prs);
		prs.getMsgs().add(msg);
		JpaDao.save(prs);
		for(Message i : prs.getMsgs()) {
			System.out.println(i.getMessage());
		}
		System.out.println(JpaDao.findAll());
        request.getRequestDispatcher("/form").forward(request, response);

		
    }
    
    
    
    
    
    
	private static Person createPerson(JPA_DAO jpaDao,int id,  String name, String phone, String email,int id_msg, String msg) {
		Person prs = new Person(name,phone,email);
		prs.toString();
		prs.getMsgs().add(new Message(msg, prs));
		
		return prs;
	}
}