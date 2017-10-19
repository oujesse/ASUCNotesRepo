import java.util.HashMap;
import java.util.Comparator;
import User;
import Course;
import Comment;

private class Document implements Comaparable{
  private User uploader;
  private String name;
  private String docBody;
  private Course course;
  private float ratingTotal; //holds the sum of all ratings
  private float numRatings; //holds the amount of ratings there are
  private HashMap userRatings; //maps a user to the rating they made
  private float numViews; //number of users who have viewed this document
  private HashMap comments; //maps user to their [array of Comment objects] on the document
  //constructor
  private Document(String docBody, User uploader, String name, Course course) {
    //look at the course class for a reference on how to write a constructor
    /*

    Wendi's code here

    */
  }
  private get() {
    /*

    Wendi's code here

    */
  }
  private addRating(User user, float rating) {
    /*

    Wendi's code here

    */
  }
  private removeRating(User user) {
    /*

    Wendi's code here

    */
  }
  private getUploader(){
    /*

    Wendi's code here

    */
  }
  private getAverageRating(){
    /*

    Wendi's code here

    */
  }
  private getNumRatings() {
    /*

    Wendi's code here

    */
  }
  private getNumViews() {
    /*

    Wendi's code here

    */
  }
  private addComment(User user, String comment, Document doc) {
    /*

    Wendi's code here

    */
  }
  private removeComment(User user, Document doc, int commentIndex) {
    /*

    Wendi's code here

    */
  }

  private void incrementViews() {
    numViews += 1;
  }
  //used in the PriorityQueue which causes the documents to be compared based on views, with smallest views getting priority
  private int compareTo(Document otherDoc) {
    //ensures the other document is of the right type
    if (!(otherDoc instanceOf Document)) {
      throw new ClassCastException("Document object expected");
    }
    return this.numViews - otherDoc.getNumViews();
  }
}
