public class Father extends Grandfather{

    public Father(int age, String name, GENDER gender, Profession job) {
        super(age, name, gender, job);
    }
    public void printFather (){
        System.out.println( "this Father");
    }
    final public void printFather (String Father){
        System.out.println(Father);
    }
}
