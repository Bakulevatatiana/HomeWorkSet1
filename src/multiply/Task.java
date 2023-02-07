package multiply;

import java.util.Objects;

public class Task {
    private final int valuel1;
    private final int valuel2;

    public Task(int valuel1, int valuel2) {
        this.valuel1 = valuel1;
        this.valuel2 = valuel2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return (valuel1 == task.valuel1 && valuel2 == task.valuel2)
                ||(valuel1 == task.valuel2 && valuel2 == task.valuel1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valuel1* valuel2,valuel1+ valuel2);
    }

    @Override
    public String toString() {
        return String.format("%s*%s=?", this.valuel1,this.valuel2);

    }
}
