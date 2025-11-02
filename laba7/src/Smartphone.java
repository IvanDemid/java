public class Smartphone extends ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Смартфон включается...");
    }
    public Smartphone (String name){
        super (name);
        }
}
