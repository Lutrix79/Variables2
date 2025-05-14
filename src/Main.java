//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        int integerVar = -65535;
        byte byteVar = -128;
        short shortVar = 32767;
        long longVar = 5000000000L;
        float floatVar = 5.555555f;
        double doubleVar = 9.99999999999999;
        System.out.println("Значение переменной integerVar с типом int равно " + integerVar);
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar);
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar);
        System.out.println("Значение переменной longVar с типом long равно " + longVar);
        System.out.println("Значение переменной floatVar с типом float равно " + floatVar);
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar);
        System.out.println();

        //Задача №2
        System.out.println("Задача №2");
        floatVar = 27.12f;
        longVar = 987678965549L;
        doubleVar = 2.786;
        integerVar = 569;
        shortVar = -159;
        short shortVarToo = 27897;
        byteVar = 67;
        System.out.println("Переменные по порядку равны: " + floatVar + "; " + longVar + "; " + doubleVar + "; " + integerVar + "; " + shortVar + "; " + shortVarToo + "; " + byteVar + ". ");
        System.out.println();

        //Задача №3
        System.out.println("Задача №3");
        byte pupilsOfLyudmilaPavlovna = 23;
        byte pupilsOfAnnaSergeevna = 27;
        byte pupilsOfEkaterinaAndreevna = 30;
        int totalPupils = pupilsOfLyudmilaPavlovna + pupilsOfAnnaSergeevna + pupilsOfEkaterinaAndreevna;
        //Здесь должен быть целый результат, но на всякий случай использую float
        float listsForEachPupil = 480.0f / totalPupils;
        System.out.println("На каждого ученика рассчитано " + listsForEachPupil + " листов бумаги");
        System.out.println();

        //Задача №4
        System.out.println("Задача №4");
        //Сначала посчитаем производительность машины изготовления бутылок в минуту
        int efficiencyPerMinute = 16 / 2;
        //Рассчитаем количество минут для каждого условия задачи, для простоты везде используем int
        int minutesInDay = 24 * 60;
        int minutesInThreeDays = minutesInDay * 3;
        int minutesInMonth = minutesInDay*30;
        //Теперь считаем конкретные случаи
        int efficiencyPer20Minutes = efficiencyPerMinute * 20;
        int efficiencyPerDay = efficiencyPerMinute * minutesInDay;
        int efficiencyPerThreeDays = efficiencyPerMinute * minutesInThreeDays;
        int efficiencyPerMonth = efficiencyPerMinute * minutesInMonth;
        System.out.println("За 20 минут машина произвела " + efficiencyPer20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + efficiencyPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + efficiencyPerThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + efficiencyPerMonth + " штук бутылок");
        System.out.println();

        //Задача №5
        System.out.println("Задача №5");
        /* Сначала определим сколько в школе классов для чего общее количество банок разделим на количество
        банок для ремонта одного класса*/
        int quantityClassrooms = 120 / (4+2);
        //Теперь найдем общее количество банок белой и коричневой красок
        int whitePaint = 2 * quantityClassrooms;
        int brownPaint = 4 * quantityClassrooms;
        System.out.println("В школе, где " + quantityClassrooms + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
        System.out.println();

        //Задача №6
        System.out.println("Задача №6");
        //Посчитаем вес в граммах каждого продукта в граммах
        int weightOfBananas = 5 * 80;
        int weightOfMilk = (200 / 100) * 105;
        int weightOfIceCream = 2 * 100;
        int weightOfEggs = 4 * 70;
        float totalWeightInGrams = weightOfBananas + weightOfMilk + weightOfIceCream + weightOfEggs;
        float totalWeightInKilograms = totalWeightInGrams/1000;
        System.out.println("Общий вес завтрака спортсмена составляет " + totalWeightInGrams + "г или " + totalWeightInKilograms + "кг");
        System.out.println();

        //Задача №7
        System.out.println("Задача №7");
        int necessaryWeightInGrams = 7 * 1000;
        int daysOfWeightLoss250 = necessaryWeightInGrams / 250;
        int daysOfWeightLoss500 = necessaryWeightInGrams / 500;
        int daysArithmeticMean = (daysOfWeightLoss250 + daysOfWeightLoss500) / 2;
        System.out.println("Спортсмену понадобится " + daysOfWeightLoss250 + " дней, если он будет худеть каждый день по 250г");
        System.out.println("Спортсмену понадобится " + daysOfWeightLoss500 + " дней, если он будет худеть каждый день по 500г");
        System.out.println("Спортсмену понадобится в среднем " + daysArithmeticMean + " дней, если он будет худеть каждый день от 250г до 500г");
        System.out.println();

        //Задача №8
        System.out.println("Задача №8");
        int monthlySalaryMaria = 67760;
        int monthlySalaryDenis = 83690;
        int monthlySalaryKristin = 76230;
        int monthlySalaryAfterIncreaseMaria = monthlySalaryMaria + monthlySalaryMaria / 10;
        int monthlySalaryAfterIncreaseDenis = monthlySalaryDenis + monthlySalaryDenis / 10;
        //Для разнообразия Кристине посчитал во float, хотя разницы нет, зарплата прекрасно у всех делится на 10
        float monthlySalaryAfterIncreaseKristin = monthlySalaryKristin + monthlySalaryKristin * 0.1f;
        int yearlyIncreaseMaria = (monthlySalaryAfterIncreaseMaria - monthlySalaryMaria) * 12;
        int yearlyIncreaseDenis = (monthlySalaryAfterIncreaseDenis - monthlySalaryDenis) * 12;
        float yearlyIncreaseKristin = (monthlySalaryAfterIncreaseKristin - monthlySalaryKristin) * 12; //Для разнообразия Кристине посчитал во float
        System.out.println("Маша теперь получает " + monthlySalaryAfterIncreaseMaria + " рублей. Годовой доход вырос на " + yearlyIncreaseMaria + " рублей");
        System.out.println("Денис теперь получает " + monthlySalaryAfterIncreaseDenis + " рублей. Годовой доход вырос на " + yearlyIncreaseDenis + " рублей");
        System.out.println("Кристина теперь получает " + monthlySalaryAfterIncreaseKristin + " рублей. Годовой доход вырос на " + yearlyIncreaseKristin + " рублей");
    }
}