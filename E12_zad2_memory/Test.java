package E12_zad2_memory;

public class Test {
    public static void main(String[] args) {
        MemoryManager ram= new RamManager();
        MemoryManager disc = new DiscManager();
        ram.allocateMemory(1024);
        ram.freeMemory();
        disc.allocateMemory(512);
        disc.freeMemory();
        System.out.println(MemoryManager.getMemoryType());
    }
}
