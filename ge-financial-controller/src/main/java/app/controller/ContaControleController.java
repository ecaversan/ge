package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import app.model.ContaControle;
import app.model.Endereco;
import app.model.GEResponseBody;
import app.model.TipoPessoa;
import app.service.ContaControleService;

@RestController
public class ContaControleController {

	@Autowired
	private ContaControleService service;

	@GetMapping("/contacontrole")
	public ResponseEntity<?> listar() {
		
		GEResponseBody result = new GEResponseBody();

		List<ContaControle> contas = service.findAll();
        if (contas.isEmpty()) {
            result.setMsg("no user found!");
        } else {
            result.setMsg("success");
        }
        System.out.println(contas.stream().toString());
        result.setResult(contas);
        
        return ResponseEntity.ok(result);
	}
	
	@GetMapping("/contacontrole/insert/{nome}")
	public ResponseEntity<?> insert(@PathVariable String nome) {
		
		Endereco endereco = new Endereco("Rua A", "Centro", "São Paulo", "SP", "06765-015");
		String telefones = "99186-4763";
		String email = "ecaversan@gmail.com";
		String cpf = "133.098.108-10";
		String rg = "19.941.974-7";
		String webSite = "";
		String tipo = TipoPessoa.PF.toString();
		
		service.insert(nome, endereco, telefones, email, cpf, rg, webSite, tipo);
		
		return ResponseEntity.ok("Conta cadastrada com sucesso!");
	}

}
