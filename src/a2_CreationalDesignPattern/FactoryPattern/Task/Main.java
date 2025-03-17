package a2_CreationalDesignPattern.FactoryPattern.Task;

import a2_CreationalDesignPattern.FactoryPattern.Task.Items.AsusGpu;
import a2_CreationalDesignPattern.FactoryPattern.Task.Items.AsusMonitor;
import a2_CreationalDesignPattern.FactoryPattern.Task.Items.MsiGpu;
import a2_CreationalDesignPattern.FactoryPattern.Task.Items.MsiMonitor;

public class Main {
    public static void main(String[] args) {

        String productType="asusmonitor";
        if(productType.equals("asusgpu")) {

            AsusGpu asusGpu = new AsusGpu();
            asusGpu.assemble();

        }else if(productType.equals("msigpu")) {

            MsiGpu msigpu = new MsiGpu();
            msigpu.assemble();

        }else if(productType.equals("msimonitor")) {

            MsiMonitor msimonitor = new MsiMonitor();
            msimonitor.assemble();

        }else if(productType.equals("asusmonitor")) {

            AsusMonitor asusmonitor = new AsusMonitor();
            asusmonitor.assemble();
        }
        else {
            System.out.println("Invalid option!");
        }

    }
}
