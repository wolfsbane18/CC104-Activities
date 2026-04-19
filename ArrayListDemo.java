import java.util.*;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> Name = new ArrayList<String>();
        ArrayList<Integer> Age = new ArrayList<Integer>();
        ArrayList<Double> Grade = new ArrayList<Double>();

        Name.add("Cassandra");
        Name.add("Lily");
        Name.add("Cassy");
        Name.add(0, "Sandy");

        Age.add(27);
        Age.add(2);
        Age.add(7);
        Age.add(3, 12);

        Grade.add(98.5);
        Grade.add(97.5);
        Grade.add(96.5);
        Grade.add(1, 99.5);

        System.out.println(Name);
        System.out.println(Age);
        System.out.println(Grade);

        for (int i = 0; i < Grade.size(); ++i) {
            System.out.println("Name: " + Name.get(i));
            System.out.println("Age: " + Age.get(i));
            System.out.println("Grade: " + Grade.get(i));
            System.out.println();
        }
    }
}
