package kotlin;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.BasicClassIntrospector;
import kotlin.CollectorBase;
import kotlin._ignorableAnnotation;

/* JADX INFO: loaded from: classes4.dex */
final class replaceParameterAnnotations implements CollectorBase {
    private final getParameterAnnotations IconCompatParcelizer;

    public static replaceParameterAnnotations AudioAttributesCompatParcelizer(getParameterAnnotations getparameterannotations) {
        if (getparameterannotations.AudioAttributesCompatParcelizer != null) {
            return getparameterannotations.AudioAttributesCompatParcelizer;
        }
        return new replaceParameterAnnotations(getparameterannotations);
    }

    private replaceParameterAnnotations(getParameterAnnotations getparameterannotations) {
        getParameterAnnotations getparameterannotations2 = (getParameterAnnotations) forDeserialization.read(getparameterannotations, "output");
        this.IconCompatParcelizer = getparameterannotations2;
        getparameterannotations2.AudioAttributesCompatParcelizer = this;
    }

    @Override // kotlin.CollectorBase
    public final CollectorBase.IconCompatParcelizer write() {
        return CollectorBase.IconCompatParcelizer.ASCENDING;
    }

    @Override // kotlin.CollectorBase
    public final void IconCompatParcelizer(int i, int i2) throws IOException {
        this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(i, i2);
    }

    @Override // kotlin.CollectorBase
    public final void IconCompatParcelizer(int i, long j) throws IOException {
        this.IconCompatParcelizer.write(i, j);
    }

    @Override // kotlin.CollectorBase
    public final void write(int i, long j) throws IOException {
        this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(i, j);
    }

