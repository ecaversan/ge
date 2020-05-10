package app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.model.ContaControle;
import app.model.GEResponseBody;
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
			result.setMsg("Conta controle não encontrada!");
		} else {
			result.setMsg("success");
		}
		System.out.println(contas.stream().toString());
		result.setResult(contas);
		
		return ResponseEntity.ok()
				.body(result);
	}

	@GetMapping("/contacontrole/delete/{nome}")
	public ResponseEntity<?> delete(@PathVariable String nome) {

		GEResponseBody result = new GEResponseBody();
		result.setMsg("Conta não encontrada!");

		List<ContaControle> contas = service.findAll();
		if (!contas.isEmpty()) {
			for (ContaControle contaControle : contas) {
				if (contaControle.getNome().isEmpty() || contaControle.getNome().equals(nome)) {
					service.delete(contaControle);
					List<ContaControle> contaDeletada = new ArrayList<>();
					contaDeletada.add(contaControle);
					result.setResult(contaDeletada);
					result.setMsg("success");
					break;
				}
			}
		}

		return ResponseEntity.ok(result);
	}

	@PostMapping("/contacontrole/insert")
	public ResponseEntity<?> insert(@RequestBody ContaControle conta) {
		GEResponseBody result = new GEResponseBody();
		result.setMsg("Conta controle nula!");
		if(conta != null) {
			service.insert(conta);
			result.setMsg("Conta cadastrada com sucesso!");
		}
		
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/contacontrole/deleteNull")
	public ResponseEntity<?> deleteNull() {

		GEResponseBody result = new GEResponseBody();
		result.setMsg("Conta não encontrada!");

		List<ContaControle> contas = service.findAll();
		if (!contas.isEmpty()) {
			for (ContaControle contaControle : contas) {
				if (contaControle.getNome()==null) {
					service.delete(contaControle);
					List<ContaControle> contaDeletada = new ArrayList<>();
					contaDeletada.add(contaControle);
					result.setResult(contaDeletada);
					result.setMsg("success");
					break;
				}
			}
		}

		return ResponseEntity.ok(result);
	}

}
