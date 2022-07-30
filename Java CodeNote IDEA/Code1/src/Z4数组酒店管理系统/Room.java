package Z4数组酒店管理系统;
/**
 *酒店的房间
 */

public class Room {
    /**
     *房间编号:
     * 1楼:101,102;
     * 2楼:201,202;
     */
    private int no;
    /**
     *房间类型:标准间,单人间,总统套房
     */
    private String type;
    /**
     *房间状态:
     * true 表示空闲,房间可以预订
     * false表示占用,房间不能预订
     */
    private boolean status;

    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //将java对象转换为字符串
    public String toString() {
        return "["+no+","+type+","+(status ? "空闲": "占用")+"]";
    }

    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof  Room)) return  false;
        if(this == obj) return true;
        Room room = (Room)obj;//obj向下转型为room
        return this.getNo() == room.getNo();
    }



}
