package car.example.constructor.injection;

public class car {
    private specification Specification;

    public car(specification Specification) {
        this.Specification = Specification;
    }

    public void display(){
        System.out.println("car details:"+Specification.toString());
    }

}
