package poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DealCard {
	
	public List<Card> getCard(){
		String[] suit= {"黑桃","红桃","梅花","方块"};
		String[] rank={"2","3","4","5","6","7","8","9","10","A","J","Q","K"};
		List<Card> list=new ArrayList<Card>();
		for(int i=0;i<suit.length;i++){
			for(int j=0;j<rank.length;j++){
				Card card=new Card(suit[i],rank[j]);
				list.add(card);
			}
    }
    return list;
	}
    public int getOneCard(List<Card> list){
        int num=list.size();//52张牌
        Random random=new Random();
        int index=random.nextInt(num);//只会随机获取0-51数字，这里数字作为集合下标
        return index;
    }
    public void Deal(List<Card> list,Player player){
        int index=getOneCard(list);
        player.getList().add(list.get(index));//发牌
        list.remove(index);//并且把该牌从52张牌组中删除
        index=getOneCard(list);
        player.getList().add(list.get(index));
        list.remove(index);
        player.getList().add(list.get(index));
        list.remove(index);
    }
    public void CountCard(Player player) {
    	int num;
    	num = player.getList().get(0).getRank()+player.getList().get(1).getRank()+player.getList().get(2).getRank();
    	player.setSum(num);
    }
    public String ShowCard(Player player){
        String str="";
        for(Card card:player.getList()){
            str+=card.getSuit()+card.getRank()+" ";
        }
        return str;
    }
    public void getlevel(Player player) {
    	int level;//牌型等级
    	int temp;
    	int CardRank[] = new int[3];
    	CardRank[0]=player.getList().get(0).getRank();
    	CardRank[1]=player.getList().get(1).getRank();
    	CardRank[2]=player.getList().get(2).getRank();
    	//对牌进行升序排列
    	for(int i=0;i<CardRank.length;i++){
    		for(int j=0;j<CardRank.length-i-1;++j){
    		if(CardRank[j]>CardRank[j+1]){
    			temp=CardRank[j];
    			CardRank[j]=CardRank[j+1];
    			CardRank[j+1]=temp;
    			}
    		}
    	}
    	//同花
    	if(player.getList().get(0).getSuit().equals(player.getList().get(2).getSuit())&&player.getList().get(1).getSuit().equals(player.getList().get(2).getSuit())) {
    		level = 1;}
    	//顺子
    	else if (CardRank[1]-1==CardRank[0]&&CardRank[2]-1==CardRank[1]) {
    		level = 2;}
    	//同点
    	else if (player.getList().get(0).getRank()==player.getList().get(2).getRank()&&player.getList().get(1).getRank()==player.getList().get(2).getRank()) {
    		level = 3;}
    	//对子
    	else if (CardRank[0]==CardRank[1]&&CardRank[0]!=CardRank[2]) {
    		level = 4;}
    	else if (CardRank[0]==CardRank[2]&&CardRank[0]!=CardRank[1]) {
    		level = 4;}
    	else if (CardRank[1]==CardRank[2]&&CardRank[0]!=CardRank[2]) {
    		level = 4;}
    	//杂牌
    	else 
    		level = 5;
    	player.setLevels(level);
    }
    //判断胜负
    public String winner(Player player1,Player player2) {
    	String WhoWin="";
    	if (player1.getLevels()<player2.getLevels())
    		WhoWin = "玩家1赢";
    	else if (player1.getLevels()>player2.getLevels())
        	WhoWin = "玩家2赢";
    	else if (player1.getLevels()==player2.getLevels()) {
        	if(player1.getSum()>player2.getSum())
        		WhoWin = "玩家1赢";
        	else if(player1.getSum()<player2.getSum())
        		WhoWin = "玩家2赢";
        	else if(player1.getSum()==player2.getSum())
        		WhoWin = "平局";
        }
        return WhoWin;
    }
}