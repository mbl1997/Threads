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
public class MeuRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("MeuRunnable: "+i);
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MeuRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
