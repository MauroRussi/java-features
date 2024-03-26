package co.com.mrsoft.test.java14;

import co.com.mrsoft.test.java14.records.Point;

/**
 * Examples of record.
 * Point "data class" or "record" was defined in records/Point.java file.
 */
public class Example3 {
    public static void main(String[] args) {
        // Record is used as a traditional object.
        Point p1 = new Point(10, 20);
        System.out.println(p1.x());         // 10
        System.out.println(p1.y());         // 20

        // Record has setters and getters.
        Point p2 = new Point(11, 22);
        System.out.println(p2.x());         // 11
        System.out.println(p2.y());         // 22

        Point p3 = new Point(10, 20);
        System.out.println(p3.x());         // 10
        System.out.println(p3.y());         // 20

        // Record has hashCode method.
        System.out.println(p1.hashCode());  // 330
        System.out.println(p2.hashCode());  // 363
        System.out.println(p3.hashCode());  // 330

        // Record has equals method.
        System.out.println(p1.equals(p2));  // false
        System.out.println(p1.equals(p3));  // true
        System.out.println(p2.equals(p3));  // false
    }
}
