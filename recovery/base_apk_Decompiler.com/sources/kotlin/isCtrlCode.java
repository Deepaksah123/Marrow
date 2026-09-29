package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0005J\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0005R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/isCtrlCode;", "Lo/handlePreambleAddressCode;", "", "p0", "<init>", "(I)V", "Landroid/content/Context;", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "AudioAttributesCompatParcelizer", "write", "RemoteActionCompatParcelizer", "Landroid/content/IntentFilter;", "()Landroid/content/IntentFilter;", "read", "I", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class isCtrlCode extends handlePreambleAddressCode {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    public void AudioAttributesCompatParcelizer(int p0) {
    }

    public void RemoteActionCompatParcelizer(int p0) {
    }

    public abstract void read(int p0);

    public void write(int p0) {
    }

    private isCtrlCode(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public /* synthetic */ isCtrlCode(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 32255 : i);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context p0, Intent p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p1 == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "BulkDownloadCompleteReceiver", (Object) p1.getAction())) {
            return;
        }
        int intExtra = p1.getIntExtra("type", 4);
        int intExtra2 = p1.getIntExtra("call_type", 4);
        int i = this.RemoteActionCompatParcelizer;
        if (intExtra == i || i == 32255) {
            if (intExtra2 == 1) {
                RemoteActionCompatParcelizer(intExtra);
                return;
            }
            if (intExtra2 == 2) {
                AudioAttributesCompatParcelizer(intExtra);
            } else if (intExtra2 == 3) {
                write(intExtra);
            } else if (intExtra2 == 4) {
                read(intExtra);
            }
        }
    }

    @Override // kotlin.handlePreambleAddressCode
    public final IntentFilter AudioAttributesCompatParcelizer() {
        return new IntentFilter("BulkDownloadCompleteReceiver");
    }

    public isCtrlCode() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: o.isCtrlCode$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\b"}, d2 = {"Lo/isCtrlCode$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(I)Landroid/content/Intent;", "write", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent RemoteActionCompatParcelizer(int p0) {
            Intent intent = new Intent("BulkDownloadCompleteReceiver");
            intent.putExtra("type", p0);
            intent.putExtra("call_type", 4);
            return intent;
        }

        @getMagicModuleMeta
        public static Intent write(int p0) {
            Intent intent = new Intent("BulkDownloadCompleteReceiver");
            intent.putExtra("type", p0);
            intent.putExtra("call_type", 1);
            return intent;
        }

        @getMagicModuleMeta
        public static Intent read(int p0) {
            Intent intent = new Intent("BulkDownloadCompleteReceiver");
            intent.putExtra("type", p0);
            intent.putExtra("call_type", 2);
            return intent;
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(int p0) {
            Intent intent = new Intent("BulkDownloadCompleteReceiver");
            intent.putExtra("type", p0);
            intent.putExtra("call_type", 3);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
