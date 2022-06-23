interface Candy{
    void eat();
    void order();
}

interface Drink{
    void drink();
    void order(String drinkname);
}

class Customer implements Candy,Drink{
    public void eat(){
        System.out.println("Customer is eating");
    }
    public void order(){
        System.out.println("Customer is ordering a candy");
    }
    public void order(String drinkname){
        System.out.println("Customer is ordering "+ drinkname);
    }
    public void drink(){
        System.out.println("Customer is drinking");
    }
}




// abstract class candy{
//     abstract void eat();
//     abstract void getPrice();
// }

// abstract class driks{
//     abstract void drink();
//     abstract void getPrice();
// }

// class Customer extends candy{
//     public void eat(){
//         System.out.println("customer is eating");
//     }
//     // void drink(){
//     //     System.out.println("customer is drinking");
//     // }
//     public void getPrice(){
//         System.out.println("customer is getting price");
//     }
// }

public class chmultiabs {
    public static void main(String[] args) {
        Customer cu = new Customer();
        cu.eat();
        cu.order();
    }
}
