package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleKeyDeserializers implements KeyDeserializers, Serializable {
    protected HashMap<ClassKey, KeyDeserializer> _classMappings = null;

    @Override // com.fasterxml.jackson.databind.deser.KeyDeserializers
    public KeyDeserializer findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        HashMap<ClassKey, KeyDeserializer> map = this._classMappings;
        if (map == null) {
            return null;
        }
        return map.get(new ClassKey(javaType.getRawClass()));
    }
}
