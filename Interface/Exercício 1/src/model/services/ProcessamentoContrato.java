package model.services;

import model.entities.Contrato;
import model.entities.Parcela;

public class ProcessamentoContrato {
	
	public static void ProcessarContrato(Contrato contrato, Integer numeroParcelas, ServicoPagamento servico) {
		Double parcelaBasica = contrato.getValor() / numeroParcelas;
		
		for (int i = 1; i <= numeroParcelas; i++) {
			contrato.adicionarParcela(new Parcela(parcelaBasica, servico.calcularJuros(parcelaBasica, i), servico.calcularTaxa(parcelaBasica, i), contrato.getDataContrato().plusMonths(i)));
		}
	}
	
}
