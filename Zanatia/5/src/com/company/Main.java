package com.company;

public class Main {

    public static final String  CONSTB = "Hello";
    public static void main(String[] args) {
	// write your code here
        String n = CONSTB;

        Patient patient = new Patient();
        String str = patient.getName();


        Doctor doctor = new Doctor();
        System.out.println(doctor.getKab());

        System.out.println(patient);

        StringBuilder st = new StringBuilder();
        st.append("waaaa");
        st.append("bbbb");
        st.append("cccc");
        st.append("dddd");
        st.append("eeee");
        st.append(1);
        System.out.println(st);








    }
}
