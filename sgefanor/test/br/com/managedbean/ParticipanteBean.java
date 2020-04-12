package br.com.managedbean;

import br.com.dao.DaoGenerico;
import br.com.entidades.Participante;

public class ParticipanteBean {
    
    private Participante participante = new Participante();
    
    private DaoGenerico<Participante> dao = new DaoGenerico<Participante>();
    
    public void salvar(){
        dao.salvar(participante);
        participante = new Participante();
    }
    
    
}
