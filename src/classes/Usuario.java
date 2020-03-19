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
public class Usuario {
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    
    private String nome;
    private String cpf;
    private String senha;
    private boolean permissao = false;
    private int cod;

    public boolean isPermissao() {
        return permissao;
    }

    public void setPermissao(boolean permissao) {
        this.permissao = permissao;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public void cadastrar(String nome, String cpf, String senha, int cod, boolean permissao){
        setCod(cod);
        setCpf(cpf);
        setNome(nome);
        setSenha(senha);
        setPermissao(permissao);
    }

}
