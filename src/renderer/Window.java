/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renderer;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;


/**
 *
 * @author KrishnaDasCharankatB
 */
public class Window {
 final  static int Height = 600;
 final static int Width= 800;
    
Window(){
    
    try {
        create("Game",Width,Height);
    } catch (LWJGLException ex) {
        Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
    }
}
   
 private  void create(String title,int width, int height)  throws LWJGLException
    {
        
              Display.setDisplayMode(new DisplayMode(width, height));
              Display.setFullscreen(false);
              Display.setTitle(title);
              Display.create();
              Mouse.setGrabbed(false);
              Mouse.create();
              Keyboard.create();
   
    }
 
 
 
 

     
public void dispose() {
    //Methods already check if created before destroying.
    Mouse.destroy();
    Keyboard.destroy();
    Display.destroy();
  }
public boolean isCloseRequest(){
    
    return Display.isCloseRequested();
}

  public void run()
  {
      while(!isCloseRequest())
      {
          Input.update();// keep track of inputs 
          if(Display.isVisible()){
            Game.input();//get user input into game
            Game.update();//process game data
            Game.render();//draw the game
          }
           if(Display.isDirty()) {
             Game.render();
           }
          
             
        Display.update();
      }
      //Display.update();
  }
    public static void main(String[] args) {
        
        new Window().run();
     
    }
    
}
