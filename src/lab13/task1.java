package lab13;

public class task1 {
    public static void main(String[] args) {
        String input = "I like Java!!!";

        // 2. Распечатать последний символ строки
        System.out.println("Последний символ: " + input.charAt(input.length() - 1));

        // 3. Проверить, заканчивается ли строка подстрокой "!!!"
        boolean endsWithExclamation = input.endsWith("!!!");
        System.out.println("Заканчивается на '!!!': " + endsWithExclamation);

        // 4. Проверить, начинается ли строка подстрокой "I like"
        boolean startsWithILike = input.startsWith("I like");
        System.out.println("Начинается с 'I like': " + startsWithILike);

        // 5. Проверить, содержит ли строка подстроку "Java"
        boolean containsJava = input.contains("Java");
        System.out.println("Содержит 'Java': " + containsJava);

        // 6. Найти позицию подстроки "Java"
        int positionOfJava = input.indexOf("Java");
        System.out.println("Позиция 'Java': " + positionOfJava);

        // 7. Заменить все символы "а" на "о"
        String replacedString = input.replace('а', 'o');
        System.out.println("После замены 'а' на 'о': " + replacedString);

        // 8. Преобразовать строку к верхнему регистру
        String upperCaseString = input.toUpperCase();
        System.out.println("Верхний регистр: " + upperCaseString);

        // 9. Преобразовать строку к нижнему регистру
        String lowerCaseString = input.toLowerCase();
        System.out.println("Нижний регистр: " + lowerCaseString);

        // 10. Вырезать строку "Java" с помощью метода substring
        String extractedJava = input.substring(positionOfJava, positionOfJava + "Java".length());
        System.out.println("Вырезанная строка 'Java': " + extractedJava);
    }
}
