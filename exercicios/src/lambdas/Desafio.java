package lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        
        Function<Produto, Double> precoFinal =
                prod -> prod.preco * (1 - prod.desconto);
        
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        
        UnaryOperator<Double> arredondar =
                preco -> Math.round(preco * 100.0) / 100.0; 
                // Mantém 2 casas decimais sem conversão para String
        
        Function<Double, String> formatar = preco -> {
            DecimalFormat df = new DecimalFormat("R$ #,##0.00");
            return df.format(preco);
        };
//  #→ ignora zeros à esquerda.
//,##0.00→ usa vírgula como separador de milhar e ponto como separador decimal (padrão brasileiro).

        Produto p = new Produto("Ipad", 3235.89, 0.13);
        
        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        
        System.out.println("O preço final é: " + preco);
    }
}
