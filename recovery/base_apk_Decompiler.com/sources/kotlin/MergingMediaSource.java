package kotlin;

import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/MergingMediaSource;", "", "<init>", "()V", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MergingMediaSource {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.MergingMediaSource$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003"}, d2 = {"Lo/MergingMediaSource$read;", "", "<init>", "()V", "", "p0", "", "write", "(Ljava/lang/String;)V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static void write(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle bundle = new Bundle();
            bundle.putString("when", "VideoWatch");
            bundle.putString("user_id", p0);
            isTrackExcluded.AudioAttributesCompatParcelizer("casting", bundle);
        }

        public static void RemoteActionCompatParcelizer() {
            isTrackExcluded.AudioAttributesCompatParcelizer("dev_pop", null);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final void write(String str) {
        Companion.write(str);
    }
}
