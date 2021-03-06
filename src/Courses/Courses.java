package Courses;

import Professor.Professors;
import Students.Students;

import java.util.ArrayList;
import java.util.List;

public class Courses {
 private String courseName;
 private int roomAsigned;
 protected List <Students> studentsAtCourse;
 protected  Professors professorsCourse;

 //constructor

 public Courses(String courseName, int roomAsigned, Professors professorsCourse) {
  this.courseName = courseName;
  this.roomAsigned = roomAsigned;
  this.professorsCourse = professorsCourse;
  this.studentsAtCourse=new ArrayList<>();

 }

 //methods


 public void addStudentsToCourse(Students students){
   this.studentsAtCourse.add(students);
 }
 public String getCourseName() {
  return courseName;
 }


 public int getRoomAsigned() {
  return roomAsigned;
 }


 public List<Students> getStudentsAtCourse() {
  return studentsAtCourse;
 }

 public Professors getProfessorsCourse() {
  return professorsCourse;
 }


}

