package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Job;
import com.example.demo.service.ServicesLayer;

@RestController
@RequestMapping("/post")
public class Controller {

	@Autowired
	ServicesLayer serlayer;
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return serlayer.addUser(user);
	}
	
	@PostMapping("/job")
	public Job createJob(@RequestBody Job job) {
		return serlayer.addJob(job);
	}
	
	@GetMapping("/getjob/{jobid}")
	public Optional<Job> getJobById(@PathVariable int jobId) {
		return serlayer.getJobById(jobId);
	}
	@GetMapping("/jobType/{jobType}")
	public List<Job> getJobType(@PathVariable String jobType) {
		return serlayer.getJobByType(jobType);
	}
	@GetMapping("/a/{availability}")
	public List<Job> getJobAvalilibility(@PathVariable String availibility) {
		return serlayer.getJobByAvailability(availibility);
	}
	@GetMapping("/country{country}") 
	public List<Job> getCountryName(@PathVariable String country) {
		return serlayer.getCountryName(country);
	}
	@GetMapping("/language/{language}") 
	public List<Job> getLanguageName(@PathVariable String language) {
		return serlayer.getLanguageName(language);
	}
	@GetMapping("/payRate/{payRate}")
	public List<Job> getPayRate(@PathVariable int payRate) {
	return serlayer.getPayRateAmount(payRate);
	
}
}
