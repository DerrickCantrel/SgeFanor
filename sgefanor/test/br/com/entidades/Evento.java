package br.com.entidades;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "cidade")
@NamedQueries({
    @NamedQuery(name = "Evento.todos", query = "SELECT c FROM Evento c")})
public class Evento {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Local")
    private String local;
    @Column(name = "Descrição")
    private String descricao;
    @Column(name = "Data Inicial")
    private Date datainicio;
     @Column(name = "Data Final")
    private Date datafim;
     @Column(name= "Hora")
    private Date horas;
    
    private RespGeral respGeral;
    
    private ArrayList <Atividade> atividades;
    
    public Evento(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Date getDataInicio() {
        return datainicio;
    }

    public void setDataInicio(Date datainicio) {
        this.datainicio = datainicio;
    }
    public Date getDataFim() {
        return datafim;
    }

    public void setDataFim(Date datafim) {
        this.datafim = datafim;
    }

    public Date getHoras() {
        return horas;
    }

    public void setHoras(Date horas) {
        this.horas = horas;
    }

    public RespGeral getRespGeral() {
        return respGeral;
    }

    public void setRespGeral(RespGeral respGeral) {
        this.respGeral = respGeral;
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(ArrayList<Atividade> atividades) {
        this.atividades = atividades;
    }
    
    
    
    

   
}
