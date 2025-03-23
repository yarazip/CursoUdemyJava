package fundamentos;

public class DesafiosAritmeticos {
    public static void main(String[] args) {
        int a = (6 * (3 + 2));
        int b = (int) Math.pow(a, 2);

        int c = b / (3 * 2);
        System.out.println("C: " + c);

        int d = (1 - 5) * (2 - 7) / 2; 
        int g = (int) Math.pow(d, 2);
        System.out.println("G: " + g);

        int h = (c - g);
        int i = (int) Math.pow(h, 3);
        int res = i / 10; 

        System.out.println("Resultado final: " + res);
    }
}


