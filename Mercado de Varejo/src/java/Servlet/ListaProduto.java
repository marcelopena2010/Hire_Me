package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoGenerico;
import Entidade.Produto;

@WebServlet("/ListaProduto")
public class ListaProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListaProduto() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		DaoGenerico dao = new DaoGenerico();
		produtos = dao.ListaProdutos();
		request.setAttribute("ListaProduto", produtos);
		request.getRequestDispatcher("ListaProduto.jsp").forward(request, response);
	}

}
