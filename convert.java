import java.util.Scanner;

class convert {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The Rupees: ");
        int r = obj.nextInt();
        float d = (float) r / 60;
        System.out.println(r + " Rupees= " + d + " Dollar");
    }
}
