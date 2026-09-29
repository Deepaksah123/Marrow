package kotlin;

import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C0170format;
import kotlin.isCollectionMapOrArray;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class ByteArraySerializer implements findConstructor {
    private static final Pattern IconCompatParcelizer = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern RemoteActionCompatParcelizer = Pattern.compile("MPEGTS:(-?\\d+)");
    private final boolean AudioAttributesCompatParcelizer;
    private final MinimalClassNameIdResolver AudioAttributesImplApi21Parcelizer;
    private final withTimeZone.IconCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final AsPropertyTypeDeserializer MediaBrowserCompatCustomActionResultReceiver = new AsPropertyTypeDeserializer();
    private byte[] MediaBrowserCompatItemReceiver = new byte[1024];
    private final String read;
    private findRawSuperTypes write;

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    public ByteArraySerializer(String str, MinimalClassNameIdResolver minimalClassNameIdResolver, withTimeZone.IconCompatParcelizer iconCompatParcelizer, boolean z) {
        this.read = str;
        this.AudioAttributesImplApi21Parcelizer = minimalClassNameIdResolver;
        this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = z;
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, 0, 6, false);
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, 6);
        if (updateForValue.read(this.MediaBrowserCompatCustomActionResultReceiver)) {
            return true;
        }
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, 6, 3, false);
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, 9);
        return updateForValue.read(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.write = this.AudioAttributesCompatParcelizer ? new _appendNativeIds(findrawsupertypes, this.AudioAttributesImplApi26Parcelizer) : findrawsupertypes;
        findrawsupertypes.read(new isCollectionMapOrArray.write(C.TIME_UNSET));
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        int i = (int) closeonfailandthrowasioe.read();
        int i2 = this.AudioAttributesImplBaseParcelizer;
        byte[] bArr = this.MediaBrowserCompatItemReceiver;
        if (i2 == bArr.length) {
            this.MediaBrowserCompatItemReceiver = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.MediaBrowserCompatItemReceiver;
        int i3 = this.AudioAttributesImplBaseParcelizer;
        int iAudioAttributesCompatParcelizer = closeonfailandthrowasioe.AudioAttributesCompatParcelizer(bArr2, i3, bArr2.length - i3);
        if (iAudioAttributesCompatParcelizer != -1) {
            int i4 = this.AudioAttributesImplBaseParcelizer + iAudioAttributesCompatParcelizer;
            this.AudioAttributesImplBaseParcelizer = i4;
            if (i == -1 || i4 != i) {
                return 0;
            }
        }
        read();
        return -1;
    }

    private void read() throws SchemaAware {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(this.MediaBrowserCompatItemReceiver);
        updateForValue.RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
        long jIconCompatParcelizer = 0;
        long jWrite = 0;
        for (String strMediaBrowserCompatMediaItem = asPropertyTypeDeserializer.MediaBrowserCompatMediaItem(); !TextUtils.isEmpty(strMediaBrowserCompatMediaItem); strMediaBrowserCompatMediaItem = asPropertyTypeDeserializer.MediaBrowserCompatMediaItem()) {
            if (strMediaBrowserCompatMediaItem.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = IconCompatParcelizer.matcher(strMediaBrowserCompatMediaItem);
                if (!matcher.find()) {
                    throw SchemaAware.RemoteActionCompatParcelizer("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(String.valueOf(strMediaBrowserCompatMediaItem)), null);
                }
                Matcher matcher2 = RemoteActionCompatParcelizer.matcher(strMediaBrowserCompatMediaItem);
                if (!matcher2.find()) {
                    throw SchemaAware.RemoteActionCompatParcelizer("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(String.valueOf(strMediaBrowserCompatMediaItem)), null);
                }
                jWrite = updateForValue.write((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1)));
                jIconCompatParcelizer = MinimalClassNameIdResolver.IconCompatParcelizer(Long.parseLong((String) buildTypeSerializer.IconCompatParcelizer(matcher2.group(1))));
            }
        }
        Matcher matcherIconCompatParcelizer = updateForValue.IconCompatParcelizer(asPropertyTypeDeserializer);
        if (matcherIconCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(0L);
            return;
        }
        long jWrite2 = updateForValue.write((String) buildTypeSerializer.IconCompatParcelizer(matcherIconCompatParcelizer.group(1)));
        long jWrite3 = this.AudioAttributesImplApi21Parcelizer.write(MinimalClassNameIdResolver.read((jIconCompatParcelizer + jWrite2) - jWrite));
        nonNullString nonnullstringAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(jWrite3 - jWrite2);
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer);
        nonnullstringAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer);
        nonnullstringAudioAttributesCompatParcelizer.IconCompatParcelizer(jWrite3, 1, this.AudioAttributesImplBaseParcelizer, 0, null);
    }

    private nonNullString AudioAttributesCompatParcelizer(long j) {
        nonNullString nonnullstringIconCompatParcelizer = this.write.IconCompatParcelizer(0, 3);
        nonnullstringIconCompatParcelizer.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.TEXT_VTT).read(this.read).write(j).IconCompatParcelizer());
        this.write.RemoteActionCompatParcelizer();
        return nonnullstringIconCompatParcelizer;
    }
}
