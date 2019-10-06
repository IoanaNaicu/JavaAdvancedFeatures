package Collection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import shapesPackage.Point;
import shapesPackage.UncomparablePoint;

import javax.sound.sampled.Line;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Phaser;

public class MapApp {
    public static void main(String[] args) {
        //Map<UncomparablePoint,String> descriptionByPoint = new HashMap<>();
        Map<UncomparablePoint,String> descriptionByPoint = new LinkedHashMap<>();


        UncomparablePoint point1 = new UncomparablePoint(1, 2);
        UncomparablePoint point2 = new UncomparablePoint(5, 100);
        UncomparablePoint point3 = new UncomparablePoint(7, 9);
        UncomparablePoint point4 = new UncomparablePoint(7,9);

        descriptionByPoint.put(point1, "Punctul1");
        descriptionByPoint.put(point2, "Punctul2");
        descriptionByPoint.put(point3, "Punctul3");
        descriptionByPoint.putIfAbsent(point4, "Punctul4");

        System.out.println(descriptionByPoint);


    }
}
