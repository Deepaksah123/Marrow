package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0013"}, d2 = {"Lo/maybeUpdateIsInCaptionService;", "Lo/handlePreambleAddressCode;", "<init>", "()V", "Landroid/content/IntentFilter;", "AudioAttributesCompatParcelizer", "()Landroid/content/IntentFilter;", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;I)V", "write", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class maybeUpdateIsInCaptionService extends handlePreambleAddressCode {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // kotlin.handlePreambleAddressCode
    public final IntentFilter AudioAttributesCompatParcelizer() {
        return new IntentFilter("BookmarkTimelineReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context p0, Intent p1) {
        String stringExtra;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "BookmarkTimelineReceiver", (Object) (p1 != null ? p1.getAction() : null)) || (stringExtra = p1.getStringExtra("timeline_id")) == null) {
            return;
        }
        int intExtra = p1.getIntExtra("bookmark_type", -1);
        String stringExtra2 = p1.getStringExtra("target_screen");
        if (stringExtra2 != null) {
            int iHashCode = stringExtra2.hashCode();
            if (iHashCode == -1613086381) {
                if (stringExtra2.equals("lesson_screen")) {
                    RemoteActionCompatParcelizer(stringExtra, intExtra);
                }
            } else if (iHashCode == -11028304) {
                if (stringExtra2.equals("video_screen")) {
                    write(stringExtra, intExtra);
                }
            } else if (iHashCode == 979410913 && stringExtra2.equals("timeline_sheet")) {
                RemoteActionCompatParcelizer(stringExtra);
            }
        }
    }

    public void RemoteActionCompatParcelizer(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }

    private static void RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
    }

    public void write(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }

    /* JADX INFO: renamed from: o.maybeUpdateIsInCaptionService$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lo/maybeUpdateIsInCaptionService$write;", "", "<init>", "()V", "", "p0", "", "p1", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;I)Landroid/content/Intent;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(String p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Intent intent = new Intent("BookmarkTimelineReceiver");
            intent.putExtra("target_screen", "lesson_screen");
            intent.putExtra("timeline_id", p0);
            intent.putExtra("bookmark_type", p1);
            return intent;
        }

        public static Intent write(String p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Intent intent = new Intent("BookmarkTimelineReceiver");
            intent.putExtra("target_screen", "video_screen");
            intent.putExtra("timeline_id", p0);
            intent.putExtra("bookmark_type", p1);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
