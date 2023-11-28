
package lib;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author maressakaren
 */
public class Grafo <T>{

    public ArrayList<Aresta<T>> arestas;
    public ArrayList<Vertice<T>> vertices;
    protected Comparator<T> comparador;

    public Grafo(Comparator<T> comp){
        this.comparador = comp;
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
    }
    public ArrayList<Vertice<T>> getVertices(){ return this.vertices;}


    public Vertice<T> adicionaVertice(T valor){

        Vertice<T> novo = new Vertice<T>(valor);
        this.vertices.add(novo);
        return novo;
    }

    public Vertice<T> obterVertice (T valor){
        for(Vertice<T> vertice: vertices){
            if(vertice.getValor().equals(valor)){ return vertice;}
        }
        return null;
    }

    public void adicionarAresta( Vertice<T> origem, Vertice<T> destino, float peso){
        Vertice<T> verticeOrigem, verticeDestino;
        Aresta<T> novAresta;

        verticeOrigem = obterVertice(origem.getValor());

        if( verticeOrigem == null){
            verticeOrigem = adicionaVertice(origem.getValor());
        
        }
        
        verticeDestino = obterVertice(destino.getValor());

        if ( verticeDestino == null){
            verticeDestino = adicionaVertice(destino.getValor());
        }

        novAresta = new Aresta<T>(verticeOrigem, verticeDestino, peso);
        this.arestas.add(novAresta);

    }

    public List<Aresta<T>> obterDestinos(Vertice<T> vertice){
        ArrayList<Aresta<T>> destinos = new ArrayList<Aresta<T>>();

        for( Aresta<T> aresta: this.arestas){
            
            if( aresta.getOrigem().equals(vertice)){ destinos.add(aresta);}

        }
        return destinos;
    }

    

    public void buscaEmProfundidade() {
        System.out.println("\n----------------- BUSCA EM PROFUNDIDADE ----------------- \n");
        List<Vertice<T>> visitados = new ArrayList<>();

        /* Loop que percorre todos os vertices para que sejam visitados, mesmo se não tiver uma aresta de origem */
        for (Vertice<T> vertice : this.vertices) { 
            if (!visitados.contains(vertice)) {
                buscaEmProfundidadeRecursiva(vertice, visitados);
            }
        }
    }
    private void buscaEmProfundidadeRecursiva( Vertice<T> atual, List<Vertice<T>> visitados){ 
        System.out.println(atual.getValor());
        visitados.add(atual);

        List<Aresta<T>> destinos = this.obterDestinos(atual);
        for(Aresta<T> aresta: destinos){
            Vertice<T> proximo = aresta.getDestino();
            if(!visitados.contains(proximo)){
                buscaEmProfundidadeRecursiva(proximo, visitados);
            }
        }

    }

    public boolean verificaCiclo(){
        List<Vertice<T>> visitados = new ArrayList<>();
        List<Vertice<T>> caminhoAtual = new ArrayList<>();

        for(Vertice<T> vertice : this.vertices){
            if(!visitados.contains(vertice)){
                if(verificaCicloRecursivo(vertice, visitados, caminhoAtual)){
                    return true;
                }

            }
        }

        return false;  

    }

    public boolean verificaCicloRecursivo(Vertice<T> atual, List<Vertice<T>> visitados, List<Vertice<T>> caminhoAtual){
        visitados.add(atual);
        caminhoAtual.add(atual);
        List<Aresta<T>> destinos = this.obterDestinos(atual);

        for(Aresta<T> aresta : destinos){
            Vertice<T> proximo = aresta.getDestino();

            if(!visitados.contains(proximo)){
                if( verificaCicloRecursivo(proximo, visitados, caminhoAtual)){
                    return true;
                }
            }else if( caminhoAtual.contains(proximo)){
                return true;
            }

        }
        caminhoAtual.remove(atual);

        return false;
 
    }
    

}
