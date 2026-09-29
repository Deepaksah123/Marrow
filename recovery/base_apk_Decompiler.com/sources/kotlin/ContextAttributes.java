package kotlin;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/ContextAttributes;", "", "<init>", "()V", "Landroid/content/res/Resources;", "p0", "", "p1", "Landroid/util/TypedValue;", "write", "(Landroid/content/res/Resources;I)Landroid/util/TypedValue;", "", "AudioAttributesCompatParcelizer", "Lo/setProvider;", "IconCompatParcelizer", "Lo/setProvider;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContextAttributes {
    private final setProvider<TypedValue> IconCompatParcelizer = new setProvider<>(0, 1, null);

    public final TypedValue write(Resources p0, int p1) {
        TypedValue typedValueAudioAttributesCompatParcelizer;
        synchronized (this) {
            typedValueAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p1);
            if (typedValueAudioAttributesCompatParcelizer == null) {
                typedValueAudioAttributesCompatParcelizer = new TypedValue();
                p0.getValue(p1, typedValueAudioAttributesCompatParcelizer, true);
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p1, typedValueAudioAttributesCompatParcelizer);
            }
        }
        return typedValueAudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer() {
        synchronized (this) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }
}
