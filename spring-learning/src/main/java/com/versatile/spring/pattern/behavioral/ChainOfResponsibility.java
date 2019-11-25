//Chain of Responsibility uses for working with object step by step

package com.versatile.spring.pattern.behavioral;

public class ChainOfResponsibility {
    public void useChainOfResponsibility(){
        MessageAbstr message = new LogMessage();
        MessageAbstr message2 = new ConsoleMessage();
        MessageAbstr message3 = new MyMessage();
        message.setNextMessage(message2);
        message2.setNextMessage(message3);
        message.print("My Dear");

    }
}

abstract class MessageAbstr{
    MessageAbstr nextMessage;

    public void setNextMessage(MessageAbstr nextMessage) {
        this.nextMessage = nextMessage;
    }

    void print(String message){
        printMessage(message);
        if (nextMessage != null){
            nextMessage.print(message);
        }
    }

    abstract void printMessage(String nextMessage);
}

class LogMessage extends MessageAbstr{
    @Override
    void printMessage(String nextMessage) {
        System.out.println("Log message: " + nextMessage);
    }
}

class ConsoleMessage extends MessageAbstr{
    @Override
    void printMessage(String nextMessage) {
        System.out.println("Console message: " + nextMessage);
    }
}

class MyMessage extends MessageAbstr{
    @Override
    void printMessage(String nextMessage) {
        System.out.println("My message: " + nextMessage);
    }
}