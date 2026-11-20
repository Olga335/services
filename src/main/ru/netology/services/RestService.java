package ru.netology.services;

public class RestService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // Отдых: траты, затем остаток уменьшается в 3 раза
                count++;
                money = (money - expenses) / 3;
            } else {
                // Работа: доход минус обязательные траты
                money = money + income - expenses;
            }
        }
        return count;
    }
}