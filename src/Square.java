public class Square {
    double a;
    public Square(double a) {
        this.a = a;
    }
    @Override
    public String toString() {
        return "Сторона=" + a;
    }
    public double myP(double a) {
        return 4*a;
    }
    public double myS(double a) {return a*a;}
    public double myD(double a) {return Math.sqrt(2)*a;}
}
