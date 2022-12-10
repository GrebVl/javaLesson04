/**
 * В калькулятор добавьте возможность отменить последнюю операцию.
 */

import java.util.LinkedList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class task03 {

    public static double operatNum(double aNum, double bNum, int numOp) {
        double resNum = 0;
        if (numOp == 1) {
            resNum = aNum + bNum;
            System.out.printf("\nрезультат равер %f + %f = %f \n\n", aNum, bNum, resNum);
        } else if (numOp == 2) {
            resNum = aNum - bNum;
            System.out.printf("\nрезультат равер %f - %f = %f \n\n", aNum, bNum, resNum);;
        } else if (numOp == 3) {
            resNum = aNum * bNum;
            System.out.printf("\nрезультат равер %f * %f = %f \n\n", aNum, bNum, resNum);
        } else if (numOp == 4) {
            resNum = aNum / bNum;
            System.out.printf("\nрезультат равер %f / %f = %f \n\n", aNum, bNum, resNum);
        }
        return resNum;        
    }

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{
        FileWriter fileTask = new FileWriter("logTask03.txt", true);
        StringBuilder strBui = new StringBuilder();
        strBui.append(LocalDateTime.now());
        strBui.append("\n");
        boolean ex = true;
        LinkedList<Double> arr = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while(ex){
            System.out.print("\nВведите операцию:\nСложение 1:\nВычитание 2:\nУмнажение 3:\nДеление 4:\nПроизведение n! 5: \nВыход ex: 6\n");
            if(count > 0){
                System.out.print("Отмена последней операции 7:\nОчистить операции 8:\n");
            }
            int num = scan.nextInt();
            strBui.append("Операция: " + num + " ");
            double res = 0;
            if (num == 5) {
                System.out.print("Введите число n: ");
                int n = scan.nextInt();
                strBui.append("  было введено число: " + n);
                if (n != 0) {
                    res++;
                }
                for (int i = 1; i <= n; i++) {
                    res *= i;
                }
                System.out.printf("результат равер %f \n", res);
            } else if(num == 6){
                ex = false;
            } else if (num == 7){
                arr.remove(arr.peekLast());
            }else if(num == 8){
                arr.clear();
            }else if(num > 0 && num < 5){
                System.out.print("Введите число a: ");
                double a = scan.nextDouble();
                System.out.print("Введите число b: ");
                double b = scan.nextDouble();
                strBui.append("  были введены числа a и b: " + a + " " + b);
                res = operatNum(a, b, num);
                arr.addLast(res);
                count++;
                strBui.append("  результат равен: " + res + "\n");
            }
            System.out.println(arr.toString());
            fileTask.write(strBui.toString());
        }
        scan.close();
        fileTask.flush();
        fileTask.close();
    }        
}


