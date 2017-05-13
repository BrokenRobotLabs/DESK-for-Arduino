package com.desk.java;

import org.sintef.jarduino.AnalogPin;
import org.sintef.jarduino.DigitalPin;
import org.sintef.jarduino.DigitalState;
import org.sintef.jarduino.JArduino;
import org.sintef.jarduino.PWMPin;
import org.sintef.jarduino.PinMode;

public class MainFrame extends JArduino {

    Variables vars = new Variables(this, null);
    Connections connect = new Connections(this, null);
    ButtonActions buttons = new ButtonActions(null, this);
    GUI gui = new GUI(this);

    PWMPin pwm1 = PWMPin.PWM_PIN_3;
    PWMPin pwm2 = PWMPin.PWM_PIN_5;
    PWMPin pwm3 = PWMPin.PWM_PIN_6;
    PWMPin pwm4 = PWMPin.PWM_PIN_9;
    DigitalPin button1 = DigitalPin.PIN_4;
    DigitalPin button2 = DigitalPin.PIN_8;
    DigitalPin led1 = DigitalPin.PIN_3;
    DigitalPin led2 = DigitalPin.PIN_5;
    DigitalPin led3 = DigitalPin.PIN_6;
    DigitalPin led4 = DigitalPin.PIN_9;
    AnalogPin pot1 = AnalogPin.A_0;
    AnalogPin pot2 = AnalogPin.A_1;
    AnalogPin ldr = AnalogPin.A_2;
    AnalogPin tempSensor = AnalogPin.A_3;
    PinMode OUTPUT = PinMode.OUTPUT;
    PinMode INPUT = PinMode.INPUT;
    DigitalState HIGH = DigitalState.HIGH;
    DigitalState LOW = DigitalState.LOW;

    public MainFrame(String port) {
        super(port);
    }

    public static void main(String[] args) {
        JArduino ard = new MainFrame("COM5");
        ard.runArduinoProcess();
    }

    @Override
    protected void setup() {
        pinMode(button1, INPUT);
        pinMode(button2, INPUT);
        pinMode(led1, OUTPUT);
        pinMode(led2, OUTPUT);
        pinMode(led3, OUTPUT);
        pinMode(led4, OUTPUT);
        System.out.println("Setup started");
    }

