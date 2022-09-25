public class Grandfather {
    private int age;
    private String name;
    private GENDER gender;
    private Profession job;

    public Grandfather(int age, String name, GENDER gender, Profession job) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public GENDER getGender() {
        return gender;
    }

    public Profession getJob() {
        return job;
    }
}
