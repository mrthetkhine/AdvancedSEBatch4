package com.turing.advancedse4.designpattern.prototype;

public interface Prototype extends Cloneable {
	Prototype reproduce()throws CloneNotSupportedException;
}
