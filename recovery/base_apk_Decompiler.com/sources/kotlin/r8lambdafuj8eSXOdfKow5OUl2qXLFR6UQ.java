package kotlin;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.DownloadRequest;
import kotlin.getRetryDelayMillis;
import kotlin.setMinRetryCount;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdafuj8eSXOdfKow5OUl2qXLFR6UQ implements getRetryDelayMillis {
    private final DownloadManager AudioAttributesCompatParcelizer;

    public static r8lambdafuj8eSXOdfKow5OUl2qXLFR6UQ IconCompatParcelizer(DownloadManager downloadManager) {
        if (downloadManager.write != null) {
            return downloadManager.write;
        }
        return new r8lambdafuj8eSXOdfKow5OUl2qXLFR6UQ(downloadManager);
    }

    private r8lambdafuj8eSXOdfKow5OUl2qXLFR6UQ(DownloadManager downloadManager) {
        DownloadManager downloadManager2 = (DownloadManager) getDownloadIndex.AudioAttributesCompatParcelizer(downloadManager, "output");
        this.AudioAttributesCompatParcelizer = downloadManager2;
        downloadManager2.write = this;
    }

    @Override // kotlin.getRetryDelayMillis
    public final getRetryDelayMillis.read AudioAttributesCompatParcelizer() {
        return getRetryDelayMillis.read.ASCENDING;
    }

    @Override // kotlin.getRetryDelayMillis
    public final void write(int i, int i2) throws IOException {
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(i, i2);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void AudioAttributesCompatParcelizer(int i, long j) throws IOException {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i, j);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void write(int i, long j) throws IOException {
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, j);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void AudioAttributesCompatParcelizer(int i, float f) throws IOException {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i, f);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void read(int i, double d) throws IOException {
        this.AudioAttributesCompatParcelizer.read(i, d);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void IconCompatParcelizer(int i, int i2) throws IOException {
        this.AudioAttributesCompatParcelizer.read(i, i2);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void IconCompatParcelizer(int i, long j) throws IOException {
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(i, j);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void RemoteActionCompatParcelizer(int i, int i2) throws IOException {
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(i, i2);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void RemoteActionCompatParcelizer(int i, long j) throws IOException {
        this.AudioAttributesCompatParcelizer.write(i, j);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void read(int i, int i2) throws IOException {
        this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(i, i2);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void write(int i, boolean z) throws IOException {
        this.AudioAttributesCompatParcelizer.read(i, z);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void write(int i, String str) throws IOException {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i, str);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void IconCompatParcelizer(int i, DownloadIndex downloadIndex) throws IOException {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i, downloadIndex);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void MediaBrowserCompatCustomActionResultReceiver(int i, int i2) throws IOException {
        this.AudioAttributesCompatParcelizer.MediaDescriptionCompat(i, i2);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void AudioAttributesCompatParcelizer(int i, int i2) throws IOException {
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(i, i2);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void read(int i, long j) throws IOException {
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(i, j);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void AudioAttributesCompatParcelizer(int i, Object obj, setNotMetRequirements setnotmetrequirements) throws IOException {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i, (DownloadManagerExternalSyntheticLambda0) obj, setnotmetrequirements);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void write(int i, Object obj, setNotMetRequirements setnotmetrequirements) throws IOException {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i, (DownloadManagerExternalSyntheticLambda0) obj, setnotmetrequirements);
    }

    @Override // kotlin.getRetryDelayMillis
    @Deprecated
    public final void AudioAttributesCompatParcelizer(int i) throws IOException {
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 3);
    }

    @Override // kotlin.getRetryDelayMillis
    @Deprecated
    public final void read(int i) throws IOException {
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 4);
    }

    @Override // kotlin.getRetryDelayMillis
    public final void write(int i, Object obj) throws IOException {
        if (obj instanceof DownloadIndex) {
            this.AudioAttributesCompatParcelizer.write(i, (DownloadIndex) obj);
        } else {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i, (DownloadManagerExternalSyntheticLambda0) obj);
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void AudioAttributesImplApi26Parcelizer(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            int iAudioAttributesImplApi26Parcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAudioAttributesImplApi26Parcelizer += DownloadManager.AudioAttributesImplApi26Parcelizer(list.get(i3).intValue());
            }
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iAudioAttributesImplApi26Parcelizer);
            while (i2 < list.size()) {
                this.AudioAttributesCompatParcelizer.onAddQueueItem(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void IconCompatParcelizer(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            int iAudioAttributesCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3);
                iAudioAttributesCompatParcelizer += DownloadManager.AudioAttributesCompatParcelizer();
            }
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iAudioAttributesCompatParcelizer);
            while (i2 < list.size()) {
                this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void MediaBrowserCompatItemReceiver(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            int iIconCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iIconCompatParcelizer += DownloadManager.IconCompatParcelizer(list.get(i3).longValue());
            }
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iIconCompatParcelizer);
            while (i2 < list.size()) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void MediaMetadataCompat(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            int iWrite = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iWrite += DownloadManager.write(list.get(i3).longValue());
            }
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iWrite);
            while (i2 < list.size()) {
                this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void AudioAttributesCompatParcelizer(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += DownloadManager.read();
            }
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i3);
            while (i2 < list.size()) {
                this.AudioAttributesCompatParcelizer.read(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.write(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void MediaBrowserCompatCustomActionResultReceiver(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            int iAudioAttributesImplBaseParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3);
                iAudioAttributesImplBaseParcelizer += DownloadManager.AudioAttributesImplBaseParcelizer();
            }
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iAudioAttributesImplBaseParcelizer);
            while (i2 < list.size()) {
                this.AudioAttributesCompatParcelizer.read(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void RemoteActionCompatParcelizer(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            int iRemoteActionCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3);
                iRemoteActionCompatParcelizer += DownloadManager.RemoteActionCompatParcelizer();
            }
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iRemoteActionCompatParcelizer);
            while (i2 < list.size()) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.read(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void write(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            int iIconCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iIconCompatParcelizer += DownloadManager.IconCompatParcelizer(list.get(i3).intValue());
            }
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iIconCompatParcelizer);
            while (i2 < list.size()) {
                this.AudioAttributesCompatParcelizer.MediaDescriptionCompat(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.read(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void read(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            int iWrite = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3);
                iWrite += DownloadManager.write();
            }
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iWrite);
            while (i2 < list.size()) {
                this.AudioAttributesCompatParcelizer.read(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.read(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void read(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof isInitialized) {
            isInitialized isinitialized = (isInitialized) list;
            while (i2 < list.size()) {
                IconCompatParcelizer(i, isinitialized.IconCompatParcelizer(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i, list.get(i2));
            i2++;
        }
    }

    private void IconCompatParcelizer(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i, (String) obj);
        } else {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i, (DownloadIndex) obj);
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void write(int i, List<DownloadIndex> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i, list.get(i2));
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void MediaBrowserCompatSearchResultReceiver(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            int iMediaMetadataCompat = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iMediaMetadataCompat += DownloadManager.MediaMetadataCompat(list.get(i3).intValue());
            }
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iMediaMetadataCompat);
            while (i2 < list.size()) {
                this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.MediaDescriptionCompat(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void AudioAttributesImplBaseParcelizer(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            int iMediaBrowserCompatCustomActionResultReceiver = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3);
                iMediaBrowserCompatCustomActionResultReceiver += DownloadManager.MediaBrowserCompatCustomActionResultReceiver();
            }
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iMediaBrowserCompatCustomActionResultReceiver);
            while (i2 < list.size()) {
                this.AudioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void AudioAttributesImplApi21Parcelizer(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            int iAudioAttributesImplApi26Parcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3);
                iAudioAttributesImplApi26Parcelizer += DownloadManager.AudioAttributesImplApi26Parcelizer();
            }
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iAudioAttributesImplApi26Parcelizer);
            while (i2 < list.size()) {
                this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void MediaBrowserCompatMediaItem(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            int iRatingCompat = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iRatingCompat += DownloadManager.RatingCompat(list.get(i3).intValue());
            }
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iRatingCompat);
            while (i2 < list.size()) {
                this.AudioAttributesCompatParcelizer.onCommand(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void RatingCompat(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            int iAudioAttributesCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAudioAttributesCompatParcelizer += DownloadManager.AudioAttributesCompatParcelizer(list.get(i3).longValue());
            }
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iAudioAttributesCompatParcelizer);
            while (i2 < list.size()) {
                this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void write(int i, List<?> list, setNotMetRequirements setnotmetrequirements) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            AudioAttributesCompatParcelizer(i, list.get(i2), setnotmetrequirements);
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final void RemoteActionCompatParcelizer(int i, List<?> list, setNotMetRequirements setnotmetrequirements) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            write(i, list.get(i2), setnotmetrequirements);
        }
    }

    @Override // kotlin.getRetryDelayMillis
    public final <K, V> void RemoteActionCompatParcelizer(int i, setMinRetryCount.read<K, V> readVar, Map<K, V> map) throws IOException {
        if (this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
            AudioAttributesCompatParcelizer(i, readVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(setMinRetryCount.RemoteActionCompatParcelizer(readVar, entry.getKey(), entry.getValue()));
            setMinRetryCount.read(this.AudioAttributesCompatParcelizer, readVar, entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: o.r8lambdafuj8eSXOdfKow5OUl2qXLFR6UQ$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[DownloadRequest.read.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[DownloadRequest.read.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.read.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.read.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.read.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.read.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.read.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.read.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.read.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.read.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.read.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.read.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadRequest.read.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private <K, V> void AudioAttributesCompatParcelizer(int i, setMinRetryCount.read<K, V> readVar, Map<K, V> map) throws IOException {
        switch (AnonymousClass4.AudioAttributesCompatParcelizer[readVar.read.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    IconCompatParcelizer(i, false, v, readVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    IconCompatParcelizer(i, true, v2, readVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                write(i, readVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                read(i, readVar, map);
                return;
            case 12:
                IconCompatParcelizer(i, readVar, map);
                return;
            default:
                StringBuilder sb = new StringBuilder("does not support key type: ");
                sb.append(readVar.read);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private <V> void IconCompatParcelizer(int i, boolean z, V v, setMinRetryCount.read<Boolean, V> readVar) throws IOException {
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
        this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(setMinRetryCount.RemoteActionCompatParcelizer(readVar, Boolean.valueOf(z), v));
        setMinRetryCount.read(this.AudioAttributesCompatParcelizer, readVar, Boolean.valueOf(z), v);
    }

    private <V> void write(int i, setMinRetryCount.read<Integer, V> readVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(setMinRetryCount.RemoteActionCompatParcelizer(readVar, Integer.valueOf(i4), v));
            setMinRetryCount.read(this.AudioAttributesCompatParcelizer, readVar, Integer.valueOf(i4), v);
        }
    }

    private <V> void read(int i, setMinRetryCount.read<Long, V> readVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(setMinRetryCount.RemoteActionCompatParcelizer(readVar, Long.valueOf(j), v));
            setMinRetryCount.read(this.AudioAttributesCompatParcelizer, readVar, Long.valueOf(j), v);
        }
    }

    private <V> void IconCompatParcelizer(int i, setMinRetryCount.read<String, V> readVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = it.next();
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str = strArr[i3];
            V v = map.get(str);
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, 2);
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(setMinRetryCount.RemoteActionCompatParcelizer(readVar, str, v));
            setMinRetryCount.read(this.AudioAttributesCompatParcelizer, readVar, str, v);
        }
    }
}
