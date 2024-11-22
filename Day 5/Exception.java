public class Exception {

    public static void main(String[] args) {
        int marks[] = {90, 50, 70};

        try {
            System.out.println(marks[4]);
            
        } catch(java.lang.Exception e) {
            // do something
            System.out.println(e);
        }

        System.out.println("Saurabh");
    }
}
