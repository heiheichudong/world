package com.gess.core.utils

import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type


fun <T> getT(a: Any, i: Int): T? {
    var type: Type? = a.javaClass.genericSuperclass
    if (type is ParameterizedType) {
        try {
            return (type.actualTypeArguments[i] as Class<T>).newInstance()
        } catch (e: InstantiationException) {
            e.printStackTrace()
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        }
    }
    return null
}



class Foo<T> {
    val tClass: Class<T>
        get() = (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<T>
}


fun <T> getActualTypeArgument(clazz: Class<T>): Class<T>? {
    var entitiClass: Class<T>? = null
    val genericSuperclass = clazz.genericSuperclass
    if (genericSuperclass is ParameterizedType) {
        val actualTypeArguments =
            genericSuperclass.actualTypeArguments
        if (actualTypeArguments != null && actualTypeArguments.size > 0) {
            entitiClass = actualTypeArguments[0] as Class<T>
        }
    }
    return entitiClass
}

class KClassUtil {
    companion object {
        inline fun <reified T> getKType(K: Any,position:Int):T {
            var parameterizedType = K::class.java.genericSuperclass as ParameterizedType
            var actualTypeArguments = parameterizedType.actualTypeArguments
            return ( actualTypeArguments[position].javaClass as Class<T>).newInstance()
        }
    }
}
