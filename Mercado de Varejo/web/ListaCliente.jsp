<%@page import="java.util.List"%>
<%@page import="Dao.DaoGenerico"%>
<%@page import="Entidade.Cliente"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="bootstrap/css/style.css">
    <script type="text/javascript" src="bootstrap/js/javascript.js"></script>
    <link rel="stylesheet" href="cssmenu\styles.css">
    <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
    <script src="script.js"></script>
    <title>Mercado de Varejo</title>
    <style type="text/css">
    body{
        background: url(imagem/varejo.jpeg) no-repeat 0 0;
        background-size: 100%;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div  id='cssmenu'>
    <ul>
        <li><a href='index.jsp'>Principal</a></li>
        <li><a href='CadastroCliente.jsp'>Cliente</a></li>
        <li><a href='CadastroProduto.jsp'>Produto</a></li>
        </ul>
    </div>
    <div class="centraliza-texto">
        <div>
            <div>
                <h3>Lista - Cliente - Mercado de Varejo</h3>
            </div>
        </div>
    </div>
</nav>
<div class="container">
    <div class="starter-template">
	<form id="form2" class="" method="" action="">
            <div id="login">
            <div>
                <fieldset><br><br><br><br><br><br><br><br><br><br><br><br>
                    <table class="table table-bordered" style="margin-right: 50em">
			<thead>
                            <tr>
				<th>NUMERO</th>
				<th>NOME</th>
				<th>SOBRENOME</th>
				<th>ENDERECO</th>
				<th>CIDADE</th>
				<th>ESTADO</th>
				<th>SEXO</th>
				<th>TELEFONE</th>
                            </tr>
			</thead>
			<tbody>
                        <%  ArrayList<Cliente> clientes = new ArrayList<Cliente>();
                            clientes = (ArrayList<Cliente>)request.getAttribute("ListaCliente");
                            for (Cliente cliente : clientes)
                            {
			%>
					  <tr>
						<td><%=cliente.getId()%></td>
						<td><%=cliente.getNome()%></td>
						<td><%=cliente.getSobrenome()%></td>
						<td><%=cliente.getEndereco()%></td>
						<td><%=cliente.getCidade()%></td>
						<td><%=cliente.getEstado()%></td>
						<td><%=cliente.getSexo()%></td>
						<td><%=cliente.getTelefone()%></td>
					  </tr>
					<%}%>  
					</tbody>
                    </table>
					<br>
					<div class="centralizado2">
					  <div class="controls">
						<label for="id">Excluir pelo número: </label>
						<select id="id" name="id" class="input-xlarge">
						  <%
						  for (Cliente cliente : clientes)
						  {
						  %>
						  <option value="<%=cliente.getId()%>"><%=cliente.getId()%></option>
						  <%}%> 
						</select>
					  </div>
					</div>
					<br><br>
					<div class="control-group">
					  <div class="centraliza-botao">
					  <div class="controls">
						<button type="submit" id="deletar" name="deletar" class="btn btn-success" onclick="EscolheAction2('DeletaCliente')">Deletar</button>
						<button type="submit" id="voltar" name="voltar" class="btn btn-danger" onclick="EscolheAction2('Voltar')">Voltar</button>
					  </div>
					  </div>
					</div>
		</fieldset>
            </div>
            </div>
        </form>
    </div>    
</div>
</body>
</html>