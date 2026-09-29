package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/createProgressiveMediaExtractor;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class createProgressiveMediaExtractor {
    private static final /* synthetic */ createProgressiveMediaExtractor[] read;
    public static final createProgressiveMediaExtractor IconCompatParcelizer = new createProgressiveMediaExtractor("IDLE", 0);
    public static final createProgressiveMediaExtractor AudioAttributesCompatParcelizer = new createProgressiveMediaExtractor("LOADING", 1);
    public static final createProgressiveMediaExtractor write = new createProgressiveMediaExtractor("SUCCESS", 2);
    public static final createProgressiveMediaExtractor RemoteActionCompatParcelizer = new createProgressiveMediaExtractor("ERROR", 3);

    static {
        createProgressiveMediaExtractor[] createprogressivemediaextractorArr = read();
        read = createprogressivemediaextractorArr;
        getMagicModuleTimeline.IconCompatParcelizer(createprogressivemediaextractorArr);
    }

    private createProgressiveMediaExtractor(String str, int i) {
    }

    private static final /* synthetic */ createProgressiveMediaExtractor[] read() {
        return new createProgressiveMediaExtractor[]{IconCompatParcelizer, AudioAttributesCompatParcelizer, write, RemoteActionCompatParcelizer};
    }

    public static createProgressiveMediaExtractor valueOf(String str) {
        return (createProgressiveMediaExtractor) Enum.valueOf(createProgressiveMediaExtractor.class, str);
    }

    public static createProgressiveMediaExtractor[] values() {
        return (createProgressiveMediaExtractor[]) read.clone();
    }
}
