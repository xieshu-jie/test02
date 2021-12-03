import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Test05 {

    public static void main(String[] args) {




        try {

                               //http://oa.handeaxle.com/defaultroot/portal.jsp?access=oa
                             //http://127.0.0.1/defaultroot/loginone.jsp?toLink=需URL编码(/defaultroot/jumpblcy.jsp?id=111&lcslid=159364268)
            //String URL_OAM = "http://${oadomain}/defaultroot/loginone.jsp?toLink=URLEncoder.encode(/defaultroot/jumpblcy.jsp?id=825913&lcslid=168802)";
                             //http://127.0.0.1/defaultroot/loginone.jsp?toLink=需URL编码(/defaultroot/jumpblcy.jsp?id=111&lcslid=159364268)
                            //http://192.168.7.56:8080/index.jsp?
            String URL_OAM = "http://oa.handeaxle.com/defaultroot/loginone.jsp?toLink="+URLEncoder.encode("/defaultroot/jumpblcy.jsp?id=111&lcslid=159364268","UTF-8");
            System.out.println(URL_OAM);
                          //http://192.168.7.61:8882/sso/oauth2/authorize?client_id=APP005&redirect_uri=" + URLEncoder.encode(URL_OAM,"UTF-8")
            String url = "https://iam.handeaxle.com:8882/sso/oauth2/authorize?client_id=APP004&redirect_uri=" + URLEncoder.encode(URL_OAM,"UTF-8");
            System.out.println(url);
            //1234235443
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            //1234235345346425654367546756756
        }
    }
}
