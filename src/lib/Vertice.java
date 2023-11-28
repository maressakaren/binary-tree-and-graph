package lib;

import java.util.ArrayList;
import java.util.List;

public class Vertice<T> {


    private T valor = null;

    public Vertice (T valor){
        this.valor = valor;
    }

    public T getValor(){
        return this.valor;
    }

    public void setValor(T valor){
        this.valor = valor;

    }
    /*private String nome;
    private List<Aresta> adj;

    public Vertice(String nome) {
        this.nome = nome;
        adj = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aresta> getAdj() {
        return adj;
    }

    public void addAdj(Aresta aresta) {
        adj.add(aresta);
    }

    @Override
    public String toString() {
        return nome;
    }*/
}