public class Main {

    public static void main(String[] args) {
        Payable[] employees = new Payable[6];
        employees[0] = new SalariedEmployee("John","Smith","111-11-11",800.0);
        employees[1] = new HourlyEmployee("Karen","Price","222-22-22",16.75,40);
        employees[2] = new CommissionEmployee("Sue","Jones","333-33-33",10000,0.06);
        employees[3] = new BasePlusCommissionEmployee("Bob","Lewis","444-44-44",5000,0.04,300);
        employees[4] = new Invoice("01234","seat",2,375.00);
        employees[5] = new Invoice("56789","tire",4,79.95);
        for(Payable currentEmployee : employees){
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee= (BasePlusCommissionEmployee)currentEmployee;
                employee.setBaseSalary(1.10*employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }
            System.out.printf("earned is $%.2f%n%n",currentEmployee.getPaymentAmount());
        }

    }
}
