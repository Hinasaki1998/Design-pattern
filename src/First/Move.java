package First;

public class Move {
	public static void main(String[] args){			
		final int man_move=4,woman_move=3,children_move=1;
		for(int man=0;man<=36;man++)
			for(int woman=0;woman<=36;woman++)
				for (int children=0;children<=36;children+=2){
				if((man*man_move+woman*woman_move+children/2*children_move==36)&&(man+woman+children ==36)){
					System.out.println("���˵�������" + man);
					System.out.println("Ů�˵�������" + woman);
					System.out.println("���ӵ�������" + children);
				}
			}
	}
}
