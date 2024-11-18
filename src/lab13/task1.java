package lab13;

public class task1 {
    // Task 1
    public static void printSomeString(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str1 = "I like Java!!!";
        // Task 1
        printSomeString("Task 1:\n" + str1);
        // Task 2
        System.out.println("Task 2:\n" + str1.charAt(str1.length() - 1));
        // Task 3
        System.out.println("Task 3:\n" + str1.endsWith("!!!"));
        // Task 4
        System.out.println("Task 4:\n" + str1.startsWith("I like"));
        // Task 5
        System.out.println("Task 5:\n" + str1.contains("Java"));
        // Task 6
        System.out.println("Task 6:\n" + str1.indexOf("Java"));
        // Task 7
        System.out.println("Task 7:\n" + str1.replace('a', 'o'));
        // Task 8
        System.out.println("Task 8:\n" + str1.toUpperCase());
        // Task 9
        System.out.println("Task 9:\n" + str1.toLowerCase());
        // Task 10
        System.out.println("Task 10:\n" + str1.substring(0, str1.indexOf("Java"))
                + str1.substring(str1.indexOf("Java") + "Java".length()));

    }
}