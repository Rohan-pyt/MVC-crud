package com.invoice.demo.service;

import com.invoice.demo.Model.Invoice;

import java.util.List;

public interface InvoiceService {
    public Invoice saveInvoice(Invoice invoice);

    public List<Invoice> getAllInvoices();

    public Invoice getInvoiceById(Long id);

    public void deleteInvoiceById(Long id);

    public void updateInvoice(Invoice invoice);

}
