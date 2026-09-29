package kotlin;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.getScore;

/* JADX INFO: loaded from: classes3.dex */
final class getAacCodecProfileAndLevel extends getAlternativeCodecMimeType {
    private final MetadataInputBuffer RemoteActionCompatParcelizer;

    private static boolean AudioAttributesCompatParcelizer(Long l) {
        return l != null;
    }

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    }

    getAacCodecProfileAndLevel(MetadataInputBuffer metadataInputBuffer) {
        this.RemoteActionCompatParcelizer = metadataInputBuffer;
    }

    @Override // kotlin.getAlternativeCodecMimeType
    public final boolean AudioAttributesCompatParcelizer() {
        if (!write(this.RemoteActionCompatParcelizer, 0)) {
            this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
            return false;
        }
        if (!read(this.RemoteActionCompatParcelizer) || write(this.RemoteActionCompatParcelizer)) {
            return true;
        }
        this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
        return false;
    }

    private static boolean read(MetadataInputBuffer metadataInputBuffer) {
        if (metadataInputBuffer.AudioAttributesCompatParcelizer() > 0) {
            return true;
        }
        Iterator<MetadataInputBuffer> it = metadataInputBuffer.MediaBrowserCompatCustomActionResultReceiver().iterator();
        while (it.hasNext()) {
            if (it.next().AudioAttributesCompatParcelizer() > 0) {
                return true;
            }
        }
        return false;
    }

    private boolean write(MetadataInputBuffer metadataInputBuffer) {
        return AudioAttributesCompatParcelizer(metadataInputBuffer, 0);
    }

    private boolean AudioAttributesCompatParcelizer(MetadataInputBuffer metadataInputBuffer, int i) {
        if (metadataInputBuffer == null || i > 1) {
            return false;
        }
        for (Map.Entry<String, Long> entry : metadataInputBuffer.IconCompatParcelizer().entrySet()) {
            if (!RemoteActionCompatParcelizer(entry.getKey())) {
                entry.getKey();
                return false;
            }
            if (!AudioAttributesCompatParcelizer(entry.getValue())) {
                Objects.toString(entry.getValue());
                return false;
            }
        }
        Iterator<MetadataInputBuffer> it = metadataInputBuffer.MediaBrowserCompatCustomActionResultReceiver().iterator();
        while (it.hasNext()) {
            if (!AudioAttributesCompatParcelizer(it.next(), i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean RemoteActionCompatParcelizer(MetadataInputBuffer metadataInputBuffer) {
        return metadataInputBuffer.MediaBrowserCompatItemReceiver().startsWith("_st_");
    }

    private static boolean IconCompatParcelizer(MetadataInputBuffer metadataInputBuffer) {
        Long l = metadataInputBuffer.IconCompatParcelizer().get(getScore.read.FRAMES_TOTAL.toString());
        return l != null && l.compareTo((Long) 0L) > 0;
    }

    private boolean write(MetadataInputBuffer metadataInputBuffer, int i) {
        if (metadataInputBuffer == null || i > 1) {
            return false;
        }
        if (!AudioAttributesCompatParcelizer(metadataInputBuffer.MediaBrowserCompatItemReceiver())) {
            metadataInputBuffer.MediaBrowserCompatItemReceiver();
            return false;
        }
        if (!AudioAttributesCompatParcelizer(metadataInputBuffer)) {
            metadataInputBuffer.AudioAttributesImplApi26Parcelizer();
            return false;
        }
        if (!metadataInputBuffer.MediaMetadataCompat()) {
            return false;
        }
        if (RemoteActionCompatParcelizer(metadataInputBuffer) && !IconCompatParcelizer(metadataInputBuffer)) {
            metadataInputBuffer.MediaBrowserCompatItemReceiver();
            return false;
        }
        Iterator<MetadataInputBuffer> it = metadataInputBuffer.MediaBrowserCompatCustomActionResultReceiver().iterator();
        while (it.hasNext()) {
            if (!write(it.next(), i + 1)) {
                return false;
            }
        }
        return AudioAttributesCompatParcelizer(metadataInputBuffer.AudioAttributesImplApi21Parcelizer());
    }

    private static boolean AudioAttributesCompatParcelizer(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        return !strTrim.isEmpty() && strTrim.length() <= 100;
    }

    private static boolean AudioAttributesCompatParcelizer(MetadataInputBuffer metadataInputBuffer) {
        return metadataInputBuffer != null && metadataInputBuffer.AudioAttributesImplApi26Parcelizer() > 0;
    }

    private static boolean RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        return !strTrim.isEmpty() && strTrim.length() <= 100;
    }

    private static boolean AudioAttributesCompatParcelizer(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                write(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e) {
                e.getLocalizedMessage();
                return false;
            }
        }
        return true;
    }
}
