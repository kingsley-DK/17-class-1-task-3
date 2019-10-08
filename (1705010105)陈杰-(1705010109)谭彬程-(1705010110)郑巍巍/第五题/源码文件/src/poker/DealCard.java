package poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DealCard {
	
	public List<Card> getCard(){
		String[] suit= {"����","����","÷��","����"};
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
        int num=list.size();//52����
        Random random=new Random();
        int index=random.nextInt(num);//ֻ�������ȡ0-51���֣�����������Ϊ�����±�
        return index;
    }
    public void Deal(List<Card> list,Player player){
        int index=getOneCard(list);
        player.getList().add(list.get(index));//����
        list.remove(index);//���ҰѸ��ƴ�52��������ɾ��
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
    	int level;//���͵ȼ�
    	int temp;
    	int CardRank[] = new int[3];
    	CardRank[0]=player.getList().get(0).getRank();
    	CardRank[1]=player.getList().get(1).getRank();
    	CardRank[2]=player.getList().get(2).getRank();
    	//���ƽ�����������
    	for(int i=0;i<CardRank.length;i++){
    		for(int j=0;j<CardRank.length-i-1;++j){
    		if(CardRank[j]>CardRank[j+1]){
    			temp=CardRank[j];
    			CardRank[j]=CardRank[j+1];
    			CardRank[j+1]=temp;
    			}
    		}
    	}
    	//ͬ��
    	if(player.getList().get(0).getSuit().equals(player.getList().get(2).getSuit())&&player.getList().get(1).getSuit().equals(player.getList().get(2).getSuit())) {
    		level = 1;}
    	//˳��
    	else if (CardRank[1]-1==CardRank[0]&&CardRank[2]-1==CardRank[1]) {
    		level = 2;}
    	//ͬ��
    	else if (player.getList().get(0).getRank()==player.getList().get(2).getRank()&&player.getList().get(1).getRank()==player.getList().get(2).getRank()) {
    		level = 3;}
    	//����
    	else if (CardRank[0]==CardRank[1]&&CardRank[0]!=CardRank[2]) {
    		level = 4;}
    	else if (CardRank[0]==CardRank[2]&&CardRank[0]!=CardRank[1]) {
    		level = 4;}
    	else if (CardRank[1]==CardRank[2]&&CardRank[0]!=CardRank[2]) {
    		level = 4;}
    	//����
    	else 
    		level = 5;
    	player.setLevels(level);
    }
    //�ж�ʤ��
    public String winner(Player player1,Player player2) {
    	String WhoWin="";
    	if (player1.getLevels()<player2.getLevels())
    		WhoWin = "���1Ӯ";
    	else if (player1.getLevels()>player2.getLevels())
        	WhoWin = "���2Ӯ";
    	else if (player1.getLevels()==player2.getLevels()) {
        	if(player1.getSum()>player2.getSum())
        		WhoWin = "���1Ӯ";
        	else if(player1.getSum()<player2.getSum())
        		WhoWin = "���2Ӯ";
        	else if(player1.getSum()==player2.getSum())
        		WhoWin = "ƽ��";
        }
        return WhoWin;
    }
}