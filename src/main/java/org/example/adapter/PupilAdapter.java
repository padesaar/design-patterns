package org.example.adapter;

import java.util.Collection;

public class PupilAdapter implements Student{
    private Pupil pupil;

    public PupilAdapter(Pupil pupil) {
        this.pupil = pupil;
    }


    @Override
    public String getFullName() {
        return pupil.getFirstName() + " " + pupil.getLastName();
    }

    @Override
    public String getContactDetails() {
        return pupil.getEmail();
    }

    @Override
    public boolean isAdult() {
        return pupil.getAge() >= 18;
    }

    @Override
    public Collection<Integer> getResults() {
        return pupil.getGrades();
    }
}
