class Homework5 {
    public static void main(String[] args) {
        Computer cp= new Computer( "Core i7","16GB", "2TB","White","500W");
        Monitor mt = new Monitor("24inch","Black","45W");

        PersonalComputer pc = new PersonalComputer(cp,mt);
        pc.turnOn();
        pc.printInfo();
    }
}
