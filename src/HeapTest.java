import static org.junit.Assert.*;
import org.junit.Test;

public class HeapTest {

    @Test
    public void HeapIsEmpty() {
        Heap heap = new Heap();
        assertTrue(heap.isEmpty());
        assertEquals(0, heap.size());
    }
}
