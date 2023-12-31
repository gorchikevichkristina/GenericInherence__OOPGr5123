import java.util.Iterator;
import java.util.List;

public class StudentIterator<T extends Comparable<T>, V> implements Iterator<Student<T, V>> {
    private int counter;
    private List<Student<T, V>> students;

    public StudentIterator(List<Student<T, V>> students) {
        this.students = students;
        this.counter = 0;
    }

    public boolean hasNext() {
        return this.counter < this.students.size();
    }

    public Student<T, V> next() {
        return !this.hasNext() ? null : (Student)this.students.get(this.counter++);
    }
}
