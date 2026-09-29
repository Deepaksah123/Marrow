package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\bj\u0002\b\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lo/LearnMoreResponseCompanion;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "MediaBrowserCompatCustomActionResultReceiver", "I", "RemoteActionCompatParcelizer", "()I", "write", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LearnMoreResponseCompanion {
    private static final /* synthetic */ LearnMoreResponseCompanion[] AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int write;
    public static final LearnMoreResponseCompanion MediaBrowserCompatItemReceiver = new LearnMoreResponseCompanion("VALID", 0, 0);
    public static final LearnMoreResponseCompanion RemoteActionCompatParcelizer = new LearnMoreResponseCompanion("USER_ID_EMPTY", 1, 1);
    public static final LearnMoreResponseCompanion write = new LearnMoreResponseCompanion("USER_ID_INVALID_LENGTH", 2, 2);
    public static final LearnMoreResponseCompanion AudioAttributesImplApi26Parcelizer = new LearnMoreResponseCompanion("USER_ID_NOT_HEX", 3, 3);
    public static final LearnMoreResponseCompanion IconCompatParcelizer = new LearnMoreResponseCompanion("EMAIL_EMPTY", 4, 4);
    public static final LearnMoreResponseCompanion AudioAttributesCompatParcelizer = new LearnMoreResponseCompanion("EMAIL_INVALID_FORMAT", 5, 5);
    public static final LearnMoreResponseCompanion read = new LearnMoreResponseCompanion("INVALID_TOKEN", 6, 6);

    private LearnMoreResponseCompanion(String str, int i, int i2) {
        this.write = i2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    static {
        LearnMoreResponseCompanion[] learnMoreResponseCompanionArr = read();
        AudioAttributesImplApi21Parcelizer = learnMoreResponseCompanionArr;
        getMagicModuleTimeline.IconCompatParcelizer(learnMoreResponseCompanionArr);
    }

    private static final /* synthetic */ LearnMoreResponseCompanion[] read() {
        return new LearnMoreResponseCompanion[]{MediaBrowserCompatItemReceiver, RemoteActionCompatParcelizer, write, AudioAttributesImplApi26Parcelizer, IconCompatParcelizer, AudioAttributesCompatParcelizer, read};
    }

    public static LearnMoreResponseCompanion valueOf(String str) {
        return (LearnMoreResponseCompanion) Enum.valueOf(LearnMoreResponseCompanion.class, str);
    }

    public static LearnMoreResponseCompanion[] values() {
        return (LearnMoreResponseCompanion[]) AudioAttributesImplApi21Parcelizer.clone();
    }
}
