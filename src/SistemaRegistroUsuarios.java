/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class SistemaRegistroUsuarios {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    // Método principal para registrar con parámetros
    public void registrarUsuario(String nickName, String email) {
        try {
            if (nickName == null || nickName.isEmpty())
                throw new IllegalArgumentException("El nickName no puede estar vacio.");

            if (email == null || email.isEmpty())
                throw new IllegalArgumentException("El email no puede estar vacio.");

            if (!email.contains("@"))
                throw new IllegalArgumentException("El email no tiene un formato valido.");

            for (Usuario u : usuarios) {
                if (u.getNickName().equalsIgnoreCase(nickName))
                    throw new IllegalArgumentException("El nickName ya existe.");
            }

            Usuario nuevo = new Usuario(nickName, email);
            usuarios.add(nuevo);
            System.out.println("Usuario registrado correctamente: " + nuevo);

        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    // Sobrecarga de método para registrar con objeto Usuario
    public void registrarUsuario(Usuario u) {
        registrarUsuario(u.getNickName(), u.getEmail());
    }

    public void mostrarUsuarios() {
        System.out.println("\nLista de usuarios registrados:");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
}

