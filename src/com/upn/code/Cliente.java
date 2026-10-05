package com.upn.code;

import java.util.*;

public class Cliente {

    private String codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;

    private static int CONTADOR;

    private Scanner teclado = new Scanner(System.in);

    public Cliente() {
        CONTADOR++;
        System.out.println("Cliente nro: " + CONTADOR);
    }

    public static int getCONTADOR() {
        return CONTADOR;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().equals("")) {
            codigo = "" + CONTADOR;
        }
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().equals("")) {
            nombre = "UNKNOWN";
        }
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.trim().equals("")) {
            apellido = "UNKNOWN";
        }
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (!(edad >= 0 && edad <= 120)) {
            edad = 0;
        }
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().equals("")) {
            telefono = "UNKNOWN";
        }
        this.telefono = telefono;
    }

    public void ingresar() {

        System.out.println("----- Registrar Cliente -----");

        System.out.print("* Ingresar codigo: ");
        String local_codigo = teclado.nextLine();
        setCodigo(local_codigo);

        System.out.print("* Ingresar nombre: ");
        String local_nombre = teclado.nextLine();
        setNombre(local_nombre);

        System.out.print("* Ingresar apellido: ");
        String local_apellido = teclado.nextLine();
        setApellido(local_apellido);

        System.out.print("* Ingresar edad: ");
        int local_edad = teclado.nextInt();
        teclado.nextLine();
        setEdad(local_edad);

        System.out.print("* Ingresar telefono: ");
        String local_telefono = teclado.nextLine();
        setTelefono(local_telefono);
    }

    public void mostrar() {

        System.out.println("----- Datos del Cliente -----");
        System.out.println("- Codigo: " + this.codigo);
        System.out.println("- Nombre: " + this.nombre);
        System.out.println("- Apellido: " + this.apellido);
        System.out.println("- Edad: " + this.edad);
        System.out.println("- Telefono: " + this.telefono);
    }

    // Sobrecarga de metodos

    public static void registrarCliente(String nombre) {
        System.out.println("Cliente: " + nombre);
    }

    public static void registrarCliente(String nombre, String telefono) {
        System.out.println("Cliente: " + nombre);
        System.out.println("Telefono: " + telefono);
    }

    public static void registrarCliente(String nombre, String telefono, String servicio) {
        System.out.println("Cliente: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("Servicio: " + servicio);
    }
}


