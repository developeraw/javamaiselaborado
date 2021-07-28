/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamaiselaborado;

/**
 *
 * @author wolf
 */
public abstract class Metodos {
    
    public Metodos() {
        System.out.println("pelo construtor");
        fazAlgo();
    }
    
    public void fazAlgo() {
        System.out.println("Chamado pelo faz algo");
        maisUmaCoisa();
    }
    
    public abstract void maisUmaCoisa();
    
}
