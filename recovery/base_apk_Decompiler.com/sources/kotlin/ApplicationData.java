package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000bR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u0003\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010"}, d2 = {"Lo/ApplicationData;", "Lo/McqFaq;", "", "write", "()I", "RemoteActionCompatParcelizer", "", "()Ljava/lang/String;", "read", "Lo/deleteOfflineDownloadedFiles;", "()Lo/deleteOfflineDownloadedFiles;", "IconCompatParcelizer", "Lo/ApplicationData$IconCompatParcelizer;", "()Lo/ApplicationData$IconCompatParcelizer;", "", "AudioAttributesCompatParcelizer", "()Z", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApplicationData extends McqFaq {
    boolean AudioAttributesCompatParcelizer();

    boolean AudioAttributesImplApi21Parcelizer();

    IconCompatParcelizer IconCompatParcelizer();

    String RemoteActionCompatParcelizer();

    deleteOfflineDownloadedFiles read();

    int write();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/ApplicationData$IconCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "write", "read", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private static final /* synthetic */ IconCompatParcelizer[] AudioAttributesCompatParcelizer;
        public static final IconCompatParcelizer write = new IconCompatParcelizer("INSTANCE", 0);
        private static IconCompatParcelizer read = new IconCompatParcelizer("CONTEXT", 1);
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer("EXTENSION_RECEIVER", 2);
        public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer("VALUE", 3);

        private IconCompatParcelizer(String str, int i) {
        }

        static {
            IconCompatParcelizer[] iconCompatParcelizerArr = read();
            AudioAttributesCompatParcelizer = iconCompatParcelizerArr;
            getMagicModuleTimeline.IconCompatParcelizer(iconCompatParcelizerArr);
        }

        private static final /* synthetic */ IconCompatParcelizer[] read() {
            return new IconCompatParcelizer[]{write, read, IconCompatParcelizer, RemoteActionCompatParcelizer};
        }

        public static IconCompatParcelizer valueOf(String str) {
            return (IconCompatParcelizer) Enum.valueOf(IconCompatParcelizer.class, str);
        }

        public static IconCompatParcelizer[] values() {
            return (IconCompatParcelizer[]) AudioAttributesCompatParcelizer.clone();
        }
    }
}
