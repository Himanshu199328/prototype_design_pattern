public class demo {
    public static void main(String[] args) throws CloneNotSupportedException{
        bookShop b1=new bookShop();
        b1.setShopName("lamba book depot");
        b1.loadData();
        bookShop b2=(bookShop) b1.clone();
        b2.setShopName("himanshu book depot");
        b1.getBooks().remove(2);
        System.out.println(b1);
        System.out.println(b2);

    }
}
