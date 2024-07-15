package ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Entity.QuizDetails;
import Repository.QuizRepo;
import Service.QuizService;

@Component
public class QuizServiceImpl implements QuizService {
	@Autowired
	QuizRepo quizrepo;
	
	@Override
	public QuizDetails CreateQuizDetails(QuizDetails quizDetails) {
		QuizDetails quiz=quizrepo.quiz(quizDetails);
		
		return quiz;
	}

	

	}
