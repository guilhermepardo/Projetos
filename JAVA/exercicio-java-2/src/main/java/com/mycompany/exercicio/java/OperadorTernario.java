/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.java;

/**
 *
 * @author Aluno
 */
public class OperadorTernario {
    public static void main(String[] args) {
        Integer idade = 12;
        String sit = idade>=18 ? "Maior de idade" : "Menor de idade";
        System.out.println("Situação: " +sit);
    }
}
