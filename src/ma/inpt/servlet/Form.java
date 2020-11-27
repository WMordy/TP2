package ma.inpt.servlet;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.HttpRequestHandler;

import ma.inpt.aseds.JPA_DAO;
import ma.inpt.aseds.Message;
import ma.inpt.aseds.Person;

public class Form implements HttpRequestHandler
{
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException
    {
        request.getRequestDispatcher("/Formulaire/Formulaire.jsp").forward(request, response);

    }
    
    
    
    
    
    
    
	
}