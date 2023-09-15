import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public App() {
    }

    public static void main(String[] args) throws Exception {
        Student<String, Integer> s1 = new Student("Сергей", 25);
        System.out.println(s1);
        Student<String, Integer> s2 = new Student("Андрей", 26);
        Student<String, Integer> s3 = new Student("Даша", 23);
        List<Student<String, Integer>> listStud = new ArrayList();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        StudentGroup<String, Integer> group = new StudentGroup(listStud, 55555);
        Iterator var7 = group.iterator();

        while (var7.hasNext()) {
            Student<String, Integer> stud = (Student) var7.next();
            System.out.println(stud);
        }
    }
}

