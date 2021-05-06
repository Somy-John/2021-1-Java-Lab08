package edu.handong.csee.java.hw2.converters;
/**
 * 컨버터들에 사용될 함수들을 가지는 인터페이스
 */
public interface Convertible {
    /**
     * setter
     * @param fromValue 벨류를 받아와서 프라이빗 멤버인 value를 설정
     */
    public void setFromValue(double fromValue);
    /**
     * getter
     * @return 프라이빗 멤버인 value를 리턴
     */
    public double getConvertedValue();
    /**
     * value를 단위환산해주는 메소드
     */
    public void convert();

}