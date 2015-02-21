package com.ashim.common;

public class Utility
{
	public static String toTitleCase(String str)
	{

		if (str == null)
		{
			return null;
		}

		String[] arr = str.split(" ");
		StringBuffer sb = new StringBuffer();

		for (String element : arr)
		{
			sb.append(Character.toUpperCase(element.charAt(0)))
			.append(element.substring(1)).append(" ");
		}
		return sb.toString().trim();
	}
}