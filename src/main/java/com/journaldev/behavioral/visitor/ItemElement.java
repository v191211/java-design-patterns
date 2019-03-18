package com.journaldev.behavioral.visitor;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
