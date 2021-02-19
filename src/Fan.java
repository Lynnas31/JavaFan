public class Fan {
    final int SLOW = 1;
    final int Medium = 2;
    final int Fast = 3;
    private int SPEED = SLOW;
    private boolean On = false;
    private double RADIUS = 5;
    private String COLOR = "blue";
    public Fan(){}
    public int getSLOW(){
        return SLOW;
    }
    public int getMedium(){
        return Medium;
    }
    public int getFast(){
        return Fast;
    }
    public int getSPEED(){
        return SPEED;
    }
    public boolean isOn(){
        return On;
}
    public String getCOLOR(){
        return COLOR;
    }
    public double getRADIUS(){
        return RADIUS;
    }
    public  void setSPEED(int speed){
        this.SPEED = speed;
    }
    public  void setRADIUS(double radius){
        this.RADIUS = radius;
    }
    public void setOn(boolean x){
        this.On = x;
    }
    public void setCOLOR(String x){
        this.COLOR =x;
    }
    public String toString(){
        if(On){
            return "Speed" + SPEED + "Color" + COLOR + "Radius " + RADIUS + "fan is on";
        }
        return "fan is off";
    }
}
