package kotlin;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.lambdaonVideoDisabled18;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0011J!\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000e\u0010\u0012J)\u0010\u0014\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\nJ5\u0010\u0019\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00162\b\u0010\t\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001b\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u00172\b\u0010\t\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d"}, d2 = {"Lo/lambdaonVideoFrameProcessingOffset20;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "p1", "Lcom/facebook/AccessToken;", "p2", "(Ljava/lang/String;Ljava/lang/String;)V", "Lo/lambdaonVideoCodecError21;", "(Lo/lambdaonVideoCodecError21;)V", "", "IconCompatParcelizer", "()V", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "read", "(Ljava/lang/String;DLandroid/os/Bundle;)V", "Ljava/math/BigDecimal;", "Ljava/util/Currency;", "p3", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V", "AudioAttributesCompatParcelizer", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V", "Lo/lambdaonVideoCodecError21;"}, k = 1, mv = {1, 4, 0})
public final class lambdaonVideoFrameProcessingOffset20 {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final lambdaonVideoCodecError21 AudioAttributesCompatParcelizer;

    private lambdaonVideoFrameProcessingOffset20(lambdaonVideoCodecError21 lambdaonvideocodecerror21) {
        toMagicModuleMetaRepoModel.write(lambdaonvideocodecerror21, "");
        this.AudioAttributesCompatParcelizer = lambdaonvideocodecerror21;
    }

    public lambdaonVideoFrameProcessingOffset20(Context context) {
        this(new lambdaonVideoCodecError21(context, (String) null, (AccessToken) null));
    }

    public lambdaonVideoFrameProcessingOffset20(String str, String str2) {
        this(new lambdaonVideoCodecError21(str, str2, (AccessToken) null));
    }

    public final void IconCompatParcelizer(String p0, Bundle p1) {
        if (lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer()) {
            this.AudioAttributesCompatParcelizer.write(p0, p1);
        }
    }

    public final void read(String p0, double p1, Bundle p2) {
        if (lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer()) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0, p1, p2);
        }
    }

    public final void AudioAttributesCompatParcelizer(BigDecimal p0, Currency p1, Bundle p2) {
        if (lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer()) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1, p2);
        }
    }

    public final void IconCompatParcelizer(String p0, String p1) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0, p1);
    }

    public final void RemoteActionCompatParcelizer(String p0, BigDecimal p1, Currency p2, Bundle p3) {
        if (lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer()) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1, p2, p3);
        }
    }

    public final void IconCompatParcelizer(Bundle p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if ((p0.getInt("previous") & 2) == 0 && !lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer()) {
            return;
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer("fb_sdk_settings_changed", p0);
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: renamed from: o.lambdaonVideoFrameProcessingOffset20$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\b\u001a\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\rH\u0007¢\u0006\u0004\b\b\u0010\u0010"}, d2 = {"Lo/lambdaonVideoFrameProcessingOffset20$IconCompatParcelizer;", "", "<init>", "()V", "Ljava/util/concurrent/Executor;", "read", "()Ljava/util/concurrent/Executor;", "Lo/lambdaonVideoDisabled18$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/lambdaonVideoDisabled18$RemoteActionCompatParcelizer;", "", "write", "()Ljava/lang/String;", "", "p0", "", "(Ljava/util/Map;)V"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public static lambdaonVideoDisabled18.RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
            lambdaonVideoDisabled18.RemoteActionCompatParcelizer remoteActionCompatParcelizer = lambdaonVideoCodecError21.read();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, "");
            return remoteActionCompatParcelizer;
        }

        @getMagicModuleMeta
        public static Executor read() {
            Executor executorRemoteActionCompatParcelizer = lambdaonVideoCodecError21.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(executorRemoteActionCompatParcelizer, "");
            return executorRemoteActionCompatParcelizer;
        }

        @getMagicModuleMeta
        public static String write() {
            return lambdaonVideoCodecError21.IconCompatParcelizer();
        }

        @getMagicModuleMeta
        public static void RemoteActionCompatParcelizer(Map<String, String> p0) {
            lambdareleaseInternal67.AudioAttributesCompatParcelizer(p0);
        }
    }

    @getMagicModuleMeta
    public static final Executor AudioAttributesCompatParcelizer() {
        return Companion.read();
    }

    @getMagicModuleMeta
    public static final void write(Map<String, String> map) {
        Companion.RemoteActionCompatParcelizer(map);
    }
}
