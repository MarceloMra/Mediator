package interfaces;

import abstractClasses.Colleague;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo Moreira
 */
public interface Mediator {
    public void enviar(String msg, Colleague colleague);
}
