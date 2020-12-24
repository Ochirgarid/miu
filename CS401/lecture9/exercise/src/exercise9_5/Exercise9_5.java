package exercise9_5;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise9_5 {
    public static void main(String[] args) {
        List <ExamData> data = new ArrayList<ExamData>() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            {
                add(new ExamData("George", 91.3));
                add(new ExamData("Tom", 88.9));
                add(new ExamData("Rick", 80));
                add(new ExamData("Harold", 90.8));
                add(new ExamData("Ignatius", 60.9));
                add(new ExamData("Anna", 77));
                add(new ExamData("Susam", 87.3));
                add(new ExamData("Phil", 99.1));
                add(new ExamData("Alex", 84));
            }
        };
        DoubleSummaryStatistics examStats = data.stream().collect(Collectors.summarizingDouble(e -> e.getScore()));
        System.out.println(examStats.getAverage());
        System.out.println(examStats.getCount());
        System.out.println(examStats.getMin());
        System.out.println(examStats.getMax());
        System.out.println(examStats.getSum());
    }
}
