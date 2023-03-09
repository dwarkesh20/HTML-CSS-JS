package com.einfo.demodatajpa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfo.demodatajpa.dao.MovieDAO;
import com.einfo.demodatajpa.model.Movie;

@RestController
public class movieController  {
	@Autowired
	Movie m;
	@Autowired
	MovieDAO dao;
	
	
	@GetMapping("/")
	public ModelAndView getHome() {
		return new ModelAndView("home");
	}
	
	@GetMapping("addmovie")
	public ModelAndView getAddMovie() {
		return new ModelAndView("addmovie");
	}
	
	@PostMapping("insert")
	public ModelAndView insertMovie(@RequestParam String name, @RequestParam String lang,@RequestParam String director) {
		ModelAndView mav = new ModelAndView("success");
		
		m.setMovieId(0);
		m.setMovieName(name);
		m.setLanguage(lang);
		m.setDirecter(director);
		
		dao.save(m);
		
		mav.addObject("m",m);
		return mav;
	}
	
	@GetMapping("viewall")
	public ModelAndView getAllMovie() {
		
		List<Movie> li = dao.findAll();
				
		return new ModelAndView("viewall").addObject("li", li);
	}
	
	@GetMapping("viewbyid")
	public ModelAndView getAllMovie(@RequestParam int id) {
		
		Optional<Movie> mopt = dao.findById(id);
		Movie m = mopt.get();
		return new ModelAndView("viewall").addObject("m", m);
	}
	
	@GetMapping("viewbylang")
	public ModelAndView getViewByLang(@RequestParam String lang) {
		
		List<Movie> li = dao.findByLang(lang);
		
		return new ModelAndView("viewall").addObject("mli", li);
	}
	
	@GetMapping("viewbyname")
	public ModelAndView getViewByName(@RequestParam String name) {
		
		List<Movie> li = dao.findByName(name);
		
		return new ModelAndView("viewall").addObject("mli", li);
	}
	
	@GetMapping("updatebyid")
	public ModelAndView getUpdateById(@RequestParam int id) {
		
		Optional<Movie> mopt = dao.findById(id);
		Movie m = mopt.get();
		
		dao.save(m);
		ModelAndView mav = new ModelAndView("update");
		mav.addObject("id",m.getMovieId());
		mav.addObject("name",m.getMovieName());
		mav.addObject("director",m.getDirecter());
		mav.addObject("lang",m.getLanguage());
		return mav;
	}
	
	@PostMapping("update")
	public ModelAndView updateMovie(@RequestParam int id, @RequestParam String name, @RequestParam String lang,@RequestParam String director) {
		ModelAndView mav = new ModelAndView("success");
		
		m.setMovieId(id);
		m.setMovieName(name);
		m.setLanguage(lang);
		m.setDirecter(director);
		
		dao.save(m);
		
		mav.addObject("m",m);
		return mav;
	}
	
	@GetMapping("deletebyid")
	public ModelAndView getDeleteByID(@RequestParam int id) {
		
		dao.deleteById(id);
		
		List<Movie> li = dao.findAll();
		
		return new ModelAndView("viewall").addObject("li", li);
	}
}
