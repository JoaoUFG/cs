import {MergeSort} from "./util/MergeSort.js";
import {Agenda} from "./entity/Agenda.js";
import {Contato} from "./entity/Contato.js";

class Index{

  static run(){
    console.log("EXERÍCIO 1:\n___________________________________________\n")
      let startTime;
      let endTime;
      const tamanhosDoArray = new Array(10,1000,10000);
      tamanhosDoArray.forEach(tamanhoDaVez=>{
        console.log("\n")
            let arrayDaVez = this.criarArrayAleatorio(tamanhoDaVez);
          startTime = performance.now();
            MergeSort.mergeSortRecursive(arrayDaVez);
          endTime = performance.now();
          console.log(`O algoritmo RECURSIVO demorou: ${endTime-startTime} milisegundos para ordenar um vetor de ${tamanhoDaVez} elementos`);

          startTime = performance.now();
          MergeSort.mergeSortIterative(arrayDaVez);
          endTime = performance.now();
          console.log(`O algoritmo ITERATIVO demorou: ${endTime-startTime} milisegundos para ordenar o mesmo vetor de ${tamanhoDaVez} elementos`);


      })

      console.log("\nEXERÍCIO 2:\n___________________________________________\n")

      let agenda = new Agenda();


      agenda.adicionar(new Contato("joao gabriel", "joao@gmail.com"));
      agenda.adicionar(new Contato("Gabriela", "gabi@gmail.com"));
      agenda.adicionar(new Contato("Jose", "jose@gmail.com"));
      agenda.adicionar(new Contato("Jose", "joseOutroEmail@gmail.com"));

      console.log(agenda.listarContatos());
      console.log(`Buscar Lista de contatos por nome Jose: `); console.log(agenda.buscarListDeContatos({nome: "Jose"}));

        console.log(`Buscar pelo nome Gabriela:`); console.log(agenda.buscarPorNome("Gabriela"));

        agenda.excluirPorEmail("joao@gmail.com");
        agenda.excluirPorNome("Jose");
        console.log("\n Exlcuir por email: joao@gmail.com ; exlucuirPorNome: Jose: ")
      console.log(agenda.listarContatos());



  }


 static criarArrayAleatorio(size){
      if(typeof size !== 'number') return;
      let arr = new Array();

      for(let i=0; i<size;i++){
          arr.push(Math.floor(Math.random() * 5000));
      }
      return arr;

 }


}

Index.run();
