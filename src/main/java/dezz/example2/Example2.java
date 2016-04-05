package dezz.example2;

import java.util.ArrayList;
import java.util.List;

interface Humanoid {
    public void sayName();
}

class Pablo implements Humanoid {

    public void sayName()
    {
        System.out.println("Hi! I alien Pablo!!!");
    }

}

class Zhenek implements Humanoid {

    public void sayName()
    {
        System.out.println("Hi! My name Zhenek and I QA");
    }

}

class Student implements Humanoid {

    public String name;

    public Student(String name)
    {
        this.name = name;
    }

    public void sayName()
    {
        System.out.println("Hi! I am student and my name is: " + this.name);
    }

}

public class Example2 {

    public static void main(String[] args)
    {

        // не правильно
        Student human1 = new Student("Petya");
        Student human2 = new Student("Vasa");
        Zhenek human3 = new Zhenek();
        Pablo human4 = new Pablo();

        human1.sayName();
        human2.sayName();
        human3.sayName();
        human4.sayName();


        // так надо
        // завись от интерфеса а не от класса
        List<Humanoid> humans = new ArrayList<Humanoid>();

        humans.add(new Student("Kolya"));
        humans.add(new Student("Orest"));
        humans.add(new Zhenek());
        humans.add(new Pablo());

        for (Humanoid human : humans) {
            human.sayName();
        }

    }

}
