public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040'; // char apenas um caractere
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (decimal == caracter));

        char espaco = ' '; // ou caractere de espacp \u0020
        char retroceso = '\b';
        char tabulador = '\t';
        char novaLinha = '\n';

        System.out.println("char corresponde em byte a " + Character.BYTES);
        System.out.println("char corresponde em bites a " + Character.SIZE);
        System.out.println("Valor maximo de um char: " + Character.MAX_VALUE);
        System.out.println("Valor minimo de um char: " + Character.MIN_VALUE);
    }
}
