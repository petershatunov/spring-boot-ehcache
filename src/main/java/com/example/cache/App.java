package com.example.cache;

import com.example.cache.movie.MovieDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class App {

    @Autowired
    MovieDao movieDao;

    @RequestMapping("/movie")
    public String getMovies() {
        return run();
    }

    public String run() {

	log.info("Result : {}", movieDao.findByDirector("dummy"));
	log.info("Result : {}", movieDao.findByDirector("dummy1"));
	log.info("Result : {}", movieDao.findByDirector("dummy2"));
	log.info("Result : {}", movieDao.findByDirector("dummy"));
	log.info("Result : {}", movieDao.findByDirector("dummy"));
	log.info("Result : {}", movieDao.findByDirector("dummy3"));
	log.info("Result : {}", movieDao.findByDirector("dummy"));
	log.info("Result : {}", movieDao.findByDirector("dummy"));

	return "done";
    }

}
