package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.getBeanClass;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a_\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017"}, d2 = {"", "Lo/getBeanClass;", "Lo/removeSoftRefsClearedByGc;", "p0", "write", "(Ljava/util/List;Lo/removeSoftRefsClearedByGc;)Lo/removeSoftRefsClearedByGc;", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "", "p8", "p9", "", "IconCompatParcelizer", "(Lo/removeSoftRefsClearedByGc;DDDDDDDZZ)V", "AudioAttributesCompatParcelizer", "(Lo/removeSoftRefsClearedByGc;DDDDDDDDD)V", "", "[F", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class findProperties {
    private static final float[] AudioAttributesCompatParcelizer = new float[0];

    public static final removeSoftRefsClearedByGc write(List<? extends getBeanClass> list, removeSoftRefsClearedByGc removesoftrefsclearedbygc) {
        getBeanClass getbeanclass;
        float f;
        int i;
        int i2;
        float mediaBrowserCompatItemReceiver;
        float audioAttributesImplApi26Parcelizer;
        float f2;
        float f3;
        float read;
        float remoteActionCompatParcelizer;
        float audioAttributesCompatParcelizer;
        float iconCompatParcelizer;
        float f4;
        float f5;
        float audioAttributesCompatParcelizer2;
        float remoteActionCompatParcelizer2;
        List<? extends getBeanClass> list2 = list;
        removeSoftRefsClearedByGc removesoftrefsclearedbygc2 = removesoftrefsclearedbygc;
        int iWrite = removesoftrefsclearedbygc.write();
        removesoftrefsclearedbygc.MediaBrowserCompatCustomActionResultReceiver();
        removesoftrefsclearedbygc2.write(iWrite);
        getBeanClass getbeanclass2 = list.isEmpty() ? getBeanClass.read.INSTANCE : list2.get(0);
        int size = list2.size();
        float f6 = BitmapDescriptorFactory.HUE_RED;
        int i3 = 0;
        float audioAttributesCompatParcelizer3 = 0.0f;
        float write = 0.0f;
        float audioAttributesCompatParcelizer4 = 0.0f;
        float iconCompatParcelizer2 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        while (i3 < size) {
            getBeanClass getbeanclass3 = list2.get(i3);
            if (getbeanclass3 instanceof getBeanClass.read) {
                removesoftrefsclearedbygc.read();
                getbeanclass = getbeanclass3;
                f = f6;
                i = i3;
                i2 = size;
                mediaBrowserCompatItemReceiver = f7;
                audioAttributesImplApi26Parcelizer = f8;
            } else {
                if (getbeanclass3 instanceof getBeanClass.MediaBrowserCompatMediaItem) {
                    getBeanClass.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = (getBeanClass.MediaBrowserCompatMediaItem) getbeanclass3;
                    audioAttributesCompatParcelizer4 += mediaBrowserCompatMediaItem.getAudioAttributesCompatParcelizer();
                    iconCompatParcelizer2 += mediaBrowserCompatMediaItem.getWrite();
                    removesoftrefsclearedbygc2.read(mediaBrowserCompatMediaItem.getAudioAttributesCompatParcelizer(), mediaBrowserCompatMediaItem.getWrite());
                    f7 = audioAttributesCompatParcelizer4;
                } else if (getbeanclass3 instanceof getBeanClass.AudioAttributesImplApi21Parcelizer) {
                    getBeanClass.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (getBeanClass.AudioAttributesImplApi21Parcelizer) getbeanclass3;
                    float write2 = audioAttributesImplApi21Parcelizer.getWrite();
                    float audioAttributesCompatParcelizer5 = audioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer();
                    removesoftrefsclearedbygc2.IconCompatParcelizer(audioAttributesImplApi21Parcelizer.getWrite(), audioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer());
                    audioAttributesCompatParcelizer4 = write2;
                    f7 = audioAttributesCompatParcelizer4;
                    iconCompatParcelizer2 = audioAttributesCompatParcelizer5;
                } else {
                    if (getbeanclass3 instanceof getBeanClass.MediaBrowserCompatSearchResultReceiver) {
                        getBeanClass.MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = (getBeanClass.MediaBrowserCompatSearchResultReceiver) getbeanclass3;
                        removesoftrefsclearedbygc2.RemoteActionCompatParcelizer(mediaBrowserCompatSearchResultReceiver.getRead(), mediaBrowserCompatSearchResultReceiver.getWrite());
                        audioAttributesCompatParcelizer4 += mediaBrowserCompatSearchResultReceiver.getRead();
                        remoteActionCompatParcelizer = mediaBrowserCompatSearchResultReceiver.getWrite();
                    } else {
                        if (getbeanclass3 instanceof getBeanClass.RemoteActionCompatParcelizer) {
                            getBeanClass.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = (getBeanClass.RemoteActionCompatParcelizer) getbeanclass3;
                            removesoftrefsclearedbygc2.write(remoteActionCompatParcelizer3.getIconCompatParcelizer(), remoteActionCompatParcelizer3.getRemoteActionCompatParcelizer());
                            float iconCompatParcelizer3 = remoteActionCompatParcelizer3.getIconCompatParcelizer();
                            iconCompatParcelizer2 = remoteActionCompatParcelizer3.getRemoteActionCompatParcelizer();
                            audioAttributesCompatParcelizer4 = iconCompatParcelizer3;
                        } else if (getbeanclass3 instanceof getBeanClass.RatingCompat) {
                            getBeanClass.RatingCompat ratingCompat = (getBeanClass.RatingCompat) getbeanclass3;
                            removesoftrefsclearedbygc2.RemoteActionCompatParcelizer(ratingCompat.getRead(), f6);
                            audioAttributesCompatParcelizer4 += ratingCompat.getRead();
                        } else if (getbeanclass3 instanceof getBeanClass.IconCompatParcelizer) {
                            getBeanClass.IconCompatParcelizer iconCompatParcelizer4 = (getBeanClass.IconCompatParcelizer) getbeanclass3;
                            removesoftrefsclearedbygc2.write(iconCompatParcelizer4.getWrite(), iconCompatParcelizer2);
                            audioAttributesCompatParcelizer4 = iconCompatParcelizer4.getWrite();
                        } else if (getbeanclass3 instanceof getBeanClass.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                            getBeanClass.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (getBeanClass.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) getbeanclass3;
                            removesoftrefsclearedbygc2.RemoteActionCompatParcelizer(f6, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getRead());
                            remoteActionCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getRead();
                        } else if (getbeanclass3 instanceof getBeanClass.onAddQueueItem) {
                            getBeanClass.onAddQueueItem onaddqueueitem = (getBeanClass.onAddQueueItem) getbeanclass3;
                            removesoftrefsclearedbygc2.write(audioAttributesCompatParcelizer4, onaddqueueitem.getAudioAttributesCompatParcelizer());
                            iconCompatParcelizer2 = onaddqueueitem.getAudioAttributesCompatParcelizer();
                        } else {
                            if (getbeanclass3 instanceof getBeanClass.MediaDescriptionCompat) {
                                getBeanClass.MediaDescriptionCompat mediaDescriptionCompat = (getBeanClass.MediaDescriptionCompat) getbeanclass3;
                                removesoftrefsclearedbygc.RemoteActionCompatParcelizer(mediaDescriptionCompat.getIconCompatParcelizer(), mediaDescriptionCompat.getRead(), mediaDescriptionCompat.getWrite(), mediaDescriptionCompat.getAudioAttributesCompatParcelizer(), mediaDescriptionCompat.getRemoteActionCompatParcelizer(), mediaDescriptionCompat.getAudioAttributesImplApi21Parcelizer());
                                audioAttributesCompatParcelizer2 = mediaDescriptionCompat.getWrite() + audioAttributesCompatParcelizer4;
                                audioAttributesCompatParcelizer3 = mediaDescriptionCompat.getAudioAttributesCompatParcelizer() + iconCompatParcelizer2;
                                audioAttributesCompatParcelizer4 += mediaDescriptionCompat.getRemoteActionCompatParcelizer();
                                remoteActionCompatParcelizer2 = mediaDescriptionCompat.getAudioAttributesImplApi21Parcelizer();
                            } else {
                                if (getbeanclass3 instanceof getBeanClass.write) {
                                    getBeanClass.write writeVar = (getBeanClass.write) getbeanclass3;
                                    removesoftrefsclearedbygc.read(writeVar.getAudioAttributesCompatParcelizer(), writeVar.getIconCompatParcelizer(), writeVar.getRemoteActionCompatParcelizer(), writeVar.getWrite(), writeVar.getRead(), writeVar.getMediaBrowserCompatItemReceiver());
                                    read = writeVar.getRemoteActionCompatParcelizer();
                                    audioAttributesCompatParcelizer3 = writeVar.getWrite();
                                    audioAttributesCompatParcelizer = writeVar.getRead();
                                    iconCompatParcelizer = writeVar.getMediaBrowserCompatItemReceiver();
                                } else if (getbeanclass3 instanceof getBeanClass.onCommand) {
                                    if (getbeanclass2.getRead()) {
                                        float f9 = iconCompatParcelizer2 - audioAttributesCompatParcelizer3;
                                        f4 = audioAttributesCompatParcelizer4 - write;
                                        f5 = f9;
                                    } else {
                                        f4 = f6;
                                        f5 = f4;
                                    }
                                    getBeanClass.onCommand oncommand = (getBeanClass.onCommand) getbeanclass3;
                                    removesoftrefsclearedbygc.RemoteActionCompatParcelizer(f4, f5, oncommand.getAudioAttributesCompatParcelizer(), oncommand.getRead(), oncommand.getIconCompatParcelizer(), oncommand.getRemoteActionCompatParcelizer());
                                    audioAttributesCompatParcelizer2 = oncommand.getAudioAttributesCompatParcelizer() + audioAttributesCompatParcelizer4;
                                    audioAttributesCompatParcelizer3 = oncommand.getRead() + iconCompatParcelizer2;
                                    audioAttributesCompatParcelizer4 += oncommand.getIconCompatParcelizer();
                                    remoteActionCompatParcelizer2 = oncommand.getRemoteActionCompatParcelizer();
                                } else if (getbeanclass3 instanceof getBeanClass.MediaBrowserCompatItemReceiver) {
                                    if (getbeanclass2.getRead()) {
                                        audioAttributesCompatParcelizer4 = (audioAttributesCompatParcelizer4 * 2.0f) - write;
                                        iconCompatParcelizer2 = (iconCompatParcelizer2 * 2.0f) - audioAttributesCompatParcelizer3;
                                    }
                                    getBeanClass.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver2 = (getBeanClass.MediaBrowserCompatItemReceiver) getbeanclass3;
                                    removesoftrefsclearedbygc.read(audioAttributesCompatParcelizer4, iconCompatParcelizer2, mediaBrowserCompatItemReceiver2.getRead(), mediaBrowserCompatItemReceiver2.getWrite(), mediaBrowserCompatItemReceiver2.getAudioAttributesCompatParcelizer(), mediaBrowserCompatItemReceiver2.getIconCompatParcelizer());
                                    read = mediaBrowserCompatItemReceiver2.getRead();
                                    audioAttributesCompatParcelizer3 = mediaBrowserCompatItemReceiver2.getWrite();
                                    audioAttributesCompatParcelizer = mediaBrowserCompatItemReceiver2.getAudioAttributesCompatParcelizer();
                                    iconCompatParcelizer = mediaBrowserCompatItemReceiver2.getIconCompatParcelizer();
                                } else if (getbeanclass3 instanceof getBeanClass.MediaMetadataCompat) {
                                    getBeanClass.MediaMetadataCompat mediaMetadataCompat = (getBeanClass.MediaMetadataCompat) getbeanclass3;
                                    removesoftrefsclearedbygc2.AudioAttributesCompatParcelizer(mediaMetadataCompat.getWrite(), mediaMetadataCompat.getAudioAttributesCompatParcelizer(), mediaMetadataCompat.getRead(), mediaMetadataCompat.getRemoteActionCompatParcelizer());
                                    write = mediaMetadataCompat.getWrite() + audioAttributesCompatParcelizer4;
                                    audioAttributesCompatParcelizer3 = mediaMetadataCompat.getAudioAttributesCompatParcelizer() + iconCompatParcelizer2;
                                    audioAttributesCompatParcelizer4 += mediaMetadataCompat.getRead();
                                    remoteActionCompatParcelizer = mediaMetadataCompat.getRemoteActionCompatParcelizer();
                                } else {
                                    if (getbeanclass3 instanceof getBeanClass.AudioAttributesImplBaseParcelizer) {
                                        getBeanClass.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (getBeanClass.AudioAttributesImplBaseParcelizer) getbeanclass3;
                                        removesoftrefsclearedbygc2.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer.getRead(), audioAttributesImplBaseParcelizer.getWrite(), audioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer(), audioAttributesImplBaseParcelizer.getAudioAttributesCompatParcelizer());
                                        float read2 = audioAttributesImplBaseParcelizer.getRead();
                                        float write3 = audioAttributesImplBaseParcelizer.getWrite();
                                        float remoteActionCompatParcelizer4 = audioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer();
                                        iconCompatParcelizer2 = audioAttributesImplBaseParcelizer.getAudioAttributesCompatParcelizer();
                                        audioAttributesCompatParcelizer4 = remoteActionCompatParcelizer4;
                                        getbeanclass = getbeanclass3;
                                        f = f6;
                                        i = i3;
                                        i2 = size;
                                        write = read2;
                                        audioAttributesCompatParcelizer3 = write3;
                                    } else if (getbeanclass3 instanceof getBeanClass.handleMediaPlayPauseIfPendingOnHandler) {
                                        if (getbeanclass2.getRemoteActionCompatParcelizer()) {
                                            f2 = audioAttributesCompatParcelizer4 - write;
                                            f3 = iconCompatParcelizer2 - audioAttributesCompatParcelizer3;
                                        } else {
                                            f2 = f6;
                                            f3 = f2;
                                        }
                                        getBeanClass.handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler = (getBeanClass.handleMediaPlayPauseIfPendingOnHandler) getbeanclass3;
                                        removesoftrefsclearedbygc2.AudioAttributesCompatParcelizer(f2, f3, handlemediaplaypauseifpendingonhandler.getIconCompatParcelizer(), handlemediaplaypauseifpendingonhandler.getRead());
                                        read = f2 + audioAttributesCompatParcelizer4;
                                        audioAttributesCompatParcelizer4 += handlemediaplaypauseifpendingonhandler.getIconCompatParcelizer();
                                        audioAttributesCompatParcelizer3 = f3 + iconCompatParcelizer2;
                                        iconCompatParcelizer2 = handlemediaplaypauseifpendingonhandler.getRead() + iconCompatParcelizer2;
                                        getbeanclass = getbeanclass3;
                                        f = f6;
                                        i = i3;
                                        i2 = size;
                                        write = read;
                                    } else if (getbeanclass3 instanceof getBeanClass.AudioAttributesImplApi26Parcelizer) {
                                        if (getbeanclass2.getRemoteActionCompatParcelizer()) {
                                            audioAttributesCompatParcelizer4 = (audioAttributesCompatParcelizer4 * 2.0f) - write;
                                            iconCompatParcelizer2 = (iconCompatParcelizer2 * 2.0f) - audioAttributesCompatParcelizer3;
                                        }
                                        getBeanClass.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer2 = (getBeanClass.AudioAttributesImplApi26Parcelizer) getbeanclass3;
                                        removesoftrefsclearedbygc2.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer4, iconCompatParcelizer2, audioAttributesImplApi26Parcelizer2.getAudioAttributesCompatParcelizer(), audioAttributesImplApi26Parcelizer2.getIconCompatParcelizer());
                                        write = audioAttributesCompatParcelizer4;
                                        getbeanclass = getbeanclass3;
                                        f = f6;
                                        i = i3;
                                        i2 = size;
                                        audioAttributesCompatParcelizer4 = audioAttributesImplApi26Parcelizer2.getAudioAttributesCompatParcelizer();
                                        audioAttributesCompatParcelizer3 = iconCompatParcelizer2;
                                        iconCompatParcelizer2 = audioAttributesImplApi26Parcelizer2.getIconCompatParcelizer();
                                    } else if (getbeanclass3 instanceof getBeanClass.MediaBrowserCompatCustomActionResultReceiver) {
                                        getBeanClass.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (getBeanClass.MediaBrowserCompatCustomActionResultReceiver) getbeanclass3;
                                        float mediaBrowserCompatCustomActionResultReceiver2 = mediaBrowserCompatCustomActionResultReceiver.getMediaBrowserCompatCustomActionResultReceiver() + audioAttributesCompatParcelizer4;
                                        float audioAttributesImplBaseParcelizer2 = mediaBrowserCompatCustomActionResultReceiver.getAudioAttributesImplBaseParcelizer() + iconCompatParcelizer2;
                                        double iconCompatParcelizer5 = mediaBrowserCompatCustomActionResultReceiver.getIconCompatParcelizer();
                                        getbeanclass = getbeanclass3;
                                        double read3 = mediaBrowserCompatCustomActionResultReceiver.getRead();
                                        i = i3;
                                        f = BitmapDescriptorFactory.HUE_RED;
                                        i2 = size;
                                        IconCompatParcelizer(removesoftrefsclearedbygc, audioAttributesCompatParcelizer4, iconCompatParcelizer2, mediaBrowserCompatCustomActionResultReceiver2, audioAttributesImplBaseParcelizer2, iconCompatParcelizer5, read3, mediaBrowserCompatCustomActionResultReceiver.getAudioAttributesCompatParcelizer(), mediaBrowserCompatCustomActionResultReceiver.getRemoteActionCompatParcelizer(), mediaBrowserCompatCustomActionResultReceiver.getWrite());
                                        audioAttributesImplApi26Parcelizer = audioAttributesImplBaseParcelizer2;
                                        mediaBrowserCompatItemReceiver = mediaBrowserCompatCustomActionResultReceiver2;
                                    } else {
                                        getbeanclass = getbeanclass3;
                                        f = f6;
                                        i = i3;
                                        i2 = size;
                                        if (!(getbeanclass instanceof getBeanClass.AudioAttributesCompatParcelizer)) {
                                            throw new RenewEligibleCreator();
                                        }
                                        getBeanClass.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer6 = (getBeanClass.AudioAttributesCompatParcelizer) getbeanclass;
                                        IconCompatParcelizer(removesoftrefsclearedbygc, audioAttributesCompatParcelizer4, iconCompatParcelizer2, audioAttributesCompatParcelizer6.getMediaBrowserCompatItemReceiver(), audioAttributesCompatParcelizer6.getAudioAttributesImplApi26Parcelizer(), audioAttributesCompatParcelizer6.getRead(), audioAttributesCompatParcelizer6.getIconCompatParcelizer(), audioAttributesCompatParcelizer6.getWrite(), audioAttributesCompatParcelizer6.getRemoteActionCompatParcelizer(), audioAttributesCompatParcelizer6.getAudioAttributesCompatParcelizer());
                                        mediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer6.getMediaBrowserCompatItemReceiver();
                                        audioAttributesImplApi26Parcelizer = audioAttributesCompatParcelizer6.getAudioAttributesImplApi26Parcelizer();
                                    }
                                    i3 = i + 1;
                                    removesoftrefsclearedbygc2 = removesoftrefsclearedbygc;
                                    getbeanclass2 = getbeanclass;
                                    f6 = f;
                                    size = i2;
                                    list2 = list;
                                }
                                audioAttributesCompatParcelizer4 = audioAttributesCompatParcelizer;
                                iconCompatParcelizer2 = iconCompatParcelizer;
                                getbeanclass = getbeanclass3;
                                f = f6;
                                i = i3;
                                i2 = size;
                                write = read;
                                i3 = i + 1;
                                removesoftrefsclearedbygc2 = removesoftrefsclearedbygc;
                                getbeanclass2 = getbeanclass;
                                f6 = f;
                                size = i2;
                                list2 = list;
                            }
                            iconCompatParcelizer2 += remoteActionCompatParcelizer2;
                            write = audioAttributesCompatParcelizer2;
                        }
                        getbeanclass = getbeanclass3;
                        f = f6;
                        i = i3;
                        i2 = size;
                        i3 = i + 1;
                        removesoftrefsclearedbygc2 = removesoftrefsclearedbygc;
                        getbeanclass2 = getbeanclass;
                        f6 = f;
                        size = i2;
                        list2 = list;
                    }
                    iconCompatParcelizer2 += remoteActionCompatParcelizer;
                    getbeanclass = getbeanclass3;
                    f = f6;
                    i = i3;
                    i2 = size;
                    i3 = i + 1;
                    removesoftrefsclearedbygc2 = removesoftrefsclearedbygc;
                    getbeanclass2 = getbeanclass;
                    f6 = f;
                    size = i2;
                    list2 = list;
                }
                f8 = iconCompatParcelizer2;
                getbeanclass = getbeanclass3;
                f = f6;
                i = i3;
                i2 = size;
                i3 = i + 1;
                removesoftrefsclearedbygc2 = removesoftrefsclearedbygc;
                getbeanclass2 = getbeanclass;
                f6 = f;
                size = i2;
                list2 = list;
            }
            audioAttributesCompatParcelizer3 = audioAttributesImplApi26Parcelizer;
            iconCompatParcelizer2 = audioAttributesCompatParcelizer3;
            write = mediaBrowserCompatItemReceiver;
            audioAttributesCompatParcelizer4 = write;
            i3 = i + 1;
            removesoftrefsclearedbygc2 = removesoftrefsclearedbygc;
            getbeanclass2 = getbeanclass;
            f6 = f;
            size = i2;
            list2 = list;
        }
        return removesoftrefsclearedbygc;
    }

    private static final void IconCompatParcelizer(removeSoftRefsClearedByGc removesoftrefsclearedbygc, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d10);
        double dSin = Math.sin(d10);
        double d11 = ((d * dCos) + (d2 * dSin)) / d5;
        double d12 = (((-d) * dSin) + (d2 * dCos)) / d6;
        double d13 = ((d3 * dCos) + (d4 * dSin)) / d5;
        double d14 = (((-d3) * dSin) + (d4 * dCos)) / d6;
        double d15 = d11 - d13;
        double d16 = d12 - d14;
        double d17 = (d11 + d13) / 2.0d;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d15 * d15) + (d16 * d16);
        if (d19 == 0.0d) {
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d19) / 1.99999d);
            IconCompatParcelizer(removesoftrefsclearedbygc, d, d2, d3, d4, d5 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d20);
        double d21 = d15 * dSqrt2;
        double d22 = dSqrt2 * d16;
        if (z == z2) {
            d8 = d17 - d22;
            d9 = d18 + d21;
        } else {
            d8 = d17 + d22;
            d9 = d18 - d21;
        }
        double dAtan2 = Math.atan2(d12 - d9, d11 - d8);
        double dAtan22 = Math.atan2(d14 - d9, d13 - d8) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d23 = d8 * d5;
        double d24 = d9 * d6;
        AudioAttributesCompatParcelizer(removesoftrefsclearedbygc, (d23 * dCos) - (d24 * dSin), (d23 * dSin) + (d24 * dCos), d5, d6, d, d2, d10, dAtan2, dAtan22);
    }

    private static final void AudioAttributesCompatParcelizer(removeSoftRefsClearedByGc removesoftrefsclearedbygc, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        int iCeil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
        double dCos = Math.cos(d7);
        double dSin = Math.sin(d7);
        double dCos2 = Math.cos(d8);
        double dSin2 = Math.sin(d8);
        double d11 = -d10;
        double d12 = d11 * dCos;
        double d13 = d4 * dSin;
        double d14 = d11 * dSin;
        double d15 = d4 * dCos;
        double d16 = d9 / ((double) iCeil);
        double d17 = d6;
        double d18 = (dSin2 * d12) - (dCos2 * d13);
        double d19 = (dSin2 * d14) + (dCos2 * d15);
        double d20 = d8;
        int i = 0;
        double d21 = d5;
        while (i < iCeil) {
            double d22 = d20 + d16;
            double dSin3 = Math.sin(d22);
            double dCos3 = Math.cos(d22);
            double d23 = d16;
            double d24 = (d + ((d10 * dCos) * dCos3)) - (d13 * dSin3);
            double d25 = d2 + (d10 * dSin * dCos3) + (d15 * dSin3);
            double d26 = (d12 * dSin3) - (d13 * dCos3);
            double d27 = (dSin3 * d14) + (dCos3 * d15);
            double d28 = d22 - d20;
            double dTan = Math.tan(d28 / 2.0d);
            double dSin4 = (Math.sin(d28) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
            removesoftrefsclearedbygc.read((float) (d21 + (d18 * dSin4)), (float) (d17 + (d19 * dSin4)), (float) (d24 - (dSin4 * d26)), (float) (d25 - (dSin4 * d27)), (float) d24, (float) d25);
            i++;
            d17 = d25;
            iCeil = iCeil;
            dSin = dSin;
            d20 = d22;
            d19 = d27;
            dCos = dCos;
            d18 = d26;
            d10 = d3;
            d21 = d24;
            d16 = d23;
        }
    }
}
