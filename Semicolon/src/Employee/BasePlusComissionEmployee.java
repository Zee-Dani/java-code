package Employee;

public class BasePlusComissionEmployee extends ComissionEmployee {
    private double baseSalary;

   public  BasePlusComissionEmployee(String name,String surname,String social,double sales,double comission,double base){
        super(name, surname, social);
        baseSalary = base;}

        public double earnings() {
        return  baseSalary  + super.earnings();
        }

        public double getBaseSalary(){
            return baseSalary;
        }

        public void setBaseSalary(double baseSalary) {
              this.baseSalary = baseSalary;
    }

}
