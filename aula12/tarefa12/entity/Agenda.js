
import {Contato} from "./Contato.js";
export class Agenda{
    /*
    adicionar um novo contato, outro método para buscar um contato pelo seu nome
    ou email (retorna uma instância de Contato), um método para excluir um contato
    através do nome e por fim um método para listar os contatos adicionados na agenda.
     */
    contatos = new Array();
    // NÃO EXISTE TIPO 'LIST' NO JAVASCRIPT; porém o tipo Array é, por trás dos panos, uma lista encadeada.

    adicionar(contato){
        try{
            if(!(contato instanceof Contato)) throw new Error("Objeto não é um contato!");
            this.contatos.push(contato);
            return;

        }catch (err){
            console.log(err.message);
            return;
        }
    }

    buscarPorNome(nome){


        return this.contatos.find((c)=>c.nome===nome);
    }

    buscarPorEmail(email){


        return this.contatos.find((c)=>c.email===email);
    }


    buscarListDeContatos(props){
        return this.contatos.filter((c)=>(c.nome===props.nome || c.email === props.email));
    }



    excluirPorNome(nome){

        this.contatos = this.contatos.filter((contato)=>contato.nome!==nome);

    }
    excluirPorEmail(email){
        this.contatos = this.contatos.filter((contato)=>contato.email!==email);


    }

    listarContatos(){
        return this.contatos;
    }




}