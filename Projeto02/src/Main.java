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
public class Main {
    public static void main(String[] args) {
        for(int i=1; i<11;i++)
            new MeuThread("Multiplos de "+i,i,i*10).start();               
    }
}
