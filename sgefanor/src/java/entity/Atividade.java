package entity;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "atividade")
public class Atividade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "tipo", length = 70, nullable = false)
    private String tipo;
    
    @Column(name = "tema", length = 250, nullable = false)
    private String tema;
    
    @Column(name = "data", nullable = false)
    private Date data;
    
    @Column(name = "hora", nullable = false)
    private Date hora;
    
    @Column(name = "local", length = 200, nullable = false)
    private String local;
    
    @Column(name = "vagas_min", nullable = false)
    private int vagasMin;
    
    @Column(name = "vagas_max", nullable = false)
    private int vagasMax;
    
    @Column(name = "resp_geral", nullable = false)
    private RespAtividade respAtividade;
    
    @Column(name = "participantes", nullable = false)
    private ArrayList<Participante> participantes;
    
    @Column(name = "espera")
    private ArrayList<Participante> espera;

    public Atividade(Long id, String tipo, String tema, Date data, Date hora,
            String local, int vagasMin, int vagasMax, RespAtividade respAtividade) {
        
        this.id = id;
        this.tipo = tipo;
        this.tema = tema;
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.vagasMin = vagasMin;
        this.vagasMax = vagasMax;
        this.respAtividade = respAtividade;
        
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getVagasMin() {
        return vagasMin;
    }

    public void setVagasMin(int vagasMin) {
        this.vagasMin = vagasMin;
    }

    public int getVagasMax() {
        return vagasMax;
    }

    public void setVagasMax(int vagasMax) {
        this.vagasMax = vagasMax;
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
