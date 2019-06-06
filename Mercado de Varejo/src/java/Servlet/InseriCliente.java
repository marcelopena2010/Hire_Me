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
import Entidade.Cliente;

@WebServlet("/InseriCliente")
public class InseriCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InseriCliente() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String endereco = request.getParameter("endereco");
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");
		String sexo = request.getParameter("sexo");
		String telefone = request.getParameter("telefone");
                
		try {
			Cliente cliente = new Cliente();
			cliente.setNome(nome);
			cliente.setSobrenome(sobrenome);
			cliente.setEndereco(endereco);
			cliente.setCidade(cidade);
			cliente.setEstado(estado);
			cliente.setSexo(sexo);
			cliente.setTelefone(telefone);
			DaoGenerico dao = new DaoGenerico();
			dao.InseriClientes(cliente);
			pw.print("Dados Inseridos com Sucesso!!!");
			response.sendRedirect("CadastroCliente.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