    @Override
    protected void loop() {
        if (gui.vars.runConnect) {
            if (gui.ard.buttonLEDComponentExists()) {
                //System.out.println("Button LED component exists");
                if (gui.ard.buttonPotLEDComponentExists()) {
                    if (gui.ard.btnPotNPNLEDExists()) {
                        DigitalState rdbtn1 = digitalRead(button1);
                        DigitalState rdbtn2 = digitalRead(button2);
                        int ledValue = analogRead(pot2);
                        if ((rdbtn1 == HIGH || rdbtn2 == HIGH) && ledValue > 512) {
                            ledValue = map(ledValue, 512, 1024, 0, 254);
                            analogWrite(pwm1, (byte) ledValue);
                            analogWrite(pwm2, (byte) ledValue);
                            analogWrite(pwm3, (byte) ledValue);
                            analogWrite(pwm4, (byte) ledValue);
                        } else {
                            analogWrite(pwm1, (byte) 0);
                            analogWrite(pwm2, (byte) 0);
                            analogWrite(pwm3, (byte) 0);
                            analogWrite(pwm4, (byte) 0);
                        }
                    } else if (gui.ard.btnPotPNPLEDExists()) {
                        DigitalState rdbtn1 = digitalRead(button1);
                        DigitalState rdbtn2 = digitalRead(button2);
                        int ledValue = analogRead(pot2);
                        if ((rdbtn1 == LOW || rdbtn2 == LOW) && ledValue < 512) {
                            ledValue = map(ledValue, 0, 512, 0, 254);
                            analogWrite(pwm1, (byte) ledValue);
                            analogWrite(pwm2, (byte) ledValue);
                            analogWrite(pwm3, (byte) ledValue);
                            analogWrite(pwm4, (byte) ledValue);
                        } else {
                            analogWrite(pwm1, (byte) 0);
                            analogWrite(pwm2, (byte) 0);
                            analogWrite(pwm3, (byte) 0);
                            analogWrite(pwm4, (byte) 0);
                        }
                    } else {
                        DigitalState rdbtn1 = digitalRead(button1);
                        DigitalState rdbtn2 = digitalRead(button2);
                        int ledValue = analogRead(pot2);
                        ledValue = map(ledValue, 0, 1024, 0, 254);
                        if (rdbtn1 == HIGH || rdbtn2 == HIGH) {
                            analogWrite(pwm1, (byte) ledValue);
                            analogWrite(pwm2, (byte) ledValue);
                            analogWrite(pwm3, (byte) ledValue);
                            analogWrite(pwm4, (byte) ledValue);
                        } else {
                            analogWrite(pwm1, (byte) 0);
                            analogWrite(pwm2, (byte) 0);
                            analogWrite(pwm3, (byte) 0);
                            analogWrite(pwm4, (byte) 0);
                        }
                    }
                } else if (gui.ard.buttonNPNTransLEDExists()) {
                    DigitalState rdbtn1 = digitalRead(button1);
                    DigitalState rdbtn2 = digitalRead(button2);
                    if (rdbtn1 == HIGH || rdbtn2 == HIGH) {
                        analogWrite(pwm1, (byte) 254);
                        analogWrite(pwm2, (byte) 254);
                        analogWrite(pwm3, (byte) 254);
                        analogWrite(pwm4, (byte) 254);
                    } else {
                        analogWrite(pwm1, (byte) 0);
                        analogWrite(pwm2, (byte) 0);
                        analogWrite(pwm3, (byte) 0);
                        analogWrite(pwm4, (byte) 0);
                    }
                } else if (gui.ard.buttonPNPTransLEDExists()) {
                    DigitalState rdbtn1 = digitalRead(button1);
                    DigitalState rdbtn2 = digitalRead(button2);
                    if (rdbtn1 == LOW || rdbtn2 == LOW) {
                        analogWrite(pwm1, (byte) 254);
                        analogWrite(pwm2, (byte) 254);
                        analogWrite(pwm3, (byte) 254);
                        analogWrite(pwm4, (byte) 254);
                    } else {
                        analogWrite(pwm1, (byte) 0);
                        analogWrite(pwm2, (byte) 0);
                        analogWrite(pwm3, (byte) 0);
                        analogWrite(pwm4, (byte) 0);
                    }
                } else if (gui.ard.ldrbtnLEDExists()) {
                    if (gui.ard.ldrbtnNPNLEDExists()) {
                        DigitalState rdbtn1 = digitalRead(button1);
                        DigitalState rdbtn2 = digitalRead(button2);
                        int ledValue = analogRead(ldr);
                        if (rdbtn1 == HIGH || rdbtn2 == HIGH && ledValue > 512) {
                            ledValue = map(ledValue, 512, 1024, 0, 254);
                            ledValue = 254 - ledValue;
                            analogWrite(pwm1, (byte) ledValue);
                            analogWrite(pwm2, (byte) ledValue);
                            analogWrite(pwm3, (byte) ledValue);
                            analogWrite(pwm4, (byte) ledValue);
                        } else {
                            analogWrite(pwm1, (byte) 0);
                            analogWrite(pwm2, (byte) 0);
                            analogWrite(pwm3, (byte) 0);
                            analogWrite(pwm4, (byte) 0);
                        }
                    } else if (gui.ard.ldrbtnPNPLEDExists()) {
                        DigitalState rdbtn1 = digitalRead(button1);
                        DigitalState rdbtn2 = digitalRead(button2);
                        int ledValue = analogRead(ldr);
                        if (rdbtn1 == LOW || rdbtn2 == LOW && ledValue < 512) {
                            ledValue = map(ledValue, 0, 512, 0, 254);
                            ledValue = 254 - ledValue;
                            analogWrite(pwm1, (byte) ledValue);
                            analogWrite(pwm2, (byte) ledValue);
                            analogWrite(pwm3, (byte) ledValue);
                            analogWrite(pwm4, (byte) ledValue);
                        } else {
                            analogWrite(pwm1, (byte) 0);
                            analogWrite(pwm2, (byte) 0);
                            analogWrite(pwm3, (byte) 0);
                            analogWrite(pwm4, (byte) 0);
                        }
                    } else {
                        DigitalState rdbtn1 = digitalRead(button1);
                        DigitalState rdbtn2 = digitalRead(button2);
                        int ledValue = analogRead(ldr);
                        ledValue = map(ledValue, 0, 1024, 0, 254);
                        if (rdbtn1 == HIGH || rdbtn2 == HIGH) {
                            ledValue = 254 - ledValue;
                            analogWrite(pwm1, (byte) ledValue);
                            analogWrite(pwm2, (byte) ledValue);
                            analogWrite(pwm3, (byte) ledValue);
                            analogWrite(pwm4, (byte) ledValue);
                        } else {
                            analogWrite(pwm1, (byte) 0);
                            analogWrite(pwm2, (byte) 0);
                            analogWrite(pwm3, (byte) 0);
                            analogWrite(pwm4, (byte) 0);
                        }
                    }
                } else {
                    DigitalState rdbtn1 = digitalRead(button1);
                    DigitalState rdbtn2 = digitalRead(button2);
                    if (rdbtn1 == HIGH) {
                        analogWrite(pwm1, (byte) 254);
                        analogWrite(pwm2, (byte) 254);
                    } else {
                        analogWrite(pwm1, (byte) 0);
                        analogWrite(pwm2, (byte) 0);
                    }
                    if (rdbtn2 == HIGH) {
                        analogWrite(pwm3, (byte) 254);
                        analogWrite(pwm4, (byte) 254);
                    } else {
                        analogWrite(pwm3, (byte) 0);
                        analogWrite(pwm4, (byte) 0);
                    }
                }
            } else if (gui.ard.potLEDComponentExists()) {
                //System.out.println("Pot LED component exists");
                if (gui.ard.potNPNTransLEDExists()) {
                    int ledValue = analogRead(pot2);
                    ledValue = map(ledValue, 0, 1024, 0, 254);
                    if (ledValue > 127) {
                        ledValue = map(ledValue, 127, 254, 0, 254);
                        analogWrite(pwm1, (byte) ledValue);
                        analogWrite(pwm2, (byte) ledValue);
                        analogWrite(pwm3, (byte) ledValue);
                        analogWrite(pwm4, (byte) ledValue);
                    } else {
                        analogWrite(pwm1, (byte) 0);
                        analogWrite(pwm2, (byte) 0);
                        analogWrite(pwm3, (byte) 0);
                        analogWrite(pwm4, (byte) 0);
                    }
                } else if (gui.ard.potPNPTransLEDExists()) {
                    int ledValue = analogRead(pot2);
                    ledValue = map(ledValue, 0, 1024, 0, 254);
                    if (ledValue < 127) {
                        ledValue = map(ledValue, 0, 127, 0, 254);
                        analogWrite(pwm1, (byte) (254 - ledValue));
                        analogWrite(pwm2, (byte) (254 - ledValue));
                        analogWrite(pwm3, (byte) (254 - ledValue));
                        analogWrite(pwm4, (byte) (254 - ledValue));
                    } else {
                        analogWrite(pwm1, (byte) 0);
                        analogWrite(pwm2, (byte) 0);
                        analogWrite(pwm3, (byte) 0);
                        analogWrite(pwm4, (byte) 0);
                    }
                } else {
                    int ledValue;
                    ledValue = analogRead(pot2);
                    ledValue = map(ledValue, 0, 1024, 0, 254);
                    analogWrite(pwm1, (byte) ledValue);
                    analogWrite(pwm2, (byte) ledValue);
                    analogWrite(pwm4, (byte) ledValue);
                    analogWrite(pwm3, (byte) ledValue);
                }
            } else if (gui.ard.ldrLEDExists()) {
                int ledValue = analogRead(ldr);
                ledValue = map(ledValue, 0, 1024, 0, 254);
                if (gui.ard.ldrNPNLEDExists()) {
                    if (ledValue > 127) {
                        ledValue = map(ledValue, 127, 254, 0, 254);
                        analogWrite(pwm1, (byte) ledValue);
                        analogWrite(pwm2, (byte) ledValue);
                        analogWrite(pwm3, (byte) ledValue);
                        analogWrite(pwm4, (byte) ledValue);
                    } else {
                        analogWrite(pwm1, (byte) 0);
                        analogWrite(pwm2, (byte) 0);
                        analogWrite(pwm3, (byte) 0);
                        analogWrite(pwm4, (byte) 0);
                    }
                } else if (gui.ard.ldrPNPLEDExists()) {
                    if (ledValue < 127) {
                        ledValue = map(ledValue, 127, 0, 0, 254);
                        analogWrite(pwm1, (byte) ledValue);
                        analogWrite(pwm2, (byte) ledValue);
                        analogWrite(pwm3, (byte) ledValue);
                        analogWrite(pwm4, (byte) ledValue);
                    } else {
                        analogWrite(pwm1, (byte) 0);
                        analogWrite(pwm2, (byte) 0);
                        analogWrite(pwm3, (byte) 0);
                        analogWrite(pwm4, (byte) 0);
                    }
                } else {
                    ledValue = 254 - ledValue;
                    analogWrite(pwm1, (byte) ledValue);
                    analogWrite(pwm2, (byte) ledValue);
                    analogWrite(pwm3, (byte) ledValue);
                    analogWrite(pwm4, (byte) ledValue);
                }
            }
        } else {
            analogWrite(pwm1, (byte) 0);
            analogWrite(pwm2, (byte) 0);
            analogWrite(pwm3, (byte) 0);
            analogWrite(pwm4, (byte) 0);
        }
    }
}
