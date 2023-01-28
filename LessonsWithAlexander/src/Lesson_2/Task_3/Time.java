package Lesson_2.Task_3;

import java.time.LocalTime;

public class Time {
    //Сложение двух объектов времени. Например, 21:03 + 04:30 = 01:33

    //Ход мыслей: передаю в метод два объекта времени. Отдельно суммирую часы и минуты. Если сумма минут получается больше, чем 59,
    //то делю на 60 и полученное целое число добавляю к часам, а из остатка делаю минуты
    public LocalTime addTimeObj(LocalTime localTime1, LocalTime localTime2) {
        LocalTime localTimeNew = null;
        int sumHourTime = localTime1.getHour() + localTime2.getHour(); //получаю кол-во часов из объекта №1 и из объекта №2

        int sumMinutesTime = localTime1.getMinute() + localTime2.getMinute(); //получаю кол-во минут из объекта №1 и объекта №2

        if (sumMinutesTime > 59) {
            int sumMinutesTimeOst = 0; //переменная, в к-ой буду хранить минуты после вычета часов
            int sumMinutesTimeInteger = sumMinutesTime / 60;
            sumHourTime += sumMinutesTimeInteger;
            sumMinutesTimeOst = sumMinutesTime % 60;
            localTimeNew = LocalTime.of(sumHourTime, sumMinutesTimeOst);
        } else {
            localTimeNew = LocalTime.of(sumHourTime, sumMinutesTime);
        }
        return localTimeNew;
    }

    //Сложение времени и произвольного количества минут 10:00 + 120 = 12:00
    public LocalTime addMinutes(LocalTime localTime, int minutes) {
        LocalTime localTime1 = null; //объект в котором буду хранить время после прибавления минут

        int hourSum = localTime.getHour(); //получила кол-во часов из текущего времени
        int minutesSum = localTime.getMinute() + minutes; //получила кол-во минут из текущего времени

        if (minutesSum > 59) {
            int minutesSumOst = 0;
            int minutesSumInt = minutesSum / 60; //узнаю сколько часов в минутах
            hourSum += minutesSumInt;
            minutesSumOst = minutesSum % 60; //узнаю сколько минут осталось, если убрать полные часы из минут
            localTime1 = LocalTime.of(hourSum, minutesSumOst);
        } else {
            localTime1 = LocalTime.of(hourSum, minutesSum);
        }
        return localTime1;
    }
}

