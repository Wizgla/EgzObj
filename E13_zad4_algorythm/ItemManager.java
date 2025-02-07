package E13_zad4_algorythm;

import java.util.ArrayList;
import java.util.List;

public class ItemManager<T> {
    List<T> items;

    public ItemManager() {
        this.items = new ArrayList<>();
    }
    public void addItem(T item){
        this.items.add(item);
    }
    public T getItem(int i){
        return this.items.get(i);
    }
    public int getItemCount(){
        return this.items.size();
    }
}
