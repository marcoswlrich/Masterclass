public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean dadoLogico = false;
        System.out.println("dadoLogico = " + dadoLogico);

        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);

        float f = 1.2345e2f; // 123.45
        System.out.println("f = " + f);

        dadoLogico = d > f;
        System.out.println("dadoLogico = " + dadoLogico);
    }
}
