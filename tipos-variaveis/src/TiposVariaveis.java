import java.util.Locale;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Estrutura variável: <Tipo> <nomeVariável> = <atribuicaoDeValorOpcional>;

        String nomePessoa = "Thiago";
        int idadePessoa = 46;
        char gender = 'M';
        double salarioMinimo = 1620.00;
        float alturaPessoa = 1.75f;

        short numeroCurto = 1;
        int numeroNormal1 = numeroCurto;
        short numeroCurto2 = (short) numeroNormal1; //casting

        //É muito comum que o valor de uma variável seja alterado ao longo do tempo, então é possível fazer a reatribuição de valores para variáveis já declaradas.
        //No entanto o valor de uma variável declarada como final não pode ser alterado, ou seja, ela se torna uma constante.
        final double VALOR_DE_PI = 3.14;

        
        Locale.setDefault(Locale.US);
    }
}
