/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author P2
 */
public class InscritosEvento{
    public static ArrayList<InscritosEvento> inscritos = new ArrayList<>();
    
    private String nomeEvento;
    private int codEvento;
    private int codInscritos;
    private boolean presente = false;
    private String nome;
    private String cpf;
    private int codAluno;

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public int getCodEvento() {
        return codEvento;
    }

    public void setCodEvento(int codEvento) {
        this.codEvento = codEvento;
    }

    public int getCodInscritos() {
        return codInscritos;
    }

    public void setCodInscritos(int codInscritos) {
        this.codInscritos = codInscritos;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }
    
    public void cadastrar(String nome, String cpf, String nomeEvento, int codEvento, int codInscritos){
        setCodEvento(codEvento);
        setCodInscritos(codInscritos);
        setNomeEvento(nomeEvento);
        setCpf(cpf);
        setNome(nome);
    }
}
