package Third;
public class Student {
	String sNO,sName,sSex;
	int sAge,sJava;
	public Student(String XH,String XM,String XB,int NL,int XF) {
	   super();
	   sNO=XH;
	   sName=XM;
	   sSex=XB;
	   sAge=NL;
	   sJava=XF;	   
	}

	public static void main(String[] args) {
		Student[] st=new Student[5];
		st[0]=new Student("09zc01","张三","男",19,94);
		st[1]=new Student("09zc02","李四","男",20,85);
		st[2]=new Student("09zc03","王五","女",18,96);
		st[3]=new Student("09zc04","赵六","男",17,90);
		st[4]=new Student("09zc05","杨七","女",21,88);
	    int max=0,min=100,sum=0;
	    System.out.println("    学生信息：");
	    for (int i=0;i<st.length;i++) {
	    	if (st[i].sJava < min)
	    		min=st[i].sJava;
	    	if (st[i].sJava > max)
	    		max=st[i].sJava;
	    	sum=sum+st[i].sJava;
	    	System.out.println("学生编号："+st[i].sNO+"，  姓名："+st[i].sName+"，  性别："+st[i].sSex+"，  年龄："+st[i].sAge+"，  Java课学分："+st[i].sJava);
	    }
	    System.out.println();
	    System.out.println("    共有学生："+st.length+"，  平均成绩："+sum/st.length);
	    System.out.println("    最小学分："+min+"，  最大学分："+max);
	}
}
