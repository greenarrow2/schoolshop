package com.schoolcloud.schoolshop.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author 长润
 *泛型工具
 */
public class GenericsUtils {
	/**
	 * 通过反射获得指定类的父类的泛型参数
	 * @param clazz 要反射的类，该类必须继承泛型父类
	 * @param index 泛型参数所在位置索引
	 * @return  范型参数的实际类型, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回
	 *         <code>Object.class</code>
	 */
	@SuppressWarnings("rawtypes")
	public static Class getSuperClassGenricType(Class clazz,int index){
      Type genType = clazz.getGenericSuperclass();
      if(!(genType instanceof ParameterizedType)){
    	  return Object.class;
      }
       Type[] params = ((ParameterizedType)genType).getActualTypeArguments();
       if(index>=params.length||index<0){
    	   throw new RuntimeException("你输入的索引"+ (index < 0 ? "不能小于0" : "超出了参数的总数"));
       }
       if(!(params[index] instanceof Class)){
    	   return Object.class;
       }
       return (Class) params[index];
	}
	/**
	 * 通过反射获得指定类的父类的泛型参数
	 * @param clazz 要反射的类，该类必须继承泛型父类
	 * @return  范型参数的实际类型, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回
	 *         <code>Object.class</code>
	 */
	public static Class getSuperClassGenricType(Class clazz){
		 return  getSuperClassGenricType(clazz, 0);
	}
	/**
	 * 通过反射,获得方法返回值泛型参数的实际类型. 如: public Map<String, Buyer> getNames(){}
	 * 
	 * @param Method
	 *            method 方法
	 * @param int index 泛型参数所在索引,从0开始.
	 * @return 泛型参数的实际类型, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回
	 *         <code>Object.class</code>
	 */
	@SuppressWarnings("unchecked")
	public static Class getMethodGenericReturnType(Method method,int index){
		Type genType = method.getGenericReturnType();
		if(genType instanceof ParameterizedType){
			ParameterizedType type = (ParameterizedType) genType;
			Type[] typeArguments = type.getActualTypeArguments();
			if (index >= typeArguments.length || index < 0)
			{
				throw new RuntimeException("你输入的索引"
						+ (index < 0 ? "不能小于0" : "超出了参数的总数"));
			}
			return (Class) typeArguments[index];
		}
		return Object.class;
	}
	
	/**
	 * 通过反射,获得方法返回值第一个泛型参数的实际类型. 如: public Map<String, Buyer> getNames(){}
	 * 
	 * @param Method
	 *            method 方法
	 * @return 泛型参数的实际类型, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回
	 *         <code>Object.class</code>
	 */
	@SuppressWarnings("unchecked")
	public static Class getMethodGenericReturnType(Method method)
	{
		return getMethodGenericReturnType(method, 0);
	}
	/**
	 * 
	 * @param method
	 * @param index
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static List<Class> getMethodGenericParameterTypes(Method method,int index){
		List<Class> results = new ArrayList<Class>();
		 Type[] getParameterTypes = method.getParameterTypes();
		 if (index >= getParameterTypes.length || index < 0) {
				throw new RuntimeException("你输入的索引"
						+ (index < 0 ? "不能小于0" : "超出了参数的总数"));
		}
		 Type genericParameterType = getParameterTypes[index];
			if (genericParameterType instanceof ParameterizedType)
			{
				ParameterizedType aType = (ParameterizedType) genericParameterType;
				Type[] parameterArgTypes = aType.getActualTypeArguments();
				for (Type parameterArgType : parameterArgTypes)
				{
					Class parameterArgClass = (Class) parameterArgType;
					results.add(parameterArgClass);
				}
				return results;
			}
		return results;
	}
	/**
	 * 通过反射,获得方法输入参数第一个输入参数的所有泛型参数的实际类型. 如: public void add(Map<String, Buyer>
	 * maps, List<String> names){}
	 * 
	 * @param Method
	 *            method 方法
	 * @return 输入参数的泛型参数的实际类型集合, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回空集合
	 */
	@SuppressWarnings("unchecked")
	public static List<Class> getMethodGenericParameterTypes(Method method)
	{
		return getMethodGenericParameterTypes(method, 0);
	}

	public static Class getFieldGenericType(Field field, int index){
		  Type genericFieldType = field.getGenericType();
		  if (genericFieldType instanceof ParameterizedType) {
			ParameterizedType aType = (ParameterizedType)genericFieldType;
		  Type[] fieldArgTypes =	aType.getActualTypeArguments();
		  if (index >= fieldArgTypes.length || index < 0)
			{
				throw new RuntimeException("你输入的索引"
						+ (index < 0 ? "不能小于0" : "超出了参数的总数"));
			}
		  return (Class) fieldArgTypes[index];
		}
		  return Object.class;
	}
	/**
	 * 通过反射,获得Field泛型参数的实际类型. 如: public Map<String, Buyer> names;
	 * 
	 * @param Field
	 *            field 字段
	 * @param int index 泛型参数所在索引,从0开始.
	 * @return 泛型参数的实际类型, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回
	 *         <code>Object.class</code>
	 */
	@SuppressWarnings("unchecked")
	public static Class getFieldGenericType(Field field)
	{
		return getFieldGenericType(field, 0);
	}
}
