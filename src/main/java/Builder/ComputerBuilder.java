package Builder;

import java.util.List;
import java.util.ArrayList;

public class ComputerBuilder implements Builder {

    private String cpu;
    private String motherboard;
    private List<String> hdds;

    public ComputerBuilder() {
        this.hdds = new ArrayList<>();
    }

    public Builder setCPU(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public Builder setMotherBoard(String motherBoard) {
        this.motherboard = motherBoard;
        return this;
    }

    public Builder setHDDS(List<String> hdds) {
        this.hdds = hdds;
        return this;
    }

    public Computer build() {
        return new Computer(cpu, motherboard, hdds);
    }
}

