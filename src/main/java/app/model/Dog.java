package app.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Setter
@Getter
@Component
public class Dog extends Animal{
    @Override
    public String toString() {
        return "I am a Dog " + super.toString();
    }
}
