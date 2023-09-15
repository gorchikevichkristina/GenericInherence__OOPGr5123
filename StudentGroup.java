import java.util.Iterator;
import java.util.List;

public class StudentGroup<T extends Comparable<T>, V> implements Iterable<Student<T, V>> {
    private List<Student<T, V>> group;
    private V idGroup;

    public StudentGroup(List<Student<T, V>> group, V idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student<T, V>> getGroup() {
        return this.group;
    }

    public void setGroup(List<Student<T, V>> group) {
        this.group = group;
    }

    public V getIdGroup() {
        return this.idGroup;
    }

    public void setIdGroup(V idGroup) {
        this.idGroup = idGroup;
    }

    public String toString() {
        return "StudentGroup{group=" + this.group + ", idGroup=" + this.idGroup + '}';
    }

    public Iterator<Student<T, V>> iterator() {
        return new StudentIterator(this.group);
    }
}
