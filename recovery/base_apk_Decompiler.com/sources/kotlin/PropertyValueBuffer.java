package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\f\u001a\u0019\u0010\r\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u0010\u001a\u0019\u0010\u0007\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0011¢\u0006\u0004\b\u0007\u0010\u0010\u001a\u0019\u0010\r\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u0012\u001a\u0019\u0010\u0004\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0012\u001a%\u0010\r\u001a\u00020\u000b*\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u0013"}, d2 = {"", "p0", "p1", "", "RemoteActionCompatParcelizer", "(II)V", "", "write", "(I)Ljava/lang/Void;", "p2", "p3", "Lo/PropertyValueAny;", "(IIII)J", "IconCompatParcelizer", "(I)I", "read", "(JJ)J", "Lo/getKey;", "(JI)I", "(JII)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PropertyValueBuffer {
    public static final int IconCompatParcelizer(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final void RemoteActionCompatParcelizer(int i, int i2) {
        StringBuilder sb = new StringBuilder("Can't represent a width of ");
        sb.append(i);
        sb.append(" and height of ");
        sb.append(i2);
        sb.append(" in Constraints");
        throw new IllegalArgumentException(sb.toString());
    }

    public static final Void write(int i) {
        StringBuilder sb = new StringBuilder("Can't represent a size of ");
        sb.append(i);
        sb.append(" in Constraints");
        throw new IllegalArgumentException(sb.toString());
    }

    public static final long RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iIconCompatParcelizer = IconCompatParcelizer(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iIconCompatParcelizer2 = IconCompatParcelizer(i6);
        if (iIconCompatParcelizer + iIconCompatParcelizer2 > 31) {
            RemoteActionCompatParcelizer(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iIconCompatParcelizer2 - 13;
        return PropertyValueAny.write((((long) ((~(i7 >> 31)) & i7)) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iIconCompatParcelizer2 + 2)) | (((long) ((~(i8 >> 31)) & i8)) << (iIconCompatParcelizer2 + 33)));
    }

    public static /* synthetic */ long read$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return read(i, i2, i3, i4);
    }

    public static final long IconCompatParcelizer(long j, long j2) {
        int iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
        int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
        int iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j);
        int iAudioAttributesImplApi21Parcelizer = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j);
        int iMediaBrowserCompatItemReceiver2 = PropertyValueAny.MediaBrowserCompatItemReceiver(j2);
        if (iMediaBrowserCompatItemReceiver2 < iMediaBrowserCompatItemReceiver) {
            iMediaBrowserCompatItemReceiver2 = iMediaBrowserCompatItemReceiver;
        }
        if (iMediaBrowserCompatItemReceiver2 > iAudioAttributesImplBaseParcelizer) {
            iMediaBrowserCompatItemReceiver2 = iAudioAttributesImplBaseParcelizer;
        }
        int iAudioAttributesImplBaseParcelizer2 = PropertyValueAny.AudioAttributesImplBaseParcelizer(j2);
        if (iAudioAttributesImplBaseParcelizer2 >= iMediaBrowserCompatItemReceiver) {
            iMediaBrowserCompatItemReceiver = iAudioAttributesImplBaseParcelizer2;
        }
        if (iMediaBrowserCompatItemReceiver <= iAudioAttributesImplBaseParcelizer) {
            iAudioAttributesImplBaseParcelizer = iMediaBrowserCompatItemReceiver;
        }
        int iMediaBrowserCompatCustomActionResultReceiver2 = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j2);
        if (iMediaBrowserCompatCustomActionResultReceiver2 < iMediaBrowserCompatCustomActionResultReceiver) {
            iMediaBrowserCompatCustomActionResultReceiver2 = iMediaBrowserCompatCustomActionResultReceiver;
        }
        if (iMediaBrowserCompatCustomActionResultReceiver2 > iAudioAttributesImplApi21Parcelizer) {
            iMediaBrowserCompatCustomActionResultReceiver2 = iAudioAttributesImplApi21Parcelizer;
        }
        int iAudioAttributesImplApi21Parcelizer2 = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j2);
        if (iAudioAttributesImplApi21Parcelizer2 >= iMediaBrowserCompatCustomActionResultReceiver) {
            iMediaBrowserCompatCustomActionResultReceiver = iAudioAttributesImplApi21Parcelizer2;
        }
        if (iMediaBrowserCompatCustomActionResultReceiver <= iAudioAttributesImplApi21Parcelizer) {
            iAudioAttributesImplApi21Parcelizer = iMediaBrowserCompatCustomActionResultReceiver;
        }
        return read(iMediaBrowserCompatItemReceiver2, iAudioAttributesImplBaseParcelizer, iMediaBrowserCompatCustomActionResultReceiver2, iAudioAttributesImplApi21Parcelizer);
    }

    public static final long write(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
        int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
        if (i < iMediaBrowserCompatItemReceiver) {
            i = iMediaBrowserCompatItemReceiver;
        }
        if (i <= iAudioAttributesImplBaseParcelizer) {
            iAudioAttributesImplBaseParcelizer = i;
        }
        int i2 = (int) j2;
        int iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j);
        int iAudioAttributesImplApi21Parcelizer = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j);
        if (i2 < iMediaBrowserCompatCustomActionResultReceiver) {
            i2 = iMediaBrowserCompatCustomActionResultReceiver;
        }
        if (i2 <= iAudioAttributesImplApi21Parcelizer) {
            iAudioAttributesImplApi21Parcelizer = i2;
        }
        long j3 = iAudioAttributesImplApi21Parcelizer;
        long j4 = ((long) iAudioAttributesImplBaseParcelizer) << 32;
        long j5 = -1;
        return getKey.read(j4 | (((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32))) & j3));
    }

    public static final int IconCompatParcelizer(long j, int i) {
        int iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
        int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
        if (i < iMediaBrowserCompatItemReceiver) {
            i = iMediaBrowserCompatItemReceiver;
        }
        return i > iAudioAttributesImplBaseParcelizer ? iAudioAttributesImplBaseParcelizer : i;
    }

    public static final int RemoteActionCompatParcelizer(long j, int i) {
        int iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j);
        int iAudioAttributesImplApi21Parcelizer = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j);
        if (i < iMediaBrowserCompatCustomActionResultReceiver) {
            i = iMediaBrowserCompatCustomActionResultReceiver;
        }
        return i > iAudioAttributesImplApi21Parcelizer ? iAudioAttributesImplApi21Parcelizer : i;
    }

    public static /* synthetic */ long IconCompatParcelizer$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return IconCompatParcelizer(j, i, i2);
    }

    public static final long IconCompatParcelizer(long j, int i, int i2) {
        int iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(j) + i;
        if (iMediaBrowserCompatItemReceiver < 0) {
            iMediaBrowserCompatItemReceiver = 0;
        }
        int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
        if (iAudioAttributesImplBaseParcelizer != Integer.MAX_VALUE && (iAudioAttributesImplBaseParcelizer = iAudioAttributesImplBaseParcelizer + i) < 0) {
            iAudioAttributesImplBaseParcelizer = 0;
        }
        int iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j) + i2;
        if (iMediaBrowserCompatCustomActionResultReceiver < 0) {
            iMediaBrowserCompatCustomActionResultReceiver = 0;
        }
        int iAudioAttributesImplApi21Parcelizer = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j);
        return read(iMediaBrowserCompatItemReceiver, iAudioAttributesImplBaseParcelizer, iMediaBrowserCompatCustomActionResultReceiver, (iAudioAttributesImplApi21Parcelizer == Integer.MAX_VALUE || (iAudioAttributesImplApi21Parcelizer = iAudioAttributesImplApi21Parcelizer + i2) >= 0) ? iAudioAttributesImplApi21Parcelizer : 0);
    }

    public static final long read(int i, int i2, int i3, int i4) {
        boolean z = i2 >= i;
        boolean z2 = i4 >= i3;
        if (!((i3 >= 0) & z & z2 & (i >= 0))) {
            readIdProperty.read("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return RemoteActionCompatParcelizer(i, i2, i3, i4);
    }
}
