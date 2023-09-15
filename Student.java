public class Student<T extends Comparable<T>, V> extends Person<T, V> implements Comparable<Student<T, V>> {
    private V id;
    private V generalId;

    public Student(T name, V age) {
        super(name, age);
        this.id = this.generalId;
    }

    public V getId() {
        return this.id;
    }

    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + this.id + "]";
    }

    public int compareTo(Student<T, V> o) {
        return ((Comparable)super.getName()).compareTo((Comparable)o.getName());
    }
}