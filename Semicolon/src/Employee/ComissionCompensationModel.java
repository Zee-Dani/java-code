package Employee;

import java.lang.reflect.Constructor;

public class ComissionCompensationModel extends CompensationModel {
    private double grossSales;
    private double comissionRate;

    public ComissionCompensationModel(double sales, double comission){
        this.grossSales = sales;
        this.comissionRate = comission;
    }

    public double earnings() {
        return grossSales * comissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }
    public double  getComissionRate(){
        return comissionRate;

        public void setGrossSales(double sales){
            this.grossSales = sales;
        }

        public void setComissionRate(double comission){
            this. comissionRate= comission
        }
    }


}
