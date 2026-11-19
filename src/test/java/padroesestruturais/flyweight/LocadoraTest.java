package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LocadoraTest {

    @Test
    void deveRetornarVeiculos() {
        Locadora locadora = new Locadora();
        locadora.cadastrar("ABC-1234", "Onix", "Chevrolet");
        locadora.cadastrar("DEF-5678", "Onix", "Chevrolet");
        locadora.cadastrar("GHI-9012", "Onix", "Chevrolet");
        locadora.cadastrar("JKL-3456", "Argo", "Fiat");

        List<String> saida = Arrays.asList(
                "Veiculo{placa='ABC-1234', modelo='Onix', fabricante='Chevrolet'}",
                "Veiculo{placa='DEF-5678', modelo='Onix', fabricante='Chevrolet'}",
                "Veiculo{placa='GHI-9012', modelo='Onix', fabricante='Chevrolet'}",
                "Veiculo{placa='JKL-3456', modelo='Argo', fabricante='Fiat'}");

        assertEquals(saida, locadora.obterVeiculos());
    }

    @Test
    void deveRetornarTotalModelos() {
        Locadora locadora = new Locadora();
        locadora.cadastrar("ABC-1234", "Onix", "Chevrolet");
        locadora.cadastrar("DEF-5678", "Onix", "Chevrolet");
        locadora.cadastrar("GHI-9012", "Onix", "Chevrolet");
        locadora.cadastrar("JKL-3456", "Argo", "Fiat");

        assertEquals(2, ModeloFactory.getTotalModelos());
    }

}
