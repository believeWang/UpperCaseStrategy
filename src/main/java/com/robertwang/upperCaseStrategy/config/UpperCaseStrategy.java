package com.robertwang.upperCaseStrategy.config;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Collection;

public class UpperCaseStrategy extends PropertyNamingStrategyBase {


  private static final long serialVersionUID = -2727906998525352538L;

  @Override
  public String nameForGetterMethod(
      MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
    Class<?> rawReturnType = method.getRawReturnType();
    if (Collection.class.isAssignableFrom(rawReturnType)) {

      return translate(defaultName);
    } else {
      return upperCaseTranslate(defaultName);
    }
  }

  @Override
  public String nameForSetterMethod(
      MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
    Class<?> rawReturnType = method.getParameterType(0).getRawClass();
    if (Collection.class.isAssignableFrom(rawReturnType)) {

      return translate(defaultName);
    } else {
      return upperCaseTranslate(defaultName);
    }
  }

  @Override
  public String translate(String propertyName) {

    return propertyName;
  }

  public String upperCaseTranslate(String propertyName) {

    return propertyName.toUpperCase();
  }
}
