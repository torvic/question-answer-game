package entities;

import java.util.ArrayList;

public class Question {
    private String id;
    private String statement;
    private String categoryId;

    public Question(String id, String statement, String categoryId) {
        this.id = id;
        this.statement = statement;
        this.categoryId = categoryId;
    }

    public Question() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
