package webShop.article;

import webShop.Article;

public abstract class Couch implements Article {
    protected String name;
    protected String info;
    protected int price;
    protected int nrSeats;

    @Override
    public abstract String getName();

    @Override
    public abstract String getInfo();

    @Override
    public abstract int getPrice();

    public abstract int nrSeats();
}
