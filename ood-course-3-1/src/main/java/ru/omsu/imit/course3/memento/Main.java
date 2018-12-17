package ru.omsu.imit.course3.memento;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String str[] = "".split(" ");

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator);

        while(!"exit".equals(str[0])) {
            str = in.nextLine().split(" ");
            if("undo".equals(str[0])) {
                caretaker.undo();
                continue;
            }
            if("save".equals(str[0])) {
                caretaker.add(originator.save());
                continue;
            }
            if("print".equals(str[0])) {
                System.out.println(originator.toString());
                continue;
            }
            if("add".equals(str[0])) {
                originator.add(str[1]);
            }
        }
        System.out.println(originator.toString());

    }

}
