package study.java.vote.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author jackie chen
 * @create 2017/11/13
 * @description HttpClient
 */
public class HttpClient {
	public static String sendPost(String url, String param) {

		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");

			conn.setRequestProperty("Accept-Charset", "utf-8");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			conn.setRequestProperty("Authorization", "Bearer 475FC0C3C8E0EFD2DE25303E3533E15FC0329ED235B9A58596EA53CB2724CCB53326082EDAC41F6736E448906154A1C8A92067F4CA0734CCE11D43B0ED8D34B60D60EFF1DC6616A56277BDB856FA191855B80D4821E15ACF8175219FCF10F4EFF5402282B4986B00C4FE76DC2744A20E678423CAD0020ACF365A998BFAF90D71EACD633371095EB512AEF552CB734171");


			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);


			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(param);
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送 POST 请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
}
