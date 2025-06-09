package org.scoula.app;

import org.scoula.beans.Parrot;
import org.scoula.beans.Person;
import org.scoula.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Person person = context.getBean(Person.class);
    System.out.println(person.getName());

    Parrot parrot = context.getBean(Parrot.class);
    System.out.println(parrot.getName());


  }
}