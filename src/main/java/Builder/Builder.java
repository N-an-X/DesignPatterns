package Builder;

import java.util.List;

public interface Builder {

    public Builder setCPU(String cpu);
    public Builder setMotherBoard(String motherBoard);
    public Builder setHDDS(List<String> hdds);
    public Computer build();
}
