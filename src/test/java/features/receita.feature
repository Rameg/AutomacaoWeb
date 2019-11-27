# language: pt
  Funcionalidade: Receita de João Pessoa

    Cenário: Como um usuário, calcular o valor arrecado no quadro geral da receita do ano de 2018 no mês de fevereiro
      Dado que o usuário esteja na tela de quadro geral
      Quando selecionar a data de 2018
      E selecionar o mês de fevereiro
      Então quando pesquisar, somar todos os valores arrecadados
      E verificar o calculo total

    Cenário: Como um usuário, calcular o detalhamento da receita da semob para operações externas no ano de 2018 no mês de fevereiro
      Dado que o usuário esteja na tela de detalhamento
      Quando selecionar a data de 2018
      E selecionar o mês inicial de fevereiro
      E selecionar o mês final de fevereiro
      E aplicar o filtro de fonte do recurso com operacoes de credito externas
      E aplicar a entidade semob
      Então quando pesquisar, somar todos os valores
      E verificar o calculo total