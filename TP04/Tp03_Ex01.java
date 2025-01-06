package TP04;


import javax.swing.*;
import java.awt.*;

public class Tp03_Ex01 extends JFrame {
    JMenu normalMenu, radioMenu, checkMenu;
    JMenuItem new1, open;
    JRadioButtonMenuItem radio1, radio2;
    JCheckBoxMenuItem check1, check2;
    JMenuBar mainMenu;
    Container ContentPane;
    ButtonGroup group;

    Tp03_Ex01() {
        super("JMenu Demo");
        normalMenu = new JMenu("Normal Menu");
        radioMenu = new JMenu("Radio Menu");
        checkMenu = new JMenu("Check Menu");
        new1 = new JMenuItem("New...");
        open = new JMenuItem("Open...");
        open.setMnemonic('O');
        normalMenu.add(new1);
        normalMenu.add(new JSeparator());
        normalMenu.add(open);
        radio1 = new JRadioButtonMenuItem("First Radio Option");
        radio2 = new JRadioButtonMenuItem("Second Radio Option");
        group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        radioMenu.add(radio1);
        radioMenu.add(radio2);
        check1 = new JCheckBoxMenuItem("First Check Option");
        check2 = new JCheckBoxMenuItem("Second Check Option");
        checkMenu.add(check1);
        checkMenu.add(check2);
        mainMenu = new JMenuBar();
        mainMenu.add(normalMenu);
        mainMenu.add(radioMenu);
        mainMenu.add(checkMenu);
        ContentPane = getContentPane();
        ContentPane.add(mainMenu, BorderLayout.NORTH);
        setSize(400, 275);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Tp03_Ex01();
    }
}
