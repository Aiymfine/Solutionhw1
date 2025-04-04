import java.util.List;
import java.util.ArrayList;
public class FlyweightPatternDemo{
    public static void main(String[] args){
        List<MapMarker> markers=new ArrayList<>();
        markers.add(new MapMarker(10, 20, "hospital", "red"));
        markers.add(new MapMarker(30, 40, "restaurant", "blue"));
        markers.add(new MapMarker(50, 60, "hospital", "red"));
        markers.add(new MapMarker(70, 80, "gas station", "green"));
         for(MapMarker marker: markers) {
            marker.display();
        }       
        System.out.println("total unique styles created: " + MarkerStyleFactory.styles.size());
        System.out.println("total markers created: " + markers.size());
    
    }
}
