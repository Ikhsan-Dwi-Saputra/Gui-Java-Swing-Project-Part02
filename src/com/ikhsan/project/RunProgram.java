package com.ikhsan.project;

import javax.swing.*;

public class RunProgram {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Program Sorting Bubble Sort");
        jFrame.setContentPane(new ProgramBubbleSort().getBasepanel()) ;
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 420);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.show();

        ImageIcon logo = new ImageIcon("800px_COLOURBOX29595917.jpg");
        jFrame.setIconImage(logo.getImage());
    }
}
