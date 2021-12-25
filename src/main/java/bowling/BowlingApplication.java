package bowling;

import bowling.domain.Result;
import bowling.domain.Results;
import bowling.view.InputView;
import bowling.view.ResultView;

public class BowlingApplication {
    public static void main(String[] args) {
        String playerName = InputView.requestPlayerName();
        Results results = new Results();

        for (int frameNumber = 0; frameNumber < 10; frameNumber++) {
            int pitchResult = InputView.requestPitchingResult(frameNumber);
            results.setResult(frameNumber, Result.createFirstPitch(pitchResult));
            ResultView.responseBowlingFrame(playerName, results);

            if (pitchResult < 10) {
                int secondPitchResult = InputView.requestPitchingResult(frameNumber);
                results.setResult(frameNumber, Result.createSecondPitch(pitchResult, secondPitchResult));
                ResultView.responseBowlingFrame(playerName, results);
            }
        }

    }
}
