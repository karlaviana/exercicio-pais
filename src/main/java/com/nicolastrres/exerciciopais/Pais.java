package com.nicolastrres.exerciciopais;

import java.util.ArrayList;

public class Pais {
    private String nome;
    private String capital;
    private String dimensao;
    private ArrayList fronteira;

    public Pais(String nome, String capital, String dimensao){
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
    }

    public String obterNome(){
        return nome;
    }

    public String obterCapital(){
        return capital;
    }

    public String obterDimensao(){
        return dimensao;
    }


    public void setNome(String nomePais) {
        this.nome= nomePais;
    }

    public void setCapital(String capital) {
        this.capital= capital;
    }
    public  boolean equals(final Pais outro){
        if(this.nome.equals(outro.nome) && this.capital.equals(outro.capital) ){
            return true;
        }

      return  false;
    }

    public void setFronteira(ArrayList fronteira) {
        this.fronteira = fronteira;
    }

    public ArrayList obterFronteira() {
        return fronteira;
    }
}
