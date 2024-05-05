import java.util.Locale;

public class Investimento implements Comparable<Investimento> {
    private String cpf;
    private String tipoInvestimento;
    private Double taxaAno;
    private Integer tempoDias;
    private Double capitalInicial;


    private static Double CDI = 4.9 / 100;

    public Investimento(String cpf, String tipoInvestimento, Double taxaAno, Integer tempoDias, Double capitalInicial) {
        this.cpf = cpf;
        this.tipoInvestimento = tipoInvestimento;
        this.taxaAno = taxaAno;
        this.tempoDias = tempoDias;
        this.capitalInicial = capitalInicial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public Double getTaxaAno() {
        return taxaAno;
    }

    public void setTaxaAno(Double taxaAno) {
        this.taxaAno = taxaAno;
    }

    public Integer getTempoDias() {
        return tempoDias;
    }

    public void setTempoDias(Integer tempoDias) {
        this.tempoDias = tempoDias;
    }

    public Double getCapitalInicial() {
        return capitalInicial;
    }

    public void setCapitalInicial(Double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }


    public Double valorBruto () {
        return capitalInicial * Math.pow((1 + (taxaAno / 100) * CDI), tempoDias / 360);
    }

    public Double juros (){
        return valorBruto() - capitalInicial;
    }

    public Double valorIR(){
        if (tempoDias <= 180){
            return 0.225;
        }
        else if (tempoDias <= 360){
            return 0.20;
        }
        else if (tempoDias <= 720){
            return 0.175;
        }
        return 0.15;
    }

    public Double valorLiquido(){
        if (tipoInvestimento.equals("LCI") || tipoInvestimento.equals("LCA")){
            return valorBruto();
        }
        return valorBruto() - juros() * valorIR();
    }

    @Override
    public String toString() {
        return cpf + " "
                + tipoInvestimento + " "
                + String.format("%.2f", taxaAno) + " "
                + tempoDias + " "
                + String.format("%.2f", capitalInicial) + " "
                + String.format("%.2f", valorBruto()) + " "
                + String.format("%.2f", juros()) + " "
                + String.format("%.2f", valorLiquido());
    }


    @Override
    public int compareTo(Investimento o) {
        return -this.valorLiquido().compareTo(o.valorLiquido());
    }
}
