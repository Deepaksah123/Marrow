package kotlin;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class FilteredBeanPropertyWriterMultiView implements NumberSerializersFloatSerializer<FilteredBeanPropertyWriterMultiView> {
    public final long AudioAttributesCompatParcelizer;
    public final serializeContentsUsing AudioAttributesImplApi21Parcelizer;
    public final IteratorSerializer AudioAttributesImplApi26Parcelizer;
    public final long AudioAttributesImplBaseParcelizer;
    public final Uri IconCompatParcelizer;
    public final long MediaBrowserCompatCustomActionResultReceiver;
    public final long MediaBrowserCompatItemReceiver;
    public final long MediaBrowserCompatMediaItem;
    private final List<serializeContents> MediaDescriptionCompat;
    public final MapEntrySerializer MediaMetadataCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final long read;
    public final long write;

    @Override // kotlin.NumberSerializersFloatSerializer
    public final /* synthetic */ FilteredBeanPropertyWriterMultiView IconCompatParcelizer(List list) {
        return AudioAttributesCompatParcelizer((List<StreamKey>) list);
    }

    public FilteredBeanPropertyWriterMultiView(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, serializeContentsUsing serializecontentsusing, MapEntrySerializer mapEntrySerializer, IteratorSerializer iteratorSerializer, Uri uri, List<serializeContents> list) {
        this.AudioAttributesCompatParcelizer = j;
        this.write = j2;
        this.read = j3;
        this.RemoteActionCompatParcelizer = z;
        this.MediaBrowserCompatItemReceiver = j4;
        this.MediaBrowserCompatMediaItem = j5;
        this.MediaBrowserCompatCustomActionResultReceiver = j6;
        this.AudioAttributesImplBaseParcelizer = j7;
        this.AudioAttributesImplApi21Parcelizer = serializecontentsusing;
        this.MediaMetadataCompat = mapEntrySerializer;
        this.IconCompatParcelizer = uri;
        this.AudioAttributesImplApi26Parcelizer = iteratorSerializer;
        this.MediaDescriptionCompat = list == null ? Collections.emptyList() : list;
    }

    public final int read() {
        return this.MediaDescriptionCompat.size();
    }

    public final serializeContents AudioAttributesCompatParcelizer(int i) {
        return this.MediaDescriptionCompat.get(i);
    }

    private long write(int i) {
        long j;
        if (i == this.MediaDescriptionCompat.size() - 1) {
            j = this.write;
            if (j == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
        } else {
            j = this.MediaDescriptionCompat.get(i + 1).IconCompatParcelizer;
        }
        return j - this.MediaDescriptionCompat.get(i).IconCompatParcelizer;
    }

    public final long read(int i) {
        return LaissezFaireSubTypeValidator.IconCompatParcelizer(write(i));
    }

    private FilteredBeanPropertyWriterMultiView AudioAttributesCompatParcelizer(List<StreamKey> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey());
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (int i = 0; i < read(); i++) {
            if (((StreamKey) linkedList.peek()).write != i) {
                long jWrite = write(i);
                if (jWrite != C.TIME_UNSET) {
                    j += jWrite;
                }
            } else {
                serializeContents serializecontentsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
                arrayList.add(new serializeContents(serializecontentsAudioAttributesCompatParcelizer.read, serializecontentsAudioAttributesCompatParcelizer.IconCompatParcelizer - j, IconCompatParcelizer(serializecontentsAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, linkedList), serializecontentsAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer));
            }
        }
        long j2 = this.write;
        return new FilteredBeanPropertyWriterMultiView(this.AudioAttributesCompatParcelizer, j2 != C.TIME_UNSET ? j2 - j : -9223372036854775807L, this.read, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer, this.MediaMetadataCompat, this.AudioAttributesImplApi26Parcelizer, this.IconCompatParcelizer, arrayList);
    }

    private static ArrayList<FilteredBeanPropertyWriterSingleView> IconCompatParcelizer(List<FilteredBeanPropertyWriterSingleView> list, LinkedList<StreamKey> linkedList) {
        StreamKey streamKeyPoll = linkedList.poll();
        int i = streamKeyPoll.write;
        ArrayList<FilteredBeanPropertyWriterSingleView> arrayList = new ArrayList<>();
        do {
            int i2 = streamKeyPoll.read;
            FilteredBeanPropertyWriterSingleView filteredBeanPropertyWriterSingleView = list.get(i2);
            List<IndexedStringListSerializer> list2 = filteredBeanPropertyWriterSingleView.IconCompatParcelizer;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.AudioAttributesCompatParcelizer));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.write != i) {
                    break;
                }
            } while (streamKeyPoll.read == i2);
            arrayList.add(new FilteredBeanPropertyWriterSingleView(filteredBeanPropertyWriterSingleView.read, filteredBeanPropertyWriterSingleView.AudioAttributesImplApi21Parcelizer, arrayList2, filteredBeanPropertyWriterSingleView.RemoteActionCompatParcelizer, filteredBeanPropertyWriterSingleView.write, filteredBeanPropertyWriterSingleView.AudioAttributesCompatParcelizer));
        } while (streamKeyPoll.write == i);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }
}
