import java.math.BigDecimal;

public class Airconditioner {
    private String color;
    private double horsePower;
    private int temprature;

    public Airconditioner() {}

    public Airconditioner(String acColor) {
        this(acColor, BigDecimal.ZERO.intValue());
    }

    public Airconditioner(String acColor, double horsePower) {
        this(acColor; horsePower, BigDecimal.ZERO.intValue());
        // this here maens give me another constructor of the variables in bracket
    }


    public Airconditioner(String acColor, double horsePower,int temp){
        this.color = acColor;
        this.horsePower = horsePower;
        temprature = temp;
    }
}
