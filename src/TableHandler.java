

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableHandler
 */
//@WebServlet("/TableHandler")
public class TableHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TableHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("forms", Form.forms);
        request.getRequestDispatcher("/Table/Table.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String filterName = request.getParameter("filter");
		ArrayList <Form> FilteredForms = new ArrayList<Form>();
		for(int i = 0 ; i < Form.forms.size() ; i++) {
			if((Form.forms.get(i).getName()).contains(filterName)) {
				FilteredForms.add(Form.forms.get(i));
				
			}
		}
		request.setAttribute("forms", FilteredForms);
        request.getRequestDispatcher("/Table/Table.jsp").forward(request, response);
	}

}
