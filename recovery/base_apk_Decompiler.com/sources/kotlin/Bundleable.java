package kotlin;

import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016"}, d2 = {"Lo/Bundleable;", "", "Landroid/content/Context;", "p0", "Lo/setEnableDecoderFallback;", "p1", "Lo/onStreamChanged;", "", "p2", "Lo/onRelease;", "p3", "Lo/getLastResetPositionUs;", "p4", "p5", "<init>", "(Landroid/content/Context;Lo/setEnableDecoderFallback;Lo/onStreamChanged;Lo/onRelease;Lo/onStreamChanged;Lo/onStreamChanged;)V", "write", "Landroid/content/Context;", "()Landroid/content/Context;", "RemoteActionCompatParcelizer", "Lo/onStreamChanged;", "AudioAttributesCompatParcelizer", "()Lo/onStreamChanged;", "IconCompatParcelizer", "Lo/onRelease;", "()Lo/onRelease;", "read"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Bundleable {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final onStreamChanged<Boolean> IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final onRelease read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final onStreamChanged<Boolean> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final onStreamChanged<getLastResetPositionUs> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Context RemoteActionCompatParcelizer;

    private Bundleable(Context context, setEnableDecoderFallback setenabledecoderfallback, onStreamChanged<Boolean> onstreamchanged, onRelease onrelease, onStreamChanged<getLastResetPositionUs> onstreamchanged2, onStreamChanged<Boolean> onstreamchanged3) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(setenabledecoderfallback, "");
        toMagicModuleMetaRepoModel.write(onstreamchanged, "");
        toMagicModuleMetaRepoModel.write(onrelease, "");
        toMagicModuleMetaRepoModel.write(onstreamchanged2, "");
        toMagicModuleMetaRepoModel.write(onstreamchanged3, "");
        this.RemoteActionCompatParcelizer = context;
        this.write = onstreamchanged;
        this.read = onrelease;
        this.AudioAttributesCompatParcelizer = onstreamchanged2;
        this.IconCompatParcelizer = onstreamchanged3;
    }

    public /* synthetic */ Bundleable(Context context, setEnableDecoderFallback setenabledecoderfallback, onStreamChanged onstreamchanged, onRelease onrelease, onStreamChanged onstreamchanged2, onStreamChanged onstreamchanged3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        onStreamChanged onenabled;
        onRelease onrelease2;
        onStreamChanged onstreamchangedWrite;
        onStreamChanged setlistener;
        if ((i & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationContext, "");
            onenabled = new onEnabled(applicationContext, setenabledecoderfallback);
        } else {
            onenabled = onstreamchanged;
        }
        if ((i & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationContext2, "");
            onrelease2 = new onRelease(applicationContext2, setenabledecoderfallback);
        } else {
            onrelease2 = onrelease;
        }
        if ((i & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationContext3, "");
            onstreamchangedWrite = supportsMixedMimeTypeAdaptation.write(applicationContext3, setenabledecoderfallback);
        } else {
            onstreamchangedWrite = onstreamchanged2;
        }
        if ((i & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationContext4, "");
            setlistener = new setListener(applicationContext4, setenabledecoderfallback);
        } else {
            setlistener = onstreamchanged3;
        }
        this(context, setenabledecoderfallback, onenabled, onrelease2, onstreamchangedWrite, setlistener);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final Context getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final onStreamChanged<Boolean> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final onRelease getRead() {
        return this.read;
    }

    public final onStreamChanged<getLastResetPositionUs> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final onStreamChanged<Boolean> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
