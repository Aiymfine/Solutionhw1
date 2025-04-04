public class MapMarker{
    int x;
    int y;
    MarkerStyle style;
public MapMarker(int x, int y, String icon, String color){
    this.x=x;
    this.y=y;
    this.style=MarkerStyleFactory.getStyle(icon, color);
}

public void display(){
    style.display(x, y);
}
}