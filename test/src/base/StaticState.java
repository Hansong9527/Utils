package base;

//静态内部类调用示例
public class StaticState {

	private static int num = 24;
	static class state{
		void syso() {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args){
		StaticState.state state = new StaticState.state();
		state.syso();
	}
}
