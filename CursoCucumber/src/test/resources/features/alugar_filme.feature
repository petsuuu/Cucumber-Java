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
    E o estoque do filme será 1 unidade

  Cenário: Não deve alugar filme sem estoque
    Dado um filme com estoque de 0 unidades
    Quando alugar
    Então não será possivel por falta de stoque
    E o estoque do filme será 0 unidade

  Cenário: Deve dar condições especiais para Categoria extendida
	Dado um filme com estoque de 2 unidades
	E que o preço do aluguel seja extendido
	Quando alugar
	Então o preço do aluguel será R$ 8
	E a data de entrega será em 3 dias
	E a pontuação será de 2 pontos
	
	