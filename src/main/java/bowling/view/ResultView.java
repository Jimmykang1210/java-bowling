package bowling.view;

import bowling.domain.Results;

import java.util.stream.IntStream;

public class ResultView {
    public static final String RESPONSE_NAME_RIGHT_ALIGN_MESSAGE = "| %4s |";
    private static final String RESPONSE_FRAME_RIGHT_ALIGN_MESSAGE = "  %02d  |";
    private static final String RESPONSE_RESULT_RIGHT_ALIGN_MESSAGE = "  %-3s |";
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 11;

    public static void responseBowlingFrame(String playerName, Results results) {
        System.out.format(RESPONSE_NAME_RIGHT_ALIGN_MESSAGE, "NAME");
        IntStream.range(START_RANGE, END_RANGE)
                    .forEach(number -> System.out.format(RESPONSE_FRAME_RIGHT_ALIGN_MESSAGE, number));
        System.out.println();
        System.out.format(RESPONSE_NAME_RIGHT_ALIGN_MESSAGE, playerName);
        IntStream.range(START_RANGE, END_RANGE)
                .forEach(number -> System.out.format(RESPONSE_RESULT_RIGHT_ALIGN_MESSAGE, results.getResults().get(number - 1)));
    }
}
