public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numBinario = 0b111110100;
        System.out.println("numBinario = " + numBinario);

        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numOctal = 0764;
        System.out.println("numOctal = " + numOctal);

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numHex = 0x1f4;
        System.out.println("numHex = " + numHex);
    }
}
