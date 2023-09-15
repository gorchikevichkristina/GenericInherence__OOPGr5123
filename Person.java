public abstract class Person<T, V> {
    private T name;
    private V age;

    public Person(T name, V age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return this.name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public V getAge() {
        return this.age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    public String toString() {
        return "Person [name=" + this.name + ", age=" + this.age + "]";
    }
}