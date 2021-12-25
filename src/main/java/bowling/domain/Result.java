package bowling.domain;

public class Result {
    private static final String SPLIT_FORMAT_TEXT = "%s|%s";
    private static final String STRIKE_TEXT = "X";
    private static final String SPARE_TEXT = "/";
    private static final String GUTTER_TEXT = "-";

    private String point;

    public Result(String point) {
        this.point = point;
    }

    public static Result createFirstPitch(int firstPoint) {
        return new Result(convertResult(firstPoint));
    }

    public static Result createSecondPitch(int firstPoint, int secondPoint) {
        if (firstPoint + secondPoint == 10) {
            return new Result(String.format(SPLIT_FORMAT_TEXT, firstPoint, SPARE_TEXT));
        }
        return new Result(String.format(SPLIT_FORMAT_TEXT, convertResult(firstPoint), convertResult(secondPoint)));
    }

    private static String convertResult(int point) {
        if (point == 10) {
            return STRIKE_TEXT;
        } else if (point == 0) {
            return GUTTER_TEXT;
        } else {
            return String.valueOf(point);
        }
    }

    @Override
    public String toString() {
        return point;
    }
}
