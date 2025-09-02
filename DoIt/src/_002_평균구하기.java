// 세준이는 점수를 조작해 자기 점수의 최대값을 골라, 그 최대값을 m이라 한다면,
// 모든 점수를 점수/m*100으로 고쳤다. 예를 들어 최고점이 70이고 수학이 50이라면,
// 수학 점수를 50/70*100으로 고친 71.43이다. 이렇게 바꾸었을 때의 평균을 구하는 프로그램

// 첫 번째 줄에 점수의 개수를 입력
// 두 번째 줄에 점수의 평균을 출력


import java.util.*;

public class _002_평균구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double num = scanner.nextDouble();
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            list.add(scanner.nextDouble());
        }

        Double max = Collections.max(list);

        List<Double> changeList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            double changedScore = list.get(i) / max * 100;
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

        // 책의 문제 풀이

        /*Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i; i< length ; i++){
            array[i] = sc.nextInt();
        }
        int max = 0;
        int sum = 0;
        for(int i; i< length ; i++){
            if(max < array[i]) {
                max = array[i];
            }
            sum = sum + array[i];
        }
        System.out.printf(sum * 100.0 / max / N); // 한번에 처리해 로직을 간단히
        */
    }
}
