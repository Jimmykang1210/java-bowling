package bowling.domain;

public enum ScoreType {
    STRIKE("X"),
    SPARE("/"),
    GUTTER("-"),
    MISS("");
    
    private String type;

    ScoreType(String type) {
        this.type = type;
    }
}


