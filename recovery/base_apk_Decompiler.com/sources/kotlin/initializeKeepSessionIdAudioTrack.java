package kotlin;

import kotlin.Metadata;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/initializeKeepSessionIdAudioTrack;", "Lo/anyIgnorals;", "<init>", "()V", "Lo/findExplicitNames;", "p0", "", "IconCompatParcelizer", "(Lo/findExplicitNames;)V", "Lo/anyIgnorals$write;", "read", "()Lo/anyIgnorals$write;", "AudioAttributesCompatParcelizer", "", "toString", "()Ljava/lang/String;", "Lo/hasGetter;", "RemoteActionCompatParcelizer", "Lo/hasGetter;", "write"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class initializeKeepSessionIdAudioTrack extends anyIgnorals {
    public static final initializeKeepSessionIdAudioTrack INSTANCE = new initializeKeepSessionIdAudioTrack();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final hasGetter write = new hasGetter() { // from class: o.getRequestedContentPositionUs
        @Override // kotlin.hasGetter
        public final anyIgnorals getLifecycle() {
            return initializeKeepSessionIdAudioTrack.AudioAttributesCompatParcelizer();
        }
    };

    private initializeKeepSessionIdAudioTrack() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final anyIgnorals AudioAttributesCompatParcelizer() {
        return INSTANCE;
    }

    @Override // kotlin.anyIgnorals
    public final void IconCompatParcelizer(findExplicitNames p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!(p0 instanceof addGetter)) {
            StringBuilder sb = new StringBuilder();
            sb.append(p0);
            sb.append(" must implement androidx.lifecycle.DefaultLifecycleObserver.");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        addGetter addgetter = (addGetter) p0;
        hasGetter hasgetter = write;
        addgetter.write(hasgetter);
        addgetter.IconCompatParcelizer(hasgetter);
        addgetter.read(hasgetter);
    }

    @Override // kotlin.anyIgnorals
    public final anyIgnorals.write read() {
        return anyIgnorals.write.write;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // kotlin.anyIgnorals
    public final void AudioAttributesCompatParcelizer(findExplicitNames p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }
}
