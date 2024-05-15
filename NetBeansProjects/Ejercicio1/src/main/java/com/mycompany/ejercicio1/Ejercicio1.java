/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author Windows
 */


import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String args[]) {
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre:");
        int codMenuPpal = 0, totalPlatos = 0, totalPlatosTipicos = 0, totalPlatosCarta = 0, totalPlatosInternacionales = 0;
        double totalPagar = 0;

        do {
            String menu = "Menu RESTAURANTE\n\n";
            menu += "1. Plato Tipico\n";
            menu += "2. Plato a la Carta\n";
            menu += "3. Plato Internacional\n";
            menu += "4. Salir\n\n";
            menu += "Por favor seleccione una opcion \n";
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (codMenuPpal) {
                case 1:
                    String menuTipico = "Menu TIPICO\n\n";
                    menuTipico += "1. Frijoles\n";
                    menuTipico += "2. Sopa de Verduras\n";
                    menuTipico += "3. Regresar\n\n";
                    menuTipico += "Por favor seleccione una opcion \n";
                    int codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                    switch (codMenuTipico) {
                        case 1:
                            totalPagar += 12000;
                            totalPlatosTipicos++;
                            totalPlatos++;
                            break;
                        case 2:
                            totalPagar += 8000;
                            totalPlatosTipicos++;
                            totalPlatos++;
                            break;
                        case 3:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Código inválido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                    break;
                case 2:
                    String menuCarta = "Menu CARTA\n\n";
                    menuCarta += "1. Plato A\n";
                    menuCarta += "2. Plato B\n";
                    menuCarta += "3. Regresar\n\n";
                    menuCarta += "Por favor seleccione una opcion \n";
                    int codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(menuCarta));

                    switch (codMenuCarta) {
                        case 1:
                           
                            totalPagar += 15000;
                            totalPlatosCarta++;
                            totalPlatos++;
                            break;
                        case 2:
                            
                            totalPagar += 18000;
                            totalPlatosCarta++;
                            totalPlatos++;
                            break;
                        case 3:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Código inválido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                    break;
                case 3:
                   
                    totalPagar += 20000;
                    totalPlatosInternacionales++;
                    totalPlatos++;
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Código inválido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 4);

        String factura = "FACTURA\n\n";
        factura += "Nombre: " + nombreUsuario + "\n";
        factura += "Platos Tipicos: " + totalPlatosTipicos + "\n";
        factura += "Platos Carta: " + totalPlatosCarta + "\n";
        factura += "Platos Internacionales: " + totalPlatosInternacionales + "\n";
        factura += "Total de Platos: " + totalPlatos + "\n";
        factura += "Total a Pagar: $" + totalPagar + "\n";

        JOptionPane.showMessageDialog(null, factura);
    }
}

