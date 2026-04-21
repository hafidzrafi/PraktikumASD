package Jobsheet9.tugas;

public class StackSurat19 {
    Surat19[] stack;
    int size;
    int top;

    public StackSurat19(int size) {
        this.size = size;
        stack = new Surat19[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == - 1;
    }

    public void push(Surat19 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Array sudah penuh!");
        }
    }

    public Surat19 pop() {
        if (!isEmpty()) {
            Surat19 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Array kosong!");
            return null;
        }
    }

    public Surat19 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Array kosong!");
            return null;
        }
    }

    public void searching(String cari) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(cari)) {
                stack[i].print();
                System.out.println();
            }
        }
    }
}
