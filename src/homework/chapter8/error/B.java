package homework.chapter8.error;

public class B extends A{

    int total;

    void sum(){
//        total = i + j; //ОШИБКА: член j в этом
                        // классе недоступен
    }
}
