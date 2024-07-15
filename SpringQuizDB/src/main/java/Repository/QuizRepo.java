package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.QuizDetails;



public interface QuizRepo extends JpaRepository<QuizDetails,Integer>  {
	


}
