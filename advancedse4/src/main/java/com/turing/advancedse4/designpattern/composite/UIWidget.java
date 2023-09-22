package com.turing.advancedse4.designpattern.composite;

public abstract class UIWidget {
	String id;

    public UIWidget(String id) {
        this.id = id;
    }
  
    abstract void paint();
}
