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
        var boxer1 = 78.2;
        var boxer2 = 82.7;
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
        //Задача 6
        System.out.println("Задача 6");
        System.out.println("Вес первого боксера = " + boxer1 + " кг.");
        System.out.println("Вес Второго боксера = " + boxer2 + " кг.");
        var totalWeight = (boxer1+boxer2);
        System.out.println("Общий все боксеров = " + totalWeight + " кг.");
        //Задача 7
        System.out.println("Задача 7");
        //Вычислите разницу весов спортсменов, используйте 2 способа:
        // Вычитание из большего веса меньшего.
        var gapWeightBoxers = (boxer2 - boxer1);
        System.out.println("Разница веса спортсменов = " + gapWeightBoxers + " кг.");
        // С помощь функции остаток от деления.
        var gapWeightBoxers2 = (boxer2) % boxer1;
        System.out.println("Разница веса спортсменов остатком от деления = " + gapWeightBoxers2 + " кг.");
        //Задача 8
        System.out.println("Задача 8");
        var employeeDedicatesToWork = (8); // сотрудник посвящает работе
        System.out.println( employeeDedicatesToWork + " часов сотрудник посвящает работе.");
        var openingHours = (640); // Часов работы
        System.out.println( openingHours + " часов работы поделено между сотрудниками.");
        var TotalEmployeesInTheCompany = (openingHours / employeeDedicatesToWork); //Всего работников в компании
        System.out.println("«Всего работников в компании — " + TotalEmployeesInTheCompany + " человек».");
        var additionalStaff = (94); // в компании работает на 94 человека больше
        System.out.println("В компании работает на " + additionalStaff + " человека больше.");
        var employee = (TotalEmployeesInTheCompany + additionalStaff);// всего сотрудников
        var openingHours2 = (employee * employeeDedicatesToWork);// часов работы всего
        System.out.println("«Если в компании работает " + employee + " человек, то всего " + openingHours2 + " часов " +
        "работы может быть поделено между сотрудниками».");
    }
}