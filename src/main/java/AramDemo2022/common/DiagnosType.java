package AramDemo2022.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Getter
public enum DiagnosType implements Serializable {

    SICK("s"),
    HEALTHY("h");

    private String name;

    DiagnosType(String name) {
        this.name = name;
    }


    /*public static DiagnosType getvalue( String name) {

        if(name == null) {
            throw new IllegalArgumentException();
        }


        for (DiagnosType value : DiagnosType.values()
                ) {

            if (value.getName().equals(name))

                return value;

        }
        throw new IllegalArgumentException();

    }*/

    @Override
    public String toString() {
        return super.toString();
    }



}
