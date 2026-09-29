package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lo/lambdaupdateStateAndInformListeners38;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "read", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "write", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdaupdateStateAndInformListeners38 {
    private static final /* synthetic */ lambdaupdateStateAndInformListeners38[] MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;
    public static final lambdaupdateStateAndInformListeners38 IconCompatParcelizer = new lambdaupdateStateAndInformListeners38("CLOSE", 0, "close");
    public static final lambdaupdateStateAndInformListeners38 AudioAttributesCompatParcelizer = new lambdaupdateStateAndInformListeners38("OPEN_URL", 1, "url");
    public static final lambdaupdateStateAndInformListeners38 RemoteActionCompatParcelizer = new lambdaupdateStateAndInformListeners38("KEY_VALUES", 2, "kv");
    public static final lambdaupdateStateAndInformListeners38 write = new lambdaupdateStateAndInformListeners38("CUSTOM_CODE", 3, "custom-code");
    public static final lambdaupdateStateAndInformListeners38 AudioAttributesImplBaseParcelizer = new lambdaupdateStateAndInformListeners38("REQUEST_FOR_PERMISSIONS", 4, "rfp");

    private lambdaupdateStateAndInformListeners38(String str, int i, String str2) {
        this.AudioAttributesCompatParcelizer = str2;
    }

    static {
        lambdaupdateStateAndInformListeners38[] lambdaupdatestateandinformlisteners38ArrIconCompatParcelizer = IconCompatParcelizer();
        MediaBrowserCompatCustomActionResultReceiver = lambdaupdatestateandinformlisteners38ArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(lambdaupdatestateandinformlisteners38ArrIconCompatParcelizer);
        INSTANCE = new Companion(null);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.lambdaupdateStateAndInformListeners38$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/lambdaupdateStateAndInformListeners38$read;", "", "<init>", "()V", "", "p0", "Lo/lambdaupdateStateAndInformListeners38;", "write", "(Ljava/lang/String;)Lo/lambdaupdateStateAndInformListeners38;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static lambdaupdateStateAndInformListeners38 write(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            for (lambdaupdateStateAndInformListeners38 lambdaupdatestateandinformlisteners38 : lambdaupdateStateAndInformListeners38.values()) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) lambdaupdatestateandinformlisteners38.AudioAttributesCompatParcelizer, (Object) p0)) {
                    return lambdaupdatestateandinformlisteners38;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static lambdaupdateStateAndInformListeners38 valueOf(String str) {
        return (lambdaupdateStateAndInformListeners38) Enum.valueOf(lambdaupdateStateAndInformListeners38.class, str);
    }

    public static lambdaupdateStateAndInformListeners38[] values() {
        return (lambdaupdateStateAndInformListeners38[]) MediaBrowserCompatCustomActionResultReceiver.clone();
    }

    private static final /* synthetic */ lambdaupdateStateAndInformListeners38[] IconCompatParcelizer() {
        return new lambdaupdateStateAndInformListeners38[]{IconCompatParcelizer, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, write, AudioAttributesImplBaseParcelizer};
    }
}
