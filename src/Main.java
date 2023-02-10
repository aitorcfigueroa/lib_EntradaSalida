public class Main {
    public static void main(String[] args) {

        boolean isOK_ventana = false;
        boolean isOK_consola = false;

        isOK_consola = EntradaSalida.salida("Hola", EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salida("Hello world", EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");

        String isOK_string = EntradaSalida.entrada("Mensaje para introducir un string");
        if(isOK_string == null) System.out.println("ERROR STRING"); else System.out.println(isOK_string);

        Integer isOK_int = EntradaSalida.numero("Mensaje para introducir un int");
        if (isOK_int == null) System.out.println("ERROR INT"); else System.out.println(isOK_int);

    }
}