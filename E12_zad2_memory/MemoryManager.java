package E12_zad2_memory;

public interface MemoryManager {
    public abstract void allocateMemory(int size);
    default void freeMemory(){
        System.out.println("memory Freed");
    }
    public static String getMemoryType(){
        return "Memory type";
    }
}
