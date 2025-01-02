public class strings {
    public static void main(String[] args){

        //  day 2 of 365 days of code

        // methods of string
        // Concatenate of strings
        String fname = "Saurabh ";
        String lname = "Kumawat";

        String fullname = fname + lname;
        System.out.println(fullname);


        // chaerAt
        System.out.println(fullname.charAt(0));

        // length
        System.out.println(fullname.length());


        // replace
        String newName = fullname.replace('b', 'h');
        System.out.println(newName);

        // substring
        String newStr = fullname.substring(0, 3);
        System.out.println(newStr);


    }
}
