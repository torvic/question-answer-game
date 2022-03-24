package entities;

public class Round {
    private String questionId;
    private String accumulatedId;

    public Round(String questionId, String accumulatedId) {
        this.questionId = questionId;
        this.accumulatedId = accumulatedId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getAccumulatedId() {
        return accumulatedId;
    }

    public void setAccumulatedId(String accumulatedId) {
        this.accumulatedId = accumulatedId;
    }
}
