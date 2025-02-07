package E12_zad2_memory;

public class DiscManager implements MemoryManager{
    @Override
    public void allocateMemory(int size) {
        System.out.println("Allocating Disc memory: "+size+" GB");
    }
}
