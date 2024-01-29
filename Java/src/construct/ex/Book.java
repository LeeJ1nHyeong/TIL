package construct.ex;

// 조건 : Book 클래스 생성자 코드 중복 없이 작성하기
public class Book {
    String title;
    String author;
    int page;

    // 코드 완성하기
    Book() {
        this("", "", 0);
    }
    Book(String title, String author) {
        this(title, author, 0);
    }
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
