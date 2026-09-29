package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.NumberInput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class JsonPointer implements Serializable {
    protected static final JsonPointer EMPTY = new JsonPointer();
    protected final String _asString;
    protected final int _asStringOffset;
    protected int _hashCode;
    protected final int _matchingElementIndex;
    protected final String _matchingPropertyName;
    protected final JsonPointer _nextSegment;

    protected JsonPointer() {
        this._nextSegment = null;
        this._matchingPropertyName = null;
        this._matchingElementIndex = -1;
        this._asString = "";
        this._asStringOffset = 0;
    }

    protected JsonPointer(String str, int i, String str2, JsonPointer jsonPointer) {
        this._asString = str;
        this._asStringOffset = i;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = _parseIndex(str2);
    }

    public static JsonPointer compile(String str) throws IllegalArgumentException {
        if (str == null || str.length() == 0) {
            return EMPTY;
        }
        if (str.charAt(0) != '/') {
            StringBuilder sb = new StringBuilder("Invalid input: JSON Pointer expression must start with '/': \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
        return _parseTail(str);
    }

    public boolean matches() {
        return this._nextSegment == null;
    }

    public String getMatchingProperty() {
        return this._matchingPropertyName;
    }

    public int getMatchingIndex() {
        return this._matchingElementIndex;
    }

    public boolean mayMatchElement() {
        return this._matchingElementIndex >= 0;
    }

    public JsonPointer tail() {
        return this._nextSegment;
    }

    public String toString() {
        int i = this._asStringOffset;
        if (i <= 0) {
            return this._asString;
        }
        return this._asString.substring(i);
    }

    public int hashCode() {
        int iHashCode = this._hashCode;
        if (iHashCode == 0) {
            iHashCode = toString().hashCode();
            if (iHashCode == 0) {
                iHashCode = -1;
            }
            this._hashCode = iHashCode;
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonPointer)) {
            return false;
        }
        JsonPointer jsonPointer = (JsonPointer) obj;
        return _compare(this._asString, this._asStringOffset, jsonPointer._asString, jsonPointer._asStringOffset);
    }

    private final boolean _compare(String str, int i, String str2, int i2) {
        int length = str.length();
        if (length - i != str2.length() - i2) {
            return false;
        }
        while (i < length) {
            if (str.charAt(i) != str2.charAt(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    private static final int _parseIndex(String str) {
        int length = str.length();
        if (length == 0 || length > 10) {
            return -1;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt <= '0') {
            return (length == 1 && cCharAt == '0') ? 0 : -1;
        }
        if (cCharAt > '9') {
            return -1;
        }
        for (int i = 1; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return -1;
            }
        }
        if (length != 10 || NumberInput.parseLong(str) <= 2147483647L) {
            return NumberInput.parseInt(str);
        }
        return -1;
    }

    protected static JsonPointer _parseTail(String str) {
        int length = str.length();
        PointerParent pointerParent = null;
        int i = 1;
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '/') {
                PointerParent pointerParent2 = new PointerParent(pointerParent, i2, str.substring(i2 + 1, i));
                i2 = i;
                i++;
                pointerParent = pointerParent2;
            } else {
                i++;
                if (cCharAt == '~' && i < length) {
                    StringBuilder sb = new StringBuilder(32);
                    int i_extractEscapedSegment = _extractEscapedSegment(str, i2 + 1, i, sb);
                    String string = sb.toString();
                    if (i_extractEscapedSegment < 0) {
                        return _buildPath(str, i2, string, pointerParent);
                    }
                    PointerParent pointerParent3 = new PointerParent(pointerParent, i2, string);
                    i2 = i_extractEscapedSegment;
                    i = i_extractEscapedSegment + 1;
                    pointerParent = pointerParent3;
                }
            }
        }
        return _buildPath(str, i2, str.substring(i2 + 1), pointerParent);
    }

    private static JsonPointer _buildPath(String str, int i, String str2, PointerParent pointerParent) {
        JsonPointer jsonPointer = new JsonPointer(str, i, str2, EMPTY);
        while (pointerParent != null) {
            JsonPointer jsonPointer2 = new JsonPointer(str, pointerParent.fullPathOffset, pointerParent.segment, jsonPointer);
            pointerParent = pointerParent.parent;
            jsonPointer = jsonPointer2;
        }
        return jsonPointer;
    }

    protected static int _extractEscapedSegment(String str, int i, int i2, StringBuilder sb) {
        int length = str.length();
        int i3 = i2 - 1;
        if (i3 - i > 0) {
            sb.append((CharSequence) str, i, i3);
        }
        int i4 = i2 + 1;
        _appendEscape(sb, str.charAt(i2));
        while (i4 < length) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '/') {
                return i4;
            }
            int i5 = i4 + 1;
            if (cCharAt == '~' && i5 < length) {
                i4 += 2;
                _appendEscape(sb, str.charAt(i5));
            } else {
                sb.append(cCharAt);
                i4 = i5;
            }
        }
        return -1;
    }

    private static void _appendEscape(StringBuilder sb, char c) {
        if (c == '0') {
            c = '~';
        } else if (c == '1') {
            c = '/';
        } else {
            sb.append('~');
        }
        sb.append(c);
    }

    static class PointerParent {
        public final int fullPathOffset;
        public final PointerParent parent;
        public final String segment;

        PointerParent(PointerParent pointerParent, int i, String str) {
            this.parent = pointerParent;
            this.fullPathOffset = i;
            this.segment = str;
        }
    }

    private Object writeReplace() {
        return new Serialization(toString());
    }

    static class Serialization implements Externalizable {
        private String _fullPath;

        public Serialization() {
        }

        Serialization(String str) {
            this._fullPath = str;
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeUTF(this._fullPath);
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            this._fullPath = objectInput.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return JsonPointer.compile(this._fullPath);
        }
    }
}
