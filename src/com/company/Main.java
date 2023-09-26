package com.company;

public class Main {

    public static void main(String[] args) {

        QuestionService service = new QuestionService();
        System.out.println("WELCOME TO THE JAVA QUIZ");
        service.displayQuestions();
        service.printScore();

    }
}
