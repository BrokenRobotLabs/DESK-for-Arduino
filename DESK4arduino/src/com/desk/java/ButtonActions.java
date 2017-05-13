package com.desk.java;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonActions implements ActionListener{
	GUI gui;
        MainFrame mf;
	public ButtonActions(GUI in, MainFrame min){
		 gui = in;
		mf = min;
	}
	
	void buttons(){
	    gui.vars.partSelector2.addActionListener(new ActionListener() { 
                      @Override
	    	  public void actionPerformed(ActionEvent e) { 
	    		    partSelection(e);
	    		  }
			private void partSelection(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				gui.vars.partName2 = (String)cb.getSelectedItem();
				switch(gui.vars.partName2){
				case "Light Sensor": gui.vars.iconType2 = gui.vars.ldr;
				break;
				case "PNP Transistor": gui.vars.iconType2 = gui.vars.PNPtransistor;
				break;
				case "Potentiometer": gui.vars.iconType2 = gui.vars.pot;
				break;
				case "LED": gui.vars.iconType2 = gui.vars.led;
				break;
				case "---": gui.vars.iconType2 = gui.vars.blank;
				break;
				case "NPN Transistor": gui.vars.iconType2 = gui.vars.NPNtransistor;
				break;
				case "Wire": gui.vars.iconType2 = gui.vars.wire;
				break;
				case "Button": gui.vars.iconType2 = gui.vars.button;
				break;
				}
				gui.vars.paneLabel12.setIcon(gui.vars.iconType2);
			} 
	    		});
	    gui.vars.partSelector3.addActionListener(new ActionListener() { 
                      @Override
	    	  public void actionPerformed(ActionEvent e) { 
	    		    partSelection(e);
	    		  }
			private void partSelection(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				gui.vars.partName3 = (String)cb.getSelectedItem();
				switch(gui.vars.partName3){
				case "Light Sensor": gui.vars.iconType3 = gui.vars.ldr;
				break;
				case "PNP Transistor": gui.vars.iconType3 = gui.vars.PNPtransistor;
				break;
				case "Potentiometer": gui.vars.iconType3 = gui.vars.pot;
				break;
				case "LED": gui.vars.iconType3 = gui.vars.led;
				break;
				case "---": gui.vars.iconType3 = gui.vars.blank;
				break;
				case "NPN Transistor": gui.vars.iconType3 = gui.vars.NPNtransistor;
				break;
				case "Wire": gui.vars.iconType3 = gui.vars.wire;
				break;
				case "Button": gui.vars.iconType3 = gui.vars.button;
				break;
				}
				gui.vars.paneLabel13.setIcon(gui.vars.iconType3);
			} 
	    		});
            gui.vars.partSelector5.addActionListener(new ActionListener() { 
                      @Override
	    	  public void actionPerformed(ActionEvent e) { 
	    		    partSelection(e);
	    		  }
			private void partSelection(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				gui.vars.partName5 = (String)cb.getSelectedItem();
				switch(gui.vars.partName5){
				case "Light Sensor": gui.vars.iconType5 = gui.vars.ldr;
				break;
				case "PNP Transistor": gui.vars.iconType5 = gui.vars.PNPtransistor;
				break;
				case "Potentiometer": gui.vars.iconType5 = gui.vars.pot;
				break;
				case "LED": gui.vars.iconType5 = gui.vars.led;
				break;
				case "---": gui.vars.iconType5 = gui.vars.blank;
				break;
				case "NPN Transistor": gui.vars.iconType5 = gui.vars.NPNtransistor;
				break;
				case "Wire": gui.vars.iconType5 = gui.vars.wire;
				break;
				case "Button": gui.vars.iconType5 = gui.vars.button;
				break;
				}
				gui.vars.paneLabel21.setIcon(gui.vars.iconType5);
			} 
	    		});
            gui.vars.partSelector6.addActionListener(new ActionListener() { 
                      @Override
	    	  public void actionPerformed(ActionEvent e) { 
	    		    partSelection(e);
	    		  }
			private void partSelection(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				gui.vars.partName6 = (String)cb.getSelectedItem();
				switch(gui.vars.partName6){
				case "Light Sensor": gui.vars.iconType6 = gui.vars.ldr;
				break;
				case "PNP Transistor": gui.vars.iconType6 = gui.vars.PNPtransistor;
				break;
				case "Potentiometer": gui.vars.iconType6 = gui.vars.pot;
				break;
				case "LED": gui.vars.iconType6 = gui.vars.led;
				break;
				case "---": gui.vars.iconType6 = gui.vars.blank;
				break;
				case "NPN Transistor": gui.vars.iconType6 = gui.vars.NPNtransistor;
				break;
				case "Wire": gui.vars.iconType6 = gui.vars.wire;
				break;
				case "Button": gui.vars.iconType6 = gui.vars.button;
				break;
				}
				gui.vars.paneLabel22.setIcon(gui.vars.iconType6);
			} 
	    		});
            gui.vars.partSelector7.addActionListener(new ActionListener() { 
                      @Override
	    	  public void actionPerformed(ActionEvent e) { 
	    		    partSelection(e);
	    		  }
			private void partSelection(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				gui.vars.partName7 = (String)cb.getSelectedItem();
				switch(gui.vars.partName7){
				case "Light Sensor": gui.vars.iconType7 = gui.vars.ldr;
				break;
				case "PNP Transistor": gui.vars.iconType7 = gui.vars.PNPtransistor;
				break;
				case "Potentiometer": gui.vars.iconType7 = gui.vars.pot;
				break;
				case "LED": gui.vars.iconType7 = gui.vars.led;
				break;
				case "---": gui.vars.iconType7 = gui.vars.blank;
				break;
				case "NPN Transistor": gui.vars.iconType7 = gui.vars.NPNtransistor;
				break;
				case "Wire": gui.vars.iconType7 = gui.vars.wire;
				break;
				case "Button": gui.vars.iconType7 = gui.vars.button;
				break;
				}
				gui.vars.paneLabel23.setIcon(gui.vars.iconType7);
			} 
	    		});
            gui.vars.partSelector8.addActionListener(new ActionListener() { 
                      @Override
	    	  public void actionPerformed(ActionEvent e) { 
	    		    partSelection(e);
	    		  }
			private void partSelection(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				gui.vars.partName8 = (String)cb.getSelectedItem();
				switch(gui.vars.partName8){
				case "Light Sensor": gui.vars.iconType8 = gui.vars.ldr;
				break;
				case "PNP Transistor": gui.vars.iconType8 = gui.vars.PNPtransistor;
				break;
				case "Potentiometer": gui.vars.iconType8 = gui.vars.pot;
				break;
				case "LED": gui.vars.iconType8 = gui.vars.led;
				break;
				case "---": gui.vars.iconType8 = gui.vars.blank;
				break;
				case "NPN Transistor": gui.vars.iconType8 = gui.vars.NPNtransistor;
				break;
				case "Wire": gui.vars.iconType8 = gui.vars.wire;
				break;
				case "Button": gui.vars.iconType8 = gui.vars.button;
				break;
				}
				gui.vars.paneLabel24.setIcon(gui.vars.iconType8);
			} 
	    		});
            gui.vars.partSelector9.addActionListener(new ActionListener() { 
                      @Override
	    	  public void actionPerformed(ActionEvent e) { 
	    		    partSelection(e);
	    		  }
			private void partSelection(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				gui.vars.partName9 = (String)cb.getSelectedItem();
				switch(gui.vars.partName9){
				case "Light Sensor": gui.vars.iconType9 = gui.vars.ldr;
				break;
				case "PNP Transistor": gui.vars.iconType9 = gui.vars.PNPtransistor;
				break;
				case "Potentiometer": gui.vars.iconType9 = gui.vars.pot;
				break;
				case "LED": gui.vars.iconType9 = gui.vars.led;
				break;
				case "---": gui.vars.iconType9 = gui.vars.blank;
				break;
				case "NPN Transistor": gui.vars.iconType9 = gui.vars.NPNtransistor;
				break;
				case "Wire": gui.vars.iconType9 = gui.vars.wire;
				break;
				case "Button": gui.vars.iconType9 = gui.vars.button;
				break;
				} gui.vars.paneLabel31.setIcon(gui.vars.iconType9); }  } );
	    gui.vars.partSelector10.addActionListener(new ActionListener() { 
                      @Override
	    	  public void actionPerformed(ActionEvent e) { 
	    		    partSelection(e);
	    		  }
			private void partSelection(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				gui.vars.partName10 = (String)cb.getSelectedItem();
				switch(gui.vars.partName10){
				case "Light Sensor": gui.vars.iconType10 = gui.vars.ldr;
				break;
				case "PNP Transistor": gui.vars.iconType10 = gui.vars.PNPtransistor;
				break;
				case "Potentiometer": gui.vars.iconType10 = gui.vars.pot;
				break;
				case "LED": gui.vars.iconType10 = gui.vars.led;
				break;
				case "---": gui.vars.iconType10 = gui.vars.blank;
				break;
				case "NPN Transistor": gui.vars.iconType10 = gui.vars.NPNtransistor;
				break;
				case "Wire": gui.vars.iconType10 = gui.vars.wire;
				break;
				case "Button": gui.vars.iconType10 = gui.vars.button;
				break;
				}
				gui.vars.paneLabel32.setIcon(gui.vars.iconType10);
			} 
	    		});
	    gui.vars.partSelector11.addActionListener(new ActionListener() { 
                      @Override
	    	  public void actionPerformed(ActionEvent e) { 
	    		    partSelection(e);
	    		  }
			private void partSelection(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				gui.vars.partName11 = (String)cb.getSelectedItem();
				switch(gui.vars.partName11){
				case "Light Sensor": gui.vars.iconType11 = gui.vars.ldr;
				break;
				case "PNP Transistor": gui.vars.iconType11 = gui.vars.PNPtransistor;
				break;
				case "Potentiometer": gui.vars.iconType11 = gui.vars.pot;
				break;
				case "LED": gui.vars.iconType11 = gui.vars.led;
				break;
				case "---": gui.vars.iconType11 = gui.vars.blank;
				break;
				case "NPN Transistor": gui.vars.iconType11 = gui.vars.NPNtransistor;
				break;
				case "Wire": gui.vars.iconType11 = gui.vars.wire;
				break;
				case "Button": gui.vars.iconType11 = gui.vars.button;
				break;
				}
				gui.vars.paneLabel33.setIcon(gui.vars.iconType11);
			} 
	    		});
	    gui.vars.partSelector12.addActionListener(new ActionListener() { 
                      @Override
	    	  public void actionPerformed(ActionEvent e) { 
	    		    partSelection(e);
	    		  }
			private void partSelection(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				gui.vars.partName12 = (String)cb.getSelectedItem();
				switch(gui.vars.partName12){
				case "Light Sensor": gui.vars.iconType12 = gui.vars.ldr;
				break;
				case "PNP Transistor": gui.vars.iconType12 = gui.vars.PNPtransistor;
				break;
				case "Potentiometer": gui.vars.iconType12 = gui.vars.pot;
				break;
				case "LED": gui.vars.iconType12 = gui.vars.led;
				break;
				case "---": gui.vars.iconType12 = gui.vars.blank;
				break;
				case "NPN Transistor": gui.vars.iconType12 = gui.vars.NPNtransistor;
				break;
				case "Wire": gui.vars.iconType12 = gui.vars.wire;
				break;
				case "Button": gui.vars.iconType12 = gui.vars.button;
				break;
				}
				gui.vars.paneLabel34.setIcon(gui.vars.iconType12);
			} 
	    		});
            gui.vars.partSelector13.addActionListener(new ActionListener() { 
                      @Override
	    	  public void actionPerformed(ActionEvent e) { 
	    		    partSelection(e);
	    		  }
			private void partSelection(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				gui.vars.partName13 = (String)cb.getSelectedItem();
				switch(gui.vars.partName13){
				case "Light Sensor": gui.vars.iconType13 = gui.vars.ldr;
				break;
				case "PNP Transistor": gui.vars.iconType13 = gui.vars.PNPtransistor;
				break;
				case "Potentiometer": gui.vars.iconType13 = gui.vars.pot;
				break;
				case "LED": gui.vars.iconType13 = gui.vars.led;
				break;
				case "---": gui.vars.iconType13 = gui.vars.blank;
				break;
				case "NPN Transistor": gui.vars.iconType13 = gui.vars.NPNtransistor;
				break;
				case "Wire": gui.vars.iconType13 = gui.vars.wire;
				break;
				case "Button": gui.vars.iconType13 = gui.vars.button;
				break;
				}
				gui.vars.paneLabel41.setIcon(gui.vars.iconType13);
			} 
	    		});
            gui.vars.partSelector14.addActionListener(new ActionListener() { 
                      @Override
	    	  public void actionPerformed(ActionEvent e) { 
	    		    partSelection(e);
	    		  }
			private void partSelection(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				gui.vars.partName14 = (String)cb.getSelectedItem();
				switch(gui.vars.partName14){
				case "Light Sensor": gui.vars.iconType14 = gui.vars.ldr;
				break;
				case "PNP Transistor": gui.vars.iconType14 = gui.vars.PNPtransistor;
				break;
				case "Potentiometer": gui.vars.iconType14 = gui.vars.pot;
				break;
				case "LED": gui.vars.iconType14 = gui.vars.led;
				break;
				case "---": gui.vars.iconType14 = gui.vars.blank;
				break;
				case "NPN Transistor": gui.vars.iconType14 = gui.vars.NPNtransistor;
				break;
				case "Wire": gui.vars.iconType14 = gui.vars.wire;
				break;
				case "Button": gui.vars.iconType14 = gui.vars.button;
				break;
				}
				gui.vars.paneLabel42.setIcon(gui.vars.iconType14);
			} 
	    		});
            gui.vars.partSelector15.addActionListener(new ActionListener() { 
                      @Override
	    	  public void actionPerformed(ActionEvent e) { 
	    		    partSelection(e);
	    		  }
			private void partSelection(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				gui.vars.partName15 = (String)cb.getSelectedItem();
				switch(gui.vars.partName15){
				case "Light Sensor": gui.vars.iconType15 = gui.vars.ldr;
				break;
				case "PNP Transistor": gui.vars.iconType15 = gui.vars.PNPtransistor;
				break;
				case "Potentiometer": gui.vars.iconType15 = gui.vars.pot;
				break;
				case "LED": gui.vars.iconType15 = gui.vars.led;
				break;
				case "---": gui.vars.iconType15 = gui.vars.blank;
				break;
				case "NPN Transistor": gui.vars.iconType15 = gui.vars.NPNtransistor;
				break;
				case "Wire": gui.vars.iconType15 = gui.vars.wire;
				break;
				case "Button": gui.vars.iconType15 = gui.vars.button;
				break;
				}
				gui.vars.paneLabel43.setIcon(gui.vars.iconType15);
			} 
	    		});
            gui.vars.partSelector16.addActionListener(new ActionListener() { 
                      @Override
	    	  public void actionPerformed(ActionEvent e) { 
	    		    partSelection(e);
	    		  }
			private void partSelection(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				gui.vars.partName16 = (String)cb.getSelectedItem();
				switch(gui.vars.partName16){
				case "Light Sensor": gui.vars.iconType16 = gui.vars.ldr;
				break;
				case "PNP Transistor": gui.vars.iconType16 = gui.vars.PNPtransistor;
				break;
				case "Potentiometer": gui.vars.iconType16 = gui.vars.pot;
				break;
				case "LED": gui.vars.iconType16 = gui.vars.led;
				break;
				case "---": gui.vars.iconType16 = gui.vars.blank;
				break;
				case "NPN Transistor": gui.vars.iconType16 = gui.vars.NPNtransistor;
				break;
				case "Wire": gui.vars.iconType16 = gui.vars.wire;
				break;
				case "Button": gui.vars.iconType16 = gui.vars.button;
				break;
				}
				gui.vars.paneLabel44.setIcon(gui.vars.iconType16);
			} 
	    		});
            
            
	    gui.vars.button11.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect1 == false){
                    gui.vars.button11.setIcon(gui.vars.connected);
                    gui.vars.connect1 = true;
                }else{
                    gui.vars.button11.setIcon(gui.vars.disconnected);
                    gui.vars.connect1 = false;
                }
                });
	    
	    gui.vars.button12.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect2 == false){
                    gui.vars.button12.setIcon(gui.vars.connected);
                    gui.vars.connect2 = true;
                }else{
                    gui.vars.button12.setIcon(gui.vars.disconnected);
                    gui.vars.connect2 = false;
                }
                });
	    
	    gui.vars.button13.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect3 == false){
                    gui.vars.button13.setIcon(gui.vars.connected);
                    gui.vars.connect3 = true;
                }else{
                    gui.vars.button13.setIcon(gui.vars.disconnected);
                    gui.vars.connect3 = false;
                }
                });
	    
	    gui.vars.button21.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect4 == false){
                    gui.vars.button21.setIcon(gui.vars.connected);
                    gui.vars.connect4 = true;
                }else{
                    gui.vars.button21.setIcon(gui.vars.disconnected);
                    gui.vars.connect4 = false;
                }
                });
            gui.vars.button22.addActionListener((ActionEvent e) ->{
                if(gui.vars.connect5 == false){
                    gui.vars.button22.setIcon(gui.vars.connected);
                    gui.vars.connect5 = true;
                }else{
                    gui.vars.button22.setIcon(gui.vars.disconnected);
                    gui.vars.connect5 = false;
                }
            });
            gui.vars.button23.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect6 == false){
                    gui.vars.button23.setIcon(gui.vars.connected);
                    gui.vars.connect6 = true;
                }else{
                    gui.vars.button23.setIcon(gui.vars.disconnected);
                    gui.vars.connect6 = false;
                }
            });
            gui.vars.button24.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect7 == false){
                    gui.vars.button24.setIcon(gui.vars.connected);
                    gui.vars.connect7 = true;
                }else{
                    gui.vars.button24.setIcon(gui.vars.disconnected);
                    gui.vars.connect7 = false;
                }
            });
            gui.vars.button31.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect8 == false){
                    gui.vars.button31.setIcon(gui.vars.connected);
                    gui.vars.connect8 = true;
                }else{
                    gui.vars.button31.setIcon(gui.vars.disconnected);
                    gui.vars.connect8 = false;
                }
            });
            gui.vars.button32.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect9 == false){
                    gui.vars.button32.setIcon(gui.vars.connected);
                    gui.vars.connect9 = true;
                }else{
                    gui.vars.button32.setIcon(gui.vars.disconnected);
                    gui.vars.connect9 = false;
                }
            });
            gui.vars.button33.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect10 == false){
                    gui.vars.button33.setIcon(gui.vars.connected);
                    gui.vars.connect10 = true;
                }else{
                    gui.vars.button33.setIcon(gui.vars.disconnected);
                    gui.vars.connect10 = false;
                }
            });
            gui.vars.button41.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect11 == false){
                    gui.vars.button41.setIcon(gui.vars.connected);
                    gui.vars.connect11 = true;
                }else{
                    gui.vars.button41.setIcon(gui.vars.disconnected);
                    gui.vars.connect11 = false;
                }
                });
	    
	    gui.vars.button42.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect12 == false){
                    gui.vars.button42.setIcon(gui.vars.connected);
                    gui.vars.connect12 = true;
                }else{
                    gui.vars.button42.setIcon(gui.vars.disconnected);
                    gui.vars.connect12 = false;
                }
                });
	    
	    gui.vars.button43.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect13 == false){
                    gui.vars.button43.setIcon(gui.vars.connected);
                    gui.vars.connect13 = true;
                }else{
                    gui.vars.button43.setIcon(gui.vars.disconnected);
                    gui.vars.connect13 = false;
                }
                });
	    
	    gui.vars.button44.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect14 == false){
                    gui.vars.button44.setIcon(gui.vars.connected);
                    gui.vars.connect14 = true;
                }else{
                    gui.vars.button44.setIcon(gui.vars.disconnected);
                    gui.vars.connect14 = false;
                }
                });
            gui.vars.button51.addActionListener((ActionEvent e) ->{
                if(gui.vars.connect15 == false){
                    gui.vars.button51.setIcon(gui.vars.connected);
                    gui.vars.connect15 = true;
                }else{
                    gui.vars.button51.setIcon(gui.vars.disconnected);
                    gui.vars.connect15 = false;
                }
            });
            gui.vars.button52.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect16 == false){
                    gui.vars.button52.setIcon(gui.vars.connected);
                    gui.vars.connect16 = true;
                }else{
                    gui.vars.button52.setIcon(gui.vars.disconnected);
                    gui.vars.connect16 = false;
                }
            });
            gui.vars.button53.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect17 == false){
                    gui.vars.button53.setIcon(gui.vars.connected);
                    gui.vars.connect17 = true;
                }else{
                    gui.vars.button53.setIcon(gui.vars.disconnected);
                    gui.vars.connect17 = false;
                }
            });
            gui.vars.button61.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect18 == false){
                    gui.vars.button61.setIcon(gui.vars.connected);
                    gui.vars.connect18 = true;
                }else{
                    gui.vars.button61.setIcon(gui.vars.disconnected);
                    gui.vars.connect18 = false;
                }
            });
            gui.vars.button62.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect19 == false){
                    gui.vars.button62.setIcon(gui.vars.connected);
                    gui.vars.connect19 = true;
                }else{
                    gui.vars.button62.setIcon(gui.vars.disconnected);
                    gui.vars.connect19 = false;
                }
            });
            gui.vars.button63.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect20 == false){ 
                    gui.vars.button63.setIcon(gui.vars.connected);
                    gui.vars.connect20 = true;
                }else{  
                    gui.vars.button63.setIcon(gui.vars.disconnected);
                    gui.vars.connect20 = false; 
                }
            });
            gui.vars.button64.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect21 == false){
                    gui.vars.button64.setIcon(gui.vars.connected);
                    gui.vars.connect21 = true;
                }else{
                    gui.vars.button64.setIcon(gui.vars.disconnected);
                    gui.vars.connect21 = false;
                }
            });
            gui.vars.button71.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect22 == false){
                    gui.vars.button71.setIcon(gui.vars.connected);
                    gui.vars.connect22 = true;
                }else{
                    gui.vars.button71.setIcon(gui.vars.disconnected);
                    gui.vars.connect22 = false;
                }
            });
            gui.vars.button72.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect23 == false){
                    gui.vars.button72.setIcon(gui.vars.connected);
                    gui.vars.connect23 = true;
                }else{
                    gui.vars.button72.setIcon(gui.vars.disconnected);
                    gui.vars.connect23 = false;
                }
            });
            gui.vars.button73.addActionListener((ActionEvent e) -> {
                if(gui.vars.connect24 == false){
                    gui.vars.button73.setIcon(gui.vars.connected);
                    gui.vars.connect24 = true;
                }else{
                    gui.vars.button73.setIcon(gui.vars.disconnected);
                    gui.vars.connect24 = false;
                }
                
            });
            
           
            gui.vars.run.addActionListener((ActionEvent e) -> {
                if(e.getActionCommand().equals("Run")){
                    gui.vars.runConnect = true;
                    gui.connect.connections();
                }
            });
            gui.vars.stop.addActionListener((ActionEvent e) -> {
                if(e.getActionCommand().equals("Stop")){
                    gui.connect.stop();
                }
            });
            gui.vars.check.addActionListener((ActionEvent e) -> {
                if(e.getActionCommand().equals("Check")){
                    gui.vars.runConnect = false;
                    gui.connect.connections();
                }
            });
            gui.vars.clear.addActionListener((ActionEvent e) -> {
                if(e.getActionCommand().equals("Clear")){
                    gui.connect.clear();
                }
            });
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
