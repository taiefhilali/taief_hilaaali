package com.microservices.quizms.Quizzes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="quiz")
public class Quiz {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long qId;

    private String title;
    private String description;
    private String maxMarks;
    private String numberofQuestions;

    private boolean active=false;
/*@JsonIgnore
@ManyToOne
@JoinColumn(name = "category_id")
@JsonBackReference
private Category category;*/

@ManyToOne
@JoinColumn(name = "category_id")
@JsonBackReference
private Category category;

    @OneToMany(mappedBy = "quiz")
@JsonIgnore
private Set<Question> questions=new HashSet<>();


    public Quiz() {
    }

    public Quiz(String title, String description, String maxMarks, String numberofQuestions, boolean active) {
        this.title = title;
        this.description = description;
        this.maxMarks = maxMarks;
        this.numberofQuestions = numberofQuestions;
        this.active = active;
    }

    public Long getqId() {
        return qId;
    }

    public void setqId(Long qId) {
        this.qId = qId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(String maxMarks) {
        this.maxMarks = maxMarks;
    }

    public String getNumberofQuestions() {
        return numberofQuestions;
    }

    public void setNumberofQuestions(String numberofQuestions) {
        this.numberofQuestions = numberofQuestions;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }



    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }
}
