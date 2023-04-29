### Tarefa Grupo 005: Git Exercícios - 28/04/2023.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git? git -v 
2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help - Uma lista de ajuda para comandos comuns e muito usados
  b. git help checkout - Comumente somente muda a branch atual, porém com mais parâmetros
  há como criar novas branchs e realizar algumas operações 
  c. git help merge - fornece informações sobre o comando git merge
  d. git init - inicia um repositorio local com versionamento dentro da pasta
  e. git add --all : adiciona todos os arquivos para o versionamento (normalmente usado antes de commits)
  f. git add -u : adiciona arquivos que sofreram modificações ao rastreamento do git
  g. git config -l : lista todas as configurações do git
  h. git mv a.txt b.txt : renomeia o arquivo
  i. git reset --hard : reseta o repositório e apaga tudo que estava untraked.
  j. git log -27: mostra o log de commits 27 commits atrás do último commit.
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
  git add 
  git commit 
4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
git log ou git blame

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
git status

6. Qual o comando para efetuar um _commit_?
git commit
7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
git reset teste.txt

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
adicioná-lo ao gititgnore de acordo com a sintaxe correta.

9. O que acontece se o seu repositório local for acidentalmente removido?
se a pasta .git for apagado juntamente, o repositório local deixa de existir.

10.  Como clonar um repositório remoto?
git clone url
git clone SSHurl

11.  Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
git shortlog

12.  Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
.git/config

13.  Qual o comando para criar um repositório local?
git init

14.  Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
.git
15.  Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
git add -u

16.  O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
Significa Secure Hash Algorithm, tem o propósito de deixar segura a autenticação do usuário.
é o um algoritmo de criptografia que utiliza o conceito de hash.

17.  Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
git log

18.  Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
Não

19.  Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1** reseta tudo para o primeiro commit<br>
**git reset --hard** deleta os untrakeds e reseta para o primeiro commit


20.   Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
git clean -f

21.   Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
.gitignore

22.   Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
escrever: *.class<br>
no gitignore

23.   jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
fiz o clone, está em ./jquery

24.   No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
mostra todos que realizaram commits, mas somente identificando cada um


1.    No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
mostra a url do repositório

2.    Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
git tag

3.   Caso um dado repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
git tag -l "2.0*"

4.   Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
Exibe os dados da tag e o commit.

5.   Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
Exibe todos os objetos que contém "3.4-gold".

6.   O que o comando **git push origin 3.4-gold** teria como efeito?
faz o push para o repositório de nome __origin__ para a branch 3.4-gold.

7.   Após executar um commit, qual o efeito de **git commit --amend**?
Reseta a árvore de commits e cria um novo commit como mensagem inicial.

8.   Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
Retira o arquivo da área de staging.

9.  Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
A mudança de branch força o desfazer das mudanças do arquivo "a.txt"

10. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
 O primeiro retira o arquivo da área de staging, enquanto o segundo descarta as mudanças.

11. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.





INSTRUÇÕES:

1. No seu repositório pessoal, na sua branch, criar a pasta aula05.
2. Commitar este arquivo respondido nesta pasta.
3. A data limite para concluir esta tarefa é dia 01/05/2023, as 23h59min.











</DIV/>
