/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renderer;

import org.lwjgl.input.Keyboard;

/**
 *
 * @author KrishnaDasCharankatB
 */
public class Input {
   
  
     static void update(){
         
     }
    
     static boolean  isKeyPressed(int  key){
        boolean  isOkay =false;        
        if(Keyboard.isKeyDown(key))
        {
            isOkay=true;
        }
        return isOkay;
         
     }
     
    
}
