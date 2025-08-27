package br.com.mariojp.solid.srp;

public class ReceiptFormatter {

    public String montarTexto(Order order, double subtotal, double taxa, double total) {
        StringBuilder sb = new StringBuilder(); //Formatando o Recibo
        sb.append("=== RECIBO ===\n");
        for (var i : order.getItems()) {
            sb.append(i.getName()).append(" x").append(i.getQuantity()).append(" = ").append(i.getUnitPrice() * i.getQuantity())
                    .append("\n");
        }
        sb.append("Subtotal: ").append(subtotal).append("\n");
        sb.append("Tax: ").append(taxa).append("\n");
        sb.append("Total: ").append(total).append("\n");
        return sb.toString();
    }
}
