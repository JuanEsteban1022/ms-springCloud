package store.invoiceservice.invoice.domain.interfaces;

import store.invoiceservice.invoice.domain.entity.Invoice;

import java.util.List;

public interface InvoiceService {
    public List<Invoice> findInvoiceAll();

    public Invoice createInvoice(Invoice invoice);

    public Invoice updateInvoice(Invoice invoice);

    public Invoice deleteInvoice(Invoice invoice);

    public Invoice getInvoice(Long id);
}
