# language:pt
Funcionalidade: Alugar Fillme
	Como um usuário
	Eu quero cadastrar alugueis de filmes
	Para controlar preços e datas de entrega
	
	Cenário: Deve alugar um filme com suceeso
	Dado um filme com estoque de 2 unidades
	E que o preço do aluguel seja R$ 3
	Quando alugar
	Então o preço do aluguel será R$ 3
	E a data de entrega será no dia seguinte
	E o estoque do filme séra 1 unidade
	