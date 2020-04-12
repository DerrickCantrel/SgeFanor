package br.com.entidades;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Atividade {
    
    private String tipo;
    private String tema;
    private String local;
    private String descricao;
    
    private Date data;
    private Date horas;
    
    private int vagasMax;
    private int vagasMin;
    
    private RespAtividade respAtividade;
    private ArrayList<Participante> participantes;
    private ArrayList<Participante> espera;
    
    public Atividade(){
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHoras() {
        return horas;
    }

    public void setHoras(Date horas) {
        this.horas = horas;
    }

    public int getVagasMax() {
        return vagasMax;
    }

    public void setVagasMax(int vagasMax) {
        this.vagasMax = vagasMax;
    }

    public int getVagasMin() {
        return vagasMin;
    }

    public void setVagasMin(int vagasMin) {
        this.vagasMin = vagasMin;
    }

    public RespAtividade getRespAtividade() {
        return respAtividade;
    }

    public void setRespAtividade(RespAtividade respAtividade) {
        this.respAtividade = respAtividade;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public ArrayList<Participante> getEspera() {
        return espera;
    }

    public void setEspera(ArrayList<Participante> espera) {
        this.espera = espera;
    }
    
    
    
    
    
    
    
    
}
