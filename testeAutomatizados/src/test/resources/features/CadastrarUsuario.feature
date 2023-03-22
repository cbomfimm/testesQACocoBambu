#language: pt
#enconding: UTF-8

@ST001_CT000_Cadastrar_Ususario
Funcionalidade: Cadastrar usuario

	@ST001_CT001_Abrir_Tela_Cadastro
	Cenario: CT001 - Validar a tela de cadastro
	Dado que o usuario clique no botao de cadastre se
	Entao a tela de cadastro deve ser apresentada
	
	@ST001_CT002_Erro_Nome_Completo_Obrigatorio
	Cenario: CT002 - Validar o erro de nome completo obrigatório ao clicar no campo nome completo e logo apos fora dele
	Dado que o usuario clique no botao de cadastre se
	E clicar no campo Nome Completo
	E clicar fora do campo Nome
	Entao o sistema do cadastro deve retornar um erro de nome completo obrigatorio
	
	@ST001_CT003_Erro_Nome_Deve_Conter_Mais_De_2_Caracteres
	Cenario: CT003 - Validar o erro de nome deve conter mais de dois caracteres ao inserir apenas um caractere no campo
	Dado que o usuario clique no botao de cadastre se
	E inserir apenas um caractere no campo Nome Completo
	Entao o sistema do cadastro deve retornar o erro de nome deve conter mais de dois caracteres
	
	@ST001_CT004_Erro_Digite_Seu_Nome_Completo
	Cenario: CT004 - Validar o erro de digite o seu nome completo ao inserir cinco caracteres aleatórios
	Dado que o usuario clique no botao de cadastre se
	E inserir apenas o primeiro nome no campo Nome Completo
	Entao o sistema do cadastro deve retornar o erro de digite seu nome completo
	
	@ST001_CT005_Erro_Nome_Possui_Caracteres_Invalidos
	Cenario: CT005 - Validar o erro de nome possui caracteres invalidos ao inserir primeiro nome um numero no lugar do sobrenome
	Dado que o usuario clique no botao de cadastre se
	E inserir apenas o primeiro nome seguido de um numero no campo Nome Completo
	Entao o sistema do cadastro deve retornar o erro de nome possui caracteres invalidos
	
	@ST001_CT006_Erro_Email_Obrigatorio
	Cenario: CT006 - Validar o erro de email obrigatorio ao clicar no campo email e logo apos fora dele
	Dado que o usuario clique no botao de cadastre se
	E clicar no campo email da tela de cadastro
	E clicar fora do campo email
	Entao o sistema do cadastro deve retornar o erro de email obrigatorio
	
	@ST001_CT007_Erro_Email_Invalido
	Cenario: CT007 - Validar o erro de email invalido ao inserir o campo email sem arroba
	Dado que o usuario clique no botao de cadastre se
	E inserir algum valor sem arroba no campo email da tela de cadastro
	Entao o sistema do cadastro deve retornar o erro de email invalido
	
	@ST001_CT008_Erro_Senha_Obrigatoria
	Cenario: CT008 - Validar o erro de senha obrigatoria ao clicar no campo senha se logo apos fora dele
	Dado que o usuario clique no botao de cadastre se
	E clicar no campo senha na tela de cadastro
	E clicar fora do campo Senha
	Entao o sistema do cadastro deve retornar o erro de senha obrigatoria
	
	@ST001_CT009_Erro_Senha_Deve_Conter_Seis_Caracteres
	Cenario: CT009 - Validar o erro de senha deve conter ao menos seis caracteres ao informar apenas o valor de um caractere no campo
	Dado que o usuario clique no botao de cadastre se
	E informar o campo senha com apenas um digito na tela de cadastro
	Entao o sistema do cadastro deve retornar o erro de senha deve conter ao menos seis caracteres
	
	@ST001_CT010_Erro_Senha_Muito_Similar_Aos_Dados_Pessoais
	Cenario: CT010 - Validar o erro de senha muito similar aos dados pessoais ao informar um caractere especial e um numero seguido da cópia do nome completo
	Dado que o usuario clique no botao de cadastre se
	E informar o campo senha com um caractere especial um numero e a copia do nome completo
	Entao o sistema do cadastro deve retornar o erro de senha muito similar aos dados pessoais
	
	@ST001_CT011_Erro_Senha_Deve_Conter_Um_Caractere_Maiusculo
	Cenario: CT011 - Validar o erro de senha deve conter um caractere maiusculo ao informar ao menos seis caracteres minusculos
	Dado que o usuario clique no botao de cadastre se
	E informar o campo senha com seis caracteres minusculos
	Entao o sistema do cadastro deve retornar o erro de senha deve conter um caractere maiusculo
	
	@ST001_CT012_Erro_Senha_Deve_Conter_Um_Caractere_Minusculo
	Cenario: CT012 - Validar o erro de senha deve conter um caractere minusculo ao informar ao menos seis caracteres minusculos
	Dado que o usuario clique no botao de cadastre se
	E informar o campo senha com seis caracteres maiusculos
	Entao o sistema do cadastro deve retornar o erro de senha deve conter um caractere minusculo
	
	@ST001_CT013_Erro_Senha_Deve_Conter_Um_Caractere_Especial
	Cenario: CT013 - Validar o erro de senha deve conter um caractere especial ao informar ao menos seis caracteres minusculos
	Dado que o usuario clique no botao de cadastre se
	E informar o campo senha aleatória contendo mais de seis digitos maiusculos e minusculos e ao menos um numero
	Entao o sistema do cadastro deve retornar o erro de senha deve conter um caractere especial
	
	@ST001_CT014_Erro_Senha_Deve_Conter_Um_Numero
	Cenario: CT014 - Validar o erro de senha deve conter um numero especial ao informar ao menos seis caracteres minusculos
	Dado que o usuario clique no botao de cadastre se
	E informar o campo senha aleatória contendo mais de seis digitos maiusculos e minusculos e ao menos um caractere especial
	Entao o sistema do cadastro deve retornar o erro de senha deve conter um caractere numero
	
	@ST001_CT015_Erro_Confirmacao_Senha_Obrigatorio
	Cenario: CT015 - Validar o erro de confirmar senha é obrigatório ao clicar no campo confirmar senha se logo apos fora dele
	Dado que o usuario clique no botao de cadastre se
	E clicar no campo confirmar senha na tela de cadastro
	E clicar fora do campo confirmar senha
	Entao o sistema do cadastro deve retornar o erro de confirmacao de senha obrigatoria
	
	@ST001_CT016_Erro_Senhas_Inseridas_Sao_Diferentes
	Cenario: CT016 - Validar o erro de confirmacao de senha senhas sao diferentes informar a confirmacao de senha diferente da senha
	Dado que o usuario clique no botao de cadastre se
	E informar o campo senha com uma senha valida aleatoria
	E informar o campo confirmacao de senha com um valor diferente da senha
	Entao o sistema do cadastro deve retornar o erro de as senhas inseridas sao diferentes
	
	@ST001_CT017_Cadastro_Selecionar_Estado
	Cenario: CT017 - Selecionar um estado aletório na tela de cadastro
	Dado que o usuario clique no botao de cadastre se
	E clicar no select de estados
	E selecionar um estado aleatorio
	Entao o estado aleatorio selecionado deve aparecer no campo
	
	@ST001_CT018_Erro_Estado_Obrigatorio
	Cenario: CT018 - Validar o erro de estado é obrigatório ao não selecionar nenhum estado
	Dado que o usuario clique no botao de cadastre se
	E clicar no select de estados
	E selecionar em cancelar na selecao de estados
	Entao o sistema do cadastro deve retornar o erro de estado e obrigatorio
	
	@ST001_CT019_Concluir_Cadastro
	Cenario: CT019 - Validar a conclusão do cadastro
	Dado que o usuario clique no botao de cadastre se
	E informar o campo Nome Completo
	E informar o campo email na tela de cadastro
	E informar a senha na tela de cadastro
	E informar a confirmacao de senha na tela de cadastro
	E selecionar o estado de cadastro
	E selecionar a caixa de notificacoes personalisadas
	E selecionar a caixa de termos e condicoes de uso
	E clicar no botao cadastrar
	Entao a tela de confirmacao de codigo de email deve ser apresentada
	