package kotlin;

import android.content.Intent;
import android.os.Bundle;
import java.util.Calendar;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/marrow2/ui/test/landing/model/HomeTestArgument;", "", "selectedYear", "", "selectedTab", "showToolbar", "", "<init>", "(IIZ)V", "getSelectedYear", "()I", "getSelectedTab", "getShowToolbar", "()Z", "loadToIntent", "", "intent", "Landroid/content/Intent;", "get", "Landroid/os/Bundle;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setBalance {
    public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer(null);
    private final int AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final boolean write;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/setBalance$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/setBalance;", "RemoteActionCompatParcelizer", "(Landroid/content/Intent;)Lo/setBalance;", "Lo/POJOPropertyBuilder5;", "read", "(Lo/POJOPropertyBuilder5;)Lo/setBalance;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public static setBalance RemoteActionCompatParcelizer(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle extras = p0.getExtras();
            if (extras != null) {
                return new setBalance(extras.getInt("selected_year", Calendar.getInstance().get(1)), extras.getInt("selected_tab_index"), extras.getBoolean("show_toolbar"));
            }
            return null;
        }

        public static setBalance read(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Integer num = (Integer) p0.write("selected_year");
            int iIntValue = num != null ? num.intValue() : Calendar.getInstance().get(1);
            Integer num2 = (Integer) p0.write("selected_tab_index");
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            Boolean bool = (Boolean) p0.write("show_toolbar");
            return new setBalance(iIntValue, iIntValue2, bool != null ? bool.booleanValue() : false);
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public setBalance(int i, int i2, boolean z) {
        this.AudioAttributesCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
        this.write = z;
    }

    public /* synthetic */ setBalance(int i, int i2, boolean z, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, i2, (i3 & 4) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public final void AudioAttributesCompatParcelizer(Intent intent) {
        toMagicModuleMetaRepoModel.write(intent, "");
        intent.putExtra("selected_year", this.AudioAttributesCompatParcelizer);
        intent.putExtra("selected_tab_index", this.IconCompatParcelizer);
        intent.putExtra("show_toolbar", this.write);
    }

    public final Bundle write() {
        Bundle bundle = new Bundle();
        bundle.putInt("selected_year", this.AudioAttributesCompatParcelizer);
        bundle.putInt("selected_tab_index", this.IconCompatParcelizer);
        bundle.putBoolean("show_toolbar", this.write);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static setBalance read(int i, int i2, boolean z) {
        return new setBalance(i, i2, true);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof setBalance)) {
            return false;
        }
        setBalance setbalance = (setBalance) other;
        return this.AudioAttributesCompatParcelizer == setbalance.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == setbalance.IconCompatParcelizer && this.write == setbalance.write;
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.write);
    }

    public final String toString() {
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        boolean z = this.write;
        StringBuilder sb = new StringBuilder("HomeTestArgument(selectedYear=");
        sb.append(i);
        sb.append(", selectedTab=");
        sb.append(i2);
        sb.append(", showToolbar=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
