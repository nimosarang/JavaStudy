package kosta.oop3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends Frame implements ActionListener, WindowListener { // Frame 버튼 구현

    public MyFrame(){
        Button b = new Button("button");
        add(b);
        b.addActionListener(this);
        addWindowListener(this);

        setSize(300, 200);
        setLocation(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) { //버튼을 클릭할때마다 이벤트를 해보자
        Button b = (Button) e.getSource();
        String label = b.getLabel();
        System.out.println(label + "선택함");

    }


    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
