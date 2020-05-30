package pjatk;

import javax.validation.*;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.*;






public class AccValidator implements ConstraintValidator<VerifyAccount, Long> {
  private Integer someVar;
  @Override
    public void initialize(VerifyAccount constraintAnnotation) {
      int someVar = constraintAnnotation.key();
    }



    @Override
    public boolean isValid(Long id, ConstraintValidatorContext constraintValidatorContext) {
      if (id instanceof Long){}
      return true;
    }
}
