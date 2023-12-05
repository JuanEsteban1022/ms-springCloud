package store.invoiceservice.invoice.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import store.invoiceservice.invoice.domain.entity.InvoiceItem;

public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Long> {
}
