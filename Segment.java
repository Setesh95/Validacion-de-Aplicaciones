public class Segment {
    private Punt p1;
    private Punt p2;

    public Segment() {
        p1=new Punt(0,0);
        p2=new Punt(0,0);
    }

    public Segment(int p1_x, int p1_y, int p2_x, int p2_y) {
        p1=new Punt(p1_x,p1_y);
        p2=new Punt(p2_x,p2_y);
    }

    public Punt getP1() {
        return p1;
    }

    public Punt getP2() {
        return p2;
    }

    public void setP1(Punt p1) {
        this.p1 = p1;
    }

    public void setP2(Punt p2) {
        this.p2 = p2;
    }

    public double longitud(){
        return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(), 2));
    }

}
