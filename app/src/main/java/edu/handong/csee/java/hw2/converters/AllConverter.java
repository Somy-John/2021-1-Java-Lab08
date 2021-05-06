package edu.handong.csee.java.hw2.converters;

/**
 * 단위에 맞게 결과(KM면 M과 MILE로 변환, TON이면 KG과 G로 변환)를 출력하는 클레스
 */
public class AllConverter {
   private double value;
   private String originalM;
   /**
    * setter
    * @param fromValue 벨류를 받아와서 프라이빗 멤버인 value를 설정
    * @return 자기자신 리턴
    */
   public AllConverter setFromValue(double fromValue){
      value = fromValue;
      return this;
   }
   /**
    * setter
    * @param originalMeasure 단위를 받아와서 프라이빗 멤버인 originalM를 설정
    * @return 자기자신 리턴
    */
   public AllConverter setOriginalMeasure(String originalMeasure){
      originalM = originalMeasure;
      return this;
   }
   /**
    * 단위에 맞게 결과(KM면 M과 MILE로 변환, TON이면 KG과 G로 변환)를 출력
    * @return 자기자신 리턴
    */
   public AllConverter convertAndPrintOut(){
      if(originalM.equals("KM")){
         System.out.println(value+" "+originalM+" to "+value*1000+" M");
         System.out.println(value+" "+originalM+" to "+value/1.6+" MILE");
      }
      else if(originalM.equals("TON")){
         System.out.println(value+" "+originalM+" to "+value*1000+" KG");
         System.out.println(value+" "+originalM+" to "+value*1000000+" G");
      }
      else{
         System.out.println("AllConverter cannot support the measure!");
      }
      return this;
   }
}