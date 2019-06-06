package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connection.ConnectionFactory;
import Entidade.Cliente;
import Entidade.Produto;

public class DaoGenerico {
	private Connection connection =  null;
	
	public void InseriClientes(Cliente cliente) throws SQLException{
		PreparedStatement prst = null;
		String sql = null;
		this.connection = ConnectionFactory.getConnection();
		sql = "insert into cliente(nome, sobrenome, endereco, cidade, estado, sexo, telefone) values(?, ?, ?, ?, ?, ?, ?)";
		try {
			prst = this.connection.prepareStatement(sql);
			prst.setString(1, cliente.getNome());
			prst.setString(2, cliente.getSobrenome());
			prst.setString(3, cliente.getEndereco());
			prst.setString(4, cliente.getCidade());
			prst.setString(5, cliente.getEstado());
			prst.setString(6, cliente.getSexo());
			prst.setString(7, cliente.getTelefone());
			prst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		prst.close();
		this.connection.close();
	}
	
        public void AlteraClientes(Cliente cliente) throws SQLException{
		PreparedStatement prst = null;
		String sql = null;
		this.connection = ConnectionFactory.getConnection();
		sql = "update into cliente(nome, sobrenome, endereco, cidade, estado, sexo, telefone) values(?, ?, ?, ?, ?, ?, ?)";
		try {
			prst = this.connection.prepareStatement(sql);
			prst.setString(1, cliente.getNome());
			prst.setString(2, cliente.getSobrenome());
			prst.setString(3, cliente.getEndereco());
			prst.setString(4, cliente.getCidade());
			prst.setString(5, cliente.getEstado());
			prst.setString(6, cliente.getSexo());
			prst.setString(7, cliente.getTelefone());
			prst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		prst.close();
		this.connection.close();
	}
	
	public ArrayList<Cliente> ListaClientes(){
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		PreparedStatement prst = null;
		String sql;
		ResultSet rs = null;
		this.connection = ConnectionFactory.getConnection();
		sql = "select * from cliente;";
		try {
			prst = this.connection.prepareStatement(sql);
			rs = prst.executeQuery();
			while(rs.next()){
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setSobrenome(rs.getString("sobrenome"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setCidade(rs.getString("cidade"));
				cliente.setEstado(rs.getString("estado"));
				cliente.setSexo(rs.getString("sexo"));
				cliente.setTelefone(rs.getString("telefone"));
				clientes.add(cliente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return clientes;
	}
	
	public void DeletaClientes(int id) throws SQLException{
		PreparedStatement prst = null;
		String sql;
		this.connection = ConnectionFactory.getConnection();
		sql = "delete from cliente where id=?";
		try {
			prst = this.connection.prepareStatement(sql);
			prst.setInt(1, id);
			prst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prst.close();
		this.connection.close();
	}
	
        public void InseriProdutos(Produto produto) throws SQLException{
		PreparedStatement prst = null;
		String sql = null;
		this.connection = ConnectionFactory.getConnection();
		sql = "insert into produto(nome_produto, marca, modelo, descricao, quanhtidade) values(?, ?, ?, ?, ?)";
		try {
			prst = this.connection.prepareStatement(sql);
			prst.setString(1, produto.getNome_produto());
			prst.setString(2, produto.getMarca());
			prst.setString(3, produto.getModelo());
			prst.setString(4, produto.getDescricao());
			prst.setString(5, produto.getQuantidade());
			prst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		prst.close();
		this.connection.close();
	}
	
        public void AlteraProdutos(Produto produto) throws SQLException{
		PreparedStatement prst = null;
		String sql = null;
		this.connection = ConnectionFactory.getConnection();
		sql = "update into produto(nome_produto, marca, modelo, descricao, quanhtidade) values(?, ?, ?, ?, ?)";
		try {
			prst = this.connection.prepareStatement(sql);
			prst.setString(1, produto.getNome_produto());
			prst.setString(2, produto.getMarca());
			prst.setString(3, produto.getModelo());
			prst.setString(4, produto.getDescricao());
			prst.setString(5, produto.getQuantidade());
			prst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		prst.close();
		this.connection.close();
	}
	
	public ArrayList<Produto> ListaProdutos(){
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		PreparedStatement prst = null;
		String sql;
		ResultSet rs = null;
		this.connection = ConnectionFactory.getConnection();
		sql = "select * from produto;";
		try {
			prst = this.connection.prepareStatement(sql);
			rs = prst.executeQuery();
			while(rs.next()){
				Produto produto = new Produto();
				produto.setCod_produto(rs.getInt("cod_produto"));
				produto.setNome_produto(rs.getString("nome_produto"));
				produto.setMarca(rs.getString("marca"));
				produto.setModelo(rs.getString("modelo"));
				produto.setDescricao(rs.getString("descricao"));
				produto.setQuantidade(rs.getString("quantidade"));
				produtos.add(produto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produtos;
	}
	
	public void DeletaProdutos(int cod_produto) throws SQLException{
		PreparedStatement prst = null;
		String sql;
		this.connection = ConnectionFactory.getConnection();
		sql = "delete from produto where cod_produto=?";
		try {
			prst = this.connection.prepareStatement(sql);
			prst.setInt(1, cod_produto);
			prst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prst.close();
		this.connection.close();
	}
}

