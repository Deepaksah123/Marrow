package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.EnumNamingStrategy;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class EnumResolver implements Serializable {
    protected final Enum<?> _defaultValue;
    protected final Class<Enum<?>> _enumClass;
    protected final Enum<?>[] _enums;
    protected final HashMap<String, Enum<?>> _enumsById;
    protected final boolean _isFromIntValue;
    protected final boolean _isIgnoreCase;

    /* JADX WARN: Multi-variable type inference failed */
    protected static Class<Enum<?>> _enumClass(Class<?> cls) {
        return cls;
    }

    protected EnumResolver(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> map, Enum<?> r4, boolean z, boolean z2) {
        this._enumClass = cls;
        this._enums = enumArr;
        this._enumsById = map;
        this._defaultValue = r4;
        this._isIgnoreCase = z;
        this._isFromIntValue = z2;
    }

    public static EnumResolver constructFor(DeserializationConfig deserializationConfig, Class<?> cls) {
        return _constructFor(deserializationConfig, cls);
    }

    protected static EnumResolver _constructFor(DeserializationConfig deserializationConfig, Class<?> cls) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<Enum<?>> cls_enumClass = _enumClass(cls);
        Enum<?>[] enumArr_enumConstants = _enumConstants(cls);
        String[] strArrFindEnumValues = annotationIntrospector.findEnumValues(cls_enumClass, enumArr_enumConstants, new String[enumArr_enumConstants.length]);
        String[][] strArr = new String[strArrFindEnumValues.length][];
        annotationIntrospector.findEnumAliases(cls_enumClass, enumArr_enumConstants, strArr);
        HashMap map = new HashMap();
        int length = enumArr_enumConstants.length;
        for (int i = 0; i < length; i++) {
            Enum<?> r8 = enumArr_enumConstants[i];
            String strName = strArrFindEnumValues[i];
            if (strName == null) {
                strName = r8.name();
            }
            map.put(strName, r8);
            String[] strArr2 = strArr[i];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    map.putIfAbsent(str, r8);
                }
            }
        }
        return new EnumResolver(cls_enumClass, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, cls_enumClass), zIsEnabled, false);
    }

    public static EnumResolver constructUsingToString(DeserializationConfig deserializationConfig, Class<?> cls) {
        return _constructUsingToString(deserializationConfig, cls);
    }

    public static EnumResolver constructUsingIndex(DeserializationConfig deserializationConfig, Class<Enum<?>> cls) {
        return _constructUsingIndex(deserializationConfig, cls);
    }

    private static EnumResolver _constructUsingIndex(DeserializationConfig deserializationConfig, Class<Enum<?>> cls) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<Enum<?>> cls_enumClass = _enumClass(cls);
        Enum<?>[] enumArr_enumConstants = _enumConstants(cls);
        HashMap map = new HashMap();
        int length = enumArr_enumConstants.length;
        while (true) {
            length--;
            if (length >= 0) {
                map.put(String.valueOf(length), enumArr_enumConstants[length]);
            } else {
                return new EnumResolver(cls_enumClass, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, cls_enumClass), zIsEnabled, false);
            }
        }
    }

    public static EnumResolver constructUsingEnumNamingStrategy(DeserializationConfig deserializationConfig, Class<?> cls, EnumNamingStrategy enumNamingStrategy) {
        return _constructUsingEnumNamingStrategy(deserializationConfig, cls, enumNamingStrategy);
    }

    private static EnumResolver _constructUsingEnumNamingStrategy(DeserializationConfig deserializationConfig, Class<?> cls, EnumNamingStrategy enumNamingStrategy) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<Enum<?>> cls_enumClass = _enumClass(cls);
        Enum<?>[] enumArr_enumConstants = _enumConstants(cls);
        HashMap map = new HashMap();
        int length = enumArr_enumConstants.length;
        while (true) {
            length--;
            if (length >= 0) {
                Enum<?> r10 = enumArr_enumConstants[length];
                map.put(enumNamingStrategy.convertEnumToExternalName(r10.name()), r10);
            } else {
                return new EnumResolver(cls_enumClass, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, cls_enumClass), zIsEnabled, false);
            }
        }
    }

    protected static EnumResolver _constructUsingToString(DeserializationConfig deserializationConfig, Class<?> cls) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<Enum<?>> cls_enumClass = _enumClass(cls);
        Enum<?>[] enumArr_enumConstants = _enumConstants(cls);
        HashMap map = new HashMap();
        String[][] strArr = new String[enumArr_enumConstants.length][];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumAliases(cls_enumClass, enumArr_enumConstants, strArr);
        }
        int length = enumArr_enumConstants.length;
        while (true) {
            length--;
            if (length >= 0) {
                Enum<?> r1 = enumArr_enumConstants[length];
                map.put(r1.toString(), r1);
                String[] strArr2 = strArr[length];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        map.putIfAbsent(str, r1);
                    }
                }
            } else {
                return new EnumResolver(cls_enumClass, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, cls_enumClass), zIsEnabled, false);
            }
        }
    }

    public static EnumResolver constructUsingMethod(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMember annotatedMember) {
        return _constructUsingMethod(deserializationConfig, cls, annotatedMember);
    }

    protected static EnumResolver _constructUsingMethod(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMember annotatedMember) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<Enum<?>> cls_enumClass = _enumClass(cls);
        Enum<?>[] enumArr_enumConstants = _enumConstants(cls);
        HashMap map = new HashMap();
        int length = enumArr_enumConstants.length;
        while (true) {
            length--;
            if (length >= 0) {
                Enum<?> r10 = enumArr_enumConstants[length];
                try {
                    Object value = annotatedMember.getValue(r10);
                    if (value != null) {
                        map.put(value.toString(), r10);
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Failed to access @JsonValue of Enum value ");
                    sb.append(r10);
                    sb.append(": ");
                    sb.append(e.getMessage());
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                return new EnumResolver(cls_enumClass, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, cls_enumClass), zIsEnabled, _isIntType(annotatedMember.getRawType()));
            }
        }
    }

    public CompactStringObjectMap constructLookup() {
        return CompactStringObjectMap.construct(this._enumsById);
    }

    protected static Enum<?>[] _enumConstants(Class<?> cls) {
        Enum<?>[] enumConstants = _enumClass(cls).getEnumConstants();
        if (enumConstants != null) {
            return enumConstants;
        }
        StringBuilder sb = new StringBuilder("No enum constants for class ");
        sb.append(cls.getName());
        throw new IllegalArgumentException(sb.toString());
    }

    protected static Enum<?> _enumDefault(AnnotationIntrospector annotationIntrospector, Class<?> cls) {
        if (annotationIntrospector != null) {
            return annotationIntrospector.findDefaultEnumValue(_enumClass(cls));
        }
        return null;
    }

    protected static boolean _isIntType(Class<?> cls) {
        if (cls.isPrimitive()) {
            cls = ClassUtil.wrapperType(cls);
        }
        return cls == Long.class || cls == Integer.class || cls == Short.class || cls == Byte.class;
    }

    public Enum<?> findEnum(String str) {
        Enum<?> r0 = this._enumsById.get(str);
        return (r0 == null && this._isIgnoreCase) ? _findEnumCaseInsensitive(str) : r0;
    }

    protected Enum<?> _findEnumCaseInsensitive(String str) {
        for (Map.Entry<String, Enum<?>> entry : this._enumsById.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public Enum<?> getDefaultValue() {
        return this._defaultValue;
    }

    public Enum<?>[] getRawEnums() {
        return this._enums;
    }

    public Collection<String> getEnumIds() {
        return this._enumsById.keySet();
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public boolean isFromIntValue() {
        return this._isFromIntValue;
    }
}
