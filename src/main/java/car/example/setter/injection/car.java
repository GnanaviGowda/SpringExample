package car.example.setter.injection;

public class car {
    private specification Specification;

    public void setSpecification(specification Specification) {
        this.Specification = Specification;
    }

    public void display(){
        System.out.println("car details:"+Specification.toString());
    }

}
