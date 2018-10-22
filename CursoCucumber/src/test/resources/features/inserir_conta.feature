#language: pt
@funcionais
Funcionalidade: Cadastro de contas
  
  Como um usuário 
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

  #Background
  Contexto: 
    Dado que estou acessando a aplicação
    Quando informo o usuário "teste_peterson@teste.com"
    E a senha "123456"
    E seleciono entrar
    Então visualizo a página inicial
    Quando seleciono Contas
    E seleciono Adicionar

  Esquema do Cenário: De validar regras cadastro contas
    E informo a conta "<conta>"
    E seleciono Salvar
    Então recebo a mensagem "<mensagem>"

    Exemplos: 
      | conta            | mensagem                           |
      | Conta de Teste   | Conta adicionada com sucesso!      |
      |                  | Informe o nome da conta            |
      | Conta mesmo nome | Já existe uma conta com esse nome! |
  #Cenário: Não deve inserir uma conta com nome já existente
   # E informo a conta "Conta mesmo nome"
   # E seleciono Salvar
   # Então sou notificado que já existe uma conta com esse nome
