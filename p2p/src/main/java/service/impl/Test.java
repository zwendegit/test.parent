package service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang.StringUtils;

import vo.UserVo;

public abstract class Test {

	protected abstract void querytest();

	public void query() {
		querytest();
	}

	public static void main(String[] args) {
		String aa = "abcdefj";
		String b = "def";
		String c = "hijk";
		String d = "badf0";
		List<String> list = new ArrayList<String>();
		StringUtils.isNotBlank(aa);
		StringUtils.isNotEmpty(aa);
		System.out.println(aa.substring(0, 3) + "***" + aa.substring(aa.length() - 2));
		System.out.println(aa.replace(aa.substring(3, 5), "***"));
		Integer inte = Integer.valueOf((int) 2);
		UserVo user = new UserVo();
		UserVo user4 = new UserVo();
		System.out.println(user.hashCode() == user4.hashCode());
		try {
			UserVo user2 = UserVo.class.newInstance();
			UserVo user3 = UserVo.class.newInstance();
			System.out.println(user2.hashCode());
			System.out.println(user2.hashCode() == user3.hashCode());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(user.hashCode());
		System.out.println(aa.charAt(1));
		String http = "http://www.baidu.com";
		System.out.println(aa.contains("a"));
		System.out.println("a".contains(http));

		Map<String, Object> map = new TreeMap<String, Object>();
		for (int i = 0; i < 5; i++) {
			map.put("" + i, "a" + i);
		}
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}

	}
}
