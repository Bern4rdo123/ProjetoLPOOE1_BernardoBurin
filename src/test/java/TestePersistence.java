import dao.JPAPersistence;
import Model.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;

public class TestePersistence {
    
    private static JPAPersistence jpaPersistence;

    public TestePersistence() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        jpaPersistence = new JPAPersistence();
        jpaPersistence.openConnection();
    }
    
    @AfterClass
    public static void tearDownClass() {
        if (jpaPersistence.isConnected()) {
            jpaPersistence.closeConnection();
        }
    }
    
    @Before
    public void setUp() {
        // Código para configurar os testes individuais, se necessário.
    }
    
    @After
    public void tearDown() {
        // Código para limpar após cada teste, se necessário.
    }

    @Test
    public void testPersistCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Bernardo Burin");
        cliente.setCpf("12345678900");

        jpaPersistence.persist(cliente);

        Cliente clienteEncontrado = jpaPersistence.find(Cliente.class, cliente.getId());
        assertNotNull(clienteEncontrado);
        assertEquals("Bernardo Burin", clienteEncontrado.getNome());
    }

    @Test
    public void testPersistFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Igor Vinoski");
        funcionario.setCpf("98765432100");

        jpaPersistence.persist(funcionario);

        Funcionario funcionarioEncontrado = jpaPersistence.find(Funcionario.class, funcionario.getId());
        assertNotNull(funcionarioEncontrado);
        assertEquals("Igor Vinoski", funcionarioEncontrado.getNome());
    }

    @Test
    public void testPersistQuarto() {
        Quarto quarto = new Quarto();
        quarto.setNumero(109);
        quarto.setTipo("Deluxe");
        quarto.setPreco(250.00);
        quarto.setDisponibilidade(true);

        try
        {
          jpaPersistence.persist(quarto);  
          assertTrue(true);
        }
        catch(Exception e)
        {
            assertTrue(false);
        }
    }

    @Test
    public void testPersistReserva() {
        Cliente cliente = new Cliente();
        cliente.setNome("Carlos Souza");
        cliente.setCpf("11223344556");
        jpaPersistence.persist(cliente);

        Quarto quarto = new Quarto();
        quarto.setNumero(103);
        quarto.setTipo("Deluxe");
        quarto.setPreco(250.00);
        quarto.setDisponibilidade(true);
        jpaPersistence.persist(quarto);

        Reserva reserva = new Reserva();
        reserva.setCliente(cliente);
        reserva.setQuarto(quarto);
  
        reserva.setDataInicio(LocalDate.of(2024, 11, 10));
        reserva.setDataFim(LocalDate.of(2024, 11, 15));

        jpaPersistence.persist(reserva);

        Reserva reservaEncontrada = jpaPersistence.find(Reserva.class, reserva.getId());
        assertNotNull(reservaEncontrada);
        assertEquals("Carlos Souza", reservaEncontrada.getCliente().getNome());
    }
}
