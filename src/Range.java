/**
 *  Express circumscribed rectangle
 */
public class Range {
    public double xMax;
    public double xMin;
    public double yMax;
    public double yMin;

    public Range(double xMin, double xMax, double yMin, double yMax) {
        this.xMin = xMin;
        this.xMax = xMax;
        this.yMin = yMin;
        this.yMax = yMin;
    }

    boolean isIn(Range outer) {
        return this.xMax < outer.xMax
                && this.xMin > outer.xMin
                && this.yMax < outer.yMax
                && this.yMin > outer.yMin;
    }
}
