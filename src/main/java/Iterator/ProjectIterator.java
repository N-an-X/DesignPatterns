package Iterator;

import java.util.IllegalFormatCodePointException;
import java.util.List;

public class ProjectIterator implements IProjectIterator{

    private List<IProject> projectList;

    private int currentItem = 0;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) b = false;
        return b;
    }

    public IProject next() {
        return this.projectList.get(this.currentItem++);
    }
}
