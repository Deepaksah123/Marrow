package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/updateBookmark;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class updateBookmark {
    private static final /* synthetic */ updateBookmark[] read;
    private static updateBookmark IconCompatParcelizer = new updateBookmark("Singleton", 0);
    private static updateBookmark AudioAttributesCompatParcelizer = new updateBookmark("Factory", 1);
    private static updateBookmark RemoteActionCompatParcelizer = new updateBookmark("Scoped", 2);

    private updateBookmark(String str, int i) {
    }

    static {
        updateBookmark[] updatebookmarkArrIconCompatParcelizer = IconCompatParcelizer();
        read = updatebookmarkArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(updatebookmarkArrIconCompatParcelizer);
    }

    public static updateBookmark valueOf(String str) {
        return (updateBookmark) Enum.valueOf(updateBookmark.class, str);
    }

    public static updateBookmark[] values() {
        return (updateBookmark[]) read.clone();
    }

    private static final /* synthetic */ updateBookmark[] IconCompatParcelizer() {
        return new updateBookmark[]{IconCompatParcelizer, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
    }
}
