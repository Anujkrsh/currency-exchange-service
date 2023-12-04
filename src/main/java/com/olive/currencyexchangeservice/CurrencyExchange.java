package com.olive.currencyexchangeservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Locale;
@Entity
public class CurrencyExchange {

    @Id
    private Long id;

    @Column(name = "Currency_from")
    private String from;
    @Column(name = "Currency_to")
    private String to;
    private BigDecimal conversionMultiple;
    public String enviorment;


    public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;

    }
    public CurrencyExchange(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnviorment() {
        return enviorment;
    }

    public void setEnviorment(String enviorment) {
        this.enviorment = enviorment;
    }
}