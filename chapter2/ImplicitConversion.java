package chapter2;
// 묵시적 형 변환(자동 형 변환) (2026.01.03)
public class ImplicitConversion {
    public static void main(String[] args){
        byte bNum = 10;
        int iNum = bNum; // 바이트 값이 인트형으로 변환, 대입

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2; // 인트 값이 플로트형으로 변환, 대입

        System.out.println(iNum);
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum;
        System.out.println(dNum);
    }
}

/* 형 변환 기본 원칙
* 1. 바이트 크기가 작은 자료형 -> 큰 자료형 (자동으로)
* 2. 정밀하지 않은 자료형 -> 더 정밀한 자료형 (자동으로) */
