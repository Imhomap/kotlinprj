object WorkShop01 {

    fun numericValues() {
        //TODO 1.1. Необходимо создать целочисленную переменную, которая может вместить 10^9
        var num: Int

        //TODO 1.2. Необходимо создать целочисленную переменную, которая может вместить 10^10
        var num1: Long
    }

    fun printRealOnePrecisionValue() {
        //TODO 2.1. Необходимо создать вещественную переменную с одинарной точности и инициализировать её значением 0.0F
        var num3: Float = 0.0F

        //TODO 2.2. Добавить к созданной переменной число 0.1111111111111111F 2 раза

        num3 = num3 + 0.1111111111111111F.times(2)

        //TODO 2.3. Раскомментировать блок кода ниже, который с распечатывает число. В блоке кода указать имя переменной
        println("Результат сложения для числа с одинарной точностью равен - " + num3)

        //TODO 2.4. Запустить функцию main (в ней стоит метка TODO 2.4)
        //TODO 2.5. Сравнить результат с ожидаемым 0.2222222222222222F
        var num4 = 0.2222222222222222F
        val resultEqual = num3 == num4
        println(resultEqual)
    }

    fun printRealTwoPrecisionValue() {
        //TODO 3.1. Необходимо создать вещественную переменную с двойной точности и инициализировать её значением 0.0
        var num4: Double = 0.0

        //TODO 3.2. Добавить к созданной переменной число 0.1111111111111111 2 раза
        val num5 = 0.1111111111111111
        num4 = num4 + num5.times(2)


        //TODO 3.3. Раскомментировать блок кода ниже, который с распечатывает число. В блоке кода указать имя переменной
        println("Результат сложения для числа с двойной точностью равен - " + num4)

        //TODO 3.4. Запустить функцию main (в ней стоит метка TODO 3.4)
        //TODO 3.5. Сравнить результат с ожидаемым 0.2222222222222222
        var num6 = 0.2222222222222222
        val resultEqual = num6 == num4
        println(resultEqual)


   }

    //TODO 4. Написать функцию (compareTwoStrings), которая принимает на вход две строки и возвращает результат сравнения




    fun compareTwoStrings(str1: String, str2: String): Boolean = str1 != str2

    //TODO 5. Написать функцию, которая
    // 1. Принимает на вход число типа Int
    // 2. Если число четное, то функция возвращает строку "Чётное"
    // 3. Иначе, функция возвращает строку "Нечётное"
    // PS1. Чтобы определить четность числа необходимо узнать остаток от деления этого числа на 2.
    // PS2. Оператор, который определяет остаток от деления - %
    // /
    // Для проверки задания необходимо запустить тесты в классе WorkShop01P5Test
    fun evenOddNumber(number: Int) {
       if (number % 2 == 0) {
           "Чётное"
       }else{
           "Нечётное"
       }
       }


    //TODO 6. Необходимо реализовать лямбда-функцию и задать ей имя lambda, которая
    // 1. Принимает два значения типа Int и возвращает значение типа Int
    // 2. Результат выполнения лямбда-функции - сравнить два значения и вернуть максимальное из 2-х
    // Для проверки задания необходимо запустить тесты в классе WorkShop01P6Test
    //val lambda: TODO()

    // TODO 7. Необходимо реализовать функцию высшего порядка c именем compareTwoInts, которая
    //  1. Принимает на вход два числа и лямбда-функцию
    //  2. Возвращает результат исполнения лямбда-функции, в которую должны быть переданы два числа,
    //  которые функция высшего порядка получила на вход
    //  Для проверки задания необходимо запустить тесты в классе WorkShop01P7Test

    // TODO 8. Необходимо реализовать функцию, которая возвращает информацию о том, в каком интервале находится переданное число
    //  Дано 4 интервала (квадратная скоба обозначает включение значения в интервал, круглая - исключение значения из интервала):
    //    Интервал 1: (-100; 0]
    //    Интервал 2: (0; 3]
    //    Интервал 3: (3; 100]
    //    Интервал 4: (100; 102]
    //  /
    //  Функция на вход принимает целочисленное число типа Int
    //  В теле функции производится проверка принадлежности входящего числа в один из интревалов
    //  Вывод:
    //  1) Если число входит в один из интервалов, то текст вывода следующий: "Число 100 принадлежит интервалу (3; 100]"
    //  2) Иначе если число не входит ни в один из интервалов, то текст вывода следующий: "Число 100 не принадлежит ни одному из интервалов"
    //  /
    //  PS 1. Для форматирования строк можно использовать шаблоны https://kotlinlang.org/docs/basic-syntax.html#string-templates
    //  PS 2. Для формирования диапазона можно использовать https://kotlinlang.org/docs/basic-syntax.html#ranges
    //  /
    //  Для проверки задания необходимо запустить тесты в классе WorkShop01P8Test
    fun checkNumInRange(num: Int): String {
        TODO()
    }
}

fun main(args: Array<String>) {
    //TODO 2.4 - Расскомметировать функцию ниже, чтобы увидеть результат
    WorkShop01.printRealOnePrecisionValue()

    //TODO 3.4 - Расскомметировать функцию ниже, чтобы увидеть результат
    WorkShop01.printRealTwoPrecisionValue()
}

