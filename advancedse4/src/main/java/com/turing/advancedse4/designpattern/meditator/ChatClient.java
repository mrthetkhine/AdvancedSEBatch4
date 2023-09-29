package com.turing.advancedse4.designpattern.meditator;

public interface ChatClient {
	public void receiveMessage(String message);
    public void sendMessage(String message);
}
