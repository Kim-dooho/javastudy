package openapi;

public class OpenApiTest {

  private String occrrnc_dt;
  private String dth_dnv_cnt;
  
  public OpenApiTest() {
  }

  public OpenApiTest(String occrrnc_dt, String dth_dnv_cnt) {
    super();
    this.occrrnc_dt = occrrnc_dt;
    this.dth_dnv_cnt = dth_dnv_cnt;
  }

  public String getOccrrnc_dt() {
    return occrrnc_dt;
  }

  public void setOccrrnc_dt(String occrrnc_dt) {
    this.occrrnc_dt = occrrnc_dt;
  }

  public String getDth_dnv_cnt() {
    return dth_dnv_cnt;
  }

  public void setDth_dnv_cnt(String dth_dnv_cnt) {
    this.dth_dnv_cnt = dth_dnv_cnt;
  }
  
  
  
}
