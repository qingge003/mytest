package Class;
//方法重载：方法名一样，但参数类型，参数顺序，个数不一样
public class tv {
	boolean zhuantai;
	private int voice;
	
    public void set(int a) {
    	zhuantai = true;
    	System.out.println("电视已打开");
	}
	public void set(char b) {
		zhuantai = false;
		System.out.println("电视已关闭");
    }
	/**构造方法:带参数，和类名一致*/
	public tv(int voice) {
		this.voice = voice;
	}

	public tv() {
	}

	public int getVoice(){
		return  voice;
	}
}
