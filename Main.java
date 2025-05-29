public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! This is a new GitHub project.");
    }
    
    public static int sum(int x, int y){
        return x + y;
    }

    public static int multiply(int x, int y) {
        int result = 0;
        for (int i = 0; i < y; i++) {
            result += x;
        }
        return result;
    }
}
