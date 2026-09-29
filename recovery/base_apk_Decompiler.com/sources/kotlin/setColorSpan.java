package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000eH&¢\u0006\u0004\b\u0005\u0010\u000f"}, d2 = {"Lo/setColorSpan;", "Lo/handlePreambleAddressCode;", "<init>", "()V", "Landroid/content/IntentFilter;", "AudioAttributesCompatParcelizer", "()Landroid/content/IntentFilter;", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setColorSpan extends handlePreambleAddressCode {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract void AudioAttributesCompatParcelizer(String p0, String p1);

    /* JADX INFO: renamed from: o.setColorSpan$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/setColorSpan$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "Landroid/content/Intent;", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent IconCompatParcelizer(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent("SubjectLessonUpdateReceiver");
            intent.putExtra("lesson_id", p0);
            intent.putExtra("subject_id", p1);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.handlePreambleAddressCode
    public final IntentFilter AudioAttributesCompatParcelizer() {
        return new IntentFilter("SubjectLessonUpdateReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context p0, Intent p1) {
        if (p1 != null) {
            String action = p1.getAction();
            toMagicModuleMetaRepoModel.write((Object) action);
            if ("SubjectLessonUpdateReceiver".contentEquals(action)) {
                String stringExtra = p1.getStringExtra("lesson_id");
                String stringExtra2 = p1.getStringExtra("subject_id");
                if (stringExtra == null || stringExtra2 == null) {
                    return;
                }
                AudioAttributesCompatParcelizer(stringExtra, stringExtra2);
            }
        }
    }

    @getMagicModuleMeta
    public static final Intent write(String str, String str2) {
        return Companion.IconCompatParcelizer(str, str2);
    }
}
