package com.parcialBryan;

import javax.swing.*;
import java.util.*;

public class OpBasicos {

    //Creacion de variables
    int no1;
    int no2;
    double resultado;

    //Constructor para OpBasicas
    public OpBasicos(){
        no1 = 0;
        no2 = 0;
        resultado = 0;
    }

    //Metodos a utilizar (las operaciones)

    //Suma
    public void suma(){
        no1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar primer numero"));
        no2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrear segundo numero"));
        resultado = no1 + no2;

        JOptionPane.showMessageDialog(null, "Resultado es: " + resultado);
    }
    //Resta
    public void resta(){
        no1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar primer numero"));
        no2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrear segundo numero"));
        resultado = no1 - no2;

        JOptionPane.showMessageDialog(null, "Resultado es: " + resultado);
    }
    //Division
    public void division(){
        no1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar primer numero"));
        no2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrear segundo numero"));
        resultado = no1 / no2;

        JOptionPane.showMessageDialog(null, "Resultado es: " + resultado);
    }

    //Multiplicacion
    public void multiplicacion(){
        no1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar primer numero"));
        no2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrear segundo numero"));
        resultado = no1 * no2;

        JOptionPane.showMessageDialog(null, "Resultado es: " + resultado);
    }
    public void raizcuadrada(){

        no1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero"));
        double resultado= Math.sqrt(no1);
        JOptionPane.showMessageDialog(null, "Su raiz cuadrada es: " + resultado);

    }
    public void potencia(){

        no1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero base"));
        no2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar exponente "));
        resultado = Math.pow(no1,no2);
        JOptionPane.showMessageDialog(null, "Resultado de la potencia: " + resultado);
    }
    public void seno(){

        no1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero"));
        double resultado= Math.sin(no1);
        JOptionPane.showMessageDialog(null, "Seno resultante: " + resultado);

    }
    public void coseno(){

        no1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero"));
        double resultado= Math.cos(no1);
        JOptionPane.showMessageDialog(null, "Coseno resultante: " + resultado);

    }
    public void tangente(){

        no1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero"));
        double resultado= Math.tan(no1);
        JOptionPane.showMessageDialog(null, "Tangente resultante: " + resultado);
    }

}
