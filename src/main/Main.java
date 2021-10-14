package main;


import entities.Controle;
import entities.ColleagueB;
import entities.ColleagueC;
import entities.ColleagueA;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo Moreira
 */
public class Main {
    public static void main(String[] args) {
        Controle c = new Controle();
        
        ColleagueA ca = new ColleagueA(c);
        ColleagueB cb = new ColleagueB(c);
        ColleagueC cc = new ColleagueC(c);
        
        c.addColleague(ca);
        c.addColleague(cb);
        c.addColleague(cc);
        
        ca.enviarMensagem("Olá mundo");
        System.out.println("");
        System.out.println("");
        cb.enviarMensagem("Estou aqui!");
        System.out.println("");
        System.out.println("");
        cc.enviarMensagem("Como é incrivel o padrão mediator!");
        
    }
}
