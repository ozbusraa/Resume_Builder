package Resume;

public class ResumeFactory {


    //public void useResume(String type){
    //    Resume r= produceResume(type);
      //  r.use();
    //}
    public Resume produceResume(String type){
     if (type=="Internship")
         return new ResumeForInternship();
     else if (type=="Work")
         return new ResumeForWork();
     else if (type=="Master")
         return new ResumeForMasterAppl();
     else
         return null; // null object bilmem ne yapılabilir
    }
}
