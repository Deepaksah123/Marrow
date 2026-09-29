package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/setCaptionRowCount;", "Lo/handlePreambleAddressCode;", "Lkotlin/Function0;", "", "p0", "<init>", "(Lo/getCreatedOnDateMs;)V", "Landroid/content/IntentFilter;", "AudioAttributesCompatParcelizer", "()Landroid/content/IntentFilter;", "Landroid/content/Context;", "Landroid/content/Intent;", "p1", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "write", "Lo/getCreatedOnDateMs;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setCaptionRowCount extends handlePreambleAddressCode {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;

    public setCaptionRowCount(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.AudioAttributesCompatParcelizer = getcreatedondatems;
    }

    @Override // kotlin.handlePreambleAddressCode
    public final IntentFilter AudioAttributesCompatParcelizer() {
        return new IntentFilter("DevOptionCheckReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context p0, Intent p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(p1 != null ? p1.getAction() : null, "DevOptionCheckReceiver")) {
            this.AudioAttributesCompatParcelizer.invoke();
        }
    }

    /* JADX INFO: renamed from: o.setCaptionRowCount$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setCaptionRowCount$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "()Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer() {
            return new Intent("DevOptionCheckReceiver");
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final Intent RemoteActionCompatParcelizer() {
        return Companion.AudioAttributesCompatParcelizer();
    }
}
