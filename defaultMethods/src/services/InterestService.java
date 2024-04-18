package services;

public interface InterestService {
    double getInterestRate();

    default double payment(double amount, int months){   // reuso e "herança múltipla"
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months); // default method pode ser utilizado quando para eliminar as repetições e promover o reuso
    }
}
