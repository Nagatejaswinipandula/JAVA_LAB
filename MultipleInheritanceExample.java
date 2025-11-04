interface Printable {
    void print();
}

interface Showable {
    void show();
}

// A class implementing multiple interfaces
class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void show() {
        System.out.println("Showing document...");
    }

    public static void main(String[] args) {
        Document d = new Document();
        d.print();
        d.show();
    }
}
