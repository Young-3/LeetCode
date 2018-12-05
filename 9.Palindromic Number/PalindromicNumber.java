package com.study.cn;

public class PalindromicNumber {
	
	public static void main(String[] args) {
		long start1=System.nanoTime(); //获取开始时间
		 
	    //要测的程序或方法
		String x = "131";
		int y = 131;
		StringBufferReverse(x);
		isPalindrome(y);


 
		long end1=System.nanoTime(); //获取结束时间
 
		System.out.println("程序运行时间： "+(end1-start1)+"毫微秒"); 
	}

private static boolean StringBufferReverse(String input) {
//	String reverseNumber = new StringBuilder(String.valueOf(x)).reverse().toString(); 
//    return reverseNumber.equals(String.valueOf(x));
	
    StringBuffer sbInput = new StringBuffer(input);
    StringBuffer sbReverse = sbInput.reverse();
    String output = sbReverse.toString();//转成字符串

    System.out.println("方法2 ==input==" + input);
    System.out.println("方法2 ==output==" + output);

    if (input.equals(output)) {
        System.out.println("方法2 ==" + input + "是回文数！！！");
        return true;
    }
    System.out.println("方法2 ==" + input + "不是回文数！！！");
    return false;
}



public static boolean isPalindrome(int input) {
  String  s = String.valueOf(input);
  int begin = 0, end = s.length() - 1;
  char[] chars = s.toCharArray();
  
  while(begin<end) {
	  if(chars[begin] == chars[end]) {
		  begin++;
		  end--;
	  }else {
		  System.out.println(input + "不是回文数");
		  return false;
	  }
  }
  System.out.println(input + "是回文数");
  return true;
}

public boolean leetCode(int x) {
	 // 特殊情况：
    // 如上所述，当 x < 0 时，x 不是回文数。
    // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
    // 则其第一位数字也应该是 0
    // 只有 0 满足这一属性
    if(x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }

    int revertedNumber = 0;
    while(x > revertedNumber) {
        revertedNumber = revertedNumber * 10 + x % 10;
        x /= 10;
    }

    // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
    // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
    // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
    return x == revertedNumber || x == revertedNumber/10;
}

}

