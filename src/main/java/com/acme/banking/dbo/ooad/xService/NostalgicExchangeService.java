package com.acme.banking.dbo.ooad.xService;

public class NostalgicExchangeService implements XchangeService {
    private double rate;

    public NostalgicExchangeService(double rate) {
        this.rate = rate;
    }

    @Override
    public double getRate() {
        return rate;
    }
}
