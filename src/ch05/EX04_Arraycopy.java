package ch05;

import java.util.Arrays;

public class EX04_Arraycopy {
	public static void main(String[] args) {
		// 배열 복사
		int src[] = {1,3,4,8};
		int[] dst=src;
		System.out.println(Arrays.toString(dst));
		
		// 배열 값 변경
		dst[3]=99;
		System.out.println(Arrays.toString(src));
		
		int[] realDst  =new int[4];
		for (int i = 0; i < src.length; i++) {
			realDst[i] =src[i];
		}
		System.out.println(Arrays.toString(realDst));
		
		realDst[0] = 11;
		System.out.println(Arrays.toString(src));
		
		int[] newSrc = {3,4,7,9};
		int[] newDst =new int[4];
		System.arraycopy(newSrc, 0, newDst, 0,newSrc.length);
		System.out.println(Arrays.toString(newDst));
		newDst[newDst.length -1] =88;
		System.out.println(Arrays.toString(newSrc));
		
		
		// 2차원 배열의 복사는 위의 방법으로는 안됨
		// 2차원 배열의 한 행마다 clone을 해주어야 함

		
		
		
		
		
		
		
	}

}
