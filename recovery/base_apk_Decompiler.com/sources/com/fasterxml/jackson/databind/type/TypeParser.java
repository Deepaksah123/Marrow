package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes2.dex */
public class TypeParser implements Serializable {
    protected final TypeFactory _factory;

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    public JavaType parse(String str) throws IllegalArgumentException {
        MyTokenizer myTokenizer = new MyTokenizer(str.trim());
        JavaType type = parseType(myTokenizer);
        if (myTokenizer.hasMoreTokens()) {
            throw _problem(myTokenizer, "Unexpected tokens after complete type");
        }
        return type;
    }

    protected JavaType parseType(MyTokenizer myTokenizer) throws IllegalArgumentException {
        if (!myTokenizer.hasMoreTokens()) {
            throw _problem(myTokenizer, "Unexpected end-of-string");
        }
        Class<?> clsFindClass = findClass(myTokenizer.nextToken(), myTokenizer);
        if (myTokenizer.hasMoreTokens()) {
            String strNextToken = myTokenizer.nextToken();
            if ("<".equals(strNextToken)) {
                return this._factory._fromClass(null, clsFindClass, TypeBindings.create(clsFindClass, parseTypes(myTokenizer)));
            }
            myTokenizer.pushBack(strNextToken);
        }
        return this._factory._fromClass(null, clsFindClass, TypeBindings.emptyBindings());
    }

    protected List<JavaType> parseTypes(MyTokenizer myTokenizer) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (myTokenizer.hasMoreTokens()) {
            arrayList.add(parseType(myTokenizer));
            if (!myTokenizer.hasMoreTokens()) {
                break;
            }
            String strNextToken = myTokenizer.nextToken();
            if (">".equals(strNextToken)) {
                return arrayList;
            }
            if (!",".equals(strNextToken)) {
                StringBuilder sb = new StringBuilder("Unexpected token '");
                sb.append(strNextToken);
                sb.append("', expected ',' or '>')");
                throw _problem(myTokenizer, sb.toString());
            }
        }
        throw _problem(myTokenizer, "Unexpected end-of-string");
    }

    protected Class<?> findClass(String str, MyTokenizer myTokenizer) {
        try {
            return this._factory.findClass(str);
        } catch (Exception e) {
            ClassUtil.throwIfRTE(e);
            StringBuilder sb = new StringBuilder("Cannot locate class '");
            sb.append(str);
            sb.append("', problem: ");
            sb.append(e.getMessage());
            throw this._problem(myTokenizer, sb.toString());
        }
    }

    protected IllegalArgumentException _problem(MyTokenizer myTokenizer, String str) {
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", myTokenizer.getAllInput(), myTokenizer.getRemainingInput(), str));
    }

    static final class MyTokenizer extends StringTokenizer {
        protected int _index;
        protected final String _input;
        protected String _pushbackToken;

        public MyTokenizer(String str) {
            super(str, "<,>", true);
            this._input = str;
        }

        @Override // java.util.StringTokenizer
        public final boolean hasMoreTokens() {
            return this._pushbackToken != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public final String nextToken() {
            String str = this._pushbackToken;
            if (str != null) {
                this._pushbackToken = null;
                return str;
            }
            String strNextToken = super.nextToken();
            this._index += strNextToken.length();
            return strNextToken.trim();
        }

        public final void pushBack(String str) {
            this._pushbackToken = str;
        }

        public final String getAllInput() {
            return this._input;
        }

        public final String getRemainingInput() {
            return this._input.substring(this._index);
        }
    }
}
