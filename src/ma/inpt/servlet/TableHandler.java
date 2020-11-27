package ma.inpt.servlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.HttpRequestHandler;

import ma.inpt.aseds.JPA_DAO;
import ma.inpt.aseds.Message;
import ma.inpt.aseds.Person;

public class TableHandler implements HttpRequestHandler
{
    @SuppressWarnings("null")
	@Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException
    {
    	/*
    	 * String filterName = request.getParameter("filter");
		ArrayList <Form> FilteredForms = new ArrayList<Form>();
		for(int i = 0 ; i < Form.forms.size() ; i++) {
			if((Form.forms.get(i).getName()).contains(filterName)) {
				FilteredForms.add(Form.forms.get(i));
				
			}
		}
		request.setAttribute("forms", FilteredForms);
    	 */
    	String filterName = request.getParameter("filter");
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		JPA_DAO JpaDao = ctx.getBean(JPA_DAO.class);
		List<Person> forms = JpaDao.findAll(); 
		ArrayList <FormDetails> FilteredForms = new ArrayList<FormDetails>();
		for(int i = 0 ; i < forms.size() ; i++) {
			Set<Message> Msgs = new HashSet<Message>();
			Msgs = forms.get(i).getMsgs();
			if((filterName != null )) {
				if((forms.get(i)).getName().contains(filterName)  ) {
					 for (Message item: Msgs) {	
							FilteredForms.add(new FormDetails((forms.get(i)).getName(),forms.get(i).getEmail(),forms.get(i).getPhone(),item.getMessage()));					           
				        }
				}
			}
			
			else if(filterName == null  || filterName.length() > 0) {
				 for (Message item: Msgs) {	
						FilteredForms.add(new FormDetails((forms.get(i)).getName(),forms.get(i).getEmail(),forms.get(i).getPhone(),item.getMessage()));					           
			        }
			}
	       
			
			
		}
    	
		request.setAttribute("forms", FilteredForms);
        request.getRequestDispatcher("/Table/Table.jsp").forward(request, response);
    }
}
    
    
   