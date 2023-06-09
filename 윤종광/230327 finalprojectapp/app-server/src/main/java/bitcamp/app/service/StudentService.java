package bitcamp.app.service;

import java.util.List;
import bitcamp.app.vo.Student;

public interface StudentService {
  void add(Student student);
  List<Student> list(String keyword);
  Student get(int no);
  Student get(String email, String password);
  void update(Student student);
  void delete(int no);
}





