import java.util.HashSet;
import UserPage;

private class User {
  private String name;
  private String password;
  private String email;
  private Course[] courses;
  private HashSet uploadedDocs;
  private HashSet viewedDocs;
  private Boolean admin;
  //constructor
  //make sure to initialize all instance variables
  private User(String name, String password, String email, Boolean admin) {
    /*

    Wendi's code here

    */
  }
  private isAdmin() {
    /*

    Wendi's code here

    */
  }
  //I am unsure of how java servlets work
  //check notes repo spec on slack for details
  private void post() {
    /*

    Wendi's code here

    */
  }
  private void upLoadDocument(String docName, String docBody, Course course) {
    /*

    Wendi's code here

    */
  }

  //unsure of what to do with this yet
  private UserPage get() {
    return new UserPage(name, courses, uploadedDocs.toArray(), viewedDocs.toArray());
  }
  //unsure of what to do with this yet
  private void view(Document document) {
    viewedDocs.add(document);
    document.incrementViews();
    //other stuff I'm unsure of
  }
  private void addRepo(String name, String description) {
    //unsure of what to do yet, have to wait for database
  }
  private void reportCourse(Course course) {
    //unsure yet
  }
  private void reportDocument(Document document) {
    //unsure yet
  }
  private void receiveMessage(String msg) {
    //unsure yet
  }
}
