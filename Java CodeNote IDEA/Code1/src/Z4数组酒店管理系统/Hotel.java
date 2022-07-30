package Z4数组酒店管理系统;
/**
 *酒店对象,酒店中有二维数组,二维数组模拟大厦
 */
public class Hotel {
    /**
     *二维数组模拟大厦的房间
     */
    private Room[][] rooms;
    //通过无参构造方法盖楼
    public  Hotel(){
        /**
         * 房间类型:,单人间,标准间,总统套房
         * 房间编号:
         * 1楼:101,102;
         * 2楼:201,202;
         */
        rooms = new Room[3][10];
        //i是下标,i+1是楼层 j是下标,j+1是房间号 通过for循环遍历生成30个房间对象
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if(i == 0){
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);
                }
                if(i == 1){
                    rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
                }
                if(i == 2){
                    rooms[i][j] = new Room((i+1)*100+j+1,"总统套房",true);
                }
            }
        }
    }
    //输出所有房间状态
    public void print(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room = rooms[i][j];
                System.out.print(room);
            }
            System.out.println();
        }
    }
    /**
     *订房方法:
     * 调用此方法需要传递一个房间编号
     */
    public void order(int roomNo){
        Room room = rooms[roomNo / 100 - 1][roomNo%100 - 1];
        room.setStatus(false);
        System.out.println("已订房");
    }
    /**
     *退房方法:
     * 调用此方法需要传递一个房间编号
     */
    public void exit(int roomNo){
        Room room = rooms[roomNo / 100 - 1][roomNo%100 - 1];
        room.setStatus(true);
        System.out.println("已退房");
    }


}
