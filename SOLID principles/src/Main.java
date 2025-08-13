import LiskovSubstitution.*;
import OpenAndClose.AreaCalculation;
import OpenAndClose.Circle;
import OpenAndClose.Shape;
import OpenAndClose.Triangle;
import SingleResponsiblity.Employee;
import SingleResponsiblity.Employee1;
import SingleResponsiblity.ReportGenerate;
import SingleResponsiblity.SalaryCalculation;

class Main {
    public static void main(String[] args) {

        /*
         *   Single responsibility principle
         *   Notes:
         *          A class should have only one reason to change, meaning it should have
         *   only one job or responsibility.
         */
        singleResponsibilityPrinciple();

        /*
         *  Open /closed  principle
         *  Notes:
         *      Software entities should be open for extension but closed for modification.
         *  This allows adding new function without change existing functionality
         */
        openAndClosedPrinciple();

        /*
         *  Liskov substitution  principle
         *  Notes:
         *      Objects of a superClass should be replaceable with objects of the subclass
         *  without affecting correctness the program.
         */

        liskovSubstitutionPrinciple();


    }

    static void singleResponsibilityPrinciple() {

        /*
         *   violation of Single responsibility principle
         */

        Employee employee = new Employee("Yoga", 10000);
        System.out.println(employee.salaryCalculation());
        employee.generateReport();

        /*
         *   Valid Single responsibility principle
         */

        Employee1 e = new Employee1("Yoga", 10000);
        SalaryCalculation sc = new SalaryCalculation();
        ReportGenerate rg = new ReportGenerate();
        System.out.println(sc.salaryCalculation(e));
        rg.generateEmployeeReport(e);

        System.out.println("!-----------------------!");
    }

    static void openAndClosedPrinciple() {
        /*
         *   violation of Open/ closed principle
         */

        AreaCalculation ac = new AreaCalculation();
        System.out.println(ac.calculateArea("circle", 2.3, 0, 0));
        System.out.println(ac.calculateArea("triangle", 0, 4.0, 8));

        /*
         *   Valid Open/ closed principle
         */

        Shape shape = new Circle(4.5);
        Shape shape1 = new Triangle(4.9, 2);

        System.out.println(shape.calculateArea());
        System.out.println(shape1.calculateArea());

        System.out.println("!-----------------------!");
    }

    static void liskovSubstitutionPrinciple() {

        /*
         * violation of liskovSubstitution principle
         */

        TwoWheeler tw = new Hero();
        System.out.println(tw.maxSpeed());
        System.out.println(tw.petrolLevel());
        TwoWheeler tw1 = new Ather();
        System.out.println(tw1.maxSpeed());
//        System.out.println(tw1.petrolLevel());

        /*
         *   Valid liskovSubstitution principle
         */

        TwoWheelers ktm = new KTM();
        TwoWheelers ola = new Ola();
        System.out.println(ktm.maxSpeed());
        System.out.println(ola.maxSpeed());

        PetrolTwowheelers ptw = new KTM();
        System.out.println(ptw.petrolLevel());


    }

}
