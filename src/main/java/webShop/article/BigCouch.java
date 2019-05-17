package webShop.article;

public class BigCouch extends Couch {
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int nrSeats() {
        return this.nrSeats;
    }
}
