package bowling.view;

import bowling.domain.FrameIndex;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static String REQUEST_PLAYER_NAME = "플레이어 이름은(3 english letters)?: ";
    private static String REQUEST_PITCHING_RESULT = "\n\n%s프레임 투구 : ";

    public static String requestPlayerName() {
        System.out.print(REQUEST_PLAYER_NAME);
        return scanner.next();
    }

    public static int requestPitchingResult(FrameIndex index) {
        System.out.format(REQUEST_PITCHING_RESULT, index.getIndex());
        return scanner.nextInt();
    }
}
