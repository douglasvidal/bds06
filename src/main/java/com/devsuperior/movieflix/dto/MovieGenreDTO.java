package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import com.devsuperior.movieflix.entities.Movie;

public class MovieGenreDTO extends MovieDTO implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private GenreDTO genre;
	
	public MovieGenreDTO() {
		super();
	}

	public MovieGenreDTO(Long id, String title, String subTitle, String synopsis, Integer year, String imgUrl,
			GenreDTO genre) {
		super(id, title, subTitle, synopsis, year, imgUrl);
		this.genre = new GenreDTO();
	}

	public MovieGenreDTO(Movie entity) {
		super(entity);
		this.genre = new GenreDTO(entity.getGenre());
	}

	public GenreDTO getGenre() {
		return genre;
	}

	public void setGenre(GenreDTO genre) {
		this.genre = genre;
	}
	
}
