package lesson003.run_static_programm;

/*
    Work only in 1.8 jdk
    Run:
        ~: java src/lesson003/RunStaticProgramm.java
    Output:
        ~: Run static programm
 */
class RunStaticProgramm {
    static {
        System.out.println("Run static programm");
        System.exit(0);
    }
}
