public class stringMethods {
    public static void main(String[] args) {

        // cocatenete
        String fName = "Saurabh";
        String lName = " Kumawat";
        System.out.println(fName + lName);

        // charat
        System.out.println(fName.charAt(6));

        // length of string
        System.out.println(fName.length());

        // replce character in string
        String newName = fName.replace('b', 'h');
        System.out.println(newName);

        // substring of string
        System.out.println(fName.substring(0, 3));

        
    }    
}
