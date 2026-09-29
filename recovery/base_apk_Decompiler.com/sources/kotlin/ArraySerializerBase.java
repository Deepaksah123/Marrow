package kotlin;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.exoplayer.hls.HlsTrackMetadataEntry;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.C0170format;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class ArraySerializerBase implements _getReferencedIfPresent {
    private static final int[] IconCompatParcelizer = {8, 13, 11, 2, 0, 1, 7};
    private final boolean AudioAttributesCompatParcelizer;
    private withTimeZone.IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private final int RemoteActionCompatParcelizer;
    private boolean read;

    public ArraySerializerBase() {
        this((byte) 0);
    }

    private ArraySerializerBase(byte b) {
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesCompatParcelizer = true;
        this.MediaBrowserCompatCustomActionResultReceiver = new _clearFormats();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin._getReferencedIfPresent
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public WritableObjectId AudioAttributesCompatParcelizer(Uri uri, C0170format c0170format, List<C0170format> list, MinimalClassNameIdResolver minimalClassNameIdResolver, Map<String, List<String>> map, closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        int iRemoteActionCompatParcelizer = JsonNumberFormatVisitor.RemoteActionCompatParcelizer(c0170format.onPlayFromUri);
        int iIconCompatParcelizer = JsonNumberFormatVisitor.IconCompatParcelizer(map);
        int i = JsonNumberFormatVisitor.read(uri);
        int[] iArr = IconCompatParcelizer;
        ArrayList arrayList = new ArrayList(iArr.length);
        IconCompatParcelizer(iRemoteActionCompatParcelizer, arrayList);
        IconCompatParcelizer(iIconCompatParcelizer, arrayList);
        IconCompatParcelizer(i, arrayList);
        for (int i2 : iArr) {
            IconCompatParcelizer(i2, arrayList);
        }
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        findConstructor findconstructor = null;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int iIntValue = ((Integer) arrayList.get(i3)).intValue();
            findConstructor findconstructor2 = (findConstructor) buildTypeSerializer.IconCompatParcelizer(write(iIntValue, c0170format, list, minimalClassNameIdResolver));
            if (IconCompatParcelizer(findconstructor2, closeonfailandthrowasioe)) {
                return new WritableObjectId(findconstructor2, c0170format, minimalClassNameIdResolver, this.MediaBrowserCompatCustomActionResultReceiver, this.read);
            }
            if (findconstructor == null && (iIntValue == iRemoteActionCompatParcelizer || iIntValue == iIconCompatParcelizer || iIntValue == i || iIntValue == 11)) {
                findconstructor = findconstructor2;
            }
        }
        return new WritableObjectId((findConstructor) buildTypeSerializer.IconCompatParcelizer(findconstructor), c0170format, minimalClassNameIdResolver, this.MediaBrowserCompatCustomActionResultReceiver, this.read);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin._getReferencedIfPresent
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ArraySerializerBase IconCompatParcelizer(withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin._getReferencedIfPresent
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public ArraySerializerBase write(boolean z) {
        this.read = z;
        return this;
    }

    @Override // kotlin._getReferencedIfPresent
    public final C0170format write(C0170format c0170format) {
        String string;
        if (!this.read || !this.MediaBrowserCompatCustomActionResultReceiver.write(c0170format)) {
            return c0170format;
        }
        C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = c0170format.write().AudioAttributesImplApi26Parcelizer("application/x-media3-cues").IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(c0170format));
        StringBuilder sb = new StringBuilder();
        sb.append(c0170format.onPlayFromUri);
        if (c0170format.RemoteActionCompatParcelizer != null) {
            StringBuilder sb2 = new StringBuilder(" ");
            sb2.append(c0170format.RemoteActionCompatParcelizer);
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        return remoteActionCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer(sb.toString()).write(Long.MAX_VALUE).IconCompatParcelizer();
    }

    private static void IconCompatParcelizer(int i, List<Integer> list) {
        if (parseTextAttribute.AudioAttributesCompatParcelizer(IconCompatParcelizer, i) == -1 || list.contains(Integer.valueOf(i))) {
            return;
        }
        list.add(Integer.valueOf(i));
    }

    private findConstructor write(int i, C0170format c0170format, List<C0170format> list, MinimalClassNameIdResolver minimalClassNameIdResolver) {
        if (i == 0) {
            return new TypeKey();
        }
        if (i == 1) {
            return new isTyped();
        }
        if (i == 2) {
            return new getPrevious();
        }
        if (i == 7) {
            return new IgnorePropertiesUtil(0, 0L);
        }
        if (i == 8) {
            return read(this.MediaBrowserCompatCustomActionResultReceiver, this.read, minimalClassNameIdResolver, c0170format, list);
        }
        if (i == 11) {
            return write(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, c0170format, list, minimalClassNameIdResolver, this.MediaBrowserCompatCustomActionResultReceiver, this.read);
        }
        if (i != 13) {
            return null;
        }
        return new ByteArraySerializer(c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, minimalClassNameIdResolver, this.MediaBrowserCompatCustomActionResultReceiver, this.read);
    }

    private static removeFirst write(int i, boolean z, C0170format c0170format, List<C0170format> list, MinimalClassNameIdResolver minimalClassNameIdResolver, withTimeZone.IconCompatParcelizer iconCompatParcelizer, boolean z2) {
        int i2;
        int i3 = i | 16;
        if (list != null) {
            i3 = i | 48;
        } else if (z) {
            list = Collections.singletonList(new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_CEA608).IconCompatParcelizer());
        } else {
            list = Collections.emptyList();
        }
        String str = c0170format.RemoteActionCompatParcelizer;
        if (!TextUtils.isEmpty(str)) {
            if (!DefaultBaseTypeLimitingValidator.RemoteActionCompatParcelizer(str, MimeTypes.AUDIO_AAC)) {
                i3 |= 2;
            }
            if (!DefaultBaseTypeLimitingValidator.RemoteActionCompatParcelizer(str, MimeTypes.VIDEO_H264)) {
                i3 |= 4;
            }
        }
        if (z2) {
            i2 = 0;
        } else {
            iconCompatParcelizer = withTimeZone.IconCompatParcelizer.AudioAttributesCompatParcelizer;
            i2 = 1;
        }
        return new removeFirst(2, i2, iconCompatParcelizer, minimalClassNameIdResolver, new setPrevious(i3, list), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    private static NameTransformerChained read(withTimeZone.IconCompatParcelizer iconCompatParcelizer, boolean z, MinimalClassNameIdResolver minimalClassNameIdResolver, C0170format c0170format, List<C0170format> list) {
        int i = IconCompatParcelizer(c0170format) ? 4 : 0;
        if (!z) {
            iconCompatParcelizer = withTimeZone.IconCompatParcelizer.AudioAttributesCompatParcelizer;
            i |= 32;
        }
        withTimeZone.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
        int i2 = i;
        if (list == null) {
            list = initExtraTracks.AudioAttributesImplApi26Parcelizer();
        }
        return new NameTransformerChained(iconCompatParcelizer2, i2, minimalClassNameIdResolver, list, null);
    }

    private static boolean IconCompatParcelizer(C0170format c0170format) {
        androidx.media3.common.Metadata metadata = c0170format.onPlay;
        if (metadata == null) {
            return false;
        }
        for (int i = 0; i < metadata.write(); i++) {
            if (metadata.IconCompatParcelizer(i) instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) r2).read.isEmpty();
            }
        }
        return false;
    }

    private static boolean IconCompatParcelizer(findConstructor findconstructor, closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        try {
            boolean z = findconstructor.read(closeonfailandthrowasioe);
            closeonfailandthrowasioe.RemoteActionCompatParcelizer();
            return z;
        } catch (EOFException unused) {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer();
            return false;
        } catch (Throwable th) {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer();
            throw th;
        }
    }
}
