package com.zc.simple.control;

import com.zc.simple.manager.CrawlerManner;
import com.zc.simple.pojos.CrawlResultPojo;
import com.zc.simple.pojos.UrlPojo;

public class SystemControl {
	public static void main(String[] args) {
		// �����ַ�ķ�װ
		UrlPojo urlPojo = new UrlPojo("http://www.qq.com");
		// ѡ����һ�ַ�ʽ
		CrawlerManner crawlerManner = new CrawlerManner(false);
		// ִ������,����ȡ��װ�õĽ��
		CrawlResultPojo resultPojo = crawlerManner.crawl(urlPojo);
		String pageContent = resultPojo.getPageContent();
		System.out.println(pageContent);
	}
}
