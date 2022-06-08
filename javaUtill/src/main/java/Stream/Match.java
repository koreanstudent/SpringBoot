package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Match {

  public static void main(String[] args) {
    getString();
    getObject();
  }

  private static void getString() {
    List<String> oldList = Arrays.asList("1", "2", "3", "4");
    List<String> newList = Arrays.asList("3", "4", "5", "6");

    List<String> resultList1 = oldList.stream()
        .filter(x -> newList.stream().noneMatch(Predicate.isEqual(x)))
        .collect(Collectors.toList());

    System.out.println(resultList1); // [1, 2]

    List<String> resultList2 = newList.stream()
        .filter(x -> oldList.stream().anyMatch(Predicate.isEqual(x)))
        .collect(Collectors.toList());

    System.out.println(resultList2); // [5, 6]
  }

  private static void getObject() {
    List<Dog> dogList = new ArrayList<>();

    dogList.add(new Dog("강아지1", 11));
    dogList.add(new Dog("강아지2", 12));
    dogList.add(new Dog("강아지3", 13));

    List<Cat> catList = new ArrayList<>();

    catList.add(new Cat("고양이1", 13));
    catList.add(new Cat("고양이2", 14));
    catList.add(new Cat("고양이3", 15));


    List<Cat> existAge = catList
        .stream()
        .filter(cat -> dogList.stream().anyMatch(dog -> dog.getAge() ==cat.getAge()))
        .collect(Collectors.toList());

    for (Cat cat : existAge){
      System.out.println("existAge : " + cat.getAge());
    }
  }


  public static class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }
  }

  public static class Cat {

    private String name;
    private int age;

    public Cat(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }
  }
}
