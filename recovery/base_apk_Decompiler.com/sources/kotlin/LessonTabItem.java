package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class LessonTabItem extends IOException {
    private BookReference IconCompatParcelizer;

    public LessonTabItem(String str) {
        super(str);
        this.IconCompatParcelizer = null;
    }

    public final LessonTabItem write(BookReference bookReference) {
        this.IconCompatParcelizer = bookReference;
        return this;
    }

    public final BookReference AudioAttributesImplApi26Parcelizer() {
        return this.IconCompatParcelizer;
    }

    static LessonTabItem AudioAttributesImplBaseParcelizer() {
        return new LessonTabItem("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static LessonTabItem write() {
        return new LessonTabItem("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static LessonTabItem RemoteActionCompatParcelizer() {
        return new LessonTabItem("CodedInputStream encountered a malformed varint.");
    }

    static LessonTabItem read() {
        return new LessonTabItem("Protocol message contained an invalid tag (zero).");
    }

    static LessonTabItem IconCompatParcelizer() {
        return new LessonTabItem("Protocol message end-group tag did not match expected tag.");
    }

    static LessonTabItem AudioAttributesCompatParcelizer() {
        return new LessonTabItem("Protocol message tag had invalid wire type.");
    }

    static LessonTabItem MediaBrowserCompatCustomActionResultReceiver() {
        return new LessonTabItem("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static LessonTabItem AudioAttributesImplApi21Parcelizer() {
        return new LessonTabItem("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }
}
