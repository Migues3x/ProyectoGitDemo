public class ProyectoGitDemo {

    public static String contarLetrasYNumeros(String cadena) {
        int letras = 0;
        int numeros = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        return "Cantidad de letras: " + letras + "\n" +
               "Cantidad de números: " + numeros;
    }
    
}
