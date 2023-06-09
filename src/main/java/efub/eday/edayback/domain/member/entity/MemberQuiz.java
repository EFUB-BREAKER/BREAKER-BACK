package efub.eday.edayback.domain.member.entity;

import efub.eday.edayback.domain.day.quiz.entity.Quiz;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MemberQuiz {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_quiz_id")
	private Long id;

	@Column(nullable = false)
	private Boolean isCorrect;

	@ManyToOne
	@JoinColumn(name = "member_id", nullable = false)
	private Member member;

	@ManyToOne
	@JoinColumn(name = "quiz_id", nullable = false)
	private Quiz quiz;
}
