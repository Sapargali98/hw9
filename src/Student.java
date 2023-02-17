public class Student {
    private String name;
    private double id;
    private double year;
    public Student (String name,double id,double year) {
        this.name=name;
        this.id=id;
        this.year=year;
    }
    public String getName() {
        return name;
    }
    public double getId() {
        return id;
    }
    public double getYear() {
        return year;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setId(double id) {
        this.id=id;
    }

}
