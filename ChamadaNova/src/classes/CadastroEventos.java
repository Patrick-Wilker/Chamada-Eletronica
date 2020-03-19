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
public class CadastroEventos {
   
    public static ArrayList<CadastroEventos> eventos = new ArrayList<>();
    
    //ArrayList<ArrayList<String>> ListNome = new ArrayList<>();

    
    private String data;
    private String horaInicio;
    private String horaFim;
    private String nome;
    private int codigo;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   /* public ArrayList<ArrayList<String>> getListNome() {
        return ListNome;
    }

    public void setListNome(ArrayList<ArrayList<String>> ListNome) {
        this.ListNome = ListNome;
    }*/
    
    

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void cadastrar(String nome, String data, String hora, String horaFim, int codigo){
        setData(data);
        setHoraInicio(hora);
        setHoraFim(horaFim);
        setNome(nome);
        setCodigo(codigo);
    }
}
