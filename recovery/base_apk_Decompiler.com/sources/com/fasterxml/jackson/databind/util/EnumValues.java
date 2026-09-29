package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.EnumNamingStrategy;
import com.fasterxml.jackson.databind.cfg.EnumFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EnumValues implements Serializable {
    private final Class<Enum<?>> _enumClass;
    private final SerializableString[] _textual;
    private final Enum<?>[] _values;

    private EnumValues(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        this._enumClass = cls;
        this._values = cls.getEnumConstants();
        this._textual = serializableStringArr;
    }

    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> clsFindEnumType = ClassUtil.findEnumType(cls);
        Enum<?>[] enumArr = (Enum[]) clsFindEnumType.getEnumConstants();
        if (enumArr == null) {
            StringBuilder sb = new StringBuilder("Cannot determine enum constants for Class ");
            sb.append(cls.getName());
            throw new IllegalArgumentException(sb.toString());
        }
        String[] strArrFindEnumValues = mapperConfig.getAnnotationIntrospector().findEnumValues(clsFindEnumType, enumArr, new String[enumArr.length]);
        SerializableString[] serializableStringArr = new SerializableString[enumArr.length];
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            Enum<?> r5 = enumArr[i];
            String lowerCase = strArrFindEnumValues[i];
            if (lowerCase == null) {
                lowerCase = r5.name();
            }
            if (mapperConfig.isEnabled(EnumFeature.WRITE_ENUMS_TO_LOWERCASE)) {
                lowerCase = lowerCase.toLowerCase();
            }
            serializableStringArr[r5.ordinal()] = mapperConfig.compileString(lowerCase);
        }
        return construct(cls, serializableStringArr);
    }

    public static EnumValues constructUsingEnumNamingStrategy(MapperConfig<?> mapperConfig, Class<Enum<?>> cls, EnumNamingStrategy enumNamingStrategy) {
        Enum[] enumArr = (Enum[]) ClassUtil.findEnumType(cls).getEnumConstants();
        if (enumArr == null) {
            StringBuilder sb = new StringBuilder("Cannot determine enum constants for Class ");
            sb.append(cls.getName());
            throw new IllegalArgumentException(sb.toString());
        }
        ArrayList arrayList = new ArrayList(enumArr.length);
        for (Enum r0 : enumArr) {
            arrayList.add(enumNamingStrategy.convertEnumToExternalName(r0.name()));
        }
        return construct(mapperConfig, cls, arrayList);
    }

    public static EnumValues construct(MapperConfig<?> mapperConfig, Class<Enum<?>> cls, List<String> list) {
        int size = list.size();
        SerializableString[] serializableStringArr = new SerializableString[size];
        for (int i = 0; i < size; i++) {
            serializableStringArr[i] = mapperConfig.compileString(list.get(i));
        }
        return construct(cls, serializableStringArr);
    }

    public static EnumValues construct(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        return new EnumValues(cls, serializableStringArr);
    }

    public final SerializableString serializedValueFor(Enum<?> r1) {
        return this._textual[r1.ordinal()];
    }

    public final Collection<SerializableString> values() {
        return Arrays.asList(this._textual);
    }

    public final List<Enum<?>> enums() {
        return Arrays.asList(this._values);
    }

    public final Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }
}
