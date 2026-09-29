package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.EnumFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@JacksonStdImpl
public class StdKeyDeserializer extends KeyDeserializer implements Serializable {
    protected final FromStringDeserializer<?> _deser;
    protected final Class<?> _keyClass;
    protected final int _kind;

    public StdKeyDeserializer(int i, Class<?> cls) {
        this(i, cls, null);
    }

    protected StdKeyDeserializer(int i, Class<?> cls, FromStringDeserializer<?> fromStringDeserializer) {
        this._kind = i;
        this._keyClass = cls;
        this._deser = fromStringDeserializer;
    }

    public static StdKeyDeserializer forType(Class<?> cls) {
        int i;
        if (cls == String.class || cls == Object.class || cls == CharSequence.class || cls == Serializable.class) {
            return StringKD.forType(cls);
        }
        if (cls == UUID.class) {
            i = 12;
        } else if (cls == Integer.class) {
            i = 5;
        } else if (cls == Long.class) {
            i = 6;
        } else if (cls == Date.class) {
            i = 10;
        } else if (cls == Calendar.class) {
            i = 11;
        } else if (cls == Boolean.class) {
            i = 1;
        } else if (cls == Byte.class) {
            i = 2;
        } else if (cls == Character.class) {
            i = 4;
        } else if (cls == Short.class) {
            i = 3;
        } else if (cls == Float.class) {
            i = 7;
        } else if (cls == Double.class) {
            i = 8;
        } else if (cls == URI.class) {
            i = 13;
        } else if (cls == URL.class) {
            i = 14;
        } else if (cls == Class.class) {
            i = 15;
        } else {
            if (cls == Locale.class) {
                return new StdKeyDeserializer(9, cls, FromStringDeserializer.findDeserializer(Locale.class));
            }
            if (cls == Currency.class) {
                return new StdKeyDeserializer(16, cls, FromStringDeserializer.findDeserializer(Currency.class));
            }
            if (cls != byte[].class) {
                return null;
            }
            i = 17;
        }
        return new StdKeyDeserializer(i, cls);
    }

    @Override // com.fasterxml.jackson.databind.KeyDeserializer
    public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
        if (str == null) {
            return null;
        }
        try {
            Object obj_parse = _parse(str, deserializationContext);
            if (obj_parse != null) {
                return obj_parse;
            }
            if (ClassUtil.isEnumType(this._keyClass) && deserializationContext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
        } catch (Exception e) {
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation, problem: (%s) %s", e.getClass().getName(), ClassUtil.exceptionMessage(e));
        }
    }

