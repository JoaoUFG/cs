## Tarefa 007: Revisão de Código - 10/05/2023

1. Solicita-se a leitura dos artigos disponíveis nos seguintes links:

  1.1 [link1](https://appmaster.io/pt/blog/revisoes-de-codigo)

  1.2 [link2](https://medium.com/codigorefinado/code-review-revis%C3%A3o-de-c%C3%B3digo-pode-ser-automatizada-ba5f25882774)

2. Após a leitura elaborar um resumo descritivo de cada um deles. Destacando:

  2.1 A importância da Revisão de código;

  2.1 Os objetivos desta técnica;

  2.2 O Processo de Revisão e

  2.3 Descrever algumas das ferramentas de suporte a esta atividade, com seus respectivos links no texto.   

INSTRUÇÕES:

1. No seu repositório pessoal, na sua branch pessoal, criar a pasta aula09.
2. Commitar este arquivo respondido nesta pasta.
3. A data limite para concluir esta tarefa é dia 10/05/2023, as 23h59min.

</DIV/>


## Resposta do aluno
A Revisão de Código é uma prática presente em empresas que prezam pela qualidade do seu software e sabem onde investir tempo agora para poupar no futuro. Essa técnica tem como objetivo prever os erros os quais uma simples verificação sintática não consegue, como algoritmos ineficientes, duplicidade de código, ilegibilidade, fuga dos padrões e usos errôneos de nomes/terminologias nas estrturas do código.<br>
O Processo de Revisão de Código consiste em primeiramente se preparar, conhecendo o contexto da empresa e da aplicação e se familiarizando com o código, segundamente realizar as checagens, testes e depurações para verificar os aspectos que podem apresentar problemas como os mencionados acima, e por fim realizar/recomendar as mudanças, sem deixar de acompanhar as novas versões e verificar se todas as solicitações de melhorias dadas pelo(s) revisor(es) foram atendidas pelo time de desenvolvimento.<br>
Em resumo, é uma prática que a primeira vista pode parecer trabalhosa, cara e custosa, mas que ao dar uma breve análise, é possível visualizar o tanto de retrabalho que ela previne.<br>
Por fim, nem sempre todas as atividades de Revisão de Código precisam ser realizadas pelo ser humano, sendo as mecânicas (e necessárias) uma oportunidade para inserir uma ferramenta automatizada. Aqui vai um breve resumo de ferramentas bem interessantes:<br>
- [Restyled.io](https://github.com/marketplace/restyled-io), essa consegue atacar bem o ponto de legibilidade e padronização de código, com sua reestilização dinânmica e altamente personalizável, torna a preocupação do programador de seguir diversos padrões ,as vezes de fácil esquecimento, muito menor.
- [Coveralls](https://github.com/marketplace/coveralls), para os amantes de TDD (Desenvolvimento Dirigido a Testes) essa ferramenta se tornará indispensável. O Coveralls consegue trackear todos os seus testes e calcular a cobertura deles sobre seu código, lhe entrega em porcentagens, lhe diz se aumentou ou diminui entre os commits, e ainda possui uma interface super amigável.
- [Imgbot](https://github.com/marketplace/imgbot), essa parece simples, mas genial. O Imgbot analisa os seus arquivos de imagem e, no Pull Request, verifica se o espaço em disco deles pode ser diminuído, e se você quiser, ele automaticamente reduz o tamanho dos arquivos, economizando assim o espaço ocupado no seu banco de dados.



