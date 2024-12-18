public class BonusMilesService {
    public int calculate(int price) {//задаем имя функции в которую передаются значения переменной price из main
        int countMile = 20;
        int calculate = price / countMile;
        return calculate; /* возвращаем в main  значение докальной пременной calculate*/
    }
}
