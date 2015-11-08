/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renderer;
import org.lwjgl.opengl.GL11;
import static org.lwjgl.opengl.GL11.*;
/**
 *
 * @author KrishnaDasCharankatB
 */
public class UtilRender {
    
   private UtilRender(){};
   
   static void setUpStates(){
      glEnable(GL_TEXTURE_2D);
      glEnable(GL_CULL_FACE);
      glEnable(GL_BACK);
       
   }
   
   static void clearScreen(){
     glClearColor(0.00f, 0.11f, 0.61f, 1.0f);
     glClear(GL_COLOR_BUFFER_BIT);
       
   }
    
}
