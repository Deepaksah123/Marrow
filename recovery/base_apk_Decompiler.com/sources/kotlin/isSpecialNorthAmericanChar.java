package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/isSpecialNorthAmericanChar;", "Lo/handlePreambleAddressCode;", "<init>", "()V", "Landroid/content/IntentFilter;", "AudioAttributesCompatParcelizer", "()Landroid/content/IntentFilter;", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)V", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class isSpecialNorthAmericanChar extends handlePreambleAddressCode {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract void RemoteActionCompatParcelizer(String p0, String p1);

    @Override // kotlin.handlePreambleAddressCode
    public final IntentFilter AudioAttributesCompatParcelizer() {
        return new IntentFilter("EventBroadcastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context p0, Intent p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p1 == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "EventBroadcastReceiver", (Object) p1.getAction())) {
            return;
        }
        String stringExtra = p1.getStringExtra("key_event_source");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = p1.getStringExtra("key_event");
        RemoteActionCompatParcelizer(stringExtra, stringExtra2 != null ? stringExtra2 : "");
    }

    @getMagicModuleMeta
    public static final Intent IconCompatParcelizer(String str, String str2) {
        return Companion.RemoteActionCompatParcelizer(str, str2);
    }

    /* JADX INFO: renamed from: o.isSpecialNorthAmericanChar$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/isSpecialNorthAmericanChar$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent RemoteActionCompatParcelizer(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent("EventBroadcastReceiver");
            intent.putExtra("key_event_source", p0);
            intent.putExtra("key_event", p1);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
