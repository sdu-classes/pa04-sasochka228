public class MoveableCircle implements Movable{
    private int radius;

    public MovaeblePoint center;

    public MoveableCircle(int x , int y ,int xSpeed , int ySpeed,int radius){
        center = new MovaeblePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }

    @Override
    public void moveUp() {center.moveUp();

    }

    @Override
    public void moveDown() {center.moveDown();

    }

    @Override
    public void moveLeft() {center.moveLeft();

    }

    @Override
    public void moveRight() {center.moveRight();

    }
    public String toString(){
        return "("+center.x + "," + center.y + "), speed =("+center.xSpeed + ","+center.ySpeed+"), radius = "+radius;
}}
