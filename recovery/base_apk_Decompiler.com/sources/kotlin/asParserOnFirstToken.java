package kotlin;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import kotlin.getDefaultImpl;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class asParserOnFirstToken implements withTimeZone {
    private Inflater write;
    private final AsPropertyTypeDeserializer IconCompatParcelizer = new AsPropertyTypeDeserializer();
    private final AsPropertyTypeDeserializer AudioAttributesCompatParcelizer = new AsPropertyTypeDeserializer();
    private final write read = new write();

    @Override // kotlin.withTimeZone
    public final int IconCompatParcelizer() {
        return 2;
    }

    @Override // kotlin.withTimeZone
    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, withTimeZone.RemoteActionCompatParcelizer remoteActionCompatParcelizer, TypeSerializer<pad3> typeSerializer) {
        this.IconCompatParcelizer.IconCompatParcelizer(bArr, i2 + i);
        this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i);
        RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        this.read.RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        while (this.IconCompatParcelizer.IconCompatParcelizer() >= 3) {
            getDefaultImpl getdefaultimplAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.read);
            if (getdefaultimplAudioAttributesCompatParcelizer != null) {
                arrayList.add(getdefaultimplAudioAttributesCompatParcelizer);
            }
        }
        typeSerializer.read(new pad3(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }

    private void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        if (asPropertyTypeDeserializer.IconCompatParcelizer() <= 0 || asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer() != 120) {
            return;
        }
        if (this.write == null) {
            this.write = new Inflater();
        }
        if (LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, this.AudioAttributesCompatParcelizer, this.write)) {
            asPropertyTypeDeserializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), this.AudioAttributesCompatParcelizer.read());
        }
    }

    private static getDefaultImpl AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, write writeVar) {
        int i = asPropertyTypeDeserializer.read();
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
        int iWrite = asPropertyTypeDeserializer.write() + iOnPrepare;
        getDefaultImpl getdefaultimplIconCompatParcelizer = null;
        if (iWrite > i) {
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i);
            return null;
        }
        if (iOnPlayFromMediaId == 128) {
            getdefaultimplIconCompatParcelizer = writeVar.IconCompatParcelizer();
            writeVar.RemoteActionCompatParcelizer();
        } else {
            switch (iOnPlayFromMediaId) {
                case 20:
                    writeVar.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, iOnPrepare);
                    break;
                case 21:
                    writeVar.write(asPropertyTypeDeserializer, iOnPrepare);
                    break;
                case 22:
                    writeVar.IconCompatParcelizer(asPropertyTypeDeserializer, iOnPrepare);
                    break;
            }
        }
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
        return getdefaultimplIconCompatParcelizer;
    }

    static final class write {
        private int AudioAttributesCompatParcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;
        private int read;
        private int write;
        private final AsPropertyTypeDeserializer RemoteActionCompatParcelizer = new AsPropertyTypeDeserializer();
        private final int[] AudioAttributesImplApi26Parcelizer = new int[256];

        /* JADX INFO: Access modifiers changed from: private */
        public void AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
            if (i % 5 != 2) {
                return;
            }
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
            Arrays.fill(this.AudioAttributesImplApi26Parcelizer, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
                int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
                int iOnPlayFromMediaId3 = asPropertyTypeDeserializer.onPlayFromMediaId();
                int iOnPlayFromMediaId4 = asPropertyTypeDeserializer.onPlayFromMediaId();
                double d = iOnPlayFromMediaId2;
                double d2 = iOnPlayFromMediaId3 - 128;
                double d3 = iOnPlayFromMediaId4 - 128;
                int[] iArr = this.AudioAttributesImplApi26Parcelizer;
                iArr[iOnPlayFromMediaId] = (LaissezFaireSubTypeValidator.write((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (asPropertyTypeDeserializer.onPlayFromMediaId() << 24) | (LaissezFaireSubTypeValidator.write((int) ((1.402d * d2) + d), 0, 255) << 16) | LaissezFaireSubTypeValidator.write((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.MediaBrowserCompatItemReceiver = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
            int iOnPause;
            if (i >= 4) {
                asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(3);
                int i2 = i - 4;
                if ((asPropertyTypeDeserializer.onPlayFromMediaId() & 128) != 0) {
                    if (i2 < 7 || (iOnPause = asPropertyTypeDeserializer.onPause()) < 4) {
                        return;
                    }
                    this.IconCompatParcelizer = asPropertyTypeDeserializer.onPrepare();
                    this.AudioAttributesCompatParcelizer = asPropertyTypeDeserializer.onPrepare();
                    this.RemoteActionCompatParcelizer.write(iOnPause - 4);
                    i2 = i - 11;
                }
                int iWrite = this.RemoteActionCompatParcelizer.write();
                int i3 = this.RemoteActionCompatParcelizer.read();
                if (iWrite >= i3 || i2 <= 0) {
                    return;
                }
                int iMin = Math.min(i2, i3 - iWrite);
                asPropertyTypeDeserializer.write(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), iWrite, iMin);
                this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(iWrite + iMin);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
            if (i < 19) {
                return;
            }
            this.AudioAttributesImplBaseParcelizer = asPropertyTypeDeserializer.onPrepare();
            this.MediaBrowserCompatCustomActionResultReceiver = asPropertyTypeDeserializer.onPrepare();
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(11);
            this.write = asPropertyTypeDeserializer.onPrepare();
            this.read = asPropertyTypeDeserializer.onPrepare();
        }

        public final getDefaultImpl IconCompatParcelizer() {
            int iOnPlayFromMediaId;
            if (this.AudioAttributesImplBaseParcelizer == 0 || this.MediaBrowserCompatCustomActionResultReceiver == 0 || this.IconCompatParcelizer == 0 || this.AudioAttributesCompatParcelizer == 0 || this.RemoteActionCompatParcelizer.read() == 0 || this.RemoteActionCompatParcelizer.write() != this.RemoteActionCompatParcelizer.read() || !this.MediaBrowserCompatItemReceiver) {
                return null;
            }
            this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
            int i = this.IconCompatParcelizer * this.AudioAttributesCompatParcelizer;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int iOnPlayFromMediaId2 = this.RemoteActionCompatParcelizer.onPlayFromMediaId();
                if (iOnPlayFromMediaId2 != 0) {
                    iOnPlayFromMediaId = i2 + 1;
                    iArr[i2] = this.AudioAttributesImplApi26Parcelizer[iOnPlayFromMediaId2];
                } else {
                    int iOnPlayFromMediaId3 = this.RemoteActionCompatParcelizer.onPlayFromMediaId();
                    if (iOnPlayFromMediaId3 != 0) {
                        iOnPlayFromMediaId = ((iOnPlayFromMediaId3 & 64) == 0 ? iOnPlayFromMediaId3 & 63 : ((iOnPlayFromMediaId3 & 63) << 8) | this.RemoteActionCompatParcelizer.onPlayFromMediaId()) + i2;
                        Arrays.fill(iArr, i2, iOnPlayFromMediaId, (iOnPlayFromMediaId3 & 128) == 0 ? this.AudioAttributesImplApi26Parcelizer[0] : this.AudioAttributesImplApi26Parcelizer[this.RemoteActionCompatParcelizer.onPlayFromMediaId()]);
                    }
                }
                i2 = iOnPlayFromMediaId;
            }
            return new getDefaultImpl.write().read(Bitmap.createBitmap(iArr, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, Bitmap.Config.ARGB_8888)).RemoteActionCompatParcelizer(this.write / this.AudioAttributesImplBaseParcelizer).IconCompatParcelizer(0).write(this.read / this.MediaBrowserCompatCustomActionResultReceiver, 0).read(0).read(this.IconCompatParcelizer / this.AudioAttributesImplBaseParcelizer).AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer / this.MediaBrowserCompatCustomActionResultReceiver).write();
        }

        public final void RemoteActionCompatParcelizer() {
            this.AudioAttributesImplBaseParcelizer = 0;
            this.MediaBrowserCompatCustomActionResultReceiver = 0;
            this.write = 0;
            this.read = 0;
            this.IconCompatParcelizer = 0;
            this.AudioAttributesCompatParcelizer = 0;
            this.RemoteActionCompatParcelizer.write(0);
            this.MediaBrowserCompatItemReceiver = false;
        }
    }
}
