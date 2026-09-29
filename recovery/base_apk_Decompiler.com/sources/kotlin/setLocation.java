package kotlin;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.getDefaultImpl;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class setLocation implements withTimeZone {
    private final int AudioAttributesCompatParcelizer;
    private final AsPropertyTypeDeserializer AudioAttributesImplBaseParcelizer = new AsPropertyTypeDeserializer();
    private final String IconCompatParcelizer;
    private final float MediaBrowserCompatItemReceiver;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    private final boolean write;

    @Override // kotlin.withTimeZone
    public final int IconCompatParcelizer() {
        return 2;
    }

    public setLocation(List<byte[]> list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.RemoteActionCompatParcelizer = bArr[24];
            this.AudioAttributesCompatParcelizer = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.IconCompatParcelizer = "Serif".equals(LaissezFaireSubTypeValidator.write(bArr, 43, bArr.length - 43)) ? C.SERIF_NAME : str;
            int i = bArr[25] * 20;
            this.read = i;
            boolean z = (bArr[0] & 32) != 0;
            this.write = z;
            if (z) {
                this.MediaBrowserCompatItemReceiver = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, BitmapDescriptorFactory.HUE_RED, 0.95f);
                return;
            } else {
                this.MediaBrowserCompatItemReceiver = 0.85f;
                return;
            }
        }
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesCompatParcelizer = -1;
        this.IconCompatParcelizer = C.SANS_SERIF_NAME;
        this.write = false;
        this.MediaBrowserCompatItemReceiver = 0.85f;
        this.read = -1;
    }

    @Override // kotlin.withTimeZone
    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, withTimeZone.RemoteActionCompatParcelizer remoteActionCompatParcelizer, TypeSerializer<pad3> typeSerializer) {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(bArr, i2 + i);
        this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver(i);
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        if (strAudioAttributesCompatParcelizer.isEmpty()) {
            typeSerializer.read(new pad3(initExtraTracks.AudioAttributesImplApi26Parcelizer(), C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strAudioAttributesCompatParcelizer);
        AudioAttributesCompatParcelizer(spannableStringBuilder, this.RemoteActionCompatParcelizer, 0, 0, spannableStringBuilder.length(), 16711680);
        write(spannableStringBuilder, this.AudioAttributesCompatParcelizer, -1, 0, spannableStringBuilder.length(), 16711680);
        AudioAttributesCompatParcelizer(spannableStringBuilder, this.IconCompatParcelizer, spannableStringBuilder.length());
        float fAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver;
        while (true) {
            if (this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer() >= 8) {
                int iWrite = this.AudioAttributesImplBaseParcelizer.write();
                int iMediaBrowserCompatItemReceiver = this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver();
                int iMediaBrowserCompatItemReceiver2 = this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver();
                if (iMediaBrowserCompatItemReceiver2 == 1937013100) {
                    buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer() >= 2);
                    int iOnPrepare = this.AudioAttributesImplBaseParcelizer.onPrepare();
                    for (int i3 = 0; i3 < iOnPrepare; i3++) {
                        AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer, spannableStringBuilder);
                    }
                } else if (iMediaBrowserCompatItemReceiver2 == 1952608120 && this.write) {
                    buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer() >= 2);
                    fAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer.onPrepare() / this.read, BitmapDescriptorFactory.HUE_RED, 0.95f);
                }
                this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver(iWrite + iMediaBrowserCompatItemReceiver);
            } else {
                typeSerializer.read(new pad3(initExtraTracks.read(new getDefaultImpl.write().RemoteActionCompatParcelizer(spannableStringBuilder).write(fAudioAttributesCompatParcelizer, 0).read(0).write()), C.TIME_UNSET, C.TIME_UNSET));
                return;
            }
        }
    }

    private static String AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        buildTypeSerializer.IconCompatParcelizer(asPropertyTypeDeserializer.IconCompatParcelizer() >= 2);
        int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
        if (iOnPrepare == 0) {
            return "";
        }
        int iWrite = asPropertyTypeDeserializer.write();
        Charset charsetOnPrepareFromMediaId = asPropertyTypeDeserializer.onPrepareFromMediaId();
        int iWrite2 = asPropertyTypeDeserializer.write();
        if (charsetOnPrepareFromMediaId == null) {
            charsetOnPrepareFromMediaId = parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer;
        }
        return asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(iOnPrepare - (iWrite2 - iWrite), charsetOnPrepareFromMediaId);
    }

    private void AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, SpannableStringBuilder spannableStringBuilder) {
        buildTypeSerializer.IconCompatParcelizer(asPropertyTypeDeserializer.IconCompatParcelizer() >= 12);
        int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
        int iOnPrepare2 = asPropertyTypeDeserializer.onPrepare();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if (iOnPrepare2 > spannableStringBuilder.length()) {
            StringBuilder sb = new StringBuilder("Truncating styl end (");
            sb.append(iOnPrepare2);
            sb.append(") to cueText.length() (");
            sb.append(spannableStringBuilder.length());
            sb.append(").");
            prune.RemoteActionCompatParcelizer("Tx3gParser", sb.toString());
            iOnPrepare2 = spannableStringBuilder.length();
        }
        if (iOnPrepare >= iOnPrepare2) {
            StringBuilder sb2 = new StringBuilder("Ignoring styl with start (");
            sb2.append(iOnPrepare);
            sb2.append(") >= end (");
            sb2.append(iOnPrepare2);
            sb2.append(").");
            prune.RemoteActionCompatParcelizer("Tx3gParser", sb2.toString());
            return;
        }
        int i = iOnPrepare2;
        AudioAttributesCompatParcelizer(spannableStringBuilder, iOnPlayFromMediaId, this.RemoteActionCompatParcelizer, iOnPrepare, i, 0);
        write(spannableStringBuilder, iMediaBrowserCompatItemReceiver, this.AudioAttributesCompatParcelizer, iOnPrepare, i, 0);
    }

    private static void AudioAttributesCompatParcelizer(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    private static void write(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i & 255) << 24) | (i >>> 8)), i3, i4, i5 | 33);
        }
    }

    private static void AudioAttributesCompatParcelizer(SpannableStringBuilder spannableStringBuilder, String str, int i) {
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, i, 16711713);
        }
    }
}
