package bowling.domain;

import java.util.Arrays;
import java.util.List;

public class Results {
    private List<Result> results;

    public Results() {
        this.results = Arrays.asList(
            new Result(""),
            new Result(""),
            new Result(""),
            new Result(""),
            new Result(""),
            new Result(""),
            new Result(""),
            new Result(""),
            new Result(""),
            new Result("")
        );
    }

    public Results(List<Result> results) {
        this.results = results;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResult(int frameNumber, Result result) {
        results.set(frameNumber, result);
    }
}
