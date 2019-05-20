public class Punt {
    private int[] coord= new int[2];

    public Punt(int x, int y) throws IllegalArgumentException {
        if(x<0 || y<0){
            throw new IllegalArgumentException();
        }
        else {
            this.coord[0] = x;
            this.coord[1] = y;
        }
    }

    public int getX() {
        return coord[0];
    }

    public int getY() {
        return coord[1];
    }

    public void setX(int x) throws IllegalArgumentException {
        if(x<0){
            throw new IllegalArgumentException();
        }
        else {
            this.coord[0] = x;
        }
    }

    public void setY(int y) throws IllegalArgumentException {
        if(y<0){
            throw new IllegalArgumentException();
        }
        else {
            this.coord[1] = y;
        }
    }
    public void suma(Punt p) { coord[0]+=p.getX(); coord[1]+=p.getY(); }
}
