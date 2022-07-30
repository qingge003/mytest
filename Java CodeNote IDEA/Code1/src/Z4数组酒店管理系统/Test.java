package Z4数组酒店管理系统;
/**
 *第二题∶（java软件工程师人生路上第一个小型项目。锻炼一下面向对象。）
 * 为某个酒店编写程序∶酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
 * 1、该系统的用户是∶酒店前台。
 * 2、酒店使用一个二维数组来模拟。"Room[][]rooms;"
 * 3、酒店中的每一个房间应该是一个java对象∶ Room
 * 4、每一个房间Room应该有∶房间编号、房间类型、房间是否空闲.
 * 5、系统应该对外提供的功能;
 * 可以预定房间∶用户输入房间编号，订房。可以退房∶用户输入房间编号，退房。
 * 可以查看所有房间的状态∶ 用户输入某个指令应该可以查看所有房间状态。
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println("欢迎使用:");
        System.out.println("对应功能编号说明:[1]查看房间列表;[2]订房;[3]退房;[0]退出系统");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入功能编号:");
            int i = scanner.nextInt();

            if (i == 1) {
                hotel.print();
            } else if (i == 2) {
                System.out.println("请输入订房编号:");
                int roomNo = scanner.nextInt();
                hotel.order(roomNo);
            } else if (i == 3) {
                System.out.println("请输入退房编号:");
                int roomNo = scanner.nextInt();
                hotel.exit(roomNo);
            } else if (i == 0) {
                System.out.println("再见,欢迎下次再来");
                return;



            } else {
                System.out.println("出错了");
            }
        }
    }
}
