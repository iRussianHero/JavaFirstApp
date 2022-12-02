import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static  void main(String[] args){
        CompareAverage compareAverage = new CompareAverage();
        Set set = new TreeSet(compareAverage);
        set.add(new Student("Roman", "Yakushev", 4));
        set.add(new Student("Fedor", "Petrosyan", 3));
        set.add(new Student("Kirill", "Kireev", 5));
        set.add(new Student("Elena", "Mudraya", 1));
        set.add(new Student("Olga", "Svetlaya", 2));

        System.out.println("Average evaluation:");

        for (Object o : set){
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
class CompareAverage implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        return s1.averageEvaluation - s2.averageEvaluation;
    }
    public int compareFirstName(Student s1, Student s2){
        return s1.firstName.compareTo(s2.firstName);
    }
    public int compareLastName(Student s1, Student s2){
        return s1.lastName.compareTo(s2.lastName);
    }
}