package spr;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        SaveToJson saveToJson = new SaveToJson(order);
        saveToJson.save();
    }  
}