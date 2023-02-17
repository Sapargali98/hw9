public class Temperature {
    private double t;
    private char c;

    public Temperature(double t,char c) {
        this.c='C';
        this.t=0.0;
    }
    public Temperature (double t) {
          this.t=t;
      }
      public Temperature (char c) {
          this.c=c;
      }
     /* public Temperature (double t,char c) {
          this.c=c;
          this.t=t;
      }

     */
    public double  degreesC (double t) {
        return  5*(t - 32)/ 9;
    }
    public double  degreesF (double t) {
        return 9*(t/5) + 32;

    }


    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

}

