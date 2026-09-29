package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/maybeSkipComment;", "", "<init>", "(Ljava/lang/String;I)V", "write", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class maybeSkipComment {
    private static final /* synthetic */ maybeSkipComment[] read;
    public static final maybeSkipComment write = new maybeSkipComment("NONE", 0);
    public static final maybeSkipComment RemoteActionCompatParcelizer = new maybeSkipComment("LEFT", 1);
    public static final maybeSkipComment AudioAttributesCompatParcelizer = new maybeSkipComment("RIGHT", 2);

    private maybeSkipComment(String str, int i) {
    }

    static {
        maybeSkipComment[] maybeskipcommentArrIconCompatParcelizer = IconCompatParcelizer();
        read = maybeskipcommentArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(maybeskipcommentArrIconCompatParcelizer);
    }

    private static final /* synthetic */ maybeSkipComment[] IconCompatParcelizer() {
        return new maybeSkipComment[]{write, RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer};
    }

    public static maybeSkipComment valueOf(String str) {
        return (maybeSkipComment) Enum.valueOf(maybeSkipComment.class, str);
    }

    public static maybeSkipComment[] values() {
        return (maybeSkipComment[]) read.clone();
    }
}
