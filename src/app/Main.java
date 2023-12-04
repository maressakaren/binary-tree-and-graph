package app;

import lib.ArvoreBinaria;
import lib.Grafo;

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
        Aluno aluno = new Aluno(10, "A");
        Aluno aluno1 = new Aluno(11,"B");
        Aluno aluno2 = new Aluno(25,"C");
        Aluno aluno3 = new Aluno(2,"D");
        Aluno aluno4 = new Aluno(1,"E");
        Aluno aluno5 = new Aluno(38,"F");
        
        
        //arvore.adicionar(aluno);
        //System.out.println("Raiz - " + arvore.getRaiz().getValor());
        arvore.adicionar(aluno);
        System.out.println("Raiz - " + arvore.getRaiz().getValor());
        arvore.adicionar(aluno1);
        System.out.println(arvore.altura());
        arvore.adicionar(aluno2);
        arvore.adicionar(aluno3);
        System.out.println("Raiz - " + arvore.getRaiz().getValor());
        arvore.adicionar(aluno4);
        arvore.adicionar(aluno5);
        System.out.println("Raiz - " + arvore.getRaiz().getValor());
        
        
       
        System.out.println(arvore.remover(aluno5));
        System.out.println(arvore.altura());

        System.out.println(arvore.altura());
        System.out.println(arvore.pesquisar(aluno4));
        System.out.println("Quantidade de nós: " + arvore.quantidadeNos());
        //arvore.adicionar(new Aluno(3,"ahh"));
        arvore.adicionar(new Aluno(3,"ahh"));
        arvore.adicionar(new Aluno(4,"ahh"));
        arvore.adicionar(new Aluno(5,"ahh"));
        arvore.adicionar(new Aluno(6,"ahh"));
        arvore.adicionar(new Aluno(7,"ahh"));
        arvore.adicionar(new Aluno(8,"ahh"));
        arvore.adicionar(new Aluno(9,"ahh"));
        
        System.out.println("Quantidade de nós: " + arvore.quantidadeNos());

        System.out.println("Altura: " + arvore.altura());
        System.out.println(arvore.remover(aluno));
        String resultado = arvore.caminharEmNivel();
        System.out.println("Caminhamento em Nível:\n" + resultado);
        System.out.println("Caminhar em ordem: " + arvore.caminharEmOrdem());
        arvore.reiniciarNavegacao();
        System.out.println("Obter Proximo: " + arvore.obterProximo());
        

        System.out.println("\n\n ------------------GRAFO-----------------------\n\n");
        Grafo<Aluno> grafo = new Grafo<>(comp);
        Vertice <Aluno> a = grafo.adicionaVertice(aluno);
        Vertice<Aluno> b = grafo.adicionaVertice(aluno1);
        Vertice<Aluno> c = grafo.adicionaVertice(aluno2);
        Vertice<Aluno>d = grafo.adicionaVertice(aluno3);
        Vertice<Aluno>e = grafo.adicionaVertice(aluno4);
        Vertice<Aluno>f = grafo.adicionaVertice(aluno5);


        //grafo.adicionarAresta(e, b, 0);
        //grafo.adicionarAresta(b,c, 0);
        grafo.adicionarAresta(f, a, 0);
        grafo.adicionarAresta(f, c,1);// não vai
        grafo.adicionarAresta(c, d, 0);
        grafo.adicionarAresta(e, b, 0);
        grafo.adicionarAresta(d, b, 0);
        grafo.adicionarAresta(e, a, 0);

        System.out.println(grafo.vertices.size());
        System.out.println(grafo.arestas.size());
        grafo.buscaEmProfundidade();
        System.out.println(grafo.verificaCiclo());
        grafo.imprimirTopologia();

    }
    
}
