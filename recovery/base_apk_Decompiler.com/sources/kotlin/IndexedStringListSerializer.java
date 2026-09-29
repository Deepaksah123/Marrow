package kotlin;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import kotlin._serializeDynamicContents;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IndexedStringListSerializer {
    public final List<IndexedListSerializer> AudioAttributesCompatParcelizer;
    private final _withResolved AudioAttributesImplApi21Parcelizer;
    public final long AudioAttributesImplBaseParcelizer;
    public final initExtraTracks<constructViewBased> IconCompatParcelizer;
    public final List<IndexedListSerializer> MediaBrowserCompatItemReceiver;
    public final List<IndexedListSerializer> RemoteActionCompatParcelizer;
    public final long read;
    public final C0170format write;

    public abstract Serializers RemoteActionCompatParcelizer();

    public abstract _withResolved read();

    public abstract String write();

    /* synthetic */ IndexedStringListSerializer(long j, C0170format c0170format, List list, _serializeDynamicContents _serializedynamiccontents, List list2, List list3, List list4, byte b) {
        this(j, c0170format, list, _serializedynamiccontents, list2, list3, list4);
    }

    public static IndexedStringListSerializer RemoteActionCompatParcelizer(long j, C0170format c0170format, List<constructViewBased> list, _serializeDynamicContents _serializedynamiccontents, List<IndexedListSerializer> list2, List<IndexedListSerializer> list3, List<IndexedListSerializer> list4) {
        if (_serializedynamiccontents instanceof _serializeDynamicContents.AudioAttributesCompatParcelizer) {
            return new IconCompatParcelizer(j, c0170format, list, (_serializeDynamicContents.AudioAttributesCompatParcelizer) _serializedynamiccontents, list2, list3, list4, null);
        }
        if (_serializedynamiccontents instanceof _serializeDynamicContents.IconCompatParcelizer) {
            return new write(j, c0170format, list, (_serializeDynamicContents.IconCompatParcelizer) _serializedynamiccontents, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    private IndexedStringListSerializer(long j, C0170format c0170format, List<constructViewBased> list, _serializeDynamicContents _serializedynamiccontents, List<IndexedListSerializer> list2, List<IndexedListSerializer> list3, List<IndexedListSerializer> list4) {
        List<IndexedListSerializer> listUnmodifiableList;
        buildTypeSerializer.IconCompatParcelizer(!list.isEmpty());
        this.AudioAttributesImplBaseParcelizer = j;
        this.write = c0170format;
        this.IconCompatParcelizer = initExtraTracks.write(list);
        if (list2 == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list2);
        }
        this.AudioAttributesCompatParcelizer = listUnmodifiableList;
        this.RemoteActionCompatParcelizer = list3;
        this.MediaBrowserCompatItemReceiver = list4;
        this.AudioAttributesImplApi21Parcelizer = _serializedynamiccontents.AudioAttributesCompatParcelizer(this);
        this.read = _serializedynamiccontents.AudioAttributesCompatParcelizer();
    }

    public final _withResolved MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static class IconCompatParcelizer extends IndexedStringListSerializer {
        public final long AudioAttributesImplApi21Parcelizer;
        private final String AudioAttributesImplApi26Parcelizer;
        public final Uri MediaBrowserCompatCustomActionResultReceiver;
        private final contentSchema MediaDescriptionCompat;
        private final _withResolved RatingCompat;

        public IconCompatParcelizer(long j, C0170format c0170format, List<constructViewBased> list, _serializeDynamicContents.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, List<IndexedListSerializer> list2, List<IndexedListSerializer> list3, List<IndexedListSerializer> list4, String str) {
            super(j, c0170format, list, audioAttributesCompatParcelizer, list2, list3, list4, (byte) 0);
            this.MediaBrowserCompatCustomActionResultReceiver = Uri.parse(list.get(0).IconCompatParcelizer);
            _withResolved _withresolvedWrite = audioAttributesCompatParcelizer.write();
            this.RatingCompat = _withresolvedWrite;
            this.AudioAttributesImplApi26Parcelizer = null;
            this.AudioAttributesImplApi21Parcelizer = -1L;
            this.MediaDescriptionCompat = _withresolvedWrite == null ? new contentSchema(new _withResolved(null, 0L, -1L)) : null;
        }

        @Override // kotlin.IndexedStringListSerializer
        public final _withResolved read() {
            return this.RatingCompat;
        }

        @Override // kotlin.IndexedStringListSerializer
        public final Serializers RemoteActionCompatParcelizer() {
            return this.MediaDescriptionCompat;
        }

        @Override // kotlin.IndexedStringListSerializer
        public final String write() {
            return this.AudioAttributesImplApi26Parcelizer;
        }
    }

    public static class write extends IndexedStringListSerializer implements Serializers {
        final _serializeDynamicContents.IconCompatParcelizer AudioAttributesImplApi26Parcelizer;

        @Override // kotlin.IndexedStringListSerializer
        public final Serializers RemoteActionCompatParcelizer() {
            return this;
        }

        @Override // kotlin.IndexedStringListSerializer
        public final _withResolved read() {
            return null;
        }

        @Override // kotlin.IndexedStringListSerializer
        public final String write() {
            return null;
        }

        public write(long j, C0170format c0170format, List<constructViewBased> list, _serializeDynamicContents.IconCompatParcelizer iconCompatParcelizer, List<IndexedListSerializer> list2, List<IndexedListSerializer> list3, List<IndexedListSerializer> list4) {
            super(j, c0170format, list, iconCompatParcelizer, list2, list3, list4, (byte) 0);
            this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer;
        }

        @Override // kotlin.Serializers
        public final _withResolved IconCompatParcelizer(long j) {
            return this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this, j);
        }

        @Override // kotlin.Serializers
        public final long RemoteActionCompatParcelizer(long j, long j2) {
            return this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(j, j2);
        }

        @Override // kotlin.Serializers
        public final long write(long j) {
            return this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(j);
        }

        @Override // kotlin.Serializers
        public final long IconCompatParcelizer(long j, long j2) {
            return this.AudioAttributesImplApi26Parcelizer.read(j, j2);
        }

        @Override // kotlin.Serializers
        public final long AudioAttributesCompatParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer.write();
        }

        @Override // kotlin.Serializers
        public final long read(long j, long j2) {
            return this.AudioAttributesImplApi26Parcelizer.write(j, j2);
        }

        @Override // kotlin.Serializers
        public final long AudioAttributesCompatParcelizer(long j) {
            return this.AudioAttributesImplApi26Parcelizer.read(j);
        }

        @Override // kotlin.Serializers
        public final long write(long j, long j2) {
            return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(j, j2);
        }

        @Override // kotlin.Serializers
        public final long AudioAttributesCompatParcelizer(long j, long j2) {
            return this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(j, j2);
        }

        @Override // kotlin.Serializers
        public final boolean IconCompatParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        }
    }
}
