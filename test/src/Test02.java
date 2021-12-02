import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;

public class Test02 {

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);
        System.out.println(time);



       /* String str = "[{'columnId':5,'columnName':'人文历史111'},{'columnId':2,'columnName':'商业视野'}]";
        JSONArray jsonArray = null;
        try {
            jsonArray = new JSONArray(str);
            System.out.println(jsonArray.getJSONObject(0).get("columnName"));
        } catch (JSONException e) {
            e.printStackTrace();
        }*/
    }




}


/*添加参评意见*/
  /*  function addItemTabel(data) {
        var data = data;
        initItemTableBody(data);
    }*/

/*修改参评意见*/
   /* function updateItemTabel(){
        ${fldKey}_save();
        var data = $("#partData").val();
        labelCall("com.bronzesof.dev.hande.reviewReport.ReportAop", "update", [JSON.stringify(data).replaceAll("\"", "'")], function (data) {
            if (data) {
                data = eval("(" + data + ")");
            } else {
                data = {};
            }
            if (data.msg) $("#warningDiv").html(data.msg).show(); else {
                $("#warningDiv").html("");
                initTable(data, currentPage, pageSize);
            }
            closeLoader();
        });
    }
*/


  /*var temp = $("[field = Fld_U_00009]").find("[class = auto-link] a");
    for(var i = 0; i <temp.length;i++){
        var $name = temp.eq(i).text();
        var $data = {
            "reviewPersonName": $name,
            "comment": "",
            "reply": "",
            "reviewPersonId": "",
            "id": ""
        };
        $data = [$data];
        addItemTabel($data);

    }*/
/*function dosave(){
    $("input[type=checkbox]:checked").each(function(){

    })
}*/

/*
* database link 是定义一个数据库到另一个数据库的路径的对象,database link 允许你查询远程表
* 以及执行远程程序.
* 在任何分布式环境中,database 都是必要的.另外要注意database link 是单向的连接.
* 在创建database link 的时候,Oracle 在再数据字典中保存相关的database link 的信息,在使用
* database link 的时候,Oracle Net 用用户预先定义好的连接信息访问相应的远程数据库以完成相应的工作.
* */






