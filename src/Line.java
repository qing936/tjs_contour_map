import java.util.List;

public class Line {
    private List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
        if (validate()) {
            throw new RuntimeException(ExceptionDescription.INITIALIZE_LINE_FAIL);
        };
        this.isClosed = points.get(0).equals(points.get(points.size()-1));
    }

    public boolean validate() {
        return points != null && points.size() > 3;
    }

    public List<Point> getPoints() {
        return this.points;
    }

    private boolean isClosed;

    public boolean isClosed() {
        return isClosed;
    }

    public Range getRange() {
        double xMin = points.get(0).x;
        double xMax = points.get(0).x;
        double yMin = points.get(0).y;
        double yMax = points.get(0).y;

        for (Point point : points) {
            if (point.x > xMax) {
                xMax = point.x;
            } else if (point.x < xMin) {
                xMin = point.x;
            }
            if (point.y > yMax) {
                yMax = point.y;
            } else if (point.y < yMin) {
                yMin = point.y;
            }
        }

        return new Range(xMin, xMax, yMin, yMax);
    }

}
