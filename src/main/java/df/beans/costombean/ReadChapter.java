package df.beans.costombean;

public class ReadChapter {
    private int chapterId;
    private String title;
    private int contentId;
    private String content;
//    private String[] rows;

    public ReadChapter() {
    }

    public ReadChapter(int chapterId, String title, int contentId, String content) {
        this.chapterId = chapterId;
        this.title = title;
        this.contentId = contentId;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getContent_id() {
        return contentId;
    }

    public void setContent_id(int contentId) {
        this.contentId = contentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getChapter_Id() {
        return chapterId;
    }

    public void setChapter_Id(int chapterId) {
        this.chapterId = chapterId;
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
                "chapterId=" + chapterId +
                ", title='" + title + '\'' +
                ", contentId=" + contentId +
                ", content='" + content + '\'' +
                '}';
    }
}
