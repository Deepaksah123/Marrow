package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
@JacksonStdImpl
public class StdValueInstantiator extends ValueInstantiator implements Serializable {
    protected SettableBeanProperty[] _arrayDelegateArguments;
    protected AnnotatedWithParams _arrayDelegateCreator;
    protected JavaType _arrayDelegateType;
    protected SettableBeanProperty[] _constructorArguments;
    protected AnnotatedWithParams _defaultCreator;
    protected SettableBeanProperty[] _delegateArguments;
    protected AnnotatedWithParams _delegateCreator;
    protected JavaType _delegateType;
    protected AnnotatedWithParams _fromBigDecimalCreator;
    protected AnnotatedWithParams _fromBigIntegerCreator;
    protected AnnotatedWithParams _fromBooleanCreator;
    protected AnnotatedWithParams _fromDoubleCreator;
    protected AnnotatedWithParams _fromIntCreator;
    protected AnnotatedWithParams _fromLongCreator;
    protected AnnotatedWithParams _fromStringCreator;
    protected final Class<?> _valueClass;
    protected final String _valueTypeDesc;
    public AnnotatedWithParams _withArgsCreator;

    public StdValueInstantiator(DeserializationConfig deserializationConfig, JavaType javaType) {
        this._valueTypeDesc = javaType == null ? "UNKNOWN TYPE" : javaType.toString();
        this._valueClass = javaType == null ? Object.class : javaType.getRawClass();
    }

    public StdValueInstantiator(StdValueInstantiator stdValueInstantiator) {
        this._valueTypeDesc = stdValueInstantiator._valueTypeDesc;
        this._valueClass = stdValueInstantiator._valueClass;
        this._defaultCreator = stdValueInstantiator._defaultCreator;
        this._constructorArguments = stdValueInstantiator._constructorArguments;
        this._withArgsCreator = stdValueInstantiator._withArgsCreator;
        this._delegateType = stdValueInstantiator._delegateType;
        this._delegateCreator = stdValueInstantiator._delegateCreator;
        this._delegateArguments = stdValueInstantiator._delegateArguments;
        this._arrayDelegateType = stdValueInstantiator._arrayDelegateType;
        this._arrayDelegateCreator = stdValueInstantiator._arrayDelegateCreator;
        this._arrayDelegateArguments = stdValueInstantiator._arrayDelegateArguments;
        this._fromStringCreator = stdValueInstantiator._fromStringCreator;
        this._fromIntCreator = stdValueInstantiator._fromIntCreator;
        this._fromLongCreator = stdValueInstantiator._fromLongCreator;
        this._fromBigIntegerCreator = stdValueInstantiator._fromBigIntegerCreator;
        this._fromDoubleCreator = stdValueInstantiator._fromDoubleCreator;
        this._fromBigDecimalCreator = stdValueInstantiator._fromBigDecimalCreator;
        this._fromBooleanCreator = stdValueInstantiator._fromBooleanCreator;
    }

    public void configureFromObjectSettings(AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr, AnnotatedWithParams annotatedWithParams3, SettableBeanProperty[] settableBeanPropertyArr2) {
        this._defaultCreator = annotatedWithParams;
        this._delegateCreator = annotatedWithParams2;
        this._delegateType = javaType;
        this._delegateArguments = settableBeanPropertyArr;
        this._withArgsCreator = annotatedWithParams3;
        this._constructorArguments = settableBeanPropertyArr2;
    }

    public void configureFromArraySettings(AnnotatedWithParams annotatedWithParams, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr) {
        this._arrayDelegateCreator = annotatedWithParams;
        this._arrayDelegateType = javaType;
        this._arrayDelegateArguments = settableBeanPropertyArr;
    }

