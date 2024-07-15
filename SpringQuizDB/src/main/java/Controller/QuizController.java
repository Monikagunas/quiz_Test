package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import Entity.QuizDetails;
import ServiceImpl.QuizServiceImpl;

@RestController
public class QuizController {
	@Autowired
	QuizServiceImpl quizServiceImpl;
	@GetMapping(value="/createquiz")
	public QuizDetails getQuizDetails() {
	QuizDetails quizDetails=QuizServiceImpl.CreateQuizDetails();
	return quizDetails; 
	
		
}
	

}
