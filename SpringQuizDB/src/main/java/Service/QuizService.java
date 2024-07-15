package Service;

import org.springframework.stereotype.Service;

import Entity.QuizDetails;

@Service
public interface QuizService {
	QuizDetails CreateQuizDetails(QuizDetails quizDetails);
	


}

