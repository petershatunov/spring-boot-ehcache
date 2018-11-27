package com.example.cache.movie;

import java.io.Serializable;

public class Movie implements Serializable {

    int id;
    String name;
    String director;

    public Movie(int i, String actorName, String directorName) {
	this.id = i;
	this.name = actorName;
	this.director = directorName;
    }

    @Override
    public String toString() {
	return "Movie{" + "id=" + id + ", name='" + name + '\'' + ", director='" + director + '\'' + '}';
    }
}
