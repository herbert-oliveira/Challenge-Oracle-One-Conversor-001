package conversor;

import javax.swing.*;

public class ConverterMoedas {

    public void converterReaisParaDolares(double valorRecebido){
        double moedaDolar = valorRecebido / 5.16;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem US$ " + moedaDolar + " Dólares");
    }

    public void converterReaisParaEuros(double valorRecebido){
        double moedaEuro = valorRecebido / 5.60;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem € " + moedaEuro + " Euros");
    }

    public void converterReaisParaLibras(double valorRecebido){
        double moedaLibra = valorRecebido / 6.37;
        moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem £ " + moedaLibra + " Libras Esterlinas");
    }

    public void converterReaisParaPesosArgentinos(double valorRecebido){
        double moedaPesoArgentino = valorRecebido / 0.025;
        moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem ARS " + moedaPesoArgentino + "Pesos Argentinos");
    }

    public void converterReaisParaPesosChilenos(double valorRecebido){
        double moedaPesoChileno = valorRecebido / 0.0040;
        moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem CLP$ " + moedaPesoChileno + " Pesos Chilenos");
    }

}
