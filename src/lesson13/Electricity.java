package lesson13;

public class Electricity {
    public static void main(String[] args) {
        //Стоимость электроэнергии рассчитывается исходя из стоимости одного киловатт-часа в 20 центов.
        //Базовая плата - 30€. В базовую плату входят 100 киловатт-часов. Напишите метод расчёта стоимости пользования
        //электроэнергией.
        costOfUseElectricity(300);//70
        costOfUseElectricity(90);//30 euro
    }

    private static void costOfUseElectricity (int kvt){
            //Дано 1 кВт/ч =0,2
            //1 мес=30
            //100 кВт??
            double monthCost = 30;
            if (kvt > 100) {
                monthCost += (kvt - 100) * 0.2;
            }
            System.out.println(monthCost);
            }
}
