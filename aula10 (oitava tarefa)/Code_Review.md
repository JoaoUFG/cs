<div align="center">
<h1>Model</h1>
</div>

## Cliente
 - tudo certo
## PremioSeguro
- Pela linha 36 até a 54, há uma atribuição de 
valores desnecessários. São criadas várias variáveis
apenas para leitura, sendo que os valores já estão
no cliente da classe.
- Também pelas linhas 36 até 54, existem validações
desnecessárias. A classe PremioSeguro deveria ser
responsável apenas por calcular o desconto, e não
validar as credenciais (que já são validadas no
construtor de Cliente).
- Caso uma validação extra precisasse ser feita
diante regras de negócio específicas, essa complexidade
deveria ser extraída para alguma classe dentro do 
pacote `util`.
- Além disso, o método `obtemPercentualDesconto()` e
o método `calculaValorComDesconto()` são desnecessáriamente
separados, a recepção dos dados do cliente, o cálculo
do percentual e o retorno dele poderiam estar no mesmo
método. Dessa forma, quando PremioSeguro fosse instanciada,
quem a instanciou não precisaria se preocupar em fazer múltiplas
operações para que ela fizesse o único papel dela, aumentando assim
o encapsulamento de sua função, e evitando transbordar complexidade
em possíveis locais desnecessários.
- Inclusive, é boa prática evitar vários `else if`,
o melhor é sempre escrever, se possível, um `if(){/*codigo*/ return()`,
pois assim o código fica um pouco mais legível.
- Para finalizar, quando é com dinheiro, percentuais monetários,
cálculos financeiros no geral, é sempre melhor utilizar a classe `BigDecimal`
em vez de Double, para evitar erros provenientes
de arredondamentos automáticos e/ou limitações da
conversão contínua do sistema binário para o decimal.
## Teste
- É uma má prática colocar um teste dentro do pacote `src/main/java`,
este deveria estar em `src/main/test`. 
- A classe que possui o método `main` do projeto
deve possuir um nome condizente com o seu papel.
Uma sugestão é nomeá-la com o nome do projeto e 
"Application" em camel case, por exemplo: `SeguroApplication.java`
ou `SeguroVeiculosApplication.java`.

_____
<div align="center">
<h1>Exceptions</h1>
</div>

## CpfInvalidoException
- Talvez, a depender da incidência ou uso
das exceptions, uma mensagem de retorno poderia
ser elaborada. Fica a sugestçao.
## DataInvalidoException
- Talvez, a depender da incidência ou uso
  das exceptions, uma mensagem de retorno poderia
  ser elaborada. Fica a sugestçao.

## EstadoInvalidoException
- Talvez, a depender da incidência ou uso
  das exceptions, uma mensagem de retorno poderia
  ser elaborada. Fica a sugestçao.

## IdentidadeInvalidoException
- Talvez, a depender da incidência ou uso
  das exceptions, uma mensagem de retorno poderia
  ser elaborada. Fica a sugestçao.

## NacionalidadeInvalidoException
- Talvez, a depender da incidência ou uso
  das exceptions, uma mensagem de retorno poderia
  ser elaborada. Fica a sugestçao.

## SexoInvalidoException
- Talvez, a depender da incidência ou uso
  das exceptions, uma mensagem de retorno poderia
  ser elaborada. Fica a sugestçao.
____
<div align="center">
<h1>Util</h1>
</div>

## CpfValidator
- Tudo certo

## CpfValidatorRefactored
- Não há sentido em criar uma classe Refactored,
para isso serve o versionamento de código. Sugestão:
decida entre usar q implementação de `CpfValidator`
ou `CpfValidatorRefactored`.

## DataUtils
- Tudo correto

## EstadoCivilValidator
- Sobre a forma de tratar o estado civil desse projeto,
fica como sugestão de melhorias criar um `Enum` para tratar
do atributo de estado civil das pessoas casadas,
viuvas, solteiras e etc... Pois assim, não corre
o risco de algum programador (ou cliente, a depender 
da utilização do software) digitar a string errôneamente,
com uma letra maiúscula ou minúscula, além de melhorar a leitura
do código e escalabilidade. 

## NacionalidadeValidator
- A sugestão do `EstadoCivilValidator` também se
aplica nesse caso. Inclusive, um código para o país 
também seria interessante, existem várias maneiras melhores
que colocar uma String solta.

## PassaPorteValidator
- Nada a comentar

## SexoValidator
- A sugestão do `EstadoCivilValidator` e do
`NacionalidadeValidator` se aplicam aqui.
_____
<div align="center">
<h1>Testes</h1>
</div>

## Testes

 ### joao_pedro
- De acordo os testes, não houveram
problemas.
- não houve package com o meu nome, logo, debuguei
somente os que possuiam "joão".







