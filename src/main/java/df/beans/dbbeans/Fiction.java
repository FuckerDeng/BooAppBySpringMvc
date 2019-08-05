package df.beans.dbbeans;

public class Fiction {
    private Integer id;

    private String fictionName;

    private String fictionDesc;

    private String author;

    private String fictiontype;

    private String tags;

    private String localurl;

    private String imgurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFictionName() {
        return fictionName;
    }

    public void setFictionName(String fictionName) {
        this.fictionName = fictionName == null ? null : fictionName.trim();
    }

    public String getFictionDesc() {
        return fictionDesc;
    }

    public void setFictionDesc(String fictionDesc) {
        this.fictionDesc = fictionDesc == null ? null : fictionDesc.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getFictiontype() {
        return fictiontype;
    }

    public void setFictiontype(String fictiontype) {
        this.fictiontype = fictiontype == null ? null : fictiontype.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getLocalurl() {
        return localurl;
    }

    public void setLocalurl(String localurl) {
        this.localurl = localurl == null ? null : localurl.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    @Override
    public String toString() {
        return "Fiction{" +
                "id=" + id +
                ", fictionName='" + fictionName + '\'' +
                ", fictionDesc='" + fictionDesc + '\'' +
                ", author='" + author + '\'' +
                ", fictiontype='" + fictiontype + '\'' +
                ", tags='" + tags + '\'' +
                ", localurl='" + localurl + '\'' +
                ", imgurl='" + imgurl + '\'' +
                '}';
    }
}