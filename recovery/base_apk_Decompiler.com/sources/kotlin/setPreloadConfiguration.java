package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/setPreloadConfiguration;", "", "", "p0", "Lo/setPauseAtEndOfMediaItems;", "p1", "<init>", "(ILo/setPauseAtEndOfMediaItems;)V", "AudioAttributesCompatParcelizer", "I", "IconCompatParcelizer", "()I", "AudioAttributesImplApi21Parcelizer", "Lo/setPauseAtEndOfMediaItems;", "RemoteActionCompatParcelizer", "()Lo/setPauseAtEndOfMediaItems;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setPreloadConfiguration {
    private static final int write = 0;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setPauseAtEndOfMediaItems RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int RemoteActionCompatParcelizer = 8;
    private static final int IconCompatParcelizer = 1;

    public setPreloadConfiguration(int i, setPauseAtEndOfMediaItems setpauseatendofmediaitems) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = setpauseatendofmediaitems;
    }

    /* JADX INFO: renamed from: o.setPreloadConfiguration$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"Lo/setPreloadConfiguration$read;", "", "<init>", "()V", "", "write", "I", "read", "()I", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int read() {
            return setPreloadConfiguration.write;
        }

        public final int IconCompatParcelizer() {
            return setPreloadConfiguration.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final setPauseAtEndOfMediaItems getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
