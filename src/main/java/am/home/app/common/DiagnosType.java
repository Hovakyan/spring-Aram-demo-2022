package am.home.app.common;

import lombok.Getter;

import java.io.Serializable;

@Getter
public enum DiagnosType implements Serializable {

    SICK("s"),
    HEALTHY("h");

    private String name;

    DiagnosType(String name) {
        this.name = name;
    }


    /*public static DiagnosType getvalue( String doctorName) {

        if(doctorName == null) {
            throw new IllegalArgumentException();
        }


        for (DiagnosType value : DiagnosType.values()
                ) {

            if (value.getDoctorName().equals(doctorName))

                return value;

        }
        throw new IllegalArgumentException();

    }*/

    @Override
    public String toString() {
        return super.toString();
    }



}
