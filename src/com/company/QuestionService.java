package com.company;

import java.util.Scanner;

public class QuestionService {
    Questions[] questions = new Questions[5];

    public QuestionService(){
        questions[0] = new Questions(1,"Which component is used to compile, debug and execute the java programs?","JRE","JIT","JDK","JVM",3);
        questions[1] = new Questions(2,"What is the extension of java code files?",".js",".txt",".class",".java",4);
        questions[2] = new Questions(3,"Which exception is thrown when java is out of memory?","MemoryError","OutOfMemoryError","MemoryOutOfBoundsException","MemoryFullException",3);
        questions[3] = new Questions(4,"Which of the following is a superclass of every class in Java?","Object class","String","ArrayList","Abstract class",1);
        questions[4] = new Questions(5,"Which of these keywords are used for the block to be examined for exceptions?","check","try","catch","throw",2);
    }

    int[] ans = new int[questions.length];

    public void displayQuestions(){
        int i=0;
        for(Questions q:questions){
            System.out.println(q.getId()+" "+q.question);
            System.out.println("1. "+q.opt1+"  2. "+q.opt2+"\n"+"3. "+q.opt3+"  4. "+q.opt4);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose the correct option ");
            ans[i] = scanner.nextInt();
            i++;
        }

    }

    public void printScore(){
        int score=0;
        for (int i=0;i< questions.length;i++){
            Questions que = questions[i];
            int userans = ans[i];
            int accans = que.getAnswer();
            if (userans==accans){
                score+=100/ questions.length;
            }
            else{
                int wrongans= que.getId();
                System.out.println("Your answer for question no. "+wrongans+" is wrong");
                System.out.println("The correct option is "+que.getAnswer());
            }
        }
        System.out.println("You scored "+score+" points");
    }
}
