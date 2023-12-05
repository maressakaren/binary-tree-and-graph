package app;

import java.util.Comparator;

import lib.ArvoreAVL;
import lib.ArvoreBinaria;
import lib.Grafo;
import lib.IArvoreBinaria;
import lib.No;
import lib.Vertice;

public class Main {

    public static void main (String args[]){
        /*String nome = "Magaghab";
        Aluno aluno = new Aluno(123, "Jud");
        Aluno aluno2 = new Aluno(2000000005,"Ped");
        Aluno aluno1 = new Aluno(2000000001,"Ped");
        GeradorDeArvores gerador = new GeradorDeArvores();
        IArvoreBinaria<Aluno> arv;*/

        ComparadorAlunoPorMatricula comp = new ComparadorAlunoPorMatricula();
       // ArvoreBinaria <Aluno> arvore = new ArvoreBinaria<Aluno>(comp);
       // No no = arvore.adicionar(aluno);
        //System.out.println(comp.compare(aluno, aluno2));
        /*arv = new ArvoreBinaria(comp);
        gerador.geraArvorePerfeitamenteBalanceada(1,10,arv);
        arv.remover(aluno2);
        
        System.out.println("Árvore Perfeitamente Balanceada Criada");
        System.out.println("Altura: " + arv.altura());

        System.out.println(arv.caminharEmOrdem());
        System.out.println(arv.caminharEmNivel());*/
        ArvoreBinaria <Aluno> arvore = new ArvoreBinaria<>(comp);
        Aluno aluno = new Aluno(30, "30");
        Aluno aluno1 = new Aluno(20,"20");
        Aluno aluno2 = new Aluno(5,"5");
        Aluno aluno3 = new Aluno(50,"50");
        Aluno aluno4 = new Aluno(40,"40");
        Aluno aluno5 = new Aluno(45,"45");
        Aluno aluno6 = new Aluno(60,"60");
        Aluno aluno7 = new Aluno(55,"55");
        arvore.adicionar(aluno);
        arvore.adicionar(aluno1);
        arvore.adicionar(aluno2);
        arvore.adicionar(aluno3);
        arvore.adicionar(aluno4);
        arvore.adicionar(aluno5);
        arvore.adicionar(aluno6);
        arvore.adicionar(aluno7);

       
        System.out.println("\n--------------CAMINHAR EM ORDEM-----------------------\n"+ arvore.caminharEmOrdem());
        System.out.println("\n--------------CAMINHAR EM NIVEL-----------------------\n"+ arvore.caminharEmNivel());

        arvore.remover(aluno1);
        System.out.println("\n--------------CAMINHAR EM ORDEM-----------------------\n"+ arvore.caminharEmOrdem());
        System.out.println("\n--------------CAMINHAR EM NIVEL-----------------------\n"+ arvore.caminharEmNivel());
       
        arvore.remover(aluno2);
        System.out.println("\n--------------CAMINHAR EM ORDEM-----------------------\n"+ arvore.caminharEmOrdem());
        System.out.println("\n--------------CAMINHAR EM NIVEL-----------------------\n"+ arvore.caminharEmNivel());

        arvore.remover(aluno3);
        System.out.println("\n--------------CAMINHAR EM ORDEM-----------------------\n"+ arvore.caminharEmOrdem());
        System.out.println("\n--------------CAMINHAR EM NIVEL-----------------------\n"+ arvore.caminharEmNivel());

        arvore.adicionar(new Aluno(10, "10"));
        System.out.println("\n--------------CAMINHAR EM ORDEM-----------------------\n"+ arvore.caminharEmOrdem());
        System.out.println("\n--------------CAMINHAR EM NIVEL-----------------------\n"+ arvore.caminharEmNivel());

        arvore.remover(aluno);
        System.out.println("\n--------------CAMINHAR EM ORDEM-----------------------\n"+ arvore.caminharEmOrdem());
        System.out.println("\n--------------CAMINHAR EM NIVEL-----------------------\n"+ arvore.caminharEmNivel());

        arvore.reiniciarNavegacao();
        System.out.println(arvore.obterProximo());
        
       
        
        
       
       
        
      
        
        /*
        System.out.println("\n\n ------------------GRAFO-----------------------\n\n");
        Grafo<Aluno> grafo = new Grafo<>(comp);
        Vertice <Aluno> a = grafo.adicionaVertice(aluno);
        Vertice<Aluno> b = grafo.adicionaVertice(aluno1);
        Vertice<Aluno> c =grafo.adicionaVertice(aluno2);
        Vertice<Aluno>d=grafo.adicionaVertice(aluno3);
        Vertice<Aluno>e =grafo.adicionaVertice(aluno4);


        grafo.adicionarAresta(e, b, 0);
        //grafo.adicionarAresta(b,c, 0);
        grafo.adicionarAresta(c, d, 0);
        grafo.adicionarAresta(d, a, 0);// não vai
        grafo.adicionarAresta(b, d, 0);
        grafo.adicionarAresta(a, e, 0);
        grafo.adicionarAresta(a, c, 0);

        System.out.println("\nBusca em largura\n");

        System.out.println(grafo.vertices.size());
        System.out.println(grafo.arestas.size());
        grafo.buscaEmProfundidade();
        System.out.println(grafo.verificaCiclo());
        */
    }
    
}
