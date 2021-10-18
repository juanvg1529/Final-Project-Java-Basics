package Courses;

import Professor.Professors;
import Students.Students;

import java.util.ArrayList;
import java.util.List;

public class Courses {
 private String courseName;
 private int roomAsigned;
 protected List <Students> studentsAtCourse;
 // crear una lista en el main que reciba obj estudiante y devolver esa lista para el curso, si sabe mor
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

 public void setCourseName(String courseName) {
  this.courseName = courseName;
 }

 public int getRoomAsigned() {
  return roomAsigned;
 }

 public void setRoomAsigned(int roomAsigned) {
  this.roomAsigned = roomAsigned;
 }

 public List<Students> getStudentsAtCourse() {
  return studentsAtCourse;
 }

 public void setStudentsAtCourse(List<Students> studentsAtCourse) {
  this.studentsAtCourse = studentsAtCourse;
 }

 public Professors getProfessorsCourse() {
  return professorsCourse;
 }

 public void setProfessorsCourse(Professors professorsCourse) {
  this.professorsCourse = professorsCourse;
 }
}

