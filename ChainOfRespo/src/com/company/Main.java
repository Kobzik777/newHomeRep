package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Logger logger0 = new SMSLogger(Level.ERROR);
        Logger logger1 = new FileSMSLogger(Level.DEBUG);
        Logger logger2 = new EmailLogger(Level.INFO);

        logger0.setNext(logger1);
        logger1.setNext(logger2);


        logger0.writeMesg("ALARM",Level.INFO);
        logger0.writeMesg("SHO TAKOE",Level.DEBUG);
        logger0.writeMesg("WSE PROPALO",Level.ERROR);


    }
}

class Level{
    public static final int ERROR=1;
    public static final int DEBUG=2;
    public static final int INFO=3;
}

abstract class Logger{
    int priority;
    public Logger(int priority){
        this.priority = priority;
    }
    Logger next;
    abstract void writeMesg(String msg, int level);
    public void setNext(Logger next) {
        this.next = next;
    }
}

class SMSLogger extends Logger{
    public SMSLogger(int priority){
        super(priority);
    }

    public Logger getNext() {
        return next;
    }

    @Override
    public void writeMesg(String msg, int level) {
        if(level<=priority){
            System.out.println("CMC: " + msg);
        }
        if (next!=null){
            next.writeMesg(msg,level);
        }
    }
}

class FileSMSLogger extends Logger{
    public FileSMSLogger(int priority){
        super(priority);
    }

    public Logger getNext() {
        return next;
    }


    @Override
    public void writeMesg(String msg, int level) {
        if(level<=priority){
            System.out.println("Input file: " + msg);
        }
        if (next!=null){
            next.writeMesg(msg,level);
        }
    }
}

class EmailLogger extends Logger{
    public EmailLogger(int priority){
        super(priority);
    }

    public Logger getNext() {
        return next;
    }

    @Override
    public void writeMesg(String msg, int level) {
        if(level<=priority){
            System.out.println("Input email: " + msg);
        }
        if (next!=null){
            next.writeMesg(msg,level);
        }
    }
}