/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Mari Bianchini
 */
public class MeuThread extends Thread{
    private String nome;
    private int multiplo, maximo;

    public MeuThread(String nome, int multiplo, int maximo) {
        this.nome = nome;
        this.multiplo = multiplo;
        this.maximo = maximo;
    }
    
    
    
    @Override
    public void run(){
        for(int i=multiplo; i<=maximo; i+=multiplo){
            System.out.println(nome+": "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MeuThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
