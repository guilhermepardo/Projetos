/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.swing;

import java.awt.Color;
import java.util.Random;
import javax.swing.text.StyleConstants;

/**
 *
 * @author Aluno
 */
public class BarraDeProgresso {
    Random Gerador = new Random();
    Integer barraDeProgresso = Gerador.nextInt(100)+1;
    
    public int valorBarra() {
        return barraDeProgresso;
    } 
    
    public void Condicao() {
        if (barraDeProgresso > 0 && barraDeProgresso <= 20) {
            
        }
    }
}
