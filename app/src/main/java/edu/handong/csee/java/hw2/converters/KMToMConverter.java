package edu.handong.csee.java.hw2.converters;
/**
 * KM To M Converter
 */
public class KMToMConverter implements Convertible{
   private double value;
    /**
    * setter
    * @param fromValue 벨류를 받아와서 프라이빗 멤버인 value를 설정
    */
   public void setFromValue(double fromValue){
      value = fromValue;
   }
   /**
    * getter
    * @return 프라이빗 멤버인 value를 리턴
    */
   public double getConvertedValue(){
      return value;
   }
   /**
    * value를 단위환산해주는 메소드
    */
   public void convert(){
      value = value*1000;
   }
