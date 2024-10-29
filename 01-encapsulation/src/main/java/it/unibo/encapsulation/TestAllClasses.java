package it.unibo.encapsulation;

public class TestAllClasses {
    public static void main(final String[] args) {
        final Calculator calc = new Calculator();

        System.out.println(calc.getOperationsPerformed()); //get per testarlo in terminale
        System.out.println(calc.getLastResult()); //get per testarlo in terminale
        Calculator.printCalculatorStatus(calc);
        System.out.println("-1-(+2)=" + calc.sub(-1, 2));
        System.out.println("");

        System.out.println(calc.getOperationsPerformed());
        System.out.println(calc.getLastResult());
        Calculator.printCalculatorStatus(calc);
        System.out.println("8*3=" + calc.mul(8, 3));
        System.out.println("");
        
        System.out.println(calc.getOperationsPerformed());
        System.out.println(calc.getLastResult());
        Calculator.printCalculatorStatus(calc);
        System.out.println("8/4=" + calc.div(8, 4));
        System.out.println("");

        final Smartphone htcOne = new Smartphone("HTC", "One", 1024);
        final Smartphone note3 = new Smartphone(4, 2048, 8192, "Samsung", "Galaxy Note 3", true, true, true);
        htcOne.printStringRep();
        note3.printStringRep();
    }
}
