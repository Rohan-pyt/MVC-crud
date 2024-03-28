package com.invoice.demo.Repository;

import com.invoice.demo.Model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface InvoiceRepo extends JpaRepository<Invoice,Long> {
}
