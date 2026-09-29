package kotlin;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class readFully extends peekFully {
    private static final int[] RemoteActionCompatParcelizer = {1};
    private static final int[] write = {1, 0};
    private int read = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.peekFully
    public final getLength AudioAttributesCompatParcelizer(readFromUpstream readfromupstream, View view) {
        float fIconCompatParcelizer = readfromupstream.IconCompatParcelizer();
        if (readfromupstream.RemoteActionCompatParcelizer()) {
            fIconCompatParcelizer = readfromupstream.AudioAttributesCompatParcelizer();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (readfromupstream.RemoteActionCompatParcelizer()) {
            f = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f2 = f;
        float fIconCompatParcelizer2 = getPeekPosition.IconCompatParcelizer(view.getContext()) + f2;
        float fWrite = getPeekPosition.write(view.getContext()) + f2;
        float fMin = Math.min(measuredHeight + f2, fIconCompatParcelizer);
        float fWrite2 = StdKeyDeserializer.write((measuredHeight / 3.0f) + f2, getPeekPosition.IconCompatParcelizer(view.getContext()) + f2, getPeekPosition.write(view.getContext()) + f2);
        float f3 = (fMin + fWrite2) / 2.0f;
        int[] iArr = RemoteActionCompatParcelizer;
        if (fIconCompatParcelizer < 2.0f * fIconCompatParcelizer2) {
            iArr = new int[]{0};
        }
        int[] iArr2 = write;
        if (readfromupstream.write() == 1) {
            iArr = read(iArr);
            iArr2 = read(iArr2);
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int iMax = (int) Math.max(1.0d, Math.floor(((fIconCompatParcelizer - (getPeekPosition.AudioAttributesCompatParcelizer(iArr4) * f3)) - (getPeekPosition.AudioAttributesCompatParcelizer(iArr3) * fWrite)) / fMin));
        int iCeil = (int) Math.ceil(fIconCompatParcelizer / fMin);
        int i = (iCeil - iMax) + 1;
        int[] iArr5 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr5[i2] = iCeil - i2;
        }
        ensureSpaceForPeek ensurespaceforpeekAudioAttributesCompatParcelizer = ensureSpaceForPeek.AudioAttributesCompatParcelizer(fIconCompatParcelizer, fWrite2, fIconCompatParcelizer2, fWrite, iArr3, f3, iArr4, fMin, iArr5);
        this.read = ensurespaceforpeekAudioAttributesCompatParcelizer.write();
        if (IconCompatParcelizer(ensurespaceforpeekAudioAttributesCompatParcelizer, readfromupstream.onPrepareFromMediaId())) {
            ensurespaceforpeekAudioAttributesCompatParcelizer = ensureSpaceForPeek.AudioAttributesCompatParcelizer(fIconCompatParcelizer, fWrite2, fIconCompatParcelizer2, fWrite, new int[]{ensurespaceforpeekAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer}, f3, new int[]{ensurespaceforpeekAudioAttributesCompatParcelizer.write}, fMin, new int[]{ensurespaceforpeekAudioAttributesCompatParcelizer.IconCompatParcelizer});
        }
        return getPeekPosition.IconCompatParcelizer(view.getContext(), f2, fIconCompatParcelizer, ensurespaceforpeekAudioAttributesCompatParcelizer, readfromupstream.write());
    }

    private static boolean IconCompatParcelizer(ensureSpaceForPeek ensurespaceforpeek, int i) {
        int iWrite = ensurespaceforpeek.write() - i;
        boolean z = iWrite > 0 && (ensurespaceforpeek.RemoteActionCompatParcelizer > 0 || ensurespaceforpeek.write > 1);
        while (iWrite > 0) {
            if (ensurespaceforpeek.RemoteActionCompatParcelizer > 0) {
                ensurespaceforpeek.RemoteActionCompatParcelizer--;
            } else if (ensurespaceforpeek.write > 1) {
                ensurespaceforpeek.write--;
            }
            iWrite--;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.peekFully
    public final boolean write(readFromUpstream readfromupstream, int i) {
        if (i >= this.read || readfromupstream.onPrepareFromMediaId() < this.read) {
            return i >= this.read && readfromupstream.onPrepareFromMediaId() < this.read;
        }
        return true;
    }
}
