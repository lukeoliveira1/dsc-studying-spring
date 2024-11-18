package com.example.ecommerce.domain.enums;

public enum OrderStatus {
    AGUARDANDO("Aguardando informação"),
    CANCELADO("Cancelar pedido"),
    PAGO("Pago"),
    ENVIADO("Enviado");

    private String description;

    OrderStatus(String description) {
        this.description = description;
    };

    public String getDescription() {
        return description;
    }
}
