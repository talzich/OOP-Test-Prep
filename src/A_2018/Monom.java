package A_2018;

public class Monom implements function{

    private double coefficient;
    private  int power;

    public Monom(double a, int b){
        this.power = b;
        this.coefficient = a;
    }

    public Monom(Monom ot){
        this.power = ot.power;
        this.coefficient = ot.coefficient;
    }

    public int get_power(){return this.power;}
    public double getCoefficient(){return this.coefficient;}

    @Override
    public double f(double x){
        return coefficient*(Math.pow(x, power));
    }

    public void add(Monom m){

    }

    public void multiply(Monom m){

    }

    public boolean equals(Monom m){
        return (this.coefficient == m.coefficient && this.power == m.power);
    }

    public Monom derivative(){
        double newCoef = this.coefficient*this.power;
        int newPower = this.power-1;
        Monom derivative = new Monom(newCoef, newPower);
        return derivative;
    }
}
