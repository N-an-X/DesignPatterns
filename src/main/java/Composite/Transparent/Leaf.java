package Composite.Transparent;

import java.util.List;

public class Leaf extends Component{
    @Override
    @Deprecated
    void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    List<Component> getChildren() {
        throw new UnsupportedOperationException();
    }
}
