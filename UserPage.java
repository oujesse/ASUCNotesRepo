public class UserPage {
  private String name;
  private Course[] courses;
  private Document[] uploadedDocs;
  private Document[] viewedDocs;

  private UserPage(String name, Course[] courses, Document[] uploadedDocs, Document[] viewedDocs) {
    this.name = name;
    this.courses = courses;
    this.uploadedDocs = uploadedDocs;
    this.viewedDocs = viewedDocs;
  }
  /*
  More will be filled out once we get a more tangible idea of how this CoursePage will look and interact with the front end
  */
}
