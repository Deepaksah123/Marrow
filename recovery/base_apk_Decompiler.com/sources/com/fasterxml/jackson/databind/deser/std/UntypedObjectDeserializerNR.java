package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@JacksonStdImpl
final class UntypedObjectDeserializerNR extends StdDeserializer<Object> {
    protected static final Object[] NO_OBJECTS = new Object[0];
    public static final UntypedObjectDeserializerNR std = new UntypedObjectDeserializerNR();
    protected final boolean _nonMerging;

    public UntypedObjectDeserializerNR() {
        this(false);
    }

    protected UntypedObjectDeserializerNR(boolean z) {
        super((Class<?>) Object.class);
        this._nonMerging = z;
    }

    public static UntypedObjectDeserializerNR instance(boolean z) {
        if (z) {
            return new UntypedObjectDeserializerNR(true);
        }
        return std;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        if (this._nonMerging) {
            return Boolean.FALSE;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.currentTokenId()) {
            case 1:
                return _deserializeNR(jsonParser, deserializationContext, Scope.rootObjectScope(deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)));
            case 2:
                return Scope.emptyMap();
            case 3:
                return _deserializeNR(jsonParser, deserializationContext, Scope.rootArrayScope());
            case 4:
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            case 5:
                return _deserializeObjectAtName(jsonParser, deserializationContext);
            case 6:
                return jsonParser.getText();
            case 7:
                if (deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS)) {
                    return _coerceIntegral(jsonParser, deserializationContext);
                }
                return jsonParser.getNumberValue();
            case 8:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.getDecimalValue();
                }
                return jsonParser.getNumberValue();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1 || iCurrentTokenId == 3 || iCurrentTokenId == 5) {
            return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
        }
        return _deserializeAnyScalar(jsonParser, deserializationContext, jsonParser.currentTokenId());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object deserialize(com.fasterxml.jackson.core.JsonParser r5, com.fasterxml.jackson.databind.DeserializationContext r6, java.lang.Object r7) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r4._nonMerging
            if (r0 == 0) goto L9
            java.lang.Object r4 = r4.deserialize(r5, r6)
            return r4
        L9:
            int r0 = r5.currentTokenId()
            r1 = 1
            if (r0 == r1) goto L3c
            r1 = 2
            if (r0 == r1) goto L72
            r1 = 3
            if (r0 == r1) goto L1d
            r1 = 4
            if (r0 == r1) goto L72
            r1 = 5
            if (r0 == r1) goto L44
            goto L6d
        L1d:
            com.fasterxml.jackson.core.JsonToken r0 = r5.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r0 == r1) goto L72
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L6d
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
        L2c:
            java.lang.Object r1 = r4.deserialize(r5, r6)
            r0.add(r1)
            com.fasterxml.jackson.core.JsonToken r1 = r5.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r1 != r2) goto L2c
            goto L72
        L3c:
            com.fasterxml.jackson.core.JsonToken r0 = r5.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L72
        L44:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L6d
            r0 = r7
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = r5.currentName()
        L4f:
            r5.nextToken()
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L5d
            java.lang.Object r3 = r4.deserialize(r5, r6, r2)
            goto L61
        L5d:
            java.lang.Object r3 = r4.deserialize(r5, r6)
        L61:
            if (r3 == r2) goto L66
            r0.put(r1, r3)
        L66:
            java.lang.String r1 = r5.nextFieldName()
            if (r1 != 0) goto L4f
            goto L72
        L6d:
            java.lang.Object r4 = r4.deserialize(r5, r6)
            return r4
        L72:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }

    private Object _deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj_deserializeNR;
        Scope scopeRootObjectScope = Scope.rootObjectScope(deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES));
        String strCurrentName = jsonParser.currentName();
        while (strCurrentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == null) {
                jsonTokenNextToken = JsonToken.NOT_AVAILABLE;
            }
            int iId = jsonTokenNextToken.id();
            if (iId == 1) {
                obj_deserializeNR = _deserializeNR(jsonParser, deserializationContext, scopeRootObjectScope.childObject());
            } else {
                if (iId == 2) {
                    return scopeRootObjectScope.finishRootObject();
                }
                if (iId == 3) {
                    obj_deserializeNR = _deserializeNR(jsonParser, deserializationContext, scopeRootObjectScope.childArray());
                } else {
                    obj_deserializeNR = _deserializeAnyScalar(jsonParser, deserializationContext, jsonTokenNextToken.id());
                }
            }
            scopeRootObjectScope.putValue(strCurrentName, obj_deserializeNR);
            strCurrentName = jsonParser.nextFieldName();
        }
        return scopeRootObjectScope.finishRootObject();
    }

    private Object _deserializeNR(JsonParser jsonParser, DeserializationContext deserializationContext, Scope scope) throws IOException {
        Object text;
        Object text2;
        boolean zHasSomeOfFeatures = deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS);
        boolean zIsEnabled = deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        Scope scopeFinishBranchObject = scope;
        while (true) {
            if (scopeFinishBranchObject.isObject()) {
                String strNextFieldName = jsonParser.nextFieldName();
                while (true) {
                    if (strNextFieldName != null) {
                        JsonToken jsonTokenNextToken = jsonParser.nextToken();
                        if (jsonTokenNextToken == null) {
                            jsonTokenNextToken = JsonToken.NOT_AVAILABLE;
                        }
                        int iId = jsonTokenNextToken.id();
                        if (iId == 1) {
                            scopeFinishBranchObject = scopeFinishBranchObject.childObject(strNextFieldName);
                        } else if (iId == 3) {
                            scopeFinishBranchObject = scopeFinishBranchObject.childArray(strNextFieldName);
                        } else {
                            switch (iId) {
                                case 6:
                                    text = jsonParser.getText();
                                    break;
                                case 7:
                                    text = !zHasSomeOfFeatures ? jsonParser.getNumberValue() : _coerceIntegral(jsonParser, deserializationContext);
                                    break;
                                case 8:
                                    text = !deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.getNumberValue() : jsonParser.getDecimalValue();
                                    break;
                                case 9:
                                    text = Boolean.TRUE;
                                    break;
                                case 10:
                                    text = Boolean.FALSE;
                                    break;
                                case 11:
                                    text = null;
                                    break;
                                case 12:
                                    text = jsonParser.getEmbeddedObject();
                                    break;
                                default:
                                    return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                            }
                            scopeFinishBranchObject.putValue(strNextFieldName, text);
                        }
                        strNextFieldName = jsonParser.nextFieldName();
                    } else {
                        if (scopeFinishBranchObject == scope) {
                            return scopeFinishBranchObject.finishRootObject();
                        }
                        scopeFinishBranchObject = scopeFinishBranchObject.finishBranchObject();
                    }
                }
            } else {
                while (true) {
                    JsonToken jsonTokenNextToken2 = jsonParser.nextToken();
                    if (jsonTokenNextToken2 == null) {
                        jsonTokenNextToken2 = JsonToken.NOT_AVAILABLE;
                    }
                    switch (jsonTokenNextToken2.id()) {
                        case 1:
                            scopeFinishBranchObject = scopeFinishBranchObject.childObject();
                            continue;
                        case 2:
                        case 5:
                        default:
                            return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                        case 3:
                            scopeFinishBranchObject = scopeFinishBranchObject.childArray();
                            continue;
                        case 4:
                            if (scopeFinishBranchObject == scope) {
                                return scopeFinishBranchObject.finishRootArray(zIsEnabled);
                            }
                            scopeFinishBranchObject = scopeFinishBranchObject.finishBranchArray(zIsEnabled);
                            continue;
                            break;
                        case 6:
                            text2 = jsonParser.getText();
                            break;
                        case 7:
                            text2 = !zHasSomeOfFeatures ? jsonParser.getNumberValue() : _coerceIntegral(jsonParser, deserializationContext);
                            break;
                        case 8:
                            text2 = !deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.getNumberValue() : jsonParser.getDecimalValue();
                            break;
                        case 9:
                            text2 = Boolean.TRUE;
                            break;
                        case 10:
                            text2 = Boolean.FALSE;
                            break;
                        case 11:
                            text2 = null;
                            break;
                        case 12:
                            text2 = jsonParser.getEmbeddedObject();
                            break;
                    }
                    scopeFinishBranchObject.addValue(text2);
                }
            }
        }
    }

    private Object _deserializeAnyScalar(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
        switch (i) {
            case 6:
                return jsonParser.getText();
            case 7:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                    return jsonParser.getBigIntegerValue();
                }
                return jsonParser.getNumberValue();
            case 8:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.getDecimalValue();
                }
                return jsonParser.getNumberValue();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
    }

    static final class Scope {
        private Scope _child;
        private String _deferredKey;
        private boolean _isObject;
        private List<Object> _list;
        private Map<String, Object> _map;
        private final Scope _parent;
        private boolean _squashDups;

        private Scope(Scope scope) {
            this._parent = scope;
            this._isObject = false;
            this._squashDups = false;
        }

        private Scope(Scope scope, boolean z, boolean z2) {
            this._parent = scope;
            this._isObject = z;
            this._squashDups = z2;
        }

        public static Scope rootObjectScope(boolean z) {
            return new Scope(null, true, z);
        }

        public static Scope rootArrayScope() {
            return new Scope(null);
        }

        private Scope resetAsArray() {
            this._isObject = false;
            return this;
        }

        private Scope resetAsObject(boolean z) {
            this._isObject = true;
            this._squashDups = z;
            return this;
        }

        public final Scope childObject() {
            Scope scope = this._child;
            if (scope == null) {
                return new Scope(this, true, this._squashDups);
            }
            return scope.resetAsObject(this._squashDups);
        }

        public final Scope childObject(String str) {
            this._deferredKey = str;
            Scope scope = this._child;
            if (scope == null) {
                return new Scope(this, true, this._squashDups);
            }
            return scope.resetAsObject(this._squashDups);
        }

        public final Scope childArray() {
            Scope scope = this._child;
            if (scope == null) {
                return new Scope(this);
            }
            return scope.resetAsArray();
        }

        public final Scope childArray(String str) {
            this._deferredKey = str;
            Scope scope = this._child;
            if (scope == null) {
                return new Scope(this);
            }
            return scope.resetAsArray();
        }

        public final boolean isObject() {
            return this._isObject;
        }

        public final void putValue(String str, Object obj) {
            if (this._squashDups) {
                _putValueHandleDups(str, obj);
                return;
            }
            if (this._map == null) {
                this._map = new LinkedHashMap();
            }
            this._map.put(str, obj);
        }

        public final Scope putDeferredValue(Object obj) {
            String str = (String) Objects.requireNonNull(this._deferredKey);
            this._deferredKey = null;
            if (this._squashDups) {
                _putValueHandleDups(str, obj);
                return this;
            }
            if (this._map == null) {
                this._map = new LinkedHashMap();
            }
            this._map.put(str, obj);
            return this;
        }

        public final void addValue(Object obj) {
            if (this._list == null) {
                this._list = new ArrayList();
            }
            this._list.add(obj);
        }

        public final Object finishRootObject() {
            Map<String, Object> map = this._map;
            return map == null ? emptyMap() : map;
        }

        public final Scope finishBranchObject() {
            Object linkedHashMap = this._map;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            } else {
                this._map = null;
            }
            if (this._parent.isObject()) {
                return this._parent.putDeferredValue(linkedHashMap);
            }
            this._parent.addValue(linkedHashMap);
            return this._parent;
        }

        public final Object finishRootArray(boolean z) {
            List<Object> list = this._list;
            if (list != null) {
                return z ? list.toArray(UntypedObjectDeserializerNR.NO_OBJECTS) : list;
            }
            if (z) {
                return UntypedObjectDeserializerNR.NO_OBJECTS;
            }
            return emptyList();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Scope finishBranchArray(boolean z) {
            Object objEmptyList;
            List<Object> list = this._list;
            Object array = list;
            if (list != null) {
                if (z) {
                    array = list.toArray(UntypedObjectDeserializerNR.NO_OBJECTS);
                }
                this._list = null;
                objEmptyList = array;
            } else if (z) {
                objEmptyList = UntypedObjectDeserializerNR.NO_OBJECTS;
            } else {
                objEmptyList = emptyList();
            }
            if (this._parent.isObject()) {
                return this._parent.putDeferredValue(objEmptyList);
            }
            this._parent.addValue(objEmptyList);
            return this._parent;
        }

        private void _putValueHandleDups(String str, Object obj) {
            Map<String, Object> map = this._map;
            if (map == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this._map = linkedHashMap;
                linkedHashMap.put(str, obj);
                return;
            }
            Object objPut = map.put(str, obj);
            if (objPut != null) {
                if (objPut instanceof List) {
                    ((List) objPut).add(obj);
                    this._map.put(str, objPut);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(objPut);
                    arrayList.add(obj);
                    this._map.put(str, arrayList);
                }
            }
        }

        public static Map<String, Object> emptyMap() {
            return new LinkedHashMap(2);
        }

        public static List<Object> emptyList() {
            return new ArrayList(2);
        }
    }
}
