package cn.shaines.test.test;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.Iterator;

/**
 * @author houyu
 * @createTime 2019/4/6 16:41
 */
public class Test {

    public static void main(String[] args) {
        String str = "<?xml version=\"1.0\" encoding=\"utf-8\"?><res-packages><res-package id='test' name='test' create_date='2019-04-04 12:51:29'>" +
                "<res-package-item  name='test' path='jcr:/test/测试流.rl.xml' version='LATEST'/></res-package></res-packages>";
        Document document = null;
        try {
            document = DocumentHelper.parseText(str);

            Element root = document.getRootElement();
            Iterator iterator = root.elementIterator();
            while (iterator.hasNext()){
                Element element = (Element)iterator.next();
                String s = element.attributeValue("id");
                String s1 = element.attributeValue("name");
                String s2 = element.attributeValue("create_date");
                String s3 = element.attributeValue("path");
                String s4 = element.attributeValue("version");
                System.out.println(s);
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);
                System.out.println(s4);

                Iterator iterator1 = element.elementIterator();
                Element element2 = (Element)iterator1.next();
                s3 = element2.attributeValue("path");
                s4 = element2.attributeValue("version");
                System.out.println(s3);
                System.out.println(s4);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
