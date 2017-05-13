package com.desk.java;

import javax.swing.JOptionPane;


public class Connections{
    MainFrame mf;
    GUI gui;
    public Connections(MainFrame in, GUI min){
        mf = in;
        gui = min;
    }
    public void connections(){
        gui.vars.partPath = "";
        switch (checkConnection(gui.vars.connect1, gui.vars.connect4,false)) {
            case "con1":
                getPart2(2);
                //System.out.println("Power connected to part 2");
                break;
            case "con2":
                getPart5(1);
                //System.out.println("Power connected to part 5");
                break;
            case "con1&2":
                moreConnected("part2","part5",null);
                break;
            case "error":
                error("A part must be connected to check or run");
                break;
            default:
                break;
        }
    }
    
    private String checkConnection(boolean isConnected1, boolean isConnected2, boolean isConnected3){
        if((isConnected1 ^ isConnected2)^isConnected3){
            if(isConnected1){
                return "con1";
            }else if(isConnected2){
                return "con2";
            }else if(isConnected3){
                return "con3";
            }
        }else if(isConnected1 && isConnected2 || isConnected1 && isConnected3 || isConnected2 && isConnected3){
            if(isConnected1 && isConnected2){
                return "con1&2";
            }else if(isConnected1 && isConnected3){
                return "con1&3";
            }else if(isConnected2 && isConnected3){
               return "con2&3";
            }else if((isConnected1 && isConnected2) && isConnected3){
                return "con123";
            }
        }else{
            return "error";
        }
        return "";
    }
    
    public void error(String errorMessage){
        if(errorMessage == null){
            errorMessage = "An unknown error occurred, please try again later";
        }
        JOptionPane.showMessageDialog(gui,
        errorMessage,
        "Error",
        JOptionPane.ERROR_MESSAGE);
    }
    
