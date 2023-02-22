package com.Structural_Design_Pattern.CompositePattern2;

public class CompositeTest {
    public static void main(String[] args) {
        Component cpu_ut =new leaf("Utilization","2%");
        Component cpu_sp =new leaf("Speed","1.7Ghz");
        Component mem_use=new leaf("In Use","8.2GB");
        Component mem_avail=new leaf("Available","7.5GB");
        Component gpu_ut=new leaf("Utilization","1%");
        Component gpu_temp=new leaf("Temperature","42 C");

        Composite cpu=new Composite("CPU");
        Composite memory=new Composite("Memory");
        Composite gpu=new Composite("GPU");
        Composite pf=new Composite("Performance");

        pf.addComponent(cpu);
        pf.addComponent(memory);
        pf.addComponent(gpu);

        cpu.addComponent(cpu_sp);
        cpu.addComponent(cpu_ut);

        memory.addComponent(mem_use);
        memory.addComponent(mem_avail);

        gpu.addComponent(gpu_ut);
        gpu.addComponent(gpu_temp);

        cpu.showPerformance();
    }
}
