public class EmailApp {

    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith");
        em1.setMailCapacity(10000);
        System.out.println(em1.showInfo());
    }
}