package com.study.cn;

public class PalindromicNumber {
	
	public static void main(String[] args) {
		long start1=System.nanoTime(); //��ȡ��ʼʱ��
		 
	    //Ҫ��ĳ���򷽷�
		String x = "131";
		int y = 131;
		StringBufferReverse(x);
		isPalindrome(y);


 
		long end1=System.nanoTime(); //��ȡ����ʱ��
 
		System.out.println("��������ʱ�䣺 "+(end1-start1)+"��΢��"); 
	}

private static boolean StringBufferReverse(String input) {
//	String reverseNumber = new StringBuilder(String.valueOf(x)).reverse().toString(); 
//    return reverseNumber.equals(String.valueOf(x));
	
    StringBuffer sbInput = new StringBuffer(input);
    StringBuffer sbReverse = sbInput.reverse();
    String output = sbReverse.toString();//ת���ַ���

    System.out.println("����2 ==input==" + input);
    System.out.println("����2 ==output==" + output);

    if (input.equals(output)) {
        System.out.println("����2 ==" + input + "�ǻ�����������");
        return true;
    }
    System.out.println("����2 ==" + input + "���ǻ�����������");
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
		  System.out.println(input + "���ǻ�����");
		  return false;
	  }
  }
  System.out.println(input + "�ǻ�����");
  return true;
}

public boolean leetCode(int x) {
	 // ���������
    // ������������ x < 0 ʱ��x ���ǻ�������
    // ͬ���أ�������ֵ����һλ�� 0��Ϊ��ʹ������Ϊ���ģ�
    // �����һλ����ҲӦ���� 0
    // ֻ�� 0 ������һ����
    if(x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }

    int revertedNumber = 0;
    while(x > revertedNumber) {
        revertedNumber = revertedNumber * 10 + x % 10;
        x /= 10;
    }

    // �����ֳ���Ϊ����ʱ�����ǿ���ͨ�� revertedNumber/10 ȥ��������λ�����֡�
    // ���磬������Ϊ 12321 ʱ���� while ѭ����ĩβ���ǿ��Եõ� x = 12��revertedNumber = 123��
    // ���ڴ�����λ�����ֲ�Ӱ����ģ����������Լ���ȣ����������ǿ��Լ򵥵ؽ���ȥ����
    return x == revertedNumber || x == revertedNumber/10;
}

}

