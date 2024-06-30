//1. Реализуйте 1 из вариантов класса Cat из предыдущего задания,
//можно использовать не все придуманные поля и методы.
// Создайте несколько экземпляров этого класса, выведите их в консоль.
//. Добейтесь того, чтобы при выводе в консоль объекта типа Cat,
// выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
//1. Создайте множество, в котором будут храниться экземпляры
// класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
//2. Создайте 2 или более котов с одинаковыми параметрами в полях.
// Поместите их во множество. Убедитесь, что все они сохранились во множество.
//3. Создайте метод
//**public boolean**
//equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях.
// То есть, метод должен возвращать true, только если значения во всех полях
// сравниваемых объектов равны.
//4. Создайте метод
//**public int hashCode()**
// который будет возвращать hash, вычисленный на основе полей класса Cat.
// (Можно использовать Objects.hash(...))
//5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

import java.util.HashSet;
import java.util.Set;

public class task_OOP {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", "Meinkun", "Ivan Ivanovich", 5);
        Cat cat2 = new Cat("Murzik", "Meinkun", "Ivan Ivanovich", 5);
        Cat cat3 = new Cat("Barsik", "Cheshir", "Vasiliy Petrovich", 5);
        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        System.out.println(set);
        System.out.println(cat1.equals(cat2));
    }
}