package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.util.Util;
import java.util.List;
import java.util.Map;
import kotlin.initExtraTracks;
import kotlin.onContainerAtomRead;
import kotlin.onMoofContainerAtomRead;
import kotlin.parseMdhd;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class RtspHeaders {
    public static final String ACCEPT = "Accept";
    public static final String ALLOW = "Allow";
    public static final String AUTHORIZATION = "Authorization";
    public static final String BANDWIDTH = "Bandwidth";
    public static final String BLOCKSIZE = "Blocksize";
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CONNECTION = "Connection";
    public static final String CONTENT_BASE = "Content-Base";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_LANGUAGE = "Content-Language";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_LOCATION = "Content-Location";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CSEQ = "CSeq";
    public static final String DATE = "Date";
    public static final RtspHeaders EMPTY = new Builder().build();
    public static final String EXPIRES = "Expires";
    public static final String LOCATION = "Location";
    public static final String PROXY_AUTHENTICATE = "Proxy-Authenticate";
    public static final String PROXY_REQUIRE = "Proxy-Require";
    public static final String PUBLIC = "Public";
    public static final String RANGE = "Range";
    public static final String RTCP_INTERVAL = "RTCP-Interval";
    public static final String RTP_INFO = "RTP-Info";
    public static final String SCALE = "Scale";
    public static final String SESSION = "Session";
    public static final String SPEED = "Speed";
    public static final String SUPPORTED = "Supported";
    public static final String TIMESTAMP = "Timestamp";
    public static final String TRANSPORT = "Transport";
    public static final String USER_AGENT = "User-Agent";
    public static final String VIA = "Via";
    public static final String WWW_AUTHENTICATE = "WWW-Authenticate";
    private final onContainerAtomRead<String, String> namesAndValues;

    public static final class Builder {
        private final onContainerAtomRead.write<String, String> namesAndValuesBuilder;

        public Builder() {
            this.namesAndValuesBuilder = new onContainerAtomRead.write<>();
        }

        public Builder(String str, String str2, int i) {
            this();
            add(RtspHeaders.USER_AGENT, str);
            add(RtspHeaders.CSEQ, String.valueOf(i));
            if (str2 != null) {
                add(RtspHeaders.SESSION, str2);
            }
        }

        private Builder(onContainerAtomRead.write<String, String> writeVar) {
            this.namesAndValuesBuilder = writeVar;
        }

        public final Builder add(String str, String str2) {
            this.namesAndValuesBuilder.AudioAttributesCompatParcelizer(RtspHeaders.convertToStandardHeaderName(str.trim()), str2.trim());
            return this;
        }

        public final Builder addAll(List<String> list) {
            for (int i = 0; i < list.size(); i++) {
                String[] strArrSplitAtFirst = Util.splitAtFirst(list.get(i), ":\\s?");
                if (strArrSplitAtFirst.length == 2) {
                    add(strArrSplitAtFirst[0], strArrSplitAtFirst[1]);
                }
            }
            return this;
        }

        public final Builder addAll(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                add(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final RtspHeaders build() {
            return new RtspHeaders(this);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RtspHeaders) {
            return this.namesAndValues.equals(((RtspHeaders) obj).namesAndValues);
        }
        return false;
    }

    public final int hashCode() {
        return this.namesAndValues.hashCode();
    }

    public final Builder buildUpon() {
        onContainerAtomRead.write writeVar = new onContainerAtomRead.write();
        writeVar.AudioAttributesCompatParcelizer(this.namesAndValues);
        return new Builder(writeVar);
    }

    public final onContainerAtomRead<String, String> asMultiMap() {
        return this.namesAndValues;
    }

    public final String get(String str) {
        initExtraTracks<String> initextratracksValues = values(str);
        if (initextratracksValues.isEmpty()) {
            return null;
        }
        return (String) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(initextratracksValues);
    }

    public final initExtraTracks<String> values(String str) {
        return this.namesAndValues.RemoteActionCompatParcelizer(convertToStandardHeaderName(str));
    }

    private RtspHeaders(Builder builder) {
        this.namesAndValues = builder.namesAndValuesBuilder.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String convertToStandardHeaderName(String str) {
        if (parseMdhd.write(str, ACCEPT)) {
            return ACCEPT;
        }
        if (parseMdhd.write(str, ALLOW)) {
            return ALLOW;
        }
        if (parseMdhd.write(str, AUTHORIZATION)) {
            return AUTHORIZATION;
        }
        if (parseMdhd.write(str, BANDWIDTH)) {
            return BANDWIDTH;
        }
        if (parseMdhd.write(str, BLOCKSIZE)) {
            return BLOCKSIZE;
        }
        if (parseMdhd.write(str, CACHE_CONTROL)) {
            return CACHE_CONTROL;
        }
        if (parseMdhd.write(str, CONNECTION)) {
            return CONNECTION;
        }
        if (parseMdhd.write(str, CONTENT_BASE)) {
            return CONTENT_BASE;
        }
        if (parseMdhd.write(str, CONTENT_ENCODING)) {
            return CONTENT_ENCODING;
        }
        if (parseMdhd.write(str, CONTENT_LANGUAGE)) {
            return CONTENT_LANGUAGE;
        }
        if (parseMdhd.write(str, CONTENT_LENGTH)) {
            return CONTENT_LENGTH;
        }
        if (parseMdhd.write(str, CONTENT_LOCATION)) {
            return CONTENT_LOCATION;
        }
        if (parseMdhd.write(str, CONTENT_TYPE)) {
            return CONTENT_TYPE;
        }
        if (parseMdhd.write(str, CSEQ)) {
            return CSEQ;
        }
        if (parseMdhd.write(str, DATE)) {
            return DATE;
        }
        if (parseMdhd.write(str, EXPIRES)) {
            return EXPIRES;
        }
        if (parseMdhd.write(str, LOCATION)) {
            return LOCATION;
        }
        if (parseMdhd.write(str, PROXY_AUTHENTICATE)) {
            return PROXY_AUTHENTICATE;
        }
        if (parseMdhd.write(str, PROXY_REQUIRE)) {
            return PROXY_REQUIRE;
        }
        if (parseMdhd.write(str, PUBLIC)) {
            return PUBLIC;
        }
        if (parseMdhd.write(str, RANGE)) {
            return RANGE;
        }
        if (parseMdhd.write(str, RTP_INFO)) {
            return RTP_INFO;
        }
        if (parseMdhd.write(str, RTCP_INTERVAL)) {
            return RTCP_INTERVAL;
        }
        if (parseMdhd.write(str, SCALE)) {
            return SCALE;
        }
        if (parseMdhd.write(str, SESSION)) {
            return SESSION;
        }
        if (parseMdhd.write(str, SPEED)) {
            return SPEED;
        }
        if (parseMdhd.write(str, SUPPORTED)) {
            return SUPPORTED;
        }
        if (parseMdhd.write(str, TIMESTAMP)) {
            return TIMESTAMP;
        }
        if (parseMdhd.write(str, TRANSPORT)) {
            return TRANSPORT;
        }
        if (parseMdhd.write(str, USER_AGENT)) {
            return USER_AGENT;
        }
        if (parseMdhd.write(str, VIA)) {
            return VIA;
        }
        return parseMdhd.write(str, WWW_AUTHENTICATE) ? WWW_AUTHENTICATE : str;
    }
}
