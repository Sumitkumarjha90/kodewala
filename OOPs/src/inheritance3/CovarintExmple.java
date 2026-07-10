package inheritance3;

// Parent class
class GenericResponse {

    public GenericResponse getResponse() {
        System.out.println("Generic Response");
        return new GenericResponse();
    }
}

// Child class
class PaymentSystem1 extends GenericResponse {

    // Covariant return type (returning child type)
    @Override
    public PaymentSystem1 getResponse() {
        System.out.println("Payment Response");
        return new PaymentSystem1();
    }
}

// Main class
public class CovarintExmple {

    public static void main(String args[]) {

        GenericResponse obj;

        obj = new PaymentSystem1();  // Parent reference, child object

        obj.getResponse(); // Calls child method
    }
}