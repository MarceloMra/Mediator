package entities;


import abstractClasses.Colleague;
import interfaces.Mediator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo Moreira
 */
public class ColleagueB extends Colleague{

    public ColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Colleague B recebeu a msg!");
        System.out.println("MSG: "+mensagem);
        System.out.println("1+1=2");
    }
    
}
