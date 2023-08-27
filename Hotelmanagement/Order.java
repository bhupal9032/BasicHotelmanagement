import java.util.ArrayList;
import java.util.List;

public class Order {
    //we have to create array list
  private List<fooditem> items = new ArrayList<>();
  public void additems(fooditem item){
      items.add(item);
  }
  public   List<fooditem> getitems(){
      return items;
  }

  public int gettotal(){
      int total =0;
      for(fooditem item:items){
          total+= fooditem.getPrice();
      }
      return total;
  }
}
