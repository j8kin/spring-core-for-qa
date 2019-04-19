package com.acme.banking.dbo.ooad;

public class NostalgicExchangeService implements XchangeService {
    private double rate;
    NostalgicExchangeService(double rate) {
        this.rate = rate;
    }
    @Override
    public double getRate() {
        return rate;
    }
}
