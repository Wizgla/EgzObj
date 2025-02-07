package E12_zad2_memory;

public class RamManager implements MemoryManager{
    @Override
    public void allocateMemory(int size) {
        System.out.println("Allocating Ram memory: "+size+" MB");
    }
}
