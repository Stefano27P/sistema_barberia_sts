
package com.upn.code;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        try {

            Scanner teclado = new Scanner(System.in);

            System.out.print("Ingrese la cantidad de clientes: ");
            int n = teclado.nextInt();
            teclado.nextLine();

            ArrayList<Cliente> lista = new ArrayList<Cliente>();

            for (int i = 0; i < n; i++) {

                System.out.println("\n==============================");

                Cliente cliente = new Cliente();
                cliente.ingresar();

                lista.add(cliente);
            }

            System.out.println("\n================================");
            System.out.println("       TODOS LOS CLIENTES");
            System.out.println("================================");

            for (Cliente cliente : lista) {

                cliente.mostrar();

                System.out.println();

                Cliente.registrarCliente(
                    cliente.getNombre(),
                    cliente.getTelefono(),
                    "Corte de cabello"
                );

                System.out.println();
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}

