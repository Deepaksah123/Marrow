package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/zzks;", "Landroid/content/BroadcastReceiver;", "Lkotlin/Function2;", "", "Lo/onDisplayInfoChanged;", "", "p0", "<init>", "(Lo/MagicModuleSubmissionRequestBody;)V", "Landroid/content/Context;", "Landroid/content/Intent;", "p1", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Landroid/content/IntentFilter;", "write", "()Landroid/content/IntentFilter;", "IconCompatParcelizer", "Lo/MagicModuleSubmissionRequestBody;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzks extends BroadcastReceiver {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<String, onDisplayInfoChanged, getShowPopup> AudioAttributesCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public zzks(MagicModuleSubmissionRequestBody<? super String, ? super onDisplayInfoChanged, getShowPopup> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context p0, Intent p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "BookmarkBroadCast", (Object) p1.getAction())) {
            String stringExtra = p1.getStringExtra("mcqId");
            Serializable serializableExtra = p1.getSerializableExtra("bookmarkType");
            onDisplayInfoChanged ondisplayinfochanged = serializableExtra instanceof onDisplayInfoChanged ? (onDisplayInfoChanged) serializableExtra : null;
            String str = stringExtra;
            if (str == null || str.length() == 0 || ondisplayinfochanged == null) {
                return;
            }
            this.AudioAttributesCompatParcelizer.invoke(stringExtra, ondisplayinfochanged);
        }
    }

    public static IntentFilter write() {
        return new IntentFilter("BookmarkBroadCast");
    }

    /* JADX INFO: renamed from: o.zzks$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/zzks$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "Lo/onDisplayInfoChanged;", "p2", "", "read", "(Landroid/content/Context;Ljava/lang/String;Lo/onDisplayInfoChanged;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void read(Context p0, String p1, onDisplayInfoChanged p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            Intent intent = new Intent("BookmarkBroadCast");
            intent.putExtra("mcqId", p1);
            intent.putExtra("bookmarkType", p2);
            p0.sendBroadcast(intent);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
