package Composite.Transparent;

import java.util.List;

public class Composite extends Component{
    @Override
    void add(Component component) {
        //真实的业务逻辑，增删查
    }

    @Override
    void remove(Component component) {
        //真实的业务逻辑，增删查
    }

    @Override
    List<Component> getChildren() {
        //真实的业务逻辑，增删查
        return null;
    }
}
