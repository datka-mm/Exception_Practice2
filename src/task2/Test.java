package task2;

import java.util.Scanner;

public class Test {

    private final String[] questions = {"1. What is Java? \n a)Language b)Name c)I don't know", "2. My name is?\na)Datka b)Ulan c)Aijamal", "3. Your name is? \n a)You b)I don't know c)Hello", "4. Capital of USA?\na)Bishkek b)Washington c)London", "5. My favorite food is?\na)Manty b)Plov c)KFC"};
    private final String[] answers = {"a", "a", "b", "b", "a"};

    public void passTest() {
        try {
            boolean[] array = new boolean[questions.length];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                System.out.println("CHOOSE ONE VARIANT: a , b, c");
                String choice = scanner.nextLine().toUpperCase();
                if (choice.equals("a".toUpperCase()) || choice.equals("b".toUpperCase()) || choice.equals("c".toUpperCase())) {
                    if (choice.equals(answers[i].toUpperCase())) {
                        array[i] = true;
                    }
                } else {
                    throw new MyException("Error");
                }
            }

            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i]) {
                    counter++;
                }
            }

            if (counter == 5) {
                System.out.println("Good job your point is: " + 100 + " of 100");
            } else if (counter == 4) {
                int point = (100 *4) / 5;
                System.out.println("Your point is: " + point + " of 100");
            } else if (counter == 3) {
                int dk = (100 * 3) / 5;
                System.out.println("Your point is: " + dk + " of 100");
            } else if (counter == 2) {
                int dm = (100 * 2) / 5;
                System.out.println("Your point is: " + dm + " of 100");
            } else if (counter == 1) {
                int dd = (100) / 5;
                System.out.println("Your point is: " + dd + " of 100");
            } else {
                System.out.println("Your point is: " + 0 + " of 100");
            }
            
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

}
