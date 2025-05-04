/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        SistemaRegistroUsuarios sistema = new SistemaRegistroUsuarios();

        sistema.registrarUsuario("Carlos", "carlos@gmail.com");
        sistema.registrarUsuario("Maria", "maria@hotmail.com");
        sistema.registrarUsuario("Carlos", "repetido@gmail.com"); // nickName repetido
        sistema.registrarUsuario("", "vacio@gmail.com"); // nickName vacío
        sistema.registrarUsuario("Luis", "sinarroba.com"); // email inválido

        Usuario u = new Usuario("Ana", "ana@yahoo.com");
        sistema.registrarUsuario(u); // usando la sobrecarga

        sistema.mostrarUsuarios();
    }
}

