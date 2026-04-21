package helpmethesetasksarecomingforme;

final class Point {
    private final double x, y;
    public Point(double x, double y) { this.x=x; this.y=y; }
    // getters, distanceTo()
    
    private final double distanceTo(Point other) {
    	return Math.sqrt(Math.pow((this.x - other.x), 2) + Math.pow((this.y - other.y), 2));
    }
}
