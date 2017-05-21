import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.syhbuy.spay.admin.base.util.HttpRequester;
import com.syhbuy.spay.admin.base.util.HttpResponse;

/**
 * Created by Administrator on 2016/9/12.
 */
public class Test {

	public static void main(String[] args) {

		// 调ＰＨＰ接口
		String url = "http://api.syhbuy.cn/api/index.php";
		// token: 一直在变，登录一次变一次
		// 参数 ： order_id 订单号（tranId） ，status 审核状态（3 审核通过 4 审核驳回）
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key", "q1w2e3r4t5");
		map.put("module", "examine");
		map.put("method", "index");
		map.put("reskey", "2");
		map.put("state", "2");
		try {
			HttpResponse response = HttpRequester.sendPost(url, map);
			String ss = response.getContent();
			JSONObject obj = JSONObject.parseObject(ss);
			System.out.println(obj);

		}
		catch (IOException e) {

		}
	}
}
