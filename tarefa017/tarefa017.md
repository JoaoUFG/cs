# Tarefa 017 - Configuração de software em tempo de execução, Generics, Closure e Logging - 30/06/2023

1. Considere os seguintes links, sobre os temas **Configuração de software em tempo de execução, _Generics_, _Closure_ e _Logging_**

  1.1 Configuração de software em tempo de execução:

      1.1.1 - [Link1](https://www.baeldung.com/spring-profiles);

      1.1.2 - [Link2](https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring).

  1.2 _Closure_:

    1.2.1 - [Link3](https://www.geeksforgeeks.org/closures-in-java-with-examples/).

    1.2.2 - [Link4](https://receitasdecodigo.com.br/java/exemplo-de-foreach-do-java-8).

    1.2.3 - [Link5](https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826).

  1.3 _Generics_:

    1.3.1 - [Link6](https://www.devmedia.com.br/usando-generics-em-java/28981).

    1.3.2 - [Link7](https://www.devmedia.com.br/java-generics-trabalhando-com-metodos/30911).

    1.3.3 - [Link8](https://howtodoinjava.com/java/generics/complete-java-generics-tutorial/).

  1.4 _Logging_:

    1.4.1 - [Link9](https://www.loggly.com/ultimate-guide/java-logging-basics/).

    1.4.2 - [Link10](https://www.journaldev.com/977/logger-in-java-logging-example).

    1.4.3 - [Link11](https://www.edureka.co/blog/logger-in-java).

2. Solicita o estudo destes temas e elaborar um texto descrito, manifestando seu entendimento a respeito de cada um deles e ainda apresentando exemplos de utilização dos mesmos.

**INSTRUÇÕES**
1. Esta é uma tarefa individual. A entrega deve ser entregue no seu repositório pessoal utilizado para a manutenção do controle de versão dos artefatos da disciplina, dentro de uma pasta chamada tarefa017.
2. O prazo para entrega desta tarefa é as 23h59min do dia 02/07/2023.

___________
## Resposta

- **Configuração em tempo de execução **: Os profiles são muito úteis para quando você possui uma ambiente de desenvolvimento mais maduro, o qual apresenta
por exemplo variáveis de ambiente diferentes para desenvolvimento, produção e homologcação. Através deles você pode mudar configurações específicas do seu projeto com um simples
comando antes de realizar o deploy. O conceito é muito bem implementado no framework Spring, porém ele ainda pode ser visto fora de frameworks, mais como uma característica de 
sistema de deploy/ inicialização da aplicação. Como exemplo temos o uso da biblioteca .env, que define um arquivo com variáveis ambiente. Ao mudar o arquivo, você muda as variáveis,
assim, no servidor de produção haverá o arquivo chamado  `.env` e nele haverá as configurações do profile de produção, por enquanto que para os desenvolvedores, haverá um `.env` com
o profile de desenvolvimento.
```javascript
import connection from 'mysql'
let options = {
    password: process.env.DATABASE_PASSWORD,
    username: process.env.DATABASE_USERNAME,
    host: process.env.DATABASE_HOST
}
connection.config(config);
```

- Injeção de dependências: esse é muito útil para evitar o instanciamento múltiplo desnecessário de algum objeto sempre necessário e que também não pode ser estático. Nesse caso, nós podemos
configurá-lo em um arquivo, e mandarmos o framework que implementa a injeção de dependências injetar esse objeto já configurado sempre que nós precisarmos. Assim, o encapsulamento é garantido,
pois os atributos desse objeto estarão privados,e o programador não precisa se preocupar em o configurar a cada instância. Exemplo: <br>
Arquivo de config: 
```java
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
            List<Usuario> findByCpf(String cpf);
    
        }

```
Arquivo o qual a dependência é injetada:
```java
@RestController
@RequestMapping("/api/usuario/cadastro")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository; //Dependência que realiza as queries do banco de dados já é injetada com todas as configurações necessárias.

    @PostMapping()
    @Transactional
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {
        if (usuarioRepository.findByCpf(usuario.getCpf())==null) {
            usuarioRepository.save(usuario);
            return ResponseEntity.created(usuario).body(usuario);
        }
        return ResponseEntity.badRequest(null).build();

    }
}
```

- Closure: ou também conhecida como lambda expressions, é simplesmente a ideia de eu alocar dinamicamente um atributo de um objeto como uma função, ou seja, o objeto pode ter comportamentos dinâmicos ao longo
da execução do programa. Esse conceito foi introduzido em muitas linguagens e atualmente está presente tanto no front-end quanto no back-end. Exemplo:
```java

public interface OperadorBinario<T> {
    T apply(int x, int y);
}

public class Main {
    public static void main(String[] args) {
        // Exemplo: Lambda expression para multiplicar dois números
        OperadorBinario<Integer> operacaoQueVoceQuiser = (a, b) -> a * b;
        int result = operacaoQueVoceQuiser.apply(5, 3);
        System.out.println("Resultado: " + result);

        operacaoQueVoceQuiser = (x, y) -> (x + y) * y;
        result = operacaoQueVoceQuiser.apply(5, 3);
        System.out.println("Resultado: " + result);
    }
}

```

- Generics: veio com o objetivo de organizar listas e parâmetros de métodos. O generics é denotado por <>, e serve como um contrato, quando eu especifico o que possui dentro do <> o compilador se torna capaz
de restringir comportamentos e prever erros. Como exemplo temos o icônico List<Animal> que recebe objetos do tipo Coelho e Gato. Ele também pode ser utilizado para uma organização personalidada, como no exemplo acima,
onde o OperadorBinario recebe a classe T, que permite o programador "assinar um contrato personalizado" e o permite o compilador "prever desvios do contrato". O uso de Generics também está no exemplo com 
a ResponseEntity<Usuario>.
- Logging: logging serve para organizar logs de seu programa, de forma que em seu funcionamento ele mostre a você em um certo output o que está ocorrendo nas partes predefinidas de monitoramento. Resumidamente,
ele permite você monitorar de forma personalizada controllers, services, operações, algoritmos, Exceptions e etc... Exemplo:
```javascript

const winston = require('winston');

// Criar uma instância do logger
const logger = winston.createLogger({
    level: 'info', // Nível de log mínimo (info, warn, error)
    format: winston.format.simple(), // Formato de exibição do log
    transports: [
        new winston.transports.Console() // Saída do log para o console
    ]
});

// Exemplo de uso do logger
logger.info('Mensagem informativa');
logger.warn('Aviso');
logger.error('Erro ocorrido');

// Exemplo de uso do logger em um middleware do Express
app.use((req, res, next) => {
    logger.info(`Requisição recebida: ${req.method} ${req.url}`);
    next();
});


```
