package homework_4;

public class Device {

	Device repair() {
        System.out.println("Устройство починено");
        return this;
    }
}

class Phone extends Device {
    
}

class SmartPhone extends Phone {
 }
