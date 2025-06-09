package org.scoula.ex01.config;

import javax.annotation.processing.Filer;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[0];
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[0];
  }

  @Override
  protected String[] getServletMappings() {
    return new String[0];
  }

  protected Filer[] getServletFilers() {
    CharacterEncodingFilter filter = new CharacterEncodingFilter();

    filter.setEncoding("UTF-8");
    filter.setForceEncoding(true);

    return new Filer[0] ;
  }
}
