public class MoveableCircle implements Movable{
    private int radius1;

    private MovaeblePoint center;

    MoveableCircle(int x , int y ,int xSpeed , int ySpeed,int radius){
        center = new MovaeblePoint(x,y,xSpeed,ySpeed);
        radius1=radius;
    }
    public String toString(){
        return String.format("(%1$s, %2$s), speed=(%3$s, %4$s), radius=%4$s" ,
                center.x, center.y, center.xSpeed,center.ySpeed, radius1);}


    public void moveUp() {center.moveUp();

    }


    public void moveDown() {center.moveDown();

    }


    public void moveLeft() {center.moveLeft();

    }


    public void moveRight() {center.moveRight();

    }
}
