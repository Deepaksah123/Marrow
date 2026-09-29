package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class _add extends IOException {
    private constructPropertyCollector write;

    public _add(String str) {
        super(str);
        this.write = null;
    }

    public final _add RemoteActionCompatParcelizer(constructPropertyCollector constructpropertycollector) {
        this.write = constructpropertycollector;
        return this;
    }

    static _add AudioAttributesImplApi26Parcelizer() {
        return new _add("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static _add MediaBrowserCompatCustomActionResultReceiver() {
        return new _add("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static _add AudioAttributesCompatParcelizer() {
        return new _add("CodedInputStream encountered a malformed varint.");
    }

    static _add read() {
        return new _add("Protocol message contained an invalid tag (zero).");
    }

    static _add IconCompatParcelizer() {
        return new _add("Protocol message end-group tag did not match expected tag.");
    }

    static RemoteActionCompatParcelizer write() {
        return new RemoteActionCompatParcelizer("Protocol message tag had invalid wire type.");
    }

    public static class RemoteActionCompatParcelizer extends _add {
        public RemoteActionCompatParcelizer(String str) {
            super(str);
        }
    }

    static _add AudioAttributesImplApi21Parcelizer() {
        return new _add("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static _add MediaBrowserCompatItemReceiver() {
        return new _add("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static _add AudioAttributesImplBaseParcelizer() {
        return new _add("Failed to parse the message.");
    }

    static _add RemoteActionCompatParcelizer() {
        return new _add("Protocol message had invalid UTF-8.");
    }
}
