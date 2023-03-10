package homework.exercise.homework9;

public class Stack {

    private char[] stack = new char[10];
    private int tos;

    public Stack() {
        tos = -1;
    }

    private void extend() {
        char[] large = new char[stack.length + 5];
        for (int i = 0; i < tos; i++) {
            large[i] = stack[i];
        }
        stack = large;
    }

    public void push(char item) {
        if (tos == stack.length - 1) {
            extend();
        } else {
            stack[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
