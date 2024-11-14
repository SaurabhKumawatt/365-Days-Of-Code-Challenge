public class strings {
    public static void main(String[] args) {
        //strings methods

        String fName = "Saurabh";
        String lName = " Kumawat";
        
        // concatenate
        String name3 = fName + lName;
        System.out.println(name3);

        //charAt
        System.out.println(fName.charAt(0));

        //length
        System.out.println(fName.length());

        // replace
        String newName = fName.replace('h', 'k');
        System.out.println(newName);

        //substring 
        String newn = name3.substring(0, 7);
        System.out.println(newn);
    }
}