    @Override // kotlin.CollectorBase
    public final void RemoteActionCompatParcelizer(int i, float f) throws IOException {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i, f);
    }

    @Override // kotlin.CollectorBase
    public final void write(int i, double d) throws IOException {
        this.IconCompatParcelizer.read(i, d);
    }

    @Override // kotlin.CollectorBase
    public final void write(int i, int i2) throws IOException {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i, i2);
    }

    @Override // kotlin.CollectorBase
    public final void AudioAttributesCompatParcelizer(int i, long j) throws IOException {
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver(i, j);
    }

    @Override // kotlin.CollectorBase
    public final void read(int i, int i2) throws IOException {
        this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer(i, i2);
    }

    @Override // kotlin.CollectorBase
    public final void RemoteActionCompatParcelizer(int i, long j) throws IOException {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i, j);
    }

    @Override // kotlin.CollectorBase
    public final void RemoteActionCompatParcelizer(int i, int i2) throws IOException {
        this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, i2);
    }

    @Override // kotlin.CollectorBase
    public final void IconCompatParcelizer(int i, boolean z) throws IOException {
        this.IconCompatParcelizer.IconCompatParcelizer(i, z);
    }

    @Override // kotlin.CollectorBase
    public final void IconCompatParcelizer(int i, String str) throws IOException {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(i, str);
    }

    @Override // kotlin.CollectorBase
    public final void IconCompatParcelizer(int i, AnnotatedWithParams annotatedWithParams) throws IOException {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(i, annotatedWithParams);
    }

    @Override // kotlin.CollectorBase
    public final void AudioAttributesImplBaseParcelizer(int i, int i2) throws IOException {
        this.IconCompatParcelizer.MediaBrowserCompatMediaItem(i, i2);
    }

    @Override // kotlin.CollectorBase
    public final void AudioAttributesCompatParcelizer(int i, int i2) throws IOException {
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver(i, i2);
    }

    @Override // kotlin.CollectorBase
    public final void read(int i, long j) throws IOException {
        this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, j);
    }

    @Override // kotlin.CollectorBase
    public final void IconCompatParcelizer(int i, Object obj, getPrimaryMember getprimarymember) throws IOException {
        this.IconCompatParcelizer.IconCompatParcelizer(i, (constructPropertyCollector) obj, getprimarymember);
    }

    @Override // kotlin.CollectorBase
    public final void AudioAttributesCompatParcelizer(int i, Object obj, getPrimaryMember getprimarymember) throws IOException {
        this.IconCompatParcelizer.read(i, (constructPropertyCollector) obj, getprimarymember);
    }

    @Override // kotlin.CollectorBase
    public final void read(int i) throws IOException {
        this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 3);
    }

    @Override // kotlin.CollectorBase
    public final void IconCompatParcelizer(int i) throws IOException {
        this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 4);
    }

    @Override // kotlin.CollectorBase
    public final void read(int i, Object obj) throws IOException {
        if (obj instanceof AnnotatedWithParams) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i, (AnnotatedWithParams) obj);
        } else {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i, (constructPropertyCollector) obj);
        }
    }

    @Override // kotlin.CollectorBase
    public final void MediaBrowserCompatCustomActionResultReceiver(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            int iMediaBrowserCompatCustomActionResultReceiver = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iMediaBrowserCompatCustomActionResultReceiver += getParameterAnnotations.MediaBrowserCompatCustomActionResultReceiver(list.get(i3).intValue());
            }
            this.IconCompatParcelizer.onFastForward(iMediaBrowserCompatCustomActionResultReceiver);
            while (i2 < list.size()) {
                this.IconCompatParcelizer.onCommand(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // kotlin.CollectorBase
    public final void RemoteActionCompatParcelizer(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            int iWrite = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3);
                iWrite += getParameterAnnotations.write();
            }
            this.IconCompatParcelizer.onFastForward(iWrite);
            while (i2 < list.size()) {
                this.IconCompatParcelizer.onCustomAction(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // kotlin.CollectorBase
    public final void AudioAttributesImplBaseParcelizer(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            int iWrite = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iWrite += getParameterAnnotations.write(list.get(i3).longValue());
            }
            this.IconCompatParcelizer.onFastForward(iWrite);
            while (i2 < list.size()) {
                this.IconCompatParcelizer.read(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.write(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // kotlin.CollectorBase
    public final void RatingCompat(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            int iIconCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iIconCompatParcelizer += getParameterAnnotations.IconCompatParcelizer(list.get(i3).longValue());
            }
            this.IconCompatParcelizer.onFastForward(iIconCompatParcelizer);
            while (i2 < list.size()) {
                this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.MediaBrowserCompatItemReceiver(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // kotlin.CollectorBase
    public final void IconCompatParcelizer(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            int iRemoteActionCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3);
                iRemoteActionCompatParcelizer += getParameterAnnotations.RemoteActionCompatParcelizer();
            }
            this.IconCompatParcelizer.onFastForward(iRemoteActionCompatParcelizer);
            while (i2 < list.size()) {
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // kotlin.CollectorBase
    public final void AudioAttributesImplApi21Parcelizer(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            int iAudioAttributesImplBaseParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3);
                iAudioAttributesImplBaseParcelizer += getParameterAnnotations.AudioAttributesImplBaseParcelizer();
            }
            this.IconCompatParcelizer.onFastForward(iAudioAttributesImplBaseParcelizer);
            while (i2 < list.size()) {
                this.IconCompatParcelizer.write(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // kotlin.CollectorBase
    public final void read(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            int iIconCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3);
                iIconCompatParcelizer += getParameterAnnotations.IconCompatParcelizer();
            }
            this.IconCompatParcelizer.onFastForward(iIconCompatParcelizer);
            while (i2 < list.size()) {
                this.IconCompatParcelizer.write(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.read(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // kotlin.CollectorBase
    public final void AudioAttributesCompatParcelizer(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            int iWrite = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iWrite += getParameterAnnotations.write(list.get(i3).intValue());
            }
            this.IconCompatParcelizer.onFastForward(iWrite);
            while (i2 < list.size()) {
                this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // kotlin.CollectorBase
    public final void write(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            int iAudioAttributesCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3);
                iAudioAttributesCompatParcelizer += getParameterAnnotations.AudioAttributesCompatParcelizer();
            }
            this.IconCompatParcelizer.onFastForward(iAudioAttributesCompatParcelizer);
            while (i2 < list.size()) {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.IconCompatParcelizer(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // kotlin.CollectorBase
    public final void write(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof isFactoryMethod) {
            isFactoryMethod isfactorymethod = (isFactoryMethod) list;
            while (i2 < list.size()) {
                RemoteActionCompatParcelizer(i, isfactorymethod.RemoteActionCompatParcelizer(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(i, list.get(i2));
            i2++;
        }
    }

    private void RemoteActionCompatParcelizer(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(i, (String) obj);
        } else {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(i, (AnnotatedWithParams) obj);
        }
    }

    @Override // kotlin.CollectorBase
    public final void RemoteActionCompatParcelizer(int i, List<AnnotatedWithParams> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(i, list.get(i2));
        }
    }

    @Override // kotlin.CollectorBase
    public final void MediaBrowserCompatSearchResultReceiver(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            int iMediaDescriptionCompat = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iMediaDescriptionCompat += getParameterAnnotations.MediaDescriptionCompat(list.get(i3).intValue());
            }
            this.IconCompatParcelizer.onFastForward(iMediaDescriptionCompat);
            while (i2 < list.size()) {
                this.IconCompatParcelizer.onFastForward(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.MediaBrowserCompatMediaItem(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // kotlin.CollectorBase
    public final void AudioAttributesImplApi26Parcelizer(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            int iAudioAttributesImplApi21Parcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3);
                iAudioAttributesImplApi21Parcelizer += getParameterAnnotations.AudioAttributesImplApi21Parcelizer();
            }
            this.IconCompatParcelizer.onFastForward(iAudioAttributesImplApi21Parcelizer);
            while (i2 < list.size()) {
                this.IconCompatParcelizer.onAddQueueItem(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // kotlin.CollectorBase
    public final void MediaBrowserCompatItemReceiver(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            int iAudioAttributesImplApi26Parcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3);
                iAudioAttributesImplApi26Parcelizer += getParameterAnnotations.AudioAttributesImplApi26Parcelizer();
            }
            this.IconCompatParcelizer.onFastForward(iAudioAttributesImplApi26Parcelizer);
            while (i2 < list.size()) {
                this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // kotlin.CollectorBase
    public final void MediaDescriptionCompat(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            int iMediaBrowserCompatMediaItem = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iMediaBrowserCompatMediaItem += getParameterAnnotations.MediaBrowserCompatMediaItem(list.get(i3).intValue());
            }
            this.IconCompatParcelizer.onFastForward(iMediaBrowserCompatMediaItem);
            while (i2 < list.size()) {
                this.IconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.MediaBrowserCompatItemReceiver(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // kotlin.CollectorBase
    public final void MediaMetadataCompat(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            int iRemoteActionCompatParcelizer = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iRemoteActionCompatParcelizer += getParameterAnnotations.RemoteActionCompatParcelizer(list.get(i3).longValue());
            }
            this.IconCompatParcelizer.onFastForward(iRemoteActionCompatParcelizer);
            while (i2 < list.size()) {
                this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // kotlin.CollectorBase
    public final void AudioAttributesCompatParcelizer(int i, List<?> list, getPrimaryMember getprimarymember) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            IconCompatParcelizer(i, list.get(i2), getprimarymember);
        }
    }

    @Override // kotlin.CollectorBase
    public final void read(int i, List<?> list, getPrimaryMember getprimarymember) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            AudioAttributesCompatParcelizer(i, list.get(i2), getprimarymember);
        }
    }

    @Override // kotlin.CollectorBase
    public final <K, V> void write(int i, BasicClassIntrospector.AudioAttributesCompatParcelizer<K, V> audioAttributesCompatParcelizer, Map<K, V> map) throws IOException {
        if (this.IconCompatParcelizer.MediaBrowserCompatMediaItem()) {
            AudioAttributesCompatParcelizer(i, audioAttributesCompatParcelizer, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            this.IconCompatParcelizer.onFastForward(BasicClassIntrospector.IconCompatParcelizer(audioAttributesCompatParcelizer, entry.getKey(), entry.getValue()));
            BasicClassIntrospector.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, audioAttributesCompatParcelizer, entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: o.replaceParameterAnnotations$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[_ignorableAnnotation.IconCompatParcelizer.values().length];
            write = iArr;
            try {
                iArr[_ignorableAnnotation.IconCompatParcelizer.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[_ignorableAnnotation.IconCompatParcelizer.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[_ignorableAnnotation.IconCompatParcelizer.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                write[_ignorableAnnotation.IconCompatParcelizer.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                write[_ignorableAnnotation.IconCompatParcelizer.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                write[_ignorableAnnotation.IconCompatParcelizer.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                write[_ignorableAnnotation.IconCompatParcelizer.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                write[_ignorableAnnotation.IconCompatParcelizer.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                write[_ignorableAnnotation.IconCompatParcelizer.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                write[_ignorableAnnotation.IconCompatParcelizer.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                write[_ignorableAnnotation.IconCompatParcelizer.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                write[_ignorableAnnotation.IconCompatParcelizer.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private <K, V> void AudioAttributesCompatParcelizer(int i, BasicClassIntrospector.AudioAttributesCompatParcelizer<K, V> audioAttributesCompatParcelizer, Map<K, V> map) throws IOException {
        switch (AnonymousClass5.write[audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    IconCompatParcelizer(i, false, v, audioAttributesCompatParcelizer);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    IconCompatParcelizer(i, true, v2, audioAttributesCompatParcelizer);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                RemoteActionCompatParcelizer(i, audioAttributesCompatParcelizer, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                IconCompatParcelizer(i, audioAttributesCompatParcelizer, map);
                return;
            case 12:
                read(i, audioAttributesCompatParcelizer, map);
                return;
            default:
                StringBuilder sb = new StringBuilder("does not support key type: ");
                sb.append(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private <V> void IconCompatParcelizer(int i, boolean z, V v, BasicClassIntrospector.AudioAttributesCompatParcelizer<Boolean, V> audioAttributesCompatParcelizer) throws IOException {
        this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
        this.IconCompatParcelizer.onFastForward(BasicClassIntrospector.IconCompatParcelizer(audioAttributesCompatParcelizer, Boolean.valueOf(z), v));
        BasicClassIntrospector.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, audioAttributesCompatParcelizer, Boolean.valueOf(z), v);
    }

    private <V> void RemoteActionCompatParcelizer(int i, BasicClassIntrospector.AudioAttributesCompatParcelizer<Integer, V> audioAttributesCompatParcelizer, Map<Integer, V> map) throws IOException {
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
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            this.IconCompatParcelizer.onFastForward(BasicClassIntrospector.IconCompatParcelizer(audioAttributesCompatParcelizer, Integer.valueOf(i4), v));
            BasicClassIntrospector.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, audioAttributesCompatParcelizer, Integer.valueOf(i4), v);
        }
    }

    private <V> void IconCompatParcelizer(int i, BasicClassIntrospector.AudioAttributesCompatParcelizer<Long, V> audioAttributesCompatParcelizer, Map<Long, V> map) throws IOException {
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
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            this.IconCompatParcelizer.onFastForward(BasicClassIntrospector.IconCompatParcelizer(audioAttributesCompatParcelizer, Long.valueOf(j), v));
            BasicClassIntrospector.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, audioAttributesCompatParcelizer, Long.valueOf(j), v);
        }
    }

    private <V> void read(int i, BasicClassIntrospector.AudioAttributesCompatParcelizer<String, V> audioAttributesCompatParcelizer, Map<String, V> map) throws IOException {
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
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(i, 2);
            this.IconCompatParcelizer.onFastForward(BasicClassIntrospector.IconCompatParcelizer(audioAttributesCompatParcelizer, str, v));
            BasicClassIntrospector.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, audioAttributesCompatParcelizer, str, v);
        }
    }
}
