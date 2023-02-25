public class MoveableCircle implements Movable{
    private int radius;

    private MovaeblePoint center;

    public MoveableCircle(int x , int y ,int xSpeed , int ySpeed,int radius){
        this.center = new MovaeblePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }
    public String toString(){
        return String.format("%s, radius=%d" , this.center.toString(), this,radius);}



    @Override
    public void moveUp() {
        this.center.moveUp();

    }

    @Override
    public void moveDown() {
        this.center.moveDown();

    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();

    }

    @Override
    public void moveRight() {
        this.center.moveRight();

    }

}
