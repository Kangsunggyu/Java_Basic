interface Printable {
    void print();
}

class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

// Document를 상속하면서 Printable을 구현한 클래스
class Report extends Document implements Printable {
    public Report(String content) {
        super(content);
    }

    @Override
    public void print() {
        System.out.println("Printing Report: " + getContent());
    }
}

// 다중 제한을 가진 제네릭 메서드   //
class Printer {
    // T는 Document이면서 Printable이어야 함!
    public static <T extends Document & Printable> void printDocument(T doc) { // Document를 상속하면서 Printable을 구현한 객체만 들어올 수 있다.
        System.out.println("Document Content: " + doc.getContent()); // Document 기능
        doc.print(); // Printable 기능
    }
}

public class _13_제네릭스메서드 {
    public static void main(String[] args) {
        Report report = new Report("Annual Financial Report");

        // Printer는 Document & Printable 둘 다 만족해야 함
        Printer.printDocument(report); // OK! report는 이를 만족

        // 아래는 불가능한 예시:
        // Printer.printDocument(new Document("Just a plain document"));
        // => Document는 Printable이 아님 => 컴파일 오류!
    }
}
