public class Rabbit extends Animal implements Pet {
    private String name;

    Rabbit(String name){
        super(4);
        this.name = name;

    }
    Rabbit(){
        this("");
    }




    @Override
    void eat() {
        System.out.println("Cat is something");

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
        System.out.println("Cat is playing");

    }
}
