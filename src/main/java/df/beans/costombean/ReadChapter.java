package df.beans.costombean;

public class ReadChapter {
    private int chapter_Id;
    private String title;
    private int content_id;
    private String content;
//    private String[] rows;

    public ReadChapter() {
    }

    public ReadChapter(int chapterId, String title, int content_id, String content) {
        this.chapter_Id = chapterId;
        this.title = title;
        this.content_id = content_id;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getContent_id() {
        return content_id;
    }

    public void setContent_id(int content_id) {
        this.content_id = content_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getChapter_Id() {
        return chapter_Id;
    }

    public void setChapter_Id(int chapter_Id) {
        this.chapter_Id = chapter_Id;
    }

//    public String[] getRows() {
//        return rows;
//    }
//
//    public void setRows(String[] rows) {
//        this.rows = rows;
//    }

    @Override
    public String toString() {
        return "ReadChapter{" +
                "chapterId=" + chapter_Id +
                ", title='" + title + '\'' +
                ", content_id=" + content_id +
                ", content='" + content + '\'' +
                '}';
    }
}
