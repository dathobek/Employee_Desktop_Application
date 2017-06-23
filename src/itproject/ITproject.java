/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itproject;

/**
 *
 * @author David
 */
import sun.audio.*;
import java.io.*;
import javax.swing.JOptionPane;
public class ITproject {
    
    
    
    public static void music(){
        AudioPlayer mp=AudioPlayer.player;
        AudioStream bg;
        AudioData md;
        ContinuousAudioDataStream loop = null;
        
        try{
            bg=new AudioStream(new FileInputStream("Holes.mp3"));
            md = bg.getData();
            loop = new ContinuousAudioDataStream(md);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
        mp.start(loop);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
    }
    
}
