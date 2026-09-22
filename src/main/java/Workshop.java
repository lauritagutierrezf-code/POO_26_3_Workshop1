import java.util.List;

public class Workshop {

    public static void main(String[] args) {

    }

    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        }

        if (b >= c) {
            return b;
        }

        return c;
    }

    public int[] tablaMultiplicar(int numero, int limite) {
        int[] resultado = new int[limite];

        for (int i = 0; i < limite; i++) {
            resultado[i] = numero * (i + 1);
        }

        return resultado;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }

    public boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        int[] resultado = new int[n];

        if (n == 0) {
            return resultado;
        }

        resultado[0] = 0;

        if (n == 1) {
            return resultado;
        }

        resultado[1] = 1;

        for (int i = 2; i < n; i++) {
            resultado[i] = resultado[i - 1] + resultado[i - 2];
        }

        return resultado;
    }

    public int sumaElementos(int[] arreglo) {
        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }

        return suma;
    }

    public double promedioElementos(int[] arreglo) {
        if (arreglo.length == 0) {
            return 0.0;
        }

        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }

        return (double) suma / arreglo.length;
    }

    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }

        return mayor;
    }

    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }

        return menor;
    }

    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return true;
            }
        }

        return false;
    }

    public int[] invertirArreglo(int[] arreglo) {
        int[] resultado = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            resultado[i] = arreglo[arreglo.length - 1 - i];
        }

        return resultado;
    }

    public int[] ordenarArreglo(int[] arreglo) {
        int[] resultado = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            resultado[i] = arreglo[i];
        }

        for (int i = 0; i < resultado.length - 1; i++) {
            for (int j = 0; j < resultado.length - 1 - i; j++) {

                if (resultado[j] > resultado[j + 1]) {
                    int temporal = resultado[j];
                    resultado[j] = resultado[j + 1];
                    resultado[j + 1] = temporal;
                }
            }
        }

        return resultado;
    }

    public int[] eliminarDuplicados(int[] arreglo) {
        int[] temporal = new int[arreglo.length];
        int cantidad = 0;

        for (int i = 0; i < arreglo.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < cantidad; j++) {
                if (arreglo[i] == temporal[j]) {
                    repetido = true;
                }
            }

            if (!repetido) {
                temporal[cantidad] = arreglo[i];
                cantidad++;
            }
        }

        int[] resultado = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            resultado[i] = temporal[i];
        }

        return resultado;
    }

    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] resultado = new int[arreglo1.length + arreglo2.length];

        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i];
        }

        for (int i = 0; i < arreglo2.length; i++) {
            resultado[arreglo1.length + i] = arreglo2[i];
        }

        return resultado;
    }

    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int[] resultado = new int[arreglo.length];

        if (arreglo.length == 0) {
            return resultado;
        }

        posiciones = posiciones % arreglo.length;

        if (posiciones < 0) {
            posiciones = posiciones + arreglo.length;
        }

        for (int i = 0; i < arreglo.length; i++) {
            int nuevaPosicion = i + posiciones;

            if (nuevaPosicion >= arreglo.length) {
                nuevaPosicion = nuevaPosicion - arreglo.length;
            }

            resultado[nuevaPosicion] = arreglo[i];
        }

        return resultado;
    }

    public int contarCaracteres(String cadena) {
        int cantidad = 0;

        for (int i = 0; i < cadena.length(); i++) {
            cantidad++;
        }

        return cantidad;
    }

    public String invertirCadena(String cadena) {
        String resultado = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado = resultado + cadena.charAt(i);
        }

        return resultado;
    }

    public boolean esPalindromo(String cadena) {
        for (int i = 0; i < cadena.length() / 2; i++) {

            if (cadena.charAt(i) != cadena.charAt(cadena.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public int contarPalabras(String cadena) {
        int cantidad = 0;
        boolean palabra = false;

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) != ' ') {

                if (!palabra) {
                    cantidad++;
                    palabra = true;
                }

            } else {
                palabra = false;
            }
        }

        return cantidad;
    }

    public String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    public String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    public int buscarSubcadena(String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    public boolean validarCorreoElectronico(String correo) {

        if (correo == null) {
            return false;
        }

        int arroba = correo.indexOf("@");
        int ultimaArroba = correo.lastIndexOf("@");
        int punto = correo.lastIndexOf(".");

        if (arroba <= 0) {
            return false;
        }

        if (arroba != ultimaArroba) {
            return false;
        }

        if (punto <= arroba + 1) {
            return false;
        }

        if (punto >= correo.length() - 1) {
            return false;
        }

        return true;
    }

    public double promedioLista(List<Integer> lista) {

        if (lista.size() == 0) {
            return 0.0;
        }

        int suma = 0;

        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i);
        }

        return (double) suma / lista.size();
    }

    public String convertirABinario(int numero) {

        if (numero == 0) {
            return "0";
        }

        boolean negativo = false;

        if (numero < 0) {
            negativo = true;
            numero = numero * -1;
        }

        String resultado = "";

        while (numero > 0) {
            int resto = numero % 2;
            resultado = resto + resultado;
            numero = numero / 2;
        }

        if (negativo) {
            resultado = "-" + resultado;
        }

        return resultado;
    }

    public String convertirAHexadecimal(int numero) {

        if (numero == 0) {
            return "0";
        }

        boolean negativo = false;

        if (numero < 0) {
            negativo = true;
            numero = numero * -1;
        }

        String resultado = "";
        String valores = "0123456789ABCDEF";

        while (numero > 0) {
            int resto = numero % 16;
            resultado = valores.charAt(resto) + resultado;
            numero = numero / 16;
        }

        if (negativo) {
            resultado = "-" + resultado;
        }

        return resultado;
    }

    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {

        String[] opciones = {
            "Piedra",
            "Papel",
            "Tijera",
            "Lagarto",
            "Spock"
        };

        int numero = (int) (Math.random() * 5);

        String computadora = opciones[numero];

        if (eleccionUsuario.equals(computadora)) {
            return "Empate";
        }

        if (eleccionUsuario.equals("Piedra")) {
            if (computadora.equals("Tijera") || computadora.equals("Lagarto")) {
                return "Ganaste";
            }
        }

        if (eleccionUsuario.equals("Papel")) {
            if (computadora.equals("Piedra") || computadora.equals("Spock")) {
                return "Ganaste";
            }
        }

        if (eleccionUsuario.equals("Tijera")) {
            if (computadora.equals("Papel") || computadora.equals("Lagarto")) {
                return "Ganaste";
            }
        }

        if (eleccionUsuario.equals("Lagarto")) {
            if (computadora.equals("Spock") || computadora.equals("Papel")) {
                return "Ganaste";
            }
        }

        if (eleccionUsuario.equals("Spock")) {
            if (computadora.equals("Tijera") || computadora.equals("Piedra")) {
                return "Ganaste";
            }
        }

        return "Perdiste";
    }

    public String pptls2(String game[]) {

        String jugador1 = game[0];
        String jugador2 = game[1];

        if (jugador1.equals(jugador2)) {
            return "Empate";
        }

        if (jugador1.equals("R")) {
            if (jugador2.equals("S") || jugador2.equals("L")) {
                return "Player 1";
            }
        }

        if (jugador1.equals("P")) {
            if (jugador2.equals("R") || jugador2.equals("V")) {
                return "Player 1";
            }
        }

        if (jugador1.equals("S")) {
            if (jugador2.equals("P") || jugador2.equals("L")) {
                return "Player 1";
            }
        }

        if (jugador1.equals("L")) {
            if (jugador2.equals("V") || jugador2.equals("P")) {
                return "Player 1";
            }
        }

        if (jugador1.equals("V")) {
            if (jugador2.equals("S") || jugador2.equals("R")) {
                return "Player 1";
            }
        }

        return "Player 2";
    }

    public double areaCirculo(double radio) {
        return Math.PI * radio;
    }

    public String zoodiac(int day, int month) {

        if (month < 1 || month > 12) {
            return "Invalid Date";
        }

        if (day < 1 || day > 31) {
            return "Invalid Date";
        }

        if (month == 2 && day > 28) {
            return "Invalid Date";
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11)
                && day > 30) {
            return "Invalid Date";
        }

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        }

        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Tauro";
        }

        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        }

        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        }

        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        }

        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        }

        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        }

        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Escorpio";
        }

        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagitario";
        }

        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricornio";
        }

        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Acuario";
        }

        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Piscis";
        }

        return "Invalid Date";
    }
}

