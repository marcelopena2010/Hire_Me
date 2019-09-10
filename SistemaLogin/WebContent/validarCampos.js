function validarLogin() {
	if (document.formLogin.txtUsuario.value == "") {
		alert("Usuario não informado!");
		return false;
	}

	if (document.formLogin.txtSenha.value == "") {
		alert("Senha não informada!");
		return false;
	}

	document.formLogin.submit();
}