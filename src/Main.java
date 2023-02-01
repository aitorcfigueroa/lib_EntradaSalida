public class Main {
    public static void main(String[] args) {

        boolean isOK_ventana = false;
        boolean isOK_consola = false;

        isOK_consola = EntradaSalida.salida("Hola", EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salida("Hello world", EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");

        boolean isOK_string = false;
        boolean isOK_int = false;

        isOK_string = EntradaSalida.entrada("Mensaje para introducir un string", EntradaSalida.CADENA);
        if (!isOK_string) System.out.println("ERROR STRING");
        isOK_int = EntradaSalida.entrada("Mensaje para introducir un int", EntradaSalida.NUMERO);
        if (!isOK_int) System.out.println("ERROR INT");
    }
}