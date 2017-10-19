package cn.fyl.seven;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 * Created by Fang on 2017/10/19.
 */
public class MyAnswer {
    public int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            int result = 0;
            //F(1)+F(2)+F(3)+...+F(n-2)+F(n-1) 已知n为1、2的值，推出n为3、4...的值，保存中间已计算的值
            int f1 = 0;
            int f2 = 1;
            for(int i = 2; i <= n; i++){
                result = f1 + f2;
                f1 = f2;
                f2 =result;
            }
            return result;
        }
    }
}
