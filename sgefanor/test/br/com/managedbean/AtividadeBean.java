package br.com.managedbean;

import br.com.dao.DaoGenerico;
import br.com.entidades.Atividade;

public class AtividadeBean {
    
    private Atividade atividade = new Atividade();
 
    private DaoGenerico<Atividade> dao = new DaoGenerico<Atividade>();
    
    public void salvar(){
        dao.salvar(atividade);
        atividade = new Atividade();
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
    
    
    
}
