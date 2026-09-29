package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/setItalicSpan;", "Lo/handlePreambleAddressCode;", "<init>", "()V", "Landroid/content/IntentFilter;", "AudioAttributesCompatParcelizer", "()Landroid/content/IntentFilter;", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "", "IconCompatParcelizer", "(ILjava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setItalicSpan extends handlePreambleAddressCode {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract void IconCompatParcelizer(int p0, String p1);

    /* JADX INFO: renamed from: o.setItalicSpan$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/setItalicSpan$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "p1", "Landroid/content/Intent;", "write", "(ILjava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent write(int p0, String p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent("MarkCompleteReceiver");
            intent.putExtra("status", p0);
            intent.putExtra("lessonId", p1);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.handlePreambleAddressCode
    public final IntentFilter AudioAttributesCompatParcelizer() {
        return new IntentFilter("MarkCompleteReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context p0, Intent p1) {
        String stringExtra;
        int intExtra;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p1 != null) {
            String action = p1.getAction();
            toMagicModuleMetaRepoModel.write((Object) action);
            if (!"MarkCompleteReceiver".contentEquals(action) || (stringExtra = p1.getStringExtra("lessonId")) == null || (intExtra = p1.getIntExtra("status", -1)) == -1) {
                return;
            }
            IconCompatParcelizer(intExtra, stringExtra);
        }
    }
}
