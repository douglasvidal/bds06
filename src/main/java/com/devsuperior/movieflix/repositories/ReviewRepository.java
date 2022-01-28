package com.devsuperior.movieflix.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.movieflix.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{
	
	@Query( nativeQuery = true, 
			value = "SELECT * FROM tb_review review "
					+ "JOIN tb_movie movie ON review.movie_id = movie.id "
					+ "JOIN tb_genre genre ON movie.genre_id = genre.id "
					+ "JOIN tb_user user ON review.user_id = user.id "
					+ "JOIN tb_user_role user_role ON user.id = user_role.user_id "
					+ "JOIN tb_role role ON user_role.role_id = role.id "
					+ "WHERE movie.id = :movieId")
	List<Review> findReviews (Long movieId);

}
