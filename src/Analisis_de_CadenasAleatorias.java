import javax.swing.JOptionPane;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Analisis_de_CadenasAleatorias {
    
    public static void main(String[] args) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder cadenaGenerada = new StringBuilder();
        Random random = new Random();

        // Generar cadena aleatoria de 10 caracteres
        for (int i = 0; i < 10; i++) {
            int indice = random.nextInt(caracteres.length());
            cadenaGenerada.append(caracteres.charAt(indice));
        }

        String original = cadenaGenerada.toString();
        String minusculas = original.toLowerCase();
        String invertida = new StringBuilder(original).reverse().toString();

        // Sumar valores ASCII
        int sumaASCII = 0;
        for (int i = 0; i < original.length(); i++) {
            sumaASCII += (int) original.charAt(i);
        }
        // Calcular raíz cuadrada redondeada
        double raizCuadrada = Math.sqrt(sumaASCII);
        int redondeado = (int) Math.round(raizCuadrada);

        // Usar el método de ProyectoGitDemo para contar letras y números
        String conteo = ProyectoGitDemo.contarLetrasYNumeros(original);

        // Mostrar los resultados en una ventana
        String mensaje = "Cadena generada: " + original + "\n"
                       + "En minúsculas: " + minusculas + "\n"
                       + "Cadena invertida: " + invertida + "\n"
                       + "Suma de valores ASCII: " + sumaASCII + "\n"
                       + "Raíz cuadrada redondeada: " + redondeado + "\n"
                       + conteo;

        JOptionPane.showMessageDialog(null, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
