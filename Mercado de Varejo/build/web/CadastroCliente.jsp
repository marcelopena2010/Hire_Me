<!DOCTYPE html>
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
                <h3>Cadastro - Cliente - Mercado de Varejo</h3>
            </div>
        </div>
    </div>
</nav>
<div class="container">
    <div class="starter-template">
        <form id="form" class="" method="" action="">
            <div id="login">
            <div class="centralizado">
                <fieldset><br><br><br><br><br><br><br><br><br><br><br><br>
                    <div class="control-group">
			<label class="control-label" for="nome">NOME:</label>
			<div class="controls">
                            <input id="nome" name="nome" type="text" required="required" placeholder="nome" class="input-xlarge">
			</div>
                    </div><br>
                    <div class="control-group">
			<label class="control-label" for="sobrenome">SOBRENOME:</label>
			<div class="controls">
                            <input id="sobrenome" name="sobrenome" type="text" required="required" placeholder="sobrenome" class="input-xlarge">
			</div>
                    </div><br>
                    <div class="control-group">
                        <label class="control-label" for="endereco">ENDERECO:</label>
			<div class="controls">
			<input id="endereco" name="endereco" type="text" required="required" placeholder="endereco" class="input-xlarge">
			<br><br>
			</div>
                    </div><br>
                    <div class="control-group">
                        <label class="control-label" for="cidade">CIDADE:</label>
			<div class="controls">
			<input id="cidade" name="cidade" type="text" required="required" placeholder="cidade" class="input-xlarge">
			<br><br>
			</div>
                    </div><br>
                    <div class="control-group">
                        <label class="control-label" for="estado">ESTADO:</label>
			<div class="controls">
			<input id="estado" name="estado" type="text" required="required" placeholder="estado" class="input-xlarge">
			<br><br>
			</div>
                    </div><br>
                    <div>
			<div class="controls">
			<label for="sexo">SEXO:</label>
			<select id="sexo" name="sexo" required="required" class="input-xlarge">
			<option value=""></option>	
			<option value="Masculino">MASCULINO</option>
			<option value="Feminino">FEMININO</option>
			</select>
			<br>
			<label for="js" id="js"></label>
			</div>
                    </div>
                    <div class="control-group">
			<label class="control-label" for="telefone">TELEFONE:</label>
			<div class="controls">
                            <input id="telefone" name="telefone" type="text" required="required" placeholder="telefone" class="input-xlarge"  maxlength="10">
			</div>
                    </div><br>
                    
                </fieldset>
            </div>
            <br><br>
            <div class="control-group">
                <div class="centraliza-botao">
                    <div class="controls">
			<button type="submit" id="CadastrarCliente" name="CadastrarCliente" class="btn btn-success" onclick="EscolheAction('CadastrarCliente')">CADASTRAR</button>
                        <button type="submit" id="ListaCliente" name="ListaCliente" class="btn btn-danger" onclick="EscolheAction('ListaCliente')">LISTAR</button>
                    </div>
                </div>
            </div>
            </div>
	</form>
    </div>
</div>
</body>
</html>