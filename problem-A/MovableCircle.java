public class MoveableCircle implements Movable{
    private int radius1;

    private MovaeblePoint center;

    public MoveableCircle(int x , int y ,int xSpeed , int ySpeed,int radius){
        center = new MovaeblePoint(x,y,xSpeed,ySpeed);
        radius1=radius;
    }
    public String toString(){
        return String.format("(%1$s, %2$s), speed=(%3$s, %4$s), radius=%5$s" ,
                center.x, center.y, center.xSpeed,center.ySpeed, radius1);}

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
}
