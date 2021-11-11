package ru.gb.KLD_PRO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


    public class MyButtons extends JPanel {

        private JButton NewGame, Ex;
        private MyPanel Butr;

        public void SetObject(MyPanel B) {
            Butr = B;
        }

        MyButtons() {
            setLayout(new FlowLayout());
            NewGame = new JButton("Новая игра");
            Ex = new JButton("Выход");
            NewGame.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    Butr.Rese();
                }
            });
            Ex.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    System.exit(0);
                }
            });
            add(NewGame);
            add(Ex);
        }
}

