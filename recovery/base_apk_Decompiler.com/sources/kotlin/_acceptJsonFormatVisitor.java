package kotlin;

import android.net.Uri;
import androidx.media3.common.DrmInitData;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class _acceptJsonFormatVisitor extends _asTimestamp {
    public final long AudioAttributesCompatParcelizer;
    public final long AudioAttributesImplApi21Parcelizer;
    public final boolean AudioAttributesImplApi26Parcelizer;
    public final long AudioAttributesImplBaseParcelizer;
    public final boolean IconCompatParcelizer;
    public final boolean MediaBrowserCompatCustomActionResultReceiver;
    public final int MediaBrowserCompatItemReceiver;
    public final DrmInitData MediaBrowserCompatMediaItem;
    public final Map<Uri, IconCompatParcelizer> MediaBrowserCompatSearchResultReceiver;
    public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final List<write> MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final AudioAttributesCompatParcelizer RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final List<read> onAddQueueItem;
    public final long onCommand;
    public final long onCustomAction;
    public final boolean read;
    public final int write;

    private _acceptJsonFormatVisitor AudioAttributesCompatParcelizer() {
        return this;
    }

    @Override // kotlin.NumberSerializersFloatSerializer
    public final /* synthetic */ _asTimestamp IconCompatParcelizer(List list) {
        return AudioAttributesCompatParcelizer();
    }

    public static final class AudioAttributesCompatParcelizer {
        public final long AudioAttributesCompatParcelizer;
        public final boolean IconCompatParcelizer;
        public final boolean RemoteActionCompatParcelizer;
        public final long read;
        public final long write;

        public AudioAttributesCompatParcelizer(long j, boolean z, long j2, long j3, boolean z2) {
            this.write = j;
            this.RemoteActionCompatParcelizer = z;
            this.AudioAttributesCompatParcelizer = j2;
            this.read = j3;
            this.IconCompatParcelizer = z2;
        }
    }

    public static final class write extends RemoteActionCompatParcelizer {
        public final String AudioAttributesCompatParcelizer;
        public final List<read> RemoteActionCompatParcelizer;

        public write(String str, long j, long j2, String str2, String str3) {
            this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j, j2, false, initExtraTracks.AudioAttributesImplApi26Parcelizer());
        }

        public write(String str, write writeVar, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z, List<read> list) {
            super(str, writeVar, j, i, j2, drmInitData, str3, str4, j3, j4, z, (byte) 0);
            this.AudioAttributesCompatParcelizer = str2;
            this.RemoteActionCompatParcelizer = initExtraTracks.write(list);
        }

        public final write IconCompatParcelizer(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.RemoteActionCompatParcelizer.size(); i2++) {
                read readVar = this.RemoteActionCompatParcelizer.get(i2);
                arrayList.add(readVar.write(j2, i));
                j2 += readVar.AudioAttributesImplApi21Parcelizer;
            }
            return new write(this.MediaDescriptionCompat, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, i, j, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer, this.write, this.AudioAttributesImplApi26Parcelizer, arrayList);
        }
    }

    public static final class read extends RemoteActionCompatParcelizer {
        public final boolean RemoteActionCompatParcelizer;
        public final boolean read;

        public read(String str, write writeVar, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, writeVar, j, i, j2, drmInitData, str2, str3, j3, j4, z, (byte) 0);
            this.RemoteActionCompatParcelizer = z2;
            this.read = z3;
        }

        public final read write(long j, int i) {
            return new read(this.MediaDescriptionCompat, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi21Parcelizer, i, j, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer, this.write, this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, this.read);
        }
    }

    public static class RemoteActionCompatParcelizer implements Comparable<Long> {
        public final long AudioAttributesImplApi21Parcelizer;
        public final boolean AudioAttributesImplApi26Parcelizer;
        public final String AudioAttributesImplBaseParcelizer;
        public final long IconCompatParcelizer;
        public final String MediaBrowserCompatCustomActionResultReceiver;
        public final DrmInitData MediaBrowserCompatItemReceiver;
        public final long MediaBrowserCompatMediaItem;
        public final write MediaBrowserCompatSearchResultReceiver;
        public final String MediaDescriptionCompat;
        public final int MediaMetadataCompat;
        public final long write;

        /* synthetic */ RemoteActionCompatParcelizer(String str, write writeVar, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z, byte b) {
            this(str, writeVar, j, i, j2, drmInitData, str2, str3, j3, j4, z);
        }

        private RemoteActionCompatParcelizer(String str, write writeVar, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z) {
            this.MediaDescriptionCompat = str;
            this.MediaBrowserCompatSearchResultReceiver = writeVar;
            this.AudioAttributesImplApi21Parcelizer = j;
            this.MediaMetadataCompat = i;
            this.MediaBrowserCompatMediaItem = j2;
            this.MediaBrowserCompatItemReceiver = drmInitData;
            this.MediaBrowserCompatCustomActionResultReceiver = str2;
            this.AudioAttributesImplBaseParcelizer = str3;
            this.IconCompatParcelizer = j3;
            this.write = j4;
            this.AudioAttributesImplApi26Parcelizer = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l) {
            if (this.MediaBrowserCompatMediaItem > l.longValue()) {
                return 1;
            }
            return this.MediaBrowserCompatMediaItem < l.longValue() ? -1 : 0;
        }
    }

    public static final class IconCompatParcelizer {
        public final int IconCompatParcelizer;
        public final long RemoteActionCompatParcelizer;
        public final Uri read;

        public IconCompatParcelizer(Uri uri, long j, int i) {
            this.read = uri;
            this.RemoteActionCompatParcelizer = j;
            this.IconCompatParcelizer = i;
        }
    }

    public _acceptJsonFormatVisitor(int i, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, DrmInitData drmInitData, List<write> list2, List<read> list3, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Map<Uri, IconCompatParcelizer> map) {
        super(str, list, z3);
        this.MediaBrowserCompatItemReceiver = i;
        this.onCommand = j2;
        this.MediaBrowserCompatCustomActionResultReceiver = z;
        this.IconCompatParcelizer = z2;
        this.write = i2;
        this.AudioAttributesImplBaseParcelizer = j3;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3;
        this.onCustomAction = j4;
        this.AudioAttributesImplApi21Parcelizer = j5;
        this.RemoteActionCompatParcelizer = z4;
        this.AudioAttributesImplApi26Parcelizer = z5;
        this.MediaBrowserCompatMediaItem = drmInitData;
        this.MediaDescriptionCompat = initExtraTracks.write(list2);
        this.onAddQueueItem = initExtraTracks.write(list3);
        this.MediaBrowserCompatSearchResultReceiver = onMoovContainerAtomRead.write(map);
        if (!list3.isEmpty()) {
            read readVar = (read) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(list3);
            this.AudioAttributesCompatParcelizer = readVar.MediaBrowserCompatMediaItem + readVar.AudioAttributesImplApi21Parcelizer;
        } else if (!list2.isEmpty()) {
            write writeVar = (write) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(list2);
            this.AudioAttributesCompatParcelizer = writeVar.MediaBrowserCompatMediaItem + writeVar.AudioAttributesImplApi21Parcelizer;
        } else {
            this.AudioAttributesCompatParcelizer = 0L;
        }
        long jMax = C.TIME_UNSET;
        if (j != C.TIME_UNSET) {
            if (j >= 0) {
                jMax = Math.min(this.AudioAttributesCompatParcelizer, j);
            } else {
                jMax = Math.max(0L, this.AudioAttributesCompatParcelizer + j);
            }
        }
        this.MediaMetadataCompat = jMax;
        this.read = j >= 0;
        this.RatingCompat = audioAttributesCompatParcelizer;
    }

    public final boolean write(_acceptJsonFormatVisitor _acceptjsonformatvisitor) {
        if (_acceptjsonformatvisitor != null) {
            long j = this.AudioAttributesImplBaseParcelizer;
            long j2 = _acceptjsonformatvisitor.AudioAttributesImplBaseParcelizer;
            if (j <= j2) {
                if (j < j2) {
                    return false;
                }
                int size = this.MediaDescriptionCompat.size() - _acceptjsonformatvisitor.MediaDescriptionCompat.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.onAddQueueItem.size();
                int size3 = _acceptjsonformatvisitor.onAddQueueItem.size();
                if (size2 <= size3 && (size2 != size3 || !this.RemoteActionCompatParcelizer || _acceptjsonformatvisitor.RemoteActionCompatParcelizer)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final long IconCompatParcelizer() {
        return this.onCommand + this.AudioAttributesCompatParcelizer;
    }

    public final _acceptJsonFormatVisitor write(long j, int i) {
        return new _acceptJsonFormatVisitor(this.MediaBrowserCompatItemReceiver, this.handleMediaPlayPauseIfPendingOnHandler, this.onFastForward, this.MediaMetadataCompat, this.MediaBrowserCompatCustomActionResultReceiver, j, true, i, this.AudioAttributesImplBaseParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCustomAction, this.AudioAttributesImplApi21Parcelizer, this.onPlayFromMediaId, this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, this.onAddQueueItem, this.RatingCompat, this.MediaBrowserCompatSearchResultReceiver);
    }

    public final _acceptJsonFormatVisitor RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer ? this : new _acceptJsonFormatVisitor(this.MediaBrowserCompatItemReceiver, this.handleMediaPlayPauseIfPendingOnHandler, this.onFastForward, this.MediaMetadataCompat, this.MediaBrowserCompatCustomActionResultReceiver, this.onCommand, this.IconCompatParcelizer, this.write, this.AudioAttributesImplBaseParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCustomAction, this.AudioAttributesImplApi21Parcelizer, this.onPlayFromMediaId, true, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, this.onAddQueueItem, this.RatingCompat, this.MediaBrowserCompatSearchResultReceiver);
    }
}
