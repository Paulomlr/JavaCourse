package services;

import java.nio.file.InvalidPathException;

public class BrazilInterestService implements InterestService{
    private Double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
