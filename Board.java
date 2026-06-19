[B계정의 conflict/B에서 수정함]
//[C계정에서 Board.java 수정함]
[A계정, conflict/A브랜치에서 추가]
public class Board {
    private int    id;
    private String title;
    private String author;
}
    // feature/A: 조회수 기능 추가
    private int viewCount = 0;
    public int  getViewCount()         { return viewCount; }
    public void incrementViewCount()   { this.viewCount++; }
    // feature/A: 조회수 기능 추가
    private int viewCount = 0;
    public int  getViewCount()         { return viewCount; }
    public void incrementViewCount()   { this.viewCount++; }
