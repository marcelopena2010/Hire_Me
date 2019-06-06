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
import Entidade.Produto;

@WebServlet("/InseriProduto")
public class InseriProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InseriProduto() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String nome_produto = request.getParameter("nome_produto");
		String marca = request.getParameter("marca");
		String modelo = request.getParameter("modelo");
		String descricao = request.getParameter("descricao");
                String quantidade = request.getParameter("quantidade");
                
		try {
			Produto produto = new Produto();
			produto.setNome_produto(nome_produto);
			produto.setMarca(marca);
			produto.setModelo(modelo);
			produto.setDescricao(descricao);
			produto.setQuantidade(quantidade);
			DaoGenerico dao = new DaoGenerico();
			dao.InseriProdutos(produto);
			pw.print("Dados Inseridos com Sucesso!!!");
			response.sendRedirect("CadastroProduto.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
