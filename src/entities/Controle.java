package entities;


import abstractClasses.Colleague;
import interfaces.Mediator;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo Moreira
 */
public class Controle implements Mediator{
    protected ArrayList<Colleague> colleagues;
    
    public Controle() {
        this.colleagues = new ArrayList<>();
    }
    
    public void addColleague(Colleague colleague){
        this.colleagues.add(colleague);
    }
    
    @Override
    public void enviar(String msg, Colleague colleague) {
        for(Colleague c : colleagues){
            if(c != colleague){
                c.receberMensagem(msg);
            }
        }
    }

    
    
}
