package bowling.domain;

public class FrameIndex {
    private static final String EXCEPTION_MESSAGE_INDEX = "비정상적인 인덱스입니다.";
    private static final int MAX_INDEX_NUMBER = 9;
    private static final int MIN_INDEX_NUMBER = 0;

    private final int index;
    private int nowIndex;

    public FrameIndex(int index) {
        this(index, MIN_INDEX_NUMBER);
    }

    private FrameIndex(int index, int nowIndex) {
        validateIndex(index);
        this.index = index;
        this.nowIndex = nowIndex;
    }

    private void validateIndex(int index) {
        if (index < MIN_INDEX_NUMBER || index > MAX_INDEX_NUMBER) {
            throw new IllegalArgumentException(EXCEPTION_MESSAGE_INDEX);
        }
    }

    public int getIndex() {
        return index;
    }

    public int getNowIndex() {
        return nowIndex;
    }

    public boolean isFinalFrame() {
        return nowIndex == index;
    }

    public void nextFrame(){
        nowIndex++;
    }
}
