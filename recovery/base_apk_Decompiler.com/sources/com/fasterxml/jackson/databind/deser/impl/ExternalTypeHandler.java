package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ExternalTypeHandler {
    private final JavaType _beanType;
    private final Map<String, Object> _nameToPropertyIndex;
    private final ExtTypedProperty[] _properties;
    private final TokenBuffer[] _tokens;
    private final String[] _typeIds;

    protected ExternalTypeHandler(JavaType javaType, ExtTypedProperty[] extTypedPropertyArr, Map<String, Object> map, String[] strArr, TokenBuffer[] tokenBufferArr) {
        this._beanType = javaType;
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = map;
        this._typeIds = strArr;
        this._tokens = tokenBufferArr;
    }

    protected ExternalTypeHandler(ExternalTypeHandler externalTypeHandler) {
        this._beanType = externalTypeHandler._beanType;
        ExtTypedProperty[] extTypedPropertyArr = externalTypeHandler._properties;
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = externalTypeHandler._nameToPropertyIndex;
        int length = extTypedPropertyArr.length;
        this._typeIds = new String[length];
        this._tokens = new TokenBuffer[length];
    }

    public static Builder builder(JavaType javaType) {
        return new Builder(javaType);
    }

    public ExternalTypeHandler start() {
        return new ExternalTypeHandler(this);
    }

    public boolean handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this._nameToPropertyIndex.get(str);
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        String text = jsonParser.getText();
        if (obj2 instanceof List) {
            Iterator it = ((List) obj2).iterator();
            while (it.hasNext()) {
                if (_handleTypePropertyValue(jsonParser, deserializationContext, str, obj, text, ((Integer) it.next()).intValue())) {
                    z = true;
                }
            }
            return z;
        }
        return _handleTypePropertyValue(jsonParser, deserializationContext, str, obj, text, ((Integer) obj2).intValue());
    }

    private final boolean _handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i) throws IOException {
        if (!this._properties[i].hasTypePropertyName(str)) {
            return false;
        }
        if (obj != null && this._tokens[i] != null) {
            _deserializeAndSet(jsonParser, deserializationContext, obj, i, str2);
            this._tokens[i] = null;
            return true;
        }
        this._typeIds[i] = str2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handlePropertyValue(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11, java.lang.String r12, java.lang.Object r13) throws java.io.IOException {
        /*
            r9 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9._nameToPropertyIndex
            java.lang.Object r0 = r0.get(r12)
            if (r0 != 0) goto La
            r9 = 0
            return r9
        La:
            boolean r1 = r0 instanceof java.util.List
            r2 = 1
            if (r1 == 0) goto L6f
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r13 = r0.iterator()
            java.lang.Object r0 = r13.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r1 = r9._properties
            int r3 = r0.intValue()
            r1 = r1[r3]
            boolean r12 = r1.hasTypePropertyName(r12)
            if (r12 == 0) goto L4d
            java.lang.String r11 = r10.getText()
            r10.skipChildren()
            java.lang.String[] r10 = r9._typeIds
            int r12 = r0.intValue()
            r10[r12] = r11
        L38:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto L6e
            java.lang.String[] r10 = r9._typeIds
            java.lang.Object r12 = r13.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r10[r12] = r11
            goto L38
        L4d:
            com.fasterxml.jackson.databind.util.TokenBuffer r10 = r11.bufferAsCopyOfValue(r10)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r11 = r9._tokens
            int r12 = r0.intValue()
            r11[r12] = r10
        L59:
            boolean r11 = r13.hasNext()
            if (r11 == 0) goto L6e
            com.fasterxml.jackson.databind.util.TokenBuffer[] r11 = r9._tokens
            java.lang.Object r12 = r13.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11[r12] = r10
            goto L59
        L6e:
            return r2
        L6f:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r1 = r9._properties
            r1 = r1[r0]
            boolean r12 = r1.hasTypePropertyName(r12)
            if (r12 == 0) goto L93
            java.lang.String[] r12 = r9._typeIds
            java.lang.String r1 = r10.getValueAsString()
            r12[r0] = r1
            r10.skipChildren()
            if (r13 == 0) goto Lb6
            com.fasterxml.jackson.databind.util.TokenBuffer[] r12 = r9._tokens
            r12 = r12[r0]
            if (r12 == 0) goto Lb6
            goto La3
        L93:
            com.fasterxml.jackson.databind.util.TokenBuffer r12 = r11.bufferAsCopyOfValue(r10)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r1 = r9._tokens
            r1[r0] = r12
            if (r13 == 0) goto Lb6
            java.lang.String[] r12 = r9._typeIds
            r12 = r12[r0]
            if (r12 == 0) goto Lb6
        La3:
            java.lang.String[] r12 = r9._typeIds
            r8 = r12[r0]
            r1 = 0
            r12[r0] = r1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r7 = r0
            r3._deserializeAndSet(r4, r5, r6, r7, r8)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r9 = r9._tokens
            r9[r0] = r1
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object complete(com.fasterxml.jackson.core.JsonParser r9, com.fasterxml.jackson.databind.DeserializationContext r10, java.lang.Object r11) throws java.io.IOException {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r0 = r8._properties
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto Lb5
            java.lang.String[] r2 = r8._typeIds
            r2 = r2[r1]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r3 = r8._properties
            r3 = r3[r1]
            if (r2 != 0) goto L76
            com.fasterxml.jackson.databind.util.TokenBuffer[] r4 = r8._tokens
            r4 = r4[r1]
            if (r4 == 0) goto Lb1
            com.fasterxml.jackson.core.JsonToken r5 = r4.firstToken()
            boolean r5 = r5.isScalarValue()
            if (r5 == 0) goto L3a
            com.fasterxml.jackson.core.JsonParser r4 = r4.asParser(r9)
            r4.nextToken()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r5 = r3.getProperty()
            com.fasterxml.jackson.databind.JavaType r6 = r5.getType()
            java.lang.Object r4 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(r4, r10, r6)
            if (r4 == 0) goto L3a
            r5.set(r11, r4)
            goto Lb1
        L3a:
            boolean r4 = r3.hasDefaultType()
            if (r4 != 0) goto L58
            com.fasterxml.jackson.databind.JavaType r4 = r8._beanType
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r5 = r3.getProperty()
            java.lang.String r5 = r5.getName()
            java.lang.String r3 = r3.getTypePropertyName()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r6 = "Missing external type id property '%s' (and no 'defaultImpl' specified)"
            r10.reportPropertyInputMismatch(r4, r5, r6, r3)
            goto La8
        L58:
            java.lang.String r2 = r3.getDefaultTypeId()
            if (r2 != 0) goto La8
            com.fasterxml.jackson.databind.JavaType r4 = r8._beanType
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r5 = r3.getProperty()
            java.lang.String r5 = r5.getName()
            java.lang.String r3 = r3.getTypePropertyName()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r6 = "Invalid default type id for property '%s': `null` returned by TypeIdResolver"
            r10.reportPropertyInputMismatch(r4, r5, r6, r3)
            goto La8
        L76:
            com.fasterxml.jackson.databind.util.TokenBuffer[] r4 = r8._tokens
            r4 = r4[r1]
            if (r4 != 0) goto La8
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r8 = r3.getProperty()
            boolean r9 = r8.isRequired()
            if (r9 != 0) goto L8e
            com.fasterxml.jackson.databind.DeserializationFeature r9 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY
            boolean r9 = r10.isEnabled(r9)
            if (r9 == 0) goto Lb5
        L8e:
            java.lang.Class r9 = r11.getClass()
            java.lang.String r0 = r8.getName()
            java.lang.String r8 = r8.getName()
            java.lang.String r1 = r3.getTypePropertyName()
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r1}
            java.lang.String r1 = "Missing property '%s' for external type id '%s'"
            r10.reportPropertyInputMismatch(r9, r0, r1, r8)
            return r11
        La8:
            r7 = r2
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r1
            r2._deserializeAndSet(r3, r4, r5, r6, r7)
        Lb1:
            int r1 = r1 + 1
            goto L4
        Lb5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object complete(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer r13, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator):java.lang.Object");
    }

    protected final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, int i, String str) throws IOException {
        JsonParser jsonParserAsParser = this._tokens[i].asParser(jsonParser);
        if (jsonParserAsParser.nextToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        TokenBuffer tokenBufferBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        tokenBufferBufferForInputBuffering.writeStartArray();
        tokenBufferBufferForInputBuffering.writeString(str);
        tokenBufferBufferForInputBuffering.copyCurrentStructure(jsonParserAsParser);
        tokenBufferBufferForInputBuffering.writeEndArray();
        JsonParser jsonParserAsParser2 = tokenBufferBufferForInputBuffering.asParser(jsonParser);
        jsonParserAsParser2.nextToken();
        return this._properties[i].getProperty().deserialize(jsonParserAsParser2, deserializationContext);
    }

    protected final Object _deserializeMissingToken(JsonParser jsonParser, DeserializationContext deserializationContext, int i, String str) throws IOException {
        TokenBuffer tokenBufferBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        tokenBufferBufferForInputBuffering.writeStartArray();
        tokenBufferBufferForInputBuffering.writeString(str);
        tokenBufferBufferForInputBuffering.writeEndArray();
        JsonParser jsonParserAsParser = tokenBufferBufferForInputBuffering.asParser(jsonParser);
        jsonParserAsParser.nextToken();
        return this._properties[i].getProperty().deserialize(jsonParserAsParser, deserializationContext);
    }

    protected final void _deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i, String str) throws IOException {
        if (str == null) {
            deserializationContext.reportInputMismatch(this._beanType, "Internal error in external Type Id handling: `null` type id passed", new Object[0]);
        }
        JsonParser jsonParserAsParser = this._tokens[i].asParser(jsonParser);
        if (jsonParserAsParser.nextToken() == JsonToken.VALUE_NULL) {
            this._properties[i].getProperty().set(obj, null);
            return;
        }
        TokenBuffer tokenBufferBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        tokenBufferBufferForInputBuffering.writeStartArray();
        tokenBufferBufferForInputBuffering.writeString(str);
        tokenBufferBufferForInputBuffering.copyCurrentStructure(jsonParserAsParser);
        tokenBufferBufferForInputBuffering.writeEndArray();
        JsonParser jsonParserAsParser2 = tokenBufferBufferForInputBuffering.asParser(jsonParser);
        jsonParserAsParser2.nextToken();
        this._properties[i].getProperty().deserializeAndSet(jsonParserAsParser2, deserializationContext, obj);
    }

    public static class Builder {
        private final JavaType _beanType;
        private final List<ExtTypedProperty> _properties = new ArrayList();
        private final Map<String, Object> _nameToPropertyIndex = new HashMap();

        protected Builder(JavaType javaType) {
            this._beanType = javaType;
        }

        public void addExternal(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            Integer numValueOf = Integer.valueOf(this._properties.size());
            this._properties.add(new ExtTypedProperty(settableBeanProperty, typeDeserializer));
            _addPropertyIndex(settableBeanProperty.getName(), numValueOf);
            _addPropertyIndex(typeDeserializer.getPropertyName(), numValueOf);
        }

        private void _addPropertyIndex(String str, Integer num) {
            Object obj = this._nameToPropertyIndex.get(str);
            if (obj == null) {
                this._nameToPropertyIndex.put(str, num);
                return;
            }
            if (obj instanceof List) {
                ((List) obj).add(num);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj);
            linkedList.add(num);
            this._nameToPropertyIndex.put(str, linkedList);
        }

        public ExternalTypeHandler build(BeanPropertyMap beanPropertyMap) {
            int size = this._properties.size();
            ExtTypedProperty[] extTypedPropertyArr = new ExtTypedProperty[size];
            for (int i = 0; i < size; i++) {
                ExtTypedProperty extTypedProperty = this._properties.get(i);
                SettableBeanProperty settableBeanPropertyFind = beanPropertyMap.find(extTypedProperty.getTypePropertyName());
                if (settableBeanPropertyFind != null) {
                    extTypedProperty.linkTypeProperty(settableBeanPropertyFind);
                }
                extTypedPropertyArr[i] = extTypedProperty;
            }
            return new ExternalTypeHandler(this._beanType, extTypedPropertyArr, this._nameToPropertyIndex, null, null);
        }
    }

    static final class ExtTypedProperty {
        private final SettableBeanProperty _property;
        private final TypeDeserializer _typeDeserializer;
        private SettableBeanProperty _typeProperty;
        private final String _typePropertyName;

        public ExtTypedProperty(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            this._property = settableBeanProperty;
            this._typeDeserializer = typeDeserializer;
            this._typePropertyName = typeDeserializer.getPropertyName();
        }

        public final void linkTypeProperty(SettableBeanProperty settableBeanProperty) {
            this._typeProperty = settableBeanProperty;
        }

        public final boolean hasTypePropertyName(String str) {
            return str.equals(this._typePropertyName);
        }

        public final boolean hasDefaultType() {
            return this._typeDeserializer.hasDefaultImpl();
        }

        public final String getDefaultTypeId() {
            Class<?> defaultImpl = this._typeDeserializer.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this._typeDeserializer.getTypeIdResolver().idFromValueAndType(null, defaultImpl);
        }

        public final String getTypePropertyName() {
            return this._typePropertyName;
        }

        public final SettableBeanProperty getProperty() {
            return this._property;
        }

        public final SettableBeanProperty getTypeProperty() {
            return this._typeProperty;
        }
    }
}
