import static org.junit.Assert.*;
import org.junit.Test;
import java.util.NoSuchElementException;

public class HeapTest {

    @Test
    public void HeapIsEmpty() {
        Heap heap = new Heap();
        assertTrue(heap.isEmpty());
        assertEquals(0, heap.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void peekOnEmptyHeapThrows() {
        new Heap().peek();
    }
}
