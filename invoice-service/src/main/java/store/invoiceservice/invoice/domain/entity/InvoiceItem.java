package store.invoiceservice.invoice.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import store.invoiceservice.invoice.infraestructure.model.Product;

@Entity
@Data
@Table(name = "tbl_invoce_items")
public class InvoiceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Positive(message = "El stock debe ser mayor que cero")
    private Double quantity;
    private Double price;

    @Column(name = "product_id")
    private Long productId;

    // Tiene esta anotación porque no se almacena en la DB
    @Transient
    private Double subTotal;

    // Tiene esta anotación porque no se almacena en la DB
    @Transient
    private Product product;

    public Double getSubTotal() {
        if (this.price > 0 && this.quantity > 0) {
            return this.quantity * this.price;
        } else {
            return (double) 0;
        }
    }

    public InvoiceItem() {
        this.quantity = (double) 0;
        this.price = (double) 0;

    }
}
