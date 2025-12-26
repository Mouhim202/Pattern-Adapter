import computer.*;
import computer.adapter.HdmiVgaAdapter;

public class Test {
    public static void main(String[] args) {
        UniteCental uniteCental=new UniteCental();
        uniteCental.setVga(new Ecran());
        uniteCental.print("Bonjour");
        uniteCental.setVga(new VideoProjecteur());
        uniteCental.print("Bonjour");
        HdmiVgaAdapter hdmiVgaAdapter=new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCental.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonsoir Master");

        uniteCental.setVga(new SuperVP());
        uniteCental.print("Hello");

        HdmiVgaAdapter hdmiVgaAdapter1=new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCental.setVga(hdmiVgaAdapter1);
        uniteCental.print("Bonsoir");

    }

}
