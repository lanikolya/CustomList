package com.company;


public class Main {

    public static void main(String[] args) {
//      Initialize objects of Person class;
        Person coworker1 = initPersonConstructor("Muntian N.G.", 51, "Director");
        Person coworker2 = initPersonConstructor("Chebercus A.P.", 55, "Technical Director");
        Person coworker3 = initPersonConstructor("Chebercus S.A.", 29, "Electrition");
        Person coworker4 = initPersonConstructor("Muntian N.N.", 26, "Electrician Engineer");
        Person coworker5 = initPersonConstructor("Zverev A.N.", 35, "Electrician");

//      Create object of CustomList class
        CustomList<Person> customList = new CustomList();

        System.out.println("//Testing methods of list");

        System.out.println("\t" + "Action1:");
        System.out.println("//Add objects to the list");
        customList.add(coworker1);
        customList.add(coworker2);
        customList.add(coworker3);
        customList.add(coworker4);
        customList.add(coworker5);

        System.out.println("\t" + "Action2:");
        System.out.println("//Calling method size");
        System.out.println(customList.size());

        System.out.println("\t" + "Action3:");
        System.out.println("//Display our list");
        customList.display();

        System.out.println("\t" + "Action4:");
        System.out.println("//Calling method get");
        System.out.println("//Enter incorrect index");
        System.out.println(customList.get(7));
        System.out.println("//Enter correct index");
        System.out.println(customList.get(2));

        System.out.println("\t" + "Action5:");
        System.out.println("//Display our list");
        customList.display();

        System.out.println("\t" + "Action6:");
        System.out.println("//Calling method isEmpty");
        System.out.print("Is empty:" + "\t");
        System.out.println(customList.isEmpty());

        System.out.println("\t" + "Action7:");
        System.out.println("//Calling method removeForIndex");
        System.out.println("//Enter incorrect index");
        System.out.println(customList.removeForIndex(8));
        System.out.println("//Enter correct index");
        System.out.println(customList.removeForIndex(0));

        System.out.println("\t" + "Action8:");
        System.out.println("//Calling method removeForObject");
        System.out.println("//Enter of object which is not contained in the list");
        System.out.println(customList.removeForObject(coworker1));
        System.out.println("//Enter of object which is contained in the list");
        System.out.println(customList.removeForObject(coworker2));

        System.out.println("\t" + "Action9:");
        System.out.println("//Check size of list");
        System.out.println(customList.size());

        System.out.println("\t" + "Action10:");
        System.out.println("//Calling method contains");
        System.out.println("//Enter of object which is not contained in the list");
        System.out.print("Contains:" + "\t");
        System.out.println(customList.contains(coworker2));
        System.out.println("//Enter of object which is contained in the list");
        System.out.print("Contains:" + "\t");
        System.out.println(customList.contains(coworker4));


        System.out.println("\t" + "Action11:");
        System.out.println("//Display our list");
        customList.display();

        System.out.println("\t" + "Action12:");
        System.out.println("//Clone list");
        CustomList<Person> cloneList = customList.clone();
        cloneList.display();

        System.out.println("\t" + "Action13:");
        System.out.println("//Trying to assign object of customList to variable of type Person and display it");
        Person d = customList.get(2);
        System.out.println(d);

        System.out.println("\t" + "Action14:");
        System.out.println("//Calling method indexOf");
        System.out.println("//Enter of object which is not contained in the list");
        System.out.println(customList.indexOf(coworker1));
        System.out.println("//Enter of object which is contained in the list");
        System.out.println(customList.indexOf(coworker4));

        System.out.println("\t" + "Action15:");
        System.out.println("//Calling method toArray");
        customList.toArray();

        System.out.println("\t" + "Action16:");
        System.out.println("//Calling method clear");
        customList.clear();

        System.out.println("\t" + "Action17:");
        System.out.println("//Display our list");
        customList.display();

    }

    public static Person initPersonConstructor(String name, int age, String position) {
        Person person = new Person(name, age, position);
        return person;
    }

    public static void getPerson(Person coworker) {
        System.out.println("coworker:");
        System.out.println("Name=" + coworker.getName() + "\t" +
                "Age=" + coworker.getAge() + "\t" + "Job=" + coworker.getJob());
    }

}

