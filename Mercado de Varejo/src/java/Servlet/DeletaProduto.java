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

@WebServlet("/DeletaProduto")
public class DeletaProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeletaProduto() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String cod_produto = request.getParameter("cod_produto");
		int cod_produto_novo = Integer.parseInt(cod_produto);
		DaoGenerico dao = new DaoGenerico();
		try {
			dao.DeletaProdutos(cod_produto_novo);
			response.sendRedirect("ListaProduto");
		} catch (SQLException e) {
			pw.print("Erro ao excluir");
		}
	}

}
