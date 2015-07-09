package com.cockroach.cockcms.cms.template;


public class CmsModuleGenerator {
	private static String packName = "com.cockroach.cms.shell.template";
	private static String fileName = "jeecms.properties";

	public static void main(String[] args) {
		new ModuleGenerator(packName, fileName).generate();
	}
}
