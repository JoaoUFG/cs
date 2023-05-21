# Rest API 
## Sigla
REST API significa _Representational State Transfer(Rest) Application Programming Interface(API)_.
## Conceito
Criado pelo cientista da computação Roy Fielding, Rest API (também chamada RESTful API) se refere a uma interface de programação dentro do domínio WEB, o qual envia dados para um servidor sem necessitar saber detalhes do mesmo. Mas não é só isso, para a sua API ser Rest, ela necessita cumprir uma série de requisitos arquiteturais característicos do tipo Rest.
## O que é preciso para ser REST
Como dito antes, REST não é um protocolo, e sim uma arquitetura para APIs, ou seja, pode ser implementada de várias maneiras desde que esteja coerente com os seguintes critérios:
- Ter uma arquitetura cliente/servidor formada por clientes, servidores e recursos, com solicitações gerenciadas por HTTP.
- Estabelecer uma comunicação _stateless_ entre cliente e servidor. Isso significa que nenhuma informação do cliente é armazenada entre solicitações GET e toda as solicitações são separadas e desconectadas.
- Armazenar dados em cache para otimizar as interações entre cliente e servidor.
- Ter uma interface uniforme entre os componentes para que as informações sejam transferidas em um formato padronizado. Para tanto, é necessário que:
  * os recursos solicitados sejam identificáveis e estejam separados das representações enviadas ao cliente;
  *  os recursos possam ser manipulados pelo cliente por meio da representação recebida com informações suficientes para tais ações;
  * as mensagens autodescritivas retornadas ao cliente contenham informações suficientes para descrever como processá-las;
  * hipertexto e hipermídia estão disponíveis. Isso significa que após acessar um recurso, o cliente pode usar hiperlinks para encontrar as demais ações disponíveis para ele no momento
  * cada camada do sistema deve possuir uma funcionalidade específica (como segurança ou carregamento). Assim, cada camada é responsável por uma etapa diferente dos processos de requisição de usuário e de resposta do servidor
## Usos
As APIs REST são muito uteis para serviços flexíveis e rápidos, como a computação em Cloud e serviços atrelados a IOT(Internet Of Thigns), pois sua arquitetura stateless e a possibildiade de utilizar variados tipos de estruturação de 
informação enviada/recebida como JSON, XML, XTL, plain-text, etc.. Também, serviços Web são ideais para o tipo REST, principalmente com o uso do JSON, por ser mais legível pelo olho humano. 
## Conclusão
Por mais que o tipo REST não apresente tanta rigidez na segurança da informação como o tipo SOAP por exemplo, sua flexibilidade e características arquitetônicas convenientes a fazem ser a maior tendência na atualidade, visto que cada vez mais
os softwares estão se tornando mais integrados e poderosos. Pode ser que futuramente algum gênio invente outra arquitetura mais conveniente, mas na atualidade, quem leva o prêmio é o tipo REST.
