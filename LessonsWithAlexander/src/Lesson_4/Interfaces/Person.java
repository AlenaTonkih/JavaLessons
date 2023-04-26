package Lesson_4.Interfaces;

public class Person {
    private Transport lastTransport;

    public void drive(Transport transport){
        transport.start();
        this.lastTransport = transport;
    }
    public void stop(){
        if(lastTransport != null){
            lastTransport.stop();
            lastTransport = null;
        }else{
            System.out.println("Я не еду");
        }
    }
}

