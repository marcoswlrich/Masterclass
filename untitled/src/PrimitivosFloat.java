public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 1.5e4f; //15000f
        System.out.println("realFloat = " + realFloat);

        float negFloat = 0.00000000015f; //1.5e-10f anotacao cientfica
        System.out.println("negFloat = " + negFloat);
        System.out.println("float corresponde em byte a " + Float.BYTES);
        System.out.println("float corresponde em bites a " + Float.SIZE);
        System.out.println("Valor maximo de um float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo de um float: " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde em byte a " + Double.BYTES);
        System.out.println("double corresponde em bites a " + Double.SIZE);
        System.out.println("Valor maximo de um double: " + Double.MAX_VALUE);
        System.out.println("Valor minimo de um double: " + Double.MIN_VALUE);


    }
}
