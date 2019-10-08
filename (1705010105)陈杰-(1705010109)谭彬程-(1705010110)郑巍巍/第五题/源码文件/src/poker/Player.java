package poker;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> list=new ArrayList<>();//存放扑克
	private int sum=0;//牌型点数
	private int levels;//牌型等级
	public List<Card> getList(){
		return list;
	}
	public void setList(List<Card> list) {
		this.list=list;
	}
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    public int getLevels() {
        return levels;
    }
    public void setLevels(int levels) {
        this.levels = levels;
    }
}
