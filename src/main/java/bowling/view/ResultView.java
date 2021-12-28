package bowling.view;

import java.util.stream.IntStream;

public class ResultView {
    public static final String RESPONSE_NAME_MESSAGE = "NAME";
    public static final String RESPONSE_NAME_RIGHT_ALIGN_MESSAGE = "| %4s |";
    private static final String RESPONSE_FRAME_RIGHT_ALIGN_MESSAGE = "  %02d  |";
    private static final String RESPONSE_RESULT_RIGHT_ALIGN_MESSAGE = "  %-3s |";
    private static final String RESPONSE_RESULT_EMPTY_MESSAGE = "";
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 11;

    public static void responseBowlingDefaultFrame(String playerName) {
        printBowlingHeader();
        printBowlingPlayer(playerName);
        IntStream.range(START_RANGE, END_RANGE)
                .forEach(number -> System.out.format(RESPONSE_RESULT_RIGHT_ALIGN_MESSAGE, RESPONSE_RESULT_EMPTY_MESSAGE));
    }

//    public static void responseBowlingFrame(BowlingGame bowlingGame) {
//        printBowlingHeader();
//        printBowlingPlayer(bowlingGame.getPlayer());
//        bowlingGame.getFrames().stream()
//                    .map(frame -> System.out.format(RESPONSE_RESULT_RIGHT_ALIGN_MESSAGE, frame));
//    }

    private static void printBowlingHeader() {
        printBowlingPlayer(RESPONSE_NAME_MESSAGE);
        IntStream.range(START_RANGE, END_RANGE)
                        .forEach(number -> System.out.format(RESPONSE_FRAME_RIGHT_ALIGN_MESSAGE, number));
        System.out.println();
    }

    private static void printBowlingPlayer(String playerName) {
        System.out.format(RESPONSE_NAME_RIGHT_ALIGN_MESSAGE, playerName);
    }
}
