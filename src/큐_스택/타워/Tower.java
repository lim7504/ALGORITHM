package 큐_스택.타워;

public class Tower{
    int index;
    int height;

    public Tower(int index, int height){
        this.index = index;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "index=" + index +
                ", height=" + height +
                '}';
    }
}
