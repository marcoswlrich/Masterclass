import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Adicione um numero inteiro");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error! Deve adicionar um numero inteiro");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultBin = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultBin);

        int numBinario = 0b111110100;
        System.out.println("numBinario = " + numBinario);

        String resultOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultOctal);

        int numOctal = 0764;
        System.out.println("numOctal = " + numOctal);

        String resultHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultHex);

        int numHex = 0x1f4;
        System.out.println("numHex = " + numHex);

        String mensage = resultBin;
        mensage += "\n" + resultOctal;
        mensage += "\n" + resultHex;

        JOptionPane.showMessageDialog(null, mensage);
    }
}
