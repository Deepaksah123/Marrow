package kotlin;

import kotlin.Metadata;
import kotlin.onForceLoad;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lo/UTF32Reader;", "Lo/onForceLoad$write;", "", "p0", "write", "(Lo/UTF32Reader;I)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class deliverResult {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int write(UTF32Reader<onForceLoad.write<T>> uTF32Reader, int i) {
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer() - 1;
        int i2 = 0;
        while (i2 < audioAttributesCompatParcelizer) {
            int i3 = ((audioAttributesCompatParcelizer - i2) / 2) + i2;
            int iconCompatParcelizer = uTF32Reader.IconCompatParcelizer[i3].getIconCompatParcelizer();
            if (iconCompatParcelizer != i) {
                if (iconCompatParcelizer < i) {
                    i2 = i3 + 1;
                    if (i < uTF32Reader.IconCompatParcelizer[i2].getIconCompatParcelizer()) {
                    }
                } else {
                    audioAttributesCompatParcelizer = i3 - 1;
                }
            }
            return i3;
        }
        return i2;
    }
}
