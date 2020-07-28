package blogpost;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    BlogPost firstBlogPost = new BlogPost("John Doe", "Lorem Ipsum", "2000.05.04.");
    firstBlogPost.setText("Lorem ipsum dolor sit amet");
    BlogPost secondBlogPost = new BlogPost("Tim Urban ", "Wait but why", "2010.10.10.");
    secondBlogPost
        .setText("A popular long-form, stick-figure-illustrated blog about almost everything.");
    BlogPost thirdBlogPost =
        new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump",
            "2017.03.28.");
    thirdBlogPost.setText(
        "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take " +
            "his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing");
    System.out.println(firstBlogPost.getText());
  }
}