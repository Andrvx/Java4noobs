package entities;
import org.junit.*;
import service.RectanguloService;
import static org.junit.jupiter.api.Assertions.*;

public class RectanguloTest {
    RectanguloService rs;
    public RectanguloTest(){
    }
    @BeforeClass
    public static void setUpClass(){
    }

    @AfterClass
    public static void tearDownClass(){
    }

    @Before
    public void setUp(){
        rs=new RectanguloService();
    }

    @After
    public void tearDown(){
    }

    @Test
    public void deberiaAsignarColor(){
        assertNotNull(new Rectangulo(1,1).getColor());
        assertTrue(new Rectangulo(1,1).getColor().contains("No blanco"));
        assertEquals("No blanco",new Rectangulo(1,1).getColor());
    }

    @Test
    public void deberiaAsignarGrandote(){
        assertTrue(new Rectangulo(10,11).isGrandote());
        assertFalse(new Rectangulo(10,10).isGrandote());
    }

    @Test
    public void deberiaCalcularArea(){
        assertEquals(100,rs.calcularArea(new Rectangulo(10,10)),0);
        assertEquals(25,rs.calcularArea(new Rectangulo(5,5)),0);
        assertEquals(1.5,rs.calcularArea(new Rectangulo(1.5,1)),0);
    }

    @Test
    public void deberiaCalcularPerimetro(){
        assertEquals(4,rs.calcularPerimetro(new Rectangulo(1,1)),0);
        assertEquals(14,rs.calcularPerimetro(new Rectangulo(2,5)),0);
        assertEquals(12.5,rs.calcularPerimetro(new Rectangulo(1.25,5)),0);
    }
}