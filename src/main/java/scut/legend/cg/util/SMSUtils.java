package scut.legend.cg.util;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class SMSUtils {
	/**
	 * @param phoneNumber对方的手机号码
	 * @param content	要发送的内容
	 * @return	状态码，请查看:http://sms.webchinese.cn/api.shtml#top3
	 * @throws Exception
	 * 
	 */
	public static String sendSMS(String phoneNumber,String content) throws Exception{
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod("http://gbk.sms.webchinese.cn");
		post.addRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=gbk");// 在头文件中设置转码
		NameValuePair[] data = { new NameValuePair("Uid", "sndragon"), new NameValuePair("Key", "0ad0c8e5aca53f7d6ffd"),
				new NameValuePair("smsMob", phoneNumber), new NameValuePair("smsText", content) };
		post.setRequestBody(data);

		client.executeMethod(post);
		Header[] headers = post.getResponseHeaders();
		int statusCode = post.getStatusCode();
		System.out.println("返回状态码:"+statusCode);
		for (Header h : headers) {
			System.out.println(h.toString());
		}
		String result = new String(post.getResponseBodyAsString().getBytes("gbk"));
		//System.out.println(result); // 打印返回消息状态
		post.releaseConnection();
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		String code=sendSMS("18826077187", "您的外卖送到楼下了~");
	}
}
