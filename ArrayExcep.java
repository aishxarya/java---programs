public class ArrayExcep {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 20, 30, 40, 50 };
        for (int i = 0; i <= arr.length; i++) {
            try {
                System.out.println(arr[i]);
            } catch (Exception e) {
                System.out.println("caught: " + e);
            }
        }
        System.out.println("completed");
    }
}