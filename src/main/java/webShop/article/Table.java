package webShop.article;

import webShop.Article;

public abstract class Table implements Article {
    protected String name;
    protected String info;
    protected int price;
    protected int size;

    @Override
    public abstract String getName();

    @Override
    public abstract int getPrice();

    @Override
    public abstract String getInfo();

    public abstract int getSize();
}
