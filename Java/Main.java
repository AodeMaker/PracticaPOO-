package Java;

class Main {
    public static void main(String[] args) {
        UberX uberX = new UberX("AMQ123",new Account("Andres Herrera", "AND123"),"Chevrolet","Sonic"); 
        uberX.setPassenger(4);
        uberX.printDatacar();

        UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDatacar();
        /*Car car2 = new Car("QWE567",new Account("Andrea Herrera", "ANDA876"));
        car2.passegenger=3;
        car2.printDatacar();*/
    }
}
