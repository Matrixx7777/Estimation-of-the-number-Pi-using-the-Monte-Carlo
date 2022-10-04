package com.docker.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {SpringApplication.run(AppApplication.class, args); }

	MonteCarlo monCar = new MonteCarlo();

	@GetMapping("/getMonteCarlo")
	public String getMonteCarlo(@RequestParam int monteCarlo){ return monCar.showCals(monteCarlo); }

	@GetMapping("/getRandomEpsilonError")
	public String getMonteCarlo() { return monCar.calcEpsilon(); }
}