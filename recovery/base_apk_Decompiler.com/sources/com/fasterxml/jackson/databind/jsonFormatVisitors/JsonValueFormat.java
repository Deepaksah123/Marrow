package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.annotation.JsonValue;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes4.dex */
public enum JsonValueFormat {
    COLOR(TtmlNode.ATTR_TTS_COLOR),
    DATE("date"),
    DATE_TIME("date-time"),
    EMAIL("email"),
    HOST_NAME("host-name"),
    IP_ADDRESS("ip-address"),
    IPV6("ipv6"),
    PHONE("phone"),
    REGEX("regex"),
    STYLE(TtmlNode.TAG_STYLE),
    TIME("time"),
    URI("uri"),
    UTC_MILLISEC("utc-millisec"),
    UUID("uuid");

    private final String _desc;

    JsonValueFormat(String str) {
        this._desc = str;
    }

    @Override // java.lang.Enum
    @JsonValue
    public final String toString() {
        return this._desc;
    }
}
