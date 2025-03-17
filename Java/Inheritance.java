//This is example of the Single inheritance

// class Automobile {
//     String engine;
//     String company;
// }

// class Vehicle extends Automobile {
//     int Wheel;
//     String owner;
// }
// public class Inheritance {
// public static void main(String[] args) {
//     Vehicle myVehicle = new Vehicle();
//     myVehicle.engine = "V8";
//     myVehicle.company = "Toyota";
//     myVehicle.Wheel = 4;
//     myVehicle.owner="samir Srinath";

//     System.out.println("Engine: " + myVehicle.engine);
//     System.out.println("Company: " + myVehicle.company);
//     System.out.println("Wheels: " + myVehicle.Wheel);
//     System.out.println("Owner: " + myVehicle.owner);
    
// }    
// }



//  This is an example of Multilevel inheritance

class Automobile {
    String engine;
    String company;
}

class Vehicle extends Automobile {
    int wheel;
    String owner;
}

class Car extends Vehicle {
    String model;
    int year;
}

public class Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.engine = "V8";
        myCar.company = "Toyota";
        myCar.wheel = 4;
        myCar.owner = "Samir Srinath";
        myCar.model = "Camry";
        myCar.year = 2021;

        System.out.println("Engine: " + myCar.engine);
        System.out.println("Company: " + myCar.company);
        System.out.println("Wheels: " + myCar.wheel);
        System.out.println("Owner: " + myCar.owner);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
    }
}



// This is an example of Hierarchical inheritance

// class Automobile {
//     String engine;
//     String company;
// }

// class Car extends Automobile {
//     String model;
//     int year;
// }

// class Bike extends Automobile {
//     boolean hasCarrier;
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         Car myCar = new Car();
//         myCar.engine = "V8";
//         myCar.company = "Toyota";
//         myCar.model = "Camry";
//         myCar.year = 2021;

//         Bike myBike = new Bike();
//         myBike.engine = "Single Cylinder";
//         myBike.company = "Yamaha";
//         myBike.hasCarrier = true;

//         System.out.println("Car Details:");
//         System.out.println("Engine: " + myCar.engine);
//         System.out.println("Company: " + myCar.company);
//         System.out.println("Model: " + myCar.model);
//         System.out.println("Year: " + myCar.year);

//         System.out.println("\nBike Details:");
//         System.out.println("Engine: " + myBike.engine);
//         System.out.println("Company: " + myBike.company);
//         System.out.println("Has Carrier: " + myBike.hasCarrier);
//     }
// }


// This is an example of Hybrid inheritance

// class Automobile {
//     String engine;
//     String company;
// }

// class Vehicle extends Automobile {
//     int wheel;
//     String owner;
// }

// class Car extends Vehicle {
//     String model;
//     int year;
// }

// class ElectricCar extends Car {
//     int batteryCapacity;
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         ElectricCar myElectricCar = new ElectricCar();
//         myElectricCar.engine = "Electric";
//         myElectricCar.company = "Tesla";
//         myElectricCar.wheel = 4;
//         myElectricCar.owner = "Samir Srinath";
//         myElectricCar.model = "Model S";
//         myElectricCar.year = 2022;
//         myElectricCar.batteryCapacity = 100;

//         System.out.println("Electric Car Details:");
//         System.out.println("Engine: " + myElectricCar.engine);
//         System.out.println("Company: " + myElectricCar.company);
//         System.out.println("Wheels: " + myElectricCar.wheel);
//         System.out.println("Owner: " + myElectricCar.owner);
//         System.out.println("Model: " + myElectricCar.model);
//         System.out.println("Year: " + myElectricCar.year);
//         System.out.println("Battery Capacity: " + myElectricCar.batteryCapacity + " kWh");
//     }
// }