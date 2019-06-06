
function EscolheAction(tipo){
	var form = document.getElementById('form');
	var nome = document.getElementById('nome');
	var sobrenome = document.getElementById('sobrenome');
	var endereco = document.getElementById('endereco');
	var cidade = document.getElementById('cidade');
	var estado = document.getElementById('estado');
	var sexo = document.getElementById('sexo');
	var telefone = document.getElementById('telefone');
	
	if (tipo == 'CadastrarCliente'){
		form.action = 'InseriCliente';
	}
	else{
            nome.required = "";
            sobrenome.required = "";
            endereco.required = "";
            cidade.required = "";
            estado.required = "";
            sexo.required = "";
            telefone.required = "";
            form.action = 'ListaCliente';
	}
	
}

function EscolheAction3(tipo){
	var form = document.getElementById('form');
	var nome = document.getElementById('nome_produto');
	var sobrenome = document.getElementById('marca');
	var endereco = document.getElementById('modelo');
	var cidade = document.getElementById('descricao');
	var estado = document.getElementById('quantidade');
	
	if (tipo == 'CadastrarProduto'){
		form.action = 'InseriProduto';
	}
	else{
            nome_produto.required = "";
            marca.required = "";
            modelo.required = "";
            descricao.required = "";
            quantidade.required = "";
            form.action = 'ListaProduto';
	}
}


function EscolheAction2(tipo){
	var form = document.getElementById('form2');
	if (tipo == 'DeletaCliente'){
		form.action = 'DeletaCliente';
	}
	else{
		form.action = 'CadastroCliente.jsp';
	}
}

function EscolheAction4(tipo){
	var form = document.getElementById('form2');
	if (tipo == 'DeletaProduto'){
		form.action = 'DeletaProduto';
	}
	else{
		form.action = 'CadastroProduto.jsp';
	}
}
