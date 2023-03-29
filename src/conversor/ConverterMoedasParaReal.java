package conversor;

import javax.swing.*;

public class ConverterMoedasParaReal {

    public void converterDolaresParaReais(double valorRecebido){
        double moedaDolar = valorRecebido * 5.16;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaDolar + " Reais");
    }

    public void converterEurosParaReais(double valorRecebido){
        double moedaEuro = valorRecebido * 5.60;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaEuro + " Reais");
    }

    public void converterLibrasParaReais(double valorRecebido){
        double moedaLibra = valorRecebido * 6.37;
        moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaLibra + " Reais");
    }
    public void converterPesosArgentinosParaReais(double valorRecebido){
        double moedaPesoArgentino = valorRecebido * 0.025;
        moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $" + moedaPesoArgentino + " Reais");
    }

    public void converterPesosChilenosParaReais(double valorRecebido){
        double moedaPesoChileno = valorRecebido * 0.0040;
        moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$" + moedaPesoChileno + " Reais");
    }

}

