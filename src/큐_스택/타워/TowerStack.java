package 큐_스택.타워;

import java.util.Stack;

public class TowerStack{
    Stack<Tower> stack = new Stack<>();

    public TowerStack(int[] array){
        this.initStack(array);
    }

    private void initStack(int[] array){
        for(int i = 0; i < array.length; i++){
            this.stack.push(new Tower(i+1, array[i]));
        }
    }

    public void shot(){
        while (!stack.isEmpty()) {
            Tower pop = stack.pop();


            System.out.println("pop = " + pop);
        }
    }
}