    protected Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
        switch (this._kind) {
            case 1:
                if ("true".equals(str)) {
                    return Boolean.TRUE;
                }
                if ("false".equals(str)) {
                    return Boolean.FALSE;
                }
                return deserializationContext.handleWeirdKey(this._keyClass, str, "value not 'true' or 'false'", new Object[0]);
            case 2:
                int i_parseInt = _parseInt(str);
                if (i_parseInt < -128 || i_parseInt > 255) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                }
                return Byte.valueOf((byte) i_parseInt);
            case 3:
                int i_parseInt2 = _parseInt(str);
                if (i_parseInt2 < -32768 || i_parseInt2 > 32767) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                }
                return Short.valueOf((short) i_parseInt2);
            case 4:
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                return deserializationContext.handleWeirdKey(this._keyClass, str, "can only convert 1-character Strings", new Object[0]);
            case 5:
                return Integer.valueOf(_parseInt(str));
            case 6:
                return Long.valueOf(_parseLong(str));
            case 7:
                return Float.valueOf((float) _parseDouble(str));
            case 8:
                return Double.valueOf(_parseDouble(str));
            case 9:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e) {
                    return this._weirdKey(deserializationContext, str, e);
                }
            case 10:
                return deserializationContext.parseDate(str);
            case 11:
                return deserializationContext.constructCalendar(deserializationContext.parseDate(str));
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e2) {
                    return this._weirdKey(deserializationContext, str, e2);
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e3) {
                    return this._weirdKey(deserializationContext, str, e3);
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e4) {
                    return _weirdKey(deserializationContext, str, e4);
                }
            case 15:
                try {
                    return deserializationContext.findClass(str);
                } catch (Exception unused) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "unable to parse key as Class", new Object[0]);
                }
            case 16:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e5) {
                    return this._weirdKey(deserializationContext, str, e5);
                }
            case 17:
                try {
                    return deserializationContext.getConfig().getBase64Variant().decode(str);
                } catch (IllegalArgumentException e6) {
                    return this._weirdKey(deserializationContext, str, e6);
                }
            default:
                StringBuilder sb = new StringBuilder("Internal error: unknown key type ");
                sb.append(this._keyClass);
                throw new IllegalStateException(sb.toString());
        }
    }

    protected int _parseInt(String str) throws IllegalArgumentException {
        return NumberInput.parseInt(str);
    }

    protected long _parseLong(String str) throws IllegalArgumentException {
        return NumberInput.parseLong(str);
    }

    protected double _parseDouble(String str) throws IllegalArgumentException {
        return NumberInput.parseDouble(str);
    }

    protected Object _weirdKey(DeserializationContext deserializationContext, String str, Exception exc) throws IOException {
        return deserializationContext.handleWeirdKey(this._keyClass, str, "problem: %s", ClassUtil.exceptionMessage(exc));
    }

    @JacksonStdImpl
    static final class StringKD extends StdKeyDeserializer {
        private static final StringKD sString = new StringKD(String.class);
        private static final StringKD sObject = new StringKD(Object.class);

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer, com.fasterxml.jackson.databind.KeyDeserializer
        public final Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            return str;
        }

        private StringKD(Class<?> cls) {
            super(-1, cls);
        }

        public static StringKD forType(Class<?> cls) {
            if (cls == String.class) {
                return sString;
            }
            if (cls == Object.class) {
                return sObject;
            }
            return new StringKD(cls);
        }
    }

    static final class DelegatingKD extends KeyDeserializer implements Serializable {
        protected final JsonDeserializer<?> _delegate;
        protected final Class<?> _keyClass;

        protected DelegatingKD(Class<?> cls, JsonDeserializer<?> jsonDeserializer) {
            this._keyClass = cls;
            this._delegate = jsonDeserializer;
        }

        @Override // com.fasterxml.jackson.databind.KeyDeserializer
        public final Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            if (str == null) {
                return null;
            }
            TokenBuffer tokenBufferBufferForInputBuffering = deserializationContext.bufferForInputBuffering();
            tokenBufferBufferForInputBuffering.writeString(str);
            try {
                JsonParser jsonParserAsParser = tokenBufferBufferForInputBuffering.asParser();
                jsonParserAsParser.nextToken();
                Object objDeserialize = this._delegate.deserialize(jsonParserAsParser, deserializationContext);
                return objDeserialize != null ? objDeserialize : deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
            } catch (Exception e) {
                return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation: %s", e.getMessage());
            }
        }
    }

    @JacksonStdImpl
    static final class EnumKD extends StdKeyDeserializer {
        protected final EnumResolver _byEnumNamingResolver;
        protected volatile EnumResolver _byIndexResolver;
        protected final EnumResolver _byNameResolver;
        protected volatile EnumResolver _byToStringResolver;
        protected final Enum<?> _enumDefaultValue;
        protected final AnnotatedMethod _factory;

        protected EnumKD(EnumResolver enumResolver, AnnotatedMethod annotatedMethod, EnumResolver enumResolver2) {
            super(-1, enumResolver.getEnumClass());
            this._byNameResolver = enumResolver;
            this._factory = annotatedMethod;
            this._enumDefaultValue = enumResolver.getDefaultValue();
            this._byEnumNamingResolver = enumResolver2;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public final Object _parse(String str, DeserializationContext deserializationContext) throws IOException {
            AnnotatedMethod annotatedMethod = this._factory;
            if (annotatedMethod != null) {
                try {
                    return annotatedMethod.call1(str);
                } catch (Exception e) {
                    ClassUtil.unwrapAndThrowAsIAE(e);
                }
            }
            EnumResolver enumResolver_resolveCurrentResolver = this._resolveCurrentResolver(deserializationContext);
            Enum<?> enumFindEnum = enumResolver_resolveCurrentResolver.findEnum(str);
            if (enumFindEnum == null && deserializationContext.isEnabled(EnumFeature.READ_ENUM_KEYS_USING_INDEX)) {
                enumResolver_resolveCurrentResolver = this._getIndexResolver(deserializationContext);
                enumFindEnum = enumResolver_resolveCurrentResolver.findEnum(str);
            }
            if (enumFindEnum != null) {
                return enumFindEnum;
            }
            if (this._enumDefaultValue == null || !deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return !deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) ? deserializationContext.handleWeirdKey(this._keyClass, str, "not one of the values accepted for Enum class: %s", enumResolver_resolveCurrentResolver.getEnumIds()) : enumFindEnum;
            }
            return this._enumDefaultValue;
        }

        protected final EnumResolver _resolveCurrentResolver(DeserializationContext deserializationContext) {
            EnumResolver enumResolver = this._byEnumNamingResolver;
            return enumResolver != null ? enumResolver : deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? _getToStringResolver(deserializationContext) : this._byNameResolver;
        }

        private EnumResolver _getToStringResolver(DeserializationContext deserializationContext) {
            EnumResolver enumResolverConstructUsingToString;
            EnumResolver enumResolver = this._byToStringResolver;
            if (enumResolver != null) {
                return enumResolver;
            }
            synchronized (this) {
                enumResolverConstructUsingToString = this._byToStringResolver;
                if (enumResolverConstructUsingToString == null) {
                    enumResolverConstructUsingToString = EnumResolver.constructUsingToString(deserializationContext.getConfig(), this._byNameResolver.getEnumClass());
                    this._byToStringResolver = enumResolverConstructUsingToString;
                }
            }
            return enumResolverConstructUsingToString;
        }

        private EnumResolver _getIndexResolver(DeserializationContext deserializationContext) {
            EnumResolver enumResolverConstructUsingIndex;
            EnumResolver enumResolver = this._byIndexResolver;
            if (enumResolver != null) {
                return enumResolver;
            }
            synchronized (this) {
                enumResolverConstructUsingIndex = this._byIndexResolver;
                if (enumResolverConstructUsingIndex == null) {
                    enumResolverConstructUsingIndex = EnumResolver.constructUsingIndex(deserializationContext.getConfig(), this._byNameResolver.getEnumClass());
                    this._byIndexResolver = enumResolverConstructUsingIndex;
                }
            }
            return enumResolverConstructUsingIndex;
        }
    }

    static final class StringCtorKeyDeserializer extends StdKeyDeserializer {
        protected final Constructor<?> _ctor;

        public StringCtorKeyDeserializer(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this._ctor = constructor;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public final Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this._ctor.newInstance(str);
        }
    }

    static final class StringFactoryKeyDeserializer extends StdKeyDeserializer {
        final Method _factoryMethod;

        public StringFactoryKeyDeserializer(Method method) {
            super(-1, method.getDeclaringClass());
            this._factoryMethod = method;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public final Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this._factoryMethod.invoke(null, str);
        }
    }
}
