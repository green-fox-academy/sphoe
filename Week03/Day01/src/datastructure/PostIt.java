package datastructure;

import java.awt.*;

public class PostIt {
  private Color backroundColor;
  private String text;
  private Color textColor;

  public PostIt(Color backroundColor, String text, Color textColor) {
    this.backroundColor = backroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  public Color getBackroundColor() {
    return backroundColor;
  }

  public void setBackroundColor(Color backroundColor) {
    this.backroundColor = backroundColor;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Color getTextColor() {
    return textColor;
  }

  public void setTextColor(Color textColor) {
    this.textColor = textColor;
  }
}
