package br.com.alura.mvc.mudi.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Order;
import br.com.alura.mvc.mudi.repository.OrderRepository;

@Controller
public class HomeController {
	
	@Autowired
	OrderRepository orderRepository;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		
		model.addAttribute("orders", orderRepository.findAll());
		
		return "home";
	}
	
}
