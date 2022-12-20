public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        //Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        var friend = 19;
        var frog = 3.5;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 2
        System.out.println("Задача 2");
        dog = dog + 4; /* значение уже объявленной ранее переменной перезаменяется этой строчкой (ее значение увеличивается на 4) */
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 4
        System.out.println("Задача 4");
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Задача 5
        System.out.println("Задача 5");
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }
}