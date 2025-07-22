// 세준이는 점수를 조작해 자기 점수의 최대값을 골라, 그 최대값을 m이라 한다면,
// 모든 점수를 점수/m*100으로 고쳤다. 예를 들어 최고점이 70이고 수학이 50이라면,
// 수학 점수를 50/70*100으로 고친 71.43이다. 이렇게 바꾸었을 때의 평균을 구하는 프로그램

// 첫 번째 줄에 점수의 개수를 입력
// 두 번째 줄에 점수의 평균을 출력


import java.util.*;

public class _002_평균구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            list.add(scanner.nextInt());
        }

        int max = Collections.max(list);

        List<Double> changeList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            double changedScore = (double) list.get(i) / max * 100;
            changeList.add(changedScore);
        }

        // 평균 계산
        double sum = 0;
        for (double score : changeList) {
            sum += score;
        }
        double average = sum / num;

        System.out.printf("%.2f\n", average);

        // 추가적으로 각 값을 출력
        for (double score : changeList) {
            System.out.println(score);
        }
    }
}
