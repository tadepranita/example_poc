public class Executor {
    public static void main(String args[]){
        Person sushil = new Person();

        sushil.setName("Sushil Ganeshrao");
        sushil.setAge(28);
        sushil.setGender("Male");

        System.out.println("Name of sushil: " +sushil.getName());
        System.out.println("Age of sushil: " +sushil.getAge());
        System.out.println("Gender of sushil: " +sushil.getGender());
        System.out.println(sushil.getName() +" " +sushil.getAge() +" "+sushil.getGender());

        Person pranita =new Person();

        pranita.setName("pranita Ganeshrao");
        pranita.setAge(22);
        pranita.setGender("Female");

        System.out.println("Data of pranita: " +pranita.getName());
        System.out.println("Age of pranita: " +pranita.getAge());
        System.out.println("Gender of pranita: " +pranita.getGender());
        System.out.println(pranita.getName() +" " +pranita.getAge() +" "+pranita.getGender());

    }

}
