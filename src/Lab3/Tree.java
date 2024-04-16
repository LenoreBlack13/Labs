package Lab3;

public class Tree {
    private int age;
    private boolean alive;
    private String name;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал\n");
    }

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }

    public void printTree() {
        System.out.println("Age: " + age);
        System.out.println("Is alive: " + alive);
        System.out.println("Name: " + name);
        System.out.println();
    }
}
    class TreeProgram {
    public static void main(String[] args) {
        Tree tree1 = new Tree(5,"Maple");
        Tree tree2 = new Tree(7, true, "Sakura");
        Tree tree3 = new Tree();

        tree1.printTree();
        tree2.printTree();
    }
}
