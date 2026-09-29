package kotlin;

import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.C0170format;
import kotlin.chainedTransformer;
import kotlin.keyFormat;

/* JADX INFO: loaded from: classes2.dex */
final class linkNext {
    private static final byte[] IconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer("OpusHead");

    interface IconCompatParcelizer {
        int IconCompatParcelizer();

        int RemoteActionCompatParcelizer();

        int write();
    }

    private static int RemoteActionCompatParcelizer(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static boolean write(int i) {
        return i != 1;
    }

    public static List<initialCapacity> AudioAttributesCompatParcelizer(chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer, hasClass hasclass, long j, DrmInitData drmInitData, boolean z, boolean z2, parseMvhd<ObjectBuffer, ObjectBuffer> parsemvhd) throws SchemaAware {
        ObjectBuffer objectBufferApply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < remoteActionCompatParcelizer.write.size(); i++) {
            chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer.write.get(i);
            if (remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer == 1953653099 && (objectBufferApply = parsemvhd.apply(read(remoteActionCompatParcelizer2, (chainedTransformer.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(remoteActionCompatParcelizer.IconCompatParcelizer(Atom.TYPE_mvhd)), j, drmInitData, z, z2))) != null) {
                arrayList.add(AudioAttributesCompatParcelizer(objectBufferApply, (chainedTransformer.RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(((chainedTransformer.RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(((chainedTransformer.RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(remoteActionCompatParcelizer2.read(Atom.TYPE_mdia))).read(Atom.TYPE_minf))).read(Atom.TYPE_stbl)), hasclass));
            }
        }
        return arrayList;
    }

    public static androidx.media3.common.Metadata AudioAttributesCompatParcelizer(chainedTransformer.IconCompatParcelizer iconCompatParcelizer) {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = iconCompatParcelizer.write;
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        androidx.media3.common.Metadata metadata = new androidx.media3.common.Metadata(new Metadata.Entry[0]);
        while (asPropertyTypeDeserializer.IconCompatParcelizer() >= 8) {
            int iWrite = asPropertyTypeDeserializer.write();
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (iMediaBrowserCompatItemReceiver2 == 1835365473) {
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
                metadata = metadata.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, iWrite + iMediaBrowserCompatItemReceiver));
            } else if (iMediaBrowserCompatItemReceiver2 == 1936553057) {
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
                metadata = metadata.RemoteActionCompatParcelizer(_copyTo.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iWrite + iMediaBrowserCompatItemReceiver));
            } else if (iMediaBrowserCompatItemReceiver2 == -1451722374) {
                metadata = metadata.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer(asPropertyTypeDeserializer));
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite + iMediaBrowserCompatItemReceiver);
        }
        return metadata;
    }

