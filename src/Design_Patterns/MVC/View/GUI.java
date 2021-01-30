package Design_Patterns.MVC.View;

import javax.swing.*;
import java.awt.*;

public class GUI {

    private JFrame window;
    private int width;
    private int height;


    public GUI(){
    }

    public void init(int width, int height, String title){
        window = new JFrame(title);
        window.setContentPane(new Container());
        window.getContentPane().setSize(this.width, this.height);
        window.setLayout(new GridLayout());
    }

    public void show(){
        window.setVisible(true);
    }

    public void hide(){
        window.setVisible(false);
    }






}