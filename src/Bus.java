public class Bus extends Car implements Competing, ICanDrive{

    public enum Capacity{
        ESPECIALLY_SMALL("особо малая ", "до 10 мест" ),
        SMALL("малая ", "до 25 мест"),
        AVERAGE("средняя", " от 40 до 50 мест"),
        BIG("большая ", " от 60 до 80 мест"),
        VERY_BIG("особо большая ", " от 100 до 120 мест");
        private String Capacity;
     private String Capacity1;

        public static Bus.Capacity ESPECIALLY_SMALL() {
            return ESPECIALLY_SMALL;
        }

        public String getCapacity1() {
            return Capacity1;
        }
        public void setCapacity1(String capacity1) {
          Capacity1 = capacity1;
       }


        Capacity(String capacity, String capacity1) {

            Capacity = capacity;
            Capacity1 =capacity1;
        }

        public String getCapacity() {
            return Capacity;
        }

    }
    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    protected void beginMovement() {
        System.out.println( " Я начинаю движение");


    }
    public void ESPECIALLY_SMALL(){
        System.out.println(" Грузоподъемность " + Capacity.ESPECIALLY_SMALL());
    }

    @Override
    protected void completeMovement() {
        System.out.println(" Я заканчиваю движение");
    }

    @Override
    public void pitStop() {
        System.out.println(" Пит-Стоп 3 минуты");

    }

    @Override
    public void bestLapTime() {
        System.out.println(" Лучший круг за 6 минут");

    }

    @Override
    public void maximumSpeed() {
        System.out.println(" Лучшая скорость 180 км в час");

    }
    public void startMoving() {

    }
    public void stop() {

    }

    public void refuel() {

    }
    public void driver(String categori) {

    }
    public void Capacity(String Capacity,String Capacity1){

        System.out.println("Грузоподъемность " + Capacity + " весом " + Capacity1 + " тонн" );
        if (Capacity == null & Capacity1 == null){


        }
        switch ( ){
            case Bus.Capacity.ESPECIALLY_SMALL:
        }

    }
}
