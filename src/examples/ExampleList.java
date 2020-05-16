package example;

import entities.Employee;
import util.List;

public class ExampleList {
    public static void main(String[] args) {
        List<Employee> list = new List<>();
        //adding elements to the list
        list.addLast(new Employee(1, "Rodrigo", "98898899965", "TI"));
        list.addLast(new Employee(4, "Jefferson", "428923649965", "AD"));
        list.addLast(new Employee(5, "Kléber", "369487299965", "CRM"));
        list.addFirst(new Employee(2, "Antonio", "08878895865", "RH"));
        list.add(new Employee(3, "Vinicius", "08874023665", "ADM"), 1);
        System.out.println(list);
        //removing elements to the list
        list.remove(1);
        list.removeLast();
        list.removeFirst();
        System.out.println(list);

        list.addLast(new Employee(5, "Kléber", "369487299965", "CRM"));
        list.addFirst(new Employee(2, "Antonio", "08878895865", "RH"));
        list.add(new Employee(3, "Vinicius", "08874023665", "ADM"), 1);
        list.sort(); //sorting the list (by id)
        System.out.println(list);
        //searching if an element exists (by id)
        System.out.println(list.binarySearch(new Employee(5, "", "", "")));
        //getting the index of an element (by id)
        System.out.println(list.indexOf(new Employee(5, "", "", "")));
    }
}