package stack;
import java.util.ArrayList;


public class Stack<T> {
    private ArrayList<T> data;

    public Stack() {
        this.data = new ArrayList<>();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int length() {
        return data.size();
    }

    public T pop() {
        if (!data.isEmpty()) {
            return data.remove(data.size() - 1);
        }
        throw new RuntimeException("Desbalance, no se puede hacer pop sin hacer un push primero");
    }

    public T peek() {
        if (!isEmpty()) {
            return data.get(data.size() - 1);
        }
        throw new RuntimeException("Stack is empty");
    }

    public void push(T value) {
        data.add(value);
    }

    public void BalancePp(String texto) {
        Stack<Character> pilaBalance = new Stack<>();
        for (int i = 0; i < texto.length(); i++) {
            char caracterActual = texto.charAt(i);

            if (caracterActual == '(') {
                pilaBalance.push(caracterActual);
                System.out.println("Push (");
            }
            else if (caracterActual == ')') {
                pilaBalance.pop();
                System.out.println("Pop ) ");
            } else if (caracterActual == '{') {
                pilaBalance.push(caracterActual);
                System.out.println("Push {");
            }else if (caracterActual == '}') {
                pilaBalance.pop();
                System.out.println("Pop }");

            }

        }

        if (!pilaBalance.isEmpty()) {
            System.out.println("Desbalance, falta cerrar");
        } else {
            System.out.println("Esta balanceado");
        }
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("-----\n");
        for (int i = data.size() - 1; i >= 0; i--) {
            info.append(data.get(i)).append("\n|---|\n");
        }
        return info.toString();
    }
}
