package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoGenerico;
import Entidade.Cliente;

@WebServlet("/ListaCliente")
public class ListaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListaCliente() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		DaoGenerico dao = new DaoGenerico();
		clientes = dao.ListaClientes();
		request.setAttribute("ListaCliente", clientes);
		request.getRequestDispatcher("ListaCliente.jsp").forward(request, response);
	}

}
