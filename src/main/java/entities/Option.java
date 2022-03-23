package entities;

public class Option {
    private Integer alternative;
    private String detail;
    private Boolean isCorrect;
    private String questionId;

    public Option(Integer alternative, String detail, Boolean isCorrect, String questionId) {
        this.alternative = alternative;
        this.detail = detail;
        this.isCorrect = isCorrect;
        this.questionId = questionId;
    }

    public Integer getAlternative() {
        return alternative;
    }

    public void setAlternative(Integer alternative) {
        this.alternative = alternative;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }
}
