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
public class ColleagueA extends Colleague{

    public ColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Colleague A recebeu a msg!");
        System.out.println("MSG: "+mensagem);
    }
    
}
