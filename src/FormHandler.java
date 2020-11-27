

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.inpt.aseds.JPA_DAO;
import ma.inpt.aseds.Message;
import ma.inpt.aseds.Person;
import ma.inpt.aseds.SpringJPA;


//@WebServlet("/FormHandler")
public class FormHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
  
    public FormHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// I changed here 
        request.getRequestDispatcher("/Formulaire/Formulaire.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String message = request.getParameter("message");
        Form form = new Form(name,email,phone,message);
        Person prs = new Person(name,phone,email);
       
       
        
        
        doGet(request, response);
		
	}

}
