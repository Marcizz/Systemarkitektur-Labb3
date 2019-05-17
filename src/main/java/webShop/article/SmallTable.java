package webShop.article;

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

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
}
