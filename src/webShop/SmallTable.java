package webShop;

public class SmallTable extends Table{
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
