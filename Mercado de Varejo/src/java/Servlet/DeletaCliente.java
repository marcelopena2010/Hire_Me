package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoGenerico;

@WebServlet("/DeletaCliente")
public class DeletaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeletaCliente() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String id = request.getParameter("id");
		int id_novo = Integer.parseInt(id);
		DaoGenerico dao = new DaoGenerico();
		try {
			dao.DeletaClientes(id_novo);
			response.sendRedirect("ListaCliente");
		} catch (SQLException e) {
			pw.print("Erro ao excluir");
		}
	}

}