    /*
            dir = 1\/
              [          ]
    dir = 2 > [          ] < dir = 4
              [          ]
            dir = 3/\
    
    
    [+]> [2]> [3]> [-]
    \/  /\\/ /\\/  /\
    [5]><[6]><[7]><[8]
    \/  /\\/ /\\/  /\
    [9]><[0]><[1]><[2]
    \/  /\\/ /\\/  /\
    [3]> [4]> [5]> [6]
    */
    //getPart1 is missing because it is always positive voltage
    public void getPart2(int dir){
        addPart(gui.vars.partName2);
        if(dir == 2){
            switch(checkConnection(gui.vars.connect2,gui.vars.connect5,false)) {
                case "con1":
                    getPart3(2);
                    //System.out.println("Part 2 to part 3");
                    break;
                case "con2":
                    getPart6(1);
                    //System.out.println("part 2 to part 6");
                    break;
                case "con1&2":
                    moreConnected("part3","part6","none");
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }else if(dir == 3){
            switch(checkConnection(gui.vars.connect2,false,false)) {
                case "con1":
                    getPart3(2);
                    //System.out.println("Part 2 to part 3");
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }
    }
    
    public void getPart3(int dir){
        addPart(gui.vars.partName3);
        if(dir == 2){
            switch(checkConnection(gui.vars.connect3,gui.vars.connect6,false)){
                case "con1":
                    connectedToGround();
                    //System.out.println("part 3 to ground");
                    break;
                case "con2":
                    getPart7(1);
                    //System.out.println("part 3 to 7");
                    break;
                case "con1&2":
                    moreConnected("Ground","part7","none");
                case "erorr":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }else if(dir == 3){
            switch(checkConnection(gui.vars.connect3,false,false)){
                case "con1":
                    connectedToGround();
                    //System.out.println("part 3 to ground");
                    break;
                case "erorr":
                    error("A part must be connected to ground");
                    break;
                default:
                    
                    break;
            }
        }
    }
    //getPart4 is missing because it is always ground
    public void getPart5(int dir){
        addPart(gui.vars.partName5);
        if(dir == 1){
            switch(checkConnection(gui.vars.connect8,gui.vars.connect11,false)){
                case "con1":
                    getPart6(2);
                    //System.out.println("part 5 to 6");
                    break;
                case "con2":
                    getPart9(1);
                    //System.out.println("part 5 to 9");
                    break;
                case "con1&2":
                    moreConnected("part6","part9","none");
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }else if(dir == 4){
            switch(checkConnection(gui.vars.connect8,false,false)){
                case "con1":
                    getPart9(1);
                    //System.out.println("part 5 to 9");
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }
    }
    
    public void getPart6(int dir){
        addPart(gui.vars.partName6);
        switch (dir) {
            case 1:
                switch(checkConnection(gui.vars.connect8,gui.vars.connect12,gui.vars.connect9)){
                    case "con1":
                        getPart5(4);
                        //System.out.println("6 to 5");
                        break;
                    case "con2":
                        getPart10(1);
                        //System.out.println("6 to 10");
                        break;
                    case "con3":
                        getPart7(2);
                        //System.out.println("6 to 7");
                        break;
                    case "con1&2":
                        moreConnected("part5","part10",null);
                        break;
                    case "con1&3":
                        moreConnected("part5",null,"part7");
                        break;
                    case "con2&3":
                        moreConnected(null,"part10","part7");
                        break;
                    case "con123":
                        moreConnected("part5","part10","part7");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            case 2:
                switch(checkConnection(gui.vars.connect5,gui.vars.connect12,gui.vars.connect9)){
                    case "con1":
                        getPart2(3);
                        //System.out.println("6 to 2");
                        break;
                    case "con2":
                        getPart10(1);
                        //System.out.println("6 to 10");
                        break;
                    case "con3":
                        getPart7(2);
                        //System.out.println("6 to 7");
                        break;
                    case "con1&2":
                        moreConnected("part2","part10",null);
                        break;
                    case "con1&3":
                        moreConnected("part2",null,"part7");
                        break;
                    case "con2&3":
                        moreConnected(null,"part10","part7");
                        break;
                    case "con123":
                        moreConnected("part2","part10","part7");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            case 3:
                switch(checkConnection(gui.vars.connect8,gui.vars.connect5,gui.vars.connect9)){
                    case "con1":
                        getPart5(4);
                        //System.out.println("6 to 5");
                        break;
                    case "con2":
                        getPart2(3);
                        //System.out.println("6 to 2");
                        break;
                    case "con3":
                        getPart7(2);
                        //System.out.println("6 to 7");
                        break;
                    case "con1&2":
                        moreConnected("part5","part2",null);
                        break;
                    case "con1&3":
                        moreConnected("part5",null,"part7");
                        break;
                    case "con2&3":
                        moreConnected(null,"part2","part7");
                        break;
                    case "con123":
                        moreConnected("part5","part2","part7");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            case 4:
                switch(checkConnection(gui.vars.connect8,gui.vars.connect12,gui.vars.connect5)){
                    case "con1":
                        getPart5(4);
                        //System.out.println("6 to 5");
                        break;
                    case "con2":
                        getPart10(1);
                        //System.out.println("6 to 10");
                        break;
                    case "con3":
                        getPart2(3);
                        //System.out.println("6 to 2");
                        break;
                    case "con1&2":
                        moreConnected("part5","part10",null);
                        break;
                    case "con1&3":
                        moreConnected("part5",null,"part2");
                        break;
                    case "con2&3":
                        moreConnected(null,"part10","part2");
                        break;
                    case "con123":
                        moreConnected("part5","part10","part2");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            default:
                break;
        }
    }
    
    public void getPart7(int dir){
        addPart(gui.vars.partName7);
        switch (dir) {
            case 1:
                switch(checkConnection(gui.vars.connect9,gui.vars.connect13,gui.vars.connect10)){
                    case "con1":
                        getPart6(4);
                        //System.out.println("7 to 6");
                        break;
                    case "con2":
                        getPart11(1);
                        //System.out.println("7 to 11");
                        break;
                    case "con3":
                        getPart8(2);
                        //System.out.println("7 to 8");
                        break;
                    case "con1&2":
                        moreConnected("part6","part11",null);
                        break;
                    case "con1&3":
                        moreConnected("part6",null,"part8");
                        break;
                    case "con2&3":
                        moreConnected(null,"part11","part8");
                        break;
                    case "con123":
                        moreConnected("part6","part11","part8");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            case 2:
                switch(checkConnection(gui.vars.connect6,gui.vars.connect13,gui.vars.connect10)){
                    case "con1":
                        getPart3(3);
                        //System.out.println("7 to 3");
                        break;
                    case "con2":
                        getPart11(1);
                        //System.out.println("7 to 11");
                        break;
                    case "con3":
                        getPart8(2);
                        //System.out.println("7 to 8");
                        break;
                    case "con1&2":
                        moreConnected("part3","part11",null);
                        break;
                    case "con1&3":
                        moreConnected("part3",null,"part8");
                        break;
                    case "con2&3":
                        moreConnected(null,"part11","part8");
                        break;
                    case "con123":
                        moreConnected("part3","part11","part8");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            case 3:
                switch(checkConnection(gui.vars.connect9,gui.vars.connect6,gui.vars.connect10)){
                    case "con1":
                        getPart6(4);
                        //System.out.println("7 to 6");
                        break;
                    case "con2":
                        getPart3(3);
                        //System.out.println("7 to 3");
                        break;
                    case "con3":
                        getPart8(2);
                        //System.out.println("7 to 8");
                        break;
                    case "con1&2":
                        moreConnected("part6","part3",null);
                        break;
                    case "con1&3":
                        moreConnected("part6",null,"part8");
                        break;
                    case "con2&3":
                        moreConnected(null,"part3","part8");
                        break;
                    case "con123":
                        moreConnected("part6","part3","part8");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            case 4:
                switch(checkConnection(gui.vars.connect9,gui.vars.connect13,gui.vars.connect6)){
                    case "con1":
                        getPart6(4);
                        //System.out.println("7 to 6");
                        break;
                    case "con2":
                        getPart11(1);
                        //System.out.println("7 to 11");
                        break;
                    case "con3":
                        getPart3(3);
                        //System.out.println("7 to 3");
                        break;
                    case "con1&2":
                        moreConnected("part6","part11",null);
                        break;
                    case "con1&3":
                        moreConnected("part6",null,"part3");
                        break;
                    case "con2&3":
                        moreConnected(null,"part11","part3");
                        break;
                    case "con123":
                        moreConnected("part6","part11","part3");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            default:
                break;
        }
    }
    
    public void getPart8(int dir){
        addPart(gui.vars.partName8);
        if(dir == 3){
            switch(checkConnection(gui.vars.connect7,gui.vars.connect10,false)){
                case "con1":
                    connectedToGround();
                    //System.out.println("8 to ground");
                    break;
                case "con2":
                    getPart7(4);
                    //System.out.println("8 to 7");
                    break;
                case "con1&2":
                    moreConnected("Ground","part7","none");
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }else if(dir == 2){
            switch(checkConnection(gui.vars.connect7,false,false)){
                case "con1":
                    connectedToGround();
                    //System.out.println("8 to ground");
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }
    }
    
    public void getPart9(int dir){
        addPart(gui.vars.partName9);
        if(dir == 1){
            switch(checkConnection(gui.vars.connect15,gui.vars.connect18,false)){
                case "con1":
                    getPart10(2);
                    break;
                case "con2":
                    getPart13(1);
                    break;
                case "con1&2":
                    moreConnected("part10","part13","none");
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }else if(dir == 4){
            switch(checkConnection(gui.vars.connect15,false,false)){
                case "con1":
                    getPart13(1);
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }
    }
    
    public void getPart10(int dir){
        addPart(gui.vars.partName10);
        switch (dir) {
            case 1:
                switch(checkConnection(gui.vars.connect15,gui.vars.connect19,gui.vars.connect16)){
                    case "con1":
                        getPart9(4);
                        break;
                    case "con2":
                        getPart14(1);
                        break;
                    case "con3":
                        getPart11(2);
                        break;
                    case "con1&2":
                        moreConnected("part9","part14",null);
                        break;
                    case "con1&3":
                        moreConnected("part9",null,"part11");
                        break;
                    case "con2&3":
                        moreConnected(null,"part14","part11");
                        break;
                    case "con123":
                        moreConnected("part9","part14","part11");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            case 2:
                switch(checkConnection(gui.vars.connect12,gui.vars.connect19,gui.vars.connect16)){
                    case "con1":
                        getPart6(3);
                        break;
                    case "con2":
                        getPart14(1);
                        break;
                    case "con3":
                        getPart11(2);
                        break;
                    case "con1&2":
                        moreConnected("part6","part14",null);
                        break;
                    case "con1&3":
                        moreConnected("part6",null,"part11");
                        break;
                    case "con2&3":
                        moreConnected(null,"part14","part11");
                        break;
                    case "con123":
                        moreConnected("part6","part14","part11");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            case 3:
                switch(checkConnection(gui.vars.connect15,gui.vars.connect12,gui.vars.connect16)){
                    case "con1":
                        getPart9(4);
                        break;
                    case "con2":
                        getPart6(3);
                        break;
                    case "con3":
                        getPart11(2);
                        break;
                    case "con1&2":
                        moreConnected("part9","part6",null);
                        break;
                    case "con1&3":
                        moreConnected("part9",null,"part11");
                        break;
                    case "con2&3":
                        moreConnected(null,"part6","part11");
                        break;
                    case "con123":
                        moreConnected("part9","part6","part11");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            case 4:
                switch(checkConnection(gui.vars.connect15,gui.vars.connect19,gui.vars.connect12)){
                    case "con1":
                        getPart9(4);
                        break;
                    case "con2":
                        getPart14(1);
                        break;
                    case "con3":
                        getPart6(3);
                        break;
                    case "con1&2":
                        moreConnected("part9","part14",null);
                        break;
                    case "con1&3":
                        moreConnected("part9",null,"part6");
                        break;
                    case "con2&3":
                        moreConnected(null,"part14","part6");
                        break;
                    case "con123":
                        moreConnected("part9","part14","part6");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            default:
                break;
        }
    }
    
    public void getPart11(int dir){
        addPart(gui.vars.partName11);
        switch (dir) {
            case 1:
                switch(checkConnection(gui.vars.connect16,gui.vars.connect20,gui.vars.connect17)){
                    case "con1":
                        getPart10(4);
                        break;
                    case "con2":
                        getPart15(1);
                        break;
                    case "con3":
                        getPart12(2);
                        break;
                    case "con1&2":
                        moreConnected("part10","part15",null);
                        break;
                    case "con1&3":
                        moreConnected("part10",null,"part12");
                        break;
                    case "con2&3":
                        moreConnected(null,"part15","part12");
                        break;
                    case "con123":
                        moreConnected("part10","part15","part12");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            case 2:
                switch(checkConnection(gui.vars.connect13,gui.vars.connect20,gui.vars.connect17)){
                    case "con1":
                        getPart7(3);
                        break;
                    case "con2":
                        getPart15(1);
                        break;
                    case "con3":
                        getPart12(2);
                        break;
                    case "con1&2":
                        //System.out.println("part 11 to 7 and 14");
                        moreConnected("part7","part15",null);
                        break;
                    case "con1&3":
                        //System.out.println("part 11 to 7 and 12");
                        moreConnected("part7",null,"part12");
                        break;
                    case "con2&3":
                        //System.out.println("part 11 to 15 and 12");
                        moreConnected(null,"part15","part12");
                        break;
                    case "con123":
                        //System.out.println("part 11 to all");
                        moreConnected("part7","part15","part12");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            case 3:
                switch(checkConnection(gui.vars.connect16,gui.vars.connect13,gui.vars.connect17)){
                    case "con1":
                        getPart10(4);
                        break;
                    case "con2":
                        getPart7(3);
                        break;
                    case "con3":
                        getPart12(2);
                        break;
                    case "con1&2":
                        moreConnected("part10","part7",null);
                        break;
                    case "con1&3":
                        moreConnected("part10",null,"part12");
                        break;
                    case "con2&3":
                        moreConnected(null,"part7","part12");
                        break;
                    case "con123":
                        moreConnected("part10","part7","part12");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            case 4:
                switch(checkConnection(gui.vars.connect16,gui.vars.connect20,gui.vars.connect13)){
                    case "con1":
                        getPart10(4);
                        break;
                    case "con2":
                        getPart15(1);
                        break;
                    case "con3":
                        getPart7(3);
                        break;
                    case "con1&2":
                        moreConnected("part10","part15",null);
                        break;
                    case "con1&3":
                        moreConnected("part10",null,"part7");
                        break;
                    case "con2&3":
                        moreConnected(null,"part15","part7");
                        break;
                    case "con123":
                        moreConnected("part10","part15","part7");
                        break;
                    case "error":
                        error("A part must be connected to check or run");
                        break;
                    default:
                        
                        break;
                }   break;
            default:
                break;
        }
    }
    
    public void getPart12(int dir){
        addPart(gui.vars.partName12);
        if(dir == 3){
            switch(checkConnection(gui.vars.connect14,gui.vars.connect17,false)){
                case "con1":
                    getPart8(3);
                    break;
                case "con2":
                    getPart11(4);
                    break;
                case "con1&2":
                    moreConnected("part8","part11","none");
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }else if(dir == 2){
            switch(checkConnection(gui.vars.connect14,false,false)){
                case "con1":
                    getPart8(3);
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }
    }
    
    public void getPart13(int dir){
        addPart(gui.vars.partName13);
        if(dir == 1){
            switch(checkConnection(gui.vars.connect22,false,false)){
                case "con1":
                    getPart14(2);
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }
    }
    
    public void getPart14(int dir){
        addPart(gui.vars.partName14);
        if(dir == 2){
            switch(checkConnection(gui.vars.connect19,gui.vars.connect23,false)){
                case "con1":
                    getPart10(3);
                    break;
                case "con2":
                    getPart15(2);
                    break;
                case "con1&2":
                    moreConnected("part10","part15","none");
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }else if(dir == 3){
            switch(checkConnection(gui.vars.connect19,false,false)){
                case "con1":
                    getPart9(1);
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }
    }
    
    public void getPart15(int dir){
        addPart(gui.vars.partName15);
        if(dir == 2){
            switch(checkConnection(gui.vars.connect8,gui.vars.connect11,false)){
                case "con1":
                    getPart6(2);
                    break;
                case "con2":
                    getPart9(1);
                    break;
                case "con1&2":
                    moreConnected("part6","part9","none");
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }else if(dir == 3){
            switch(checkConnection(gui.vars.connect8,false,false)){
                case "con1":
                    getPart9(1);
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    
                    break;
            }
        }
    }
    
    public void getPart16(int dir){
        addPart(gui.vars.partName16);
        if(dir == 2){
            switch(checkConnection(gui.vars.connect21,false,false)){
                case "con1":
                    getPart12(3);
                    break;
                case "error":
                    error("A part must be connected to check or run");
                    break;
                default:
                    break;
            }
        }
    }
    
    public void connectedToGround(){
        //end program
        gui.vars.connectedToGround = true;
        //System.out.println(gui.vars.partPath);
        //System.out.println("the circuit connected to ground");
        if(!gui.vars.runConnect){
            JOptionPane.showMessageDialog(gui, "This circuit is great, you can run it safely! :)");
        }
    }
    
    private void moreConnected(String partPara1, String partPara2, String partPara3) {
        error("The ability to connect a component to 3 others is not allowed at this time, will come soon");
    }
    
    public void addPart(String partToAdd){
        switch(partToAdd){
            case "Light Sensor": partToAdd = "ldr";
            break;
            case "PNP Transistor": partToAdd = "pnpt";
            break;
            case "Potentiometer": partToAdd = "pot";
            break;
            case "LED": partToAdd = "led";
            break;
            case "NPN Transistor": partToAdd = "npnt";
            break;
            case "Button": partToAdd = "b";
            break;
        }
        if(partToAdd.equals("Wire")){
            //do nothing
        }else{
            gui.vars.partPath += partToAdd + " ";
        }
    }
    
    
    
    public void clear(){
            gui.vars.partSelector1.setSelectedIndex(0);
	    gui.vars.partSelector2.setSelectedIndex(0);
	    gui.vars.partSelector3.setSelectedIndex(0);
	    gui.vars.partSelector4.setSelectedIndex(0);
            gui.vars.partSelector5.setSelectedIndex(0);
	    gui.vars.partSelector6.setSelectedIndex(0);
	    gui.vars.partSelector7.setSelectedIndex(0);
	    gui.vars.partSelector8.setSelectedIndex(0);
            gui.vars.partSelector9.setSelectedIndex(0);
	    gui.vars.partSelector10.setSelectedIndex(0);
	    gui.vars.partSelector11.setSelectedIndex(0);
	    gui.vars.partSelector12.setSelectedIndex(0);
            gui.vars.partSelector13.setSelectedIndex(0);
	    gui.vars.partSelector14.setSelectedIndex(0);
	    gui.vars.partSelector15.setSelectedIndex(0);
	    gui.vars.partSelector16.setSelectedIndex(0);
            gui.vars.paneLabel12.setIcon(gui.vars.blank);
            gui.vars.paneLabel13.setIcon(gui.vars.blank);
            gui.vars.paneLabel21.setIcon(gui.vars.blank);
            gui.vars.paneLabel22.setIcon(gui.vars.blank);
            gui.vars.paneLabel23.setIcon(gui.vars.blank);
            gui.vars.paneLabel24.setIcon(gui.vars.blank);
            gui.vars.paneLabel31.setIcon(gui.vars.blank);
            gui.vars.paneLabel32.setIcon(gui.vars.blank);
            gui.vars.paneLabel33.setIcon(gui.vars.blank);
            gui.vars.paneLabel34.setIcon(gui.vars.blank);
            gui.vars.paneLabel41.setIcon(gui.vars.blank);
            gui.vars.paneLabel42.setIcon(gui.vars.blank);
            gui.vars.paneLabel43.setIcon(gui.vars.blank);
            gui.vars.paneLabel44.setIcon(gui.vars.blank);
            gui.vars.button11.setIcon(gui.vars.disconnected);
            gui.vars.button12.setIcon(gui.vars.disconnected);
            gui.vars.button13.setIcon(gui.vars.disconnected);
            gui.vars.button21.setIcon(gui.vars.disconnected);
            gui.vars.button22.setIcon(gui.vars.disconnected);
            gui.vars.button23.setIcon(gui.vars.disconnected);
            gui.vars.button24.setIcon(gui.vars.disconnected);
            gui.vars.button31.setIcon(gui.vars.disconnected);
            gui.vars.button32.setIcon(gui.vars.disconnected);
            gui.vars.button33.setIcon(gui.vars.disconnected);
            gui.vars.button41.setIcon(gui.vars.disconnected);
            gui.vars.button42.setIcon(gui.vars.disconnected);
            gui.vars.button43.setIcon(gui.vars.disconnected);
            gui.vars.button44.setIcon(gui.vars.disconnected);
            gui.vars.button51.setIcon(gui.vars.disconnected);
            gui.vars.button52.setIcon(gui.vars.disconnected);
            gui.vars.button53.setIcon(gui.vars.disconnected);
            gui.vars.button61.setIcon(gui.vars.disconnected);
            gui.vars.button62.setIcon(gui.vars.disconnected);
            gui.vars.button63.setIcon(gui.vars.disconnected);
            gui.vars.button64.setIcon(gui.vars.disconnected);
            gui.vars.button71.setIcon(gui.vars.disconnected);
            gui.vars.button72.setIcon(gui.vars.disconnected);
            gui.vars.button73.setIcon(gui.vars.disconnected);
            gui.vars.connect1 = false;
            gui.vars.connect2 = false;
            gui.vars.connect3 = false;
            gui.vars.connect4 = false;
            gui.vars.connect5 = false;
            gui.vars.connect6 = false;
            gui.vars.connect7 = false;
            gui.vars.connect8 = false;
            gui.vars.connect9 = false;
            gui.vars.connect10 = false;
            gui.vars.connect11 = false;
            gui.vars.connect12 = false;
            gui.vars.connect13 = false;
            gui.vars.connect14 = false;
            gui.vars.connect15 = false;
            gui.vars.connect16 = false;
            gui.vars.connect17 = false;
            gui.vars.connect18 = false;
            gui.vars.connect19 = false;
            gui.vars.connect20 = false;
            gui.vars.connect21 = false;
            gui.vars.connect22 = false;
            gui.vars.connect23 = false;
            gui.vars.connect24 = false;
            gui.vars.partName2 = "";
            gui.vars.partName3 = "";
            gui.vars.partName5 = "";
            gui.vars.partName6 = "";
            gui.vars.partName7 = "";
            gui.vars.partName8 = "";
            gui.vars.partName9 = "";
            gui.vars.partName10 = "";
            gui.vars.partName11 = "";
            gui.vars.partName12 = "";
            gui.vars.partName13 = "";
            gui.vars.partName14 = "";
            gui.vars.partName15 = "";
            gui.vars.partName16 = "";
            gui.vars.partPath = "";
            gui.vars.runConnect = false;
    }

    void stop() {
        gui.vars.runConnect = false;
        gui.vars.partPath = "";
        System.out.println("ARDUINO STOPED");
    }
}