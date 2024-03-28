package com.invoice.demo.ServiceImp;

import com.invoice.demo.Model.Invoice;
import com.invoice.demo.Exception.InvoiceNotFoundException;
import com.invoice.demo.Repository.InvoiceRepo;
import com.invoice.demo.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceImp implements InvoiceService {
    @Autowired
    private InvoiceRepo repo;

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return repo.save(invoice);
    }

    @Override
    public Page<Invoice> getAllInvoices(Pageable pageable) {
        return repo.findAll(pageable);
    }

    @Override
    public Invoice getInvoiceById(Long id) {
        Optional<Invoice> opt = repo.findById(id);
        if(opt.isPresent()) {
            return opt.get();
        } else {
            throw new InvoiceNotFoundException("Invoice with Id : "+id+" Not Found");
        }
    }

    @Override
    public void deleteInvoiceById(Long id) {
        repo.delete(getInvoiceById(id));
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        repo.save(invoice);
    }
}