    public void configureFromStringCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromStringCreator = annotatedWithParams;
    }

    public void configureFromIntCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromIntCreator = annotatedWithParams;
    }

    public void configureFromLongCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromLongCreator = annotatedWithParams;
    }

    public void configureFromBigIntegerCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromBigIntegerCreator = annotatedWithParams;
    }

    public void configureFromDoubleCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromDoubleCreator = annotatedWithParams;
    }

    public void configureFromBigDecimalCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromBigDecimalCreator = annotatedWithParams;
    }

    public void configureFromBooleanCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromBooleanCreator = annotatedWithParams;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public String getValueTypeDesc() {
        return this._valueTypeDesc;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Class<?> getValueClass() {
        return this._valueClass;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromString() {
        return this._fromStringCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromInt() {
        return this._fromIntCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromLong() {
        return this._fromLongCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromBigInteger() {
        return this._fromBigIntegerCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromDouble() {
        return this._fromDoubleCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromBigDecimal() {
        return this._fromBigDecimalCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromBoolean() {
        return this._fromBooleanCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateUsingDefault() {
        return this._defaultCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateUsingDelegate() {
        return this._delegateType != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateUsingArrayDelegate() {
        return this._arrayDelegateType != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromObjectWith() {
        return this._withArgsCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canInstantiate() {
        return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public JavaType getDelegateType(DeserializationConfig deserializationConfig) {
        return this._delegateType;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public JavaType getArrayDelegateType(DeserializationConfig deserializationConfig) {
        return this._arrayDelegateType;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        return this._constructorArguments;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
        AnnotatedWithParams annotatedWithParams = this._defaultCreator;
        if (annotatedWithParams == null) {
            return super.createUsingDefault(deserializationContext);
        }
        try {
            return annotatedWithParams.call();
        } catch (Exception e) {
            return deserializationContext.handleInstantiationProblem(this._valueClass, null, this.rewrapCtorProblem(deserializationContext, e));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        AnnotatedWithParams annotatedWithParams = this._withArgsCreator;
        if (annotatedWithParams == null) {
            return super.createFromObjectWith(deserializationContext, objArr);
        }
        try {
            return annotatedWithParams.call(objArr);
        } catch (Exception e) {
            return deserializationContext.handleInstantiationProblem(this._valueClass, objArr, this.rewrapCtorProblem(deserializationContext, e));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createUsingDefaultOrWithoutArguments(DeserializationContext deserializationContext) throws IOException {
        if (this._defaultCreator != null) {
            return createUsingDefault(deserializationContext);
        }
        if (this._withArgsCreator != null) {
            return createFromObjectWith(deserializationContext, new Object[this._constructorArguments.length]);
        }
        return super.createUsingDefaultOrWithoutArguments(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createUsingDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedWithParams annotatedWithParams;
        AnnotatedWithParams annotatedWithParams2 = this._delegateCreator;
        if (annotatedWithParams2 == null && (annotatedWithParams = this._arrayDelegateCreator) != null) {
            return _createUsingDelegate(annotatedWithParams, this._arrayDelegateArguments, deserializationContext, obj);
        }
        return _createUsingDelegate(annotatedWithParams2, this._delegateArguments, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createUsingArrayDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedWithParams annotatedWithParams = this._arrayDelegateCreator;
        if (annotatedWithParams == null && this._delegateCreator != null) {
            return createUsingDelegate(deserializationContext, obj);
        }
        return _createUsingDelegate(annotatedWithParams, this._arrayDelegateArguments, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromString(DeserializationContext deserializationContext, String str) throws IOException {
        AnnotatedWithParams annotatedWithParams = this._fromStringCreator;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.call1(str);
            } catch (Exception e) {
                return deserializationContext.handleInstantiationProblem(this._fromStringCreator.getDeclaringClass(), str, this.rewrapCtorProblem(deserializationContext, e));
            }
        }
        return super.createFromString(deserializationContext, str);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromInt(DeserializationContext deserializationContext, int i) throws IOException {
        if (this._fromIntCreator != null) {
            Integer numValueOf = Integer.valueOf(i);
            try {
                return this._fromIntCreator.call1(numValueOf);
            } catch (Exception e) {
                return deserializationContext.handleInstantiationProblem(this._fromIntCreator.getDeclaringClass(), numValueOf, this.rewrapCtorProblem(deserializationContext, e));
            }
        }
        if (this._fromLongCreator != null) {
            Long lValueOf = Long.valueOf(i);
            try {
                return this._fromLongCreator.call1(lValueOf);
            } catch (Exception e2) {
                return deserializationContext.handleInstantiationProblem(this._fromLongCreator.getDeclaringClass(), lValueOf, this.rewrapCtorProblem(deserializationContext, e2));
            }
        }
        if (this._fromBigIntegerCreator != null) {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(i);
            try {
                return this._fromBigIntegerCreator.call1(bigIntegerValueOf);
            } catch (Exception e3) {
                return deserializationContext.handleInstantiationProblem(this._fromBigIntegerCreator.getDeclaringClass(), bigIntegerValueOf, this.rewrapCtorProblem(deserializationContext, e3));
            }
        }
        return super.createFromInt(deserializationContext, i);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromLong(DeserializationContext deserializationContext, long j) throws IOException {
        if (this._fromLongCreator != null) {
            Long lValueOf = Long.valueOf(j);
            try {
                return this._fromLongCreator.call1(lValueOf);
            } catch (Exception e) {
                return deserializationContext.handleInstantiationProblem(this._fromLongCreator.getDeclaringClass(), lValueOf, this.rewrapCtorProblem(deserializationContext, e));
            }
        }
        if (this._fromBigIntegerCreator != null) {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(j);
            try {
                return this._fromBigIntegerCreator.call1(bigIntegerValueOf);
            } catch (Exception e2) {
                return deserializationContext.handleInstantiationProblem(this._fromBigIntegerCreator.getDeclaringClass(), bigIntegerValueOf, this.rewrapCtorProblem(deserializationContext, e2));
            }
        }
        return super.createFromLong(deserializationContext, j);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromBigInteger(DeserializationContext deserializationContext, BigInteger bigInteger) throws IOException {
        AnnotatedWithParams annotatedWithParams = this._fromBigIntegerCreator;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.call1(bigInteger);
            } catch (Exception e) {
                return deserializationContext.handleInstantiationProblem(this._fromBigIntegerCreator.getDeclaringClass(), bigInteger, this.rewrapCtorProblem(deserializationContext, e));
            }
        }
        return super.createFromBigInteger(deserializationContext, bigInteger);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromDouble(DeserializationContext deserializationContext, double d) throws IOException {
        if (this._fromDoubleCreator != null) {
            Double dValueOf = Double.valueOf(d);
            try {
                return this._fromDoubleCreator.call1(dValueOf);
            } catch (Exception e) {
                return deserializationContext.handleInstantiationProblem(this._fromDoubleCreator.getDeclaringClass(), dValueOf, this.rewrapCtorProblem(deserializationContext, e));
            }
        }
        if (this._fromBigDecimalCreator != null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
            try {
                return this._fromBigDecimalCreator.call1(bigDecimalValueOf);
            } catch (Exception e2) {
                return deserializationContext.handleInstantiationProblem(this._fromBigDecimalCreator.getDeclaringClass(), bigDecimalValueOf, this.rewrapCtorProblem(deserializationContext, e2));
            }
        }
        return super.createFromDouble(deserializationContext, d);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromBigDecimal(DeserializationContext deserializationContext, BigDecimal bigDecimal) throws IOException {
        Double dTryConvertToDouble;
        AnnotatedWithParams annotatedWithParams = this._fromBigDecimalCreator;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.call1(bigDecimal);
            } catch (Exception e) {
                return deserializationContext.handleInstantiationProblem(this._fromBigDecimalCreator.getDeclaringClass(), bigDecimal, this.rewrapCtorProblem(deserializationContext, e));
            }
        }
        if (this._fromDoubleCreator != null && (dTryConvertToDouble = tryConvertToDouble(bigDecimal)) != null) {
            try {
                return this._fromDoubleCreator.call1(dTryConvertToDouble);
            } catch (Exception e2) {
                return deserializationContext.handleInstantiationProblem(this._fromDoubleCreator.getDeclaringClass(), dTryConvertToDouble, this.rewrapCtorProblem(deserializationContext, e2));
            }
        }
        return super.createFromBigDecimal(deserializationContext, bigDecimal);
    }

    static Double tryConvertToDouble(BigDecimal bigDecimal) {
        double dDoubleValue = bigDecimal.doubleValue();
        if (Double.isInfinite(dDoubleValue)) {
            return null;
        }
        return Double.valueOf(dDoubleValue);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromBoolean(DeserializationContext deserializationContext, boolean z) throws IOException {
        if (this._fromBooleanCreator == null) {
            return super.createFromBoolean(deserializationContext, z);
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        try {
            return this._fromBooleanCreator.call1(boolValueOf);
        } catch (Exception e) {
            return deserializationContext.handleInstantiationProblem(this._fromBooleanCreator.getDeclaringClass(), boolValueOf, this.rewrapCtorProblem(deserializationContext, e));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedWithParams getDelegateCreator() {
        return this._delegateCreator;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedWithParams getArrayDelegateCreator() {
        return this._arrayDelegateCreator;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedWithParams getDefaultCreator() {
        return this._defaultCreator;
    }

    protected JsonMappingException wrapAsJsonMappingException(DeserializationContext deserializationContext, Throwable th) {
        if (th instanceof JsonMappingException) {
            return (JsonMappingException) th;
        }
        return deserializationContext.instantiationException(getValueClass(), th);
    }

    protected JsonMappingException rewrapCtorProblem(DeserializationContext deserializationContext, Throwable th) {
        Throwable cause;
        if (((th instanceof ExceptionInInitializerError) || (th instanceof InvocationTargetException)) && (cause = th.getCause()) != null) {
            th = cause;
        }
        return wrapAsJsonMappingException(deserializationContext, th);
    }

    private Object _createUsingDelegate(AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (annotatedWithParams == null) {
            StringBuilder sb = new StringBuilder("No delegate constructor for ");
            sb.append(getValueTypeDesc());
            throw new IllegalStateException(sb.toString());
        }
        try {
            if (settableBeanPropertyArr == null) {
                return annotatedWithParams.call1(obj);
            }
            int length = settableBeanPropertyArr.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty == null) {
                    objArr[i] = obj;
                } else {
                    objArr[i] = deserializationContext.findInjectableValue(settableBeanProperty.getInjectableValueId(), settableBeanProperty, null);
                }
            }
            return annotatedWithParams.call(objArr);
        } catch (Exception e) {
            throw rewrapCtorProblem(deserializationContext, e);
        }
    }
}
