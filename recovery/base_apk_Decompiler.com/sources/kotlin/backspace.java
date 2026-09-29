package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f"}, d2 = {"Lo/backspace;", "Lo/handlePreambleAddressCode;", "Lo/backspace$read;", "p0", "<init>", "(Lo/backspace$read;)V", "Landroid/content/IntentFilter;", "AudioAttributesCompatParcelizer", "()Landroid/content/IntentFilter;", "Landroid/content/Context;", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lo/backspace$read;", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class backspace extends handlePreambleAddressCode {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final read IconCompatParcelizer;

    public interface read {
        void AudioAttributesCompatParcelizer();

        void read();
    }

    public backspace(read readVar) {
        toMagicModuleMetaRepoModel.write(readVar, "");
        this.IconCompatParcelizer = readVar;
    }

    @Override // kotlin.handlePreambleAddressCode
    public final IntentFilter AudioAttributesCompatParcelizer() {
        return new IntentFilter("VideoEnteredInternalPipReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context p0, Intent p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p1 == null || !parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(p1.getAction(), "VideoEnteredInternalPipReceiver")) {
            return;
        }
        if (p1.getBooleanExtra("IsInternalPip", false)) {
            this.IconCompatParcelizer.read();
        } else {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
    }

    /* JADX INFO: renamed from: o.backspace$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/backspace$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Z)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(boolean p0) {
            Intent intentPutExtra = new Intent("VideoEnteredInternalPipReceiver").putExtra("IsInternalPip", p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intentPutExtra, "");
            return intentPutExtra;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
