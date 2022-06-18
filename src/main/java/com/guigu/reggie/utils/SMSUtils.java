package com.guigu.reggie.utils;



import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.sms.v20190711.SmsClient;
import com.tencentcloudapi.sms.v20190711.models.SendSmsRequest;
import com.tencentcloudapi.sms.v20190711.models.SendSmsResponse;

/**
 * 短信发送工具类
 */
public class SMSUtils {

	/**
	 * 发送短信
	 */
	public static void sendMessage(String phoneNumber,String code){
		try {
			Credential cred = new Credential("AKIDvjmFWYLtFNFyVqyHMD2spkZN3WkhPmvr", "lIadV9amnbAVdV8bqrc8QaXFiyBF9tTw");
			SmsClient client = new SmsClient(cred, "ap-shanghai");

			SendSmsRequest req = new SendSmsRequest();
			/* 短信应用 ID: 在 [短信控制台] 添加应用后生成的实际 SDKAppID，例如1400006666 */
			String appid = "1400691294";
			req.setSmsSdkAppid(appid);
			/* 短信签名内容: 使用 UTF-8 编码，必须填写已审核通过的签名，可登录 [短信控制台] 查看签名信息 */
			String sign = "积极吧hos";
			req.setSign(sign);
			/* 模板 ID: 必须填写已审核通过的模板 ID，可登录 [短信控制台] 查看模板 ID */
			String templateID = "1437006";
			req.setTemplateID(templateID);

			/* 下发手机号码，采用 e.164 标准，+[国家或地区码][手机号]
			 * 例如+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号，最多不要超过200个手机号*/
			String[] phoneNumbers = {"+86"+phoneNumber};
			req.setPhoneNumberSet(phoneNumbers);

			String[] templateParams = {code};
			req.setTemplateParamSet(templateParams);

			/* 通过 client 对象调用 SendSms 方法发起请求。注意请求方法名与请求对象是对应的
			 * 返回的 res 是一个 SendSmsResponse 类的实例，与请求对象对应 */
			SendSmsResponse res = client.SendSms(req);

			// 输出 JSON 格式的字符串回包
			System.out.println(SendSmsResponse.toJsonString(res));

			// 可以取出单个值，您可以通过官网接口文档或跳转到 response 对象的定义处查看返回字段的定义
			System.out.println(res.getRequestId());


		} catch (TencentCloudSDKException e) {
			System.out.println(e.toString());
		}
	}

}
