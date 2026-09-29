package kotlin;

import android.content.Intent;
import com.facebook.Profile;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0011\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017"}, d2 = {"Lo/lambdaonPlayerErrorChanged42;", "", "Lo/getProvider;", "p0", "Lo/lambdaonPlayerStateChanged34;", "p1", "<init>", "(Lo/getProvider;Lo/lambdaonPlayerStateChanged34;)V", "", "AudioAttributesCompatParcelizer", "()Z", "Lcom/facebook/Profile;", "", "RemoteActionCompatParcelizer", "(Lcom/facebook/Profile;Lcom/facebook/Profile;)V", "read", "(Lcom/facebook/Profile;Z)V", "IconCompatParcelizer", "()Lcom/facebook/Profile;", "(Lcom/facebook/Profile;)V", "Lcom/facebook/Profile;", "write", "Lo/getProvider;", "Lo/lambdaonPlayerStateChanged34;"}, k = 1, mv = {1, 4, 0})
public final class lambdaonPlayerErrorChanged42 {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile lambdaonPlayerErrorChanged42 write;
    private final getProvider AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Profile write;
    private final lambdaonPlayerStateChanged34 read;

    public lambdaonPlayerErrorChanged42(getProvider getprovider, lambdaonPlayerStateChanged34 lambdaonplayerstatechanged34) {
        toMagicModuleMetaRepoModel.write(getprovider, "");
        toMagicModuleMetaRepoModel.write(lambdaonplayerstatechanged34, "");
        this.AudioAttributesCompatParcelizer = getprovider;
        this.read = lambdaonplayerstatechanged34;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Profile getWrite() {
        return this.write;
    }

    public final void IconCompatParcelizer(Profile profile) {
        read(profile, true);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        Profile profileWrite = this.read.write();
        if (profileWrite == null) {
            return false;
        }
        read(profileWrite, false);
        return true;
    }

    private final void read(Profile p0, boolean p1) {
        Profile profile = this.write;
        this.write = p0;
        if (p1) {
            if (p0 != null) {
                this.read.read(p0);
            } else {
                this.read.RemoteActionCompatParcelizer();
            }
        }
        if (DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesCompatParcelizer(profile, p0)) {
            return;
        }
        RemoteActionCompatParcelizer(profile, p0);
    }

    private final void RemoteActionCompatParcelizer(Profile p0, Profile p1) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", p0);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", p1);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(intent);
    }

    /* JADX INFO: renamed from: o.lambdaonPlayerErrorChanged42$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lo/lambdaonPlayerErrorChanged42$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/lambdaonPlayerErrorChanged42;", "read", "()Lo/lambdaonPlayerErrorChanged42;", "write", "Lo/lambdaonPlayerErrorChanged42;", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public final lambdaonPlayerErrorChanged42 read() {
            if (lambdaonPlayerErrorChanged42.write == null) {
                synchronized (this) {
                    if (lambdaonPlayerErrorChanged42.write == null) {
                        getProvider getprovider = getProvider.getInstance(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer());
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getprovider, "");
                        lambdaonPlayerErrorChanged42.write = new lambdaonPlayerErrorChanged42(getprovider, new lambdaonPlayerStateChanged34());
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
            }
            lambdaonPlayerErrorChanged42 lambdaonplayererrorchanged42 = lambdaonPlayerErrorChanged42.write;
            if (lambdaonplayererrorchanged42 != null) {
                return lambdaonplayererrorchanged42;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    @getMagicModuleMeta
    public static final lambdaonPlayerErrorChanged42 read() {
        return INSTANCE.read();
    }
}
