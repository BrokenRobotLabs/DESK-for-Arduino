package com.desk.java;

import javax.swing.*;

import java.awt.*;

public class GUI extends JFrame{
    Variables vars = new Variables(null, this);
    ButtonActions button = new ButtonActions(this, null);
    Connections connect = new Connections(null, this);
    ArduinoConnections ard = new ArduinoConnections(this);
    MainFrame mf;
    public GUI(MainFrame in) {
        mf =in;
        setIconImage(Toolkit.getDefaultToolkit().getImage("desk-lamp.png"));
            setTitle("DESK for Arduino");
	    setSize(600, 700);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //button designs
	   JFrame frame = new JFrame("DESK for Arduino");
            vars.partSelector1.setSelectedIndex(0);
	    vars.partSelector2.setSelectedIndex(0);
	    vars.partSelector3.setSelectedIndex(0);
	    vars.partSelector4.setSelectedIndex(0);
            vars.partSelector5.setSelectedIndex(0);
	    vars.partSelector6.setSelectedIndex(0);
	    vars.partSelector7.setSelectedIndex(0);
	    vars.partSelector8.setSelectedIndex(0);
            vars.partSelector9.setSelectedIndex(0);
	    vars.partSelector10.setSelectedIndex(0);
	    vars.partSelector11.setSelectedIndex(0);
	    vars.partSelector12.setSelectedIndex(0);
            vars.partSelector13.setSelectedIndex(0);
	    vars.partSelector14.setSelectedIndex(0);
	    vars.partSelector15.setSelectedIndex(0);
	    vars.partSelector16.setSelectedIndex(0);
		vars.selectorPanel.add(vars.partSelector1);
		vars.selectorPanel.add(vars.partSelector2);
		vars.selectorPanel.add(vars.partSelector3);
		vars.selectorPanel.add(vars.partSelector4);
		vars.selectorPanel.add(vars.partSelector5);
		vars.selectorPanel.add(vars.partSelector6);
		vars.selectorPanel.add(vars.partSelector7);
		vars.selectorPanel.add(vars.partSelector8);
		vars.selectorPanel.add(vars.partSelector9);
		vars.selectorPanel.add(vars.partSelector10);
		vars.selectorPanel.add(vars.partSelector11);
		vars.selectorPanel.add(vars.partSelector12);
		vars.selectorPanel.add(vars.partSelector13);
		vars.selectorPanel.add(vars.partSelector14);
		vars.selectorPanel.add(vars.partSelector15);
		vars.selectorPanel.add(vars.partSelector16);
            vars.outsidePanel.setLayout(new BorderLayout());
            vars.runButtonsPanel.setLayout(new FlowLayout());
		vars.circuitPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
				
                //(0,0)
		c.gridx = 0;	c.gridy = 0;
		vars.circuitPanel.add(vars.paneLabel11, c);
		
                //(1,0)
		c.gridx = 1;	c.gridy = 0;
		vars.circuitPanel.add(vars.button11,c);
		
                //(2,0)
		c.gridx = 2;	c.gridy = 0;
		vars.circuitPanel.add(vars.paneLabel12, c);
                //(3,0)
		c.gridx = 3;	c.gridy = 0;
		vars.circuitPanel.add(vars.button12,c);
                //(4,0)
		c.gridx = 4;	c.gridy = 0;
		vars.circuitPanel.add(vars.paneLabel13, c);
		//(5,0)
		c.gridx = 5;	c.gridy = 0;
		vars.circuitPanel.add(vars.button13, c);
		//(6,0)
		c.gridx = 6;	c.gridy = 0;
		vars.circuitPanel.add(vars.paneLabel14, c);
		//(0,1)
		c.gridx = 0;	c.gridy = 1;
		vars.circuitPanel.add(vars.button21, c);
		//(2,1)
		c.gridx = 2;	c.gridy = 1;
		vars.circuitPanel.add(vars.button22, c);
                //(4,1)
		c.gridx = 4;	c.gridy = 1;
		vars.circuitPanel.add(vars.button23,c);
                //(6,1)
                c.gridx=6; c.gridy=1;
                vars.circuitPanel.add(vars.button24,c);
                //(0,2)
                c.gridx=0; c.gridy=2;
                vars.circuitPanel.add(vars.paneLabel21,c);
                //(1,2)
                c.gridx=1; c.gridy=2;
                vars.circuitPanel.add(vars.button31,c);
                //(2,2)
                c.gridx=2; c.gridy=2;
                vars.circuitPanel.add(vars.paneLabel22,c);
                //(3,2)
                c.gridx=3; c.gridy=2;
                vars.circuitPanel.add(vars.button32,c);
                //4,2
                c.gridx=4; c.gridy=2;
                vars.circuitPanel.add(vars.paneLabel23,c);
                //5,2
                c.gridx=5; c.gridy=2;
                vars.circuitPanel.add(vars.button33,c);
                //6,2
                c.gridx=6; c.gridy=2;
                vars.circuitPanel.add(vars.paneLabel24,c);
                //0,3
                c.gridx=0; c.gridy=3;
                vars.circuitPanel.add(vars.button41,c);
                //2,3
                c.gridx=2; c.gridy=3;
                vars.circuitPanel.add(vars.button42,c);
                //4,3
                c.gridx=4; c.gridy=3;
                vars.circuitPanel.add(vars.button43,c);
                //6,3
                c.gridx=6; c.gridy=3;
                vars.circuitPanel.add(vars.button44,c);
                //0,4
                c.gridx=0; c.gridy=4;
                vars.circuitPanel.add(vars.paneLabel31,c);
                //1,4
                c.gridx=1; c.gridy=4;
                vars.circuitPanel.add(vars.button51,c);
                //2,4
                c.gridx=2; c.gridy=4;
                vars.circuitPanel.add(vars.paneLabel32,c);
                //3,4
                c.gridx=3; c.gridy=4;
                vars.circuitPanel.add(vars.button52,c);
                //4,4
                c.gridx=4; c.gridy=4;
                vars.circuitPanel.add(vars.paneLabel33,c);
                //5,4
                c.gridx=5; c.gridy=4;
                vars.circuitPanel.add(vars.button53,c);
                //6,4
                c.gridx=6; c.gridy=4;
                vars.circuitPanel.add(vars.paneLabel34,c);
                //0,5
                c.gridx=0; c.gridy=5;
                vars.circuitPanel.add(vars.button61,c);
                //2,5
                c.gridx=2; c.gridy=5;
                vars.circuitPanel.add(vars.button62,c);
                //4,5
                c.gridx=4; c.gridy=5;
                vars.circuitPanel.add(vars.button63,c);
                //6,5
                c.gridx=6; c.gridy=5;
                vars.circuitPanel.add(vars.button64,c);
                //0,6
                c.gridx=0; c.gridy=6;
                vars.circuitPanel.add(vars.paneLabel41,c);
                //1,6
                c.gridx=1; c.gridy=6;
                vars.circuitPanel.add(vars.button71,c);
                //2,6
                c.gridx=2; c.gridy=6;
                vars.circuitPanel.add(vars.paneLabel42,c);
                //3,6
                c.gridx=3; c.gridy=6;
                vars.circuitPanel.add(vars.button72,c);
                //4,6
                c.gridx=4; c.gridy=6;
                vars.circuitPanel.add(vars.paneLabel43,c);
                //5,6
                c.gridx=5; c.gridy=6;
                vars.circuitPanel.add(vars.button73,c);
                //6,6
                c.gridx=6; c.gridy=6;
                vars.circuitPanel.add(vars.paneLabel44,c);
                
                vars.runButtonsPanel.add(vars.run);
                vars.runButtonsPanel.add(vars.stop);
                vars.runButtonsPanel.add(vars.check);
                vars.runButtonsPanel.add(vars.clear);
                
                vars.tutorialPanel.add(vars.tutorial);
                vars.outsidePanel.add(vars.circuitPanel, BorderLayout.CENTER);
                vars.outsidePanel.add(vars.runButtonsPanel, BorderLayout.SOUTH);
		vars.tabbedPane.addTab("Circuit Viewer",vars.outsidePanel);
		vars.tabbedPane.addTab("Part Selector",vars.selectorPanel);
                vars.tabbedPane.addTab("Tutorials and Quickstart",vars.tutorialPanel);
		add(vars.tabbedPane);
                button.buttons();
		setVisible(true);
        }
    public static void main(String[] args){
        GUI frame = new GUI(null);
    }
}