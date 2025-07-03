package ytespring.egitim.demo.example;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TcKimlikNoValidator implements ConstraintValidator<TcKimlikNo, String> {

    @Override
    public void initialize(final TcKimlikNo constraintAnnotation) {
        // Initialization logic if needed
    }

    @Override
    public boolean isValid(String tcKimlikNo, ConstraintValidatorContext context) {
        if (tcKimlikNo == null || tcKimlikNo.length() != 11) {
            return false; // TC Kimlik No must be 11 characters long
        }

        try {
            long number = Long.parseLong(tcKimlikNo);
            // Additional validation logic can be added here
            return true; // Placeholder for actual validation logic
        } catch (NumberFormatException e) {
            return false; // Not a valid number
        }
    }
}
