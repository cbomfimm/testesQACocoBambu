#language: pt
#enconding: UTF-8

@ST002_CT000_Login_Usuario
Funcionalidade: Fazer Login

	@ST002_CT001_Erro_Email_Obrigatorio
	Cenario: CT001 - Validar o erro de email obrigatorio ao clicar no campo email e logo apos fora dele
	Dado que o usuario estiver na tela de login do app
	E clicar no campo email na tela de login
	E clicar fora do campo na tela de login
	Entao o sistema do login deve apresentar o erro de email obrigatorio
	
	@ST002_CT002_Erro_Email_Invalido
	Cenario: CT002 - Validar o erro de email invalido ao clicar no campo email e logo apos fora dele
	Dado que o usuario estiver na tela de login do app
	E informar o campo email sem arroba na tela de login
	Entao o sistema do login deve apresentar o erro de email invalido
	
	@ST002_CT003_Erro_Senha_Obrigatoria
	Cenario: CT003 - Validar o erro de senha obrigatoria ao clicar no campo senha e logo apos fora dele
	Dado que o usuario estiver na tela de login do app
	E clicar no campo senha na tela de login
	E clicar fora do campo na tela de login
	Entao o sistema do login deve apresentar o erro de senha obrigatoria
	
	@ST002_CT004_Erro_Senha_Deve_Conter_Seis_Caracteres
	Cenario: CT004 - Validar o erro de senha deve conter ao menos seis caracteres ao clicar no campo senha e logo apos fora dele
	Dado que o usuario estiver na tela de login do app
	E informar o campo senha com menos de seis caracteres na tela de login
	Entao o sistema do login deve apresentar o erro de senha deve conter ao menos seis caracteres
	
	@ST002_CT005_Efetuar_Login
	Cenario: CT005 - Validar que o login seja concluido
	Dado que o usuario estiver na tela de login do app
	E informar um email ja cadastrado na tela de login do app
	E informar uma senha ja cadastrada na tela de login do app
	E clicar no botao entrar
	Entao o usuario deve conseguir fazer login
	
	@ST002_CT006_Validar_Janela_Recuperar_Senha
	Cenario: CT006 - Validar a janela que aparece quando clica no botao de resetar senha
	Dado que o usuario estiver na tela de login do app
	E clicar no botao de resetar senha na tela de login
	Entao a janela de recuperar senha deve aparecer
	
	@ST002_CT007_Validar_Botao_Recuperar_Janela_Recuperar_Senha
	Cenario: CT007 - Validar o botao de recuperar a recuperacao de senha ao pressiona-lo
	Dado que o usuario estiver na tela de recuperar senha
	E inserir um email aleatorio na recuperacao de senha
	E clicar no botao de recuperar na janela de recuperar senha
	Entao a janela contendo a informacao que o email foi enviado caso o email exista deve aparecer
	