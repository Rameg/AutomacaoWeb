# language: pt
Funcionalidade: Obras Publicas de João Pessoa

  Cenário: Como um usuário, verificar o valor arrecado no quadro geral da receita do ano de 2018 no mês de fevereiro
    Dado que o usuário esteja na tela de quadro geral
    Quando selecionar a data de 2018
    E selecionar o mês de fevereiro
    Então quando pesquisar, somar todos os valores arrecadados
    E verificar o calculo total
