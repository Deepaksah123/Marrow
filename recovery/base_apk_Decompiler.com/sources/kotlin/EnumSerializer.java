package kotlin;

import android.net.Uri;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.StreamKey;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.C0170format;

/* JADX INFO: loaded from: classes2.dex */
public final class EnumSerializer extends _asTimestamp {
    public static final EnumSerializer write = new EnumSerializer("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final List<AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer;
    public final List<AudioAttributesCompatParcelizer> AudioAttributesImplApi21Parcelizer;
    public final List<DrmInitData> AudioAttributesImplApi26Parcelizer;
    public final Map<String, String> AudioAttributesImplBaseParcelizer;
    public final List<Uri> IconCompatParcelizer;
    public final List<IconCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver;
    public final List<C0170format> MediaBrowserCompatItemReceiver;
    public final List<AudioAttributesCompatParcelizer> MediaMetadataCompat;
    public final List<AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer;
    public final C0170format read;

    public static final class IconCompatParcelizer {
        public final String AudioAttributesCompatParcelizer;
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompatCustomActionResultReceiver;
        public final C0170format RemoteActionCompatParcelizer;
        public final Uri read;
        public final String write;

        public IconCompatParcelizer(Uri uri, C0170format c0170format, String str, String str2, String str3, String str4) {
            this.read = uri;
            this.RemoteActionCompatParcelizer = c0170format;
            this.MediaBrowserCompatCustomActionResultReceiver = str;
            this.write = str2;
            this.AudioAttributesCompatParcelizer = str3;
            this.IconCompatParcelizer = str4;
        }

        public static IconCompatParcelizer IconCompatParcelizer(Uri uri) {
            return new IconCompatParcelizer(uri, new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(SessionDescription.SUPPORTED_SDP_VERSION).IconCompatParcelizer(MimeTypes.APPLICATION_M3U8).IconCompatParcelizer(), null, null, null, null);
        }

        public final IconCompatParcelizer read(C0170format c0170format) {
            return new IconCompatParcelizer(this.read, c0170format, this.MediaBrowserCompatCustomActionResultReceiver, this.write, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
        }
    }

    public static final class AudioAttributesCompatParcelizer {
        public final String AudioAttributesCompatParcelizer;
        public final C0170format RemoteActionCompatParcelizer;
        public final Uri read;
        public final String write;

        public AudioAttributesCompatParcelizer(Uri uri, C0170format c0170format, String str, String str2) {
            this.read = uri;
            this.RemoteActionCompatParcelizer = c0170format;
            this.write = str;
            this.AudioAttributesCompatParcelizer = str2;
        }
    }

    public EnumSerializer(String str, List<String> list, List<IconCompatParcelizer> list2, List<AudioAttributesCompatParcelizer> list3, List<AudioAttributesCompatParcelizer> list4, List<AudioAttributesCompatParcelizer> list5, List<AudioAttributesCompatParcelizer> list6, C0170format c0170format, List<C0170format> list7, boolean z, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z);
        this.IconCompatParcelizer = Collections.unmodifiableList(RemoteActionCompatParcelizer(list2, list3, list4, list5, list6));
        this.MediaBrowserCompatCustomActionResultReceiver = Collections.unmodifiableList(list2);
        this.MediaMetadataCompat = Collections.unmodifiableList(list3);
        this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(list4);
        this.AudioAttributesImplApi21Parcelizer = Collections.unmodifiableList(list5);
        this.RemoteActionCompatParcelizer = Collections.unmodifiableList(list6);
        this.read = c0170format;
        this.MediaBrowserCompatItemReceiver = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.AudioAttributesImplBaseParcelizer = Collections.unmodifiableMap(map);
        this.AudioAttributesImplApi26Parcelizer = Collections.unmodifiableList(list8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.NumberSerializersFloatSerializer
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public EnumSerializer IconCompatParcelizer(List<StreamKey> list) {
        return new EnumSerializer(this.handleMediaPlayPauseIfPendingOnHandler, this.onFastForward, AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, 0, list), Collections.emptyList(), AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, 1, list), AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, 2, list), Collections.emptyList(), this.read, this.MediaBrowserCompatItemReceiver, this.onPlayFromMediaId, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer);
    }

    public static EnumSerializer RemoteActionCompatParcelizer(String str) {
        return new EnumSerializer("", Collections.emptyList(), Collections.singletonList(IconCompatParcelizer.IconCompatParcelizer(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List<Uri> RemoteActionCompatParcelizer(List<IconCompatParcelizer> list, List<AudioAttributesCompatParcelizer> list2, List<AudioAttributesCompatParcelizer> list3, List<AudioAttributesCompatParcelizer> list4, List<AudioAttributesCompatParcelizer> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).read;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        IconCompatParcelizer(list2, arrayList);
        IconCompatParcelizer(list3, arrayList);
        IconCompatParcelizer(list4, arrayList);
        IconCompatParcelizer(list5, arrayList);
        return arrayList;
    }

    private static void IconCompatParcelizer(List<AudioAttributesCompatParcelizer> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).read;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> AudioAttributesCompatParcelizer(List<T> list, int i, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    StreamKey streamKey = list2.get(i3);
                    if (streamKey.read == i && streamKey.AudioAttributesCompatParcelizer == i2) {
                        arrayList.add(t);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }
}
