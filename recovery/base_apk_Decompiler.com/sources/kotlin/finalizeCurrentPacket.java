package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\t\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/finalizeCurrentPacket;", "Lo/handlePreambleAddressCode;", "<init>", "()V", "", "p0", "", "p1", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Z)V", "Landroid/content/IntentFilter;", "()Landroid/content/IntentFilter;", "Landroid/content/Context;", "Landroid/content/Intent;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class finalizeCurrentPacket extends handlePreambleAddressCode {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract void AudioAttributesCompatParcelizer(String p0, boolean p1);

    @Override // kotlin.handlePreambleAddressCode
    public final IntentFilter AudioAttributesCompatParcelizer() {
        return new IntentFilter("VideoStreamOfflineReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context p0, Intent p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "VideoStreamOfflineReceiver", (Object) (p1 != null ? p1.getAction() : null))) {
            AudioAttributesCompatParcelizer(p1.getStringExtra("lesson-id"), p1.getBooleanExtra("force_offline", false));
        }
    }

    /* JADX INFO: renamed from: o.finalizeCurrentPacket$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/finalizeCurrentPacket$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "p1", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Z)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent RemoteActionCompatParcelizer(String p0, boolean p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Intent intent = new Intent("VideoStreamOfflineReceiver");
            intent.putExtra("lesson-id", p0);
            intent.putExtra("force_offline", p1);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
