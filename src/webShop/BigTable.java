package webShop;

public class BigTable extends Table {
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getInfo() {
        return this.info;
    }
}
