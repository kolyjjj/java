package li.koly;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RTTITest {

    private List<Shape> shapes;

    @Before
    public void setUp() throws Exception {
        shapes = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
    }

    @Test
    public void should_return_circle_draw() {
//        List<Shape> shapes = new List<Shape>(){
//            new Circle(), new Square(), new Triangle()
//        };
        assertThat(shapes.get(0).draw(), is("Circle.draw"));
    }
    @Test
    public void should_return_square_draw() {
        assertThat(shapes.get(1).draw(), is("Square.draw"));
    }
    @Test
    public void should_return_triangle_draw() {
        assertThat(shapes.get(2).draw(), is("Triangle.draw"));
    }

    @Test
    public void should_rotate_triangle() {
        StringBuilder result = new StringBuilder();
        for (Shape shape : shapes) {
            result.append(shape.rotate());
        }
        assertThat(result.toString(), is("Triangle.rotate"));
    }
}
