package tddTest;

import junit.framework.TestCase;
import sumpack.Sum;
/**
 * junit framework�� �̿��ϱ� ���ؼ� �˾Ƶξ�� �� ��Ģ�� �Ʒ��� ����.
�׽�Ʈ �ڵ�� junit �����ӿ�ũ�� ���ԵǾ��ִ� TestCase��� Ŭ������ extends�Ͽ� �ۼ��Ѵ�.
"test"�� �����ϴ� �޽��� �ڵ����� ������ �ȴ�.
 *
 */
/*
 1. ���� ���ڸ� 2�� ���Ѵ�.
 2. Ȧ������ �ƴ��� üũ�Ѵ�.
 
 */
public class SumTest extends TestCase {
	public static void main(String[] args) {
		junit.textui.TestRunner.run(SumTest.class);
	}
	
/*	assertEquals(a, b) - a�� b�� �������� �����Ѵ�.
	assertTrue(a) - a�� ������ �����Ѵ�.
	assertFalse(a) - a�� ���������� �����Ѵ�.*/

	public void testSum(){
		assertEquals(3, Sum.getNum(true));
		assertEquals(2, Sum.getNum(false));
	}
	
	public void testNumType(){
		assertTrue(Sum.getType(3));
		assertFalse(Sum.getType(2));
	}
}
