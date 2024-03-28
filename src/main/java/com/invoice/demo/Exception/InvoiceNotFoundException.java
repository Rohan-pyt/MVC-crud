package com.invoice.demo.Exception;

public class InvoiceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public InvoiceNotFoundException() {
        super();
    }

    public InvoiceNotFoundException(String customMessage) {
        super(customMessage);
    }

}
