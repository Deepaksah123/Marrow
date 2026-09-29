package kotlin;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lo/getUseArtwork;", "", "<init>", "()V", "Lo/constructType;", "p0", "", "read", "(Landroid/view/KeyEvent;)Ljava/lang/Integer;", "RemoteActionCompatParcelizer", "Ljava/lang/Integer;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getUseArtwork {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private Integer write;

    public final Integer read(KeyEvent p0) {
        int iAudioAttributesCompatParcelizer = _throwSubtypeClassNotAllowed.AudioAttributesCompatParcelizer(p0);
        if ((Integer.MIN_VALUE & iAudioAttributesCompatParcelizer) != 0) {
            this.write = Integer.valueOf(iAudioAttributesCompatParcelizer & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.write;
        if (num != null) {
            this.write = null;
            Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iAudioAttributesCompatParcelizer));
            Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
            if (num2 != null) {
                iAudioAttributesCompatParcelizer = num2.intValue();
            }
            return Integer.valueOf(iAudioAttributesCompatParcelizer);
        }
        return Integer.valueOf(iAudioAttributesCompatParcelizer);
    }
}
