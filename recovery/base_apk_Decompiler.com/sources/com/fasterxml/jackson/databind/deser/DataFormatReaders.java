package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class DataFormatReaders {
    protected final MatchStrength _minimalMatch;
    protected final MatchStrength _optimalMatch;
    protected final ObjectReader[] _readers;

    public Match findFormat(byte[] bArr, int i, int i2) throws IOException {
        return _findFormat(new AccessorForReader(bArr, i, i2));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        ObjectReader[] objectReaderArr = this._readers;
        int length = objectReaderArr.length;
        if (length > 0) {
            sb.append(objectReaderArr[0].getFactory().getFormatName());
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(this._readers[i].getFactory().getFormatName());
            }
        }
        sb.append(']');
        return sb.toString();
    }

    private Match _findFormat(AccessorForReader accessorForReader) throws IOException {
        ObjectReader[] objectReaderArr = this._readers;
        int length = objectReaderArr.length;
        ObjectReader objectReader = null;
        int i = 0;
        MatchStrength matchStrength = null;
        while (true) {
            if (i >= length) {
                break;
            }
            ObjectReader objectReader2 = objectReaderArr[i];
            accessorForReader.reset();
            MatchStrength matchStrengthHasFormat = objectReader2.getFactory().hasFormat(accessorForReader);
            if (matchStrengthHasFormat != null && matchStrengthHasFormat.ordinal() >= this._minimalMatch.ordinal() && (objectReader == null || matchStrength.ordinal() < matchStrengthHasFormat.ordinal())) {
                if (matchStrengthHasFormat.ordinal() >= this._optimalMatch.ordinal()) {
                    objectReader = objectReader2;
                    matchStrength = matchStrengthHasFormat;
                    break;
                }
                objectReader = objectReader2;
                matchStrength = matchStrengthHasFormat;
            }
            i++;
        }
        return accessorForReader.createMatcher(objectReader, matchStrength);
    }

    /* JADX INFO: loaded from: classes4.dex */
    protected static class AccessorForReader extends InputAccessor.Std {
        public AccessorForReader(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
        }

        public Match createMatcher(ObjectReader objectReader, MatchStrength matchStrength) {
            return new Match(this._in, this._buffer, this._bufferedStart, this._bufferedEnd - this._bufferedStart, objectReader, matchStrength);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class Match {
        protected final byte[] _bufferedData;
        protected final int _bufferedLength;
        protected final int _bufferedStart;
        protected final ObjectReader _match;
        protected final MatchStrength _matchStrength;
        protected final InputStream _originalStream;

        protected Match(InputStream inputStream, byte[] bArr, int i, int i2, ObjectReader objectReader, MatchStrength matchStrength) {
            this._originalStream = inputStream;
            this._bufferedData = bArr;
            this._bufferedStart = i;
            this._bufferedLength = i2;
            this._match = objectReader;
            this._matchStrength = matchStrength;
        }

        public boolean hasMatch() {
            return this._match != null;
        }

        public ObjectReader getReader() {
            return this._match;
        }

        public JsonParser createParserWithMatch() throws IOException {
            ObjectReader objectReader = this._match;
            if (objectReader == null) {
                return null;
            }
            JsonFactory factory = objectReader.getFactory();
            if (this._originalStream == null) {
                return factory.createParser(this._bufferedData, this._bufferedStart, this._bufferedLength);
            }
            return factory.createParser(getDataStream());
        }

        public InputStream getDataStream() {
            if (this._originalStream == null) {
                return new ByteArrayInputStream(this._bufferedData, this._bufferedStart, this._bufferedLength);
            }
            return new MergedStream(null, this._originalStream, this._bufferedData, this._bufferedStart, this._bufferedLength);
        }
    }
}
