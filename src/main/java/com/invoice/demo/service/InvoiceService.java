package com.invoice.demo.service;

import com.invoice.demo.Model.Invoice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface InvoiceService {
    public Invoice saveInvoice(Invoice invoice);

    public Page<Invoice> getAllInvoices(Pageable pageable) ;

    public Invoice getInvoiceById(Long id);

    public void deleteInvoiceById(Long id);

    public void updateInvoice(Invoice invoice);

}
