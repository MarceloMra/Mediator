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
public class ColleagueC extends Colleague{

    public ColleagueC(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Colleague C recebeu a msg!");
        System.out.println("MSG: "+mensagem);
        System.out.println("Servidor ativado");
    }
    
}
