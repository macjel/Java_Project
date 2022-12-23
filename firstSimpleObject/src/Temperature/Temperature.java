package Temperature;

public class Temperature {
    int stopnie;

    public Temperature(int stopnie) {
        this.stopnie=stopnie;
    }
    public int resolt1() {
        return stopnie*2;
    }
    public double resolt2(){
        return stopnie+273.15;
    }
}