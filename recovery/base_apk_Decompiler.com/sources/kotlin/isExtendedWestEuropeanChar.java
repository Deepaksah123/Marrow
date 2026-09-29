package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/isExtendedWestEuropeanChar;", "Lo/handlePreambleAddressCode;", "<init>", "()V", "Landroid/content/IntentFilter;", "AudioAttributesCompatParcelizer", "()Landroid/content/IntentFilter;", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "p2", "Landroid/os/Bundle;", "p3", "write", "(Landroid/content/Context;II)V", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class isExtendedWestEuropeanChar extends handlePreambleAddressCode {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract void write(Context context, int i, int i2);

    @Override // kotlin.handlePreambleAddressCode
    public final IntentFilter AudioAttributesCompatParcelizer() {
        return new IntentFilter("ConfirmationButtonTapReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context p0, Intent p1) {
        String action;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p1 == null || (action = p1.getAction()) == null || !"ConfirmationButtonTapReceiver".contentEquals(action)) {
            return;
        }
        int intExtra = p1.getIntExtra("button_type", 1);
        int intExtra2 = p1.getIntExtra("dialog_for", 0);
        p1.getBundleExtra("arguments");
        write(p0, intExtra2, intExtra);
    }

    /* JADX INFO: renamed from: o.isExtendedWestEuropeanChar$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lo/isExtendedWestEuropeanChar$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "Landroid/os/Bundle;", "p1", "Landroid/content/Intent;", "read", "(ILandroid/os/Bundle;)Landroid/content/Intent;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent read(int p0, Bundle p1) {
            Intent intent = new Intent("ConfirmationButtonTapReceiver");
            intent.putExtra("button_type", 1);
            intent.putExtra("dialog_for", p0);
            intent.putExtra("arguments", p1);
            return intent;
        }

        public static Intent AudioAttributesCompatParcelizer(int p0, Bundle p1) {
            Intent intent = new Intent("ConfirmationButtonTapReceiver");
            intent.putExtra("button_type", 2);
            intent.putExtra("dialog_for", p0);
            intent.putExtra("arguments", p1);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
