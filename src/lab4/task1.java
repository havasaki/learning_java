package lab4;

public class task1 {
    public static void main(String[] args) {
        Proccessor proccessor = new Proccessor("Intel Core i5", 2.3, 8);
        Memory memory = new Memory(32);
        Monitor monitor = new Monitor("1920x1080");
        Computer computer = new Computer(Brand.DELL, proccessor, memory, monitor);
        System.out.println(computer);
    }

    enum Brand {
        ASUS,
        DELL,
        HP,
        LENOVO,
        APPLE
    }
}
class Proccessor{
    private String model;
    private double speed;
    private int cores;
    public Proccessor(String model, double speed, int cores){
        this.model=model;
        this.speed=speed;
        this.cores=cores;
    }
    public String getModel(){
        return model;
    }
    public double getSpeed(){
        return speed;
    }
    public int getCores(){
        return cores;
    }
    @Override
    public String toString(){
        return String.format("Proccessor: %s, Speed: %.2f GHz, Cores: %d",model,speed,cores);
    }
}
class Memory{
    private int size;
    public Memory(int size){
        this.size=size;
    }
    public int getSize(){
        return size;
    }
    @Override
    public String toString(){
        return String.format("Memory: %d GB",size);
    }
}
class Monitor{
    private String resolution;
    public Monitor(String resolution){
        this.resolution=resolution;
    }
    public String getResolution(){
        return resolution;
    }
    @Override
    public String toString(){
        return String.format("Monitor: %s",resolution);
    }
}
class Computer{
    private task1.Brand brand;
    private Proccessor proccessor;
    private Memory memory;
    private Monitor monitor;
    public Computer(task1.Brand brand, Proccessor proccessor, Memory memory, Monitor monitor){
        this.brand=brand;
        this.proccessor=proccessor;
        this.memory=memory;
        this.monitor=monitor;
    }
    public task1.Brand getBrand() {
        return brand;
    }

    public Proccessor getProcessor() {
        return proccessor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }
    @Override
    public String toString(){
        return String.format("Computer Brand: %s\n%s\n%s\n%s",
                brand,
                proccessor,
                memory,
                monitor);
    }
}



