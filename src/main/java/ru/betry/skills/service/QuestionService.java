package ru.betry.skills.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.betry.skills.entity.Question;
import ru.betry.skills.repository.QuestionRepo;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private QuestionRepo questionRepo;

    @Autowired
    public QuestionService(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    public Question save(Question question){
        return questionRepo.save(question);
    }
    public Optional<Question> findById(Long id){
        return questionRepo.findById(id);
    }

    public List<Question> findAll() {
        return questionRepo.findAll();
    }
}
