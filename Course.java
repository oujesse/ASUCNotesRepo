import java.util.HashMap;
import java.util.PriorityQueue;
import User;
import Document;
import CoursePage;

private class Course{
  //name of course; description of course; person who created the course repo
  private String name;
  private String description;
  private User creator;
  //unsure if we're going to make a Document class. I put in a placeholder class for now.
  //maps the document's name to Document object
  private HashMap docDict;
  //holds the documents sorted by views
  private PriorityQueue docPQ;

  //constructor
  private Course(String name, String description, User creator) {
    this.name = name;
    this.description = description;
    this.creator = creator;
    docDict = new HashMap<String, Document>;
    docPQ = new PriorityQueue<Document>;
  }

  //I am unsure how requests work with java servlets so I don't know what to do with this
  //check the notes repo on slack for more info
  private void post() {
    /*

    Wendi's code here

    */
  }
  private Document[] sortDocs(int direction) {
    /*

    Wendi's code here

    */
  }
  //called by User object
  private void addComment(User user, String comment, Document doc) {
    /*

    Wendi's code here

    */
  }
  //called by User object
  private void removeComment(User user, Document doc, int commentIndex) {
    /*

    Wendi's code here

    */
  }

  //gets name, description of course, and uploader along with docs uploaded, their uploaders, and their titles
  //called by User object
  private CoursePage get() {
    return new CoursePage(name, description, creator, docPQ.toArray());
  }
  //called by User object
  private void uploadDocument(User user, String documentBody, String docName){
    //ensures no document has the same name
    if (!docDict.containsKey(docName)) {
      docDict.put(docName, new Document(docName, documentBody, user, this));
    }
  }
  //called by User object
  private void removeDocument(String docName, User user) {
    Document document = docDict.get(docName);
    //ensures the user is authorized to remove the document
    if (docName.getUploader() == user || user.isAdmin()) {
      docPQ.remove(document);
      docDict.remove(docName);
    }
  }
  //called by User object
  private void addRating(String docName, User user, float rating) {
    Document document = docDict.get(docName);
    document.addRating(user, rating);
    //alerts user if avg rating for document drops below 3/5
    if (docment.getAverageRating() < 3.0/5.0 && document.getNumRatings > 3.0) {
      user.receiveMessage("ALERT: your document " + docName + " has an average rating below 3/5. Please consider revising it.");
    }
  }
}
