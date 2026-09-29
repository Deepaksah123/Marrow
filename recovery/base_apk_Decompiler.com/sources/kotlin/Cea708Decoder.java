package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0002\u000f\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/Cea708Decoder;", "Lo/handlePreambleAddressCode;", "Lo/Cea708Decoder$IconCompatParcelizer;", "p0", "<init>", "(Lo/Cea708Decoder$IconCompatParcelizer;)V", "Landroid/content/IntentFilter;", "AudioAttributesCompatParcelizer", "()Landroid/content/IntentFilter;", "Landroid/content/Context;", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "IconCompatParcelizer", "Lo/Cea708Decoder$IconCompatParcelizer;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Cea708Decoder extends handlePreambleAddressCode {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final IconCompatParcelizer write;

    public interface IconCompatParcelizer {
        void write(String str, int i, String str2);
    }

    public Cea708Decoder(IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        this.write = iconCompatParcelizer;
    }

    @Override // kotlin.handlePreambleAddressCode
    public final IntentFilter AudioAttributesCompatParcelizer() {
        return new IntentFilter("VideoDownloadReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context p0, Intent p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p1.getAction(), (Object) "VideoDownloadReceiver")) {
            this.write.write(p1.getStringExtra("_id"), p1.getIntExtra("d_percent", 0), p1.getStringExtra("videoDownloadFeedbackText"));
        }
    }

    /* JADX INFO: renamed from: o.Cea708Decoder$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u000f"}, d2 = {"Lo/Cea708Decoder$write;", "", "<init>", "()V", "", "p0", "", "p1", "Landroid/content/Intent;", "read", "(Ljava/lang/String;I)Landroid/content/Intent;", "IconCompatParcelizer", "(Ljava/lang/String;)Landroid/content/Intent;", "write", "()Landroid/content/Intent;", "(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent read(String p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Intent intent = new Intent("VideoDownloadReceiver");
            intent.putExtra("_id", p0);
            intent.putExtra("d_percent", p1);
            return intent;
        }

        @getMagicModuleMeta
        public static Intent IconCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return read(p0, -2);
        }

        @getMagicModuleMeta
        public static Intent write() {
            Intent intent = new Intent("VideoDownloadReceiver");
            intent.putExtra("d_percent", -2);
            return intent;
        }

        @getMagicModuleMeta
        public static Intent IconCompatParcelizer(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Intent intent = read(p0, -1);
            intent.putExtra("videoDownloadFeedbackText", p1);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
