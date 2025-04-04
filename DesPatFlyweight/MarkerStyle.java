public class MarkerStyle{
    String icon;
    String color;
    public MarkerStyle(String icon, String color){
        this.icon=icon;
        this.color=color;
    }
    public void display(int x, int y){
        System.out.println("displaying " + icon + " in " + color + " at (" + x + ", " + y + ")");
    }
}