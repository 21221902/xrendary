/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renderer;

import org.lwjgl.input.Keyboard;

/**
 *
 * @author KrishnaDasCharankatBaiju
 */
class Game {
    
    
      Game(){
       UtilRender.setUpStates();
      }

    static void input() {
       
        
        if(Input.isKeyPressed(Keyboard.KEY_A))
         {
                   
         }
    }

    static void update() {
       
        
        
    }

    static void render() {
      UtilRender.clearScreen();
    }
    
}
