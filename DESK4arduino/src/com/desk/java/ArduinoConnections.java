package com.desk.java;



        
public class ArduinoConnections{
    GUI gui;
    public ArduinoConnections(GUI in){
        gui = in;
    }
    
    
    boolean buttonLEDComponentExists() {
        //System.out.println("Buttonled called");
       boolean findButton = gui.vars.partPath.contains("b");
       boolean findLED = gui.vars.partPath.contains("led");
       //System.out.println(findButton);
       return findButton && findLED;
    }

    boolean potLEDComponentExists() {
        //System.out.println("potLED Called");
        boolean findPot = gui.vars.partPath.contains("pot");
        boolean findLED = gui.vars.partPath.contains("led");
        //System.out.println(findPot + " , " + findLED);
        return findPot && findLED;
    }

    boolean buttonPotLEDComponentExists() {
        ////System.out.println("button pot led called");
        boolean findButton = gui.vars.partPath.contains("b");
        boolean findLED = gui.vars.partPath.contains("led");
        boolean findPot = gui.vars.partPath.contains("pot");
        return findButton && findLED && findPot;
    }

    boolean buttonNPNTransLEDExists() {
        boolean findButton = gui.vars.partPath.contains("b");
        boolean npnTrans = gui.vars.partPath.contains("npnt");
        boolean findLED = gui.vars.partPath.contains("led");
        return findButton && npnTrans;
    }
    
    boolean buttonPNPTransLEDExists(){
        boolean findButton = gui.vars.partPath.contains("b");
        boolean pnpTrans = gui.vars.partPath.contains("pnpt");
        boolean findLED = gui.vars.partPath.contains("led");
        return findButton && pnpTrans;
    }
    
    boolean potNPNTransLEDExists(){
        boolean findPot = gui.vars.partPath.contains("pot");
        boolean npnTrans = gui.vars.partPath.contains("npnt");
        boolean findLED = gui.vars.partPath.contains("led");
        return findPot && npnTrans && findLED;
    }
    
    boolean potPNPTransLEDExists(){
        boolean findPot = gui.vars.partPath.contains("pot");
        boolean pnpTrans = gui.vars.partPath.contains("pnpt");
        boolean findLED = gui.vars.partPath.contains("led");
        return findPot && findLED && pnpTrans;
    }

    boolean ldrLEDExists() {
        boolean findldr = gui.vars.partPath.contains("ldr");
        boolean findLED = gui.vars.partPath.contains("led");
        return findldr && findLED;
    }

    boolean ldrNPNLEDExists() {
        boolean findldr = gui.vars.partPath.contains("ldr");
        boolean findLED = gui.vars.partPath.contains("led");
        boolean npnTrans = gui.vars.partPath.contains("npnt");
        return findldr && findLED && npnTrans;
    }

    boolean ldrPNPLEDExists() {
        boolean findldr = gui.vars.partPath.contains("ldr");
        boolean findLED = gui.vars.partPath.contains("led");
        boolean pnpTrans = gui.vars.partPath.contains("pnpt");
        return findldr && findLED && pnpTrans;
    }

    boolean ldrButtonLEDExists() {
        boolean findButton = gui.vars.partPath.contains("b");
        boolean findldr = gui.vars.partPath.contains("ldr");
        boolean findLED = gui.vars.partPath.contains("led");
        return findButton && findldr && findLED;
    }

    boolean btnPotNPNLEDExists() {
        boolean pot = gui.vars.partPath.contains("pot");
        boolean btn = gui.vars.partPath.contains("b");
        boolean npn = gui.vars.partPath.contains("npnt");
        boolean led = gui.vars.partPath.contains("led");
        return pot && btn && npn && led;
    }

    boolean btnPotPNPLEDExists() {
        boolean pot = gui.vars.partPath.contains("pot");
        boolean btn = gui.vars.partPath.contains("b");
        boolean pnp = gui.vars.partPath.contains("pnpt");
        boolean led = gui.vars.partPath.contains("led");
        return pot && btn && pnp && led;
    }

    boolean ldrbtnLEDExists() {
        boolean ldr = gui.vars.partPath.contains("ldr");
        boolean btn = gui.vars.partPath.contains("b");
        boolean led = gui.vars.partPath.contains("led");
        return ldr && btn && led;
    }

    boolean ldrbtnNPNLEDExists() {
        boolean findldr = gui.vars.partPath.contains("ldr");
        boolean findLED = gui.vars.partPath.contains("led");
        boolean npnTrans = gui.vars.partPath.contains("npnt");
        boolean btn = gui.vars.partPath.contains("b");
        return findldr && findLED && npnTrans && btn;
    }
    
    boolean ldrbtnPNPLEDExists(){
        boolean findldr = gui.vars.partPath.contains("ldr");
        boolean findLED = gui.vars.partPath.contains("led");
        boolean pnpTrans = gui.vars.partPath.contains("pnpt");
        boolean btn = gui.vars.partPath.contains("b");
        return findldr && findLED && pnpTrans && btn;
    }
}