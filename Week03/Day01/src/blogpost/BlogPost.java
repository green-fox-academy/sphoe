package blogpost;

import java.util.Date;

public class BlogPost {
  private String authorName;
  private String title;

  public String getAuthorName() {
    return authorName;
  }

  public String getTitle() {
    return title;
  }

  public String getText() {
    return text;
  }

  public String getPublicationDate() {
    return publicationDate;
  }

  private String text;
  private String publicationDate;
  
  public void setText(String text) {
    this.text = text;
  }
  
  public BlogPost(String authorName, String title, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.publicationDate = publicationDate;
  }
}