    public static Mp4TimestampData read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        long jHandleMediaPlayPauseIfPendingOnHandler;
        long jHandleMediaPlayPauseIfPendingOnHandler2;
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        if (chainedTransformer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver()) == 0) {
            jHandleMediaPlayPauseIfPendingOnHandler = asPropertyTypeDeserializer.onMediaButtonEvent();
            jHandleMediaPlayPauseIfPendingOnHandler2 = asPropertyTypeDeserializer.onMediaButtonEvent();
        } else {
            jHandleMediaPlayPauseIfPendingOnHandler = asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler();
            jHandleMediaPlayPauseIfPendingOnHandler2 = asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler();
        }
        return new Mp4TimestampData(jHandleMediaPlayPauseIfPendingOnHandler, jHandleMediaPlayPauseIfPendingOnHandler2, asPropertyTypeDeserializer.onMediaButtonEvent());
    }

    public static androidx.media3.common.Metadata read(chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        chainedTransformer.IconCompatParcelizer IconCompatParcelizer2 = remoteActionCompatParcelizer.IconCompatParcelizer(Atom.TYPE_hdlr);
        chainedTransformer.IconCompatParcelizer IconCompatParcelizer3 = remoteActionCompatParcelizer.IconCompatParcelizer(Atom.TYPE_keys);
        chainedTransformer.IconCompatParcelizer IconCompatParcelizer4 = remoteActionCompatParcelizer.IconCompatParcelizer(Atom.TYPE_ilst);
        if (IconCompatParcelizer2 == null || IconCompatParcelizer3 == null || IconCompatParcelizer4 == null || write(IconCompatParcelizer2.write) != 1835299937) {
            return null;
        }
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = IconCompatParcelizer3.write;
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(12);
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        String[] strArr = new String[iMediaBrowserCompatItemReceiver];
        for (int i = 0; i < iMediaBrowserCompatItemReceiver; i++) {
            int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
            strArr[i] = asPropertyTypeDeserializer.read(iMediaBrowserCompatItemReceiver2 - 8);
        }
        AsPropertyTypeDeserializer asPropertyTypeDeserializer2 = IconCompatParcelizer4.write;
        asPropertyTypeDeserializer2.MediaBrowserCompatCustomActionResultReceiver(8);
        ArrayList arrayList = new ArrayList();
        while (asPropertyTypeDeserializer2.IconCompatParcelizer() > 8) {
            int iWrite = asPropertyTypeDeserializer2.write();
            int iMediaBrowserCompatItemReceiver3 = asPropertyTypeDeserializer2.MediaBrowserCompatItemReceiver();
            int iMediaBrowserCompatItemReceiver4 = asPropertyTypeDeserializer2.MediaBrowserCompatItemReceiver() - 1;
            if (iMediaBrowserCompatItemReceiver4 >= 0 && iMediaBrowserCompatItemReceiver4 < iMediaBrowserCompatItemReceiver) {
                MdtaMetadataEntry mdtaMetadataEntryAudioAttributesCompatParcelizer = isRunningInNativeImage.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer2, iWrite + iMediaBrowserCompatItemReceiver3, strArr[iMediaBrowserCompatItemReceiver4]);
                if (mdtaMetadataEntryAudioAttributesCompatParcelizer != null) {
                    arrayList.add(mdtaMetadataEntryAudioAttributesCompatParcelizer);
                }
            } else {
                prune.RemoteActionCompatParcelizer("AtomParsers", "Skipped metadata with unknown key index: ".concat(String.valueOf(iMediaBrowserCompatItemReceiver4)));
            }
            asPropertyTypeDeserializer2.MediaBrowserCompatCustomActionResultReceiver(iWrite + iMediaBrowserCompatItemReceiver3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.Metadata(arrayList);
    }

    public static void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iWrite = asPropertyTypeDeserializer.write();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() != 1751411826) {
            iWrite += 4;
        }
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
    }

    private static ObjectBuffer read(chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer, chainedTransformer.IconCompatParcelizer iconCompatParcelizer, long j, DrmInitData drmInitData, boolean z, boolean z2) throws SchemaAware {
        chainedTransformer.IconCompatParcelizer iconCompatParcelizer2;
        long j2;
        long[] jArr;
        long[] jArr2;
        chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer2;
        Pair<long[], long[]> pairAudioAttributesCompatParcelizer;
        chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = (chainedTransformer.RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(remoteActionCompatParcelizer.read(Atom.TYPE_mdia));
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(write(((chainedTransformer.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(remoteActionCompatParcelizer3.IconCompatParcelizer(Atom.TYPE_hdlr))).write));
        if (iRemoteActionCompatParcelizer == -1) {
            return null;
        }
        AudioAttributesImplApi21Parcelizer audioAttributesImplApi21ParcelizerMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(((chainedTransformer.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(remoteActionCompatParcelizer.IconCompatParcelizer(Atom.TYPE_tkhd))).write);
        long jAudioAttributesCompatParcelizer = C.TIME_UNSET;
        if (j == C.TIME_UNSET) {
            iconCompatParcelizer2 = iconCompatParcelizer;
            j2 = audioAttributesImplApi21ParcelizerMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
        } else {
            iconCompatParcelizer2 = iconCompatParcelizer;
            j2 = j;
        }
        long j3 = read(iconCompatParcelizer2.write).IconCompatParcelizer;
        if (j2 != C.TIME_UNSET) {
            jAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j2, 1000000L, j3);
        }
        long j4 = jAudioAttributesCompatParcelizer;
        chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = (chainedTransformer.RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(((chainedTransformer.RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(remoteActionCompatParcelizer3.read(Atom.TYPE_minf))).read(Atom.TYPE_stbl));
        Pair<Long, String> pairAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(((chainedTransformer.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(remoteActionCompatParcelizer3.IconCompatParcelizer(Atom.TYPE_mdhd))).write);
        chainedTransformer.IconCompatParcelizer IconCompatParcelizer2 = remoteActionCompatParcelizer4.IconCompatParcelizer(Atom.TYPE_stsd);
        if (IconCompatParcelizer2 == null) {
            throw SchemaAware.RemoteActionCompatParcelizer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        write writeVarIconCompatParcelizer = IconCompatParcelizer(IconCompatParcelizer2.write, audioAttributesImplApi21ParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer, audioAttributesImplApi21ParcelizerMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer, (String) pairAudioAttributesImplApi26Parcelizer.second, drmInitData, z2);
        if (z || (remoteActionCompatParcelizer2 = remoteActionCompatParcelizer.read(Atom.TYPE_edts)) == null || (pairAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(remoteActionCompatParcelizer2)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairAudioAttributesCompatParcelizer.first;
            jArr2 = (long[]) pairAudioAttributesCompatParcelizer.second;
            jArr = jArr3;
        }
        if (writeVarIconCompatParcelizer.RemoteActionCompatParcelizer == null) {
            return null;
        }
        return new ObjectBuffer(audioAttributesImplApi21ParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer, iRemoteActionCompatParcelizer, ((Long) pairAudioAttributesImplApi26Parcelizer.first).longValue(), j3, j4, writeVarIconCompatParcelizer.RemoteActionCompatParcelizer, writeVarIconCompatParcelizer.IconCompatParcelizer, writeVarIconCompatParcelizer.write, writeVarIconCompatParcelizer.AudioAttributesCompatParcelizer, jArr, jArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static kotlin.initialCapacity AudioAttributesCompatParcelizer(kotlin.ObjectBuffer r39, o.chainedTransformer.RemoteActionCompatParcelizer r40, kotlin.hasClass r41) throws kotlin.SchemaAware {
        /*
            Method dump skipped, instruction units count: 1317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.linkNext.AudioAttributesCompatParcelizer(o.ObjectBuffer, o.chainedTransformer$RemoteActionCompatParcelizer, o.hasClass):o.initialCapacity");
    }

    private static androidx.media3.common.Metadata AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(8);
        RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
        while (asPropertyTypeDeserializer.write() < i) {
            int iWrite = asPropertyTypeDeserializer.write();
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() == 1768715124) {
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
                return read(asPropertyTypeDeserializer, iWrite + iMediaBrowserCompatItemReceiver);
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite + iMediaBrowserCompatItemReceiver);
        }
        return null;
    }

    private static androidx.media3.common.Metadata read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(8);
        ArrayList arrayList = new ArrayList();
        while (asPropertyTypeDeserializer.write() < i) {
            Metadata.Entry entryIconCompatParcelizer = isRunningInNativeImage.IconCompatParcelizer(asPropertyTypeDeserializer);
            if (entryIconCompatParcelizer != null) {
                arrayList.add(entryIconCompatParcelizer);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.Metadata(arrayList);
    }

    private static androidx.media3.common.Metadata AudioAttributesImplApi21Parcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        short sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = asPropertyTypeDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
        String str = asPropertyTypeDeserializer.read(sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        int iMax = Math.max(str.lastIndexOf(43), str.lastIndexOf(45));
        try {
            return new androidx.media3.common.Metadata(new Mp4LocationData(Float.parseFloat(str.substring(0, iMax)), Float.parseFloat(str.substring(iMax, str.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static AudioAttributesImplApi21Parcelizer MediaBrowserCompatCustomActionResultReceiver(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        long j;
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        int iAudioAttributesCompatParcelizer = chainedTransformer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(iAudioAttributesCompatParcelizer == 0 ? 8 : 16);
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        int iWrite = asPropertyTypeDeserializer.write();
        int i = iAudioAttributesCompatParcelizer == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = C.TIME_UNSET;
            if (i3 < i) {
                if (asPropertyTypeDeserializer.RemoteActionCompatParcelizer()[iWrite + i3] != -1) {
                    long jOnMediaButtonEvent = iAudioAttributesCompatParcelizer == 0 ? asPropertyTypeDeserializer.onMediaButtonEvent() : asPropertyTypeDeserializer.onPlayFromUri();
                    if (jOnMediaButtonEvent != 0) {
                        j = jOnMediaButtonEvent;
                    }
                } else {
                    i3++;
                }
            } else {
                asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(i);
                break;
            }
        }
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(16);
        int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        int iMediaBrowserCompatItemReceiver3 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        int iMediaBrowserCompatItemReceiver4 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        int iMediaBrowserCompatItemReceiver5 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if (iMediaBrowserCompatItemReceiver2 == 0 && iMediaBrowserCompatItemReceiver3 == 65536 && iMediaBrowserCompatItemReceiver4 == -65536 && iMediaBrowserCompatItemReceiver5 == 0) {
            i2 = 90;
        } else if (iMediaBrowserCompatItemReceiver2 == 0 && iMediaBrowserCompatItemReceiver3 == -65536 && iMediaBrowserCompatItemReceiver4 == 65536 && iMediaBrowserCompatItemReceiver5 == 0) {
            i2 = 270;
        } else if (iMediaBrowserCompatItemReceiver2 == -65536 && iMediaBrowserCompatItemReceiver3 == 0 && iMediaBrowserCompatItemReceiver4 == 0 && iMediaBrowserCompatItemReceiver5 == -65536) {
            i2 = 180;
        }
        return new AudioAttributesImplApi21Parcelizer(iMediaBrowserCompatItemReceiver, j, i2);
    }

    private static int write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(16);
        return asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
    }

    private static Pair<Long, String> AudioAttributesImplApi26Parcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        int iAudioAttributesCompatParcelizer = chainedTransformer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(iAudioAttributesCompatParcelizer == 0 ? 8 : 16);
        long jOnMediaButtonEvent = asPropertyTypeDeserializer.onMediaButtonEvent();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(iAudioAttributesCompatParcelizer == 0 ? 4 : 8);
        int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
        StringBuilder sb = new StringBuilder("");
        sb.append((char) (((iOnPrepare >> 10) & 31) + 96));
        sb.append((char) (((iOnPrepare >> 5) & 31) + 96));
        sb.append((char) ((iOnPrepare & 31) + 96));
        return Pair.create(Long.valueOf(jOnMediaButtonEvent), sb.toString());
    }

    private static write IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws SchemaAware {
        int i3;
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(12);
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        write writeVar = new write(iMediaBrowserCompatItemReceiver);
        for (int i4 = 0; i4 < iMediaBrowserCompatItemReceiver; i4++) {
            int iWrite = asPropertyTypeDeserializer.write();
            int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            findSuperClasses.IconCompatParcelizer(iMediaBrowserCompatItemReceiver2 > 0, "childAtomSize must be positive");
            int iMediaBrowserCompatItemReceiver3 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (iMediaBrowserCompatItemReceiver3 == 1635148593 || iMediaBrowserCompatItemReceiver3 == 1635148595 || iMediaBrowserCompatItemReceiver3 == 1701733238 || iMediaBrowserCompatItemReceiver3 == 1831958048 || iMediaBrowserCompatItemReceiver3 == 1836070006 || iMediaBrowserCompatItemReceiver3 == 1752589105 || iMediaBrowserCompatItemReceiver3 == 1751479857 || iMediaBrowserCompatItemReceiver3 == 1932670515 || iMediaBrowserCompatItemReceiver3 == 1211250227 || iMediaBrowserCompatItemReceiver3 == 1987063864 || iMediaBrowserCompatItemReceiver3 == 1987063865 || iMediaBrowserCompatItemReceiver3 == 1635135537 || iMediaBrowserCompatItemReceiver3 == 1685479798 || iMediaBrowserCompatItemReceiver3 == 1685479729 || iMediaBrowserCompatItemReceiver3 == 1685481573 || iMediaBrowserCompatItemReceiver3 == 1685481521) {
                i3 = iWrite;
                RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iMediaBrowserCompatItemReceiver3, i3, iMediaBrowserCompatItemReceiver2, i, i2, drmInitData, writeVar, i4);
            } else if (iMediaBrowserCompatItemReceiver3 == 1836069985 || iMediaBrowserCompatItemReceiver3 == 1701733217 || iMediaBrowserCompatItemReceiver3 == 1633889587 || iMediaBrowserCompatItemReceiver3 == 1700998451 || iMediaBrowserCompatItemReceiver3 == 1633889588 || iMediaBrowserCompatItemReceiver3 == 1835823201 || iMediaBrowserCompatItemReceiver3 == 1685353315 || iMediaBrowserCompatItemReceiver3 == 1685353317 || iMediaBrowserCompatItemReceiver3 == 1685353320 || iMediaBrowserCompatItemReceiver3 == 1685353324 || iMediaBrowserCompatItemReceiver3 == 1685353336 || iMediaBrowserCompatItemReceiver3 == 1935764850 || iMediaBrowserCompatItemReceiver3 == 1935767394 || iMediaBrowserCompatItemReceiver3 == 1819304813 || iMediaBrowserCompatItemReceiver3 == 1936684916 || iMediaBrowserCompatItemReceiver3 == 1953984371 || iMediaBrowserCompatItemReceiver3 == 778924082 || iMediaBrowserCompatItemReceiver3 == 778924083 || iMediaBrowserCompatItemReceiver3 == 1835557169 || iMediaBrowserCompatItemReceiver3 == 1835560241 || iMediaBrowserCompatItemReceiver3 == 1634492771 || iMediaBrowserCompatItemReceiver3 == 1634492791 || iMediaBrowserCompatItemReceiver3 == 1970037111 || iMediaBrowserCompatItemReceiver3 == 1332770163 || iMediaBrowserCompatItemReceiver3 == 1716281667) {
                i3 = iWrite;
                IconCompatParcelizer(asPropertyTypeDeserializer, iMediaBrowserCompatItemReceiver3, iWrite, iMediaBrowserCompatItemReceiver2, i, str, z, drmInitData, writeVar, i4);
            } else {
                if (iMediaBrowserCompatItemReceiver3 == 1414810956 || iMediaBrowserCompatItemReceiver3 == 1954034535 || iMediaBrowserCompatItemReceiver3 == 2004251764 || iMediaBrowserCompatItemReceiver3 == 1937010800 || iMediaBrowserCompatItemReceiver3 == 1664495672) {
                    AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, iMediaBrowserCompatItemReceiver3, iWrite, iMediaBrowserCompatItemReceiver2, i, str, writeVar);
                } else if (iMediaBrowserCompatItemReceiver3 == 1835365492) {
                    write(asPropertyTypeDeserializer, iMediaBrowserCompatItemReceiver3, iWrite, i, writeVar);
                } else if (iMediaBrowserCompatItemReceiver3 == 1667329389) {
                    writeVar.RemoteActionCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer(i).AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_CAMERA_MOTION).IconCompatParcelizer();
                }
                i3 = iWrite;
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i3 + iMediaBrowserCompatItemReceiver2);
        }
        return writeVar;
    }

    private static void AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2, int i3, int i4, String str, write writeVar) {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i2 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        initExtraTracks initextratracks = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                asPropertyTypeDeserializer.write(bArr, 0, i5);
                initextratracks = initExtraTracks.read(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                writeVar.IconCompatParcelizer = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            } else {
                throw new IllegalStateException();
            }
        }
        writeVar.RemoteActionCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer(i4).AudioAttributesImplApi26Parcelizer(str2).read(str).write(j).RemoteActionCompatParcelizer(initextratracks).IconCompatParcelizer();
    }

    private static void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, write writeVar, int i6) throws SchemaAware {
        String str;
        DrmInitData drmInitData2;
        int i7;
        String str2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = i2;
        int i13 = i3;
        DrmInitData drmInitDataIconCompatParcelizer = drmInitData;
        write writeVar2 = writeVar;
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i12 + 16);
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(16);
        int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
        int iOnPrepare2 = asPropertyTypeDeserializer.onPrepare();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(50);
        int iWrite = asPropertyTypeDeserializer.write();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, bufferedSize> pairAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, i12, i13);
            if (pairAudioAttributesCompatParcelizer != null) {
                iIntValue = ((Integer) pairAudioAttributesCompatParcelizer.first).intValue();
                drmInitDataIconCompatParcelizer = drmInitDataIconCompatParcelizer == null ? null : drmInitDataIconCompatParcelizer.IconCompatParcelizer(((bufferedSize) pairAudioAttributesCompatParcelizer.second).IconCompatParcelizer);
                writeVar2.write[i6] = (bufferedSize) pairAudioAttributesCompatParcelizer.second;
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
        }
        String str3 = MimeTypes.VIDEO_H263;
        if (iIntValue != 1831958048) {
            str = iIntValue == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        } else {
            str = MimeTypes.VIDEO_MPEG;
        }
        int i14 = 8;
        float fWrite = 1.0f;
        byte[] bArrRemoteActionCompatParcelizer = null;
        List<byte[]> list = null;
        int i15 = -1;
        ByteBuffer byteBuffer = null;
        int iAudioAttributesCompatParcelizer = -1;
        int iWrite2 = -1;
        int i16 = -1;
        int i17 = -1;
        String str4 = null;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = null;
        boolean z = false;
        int i18 = 8;
        while (iWrite - i12 < i13) {
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
            int iWrite3 = asPropertyTypeDeserializer.write();
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (iMediaBrowserCompatItemReceiver == 0 && asPropertyTypeDeserializer.write() - i12 == i13) {
                break;
            }
            findSuperClasses.IconCompatParcelizer(iMediaBrowserCompatItemReceiver > 0, "childAtomSize must be positive");
            int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (iMediaBrowserCompatItemReceiver2 == 1635148611) {
                findSuperClasses.IconCompatParcelizer(str == null, null);
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite3 + 8);
                apostrophed apostrophedVarAudioAttributesCompatParcelizer = apostrophed.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer);
                List<byte[]> list2 = apostrophedVarAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
                writeVar2.AudioAttributesCompatParcelizer = apostrophedVarAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
                if (!z) {
                    fWrite = apostrophedVarAudioAttributesCompatParcelizer.MediaMetadataCompat;
                }
                String str5 = apostrophedVarAudioAttributesCompatParcelizer.read;
                int i19 = apostrophedVarAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer;
                int i20 = apostrophedVarAudioAttributesCompatParcelizer.write;
                int i21 = apostrophedVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
                int i22 = apostrophedVarAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
                int i23 = apostrophedVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                int i24 = apostrophedVarAudioAttributesCompatParcelizer.IconCompatParcelizer;
                drmInitData2 = drmInitDataIconCompatParcelizer;
                str4 = str5;
                i7 = iIntValue;
                str2 = str3;
                i17 = i19;
                iWrite2 = i20;
                iAudioAttributesCompatParcelizer = i22;
                i14 = i23;
                list = list2;
                str = MimeTypes.VIDEO_H264;
                i15 = i21;
                i18 = i24;
            } else if (iMediaBrowserCompatItemReceiver2 == 1752589123) {
                findSuperClasses.IconCompatParcelizer(str == null, null);
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite3 + 8);
                getRootCause getrootcauseWrite = getRootCause.write(asPropertyTypeDeserializer);
                List<byte[]> list3 = getrootcauseWrite.AudioAttributesImplBaseParcelizer;
                writeVar2.AudioAttributesCompatParcelizer = getrootcauseWrite.MediaBrowserCompatCustomActionResultReceiver;
                if (!z) {
                    fWrite = getrootcauseWrite.RatingCompat;
                }
                int i25 = getrootcauseWrite.MediaBrowserCompatItemReceiver;
                String str6 = getrootcauseWrite.write;
                int i26 = getrootcauseWrite.AudioAttributesCompatParcelizer;
                int i27 = getrootcauseWrite.read;
                int i28 = getrootcauseWrite.AudioAttributesImplApi21Parcelizer;
                list = list3;
                int i29 = getrootcauseWrite.IconCompatParcelizer;
                int i30 = getrootcauseWrite.RemoteActionCompatParcelizer;
                drmInitData2 = drmInitDataIconCompatParcelizer;
                i17 = i25;
                str4 = str6;
                i7 = iIntValue;
                str2 = str3;
                iWrite2 = i26;
                iAudioAttributesCompatParcelizer = i28;
                str = MimeTypes.VIDEO_H265;
                i18 = i30;
                i14 = i29;
                i15 = i27;
            } else {
                if (iMediaBrowserCompatItemReceiver2 == 1685480259 || iMediaBrowserCompatItemReceiver2 == 1685485123) {
                    drmInitData2 = drmInitDataIconCompatParcelizer;
                    i7 = iIntValue;
                    str2 = str3;
                    i8 = i14;
                    i9 = i18;
                    i10 = iAudioAttributesCompatParcelizer;
                    i11 = iWrite2;
                    emptyIterator emptyiteratorRemoteActionCompatParcelizer = emptyIterator.RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
                    if (emptyiteratorRemoteActionCompatParcelizer != null) {
                        String str7 = emptyiteratorRemoteActionCompatParcelizer.IconCompatParcelizer;
                        str = MimeTypes.VIDEO_DOLBY_VISION;
                        str4 = str7;
                    }
                } else {
                    if (iMediaBrowserCompatItemReceiver2 == 1987076931) {
                        findSuperClasses.IconCompatParcelizer(str == null, null);
                        String str8 = iIntValue == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite3 + 12);
                        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
                        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
                        boolean z2 = (iOnPlayFromMediaId & 1) != 0;
                        int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
                        int iOnPlayFromMediaId3 = asPropertyTypeDeserializer.onPlayFromMediaId();
                        iWrite2 = keyFormat.write(iOnPlayFromMediaId2);
                        int i31 = z2 ? 1 : 2;
                        iAudioAttributesCompatParcelizer = keyFormat.AudioAttributesCompatParcelizer(iOnPlayFromMediaId3);
                        i14 = iOnPlayFromMediaId >> 4;
                        drmInitData2 = drmInitDataIconCompatParcelizer;
                        i7 = iIntValue;
                        str2 = str3;
                        i18 = i14;
                        str = str8;
                        i15 = i31;
                    } else {
                        if (iMediaBrowserCompatItemReceiver2 == 1635135811) {
                            int i32 = iMediaBrowserCompatItemReceiver - 8;
                            byte[] bArr = new byte[i32];
                            asPropertyTypeDeserializer.write(bArr, 0, i32);
                            list = initExtraTracks.read(bArr);
                            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite3 + 8);
                            keyFormat keyformatAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(asPropertyTypeDeserializer);
                            int i33 = keyformatAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
                            int i34 = keyformatAudioAttributesCompatParcelizer.write;
                            int i35 = keyformatAudioAttributesCompatParcelizer.read;
                            int i36 = keyformatAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
                            iAudioAttributesCompatParcelizer = keyformatAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                            drmInitData2 = drmInitDataIconCompatParcelizer;
                            i7 = iIntValue;
                            str2 = str3;
                            iWrite2 = i35;
                            i15 = i36;
                            str = MimeTypes.VIDEO_AV1;
                            i14 = i33;
                            i18 = i34;
                        } else if (iMediaBrowserCompatItemReceiver2 == 1668050025) {
                            if (byteBuffer == null) {
                                byteBuffer = read();
                            }
                            ByteBuffer byteBuffer2 = byteBuffer;
                            byteBuffer2.position(21);
                            byteBuffer2.putShort(asPropertyTypeDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
                            byteBuffer2.putShort(asPropertyTypeDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
                            byteBuffer = byteBuffer2;
                            drmInitData2 = drmInitDataIconCompatParcelizer;
                            i7 = iIntValue;
                            str2 = str3;
                        } else if (iMediaBrowserCompatItemReceiver2 == 1835295606) {
                            if (byteBuffer == null) {
                                byteBuffer = read();
                            }
                            ByteBuffer byteBuffer3 = byteBuffer;
                            short sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = asPropertyTypeDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                            short sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = asPropertyTypeDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                            short sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver3 = asPropertyTypeDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                            i7 = iIntValue;
                            short sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver4 = asPropertyTypeDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                            str2 = str3;
                            short sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver5 = asPropertyTypeDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                            short sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver6 = asPropertyTypeDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                            int i37 = i18;
                            short sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver7 = asPropertyTypeDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                            int i38 = i14;
                            short sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver8 = asPropertyTypeDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                            long jOnMediaButtonEvent = asPropertyTypeDeserializer.onMediaButtonEvent();
                            long jOnMediaButtonEvent2 = asPropertyTypeDeserializer.onMediaButtonEvent();
                            drmInitData2 = drmInitDataIconCompatParcelizer;
                            byteBuffer3.position(1);
                            byteBuffer3.putShort(sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver5);
                            byteBuffer3.putShort(sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver6);
                            byteBuffer3.putShort(sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                            byteBuffer3.putShort(sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2);
                            byteBuffer3.putShort(sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver3);
                            byteBuffer3.putShort(sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver4);
                            byteBuffer3.putShort(sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver7);
                            byteBuffer3.putShort(sMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver8);
                            byteBuffer3.putShort((short) (jOnMediaButtonEvent / 10000));
                            byteBuffer3.putShort((short) (jOnMediaButtonEvent2 / 10000));
                            byteBuffer = byteBuffer3;
                            i18 = i37;
                            i14 = i38;
                        } else {
                            drmInitData2 = drmInitDataIconCompatParcelizer;
                            i7 = iIntValue;
                            str2 = str3;
                            i8 = i14;
                            i9 = i18;
                            if (iMediaBrowserCompatItemReceiver2 == 1681012275) {
                                findSuperClasses.IconCompatParcelizer(str == null, null);
                                str = str2;
                            } else if (iMediaBrowserCompatItemReceiver2 == 1702061171) {
                                findSuperClasses.IconCompatParcelizer(str == null, null);
                                audioAttributesCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iWrite3);
                                str = audioAttributesCompatParcelizerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                                byte[] bArr2 = audioAttributesCompatParcelizerRemoteActionCompatParcelizer.write;
                                if (bArr2 != null) {
                                    list = initExtraTracks.read(bArr2);
                                }
                            } else if (iMediaBrowserCompatItemReceiver2 == 1885434736) {
                                fWrite = write(asPropertyTypeDeserializer, iWrite3);
                                i18 = i9;
                                i14 = i8;
                                z = true;
                                iWrite += iMediaBrowserCompatItemReceiver;
                                i12 = i2;
                                i13 = i3;
                                writeVar2 = writeVar;
                                iIntValue = i7;
                                str3 = str2;
                                drmInitDataIconCompatParcelizer = drmInitData2;
                            } else if (iMediaBrowserCompatItemReceiver2 == 1937126244) {
                                bArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iWrite3, iMediaBrowserCompatItemReceiver);
                            } else if (iMediaBrowserCompatItemReceiver2 == 1936995172) {
                                int iOnPlayFromMediaId4 = asPropertyTypeDeserializer.onPlayFromMediaId();
                                asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(3);
                                if (iOnPlayFromMediaId4 == 0) {
                                    int iOnPlayFromMediaId5 = asPropertyTypeDeserializer.onPlayFromMediaId();
                                    if (iOnPlayFromMediaId5 == 0) {
                                        i16 = 0;
                                    } else if (iOnPlayFromMediaId5 == 1) {
                                        i16 = 1;
                                    } else if (iOnPlayFromMediaId5 == 2) {
                                        i16 = 2;
                                    } else if (iOnPlayFromMediaId5 == 3) {
                                        i16 = 3;
                                    }
                                }
                            } else if (iMediaBrowserCompatItemReceiver2 == 1668246642) {
                                i11 = iWrite2;
                                i10 = iAudioAttributesCompatParcelizer;
                                if (i11 == -1 && i10 == -1) {
                                    int iMediaBrowserCompatItemReceiver3 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
                                    if (iMediaBrowserCompatItemReceiver3 == 1852009592 || iMediaBrowserCompatItemReceiver3 == 1852009571) {
                                        int iOnPrepare3 = asPropertyTypeDeserializer.onPrepare();
                                        int iOnPrepare4 = asPropertyTypeDeserializer.onPrepare();
                                        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
                                        boolean z3 = iMediaBrowserCompatItemReceiver == 19 && (asPropertyTypeDeserializer.onPlayFromMediaId() & 128) != 0;
                                        iWrite2 = keyFormat.write(iOnPrepare3);
                                        i15 = z3 ? 1 : 2;
                                        iAudioAttributesCompatParcelizer = keyFormat.AudioAttributesCompatParcelizer(iOnPrepare4);
                                        i18 = i9;
                                        i14 = i8;
                                    } else {
                                        StringBuilder sb = new StringBuilder("Unsupported color type: ");
                                        sb.append(chainedTransformer.RemoteActionCompatParcelizer(iMediaBrowserCompatItemReceiver3));
                                        prune.RemoteActionCompatParcelizer("AtomParsers", sb.toString());
                                    }
                                }
                                iWrite += iMediaBrowserCompatItemReceiver;
                                i12 = i2;
                                i13 = i3;
                                writeVar2 = writeVar;
                                iIntValue = i7;
                                str3 = str2;
                                drmInitDataIconCompatParcelizer = drmInitData2;
                            } else {
                                i10 = iAudioAttributesCompatParcelizer;
                                i11 = iWrite2;
                            }
                            i18 = i9;
                            i14 = i8;
                        }
                        iWrite += iMediaBrowserCompatItemReceiver;
                        i12 = i2;
                        i13 = i3;
                        writeVar2 = writeVar;
                        iIntValue = i7;
                        str3 = str2;
                        drmInitDataIconCompatParcelizer = drmInitData2;
                    }
                }
                iAudioAttributesCompatParcelizer = i10;
                iWrite2 = i11;
                i18 = i9;
                i14 = i8;
                iWrite += iMediaBrowserCompatItemReceiver;
                i12 = i2;
                i13 = i3;
                writeVar2 = writeVar;
                iIntValue = i7;
                str3 = str2;
                drmInitDataIconCompatParcelizer = drmInitData2;
            }
            iWrite += iMediaBrowserCompatItemReceiver;
            i12 = i2;
            i13 = i3;
            writeVar2 = writeVar;
            iIntValue = i7;
            str3 = str2;
            drmInitDataIconCompatParcelizer = drmInitData2;
        }
        DrmInitData drmInitData3 = drmInitDataIconCompatParcelizer;
        int i39 = i14;
        int i40 = i18;
        int i41 = iAudioAttributesCompatParcelizer;
        int i42 = iWrite2;
        if (str == null) {
            return;
        }
        C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer(i4).AudioAttributesImplApi26Parcelizer(str).RemoteActionCompatParcelizer(str4).onFastForward(iOnPrepare).MediaBrowserCompatItemReceiver(iOnPrepare2).write(fWrite).MediaBrowserCompatMediaItem(i5).AudioAttributesCompatParcelizer(bArrRemoteActionCompatParcelizer).onCustomAction(i16).RemoteActionCompatParcelizer(list).MediaMetadataCompat(i17).AudioAttributesCompatParcelizer(drmInitData3).IconCompatParcelizer(new keyFormat.read().IconCompatParcelizer(i42).read(i15).RemoteActionCompatParcelizer(i41).IconCompatParcelizer(byteBuffer != null ? byteBuffer.array() : null).AudioAttributesCompatParcelizer(i39).write(i40).write());
        if (audioAttributesCompatParcelizerRemoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizerIconCompatParcelizer.write(parseTextAttribute.IconCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer)).MediaDescriptionCompat(parseTextAttribute.IconCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer));
        }
        writeVar.RemoteActionCompatParcelizer = remoteActionCompatParcelizerIconCompatParcelizer.IconCompatParcelizer();
    }

    private static keyFormat AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        keyFormat.read readVar = new keyFormat.read();
        AsExternalTypeSerializer asExternalTypeSerializer = new AsExternalTypeSerializer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer());
        asExternalTypeSerializer.read(asPropertyTypeDeserializer.write() << 3);
        asExternalTypeSerializer.MediaBrowserCompatCustomActionResultReceiver(1);
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(3);
        asExternalTypeSerializer.write(6);
        boolean z = asExternalTypeSerializer.read();
        boolean z2 = asExternalTypeSerializer.read();
        if (iIconCompatParcelizer == 2 && z) {
            readVar.AudioAttributesCompatParcelizer(z2 ? 12 : 10);
            readVar.write(z2 ? 12 : 10);
        } else if (iIconCompatParcelizer <= 2) {
            readVar.AudioAttributesCompatParcelizer(z ? 10 : 8);
            readVar.write(z ? 10 : 8);
        }
        asExternalTypeSerializer.write(13);
        asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
        int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(4);
        if (iIconCompatParcelizer2 != 1) {
            prune.write("AtomParsers", "Unsupported obu_type: ".concat(String.valueOf(iIconCompatParcelizer2)));
            return readVar.write();
        }
        if (asExternalTypeSerializer.read()) {
            prune.write("AtomParsers", "Unsupported obu_extension_flag");
            return readVar.write();
        }
        boolean z3 = asExternalTypeSerializer.read();
        asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
        if (z3 && asExternalTypeSerializer.IconCompatParcelizer(8) > 127) {
            prune.write("AtomParsers", "Excessive obu_size");
            return readVar.write();
        }
        int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(3);
        asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
        if (asExternalTypeSerializer.read()) {
            prune.write("AtomParsers", "Unsupported reduced_still_picture_header");
            return readVar.write();
        }
        if (asExternalTypeSerializer.read()) {
            prune.write("AtomParsers", "Unsupported timing_info_present_flag");
            return readVar.write();
        }
        if (asExternalTypeSerializer.read()) {
            prune.write("AtomParsers", "Unsupported initial_display_delay_present_flag");
            return readVar.write();
        }
        int iIconCompatParcelizer4 = asExternalTypeSerializer.IconCompatParcelizer(5);
        boolean z4 = false;
        for (int i = 0; i <= iIconCompatParcelizer4; i++) {
            asExternalTypeSerializer.write(12);
            if (asExternalTypeSerializer.IconCompatParcelizer(5) > 7) {
                asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
            }
        }
        int iIconCompatParcelizer5 = asExternalTypeSerializer.IconCompatParcelizer(4);
        int iIconCompatParcelizer6 = asExternalTypeSerializer.IconCompatParcelizer(4);
        asExternalTypeSerializer.write(iIconCompatParcelizer5 + 1);
        asExternalTypeSerializer.write(iIconCompatParcelizer6 + 1);
        if (asExternalTypeSerializer.read()) {
            asExternalTypeSerializer.write(7);
        }
        asExternalTypeSerializer.write(7);
        boolean z5 = asExternalTypeSerializer.read();
        if (z5) {
            asExternalTypeSerializer.write(2);
        }
        if ((asExternalTypeSerializer.read() || asExternalTypeSerializer.IconCompatParcelizer(1) > 0) && !asExternalTypeSerializer.read()) {
            asExternalTypeSerializer.write(1);
        }
        if (z5) {
            asExternalTypeSerializer.write(3);
        }
        asExternalTypeSerializer.write(3);
        boolean z6 = asExternalTypeSerializer.read();
        if (iIconCompatParcelizer3 == 2 && z6) {
            asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
        }
        if (iIconCompatParcelizer3 != 1 && asExternalTypeSerializer.read()) {
            z4 = true;
        }
        if (asExternalTypeSerializer.read()) {
            int iIconCompatParcelizer7 = asExternalTypeSerializer.IconCompatParcelizer(8);
            int iIconCompatParcelizer8 = asExternalTypeSerializer.IconCompatParcelizer(8);
            readVar.IconCompatParcelizer(keyFormat.write(iIconCompatParcelizer7)).read(((z4 || iIconCompatParcelizer7 != 1 || iIconCompatParcelizer8 != 13 || asExternalTypeSerializer.IconCompatParcelizer(8) != 0) ? asExternalTypeSerializer.IconCompatParcelizer(1) : 1) != 1 ? 2 : 1).RemoteActionCompatParcelizer(keyFormat.AudioAttributesCompatParcelizer(iIconCompatParcelizer8));
        }
        return readVar.write();
    }

    private static ByteBuffer read() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2, int i3, write writeVar) {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i2 + 16);
        if (i == 1835365492) {
            asPropertyTypeDeserializer.onAddQueueItem();
            String strOnAddQueueItem = asPropertyTypeDeserializer.onAddQueueItem();
            if (strOnAddQueueItem != null) {
                writeVar.RemoteActionCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer(i3).AudioAttributesImplApi26Parcelizer(strOnAddQueueItem).IconCompatParcelizer();
            }
        }
    }

    private static Pair<long[], long[]> AudioAttributesCompatParcelizer(chainedTransformer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        chainedTransformer.IconCompatParcelizer IconCompatParcelizer2 = remoteActionCompatParcelizer.IconCompatParcelizer(Atom.TYPE_elst);
        if (IconCompatParcelizer2 == null) {
            return null;
        }
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = IconCompatParcelizer2.write;
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(8);
        int iAudioAttributesCompatParcelizer = chainedTransformer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
        int iOnPrepareFromSearch = asPropertyTypeDeserializer.onPrepareFromSearch();
        long[] jArr = new long[iOnPrepareFromSearch];
        long[] jArr2 = new long[iOnPrepareFromSearch];
        for (int i = 0; i < iOnPrepareFromSearch; i++) {
            jArr[i] = iAudioAttributesCompatParcelizer == 1 ? asPropertyTypeDeserializer.onPlayFromUri() : asPropertyTypeDeserializer.onMediaButtonEvent();
            jArr2[i] = iAudioAttributesCompatParcelizer == 1 ? asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler() : asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (asPropertyTypeDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static float write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i + 8);
        return asPropertyTypeDeserializer.onPrepareFromSearch() / asPropertyTypeDeserializer.onPrepareFromSearch();
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void IconCompatParcelizer(kotlin.AsPropertyTypeDeserializer r23, int r24, int r25, int r26, int r27, java.lang.String r28, boolean r29, androidx.media3.common.DrmInitData r30, o.linkNext.write r31, int r32) throws kotlin.SchemaAware {
        /*
            Method dump skipped, instruction units count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.linkNext.IconCompatParcelizer(o.AsPropertyTypeDeserializer, int, int, int, int, java.lang.String, boolean, androidx.media3.common.DrmInitData, o.linkNext$write, int):void");
    }

    private static int read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2) throws SchemaAware {
        int iWrite = asPropertyTypeDeserializer.write();
        findSuperClasses.IconCompatParcelizer(iWrite >= i, null);
        while (iWrite - i < i2) {
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            findSuperClasses.IconCompatParcelizer(iMediaBrowserCompatItemReceiver > 0, "childAtomSize must be positive");
            if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() == 1702061171) {
                return iWrite;
            }
            iWrite += iMediaBrowserCompatItemReceiver;
        }
        return -1;
    }

    private static AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i + 12);
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
        IconCompatParcelizer(asPropertyTypeDeserializer);
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        if ((iOnPlayFromMediaId & 128) != 0) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
        }
        if ((iOnPlayFromMediaId & 64) != 0) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(asPropertyTypeDeserializer.onPlayFromMediaId());
        }
        if ((iOnPlayFromMediaId & 32) != 0) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
        }
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
        IconCompatParcelizer(asPropertyTypeDeserializer);
        String strRemoteActionCompatParcelizer = DefaultBaseTypeLimitingValidator.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.onPlayFromMediaId());
        if (MimeTypes.AUDIO_MPEG.equals(strRemoteActionCompatParcelizer) || MimeTypes.AUDIO_DTS.equals(strRemoteActionCompatParcelizer) || MimeTypes.AUDIO_DTS_HD.equals(strRemoteActionCompatParcelizer)) {
            return new AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, null, -1L, -1L);
        }
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        long jOnMediaButtonEvent = asPropertyTypeDeserializer.onMediaButtonEvent();
        long jOnMediaButtonEvent2 = asPropertyTypeDeserializer.onMediaButtonEvent();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
        int iIconCompatParcelizer = IconCompatParcelizer(asPropertyTypeDeserializer);
        byte[] bArr = new byte[iIconCompatParcelizer];
        asPropertyTypeDeserializer.write(bArr, 0, iIconCompatParcelizer);
        return new AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, bArr, jOnMediaButtonEvent2 <= 0 ? -1L : jOnMediaButtonEvent2, jOnMediaButtonEvent <= 0 ? -1L : jOnMediaButtonEvent);
    }

    private static Pair<Integer, bufferedSize> AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2) throws SchemaAware {
        Pair<Integer, bufferedSize> pairIconCompatParcelizer;
        int iWrite = asPropertyTypeDeserializer.write();
        while (iWrite - i < i2) {
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            findSuperClasses.IconCompatParcelizer(iMediaBrowserCompatItemReceiver > 0, "childAtomSize must be positive");
            if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() == 1936289382 && (pairIconCompatParcelizer = IconCompatParcelizer(asPropertyTypeDeserializer, iWrite, iMediaBrowserCompatItemReceiver)) != null) {
                return pairIconCompatParcelizer;
            }
            iWrite += iMediaBrowserCompatItemReceiver;
        }
        return null;
    }

    private static Pair<Integer, bufferedSize> IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2) throws SchemaAware {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String str = null;
        Integer numValueOf = null;
        while (i3 - i < i2) {
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i3);
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (iMediaBrowserCompatItemReceiver2 == 1718775137) {
                numValueOf = Integer.valueOf(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
            } else if (iMediaBrowserCompatItemReceiver2 == 1935894637) {
                asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
                str = asPropertyTypeDeserializer.read(4);
            } else if (iMediaBrowserCompatItemReceiver2 == 1935894633) {
                i4 = i3;
                i5 = iMediaBrowserCompatItemReceiver;
            }
            i3 += iMediaBrowserCompatItemReceiver;
        }
        if (!C.CENC_TYPE_cenc.equals(str) && !C.CENC_TYPE_cbc1.equals(str) && !C.CENC_TYPE_cens.equals(str) && !C.CENC_TYPE_cbcs.equals(str)) {
            return null;
        }
        findSuperClasses.IconCompatParcelizer(numValueOf != null, "frma atom is mandatory");
        findSuperClasses.IconCompatParcelizer(i4 != -1, "schi atom is mandatory");
        bufferedSize bufferedsize = read(asPropertyTypeDeserializer, i4, i5, str);
        findSuperClasses.IconCompatParcelizer(bufferedsize != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (bufferedSize) LaissezFaireSubTypeValidator.IconCompatParcelizer(bufferedsize));
    }

    private static bufferedSize read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i5);
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() == 1952804451) {
                int iAudioAttributesCompatParcelizer = chainedTransformer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
                asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
                if (iAudioAttributesCompatParcelizer == 0) {
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
                    i3 = 0;
                    i4 = 0;
                } else {
                    int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
                    i3 = (iOnPlayFromMediaId & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                    i4 = iOnPlayFromMediaId & 15;
                }
                boolean z = asPropertyTypeDeserializer.onPlayFromMediaId() == 1;
                int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
                byte[] bArr2 = new byte[16];
                asPropertyTypeDeserializer.write(bArr2, 0, 16);
                if (z && iOnPlayFromMediaId2 == 0) {
                    int iOnPlayFromMediaId3 = asPropertyTypeDeserializer.onPlayFromMediaId();
                    bArr = new byte[iOnPlayFromMediaId3];
                    asPropertyTypeDeserializer.write(bArr, 0, iOnPlayFromMediaId3);
                }
                return new bufferedSize(z, str, iOnPlayFromMediaId2, bArr2, i3, i4, bArr);
            }
            i5 += iMediaBrowserCompatItemReceiver;
        }
    }

    private static byte[] RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i3);
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() == 1886547818) {
                return Arrays.copyOfRange(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), i3, iMediaBrowserCompatItemReceiver + i3);
            }
            i3 += iMediaBrowserCompatItemReceiver;
        }
        return null;
    }

    private static int IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        int i = iOnPlayFromMediaId & 127;
        while ((iOnPlayFromMediaId & 128) == 128) {
            iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
            i = (i << 7) | (iOnPlayFromMediaId & 127);
        }
        return i;
    }

    private static boolean IconCompatParcelizer(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[LaissezFaireSubTypeValidator.write(4, 0, length)] && jArr[LaissezFaireSubTypeValidator.write(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    static final class RemoteActionCompatParcelizer {
        public long AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        public int IconCompatParcelizer;
        private final boolean MediaBrowserCompatCustomActionResultReceiver;
        private final AsPropertyTypeDeserializer MediaBrowserCompatItemReceiver;
        private final AsPropertyTypeDeserializer RemoteActionCompatParcelizer;
        public final int read;
        public int write;

        public RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, AsPropertyTypeDeserializer asPropertyTypeDeserializer2, boolean z) throws SchemaAware {
            this.MediaBrowserCompatItemReceiver = asPropertyTypeDeserializer;
            this.RemoteActionCompatParcelizer = asPropertyTypeDeserializer2;
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            asPropertyTypeDeserializer2.MediaBrowserCompatCustomActionResultReceiver(12);
            this.read = asPropertyTypeDeserializer2.onPrepareFromSearch();
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(12);
            this.AudioAttributesImplApi21Parcelizer = asPropertyTypeDeserializer.onPrepareFromSearch();
            findSuperClasses.IconCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() == 1, "first_chunk must be 1");
            this.write = -1;
        }

        public final boolean RemoteActionCompatParcelizer() {
            long jOnMediaButtonEvent;
            int i = this.write + 1;
            this.write = i;
            if (i == this.read) {
                return false;
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                jOnMediaButtonEvent = this.RemoteActionCompatParcelizer.onPlayFromUri();
            } else {
                jOnMediaButtonEvent = this.RemoteActionCompatParcelizer.onMediaButtonEvent();
            }
            this.AudioAttributesCompatParcelizer = jOnMediaButtonEvent;
            if (this.write == this.AudioAttributesImplApi26Parcelizer) {
                this.IconCompatParcelizer = this.MediaBrowserCompatItemReceiver.onPrepareFromSearch();
                this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer(4);
                int i2 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i2;
                this.AudioAttributesImplApi26Parcelizer = i2 > 0 ? this.MediaBrowserCompatItemReceiver.onPrepareFromSearch() - 1 : -1;
            }
            return true;
        }
    }

    static final class AudioAttributesImplApi21Parcelizer {
        private final int AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final long RemoteActionCompatParcelizer;

        public AudioAttributesImplApi21Parcelizer(int i, long j, int i2) {
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = j;
            this.AudioAttributesCompatParcelizer = i2;
        }
    }

    static final class write {
        public int AudioAttributesCompatParcelizer;
        public int IconCompatParcelizer = 0;
        public C0170format RemoteActionCompatParcelizer;
        public final bufferedSize[] write;

        public write(int i) {
            this.write = new bufferedSize[i];
        }
    }

    static final class AudioAttributesCompatParcelizer {
        private final long AudioAttributesCompatParcelizer;
        private final long IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final byte[] write;

        public AudioAttributesCompatParcelizer(String str, byte[] bArr, long j, long j2) {
            this.RemoteActionCompatParcelizer = str;
            this.write = bArr;
            this.AudioAttributesCompatParcelizer = j;
            this.IconCompatParcelizer = j2;
        }
    }

    static final class read implements IconCompatParcelizer {
        private final int AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final AsPropertyTypeDeserializer RemoteActionCompatParcelizer;

        public read(chainedTransformer.IconCompatParcelizer iconCompatParcelizer, C0170format c0170format) {
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = iconCompatParcelizer.write;
            this.RemoteActionCompatParcelizer = asPropertyTypeDeserializer;
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(12);
            int iOnPrepareFromSearch = asPropertyTypeDeserializer.onPrepareFromSearch();
            if (MimeTypes.AUDIO_RAW.equals(c0170format.onPlayFromUri)) {
                int i = LaissezFaireSubTypeValidator.read(c0170format.onMediaButtonEvent, c0170format.AudioAttributesCompatParcelizer);
                if (iOnPrepareFromSearch == 0 || iOnPrepareFromSearch % i != 0) {
                    StringBuilder sb = new StringBuilder("Audio sample size mismatch. stsd sample size: ");
                    sb.append(i);
                    sb.append(", stsz sample size: ");
                    sb.append(iOnPrepareFromSearch);
                    prune.RemoteActionCompatParcelizer("AtomParsers", sb.toString());
                    iOnPrepareFromSearch = i;
                }
            }
            this.AudioAttributesCompatParcelizer = iOnPrepareFromSearch == 0 ? -1 : iOnPrepareFromSearch;
            this.IconCompatParcelizer = asPropertyTypeDeserializer.onPrepareFromSearch();
        }

        @Override // o.linkNext.IconCompatParcelizer
        public final int IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // o.linkNext.IconCompatParcelizer
        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // o.linkNext.IconCompatParcelizer
        public final int write() {
            int i = this.AudioAttributesCompatParcelizer;
            return i == -1 ? this.RemoteActionCompatParcelizer.onPrepareFromSearch() : i;
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver implements IconCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private final AsPropertyTypeDeserializer read;
        private final int write;

        @Override // o.linkNext.IconCompatParcelizer
        public final int RemoteActionCompatParcelizer() {
            return -1;
        }

        public MediaBrowserCompatCustomActionResultReceiver(chainedTransformer.IconCompatParcelizer iconCompatParcelizer) {
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = iconCompatParcelizer.write;
            this.read = asPropertyTypeDeserializer;
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(12);
            this.IconCompatParcelizer = asPropertyTypeDeserializer.onPrepareFromSearch() & 255;
            this.write = asPropertyTypeDeserializer.onPrepareFromSearch();
        }

        @Override // o.linkNext.IconCompatParcelizer
        public final int IconCompatParcelizer() {
            return this.write;
        }

        @Override // o.linkNext.IconCompatParcelizer
        public final int write() {
            int i = this.IconCompatParcelizer;
            if (i == 8) {
                return this.read.onPlayFromMediaId();
            }
            if (i == 16) {
                return this.read.onPrepare();
            }
            int i2 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i2 + 1;
            if (i2 % 2 == 0) {
                int iOnPlayFromMediaId = this.read.onPlayFromMediaId();
                this.AudioAttributesCompatParcelizer = iOnPlayFromMediaId;
                return (iOnPlayFromMediaId & PsExtractor.VIDEO_STREAM_MASK) >> 4;
            }
            return this.AudioAttributesCompatParcelizer & 15;
        }
    }
}
