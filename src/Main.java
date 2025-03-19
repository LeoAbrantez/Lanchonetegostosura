/*
VAR
queijo,presunto,carne,sanduba <- real

INICIO
ler sanduba
queijo <- (sanduba * 50)/1000
presunto <- (sanduba * 50)/1000
carne <- (sanduba * 100)/1000

escreva "blahblahblah"

FIM

TESTE DE MESA

| Sanduíches | Queijo (sanduba * 50 / 1000) | Presunto (sanduba * 50 / 1000) | Carne (sanduba * 100 / 1000) | Saída |
|------------|----------------------------|------------------------------|----------------------------|---------------------------------------------------------------|
| 1          | 0.05                        | 0.05                         | 0.10                        | "Será necessário comprar 0.05Kg de queijo, 0.05Kg de presunto e 0.10Kg de carne." |
| 5          | 0.25                        | 0.25                         | 0.50                        | "Será necessário comprar 0.25Kg de queijo, 0.25Kg de presunto e 0.50Kg de carne." |
| 10         | 0.50                        | 0.50                         | 1.00                        | "Será necessário comprar 0.50Kg de queijo, 0.50Kg de presunto e 1.00Kg de carne." |
| 20         | 1.00                        | 1.00                         | 2.00                        | "Será necessário comprar 1.00Kg de queijo, 1.00Kg de presunto e 2.00Kg de carne." |
 */

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double queijo,presunto,carne,sanduba;

        //Strings
        String ssanduba;

        ssanduba = JOptionPane.showInputDialog(null,"Quantos sanduíches serão feitos?");
        sanduba = Double.parseDouble(ssanduba);

        //Main code
        queijo = (sanduba * 50)/1000;
        presunto = (sanduba * 50)/1000;
        carne = (sanduba * 100)/1000;

        //Output
        JOptionPane.showMessageDialog(null,"Será necessário comprar " + queijo + "Kg de queijo, " + presunto + "Kg de presunto e " + carne + "Kg de carne.");
    }
}
