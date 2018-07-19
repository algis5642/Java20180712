package days.fifth;

public enum Week {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7), DEFAULT(0);

    private int id;

    Week(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Week getWeekById(int numb) {
        Week result = DEFAULT;
        for (Week w : Week.values()) {
            if (w.getId() == numb) {
                result = w;
                break;
            }
        }
        return result;
    }
}


