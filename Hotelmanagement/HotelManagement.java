import java.util.Scanner;

public class HotelManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
;
        fooditem burger = new fooditem("Burger", 5,3);
        fooditem biryani = new fooditem("biryani",300,2);
        Order order = new Order();

        System.out.println("welcome to restaurent");

        while(true){
            System.out.println("receipt");
            System.out.println("the price for buger is"+burger.getPrice());
            System.out.println("finish order");

            int choice = sc.nextInt();
            if(choice==3){
                break;
            }
            fooditem selecteditem  = null;
            switch (choice){
                case 1:
                    selecteditem = burger;
                    break;
                case 2:
                    selecteditem = biryani;
                    break;
                default:
                    System.out.println("invalid choice");
            }
            if(selecteditem!=null){
                order.additems(selecteditem);
                System.out.println(selecteditem.getItemname()+"item added to your list");
            }
            System.out.println("order summary");
            for(fooditem item: order.getitems()){
              System.out.println(item.getItemname()+" price is "+item.getPrice());
            }
            System.out.println("total price is "+order.gettotal());
            sc.close();
        }
    }
}
