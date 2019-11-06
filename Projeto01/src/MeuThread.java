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
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Meu Thread: "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MeuThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
