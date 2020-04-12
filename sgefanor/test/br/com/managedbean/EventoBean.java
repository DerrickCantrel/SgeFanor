package br.com.managedbean;

import br.com.dao.DaoGenerico;
import br.com.entidades.Evento;
import javax.enterprise.context.RequestScoped;
import javax.annotation.ManagedBean;

@ManagedBean
@RequestScoped
public class EventoBean {
    
    private Evento evento = new Evento();
    private DaoGenerico<Evento> daoGenerico = new DaoGenerico<Evento>();
    
    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    
    
    public void salvar(){
        evento = daoGenerico.merge(evento);
    }
    
    public void deletar(){
        daoGenerico.deletar(evento);
    }
}
    
    
    
    

 
