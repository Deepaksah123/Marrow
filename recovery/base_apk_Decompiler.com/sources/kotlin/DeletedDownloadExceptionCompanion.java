package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class DeletedDownloadExceptionCompanion extends InteractivePanelTextView {
    private final int AudioAttributesCompatParcelizer;
    private final InteractivePanelTextView[] RemoteActionCompatParcelizer;

    public DeletedDownloadExceptionCompanion(byte[] bArr, int i) {
        this(bArr, i, (byte) 0);
    }

    private DeletedDownloadExceptionCompanion(byte[] bArr, int i, byte b) {
        super(bArr, i);
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = 1000;
    }

    public DeletedDownloadExceptionCompanion(InteractivePanelTextView[] interactivePanelTextViewArr) {
        this(interactivePanelTextViewArr, (byte) 0);
    }

    private DeletedDownloadExceptionCompanion(InteractivePanelTextView[] interactivePanelTextViewArr, byte b) {
        super(write(interactivePanelTextViewArr), false);
        this.RemoteActionCompatParcelizer = interactivePanelTextViewArr;
        this.AudioAttributesCompatParcelizer = 1000;
    }

    static byte[] write(InteractivePanelTextView[] interactivePanelTextViewArr) {
        int length = interactivePanelTextViewArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return interactivePanelTextViewArr[0].IconCompatParcelizer;
        }
        int i = length - 1;
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr = interactivePanelTextViewArr[i2].IconCompatParcelizer;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            length2 += bArr.length - 1;
        }
        byte[] bArr2 = interactivePanelTextViewArr[i].IconCompatParcelizer;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[length2 + bArr2.length];
        bArr3[0] = b;
        int i3 = 1;
        for (InteractivePanelTextView interactivePanelTextView : interactivePanelTextViewArr) {
            byte[] bArr4 = interactivePanelTextView.IconCompatParcelizer;
            int length3 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i3, length3);
            i3 += length3;
        }
        return bArr3;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        if (!write()) {
            setNetworkObserver.IconCompatParcelizer(setminimumwidthmargin, z, this.IconCompatParcelizer, this.IconCompatParcelizer.length);
            return;
        }
        setminimumwidthmargin.write(z, 35);
        setminimumwidthmargin.write(128);
        InteractivePanelTextView[] interactivePanelTextViewArr = this.RemoteActionCompatParcelizer;
        if (interactivePanelTextViewArr != null) {
            setminimumwidthmargin.AudioAttributesCompatParcelizer(interactivePanelTextViewArr);
        } else if (this.IconCompatParcelizer.length >= 2) {
            byte b = this.IconCompatParcelizer[0];
            int length = this.IconCompatParcelizer.length;
            int i = length - 1;
            int i2 = this.AudioAttributesCompatParcelizer - 1;
            while (i > i2) {
                setNetworkObserver.read(setminimumwidthmargin, (byte) 0, this.IconCompatParcelizer, length - i, i2);
                i -= i2;
            }
            setNetworkObserver.read(setminimumwidthmargin, b, this.IconCompatParcelizer, length - i, i);
        }
        setminimumwidthmargin.write(0);
        setminimumwidthmargin.write(0);
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return this.RemoteActionCompatParcelizer != null || this.IconCompatParcelizer.length > this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) throws IOException {
        if (!write()) {
            return setNetworkObserver.IconCompatParcelizer(z, this.IconCompatParcelizer.length);
        }
        int iWrite = z ? 4 : 3;
        if (this.RemoteActionCompatParcelizer == null) {
            if (this.IconCompatParcelizer.length < 2) {
                return iWrite;
            }
            int length = this.IconCompatParcelizer.length;
            int i = this.AudioAttributesCompatParcelizer;
            int i2 = (length - 2) / (i - 1);
            return iWrite + (setNetworkObserver.IconCompatParcelizer(true, i) * i2) + setNetworkObserver.IconCompatParcelizer(true, this.IconCompatParcelizer.length - (i2 * (this.AudioAttributesCompatParcelizer - 1)));
        }
        int i3 = 0;
        while (true) {
            InteractivePanelTextView[] interactivePanelTextViewArr = this.RemoteActionCompatParcelizer;
            if (i3 >= interactivePanelTextViewArr.length) {
                return iWrite;
            }
            iWrite += interactivePanelTextViewArr[i3].write(true);
            i3++;
        }
    }
}
