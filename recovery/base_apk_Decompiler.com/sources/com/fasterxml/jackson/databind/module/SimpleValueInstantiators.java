package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleValueInstantiators extends ValueInstantiators.Base implements Serializable {
    protected HashMap<ClassKey, ValueInstantiator> _classMappings = new HashMap<>();

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiators.Base, com.fasterxml.jackson.databind.deser.ValueInstantiators
    public ValueInstantiator findValueInstantiator(DeserializationConfig deserializationConfig, BeanDescription beanDescription, ValueInstantiator valueInstantiator) {
        ValueInstantiator valueInstantiator2 = this._classMappings.get(new ClassKey(beanDescription.getBeanClass()));
        return valueInstantiator2 == null ? valueInstantiator : valueInstantiator2;
    }
}
