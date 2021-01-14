package geomex.pr01;

import java.util.ArrayList;
public class Student {
    public int studentId;
    public String studentName;
    
    ArrayList<SubjectName> subjectNameList;
    ArrayList<SubjectScore> subjectScoreList;
    
    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;        
        
        subjectNameList = new ArrayList<SubjectName>();
        subjectScoreList = new ArrayList<SubjectScore>();
    }
    
    public void addSubjectName(String name){
        SubjectName subjectName_a = new SubjectName(name);
        subjectNameList.add(subjectName_a);
    }
    
    public void addSubjectScore(int score){
        SubjectScore subjectScore_a = new SubjectScore(score);
        subjectScoreList.add(subjectScore_a);
    }
    
    public void print(){
        int total = 0;
        
        for(SubjectScore subjectScore_a:subjectScoreList){
            total = 0;
            
            total += subjectScore_a.getScore();
            System.out.println("과목의 점수는 "+subjectScore_a.getScore()+"입니다.");
        }
        System.out.println();
    }
    
    
    
    
    
    
    
    
    
    

}
