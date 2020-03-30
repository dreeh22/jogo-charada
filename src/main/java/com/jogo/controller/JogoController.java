package com.jogo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.jogo.domain.Jogo;
import com.jogo.repository.JogoRepository;

@Controller
public class JogoController {
	
	
	@Autowired
	private JogoRepository jr;
	
	private Jogo jogo2 = new Jogo();
	
	
	@RequestMapping(value="/cadastrar", method = RequestMethod.GET)
	public String form() {

		return "index";
	}
	
	
	/*Método para salvar os participantes */
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String salvar(@Valid Jogo jogo, BindingResult result, Model model) {

		/* Insiro o objeto "Jogo" dentro de outro objeto para evitar o "nullpointerexception" */
		
		jogo2.setNome(jogo.getNome());
		jogo2.setResposta1(jogo.getResposta1());
		jogo2.setResposta2(jogo.getResposta2());
		jogo2.setResposta3(jogo.getResposta3());
		jogo2.setResposta4(jogo.getResposta4());
		
		/* Verifica se possui erros */
		if(result.hasErrors()){
			model.addAttribute("mensagemErro", "Responda cada uma das charadas para concluir o jogo.");
            return "index";
        }

		jr.save(jogo2);
		
		model.addAttribute("mensagem", "Respostas preenchidas com sucesso.");
		
		return "index";
			
	}

	@RequestMapping("/participantes")
	public ModelAndView visualizar() {
		
		ModelAndView mv = new ModelAndView("listaParticipantes");
		Iterable<Jogo> listas = jr.findAll();

		
		mv.addObject("listas", listas);
		
		return mv;
	}
	


}
