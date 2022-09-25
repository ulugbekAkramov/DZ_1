final class Son extends Father{
    public Son(int age, String name, GENDER gender, Profession job) {
        super(age, name, gender, job);
    }
    @Override
    public void printFather (){
        System.out.println( "this Son");
    }
}
