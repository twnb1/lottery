//ㄚㄅ
package lottery;
import java.util.Arrays;
import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        // TODO code application logic here1111
        while(true){
            Scanner sc=new Scanner(System.in);
            System.out.println("選0手動輸入 選1自動輸入");
            int c=Integer.parseInt(sc.nextLine()); 
            if(c == 0){
            //////////////////////////////////////////手動輸入
                int[] arti=new int[6];
                int i;
                for (i = 0; i < arti.length; i++) { 
                    System.out.println("請輸入你的彩券第" + (i+1) + "個號碼(1~49):"); 
                    arti[i] = Integer.parseInt(sc.nextLine()); 
                        if(arti[i]>49 || arti[i]<1){
                            System.out.println("超出範圍");
                            i--;
                        }
                        for(int l=0;l<i;l++){
                            if(arti[i] == arti[l]){
                                System.out.println("重複");
                                i--;
                            }
                        }
                }
                Arrays.sort(arti);
                System.out.print("你選的號碼(由小至大排列)是:");
                for(int w: arti){
                    if(w<10){
                        System.out.print(" 0"+w);
                    }else{
                        System.out.print(" "+w);
                    }
                }
                System.out.print("\n彩券號碼(由小至大排列)是:");
                int[] array=new int[6];
                int x=(int)(Math.random()*49)+1,y;
                int j=0;
                for(y=0;y<=5;y++){
                    while(j<y){
                        if(array[j]==x){
                            x=(int)(Math.random()*49)+1;
                            j=0;
                        }else{
                            j++;
                        }
                    }
                    array[y]=x;
                }
                Arrays.sort(array);
                for(int h: array){
                    if(h<10){
                        System.out.print(" 0"+h);
                    }else{
                        System.out.print(" "+h);
                    }
                }
                int cnt=0;
                for(int it: arti){
                    for(int ya: array){
                        if(it == ya){
                            cnt++;
                        }
                    }
                }
                System.out.println("\n你中了" +cnt+ "個號碼");
                if(cnt==6){
                    System.out.println("頭獎");
                }else if(cnt==5){
                    System.out.println("貳獎");
                }else if(cnt==4){
                    System.out.println("參獎");
                }else if(cnt==3){
                    System.out.println("肆獎");
                }else if(cnt==2){
                    System.out.println("伍獎");
                }else if(cnt==1){
                    System.out.println("陸獎");
                }else{
                    System.out.println("安慰獎");
                }
            }else if(c==1){
            ////////////////////////////////////////////////////////電腦選號
                System.out.print("\n電腦選號(由小至大排列)是:");
                int[] array=new int[6];
                int com=(int)(Math.random()*49)+1,comm;
                int jj=0;
                for(comm=0;comm<=5;comm++){
                    while(jj<comm){
                        if(array[jj]==com){
                            com=(int)(Math.random()*49)+1;
                            jj=0;
                        }else{
                            jj++;
                        }
                    }
                    array[comm]=com;
                }
                Arrays.sort(array);
                for(int h: array){
                    if(h<10){
                        System.out.print(" 0"+h);
                    }else{
                        System.out.print(" "+h);
                    }
                }
                     
                System.out.print("\n彩券號碼(由小至大排列)是:");
                int[] array1=new int[6];
                int x=(int)(Math.random()*49)+1,y;
                int j=0;
                for(y=0;y<=5;y++){
                    while(j<y){
                        if(array1[j]==x){
                            x=(int)(Math.random()*49)+1;
                            j=0;
                        }else{
                            j++;
                        }
                    }
                    array1[y]=x;
                }
                Arrays.sort(array1);
                for(int h: array1){
                    if(h<10){
                        System.out.print(" 0"+h);
                    }else{
                        System.out.print(" "+h);
                    }
                }
                int cnt=0;
                for(int it: array1){
                    for(int ya: array){
                        if(it == ya){
                            cnt++;
                        }
                    }
                }
                System.out.println("\n你中了" +cnt+ "個號碼");
                if(cnt==6){
                    System.out.println("頭獎");
                }else if(cnt==5){
                    System.out.println("貳獎");
                }else if(cnt==4){
                    System.out.println("參獎");
                }else if(cnt==3){
                    System.out.println("肆獎");
                }else if(cnt==2){
                    System.out.println("伍獎");
                }else if(cnt==1){
                    System.out.println("陸獎");
                }else{
                    System.out.println("安慰獎");
                }       
            }else{
                System.out.println("重來");
                continue;
            }
        }
    }
}
