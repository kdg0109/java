package tddTest;

import junit.framework.TestCase;
import sumpack.Sum;
/**
 * junit framework를 이용하기 위해서 알아두어야 할 규칙은 아래와 같다.
테스트 코드는 junit 프레임워크에 포함되어있는 TestCase라는 클래스를 extends하여 작성한다.
"test"로 시작하는 메써드는 자동으로 실행이 된다.
 *
 */
/*
 1. 더할 숫자를 2개 구한다.
 2. 홀수인지 아닌지 체크한다.
 
 */
public class SumTest extends TestCase {
	public static void main(String[] args) {
		junit.textui.TestRunner.run(SumTest.class);
	}
	
/*	assertEquals(a, b) - a와 b가 같은지를 조사한다.
	assertTrue(a) - a가 참인지 조사한다.
	assertFalse(a) - a가 거짓인지를 조사한다.*/

	public void testSum(){
		assertEquals(3, Sum.getNum(true));
		assertEquals(2, Sum.getNum(false));
	}
	
	public void testNumType(){
		assertTrue(Sum.getType(3));
		assertFalse(Sum.getType(2));
	}
}
