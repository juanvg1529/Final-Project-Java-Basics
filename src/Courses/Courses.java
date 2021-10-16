package Courses;

import Professor.Professors;
import Students.Students;
import java.util.List;

public class Courses {
 private String courseName;
 private int roomAsigned;
 List <Students> studentsAtCourse;
 protected Professors professorsCourse;

 //constructor
 public Courses(String courseName, int classRoom, Professors professor) {
  this.courseName=courseName;
  this.roomAsigned=classRoom;
  this.professorsCourse=professor;
 }
 //methods

 public void addStudentsToCourse(Students students){
   this.studentsAtCourse.add(students);

 }
 public String getCourseName() {
  return courseName;
 }

 public void setCourseName(String courseName) {
  this.courseName = courseName;
 }

 public int getRoomAsigned() {
  return roomAsigned;
 }

 public void setRoomAsigned(int roomAsigned) {
  this.roomAsigned = roomAsigned;
 }



 public Professors getProfessorsCourse() {
  return professorsCourse;
 }

 public void setProfessorsCourse(Professors professorsCourse) {
  this.professorsCourse = professorsCourse;
 }
}

