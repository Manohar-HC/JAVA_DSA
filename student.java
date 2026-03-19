class studentt {

    String name;

    void setName(String n) {
        name = n;
    }

    void display() {
        System.out.println(name);
    }

}

public class student {
    public static void main(String[] args) {

        studentt s1 = new studentt();

        s1.setName("Manohar");
        s1.display();

    }
}


/* // 1. CLASS (TOP)
class ClassName {

    // 2. VARIABLES
    datatype variable;

    // 3. METHODS
    void methodName() {
        // logic
    }

}

// 4. MAIN CLASS (BOTTOM)
public class main {
    public static void main(String[] args) {

        // 5. OBJECT
        ClassName obj = new ClassName();

        // 6. METHOD CALL
        obj.methodName();

    }
}*/