package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ExceptionUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes2.dex */
public class OptionalHandlerFactory implements Serializable {
    private static final Java7Handlers _jdk7Helper;
    public static final OptionalHandlerFactory instance;
    private final Map<String, String> _sqlDeserializers;
    private final Map<String, Object> _sqlSerializers;
    private static final Class<?> CLASS_DOM_NODE = Node.class;
    private static final Class<?> CLASS_DOM_DOCUMENT = Document.class;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        Java7Handlers java7HandlersInstance = null;
        try {
            java7HandlersInstance = Java7Handlers.instance();
        } catch (Throwable th) {
            ExceptionUtil.rethrowIfFatal(th);
        }
        _jdk7Helper = java7HandlersInstance;
        instance = new OptionalHandlerFactory();
    }

    protected OptionalHandlerFactory() {
        HashMap map = new HashMap();
        this._sqlDeserializers = map;
        map.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        map.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap map2 = new HashMap();
        this._sqlSerializers = map2;
        map2.put("java.sql.Timestamp", DateSerializer.instance);
        map2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        map2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        map2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        map2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    public JsonSerializer<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) {
        Object objInstantiate;
        JsonSerializer<?> serializerForJavaNioFilePath;
        Class<?> rawClass = javaType.getRawClass();
        if (_IsXOfY(rawClass, CLASS_DOM_NODE)) {
            return (JsonSerializer) instantiate("com.fasterxml.jackson.databind.ext.DOMSerializer", javaType);
        }
        Java7Handlers java7Handlers = _jdk7Helper;
        if (java7Handlers != null && (serializerForJavaNioFilePath = java7Handlers.getSerializerForJavaNioFilePath(rawClass)) != null) {
            return serializerForJavaNioFilePath;
        }
        String name = rawClass.getName();
        Object obj = this._sqlSerializers.get(name);
        if (obj != null) {
            if (obj instanceof JsonSerializer) {
                return (JsonSerializer) obj;
            }
            return (JsonSerializer) instantiate((String) obj, javaType);
        }
        if ((name.startsWith("javax.xml.") || hasSuperClassStartingWith(rawClass, "javax.xml.")) && (objInstantiate = instantiate("com.fasterxml.jackson.databind.ext.CoreXMLSerializers", javaType)) != null) {
            return ((Serializers) objInstantiate).findSerializer(serializationConfig, javaType, beanDescription);
        }
        return null;
    }

    public JsonDeserializer<?> findDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Object objInstantiate;
        JsonDeserializer<?> deserializerForJavaNioFilePath;
        Class<?> rawClass = javaType.getRawClass();
        Java7Handlers java7Handlers = _jdk7Helper;
        if (java7Handlers != null && (deserializerForJavaNioFilePath = java7Handlers.getDeserializerForJavaNioFilePath(rawClass)) != null) {
            return deserializerForJavaNioFilePath;
        }
        if (_IsXOfY(rawClass, CLASS_DOM_NODE)) {
            return (JsonDeserializer) instantiate("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer", javaType);
        }
        if (_IsXOfY(rawClass, CLASS_DOM_DOCUMENT)) {
            return (JsonDeserializer) instantiate("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer", javaType);
        }
        String name = rawClass.getName();
        String str = this._sqlDeserializers.get(name);
        if (str != null) {
            return (JsonDeserializer) instantiate(str, javaType);
        }
        if ((name.startsWith("javax.xml.") || hasSuperClassStartingWith(rawClass, "javax.xml.")) && (objInstantiate = instantiate("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers", javaType)) != null) {
            return ((Deserializers) objInstantiate).findBeanDeserializer(javaType, deserializationConfig, beanDescription);
        }
        return null;
    }

    private boolean _IsXOfY(Class<?> cls, Class<?> cls2) {
        return cls2 != null && cls2.isAssignableFrom(cls);
    }

    private Object instantiate(String str, JavaType javaType) {
        try {
            return instantiate(Class.forName(str), javaType);
        } catch (Throwable th) {
            ExceptionUtil.rethrowIfFatal(th);
            StringBuilder sb = new StringBuilder("Failed to find class `");
            sb.append(str);
            sb.append("` for handling values of type ");
            sb.append(ClassUtil.getTypeDescription(javaType));
            sb.append(", problem: (");
            sb.append(th.getClass().getName());
            sb.append(") ");
            sb.append(th.getMessage());
            throw new IllegalStateException(sb.toString());
        }
    }

    private Object instantiate(Class<?> cls, JavaType javaType) {
        try {
            return ClassUtil.createInstance(cls, false);
        } catch (Throwable th) {
            ExceptionUtil.rethrowIfFatal(th);
            StringBuilder sb = new StringBuilder("Failed to create instance of `");
            sb.append(cls.getName());
            sb.append("` for handling values of type ");
            sb.append(ClassUtil.getTypeDescription(javaType));
            sb.append(", problem: (");
            sb.append(th.getClass().getName());
            sb.append(") ");
            sb.append(th.getMessage());
            throw new IllegalStateException(sb.toString());
        }
    }

    private boolean hasSuperClassStartingWith(Class<?> cls, String str) {
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            if (superclass.getName().startsWith(str)) {
                return true;
            }
        }
        return false;
    }
}
