package pkg02_HttpURLConnection;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HttpURLConnectionEx {

  public static void ex1() {
    
    String spec = "https://www.naver.com/";
    URL url = null;
    HttpURLConnection con = null;
    
    try {
      
      url = URI.create(spec).toURL();
      con = (HttpURLConnection) url.openConnection();
      
      /*
       * HTTP status (상태 코드, 응답 코드)
       * 1. 200 : 정상
       * 2. 4XX : 요청 문제 (404 Not Found)(클라이언트 문제, URL을 잘못 적음)
       * 3. 5XX : 서버 문제
       */
      
      int status = con.getResponseCode();
      System.out.println(status == HttpURLConnection.HTTP_OK ? "정상" : "비정상");
      
      // 접속 해제
      con.disconnect();
      
    } catch (MalformedURLException e) {  
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void ex2() {
    
    String spec = "https://m.nate.com/";
    URL url = null;
    HttpURLConnection con = null;
    
    try {
      
      url = URI.create(spec).toURL();
      con = (HttpURLConnection) url.openConnection();
      
      /*
       * Content-Type
       * 1. 문서 타입 : text/xxx
       * 2. 이미지 타입 : image/xxx
       * 3. 비디오 타입 : vidio/xxx
       * 4. 데이터 타입 : application/xxx
       */
      /*
      String contentType = con.getContentType();
      System.out.println(contentType.startsWith("image/") ? "이미지" : "이미지아님");
      System.out.println(contentType);
      */
      
      /*
       * 요청 헤더 확인하기
       */
      
      String contentType = con.getRequestProperty("Content-Type");
      String contentLength = con.getRequestProperty("Content-Length");
      String userAgent = con.getRequestProperty("Content-Agent");
      System.out.println(contentType);
      System.out.println(contentLength);
      System.out.println(userAgent);
      
      // 전체 헤더 확인하기
      for(Map.Entry<String, List<String>> header : con.getRequestProperties().entrySet()) {
        System.out.println(header.getKey() + " : " + header.getValue());
      }
      
      // 접속 해제
      con.disconnect();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] args) {
    ex2();

  }

}
