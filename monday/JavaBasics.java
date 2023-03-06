public class JavaBasics{
    // entry point method
    // The JRE needs to call on the programs main method for the program to run.
    // public because this method needs to be callable outside the class.
    // static methods can be called without having to create an instance of the class to call it.
    public static void main(String[] args){
        System.out.println("Hello");

        // --------- student variables --------------

        // String is a Special ninth primitive data type. 
            // Special ninth = a primitive data type that has built in methods
        String firstName = "Andrew";
        String lastName = "Yee";

        // Primative data types
        int age = 29;
        boolean isStudent = true;
        double weight = 145;
        char grade = 'A';

        // Wrapper class data types
        Integer age2 = 29;
        Boolean isStudent2 = true;
        Double weight2 = 145;
        Character grade2 = 'A';

        System.out.println(firstName + " " + lastName);
        System.out.println(age + "\n" + isStudent + "\n" +weight + "\n" + grade);
        System.out.println(Integer.MAX_VALUE);

        // -------------- Conditionals --------------

        // --- If Else Statements ---
        // if(weight < 100) {
        //     System.out.println( "you need to gain some weight");
        // } else {
        //     System.out.println("you are good on weight");
        // }

        // --- Ternaries ---
        System.out.println(weight < 100 ? "you need to gain some weight" :"you are good");


        // -------------- Strings built in methods --------------
        String name = "Abrar Hussain";
        System.out.println(name.length());

        String fullName = firstName.concat(lastName);
        System.out.println(fullName);

        // -------------- String formating --------------
        String greeting = String.format("Hi %s, you are %d years old", firstName, age);
        System.out.println(greeting);
        System.out.printf("hi %s, you are %d years old \n",  firstName, age );

        // -------------- Java Class vs Variable compairison --------------
        String firstName1 = "Martha";
        String firstName2 = new String("Martha");
        String firstName3 = "Martha";

        System.out.println(firstName1 == firstName2);
        System.out.println(firstName1 == firstName3);

        System.out.println(firstName1.equals(firstName2));

        System.out.println(age2.intValue() == age);
    }
}