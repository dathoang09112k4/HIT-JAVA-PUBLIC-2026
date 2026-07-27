public class Product {
    private String id;
    private String name;
    private int price;
    private double quantity;
    public Product(String id, String name,int price,double quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public double totalPrice(){
        double sum = this.price * this.quantity;
        return sum;
    }
    public void printInfo(){
        System.out.println("id: "+id);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
