package com.parcialBryan;

import javax.swing.*;

public class Menu {


    public void MenuDeInicio() {

        //Variables para menu
        int option;
        String menu;

        //Como objeto a las operaciones basicas y avanzadas

        OpBasicos object = new OpBasicos();

        do{
            menu = JOptionPane.showInputDialog( "CALCULADORA OPCIONES BASICAS Y AVANZADAS\n" + "1. Suma\n" + "2. Resta\n" + "3. Division\n"+ "4. Multiplicacion\n"+ "5. Raiz cuadrada \n"+ "6. Potencia\n" + "7. Seno\n" + "8. Coseno\n"+ "9. Tangente\n"+ "10. Salir");
            option = Integer.parseInt(menu);

            //Realizacion del menu a presentar.
            switch (option) {

                case 1:
                    object.suma();
                    break;
                case 2:
                    object.resta();
                    break;
                case 3:
                    object.division();
                    break;
                case 4:
                    object.multiplicacion();
                    break;
                case 5:
                    object.raizcuadrada();
                    break;
                case 6:
                    object.potencia();
                    break;
                case 7:
                    object.seno();
                    break;
                case 8:
                    object.coseno();
                    break;
                case 9:
                    object.tangente();
                    break;
                case 10:
                    break;


            }
        }

        while(option!= 10);
    }

}
