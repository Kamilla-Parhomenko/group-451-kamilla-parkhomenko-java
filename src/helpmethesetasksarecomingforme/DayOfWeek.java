package helpmethesetasksarecomingforme;

enum DayOfWeek {
    MON, TUE, WED, THU, FRI, SAT, SUN;
    boolean isWeekend() {
        return this == SAT || this == SUN;
    }
}
