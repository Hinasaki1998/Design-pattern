/** 
 * �����ۻ�Ա����--���ݷ� 
 * @author Lican 
 * 
 */  
package First;
public class BBTSP {  
    public int n;//ͼG�Ķ�����  
    public int[] x;//��ǰ��  
    public int[] bestx;//��ǰ���Ž�  
    public float bestc;//��ǰ����ֵ  
    public float cc;//��ǰ����  
    public float[][] a;//ͼG���ڽӾ���  
    public BBTSP(float[][] aa,int nn){  
        n=nn;  
        x=new int[n+1];  
        for(int i=1;i<=n;i++){  
            x[i]=i;  
        }  
        bestc=10000;  
        bestx=new int[n+1];  
        cc=0;  
        a=aa;  
          
    }  
    public void swap(int[] x,int i,int j){//��������  
        int temp=x[i];  
        x[i]=x[j];  
        x[j]=temp;  
    }  
    public void backtrack(int i){  
        if(i==n){  
            if(a[x[n-1]][x[n]]!=-1&&a[x[n]][1]!=-1&&(bestc==10000)||cc+a[x[n-1]][x[n]]+a[x[n]][1]<bestc){  
                for(int j=1;j<=n;j++){  
                    bestx[j]=x[j];  
                      
                }  
                bestc=cc+a[x[n-1]][x[n]]+a[x[n]][1];  
            }  
        }else{  
            for(int j=i;j<=n;j++){  
                if(a[x[i-1]][x[j]]!=-1&&(bestc==10000||cc+a[x[i-1]][x[j]]<bestc)){  
                    swap(x,i,j);  
                    cc+=a[x[i-1]][x[i]];  
                    backtrack(i+1);  
                    cc-=a[x[i-1]][x[i]];  
                    swap(x,i,j);  
                }  
            }  
        }  
    }  
    public static void main(String[] args) {  
        int n=4;  
        float[][] a={{0,0,0,0,0},{0,-1,30,6,4},{0,30,-1,5,10},{0,6,5,-1,20},{0,4,10,20,-1}};//a�±��1��ʼ��0����������-1��ʾ��ͬ��1��ʾ��ͨ  
        BBTSP b=new BBTSP(a,n);  
        b.backtrack(2);  
        System.out.println("��̻�·��Ϊ��"+b.bestc);  
        System.out.print("��̻�·Ϊ��");  
        for(int i=1;i<=n;i++){  
            System.out.print(b.bestx[i]+" ");  
        }  
    }  
}  
/* 
����� 
��̻�·��Ϊ��25.0 
��̻�·Ϊ��1 3 2 4  
 
 */ 