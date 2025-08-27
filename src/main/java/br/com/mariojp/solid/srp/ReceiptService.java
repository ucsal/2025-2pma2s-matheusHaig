package br.com.mariojp.solid.srp;

public class ReceiptService {

	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
        TaxCalculator tax = new TaxCalculator();
        String taxHateString = System.getProperty("tax.rate");
        double porcentagem = Double.parseDouble(taxHateString);
        double taxa = tax.calculaTaxa(subtotal,porcentagem);
		double total = subtotal + taxa;
		ReceiptFormatter rf = new ReceiptFormatter();
        String texto = rf.montarTexto(order, subtotal, taxa, total);
        return texto;
	}
}
