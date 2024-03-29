/** 
 * 旅行售货员问题--回溯法 
 * @author Lican 
 * 
 */  
package First;
public class BBTSP {  
    public int n;//图G的顶点数  
    public int[] x;//当前解  
    public int[] bestx;//当前最优解  
    public float bestc;//当前最优值  
    public float cc;//当前费用  
    public float[][] a;//图G的邻接矩阵  
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
    public void swap(int[] x,int i,int j){//交换函数  
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
        float[][] a={{0,0,0,0,0},{0,-1,30,6,4},{0,30,-1,5,10},{0,6,5,-1,20},{0,4,10,20,-1}};//a下标从1开始，0用来凑数；-1表示不同，1表示连通  
        BBTSP b=new BBTSP(a,n);  
        b.backtrack(2);  
        System.out.println("最短回路长为："+b.bestc);  
        System.out.print("最短回路为：");  
        for(int i=1;i<=n;i++){  
            System.out.print(b.bestx[i]+" ");  
        }  
    }  
}  
/* 
输出： 
最短回路长为：25.0 
最短回路为：1 3 2 4  
 
 */ 