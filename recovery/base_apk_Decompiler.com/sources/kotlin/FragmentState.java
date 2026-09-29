package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/FragmentManagerState;", "", "read", "(Lo/FragmentManagerState;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FragmentState {
    public static final int read(FragmentManagerState fragmentManagerState) {
        long jAudioAttributesImplApi21Parcelizer;
        int i = 0;
        boolean z = fragmentManagerState.RemoteActionCompatParcelizer() == superDispatchKeyEvent.write;
        List<onResumeFragments> listAudioAttributesImplApi21Parcelizer = fragmentManagerState.AudioAttributesImplApi21Parcelizer();
        if (listAudioAttributesImplApi21Parcelizer.isEmpty()) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < listAudioAttributesImplApi21Parcelizer.size()) {
            int i5 = read(z, fragmentManagerState, i2);
            if (i5 == -1) {
                i2++;
            } else {
                int iMax = i;
                while (i2 < listAudioAttributesImplApi21Parcelizer.size() && read(z, fragmentManagerState, i2) == i5) {
                    if (z) {
                        long j = ((long) i) << 32;
                        long j2 = -1;
                        jAudioAttributesImplApi21Parcelizer = ((j2 - ((j2 >> 63) << 32)) | j) & listAudioAttributesImplApi21Parcelizer.get(i2).AudioAttributesImplApi21Parcelizer();
                        i2 = i2;
                    } else {
                        jAudioAttributesImplApi21Parcelizer = listAudioAttributesImplApi21Parcelizer.get(i2).AudioAttributesImplApi21Parcelizer() >> 32;
                    }
                    iMax = Math.max(iMax, (int) jAudioAttributesImplApi21Parcelizer);
                    i2++;
                    i = 0;
                }
                i3 += iMax;
                i4++;
                i = 0;
            }
        }
        return (i3 / i4) + fragmentManagerState.AudioAttributesCompatParcelizer();
    }

    private static final int read(boolean z, FragmentManagerState fragmentManagerState, int i) {
        return z ? fragmentManagerState.AudioAttributesImplApi21Parcelizer().get(i).IconCompatParcelizer() : fragmentManagerState.AudioAttributesImplApi21Parcelizer().get(i).RemoteActionCompatParcelizer();
    }
}
