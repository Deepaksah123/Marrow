package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000e"}, d2 = {"Lo/hasValueInstantiators;", "", "", "p0", "Lo/initEncryptedContent;", "p1", "", "p2", "<init>", "(FLo/initEncryptedContent;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "F", "IconCompatParcelizer", "()F", "RemoteActionCompatParcelizer", "Lo/initEncryptedContent;", "()Lo/initEncryptedContent;", "write", "I", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hasValueInstantiators {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final initEncryptedContent<Float> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final hasValueInstantiators RemoteActionCompatParcelizer = new hasValueInstantiators(BitmapDescriptorFactory.HUE_RED, getQues.AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), 0, 4, null);

    public hasValueInstantiators(float f, initEncryptedContent<Float> initencryptedcontent, int i) {
        this.RemoteActionCompatParcelizer = f;
        this.write = initencryptedcontent;
        this.read = i;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public /* synthetic */ hasValueInstantiators(float f, initEncryptedContent initencryptedcontent, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, initencryptedcontent, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final float getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final initEncryptedContent<Float> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: o.hasValueInstantiators$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/hasValueInstantiators$read;", "", "<init>", "()V", "Lo/hasValueInstantiators;", "RemoteActionCompatParcelizer", "Lo/hasValueInstantiators;", "read", "()Lo/hasValueInstantiators;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final hasValueInstantiators read() {
            return hasValueInstantiators.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof hasValueInstantiators)) {
            return false;
        }
        hasValueInstantiators hasvalueinstantiators = (hasValueInstantiators) p0;
        return this.RemoteActionCompatParcelizer == hasvalueinstantiators.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, hasvalueinstantiators.write) && this.read == hasvalueinstantiators.read;
    }

    public final int hashCode() {
        return (((Float.hashCode(this.RemoteActionCompatParcelizer) * 31) + this.write.hashCode()) * 31) + this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", range=");
        sb.append(this.write);
        sb.append(", steps=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
