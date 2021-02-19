public class Main {
    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.setSPEED(Fan1.getFast());
        Fan1.setCOLOR("yellow");
        Fan1.setOn(true);
        Fan1.setRADIUS(10);
        System.out.println(Fan1.toString());
    }
}
