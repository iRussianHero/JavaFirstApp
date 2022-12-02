import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static  void main(String[] args){

        class CompareAverage implements Comparator<Student> {
            @Override
            public int compare(Student s1, Student s2){
                return s1.averageEvaluation - s2.averageEvaluation;
            }
        }

        CompareAverage compareAverage = new CompareAverage();
        Set set = new TreeSet(compareAverage);
        set.add(new Student("Roman", "Yakushev", 4));
        set.add(new Student("Fedor", "Petrosyan", 3));
        set.add(new Student("Kirill", "Kireev", 5));
        set.add(new Student("Elena", "Mudraya", 1));
        set.add(new Student("Olga", "Svetlaya", 2));

        System.out.println("Sort by Average evaluation:");
        for (Object o : set){
            System.out.println(o);
        }
        System.out.println("");

        class CompareFirstName implements Comparator<Student> {
            @Override
            public int compare(Student s1, Student s2){
                return s1.firstName.compareTo(s2.firstName);
            }
        }

        CompareFirstName compareFirstName = new CompareFirstName();
        Set set1 = new TreeSet(compareFirstName);
        set1.add(new Student("Roman", "Yakushev", 4));
        set1.add(new Student("Fedor", "Petrosyan", 3));
        set1.add(new Student("Kirill", "Kireev", 5));
        set1.add(new Student("Elena", "Mudraya", 1));
        set1.add(new Student("Olga", "Svetlaya", 2));

        System.out.println("Sort by First name:");
        for (Object o : set1){
            System.out.println(o);
        }
        System.out.println("");

        class CompareLastName implements Comparator<Student> {
            @Override
            public int compare(Student s1, Student s2){
                return s2.lastName.compareTo(s1.lastName);
            }
        }

        CompareLastName compareLastName = new CompareLastName();
        Set set2 = new TreeSet(compareLastName);
        set2.add(new Student("Roman", "Yakushev", 4));
        set2.add(new Student("Fedor", "Petrosyan", 3));
        set2.add(new Student("Kirill", "Kireev", 5));
        set2.add(new Student("Elena", "Mudraya", 1));
        set2.add(new Student("Olga", "Svetlaya", 2));

        System.out.println("Sort by Last name:");
        for (Object o : set2){
            System.out.println(o);
        }
    }
}

class Student{
    String firstName;
    String lastName;
    Integer averageEvaluation;

    public Student(String firstName, String lastName, Integer averageEvaluation){
        this.firstName=firstName;
        this.lastName=lastName;
        this.averageEvaluation=averageEvaluation;
    }

    @Override
    public String toString(){

        return firstName + " " + lastName+ " - " + averageEvaluation;
    }
}
