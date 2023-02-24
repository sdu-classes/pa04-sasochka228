public class Fish extends Animal implements Pet {
    private String name;
    Fish(){
        super(0);
    }
    @Override
    public void walk(){
        System.out.println("Fish can not walk");
    }


    @Override
    void eat() {
        System.out.println("Fish is eating");

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void play() {
        System.out.println("Fish is playing");

    }
}
