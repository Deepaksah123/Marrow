package kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.addAudioOffloadListener;
import kotlin.stopLoading;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003\u001c!2B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0089\u0001\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001c\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u0005J3\u0010!\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00062\u0012\b\u0002\u0010\t\u001a\f0 R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010#J\u001f\u0010!\u001a\u0004\u0018\u00010$2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b!\u0010%J\u001b\u0010\u001f\u001a\u00020\u0006*\u00020&2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001f\u0010'R*\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0 R\b\u0012\u0004\u0012\u00028\u00000\u00000(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010)\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010+R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0018\u0010.\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00108R\u0011\u0010;\u001a\u0002098G¢\u0006\u0006\u001a\u0004\b!\u0010:R\u001a\u0010?\u001a\u00020<8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010=\u001a\u0004\b2\u0010>R\u0018\u0010A\u001a\u00020\u0010*\u00028\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010@R\u0018\u00100\u001a\u00020\u0006*\u00020\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010BR\u0018\u0010C\u001a\u00020\u0006*\u00020\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010B"}, d2 = {"Lo/stopLoading;", "Lo/addAudioOffloadListener;", "T", "", "<init>", "()V", "", "p0", "p1", "p2", "", "p3", "Lo/MdtaMetadataEntry;", "p4", "Lo/addMediaSource;", "p5", "", "p6", "p7", "p8", "p9", "p10", "p11", "Lo/TopUserCompanion;", "p12", "Lo/buf;", "p13", "", "AudioAttributesCompatParcelizer", "(IIILjava/util/List;Lo/MdtaMetadataEntry;Lo/addMediaSource;ZZIZIILo/TopUserCompanion;Lo/buf;)V", "(Ljava/lang/Object;)V", "read", "Lo/stopLoading$AudioAttributesCompatParcelizer;", "write", "(Lo/addAudioOffloadListener;ILo/stopLoading$AudioAttributesCompatParcelizer;)V", "(Lo/addAudioOffloadListener;Z)V", "Lo/onReset;", "(Ljava/lang/Object;I)Lo/onReset;", "", "([ILo/addAudioOffloadListener;)I", "Lo/setKeyListener;", "RemoteActionCompatParcelizer", "Lo/setKeyListener;", "Lo/MdtaMetadataEntry;", "I", "Lo/setEmojiCompatEnabled;", "AudioAttributesImplApi26Parcelizer", "Lo/setEmojiCompatEnabled;", "RatingCompat", "Ljava/util/List;", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "Lo/addKeySerializers;", "Lo/addKeySerializers;", "Lo/getKey;", "()J", "MediaDescriptionCompat", "Lo/_handleOddName;", "Lo/_handleOddName;", "()Lo/_handleOddName;", "MediaMetadataCompat", "(Lo/addAudioOffloadListener;)Z", "MediaBrowserCompatSearchResultReceiver", "(Lo/addAudioOffloadListener;)I", "MediaBrowserCompatMediaItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class stopLoading<T extends addAudioOffloadListener> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private addKeySerializers AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private MdtaMetadataEntry RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setKeyListener<Object, stopLoading<T>.AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer = setAutoSizeTextTypeUniformWithPresetSizes.read();

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setEmojiCompatEnabled<Object> read = setSupportAllCaps.AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final List<T> IconCompatParcelizer = new ArrayList();

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final List<T> MediaBrowserCompatItemReceiver = new ArrayList();

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final List<T> MediaBrowserCompatCustomActionResultReceiver = new ArrayList();

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final List<T> AudioAttributesImplApi21Parcelizer = new ArrayList();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<onReset> AudioAttributesImplBaseParcelizer = new ArrayList();

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final _handleOddName MediaMetadataCompat = new write(this);

    /* JADX WARN: Multi-variable type inference failed */
    public final void AudioAttributesCompatParcelizer(int p0, int p1, int p2, List<T> p3, MdtaMetadataEntry p4, addMediaSource<T> p5, boolean p6, boolean p7, int p8, boolean p9, int p10, int p11, TopUserCompanion p12, buf p13) {
        long j;
        boolean z;
        final MdtaMetadataEntry mdtaMetadataEntry;
        final MdtaMetadataEntry mdtaMetadataEntry2;
        int[] iArr;
        int i;
        int i2;
        int[] iArr2;
        int mediaBrowserCompatCustomActionResultReceiver;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int[] iArr3;
        Object obj;
        stopLoading<T>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer;
        onReset[] onresetArr;
        onReset[] onresetArr2;
        int i3;
        MdtaMetadataEntry mdtaMetadataEntry3;
        MdtaMetadataEntry mdtaMetadataEntry4;
        onReset[] onresetArr3;
        long[] jArr3;
        Object[] objArr3;
        long[] jArr4;
        Object[] objArr4;
        List<T> list = p3;
        int i4 = p8;
        MdtaMetadataEntry mdtaMetadataEntry5 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = p4;
        List<T> list2 = list;
        int size = list2.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                if (AudioAttributesCompatParcelizer((addAudioOffloadListener) list.get(i6))) {
                    break;
                } else {
                    i6++;
                }
            } else if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) {
                AudioAttributesCompatParcelizer();
                return;
            }
        }
        int i7 = this.write;
        addAudioOffloadListener addaudiooffloadlistener = (addAudioOffloadListener) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) p3);
        this.write = addaudiooffloadlistener != null ? addaudiooffloadlistener.getIconCompatParcelizer() : 0;
        if (p6) {
            long j2 = -1;
            j = hasReferringProperties.read(((long) p0) & ((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)));
        } else {
            j = hasReferringProperties.read(((long) p0) << 32);
        }
        boolean z2 = p7 || !p9;
        setKeyListener<Object, stopLoading<T>.AudioAttributesCompatParcelizer> setkeylistener = this.AudioAttributesCompatParcelizer;
        Object[] objArr5 = setkeylistener.IconCompatParcelizer;
        long[] jArr5 = setkeylistener.RemoteActionCompatParcelizer;
        int length = jArr5.length - 2;
        if (length >= 0) {
            z = z2;
            while (true) {
                long j3 = jArr5[i5];
                int i8 = length;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i5 - i8)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j3 & 255) < 128) {
                            jArr4 = jArr5;
                            objArr4 = objArr5;
                            this.read.write(objArr5[(i5 << 3) + i10]);
                        } else {
                            jArr4 = jArr5;
                            objArr4 = objArr5;
                        }
                        j3 >>= 8;
                        i10++;
                        objArr5 = objArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    objArr3 = objArr5;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    objArr3 = objArr5;
                }
                length = i8;
                if (i5 == length) {
                    break;
                }
                i5++;
                objArr5 = objArr3;
                jArr5 = jArr3;
            }
        } else {
            z = z2;
        }
        int size2 = list2.size();
        int i11 = 0;
        while (i11 < size2) {
            T t = list.get(i11);
            this.read.AudioAttributesCompatParcelizer(t.getMediaMetadataCompat());
            if (AudioAttributesCompatParcelizer((addAudioOffloadListener) t)) {
                stopLoading<T>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer2 = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(t.getMediaMetadataCompat());
                int i12 = mdtaMetadataEntry5 != null ? mdtaMetadataEntry5.read(t.getMediaMetadataCompat()) : -1;
                boolean z3 = i12 == -1 && mdtaMetadataEntry5 != null;
                if (audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer2 == null) {
                    stopLoading<T>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
                    AudioAttributesCompatParcelizer.write$default(audioAttributesCompatParcelizer, t, p12, p13, p10, p11, 0, 32, null);
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(t.getMediaMetadataCompat(), audioAttributesCompatParcelizer);
                    if (t.getIconCompatParcelizer() == i12 || i12 == -1) {
                        long j4 = t.read(0);
                        write(t, t.getRemoteActionCompatParcelizer() ? hasReferringProperties.AudioAttributesCompatParcelizer(j4) : hasReferringProperties.IconCompatParcelizer(j4), audioAttributesCompatParcelizer);
                        if (z3) {
                            for (onReset onreset : audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()) {
                                if (onreset != null) {
                                    onreset.read();
                                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                                }
                            }
                        }
                        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                    } else if (i12 < i7) {
                        this.IconCompatParcelizer.add(t);
                    } else {
                        this.MediaBrowserCompatItemReceiver.add(t);
                    }
                    i3 = size2;
                    mdtaMetadataEntry3 = mdtaMetadataEntry5;
                } else {
                    if (z) {
                        AudioAttributesCompatParcelizer.write$default(audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer2, t, p12, p13, p10, p11, 0, 32, null);
                        onReset[] remoteActionCompatParcelizer = audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer2.getRemoteActionCompatParcelizer();
                        int length2 = remoteActionCompatParcelizer.length;
                        int i13 = 0;
                        while (i13 < length2) {
                            int i14 = size2;
                            onReset onreset2 = remoteActionCompatParcelizer[i13];
                            if (onreset2 != null) {
                                mdtaMetadataEntry4 = mdtaMetadataEntry5;
                                onresetArr3 = remoteActionCompatParcelizer;
                                if (!hasReferringProperties.write(onreset2.getRatingCompat(), onReset.INSTANCE.IconCompatParcelizer())) {
                                    onreset2.IconCompatParcelizer(hasReferringProperties.AudioAttributesCompatParcelizer(onreset2.getRatingCompat(), j));
                                }
                            } else {
                                mdtaMetadataEntry4 = mdtaMetadataEntry5;
                                onresetArr3 = remoteActionCompatParcelizer;
                            }
                            i13++;
                            size2 = i14;
                            mdtaMetadataEntry5 = mdtaMetadataEntry4;
                            remoteActionCompatParcelizer = onresetArr3;
                        }
                        i3 = size2;
                        mdtaMetadataEntry3 = mdtaMetadataEntry5;
                        if (z3) {
                            onReset[] remoteActionCompatParcelizer2 = audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer2.getRemoteActionCompatParcelizer();
                            for (onReset onreset3 : remoteActionCompatParcelizer2) {
                                if (onreset3 != null) {
                                    if (onreset3.MediaMetadataCompat()) {
                                        this.AudioAttributesImplBaseParcelizer.remove(onreset3);
                                        addKeySerializers addkeyserializers = this.AudioAttributesImplApi26Parcelizer;
                                        if (addkeyserializers != null) {
                                            addDeserializers.read(addkeyserializers);
                                            getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                                        }
                                    }
                                    onreset3.read();
                                }
                            }
                        }
                        AudioAttributesCompatParcelizer$default(this, t, false, 2, null);
                    } else {
                        i3 = size2;
                        mdtaMetadataEntry3 = mdtaMetadataEntry5;
                    }
                    getShowPopup getshowpopup4 = getShowPopup.INSTANCE;
                }
            } else {
                i3 = size2;
                mdtaMetadataEntry3 = mdtaMetadataEntry5;
                AudioAttributesCompatParcelizer(t.getMediaMetadataCompat());
                getShowPopup getshowpopup5 = getShowPopup.INSTANCE;
            }
            i11++;
            list = p3;
            size2 = i3;
            mdtaMetadataEntry5 = mdtaMetadataEntry3;
        }
        MdtaMetadataEntry mdtaMetadataEntry6 = mdtaMetadataEntry5;
        int[] iArr4 = new int[i4];
        if (!z || mdtaMetadataEntry6 == null) {
            mdtaMetadataEntry = mdtaMetadataEntry6;
        } else {
            if (this.IconCompatParcelizer.isEmpty()) {
                mdtaMetadataEntry = mdtaMetadataEntry6;
            } else {
                List<T> list3 = this.IconCompatParcelizer;
                if (list3.size() > 1) {
                    mdtaMetadataEntry = mdtaMetadataEntry6;
                    IntermediateLoginResponseBody.IconCompatParcelizer(list3, new Comparator() { // from class: o.stopLoading.2
                        @Override // java.util.Comparator
                        public final int compare(T t2, T t3) {
                            return getConfigExpirySeconds.read(Integer.valueOf(mdtaMetadataEntry.read(((addAudioOffloadListener) t3).getMediaMetadataCompat())), Integer.valueOf(mdtaMetadataEntry.read(((addAudioOffloadListener) t2).getMediaMetadataCompat())));
                        }
                    });
                } else {
                    mdtaMetadataEntry = mdtaMetadataEntry6;
                }
                List<T> list4 = this.IconCompatParcelizer;
                int size3 = list4.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    T t2 = list4.get(i15);
                    write$default(this, t2, p10 - read(iArr4, t2), null, 4, null);
                    AudioAttributesCompatParcelizer$default(this, t2, false, 2, null);
                }
                getOrderDetails.RemoteActionCompatParcelizer(iArr4, 0, 0, iArr4.length);
            }
            if (!this.MediaBrowserCompatItemReceiver.isEmpty()) {
                List<T> list5 = this.MediaBrowserCompatItemReceiver;
                if (list5.size() > 1) {
                    IntermediateLoginResponseBody.IconCompatParcelizer(list5, new Comparator() { // from class: o.stopLoading.4
                        @Override // java.util.Comparator
                        public final int compare(T t3, T t4) {
                            return getConfigExpirySeconds.read(Integer.valueOf(mdtaMetadataEntry.read(((addAudioOffloadListener) t3).getMediaMetadataCompat())), Integer.valueOf(mdtaMetadataEntry.read(((addAudioOffloadListener) t4).getMediaMetadataCompat())));
                        }
                    });
                }
                List<T> list6 = this.MediaBrowserCompatItemReceiver;
                int size4 = list6.size();
                for (int i16 = 0; i16 < size4; i16++) {
                    T t3 = list6.get(i16);
                    write$default(this, t3, (p11 + read(iArr4, t3)) - t3.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, 4, null);
                    AudioAttributesCompatParcelizer$default(this, t3, false, 2, null);
                }
                getOrderDetails.RemoteActionCompatParcelizer(iArr4, 0, 0, iArr4.length);
            }
        }
        setEmojiCompatEnabled<Object> setemojicompatenabled = this.read;
        Object[] objArr6 = setemojicompatenabled.write;
        long[] jArr6 = setemojicompatenabled.AudioAttributesCompatParcelizer;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i17 = 0;
            while (true) {
                long j5 = jArr6[i17];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8 - ((~(i17 - length3)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j5 & 255) >= 128 || (audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer((obj = objArr6[(i17 << 3) + i19]))) == 0) {
                            jArr2 = jArr6;
                            objArr2 = objArr6;
                        } else {
                            int i20 = p4.read(obj);
                            jArr2 = jArr6;
                            audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(Math.min(i4, audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getIconCompatParcelizer()));
                            objArr2 = objArr6;
                            audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.IconCompatParcelizer(Math.min(i4 - audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getIconCompatParcelizer(), audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getWrite()));
                            if (i20 == -1) {
                                onReset[] remoteActionCompatParcelizer3 = audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer();
                                int length4 = remoteActionCompatParcelizer3.length;
                                int i21 = 0;
                                boolean z4 = false;
                                int i22 = 0;
                                while (i21 < length4) {
                                    onReset onreset4 = remoteActionCompatParcelizer3[i21];
                                    if (onreset4 != null) {
                                        if (onreset4.MediaMetadataCompat()) {
                                            getShowPopup getshowpopup6 = getShowPopup.INSTANCE;
                                            onresetArr2 = remoteActionCompatParcelizer3;
                                            z4 = true;
                                        } else if (onreset4.MediaBrowserCompatMediaItem()) {
                                            onreset4.MediaBrowserCompatSearchResultReceiver();
                                            audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer()[i22] = null;
                                            onresetArr2 = remoteActionCompatParcelizer3;
                                            this.AudioAttributesImplBaseParcelizer.remove(onreset4);
                                            addKeySerializers addkeyserializers2 = this.AudioAttributesImplApi26Parcelizer;
                                            if (addkeyserializers2 != null) {
                                                addDeserializers.read(addkeyserializers2);
                                                getShowPopup getshowpopup7 = getShowPopup.INSTANCE;
                                            }
                                        } else {
                                            onresetArr2 = remoteActionCompatParcelizer3;
                                            if (onreset4.getMediaDescriptionCompat() != null) {
                                                onreset4.AudioAttributesCompatParcelizer();
                                            }
                                            if (onreset4.MediaMetadataCompat()) {
                                                this.AudioAttributesImplBaseParcelizer.add(onreset4);
                                                addKeySerializers addkeyserializers3 = this.AudioAttributesImplApi26Parcelizer;
                                                if (addkeyserializers3 != null) {
                                                    addDeserializers.read(addkeyserializers3);
                                                    getShowPopup getshowpopup8 = getShowPopup.INSTANCE;
                                                }
                                                z4 = true;
                                            } else {
                                                onreset4.MediaBrowserCompatSearchResultReceiver();
                                                audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer()[i22] = null;
                                            }
                                            getShowPopup getshowpopup9 = getShowPopup.INSTANCE;
                                        }
                                        i21++;
                                        i22++;
                                        remoteActionCompatParcelizer3 = onresetArr2;
                                    } else {
                                        onresetArr2 = remoteActionCompatParcelizer3;
                                    }
                                    i21++;
                                    i22++;
                                    remoteActionCompatParcelizer3 = onresetArr2;
                                }
                                if (!z4) {
                                    AudioAttributesCompatParcelizer(obj);
                                }
                                getShowPopup getshowpopup10 = getShowPopup.INSTANCE;
                            } else {
                                PropertyValueAny read = audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getRead();
                                toMagicModuleMetaRepoModel.write(read);
                                addAudioOffloadListener addaudiooffloadlistenerRemoteActionCompatParcelizer = p5.RemoteActionCompatParcelizer(i20, audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getWrite(), audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getIconCompatParcelizer(), read.getRead());
                                addaudiooffloadlistenerRemoteActionCompatParcelizer.IconCompatParcelizer(true);
                                onReset[] remoteActionCompatParcelizer4 = audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer();
                                int length5 = remoteActionCompatParcelizer4.length;
                                iArr3 = iArr4;
                                int i23 = 0;
                                while (true) {
                                    if (i23 < length5) {
                                        onReset onreset5 = remoteActionCompatParcelizer4[i23];
                                        int i24 = length5;
                                        if (onreset5 != null) {
                                            boolean zMediaDescriptionCompat = onreset5.MediaDescriptionCompat();
                                            onresetArr = remoteActionCompatParcelizer4;
                                            if (zMediaDescriptionCompat) {
                                                break;
                                            }
                                        } else {
                                            onresetArr = remoteActionCompatParcelizer4;
                                        }
                                        i23++;
                                        remoteActionCompatParcelizer4 = onresetArr;
                                        length5 = i24;
                                    } else {
                                        if (mdtaMetadataEntry == null || i20 != mdtaMetadataEntry.read(obj)) {
                                            break;
                                        }
                                        AudioAttributesCompatParcelizer(obj);
                                        getShowPopup getshowpopup11 = getShowPopup.INSTANCE;
                                    }
                                }
                                audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.write(addaudiooffloadlistenerRemoteActionCompatParcelizer, p12, p13, p10, p11, audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer());
                                if (i20 < this.write) {
                                    this.MediaBrowserCompatCustomActionResultReceiver.add((T) addaudiooffloadlistenerRemoteActionCompatParcelizer);
                                } else {
                                    this.AudioAttributesImplApi21Parcelizer.add((T) addaudiooffloadlistenerRemoteActionCompatParcelizer);
                                }
                                j5 >>= 8;
                                i19++;
                                objArr6 = objArr2;
                                i4 = p8;
                                iArr4 = iArr3;
                                jArr6 = jArr2;
                            }
                        }
                        iArr3 = iArr4;
                        j5 >>= 8;
                        i19++;
                        objArr6 = objArr2;
                        i4 = p8;
                        iArr4 = iArr3;
                        jArr6 = jArr2;
                    }
                    mdtaMetadataEntry2 = p4;
                    jArr = jArr6;
                    objArr = objArr6;
                    iArr = iArr4;
                    if (i18 != 8) {
                        break;
                    }
                } else {
                    mdtaMetadataEntry2 = p4;
                    jArr = jArr6;
                    objArr = objArr6;
                    iArr = iArr4;
                }
                if (i17 == length3) {
                    break;
                }
                i17++;
                objArr6 = objArr;
                i4 = p8;
                iArr4 = iArr;
                jArr6 = jArr;
            }
        } else {
            mdtaMetadataEntry2 = p4;
            iArr = iArr4;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver.isEmpty()) {
            i = p1;
            i2 = p2;
            iArr2 = iArr;
        } else {
            List<T> list7 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (list7.size() > 1) {
                IntermediateLoginResponseBody.IconCompatParcelizer(list7, new Comparator() { // from class: o.stopLoading.1
                    @Override // java.util.Comparator
                    public final int compare(T t4, T t5) {
                        return getConfigExpirySeconds.read(Integer.valueOf(mdtaMetadataEntry2.read(((addAudioOffloadListener) t5).getMediaMetadataCompat())), Integer.valueOf(mdtaMetadataEntry2.read(((addAudioOffloadListener) t4).getMediaMetadataCompat())));
                    }
                });
            }
            List<T> list8 = this.MediaBrowserCompatCustomActionResultReceiver;
            int size5 = list8.size();
            int i25 = 0;
            while (i25 < size5) {
                T t4 = list8.get(i25);
                stopLoading<T>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer3 = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(t4.getMediaMetadataCompat());
                toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer3);
                stopLoading<T>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer3;
                int[] iArr5 = iArr;
                int i26 = read(iArr5, t4);
                if (p7) {
                    mediaBrowserCompatCustomActionResultReceiver = read((addAudioOffloadListener) IntermediateLoginResponseBody.RatingCompat((List) p3));
                } else {
                    mediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer2.getMediaBrowserCompatCustomActionResultReceiver();
                }
                t4.write(mediaBrowserCompatCustomActionResultReceiver - i26, audioAttributesCompatParcelizer2.getAudioAttributesCompatParcelizer(), p1, p2);
                if (z) {
                    AudioAttributesCompatParcelizer(t4, true);
                }
                i25++;
                iArr = iArr5;
            }
            i = p1;
            i2 = p2;
            iArr2 = iArr;
            getOrderDetails.RemoteActionCompatParcelizer(iArr2, 0, 0, iArr2.length);
        }
        if (!this.AudioAttributesImplApi21Parcelizer.isEmpty()) {
            List<T> list9 = this.AudioAttributesImplApi21Parcelizer;
            if (list9.size() > 1) {
                IntermediateLoginResponseBody.IconCompatParcelizer(list9, new Comparator() { // from class: o.stopLoading.3
                    @Override // java.util.Comparator
                    public final int compare(T t5, T t6) {
                        return getConfigExpirySeconds.read(Integer.valueOf(mdtaMetadataEntry2.read(((addAudioOffloadListener) t5).getMediaMetadataCompat())), Integer.valueOf(mdtaMetadataEntry2.read(((addAudioOffloadListener) t6).getMediaMetadataCompat())));
                    }
                });
            }
            List<T> list10 = this.AudioAttributesImplApi21Parcelizer;
            int size6 = list10.size();
            for (int i27 = 0; i27 < size6; i27++) {
                T t5 = list10.get(i27);
                stopLoading<T>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer4 = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(t5.getMediaMetadataCompat());
                toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer4);
                stopLoading<T>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer4;
                t5.write((audioAttributesCompatParcelizer3.getAudioAttributesImplBaseParcelizer() - t5.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) + read(iArr2, t5), audioAttributesCompatParcelizer3.getAudioAttributesCompatParcelizer(), i, i2);
                if (z) {
                    AudioAttributesCompatParcelizer(t5, true);
                }
            }
        }
        List<T> list11 = this.MediaBrowserCompatCustomActionResultReceiver;
        IntermediateLoginResponseBody.AudioAttributesImplApi21Parcelizer((List) list11);
        getShowPopup getshowpopup12 = getShowPopup.INSTANCE;
        p3.addAll(0, list11);
        p3.addAll(this.AudioAttributesImplApi21Parcelizer);
        this.IconCompatParcelizer.clear();
        this.MediaBrowserCompatItemReceiver.clear();
        this.MediaBrowserCompatCustomActionResultReceiver.clear();
        this.AudioAttributesImplApi21Parcelizer.clear();
        this.read.RemoteActionCompatParcelizer();
    }

    private final void AudioAttributesCompatParcelizer(Object p0) {
        onReset[] remoteActionCompatParcelizer;
        stopLoading<T>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0);
        if (audioAttributesCompatParcelizerIconCompatParcelizer == null || (remoteActionCompatParcelizer = audioAttributesCompatParcelizerIconCompatParcelizer.getRemoteActionCompatParcelizer()) == null) {
            return;
        }
        for (onReset onreset : remoteActionCompatParcelizer) {
            if (onreset != null) {
                onreset.MediaBrowserCompatSearchResultReceiver();
            }
        }
    }

    public final void read() {
        AudioAttributesCompatParcelizer();
        this.RemoteActionCompatParcelizer = null;
        this.write = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void AudioAttributesCompatParcelizer() {
        /*
            r14 = this;
            o.setKeyListener<java.lang.Object, o.stopLoading<T>$AudioAttributesCompatParcelizer> r0 = r14.AudioAttributesCompatParcelizer
            boolean r0 = r0.MediaBrowserCompatItemReceiver()
            if (r0 == 0) goto L65
            o.setKeyListener<java.lang.Object, o.stopLoading<T>$AudioAttributesCompatParcelizer> r0 = r14.AudioAttributesCompatParcelizer
            o.AppCompatButton r0 = (kotlin.AppCompatButton) r0
            java.lang.Object[] r1 = r0.MediaBrowserCompatItemReceiver
            long[] r0 = r0.RemoteActionCompatParcelizer
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L60
            r3 = 0
            r4 = r3
        L17:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5b
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L31:
            if (r9 >= r7) goto L59
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L55
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            o.stopLoading$AudioAttributesCompatParcelizer r10 = (o.stopLoading.AudioAttributesCompatParcelizer) r10
            o.onReset[] r10 = r10.getRemoteActionCompatParcelizer()
            int r11 = r10.length
            r12 = r3
        L49:
            if (r12 >= r11) goto L55
            r13 = r10[r12]
            if (r13 == 0) goto L52
            r13.MediaBrowserCompatSearchResultReceiver()
        L52:
            int r12 = r12 + 1
            goto L49
        L55:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L31
        L59:
            if (r7 != r8) goto L60
        L5b:
            if (r4 == r2) goto L60
            int r4 = r4 + 1
            goto L17
        L60:
            o.setKeyListener<java.lang.Object, o.stopLoading<T>$AudioAttributesCompatParcelizer> r14 = r14.AudioAttributesCompatParcelizer
            r14.AudioAttributesCompatParcelizer()
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.stopLoading.AudioAttributesCompatParcelizer():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void write$default(stopLoading stoploading, addAudioOffloadListener addaudiooffloadlistener, int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            stopLoading<T>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer = stoploading.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(addaudiooffloadlistener.getMediaMetadataCompat());
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer);
            audioAttributesCompatParcelizer = audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer;
        }
        stoploading.write(addaudiooffloadlistener, i, audioAttributesCompatParcelizer);
    }

    private final void write(T p0, int p1, stopLoading<T>.AudioAttributesCompatParcelizer p2) {
        long jRemoteActionCompatParcelizer$default;
        int i = 0;
        long j = p0.read(0);
        if (p0.getRemoteActionCompatParcelizer()) {
            jRemoteActionCompatParcelizer$default = hasReferringProperties.RemoteActionCompatParcelizer$default(j, 0, p1, 1, null);
        } else {
            jRemoteActionCompatParcelizer$default = hasReferringProperties.RemoteActionCompatParcelizer$default(j, p1, 0, 2, null);
        }
        onReset[] remoteActionCompatParcelizer = p2.getRemoteActionCompatParcelizer();
        int length = remoteActionCompatParcelizer.length;
        int i2 = 0;
        while (i < length) {
            onReset onreset = remoteActionCompatParcelizer[i];
            if (onreset != null) {
                onreset.IconCompatParcelizer(hasReferringProperties.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer$default, hasReferringProperties.IconCompatParcelizer(p0.read(i2), j)));
            }
            i++;
            i2++;
        }
    }

    static /* synthetic */ void AudioAttributesCompatParcelizer$default(stopLoading stoploading, addAudioOffloadListener addaudiooffloadlistener, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        stoploading.AudioAttributesCompatParcelizer(addaudiooffloadlistener, z);
    }

    private final void AudioAttributesCompatParcelizer(T p0, boolean p1) {
        stopLoading<T>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(p0.getMediaMetadataCompat());
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer);
        onReset[] remoteActionCompatParcelizer = audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer();
        int length = remoteActionCompatParcelizer.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            onReset onreset = remoteActionCompatParcelizer[i];
            if (onreset != null) {
                long j = p0.read(i2);
                long ratingCompat = onreset.getRatingCompat();
                if (!hasReferringProperties.write(ratingCompat, onReset.INSTANCE.IconCompatParcelizer()) && !hasReferringProperties.write(ratingCompat, j)) {
                    onreset.write(hasReferringProperties.IconCompatParcelizer(j, ratingCompat), p1);
                }
                onreset.IconCompatParcelizer(j);
            }
            i++;
            i2++;
        }
    }

    public final onReset write(Object p0, int p1) {
        onReset[] remoteActionCompatParcelizer;
        stopLoading<T>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(p0);
        if (audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer == null || (remoteActionCompatParcelizer = audioAttributesCompatParcelizerAudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer()) == null) {
            return null;
        }
        return remoteActionCompatParcelizer[p1];
    }

    private final int read(int[] iArr, T t) {
        int iAudioAttributesImplApi26Parcelizer = t.getOnCustomAction();
        int iRatingCompat = t.getHandleMediaPlayPauseIfPendingOnHandler();
        int iMax = 0;
        for (int i = iAudioAttributesImplApi26Parcelizer; i < iRatingCompat + iAudioAttributesImplApi26Parcelizer; i++) {
            int iMediaBrowserCompatCustomActionResultReceiver = iArr[i] + t.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            iArr[i] = iMediaBrowserCompatCustomActionResultReceiver;
            iMax = Math.max(iMax, iMediaBrowserCompatCustomActionResultReceiver);
        }
        return iMax;
    }

    public final long write() {
        long jRemoteActionCompatParcelizer = getKey.INSTANCE.RemoteActionCompatParcelizer();
        List<onReset> list = this.AudioAttributesImplBaseParcelizer;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            onReset onreset = list.get(i);
            hasAnyGetter mediaDescriptionCompat = onreset.getMediaDescriptionCompat();
            if (mediaDescriptionCompat != null) {
                long j = -1;
                jRemoteActionCompatParcelizer = getKey.read((((long) Math.max((int) jRemoteActionCompatParcelizer, hasReferringProperties.AudioAttributesCompatParcelizer(onreset.getRatingCompat()) + ((int) mediaDescriptionCompat.getOnPause()))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Math.max((int) (jRemoteActionCompatParcelizer >> 32), hasReferringProperties.IconCompatParcelizer(onreset.getRatingCompat()) + ((int) (mediaDescriptionCompat.getOnPause() >> 32)))) << 32));
            }
        }
        return jRemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final _handleOddName getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    private final boolean AudioAttributesCompatParcelizer(T t) {
        int iAudioAttributesImplBaseParcelizer = t.AudioAttributesImplBaseParcelizer();
        for (int i = 0; i < iAudioAttributesImplBaseParcelizer; i++) {
            if (unregisterListener.IconCompatParcelizer(t.IconCompatParcelizer(i)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int read(addAudioOffloadListener addaudiooffloadlistener) {
        long j = addaudiooffloadlistener.read(0);
        return addaudiooffloadlistener.getRemoteActionCompatParcelizer() ? hasReferringProperties.AudioAttributesCompatParcelizer(j) : hasReferringProperties.IconCompatParcelizer(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int IconCompatParcelizer(addAudioOffloadListener addaudiooffloadlistener) {
        long j = addaudiooffloadlistener.read(0);
        return !addaudiooffloadlistener.getRemoteActionCompatParcelizer() ? hasReferringProperties.AudioAttributesCompatParcelizer(j) : hasReferringProperties.IconCompatParcelizer(j);
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR4\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0017\u001a\u00020\t8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\"\u0010\u000e\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u000e\u0010\u001c\"\u0004\b\u0012\u0010\u001dR\"\u0010\u0012\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b\u0017\u0010\u001dR\u0014\u0010\"\u001a\u00020 8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010!R$\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b#\u0010\u001cR$\u0010$\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c"}, d2 = {"Lo/stopLoading$AudioAttributesCompatParcelizer;", "", "<init>", "(Lo/stopLoading;)V", "p0", "Lo/TopUserCompanion;", "p1", "Lo/buf;", "p2", "", "p3", "p4", "p5", "", "write", "(Lo/addAudioOffloadListener;Lo/TopUserCompanion;Lo/buf;III)V", "", "Lo/onReset;", "IconCompatParcelizer", "[Lo/onReset;", "()[Lo/onReset;", "RemoteActionCompatParcelizer", "Lo/PropertyValueAny;", "AudioAttributesCompatParcelizer", "Lo/PropertyValueAny;", "read", "()Lo/PropertyValueAny;", "I", "()I", "(I)V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "", "()Z", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private PropertyValueAny read;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int AudioAttributesImplBaseParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private onReset[] RemoteActionCompatParcelizer = unregisterListener.AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private int IconCompatParcelizer = 1;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private int write;

        public AudioAttributesCompatParcelizer() {
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final onReset[] getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final PropertyValueAny getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final void IconCompatParcelizer(int i) {
            this.write = i;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final int getWrite() {
            return this.write;
        }

        public final void AudioAttributesCompatParcelizer(int i) {
            this.IconCompatParcelizer = i;
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
        public final int getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        private final boolean MediaBrowserCompatCustomActionResultReceiver() {
            for (onReset onreset : this.RemoteActionCompatParcelizer) {
                if (onreset != null && onreset.getMediaBrowserCompatItemReceiver()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
        public final int getMediaBrowserCompatCustomActionResultReceiver() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final int getAudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public static /* synthetic */ void write$default(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, addAudioOffloadListener addaudiooffloadlistener, TopUserCompanion topUserCompanion, buf bufVar, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 32) != 0) {
                i3 = stopLoading.this.IconCompatParcelizer(addaudiooffloadlistener);
            }
            audioAttributesCompatParcelizer.write(addaudiooffloadlistener, topUserCompanion, bufVar, i, i2, i3);
        }

        public final void write(T p0, TopUserCompanion p1, buf p2, int p3, int p4, int p5) {
            if (!MediaBrowserCompatCustomActionResultReceiver()) {
                this.MediaBrowserCompatCustomActionResultReceiver = p3;
                this.AudioAttributesImplBaseParcelizer = p4;
            }
            int length = this.RemoteActionCompatParcelizer.length;
            for (int iAudioAttributesImplBaseParcelizer = p0.AudioAttributesImplBaseParcelizer(); iAudioAttributesImplBaseParcelizer < length; iAudioAttributesImplBaseParcelizer++) {
                onReset onreset = this.RemoteActionCompatParcelizer[iAudioAttributesImplBaseParcelizer];
                if (onreset != null) {
                    onreset.MediaBrowserCompatSearchResultReceiver();
                }
            }
            if (this.RemoteActionCompatParcelizer.length != p0.AudioAttributesImplBaseParcelizer()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.RemoteActionCompatParcelizer, p0.AudioAttributesImplBaseParcelizer());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
                this.RemoteActionCompatParcelizer = (onReset[]) objArrCopyOf;
            }
            this.read = PropertyValueAny.read(p0.getMediaBrowserCompatSearchResultReceiver());
            this.AudioAttributesCompatParcelizer = p5;
            this.write = p0.getOnCustomAction();
            this.IconCompatParcelizer = p0.getHandleMediaPlayPauseIfPendingOnHandler();
            int iAudioAttributesImplBaseParcelizer2 = p0.AudioAttributesImplBaseParcelizer();
            final stopLoading<T> stoploading = stopLoading.this;
            for (int i = 0; i < iAudioAttributesImplBaseParcelizer2; i++) {
                cancelLoad cancelloadIconCompatParcelizer = unregisterListener.IconCompatParcelizer(p0.IconCompatParcelizer(i));
                if (cancelloadIconCompatParcelizer == null) {
                    onReset onreset2 = this.RemoteActionCompatParcelizer[i];
                    if (onreset2 != null) {
                        onreset2.MediaBrowserCompatSearchResultReceiver();
                    }
                    this.RemoteActionCompatParcelizer[i] = null;
                } else {
                    onReset onreset3 = this.RemoteActionCompatParcelizer[i];
                    if (onreset3 == null) {
                        onReset onreset4 = new onReset(p1, p2, new getCreatedOnDateMs() { // from class: o.registerOnLoadCanceledListener
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return stopLoading.AudioAttributesCompatParcelizer.IconCompatParcelizer(stoploading);
                            }
                        });
                        this.RemoteActionCompatParcelizer[i] = onreset4;
                        onreset3 = onreset4;
                    }
                    onreset3.RemoteActionCompatParcelizer(cancelloadIconCompatParcelizer.read());
                    onreset3.read(cancelloadIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
                    onreset3.write(cancelloadIconCompatParcelizer.write());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup IconCompatParcelizer(stopLoading stoploading) {
            addKeySerializers addkeyserializers = stoploading.AudioAttributesImplApi26Parcelizer;
            if (addkeyserializers != null) {
                addDeserializers.read(addkeyserializers);
            }
            return getShowPopup.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/stopLoading$write;", "Lo/writerFor;", "Lo/stopLoading$IconCompatParcelizer;", "Lo/stopLoading;", "p0", "<init>", "(Lo/stopLoading;)V", "write", "()Lo/stopLoading$IconCompatParcelizer;", "", "(Lo/stopLoading$IconCompatParcelizer;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Lo/stopLoading;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class write extends writerFor<IconCompatParcelizer> {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final stopLoading<?> IconCompatParcelizer;

        public write(stopLoading<?> stoploading) {
            this.IconCompatParcelizer = stoploading;
        }

        @Override // kotlin.writerFor
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final IconCompatParcelizer IconCompatParcelizer() {
            return new IconCompatParcelizer(this.IconCompatParcelizer);
        }

        @Override // kotlin.writerFor
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final void IconCompatParcelizer(IconCompatParcelizer p0) {
            p0.read(this.IconCompatParcelizer);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((write) p0).IconCompatParcelizer);
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("write(IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019"}, d2 = {"Lo/stopLoading$IconCompatParcelizer;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/addKeySerializers;", "Lo/stopLoading;", "p0", "<init>", "(Lo/stopLoading;)V", "Lo/findSerializer;", "", "write", "(Lo/findSerializer;)V", "c_", "()V", "MediaDescriptionCompat", "read", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/stopLoading;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class IconCompatParcelizer extends _handleOddName.IconCompatParcelizer implements addKeySerializers {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private stopLoading<?> IconCompatParcelizer;

        public IconCompatParcelizer(stopLoading<?> stoploading) {
            this.IconCompatParcelizer = stoploading;
        }

        @Override // kotlin.addKeySerializers
        public final void write(findSerializer findserializer) {
            List list = ((stopLoading) this.IconCompatParcelizer).AudioAttributesImplBaseParcelizer;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                onReset onreset = (onReset) list.get(i);
                hasAnyGetter mediaDescriptionCompat = onreset.getMediaDescriptionCompat();
                if (mediaDescriptionCompat != null) {
                    float fIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(onreset.getMediaMetadataCompat());
                    findSerializer findserializer2 = findserializer;
                    float fIconCompatParcelizer2 = fIconCompatParcelizer - hasReferringProperties.IconCompatParcelizer(mediaDescriptionCompat.getOnFastForward());
                    float fAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(onreset.getMediaMetadataCompat()) - hasReferringProperties.AudioAttributesCompatParcelizer(mediaDescriptionCompat.getOnFastForward());
                    findserializer2.getIconCompatParcelizer().getRemoteActionCompatParcelizer().RemoteActionCompatParcelizer(fIconCompatParcelizer2, fAudioAttributesCompatParcelizer);
                    try {
                        findWrapperName.AudioAttributesCompatParcelizer(findserializer2, mediaDescriptionCompat);
                    } finally {
                        findserializer2.getIconCompatParcelizer().getRemoteActionCompatParcelizer().RemoteActionCompatParcelizer(-fIconCompatParcelizer2, -fAudioAttributesCompatParcelizer);
                    }
                }
            }
            findserializer.write();
        }

        @Override // o._handleOddName.IconCompatParcelizer
        public final void c_() {
            ((stopLoading) this.IconCompatParcelizer).AudioAttributesImplApi26Parcelizer = this;
        }

        @Override // o._handleOddName.IconCompatParcelizer
        public final void MediaDescriptionCompat() {
            this.IconCompatParcelizer.read();
        }

        public final void read(stopLoading<?> p0) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, p0) || !getRead().getRatingCompat()) {
                return;
            }
            this.IconCompatParcelizer.read();
            ((stopLoading) p0).AudioAttributesImplApi26Parcelizer = this;
            this.IconCompatParcelizer = p0;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((IconCompatParcelizer) p0).IconCompatParcelizer);
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }
}
