public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("José", "R. Bolinha, 123");
        System.out.println(p);
        p.setAddress("R. Quadrado, 312");
        System.out.println(p);

        Staff s = new Staff("Pedro", "R. 9, 300", "Católica SC", 1000);
        System.out.println(s);
        System.out.println("Nome: " + s.getName());
        s.setAddress("R. Cascal, 3");
        System.out.println(s);

        Student st = new Student("João", "João da Silva", "Teste", 2, 800);
    }
}

