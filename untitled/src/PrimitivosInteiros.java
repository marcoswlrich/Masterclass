public class PrimitivosInteiros {
    public static void main(String[] args) {
        
        byte numByte = 127;
        System.out.println("numByte = " + numByte);
        System.out.println("tipo byte corresponde em byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde em bites a " + Byte.SIZE);
        System.out.println("Valor maximo de um byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de um byte: " + Byte.MIN_VALUE);

        short numShort = 32767;
        System.out.println("numByte = " + numShort);
        System.out.println("tipo short corresponde em byte a " + Short.BYTES);
        System.out.println("tipo short corresponde em bites a " + Short.SIZE);
        System.out.println("Valor maximo de um short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de um short: " + Short.MIN_VALUE);

        int numInt = 2147483647;
        System.out.println("numByte = " + numInt);
        System.out.println("tipo int corresponde em byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde em bites a " + Integer.SIZE);
        System.out.println("Valor maximo de um int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de um int: " + Integer.MIN_VALUE);
        // 2147483648L Literal
        long numLong = 9223372036854775807L;
        System.out.println("numByte = " + numLong);
        System.out.println("tipo long corresponde em byte a " + Long.BYTES);
        System.out.println("tipo long corresponde em bites a " + Long.SIZE);
        System.out.println("Valor maximo de um long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de um long: " + Long.MIN_VALUE);


    }
}
