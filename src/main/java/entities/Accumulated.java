package entities;

public class Accumulated {
    private String id;
    private final String playerId;
    private Boolean isComplete;

    public Accumulated(String id, String playerId, Boolean isComplete) {
        this.id = id;
        this.playerId = playerId;
        this.isComplete = isComplete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playedId) {
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }
}
