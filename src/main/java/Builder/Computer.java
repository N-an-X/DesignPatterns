package Builder;

import java.util.List;

public class Computer {

    private String cpu;
    private String motherboard;
    private List<String> hdds;

    public Computer(String cpu, String motherboard, List<String> hdds) {
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.hdds = hdds;
    }
}

