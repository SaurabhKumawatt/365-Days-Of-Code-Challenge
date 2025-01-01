public class dataTypes {
    public static void main(String[] args){

         
        /*  primitive types
         *  byte - 1 byte
         *  short - 2 byte
         *  int - 4 byte
         *  long - 8 byte
         *  float - 4 byte
         *  double - 8 byte
         *  char  - 2 byte
         *  boolean - 1 byte
         */


         byte age = 30;
         short myNum = 32767;
         int number = 1234567890;
         long longNum = 12345678900L;
         float percentage = 59.54F;
         double per = 55.54;
         char letter = 's';
         boolean isLogedIn = true;

        System.out.println(age);
        System.out.println(myNum);
        System.out.println(number);
        System.out.println(longNum);
        System.out.println(percentage);
        System.out.println(per);
        System.out.println(letter);
        System.out.println(isLogedIn);

        /*
         * non primitive
         * string--
         * array--
         * Classes
         * object
         * interface
         */

         String name = new String("Saurabh");
         System.out.println(name);

         int arr[] = {1, 2, 3, 4};
         System.out.println(arr[0]);
}
}
