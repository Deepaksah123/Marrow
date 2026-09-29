package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/Cea608DecoderCueBuilder;", "Lo/handlePreambleAddressCode;", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Landroid/content/IntentFilter;", "AudioAttributesCompatParcelizer", "()Landroid/content/IntentFilter;", "", "read", "(Z)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Cea608DecoderCueBuilder extends handlePreambleAddressCode {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract void read(boolean p0);

    /* JADX INFO: renamed from: o.Cea608DecoderCueBuilder$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/Cea608DecoderCueBuilder$read;", "", "<init>", "()V", "", "p0", "Landroid/content/Intent;", "read", "(Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent read(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Intent intent = new Intent("PipAudioFocusReceiver");
            intent.putExtra("STATUS", p0);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context p0, Intent p1) {
        if (p1 == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "PipAudioFocusReceiver", (Object) p1.getAction())) {
            return;
        }
        read(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "PAUSE", (Object) p1.getStringExtra("PAUSE")));
    }

    @Override // kotlin.handlePreambleAddressCode
    public final IntentFilter AudioAttributesCompatParcelizer() {
        return new IntentFilter("PipAudioFocusReceiver");
    }

    @getMagicModuleMeta
    public static final Intent RemoteActionCompatParcelizer(String str) {
        return Companion.read(str);
    }
}
