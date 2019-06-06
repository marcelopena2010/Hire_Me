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
                <h3>Cadastro - Produto - Mercado de Varejo</h3>
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
			<label class="control-label" for="nome_produto">NOME PRODUTO:</label>
			<div class="controls">
                            <input id="nome_produto" name="nome_produto" type="text" required="required" placeholder="nome_produto" class="input-xlarge">
			</div>
                    </div><br>
                    <div class="control-group">
			<label class="control-label" for="marca">MARCA:</label>
			<div class="controls">
                            <input id="marca" name="marca" type="text" required="required" placeholder="marca" class="input-xlarge">
			</div>
                    </div><br>
                    <div class="control-group">
                        <label class="control-label" for="modelo">MODELO:</label>
			<div class="controls">
			<input id="modelo" name="modelo" type="text" required="required" placeholder="modelo" class="input-xlarge">
			<br><br>
			</div>
                    </div><br>
                    <div class="control-group">
                        <label class="control-label" for="descricao">DESCRICAO:</label>
			<div class="controls">
			<input id="descricao" name="descricao" type="text" required="required" placeholder="descricao" class="input-xlarge">
			<br><br>
			</div>
                    </div><br>                    
                    <div class="control-group">
                        <label class="control-label" for="quantidade">QUANTIDADE:</label>
			<div class="controls">
			<input id="quantidade" name="quantidade" type="text" required="required" placeholder="quantidade" class="input-xlarge">
			<br><br>
			</div>
                    </div><br>                    
                </fieldset>
            </div>
            <br><br>
            <div class="control-group">
                <div class="centraliza-botao">
                    <div class="controls">
			<button type="submit" id="CadastrarProduto" name="CadastrarProduto" class="btn btn-success" onclick="EscolheAction3('CadastrarProduto')">CADASTRAR</button>
                        <button type="submit" id="ListaProduto" name="ListaProduto" class="btn btn-danger" onclick="EscolheAction3('ListaProduto')">LISTAR</button>
                    </div>
                </div>
            </div>
            </div>
	</form>
    </div>
</div>
</body>
</html>