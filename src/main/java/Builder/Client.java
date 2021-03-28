package Builder;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                                        .setCPU("CPU")
                                        .setMotherBoard("motherBoard")
                                        .setHDDS(new ArrayList<String>())
                                        .build();
    }
}

