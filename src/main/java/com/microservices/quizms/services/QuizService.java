package com.microservices.quizms.services;

import com.microservices.quizms.Quizzes.Category;
import com.microservices.quizms.Quizzes.Quiz;

import java.util.Set;

public interface QuizService {

    public Quiz addQuiz(Quiz quiz);
    public Quiz updateQuiz(Quiz quiz);
    public Set<Quiz> getQuizzes();
    public Quiz getQuiz(Long quizId);
    public void deleteQuiz(Long quizId);

}
