package com.turing.advancedse4.designpattern.meditator;

public interface ChatMediator {
	 public void addUser(User user);
	 public void sendMessage(User user,String message);
}
