package ru.netology.sqr;

public class SQRService {
    public int calc(int lowLimit, int highLimit) {
        int result = 0;

        for (int i = 10; i <= 99; i++) {
            int ii = i * i;
            if (ii >= lowLimit) {
                if (ii <= highLimit) {
                    result++;
                }
            }
        }

        return result;
    }
}
