public class Main {
    public static void main(String[] args) {
        // Автобусы
        Bus mersedes= new Bus ("Мерседес", " 151", 4, Capacity.AVERAGE);
        Bus lada = new Bus("Лада", "112", 3, Capacity.BIG);
        Bus audi = new Bus("Ауди", " АР22", 5, Capacity.SMALL);
        Bus kia= new Bus("Киа", " А5", 3, Capacity.VERY_BIG);
//        kia.printInfo();
//        mersedes.printInfo();
//        lada.printInfo();
//        audi.printInfo();
 //       kia.ESPECIALLY_SMALL();
        kia.printType();


        //Легковые
//        PassengerCars lada1 = new PassengerCars( "Лада", " Гранта", 1.5);
//        PassengerCars volga = new PassengerCars(" Лада", " Волга", 2);
//        PassengerCars spectra = new PassengerCars("Киа", " Спектра", 2);
//        PassengerCars bmw = new PassengerCars("БМВ", " i8", 3);
//        volga.printInfo();
//        lada1.printInfo();
//        spectra.printInfo();
//        bmw.printInfo();

        // Грузовые
//        Cargo gazel = new Cargo("Лада", " Газель", 3.5);
//        Cargo solaris = new Cargo( " Хэндай", " Солярис", 2.5);
//        Cargo Hyundai = new Cargo(" Хэндай", " Спортейдж", 3);
//        Cargo g5 = new Cargo(" Ауди", " g5", 2);
//        gazel.printInfo();
//        solaris.printInfo();
//        Hyundai.printInfo();
//        g5.printInfo();



//        Driver<Cargo>Bob = new Driver<>("Боб", "да",5);
//        Bob.driveC(gazel);
//
//        Driver<PassengerCars>Ivan = new Driver<PassengerCars>(" Иванов Иван Иванович", "да", 10);
//        Ivan.driveB(bmw);
//
       Driver<Bus> kolia = new Driver<>("Николаев Николай Николевич", "да", 7);
       kolia.driveD(mersedes);
//
//
 }
}