public class fourth {
    public static void main(String[] args) {
        int a = 5, b = 10, temp;
        System.out.println("Value of a before swapping: " + a);
        System.out.println("Value of b before swapping: " + b);

        // Swapping with a temp variable
        temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a after swapping: " + a);
        System.out.println("Value of b after swapping: " + b);

        System.out.println("Value of a before swapping: " + a);
        System.out.println("Value of b before swapping: " + b);

        // Swapping without temp variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a before swapping: " + a);
        System.out.println("Value of b before swapping: " + b);
    }
}
