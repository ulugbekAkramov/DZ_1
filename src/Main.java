public class Main {
    public static void main(String[] args) {
        Father father = new Father(45, "Sadyr",new GENDER("Male"),Profession.DOCTOR);
Son son = new Son(20,"Murat", new GENDER("Male"),Profession.STUDENT);
Son son1 = new Son(22,"Elbrus", new GENDER("Male"),Profession.POLICEMEN);
father.printFather();
father.printFather("java");
son.printFather();
        System.out.println("father age " + father.getAge() + "\nfather name " + father.getName() + "\nfather gender "+ father.getGender().getGender()+ "\n father profession " + father.getJob());
        System.out.println("son age " + son.getAge() + "\n son name " + son.getName() + "\n son gender "+ son.getGender().getGender()+ "\n son profession " + son.getJob());
        System.out.println("son1 age " + son1.getAge() + "\n son1 name " + son1.getName() + "\n son1 gender "+ son1.getGender().getGender()+ "\n son1 profession " + son1.getJob());
    }

}