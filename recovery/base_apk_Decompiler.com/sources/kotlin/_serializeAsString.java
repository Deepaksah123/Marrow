package kotlin;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.DrmInitData;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import com.marrow.data.models.video.VideoPlaybackConfiguration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.EnumSerializer;
import kotlin._acceptJsonFormatVisitor;
import kotlin.constructGeneralizedType;

/* JADX INFO: loaded from: classes2.dex */
public final class _serializeAsString implements constructGeneralizedType.IconCompatParcelizer<_asTimestamp> {
    private final _acceptJsonFormatVisitor PlaybackStateCompatCustomAction;
    private final EnumSerializer r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private static final Pattern RemoteActionCompatParcelizer = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern read = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern onStop = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern MediaMetadataCompat = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern AudioAttributesImplApi21Parcelizer = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern MediaDescriptionCompat = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern onCustomAction = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern setSessionImpl = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern handleMediaPlayPauseIfPendingOnHandler = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern onSkipToQueueItem = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern IconCompatParcelizer = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern onSetCaptioningEnabled = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern onSetRepeatMode = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern MediaBrowserCompatSearchResultReceiver = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern MediaBrowserCompatMediaItem = read("CAN-SKIP-DATERANGES");
    private static final Pattern onSkipToPrevious = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern onMediaButtonEvent = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern onSetPlaybackSpeed = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern MediaBrowserCompatItemReceiver = read("CAN-BLOCK-RELOAD");
    private static final Pattern onPrepareFromUri = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern onRemoveQueueItem = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern onRewind = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern onPrepareFromSearch = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern onRemoveQueueItemAt = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern MediaSessionCompatQueueItem = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern AudioAttributesImplApi26Parcelizer = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern write = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern AudioAttributesImplBaseParcelizer = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern MediaBrowserCompatCustomActionResultReceiver = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern onSeekTo = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern onPlayFromSearch = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern onPrepare = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern MediaSessionCompatToken = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern onPlayFromUri = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern ParcelableVolumeInfo = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern onSkipToNext = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern onPrepareFromMediaId = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern onSetRating = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern onFastForward = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern RatingCompat = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern onPause = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern AudioAttributesCompatParcelizer = read("AUTOSELECT");
    private static final Pattern MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = read(VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT);
    private static final Pattern onCommand = read("FORCED");
    private static final Pattern onPlay = read("INDEPENDENT");
    private static final Pattern onAddQueueItem = read("GAP");
    private static final Pattern onSetShuffleMode = read("PRECISE");
    private static final Pattern MediaSessionCompatResultReceiverWrapper = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern onPlayFromMediaId = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern PlaybackStateCompat = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class read extends IOException {
    }

    public _serializeAsString() {
        this(EnumSerializer.write, null);
    }

    public _serializeAsString(EnumSerializer enumSerializer, _acceptJsonFormatVisitor _acceptjsonformatvisitor) {
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = enumSerializer;
        this.PlaybackStateCompatCustomAction = _acceptjsonformatvisitor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructGeneralizedType.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public _asTimestamp RemoteActionCompatParcelizer(Uri uri, InputStream inputStream) throws IOException {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!AudioAttributesCompatParcelizer(bufferedReader)) {
                throw SchemaAware.AudioAttributesCompatParcelizer("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    strTrim = line.trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                            arrayDeque.add(strTrim);
                            return write(new AudioAttributesCompatParcelizer(arrayDeque, bufferedReader), uri.toString());
                        }
                        if (strTrim.startsWith("#EXT-X-TARGETDURATION") || strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") || strTrim.startsWith("#EXTINF") || strTrim.startsWith("#EXT-X-KEY") || strTrim.startsWith("#EXT-X-BYTERANGE") || strTrim.equals("#EXT-X-DISCONTINUITY") || strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || strTrim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(strTrim);
                    }
                } else {
                    LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(bufferedReader);
                    throw SchemaAware.AudioAttributesCompatParcelizer("Failed to parse the playlist, could not identify any tags.", null);
                }
            }
            arrayDeque.add(strTrim);
            return RemoteActionCompatParcelizer(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4, this.PlaybackStateCompatCustomAction, new AudioAttributesCompatParcelizer(arrayDeque, bufferedReader), uri.toString());
        } finally {
            LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(bufferedReader);
        }
    }

    private static boolean AudioAttributesCompatParcelizer(BufferedReader bufferedReader) throws IOException {
        int i = bufferedReader.read();
        if (i == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i = bufferedReader.read();
        }
        int i2 = read(bufferedReader, true, i);
        for (int i3 = 0; i3 < 7; i3++) {
            if (i2 != "#EXTM3U".charAt(i3)) {
                return false;
            }
            i2 = bufferedReader.read();
        }
        return LaissezFaireSubTypeValidator.MediaDescriptionCompat(read(bufferedReader, false, i2));
    }

    private static int read(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !LaissezFaireSubTypeValidator.MediaDescriptionCompat(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x033a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static kotlin.EnumSerializer write(o._serializeAsString.AudioAttributesCompatParcelizer r37, java.lang.String r38) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._serializeAsString.write(o._serializeAsString$AudioAttributesCompatParcelizer, java.lang.String):o.EnumSerializer");
    }

    private static EnumSerializer.IconCompatParcelizer AudioAttributesCompatParcelizer(ArrayList<EnumSerializer.IconCompatParcelizer> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            EnumSerializer.IconCompatParcelizer iconCompatParcelizer = arrayList.get(i);
            if (str.equals(iconCompatParcelizer.write)) {
                return iconCompatParcelizer;
            }
        }
        return null;
    }

    private static EnumSerializer.IconCompatParcelizer IconCompatParcelizer(ArrayList<EnumSerializer.IconCompatParcelizer> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            EnumSerializer.IconCompatParcelizer iconCompatParcelizer = arrayList.get(i);
            if (str.equals(iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver)) {
                return iconCompatParcelizer;
            }
        }
        return null;
    }

    private static EnumSerializer.IconCompatParcelizer read(ArrayList<EnumSerializer.IconCompatParcelizer> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            EnumSerializer.IconCompatParcelizer iconCompatParcelizer = arrayList.get(i);
            if (str.equals(iconCompatParcelizer.AudioAttributesCompatParcelizer)) {
                return iconCompatParcelizer;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static _acceptJsonFormatVisitor RemoteActionCompatParcelizer(EnumSerializer enumSerializer, _acceptJsonFormatVisitor _acceptjsonformatvisitor, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, String str) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        String str3;
        boolean z;
        String str4;
        _acceptJsonFormatVisitor.read readVar;
        long j;
        int i;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        _acceptJsonFormatVisitor.write writeVar;
        String str5;
        String strRemoteActionCompatParcelizer;
        boolean z2;
        long j2;
        long j3;
        ArrayList arrayList6;
        long j4;
        boolean z3;
        Object drmInitData;
        ArrayList arrayList7;
        _acceptJsonFormatVisitor.read readVar2;
        EnumSerializer enumSerializer2 = enumSerializer;
        _acceptJsonFormatVisitor _acceptjsonformatvisitor2 = _acceptjsonformatvisitor;
        boolean z4 = enumSerializer2.onPlayFromMediaId;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        _acceptJsonFormatVisitor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = new _acceptJsonFormatVisitor.AudioAttributesCompatParcelizer(C.TIME_UNSET, false, C.TIME_UNSET, C.TIME_UNSET, false);
        TreeMap treeMap = new TreeMap();
        String str6 = "";
        boolean z5 = z4;
        _acceptJsonFormatVisitor.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer2;
        String strIconCompatParcelizer = "";
        long j5 = -1;
        int i2 = 0;
        String strWrite = null;
        boolean zRemoteActionCompatParcelizer = false;
        long j6 = C.TIME_UNSET;
        long jIconCompatParcelizer = 0;
        boolean z6 = false;
        int i3 = 0;
        long jWrite = 0;
        int iAudioAttributesCompatParcelizer = 1;
        long jAudioAttributesCompatParcelizer = C.TIME_UNSET;
        long j7 = C.TIME_UNSET;
        boolean z7 = false;
        DrmInitData drmInitDataRemoteActionCompatParcelizer = null;
        long j8 = 0;
        Object obj = null;
        long j9 = 0;
        boolean z8 = false;
        long j10 = 0;
        String str7 = null;
        int i4 = 0;
        String strIconCompatParcelizer2 = null;
        long j11 = 0;
        long j12 = 0;
        _acceptJsonFormatVisitor.write writeVar2 = null;
        boolean z9 = false;
        long jAudioAttributesImplApi21Parcelizer = 0;
        ArrayList arrayList12 = arrayList9;
        _acceptJsonFormatVisitor.read readVar3 = null;
        while (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
            String strRemoteActionCompatParcelizer2 = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            if (strRemoteActionCompatParcelizer2.startsWith("#EXT")) {
                arrayList11.add(strRemoteActionCompatParcelizer2);
            }
            if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strWrite2 = write(strRemoteActionCompatParcelizer2, onSetRepeatMode, map);
                if ("VOD".equals(strWrite2)) {
                    i2 = 1;
                } else if ("EVENT".equals(strWrite2)) {
                    i2 = 2;
                } else {
                    arrayList = arrayList10;
                    arrayList2 = arrayList12;
                    str2 = str6;
                    str3 = str7;
                    z = zRemoteActionCompatParcelizer;
                    str4 = strIconCompatParcelizer2;
                    readVar = readVar3;
                    j = j12;
                    i = i2;
                    arrayList3 = arrayList11;
                    enumSerializer2 = enumSerializer;
                    _acceptjsonformatvisitor2 = _acceptjsonformatvisitor;
                    arrayList11 = arrayList3;
                    i2 = i;
                    str6 = str2;
                    j12 = j;
                    readVar3 = readVar;
                    arrayList10 = arrayList;
                    strIconCompatParcelizer2 = str4;
                    zRemoteActionCompatParcelizer = z;
                    str7 = str3;
                    arrayList12 = arrayList2;
                }
            } else if (strRemoteActionCompatParcelizer2.equals("#EXT-X-I-FRAMES-ONLY")) {
                z9 = true;
            } else {
                if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-START")) {
                    double d = read(strRemoteActionCompatParcelizer2, MediaSessionCompatQueueItem);
                    arrayList4 = arrayList12;
                    arrayList5 = arrayList11;
                    zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer2, onSetShuffleMode);
                    j6 = (long) (d * 1000000.0d);
                } else {
                    arrayList4 = arrayList12;
                    arrayList5 = arrayList11;
                    if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-SERVER-CONTROL")) {
                        AudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer2);
                    } else if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-PART-INF")) {
                        j7 = (long) (read(strRemoteActionCompatParcelizer2, onSetCaptioningEnabled) * 1000000.0d);
                    } else {
                        if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-MAP")) {
                            String strWrite3 = write(strRemoteActionCompatParcelizer2, MediaSessionCompatToken, map);
                            String strRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer2, write, map);
                            if (strRemoteActionCompatParcelizer3 != null) {
                                String[] strArrAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer3, "@");
                                j5 = Long.parseLong(strArrAudioAttributesCompatParcelizer[0]);
                                if (strArrAudioAttributesCompatParcelizer.length > 1) {
                                    j8 = Long.parseLong(strArrAudioAttributesCompatParcelizer[1]);
                                }
                            }
                            if (j5 == -1) {
                                j8 = 0;
                            }
                            String str8 = str7;
                            if (strWrite != null && str8 == null) {
                                throw SchemaAware.AudioAttributesCompatParcelizer("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            writeVar2 = new _acceptJsonFormatVisitor.write(strWrite3, j8, j5, strWrite, str8);
                            if (j5 != -1) {
                                j8 += j5;
                            }
                            str7 = str8;
                            arrayList11 = arrayList5;
                            j5 = -1;
                        } else {
                            str3 = str7;
                            z = zRemoteActionCompatParcelizer;
                            if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-TARGETDURATION")) {
                                jAudioAttributesCompatParcelizer = 1000000 * ((long) AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer2, onSkipToQueueItem));
                            } else if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                jWrite = write(strRemoteActionCompatParcelizer2, onPrepareFromUri);
                                j12 = jWrite;
                            } else if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-VERSION")) {
                                iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer2, r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                            } else {
                                if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-DEFINE")) {
                                    String strRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer2, onPlayFromMediaId, map);
                                    if (strRemoteActionCompatParcelizer4 != null) {
                                        String str9 = enumSerializer2.AudioAttributesImplBaseParcelizer.get(strRemoteActionCompatParcelizer4);
                                        if (str9 != null) {
                                            map.put(strRemoteActionCompatParcelizer4, str9);
                                        }
                                    } else {
                                        map.put(write(strRemoteActionCompatParcelizer2, onSetRating, map), write(strRemoteActionCompatParcelizer2, MediaSessionCompatResultReceiverWrapper, map));
                                    }
                                    arrayList = arrayList10;
                                    str2 = str6;
                                    str4 = strIconCompatParcelizer2;
                                    readVar = readVar3;
                                    j = j12;
                                } else if (strRemoteActionCompatParcelizer2.startsWith("#EXTINF")) {
                                    jAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(strRemoteActionCompatParcelizer2, onRemoveQueueItem);
                                    strIconCompatParcelizer = IconCompatParcelizer(strRemoteActionCompatParcelizer2, onRewind, str6, map);
                                } else {
                                    if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-SKIP")) {
                                        int iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer2, onSkipToPrevious);
                                        buildTypeSerializer.write(_acceptjsonformatvisitor2 != null && arrayList8.isEmpty());
                                        int i5 = (int) (jWrite - ((_acceptJsonFormatVisitor) LaissezFaireSubTypeValidator.IconCompatParcelizer(_acceptjsonformatvisitor)).AudioAttributesImplBaseParcelizer);
                                        int i6 = iAudioAttributesCompatParcelizer2 + i5;
                                        if (i5 < 0 || i6 > _acceptjsonformatvisitor2.MediaDescriptionCompat.size()) {
                                            throw new read();
                                        }
                                        str2 = str6;
                                        long j13 = j11;
                                        while (i5 < i6) {
                                            _acceptJsonFormatVisitor.write writeVarIconCompatParcelizer = _acceptjsonformatvisitor2.MediaDescriptionCompat.get(i5);
                                            String str10 = str3;
                                            int i7 = i6;
                                            if (jWrite != _acceptjsonformatvisitor2.AudioAttributesImplBaseParcelizer) {
                                                writeVarIconCompatParcelizer = writeVarIconCompatParcelizer.IconCompatParcelizer(j13, (_acceptjsonformatvisitor2.write - i3) + writeVarIconCompatParcelizer.MediaMetadataCompat);
                                            }
                                            arrayList8.add(writeVarIconCompatParcelizer);
                                            j13 += writeVarIconCompatParcelizer.AudioAttributesImplApi21Parcelizer;
                                            if (writeVarIconCompatParcelizer.write != -1) {
                                                j8 = writeVarIconCompatParcelizer.IconCompatParcelizer + writeVarIconCompatParcelizer.write;
                                            }
                                            int i8 = writeVarIconCompatParcelizer.MediaMetadataCompat;
                                            _acceptJsonFormatVisitor.write writeVar3 = writeVarIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
                                            DrmInitData drmInitData2 = writeVarIconCompatParcelizer.MediaBrowserCompatItemReceiver;
                                            String str11 = writeVarIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
                                            if (writeVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer != null) {
                                                writeVar = writeVar3;
                                                if (writeVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer.equals(Long.toHexString(j12))) {
                                                    str5 = str10;
                                                }
                                                j12++;
                                                i5++;
                                                _acceptjsonformatvisitor2 = _acceptjsonformatvisitor;
                                                strWrite = str11;
                                                j9 = j13;
                                                i4 = i8;
                                                i6 = i7;
                                                writeVar2 = writeVar;
                                                obj = drmInitData2;
                                                str3 = str5;
                                            } else {
                                                writeVar = writeVar3;
                                            }
                                            str5 = writeVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer;
                                            j12++;
                                            i5++;
                                            _acceptjsonformatvisitor2 = _acceptjsonformatvisitor;
                                            strWrite = str11;
                                            j9 = j13;
                                            i4 = i8;
                                            i6 = i7;
                                            writeVar2 = writeVar;
                                            obj = drmInitData2;
                                            str3 = str5;
                                        }
                                        j11 = j13;
                                    } else {
                                        str2 = str6;
                                        if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-KEY")) {
                                            String strWrite4 = write(strRemoteActionCompatParcelizer2, onSeekTo, map);
                                            String strIconCompatParcelizer3 = IconCompatParcelizer(strRemoteActionCompatParcelizer2, onPlayFromSearch, "identity", map);
                                            if ("NONE".equals(strWrite4)) {
                                                treeMap.clear();
                                                strRemoteActionCompatParcelizer = null;
                                                strWrite = null;
                                            } else {
                                                strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer2, onPlayFromUri, map);
                                                if ("identity".equals(strIconCompatParcelizer3)) {
                                                    if ("AES-128".equals(strWrite4)) {
                                                        strWrite = write(strRemoteActionCompatParcelizer2, MediaSessionCompatToken, map);
                                                    }
                                                    str3 = strRemoteActionCompatParcelizer;
                                                } else {
                                                    String str12 = strIconCompatParcelizer2;
                                                    strIconCompatParcelizer2 = str12 == null ? IconCompatParcelizer(strWrite4) : str12;
                                                    DrmInitData.SchemeData schemeDataWrite = write(strRemoteActionCompatParcelizer2, strIconCompatParcelizer3, map);
                                                    if (schemeDataWrite != null) {
                                                        treeMap.put(strIconCompatParcelizer3, schemeDataWrite);
                                                        strWrite = null;
                                                    }
                                                }
                                                strWrite = null;
                                                str3 = strRemoteActionCompatParcelizer;
                                            }
                                            obj = strWrite;
                                            str3 = strRemoteActionCompatParcelizer;
                                        } else {
                                            str4 = strIconCompatParcelizer2;
                                            if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-BYTERANGE")) {
                                                String[] strArrAudioAttributesCompatParcelizer2 = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(write(strRemoteActionCompatParcelizer2, AudioAttributesImplApi26Parcelizer, map), "@");
                                                j5 = Long.parseLong(strArrAudioAttributesCompatParcelizer2[0]);
                                                if (strArrAudioAttributesCompatParcelizer2.length > 1) {
                                                    j8 = Long.parseLong(strArrAudioAttributesCompatParcelizer2[1]);
                                                }
                                            } else {
                                                if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                                    i3 = Integer.parseInt(strRemoteActionCompatParcelizer2.substring(strRemoteActionCompatParcelizer2.indexOf(58) + 1));
                                                    enumSerializer2 = enumSerializer;
                                                    _acceptjsonformatvisitor2 = _acceptjsonformatvisitor;
                                                    arrayList11 = arrayList5;
                                                    strIconCompatParcelizer2 = str4;
                                                    zRemoteActionCompatParcelizer = z;
                                                    str6 = str2;
                                                    z6 = true;
                                                } else if (strRemoteActionCompatParcelizer2.equals("#EXT-X-DISCONTINUITY")) {
                                                    i4++;
                                                } else {
                                                    if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                        if (jIconCompatParcelizer == 0) {
                                                            jIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(strRemoteActionCompatParcelizer2.substring(strRemoteActionCompatParcelizer2.indexOf(58) + 1))) - j11;
                                                        }
                                                    } else if (strRemoteActionCompatParcelizer2.equals("#EXT-X-GAP")) {
                                                        enumSerializer2 = enumSerializer;
                                                        _acceptjsonformatvisitor2 = _acceptjsonformatvisitor;
                                                        arrayList11 = arrayList5;
                                                        strIconCompatParcelizer2 = str4;
                                                        zRemoteActionCompatParcelizer = z;
                                                        str6 = str2;
                                                        z8 = true;
                                                    } else if (strRemoteActionCompatParcelizer2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                        enumSerializer2 = enumSerializer;
                                                        _acceptjsonformatvisitor2 = _acceptjsonformatvisitor;
                                                        arrayList11 = arrayList5;
                                                        strIconCompatParcelizer2 = str4;
                                                        zRemoteActionCompatParcelizer = z;
                                                        str6 = str2;
                                                        z5 = true;
                                                    } else if (strRemoteActionCompatParcelizer2.equals("#EXT-X-ENDLIST")) {
                                                        enumSerializer2 = enumSerializer;
                                                        _acceptjsonformatvisitor2 = _acceptjsonformatvisitor;
                                                        arrayList11 = arrayList5;
                                                        strIconCompatParcelizer2 = str4;
                                                        zRemoteActionCompatParcelizer = z;
                                                        str6 = str2;
                                                        z7 = true;
                                                    } else if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                        arrayList10.add(new _acceptJsonFormatVisitor.IconCompatParcelizer(Uri.parse(_idFrom.RemoteActionCompatParcelizer(str, write(strRemoteActionCompatParcelizer2, MediaSessionCompatToken, map))), MediaBrowserCompatCustomActionResultReceiver(strRemoteActionCompatParcelizer2, onPrepareFromSearch), AudioAttributesImplApi26Parcelizer(strRemoteActionCompatParcelizer2, onRemoveQueueItemAt)));
                                                    } else if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                        if (readVar3 == null && "PART".equals(write(strRemoteActionCompatParcelizer2, onSkipToNext, map))) {
                                                            String strWrite5 = write(strRemoteActionCompatParcelizer2, MediaSessionCompatToken, map);
                                                            long jMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(strRemoteActionCompatParcelizer2, AudioAttributesImplBaseParcelizer);
                                                            long jMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver(strRemoteActionCompatParcelizer2, MediaBrowserCompatCustomActionResultReceiver);
                                                            _acceptJsonFormatVisitor.read readVar4 = readVar3;
                                                            ArrayList arrayList13 = arrayList10;
                                                            long j14 = j12;
                                                            String strRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(j14, strWrite, str3);
                                                            if (obj != null || treeMap.isEmpty()) {
                                                                arrayList7 = arrayList5;
                                                            } else {
                                                                arrayList7 = arrayList5;
                                                                DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                DrmInitData drmInitData3 = new DrmInitData(str4, schemeDataArr);
                                                                if (drmInitDataRemoteActionCompatParcelizer == null) {
                                                                    drmInitDataRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str4, schemeDataArr);
                                                                }
                                                                obj = drmInitData3;
                                                            }
                                                            if (jMediaBrowserCompatCustomActionResultReceiver == -1 || jMediaBrowserCompatCustomActionResultReceiver2 != -1) {
                                                                readVar2 = new _acceptJsonFormatVisitor.read(strWrite5, writeVar2, 0L, i4, j9, obj, strWrite, strRemoteActionCompatParcelizer5, jMediaBrowserCompatCustomActionResultReceiver == -1 ? 0L : jMediaBrowserCompatCustomActionResultReceiver, jMediaBrowserCompatCustomActionResultReceiver2, false, false, true);
                                                            } else {
                                                                readVar2 = readVar4;
                                                            }
                                                            _acceptjsonformatvisitor2 = _acceptjsonformatvisitor;
                                                            strIconCompatParcelizer2 = str4;
                                                            zRemoteActionCompatParcelizer = z;
                                                            arrayList11 = arrayList7;
                                                            j12 = j14;
                                                            str7 = str3;
                                                            arrayList10 = arrayList13;
                                                            arrayList12 = arrayList4;
                                                            str6 = str2;
                                                            readVar3 = readVar2;
                                                            enumSerializer2 = enumSerializer;
                                                        } else {
                                                            readVar = readVar3;
                                                            j = j12;
                                                            arrayList3 = arrayList5;
                                                            i = i2;
                                                            arrayList = arrayList10;
                                                            arrayList2 = arrayList4;
                                                            enumSerializer2 = enumSerializer;
                                                            _acceptjsonformatvisitor2 = _acceptjsonformatvisitor;
                                                            arrayList11 = arrayList3;
                                                            i2 = i;
                                                            str6 = str2;
                                                            j12 = j;
                                                            readVar3 = readVar;
                                                            arrayList10 = arrayList;
                                                            strIconCompatParcelizer2 = str4;
                                                            zRemoteActionCompatParcelizer = z;
                                                            str7 = str3;
                                                            arrayList12 = arrayList2;
                                                        }
                                                    } else {
                                                        readVar = readVar3;
                                                        ArrayList arrayList14 = arrayList10;
                                                        j = j12;
                                                        arrayList3 = arrayList5;
                                                        if (strRemoteActionCompatParcelizer2.startsWith("#EXT-X-PART")) {
                                                            String strRemoteActionCompatParcelizer6 = RemoteActionCompatParcelizer(j, strWrite, str3);
                                                            String strWrite6 = write(strRemoteActionCompatParcelizer2, MediaSessionCompatToken, map);
                                                            long j15 = (long) (read(strRemoteActionCompatParcelizer2, IconCompatParcelizer) * 1000000.0d);
                                                            boolean zRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer2, onPlay);
                                                            if (z5 && arrayList4.isEmpty()) {
                                                                i = i2;
                                                                z2 = true;
                                                            } else {
                                                                i = i2;
                                                                z2 = false;
                                                            }
                                                            boolean zRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer2, onAddQueueItem);
                                                            String strRemoteActionCompatParcelizer7 = RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer2, write, map);
                                                            if (strRemoteActionCompatParcelizer7 != null) {
                                                                String[] strArrAudioAttributesCompatParcelizer3 = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer7, "@");
                                                                j2 = Long.parseLong(strArrAudioAttributesCompatParcelizer3[0]);
                                                                if (strArrAudioAttributesCompatParcelizer3.length > 1) {
                                                                    j10 = Long.parseLong(strArrAudioAttributesCompatParcelizer3[1]);
                                                                }
                                                            } else {
                                                                j2 = -1;
                                                            }
                                                            if (j2 == -1) {
                                                                j10 = 0;
                                                            }
                                                            if (obj != null || treeMap.isEmpty()) {
                                                                arrayList = arrayList14;
                                                            } else {
                                                                arrayList = arrayList14;
                                                                DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                DrmInitData drmInitData4 = new DrmInitData(str4, schemeDataArr2);
                                                                if (drmInitDataRemoteActionCompatParcelizer == null) {
                                                                    drmInitDataRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str4, schemeDataArr2);
                                                                }
                                                                obj = drmInitData4;
                                                            }
                                                            arrayList4.add(new _acceptJsonFormatVisitor.read(strWrite6, writeVar2, j15, i4, j9, obj, strWrite, strRemoteActionCompatParcelizer6, j10, j2, zRemoteActionCompatParcelizer3, zRemoteActionCompatParcelizer2 | z2, false));
                                                            j9 += j15;
                                                            if (j2 != -1) {
                                                                j10 += j2;
                                                            }
                                                            j3 = j;
                                                            arrayList6 = arrayList4;
                                                        } else {
                                                            i = i2;
                                                            arrayList = arrayList14;
                                                            arrayList2 = arrayList4;
                                                            if (strRemoteActionCompatParcelizer2.startsWith("#")) {
                                                                enumSerializer2 = enumSerializer;
                                                                _acceptjsonformatvisitor2 = _acceptjsonformatvisitor;
                                                                arrayList11 = arrayList3;
                                                                i2 = i;
                                                                str6 = str2;
                                                                j12 = j;
                                                                readVar3 = readVar;
                                                                arrayList10 = arrayList;
                                                                strIconCompatParcelizer2 = str4;
                                                                zRemoteActionCompatParcelizer = z;
                                                                str7 = str3;
                                                                arrayList12 = arrayList2;
                                                            } else {
                                                                String strRemoteActionCompatParcelizer8 = RemoteActionCompatParcelizer(j, strWrite, str3);
                                                                long j16 = j + 1;
                                                                String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer2, map);
                                                                _acceptJsonFormatVisitor.write writeVar4 = (_acceptJsonFormatVisitor.write) map2.get(strAudioAttributesCompatParcelizer);
                                                                if (j5 == -1) {
                                                                    j4 = 0;
                                                                } else {
                                                                    if (z9 && writeVar2 == null && writeVar4 == null) {
                                                                        writeVar4 = new _acceptJsonFormatVisitor.write(strAudioAttributesCompatParcelizer, 0L, j8, null, null);
                                                                        map2.put(strAudioAttributesCompatParcelizer, writeVar4);
                                                                    }
                                                                    j4 = j8;
                                                                }
                                                                if (obj != null || treeMap.isEmpty()) {
                                                                    j3 = j16;
                                                                    z3 = false;
                                                                    drmInitData = obj;
                                                                } else {
                                                                    j3 = j16;
                                                                    z3 = false;
                                                                    DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                    drmInitData = new DrmInitData(str4, schemeDataArr3);
                                                                    if (drmInitDataRemoteActionCompatParcelizer == null) {
                                                                        drmInitDataRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str4, schemeDataArr3);
                                                                    }
                                                                }
                                                                arrayList8.add(new _acceptJsonFormatVisitor.write(strAudioAttributesCompatParcelizer, writeVar2 == null ? writeVar4 : writeVar2, strIconCompatParcelizer, jAudioAttributesImplApi21Parcelizer, i4, j11, drmInitData, strWrite, strRemoteActionCompatParcelizer8, j4, j5, z8, arrayList2));
                                                                j11 += jAudioAttributesImplApi21Parcelizer;
                                                                arrayList6 = new ArrayList();
                                                                if (j5 != -1) {
                                                                    j4 += j5;
                                                                }
                                                                obj = drmInitData;
                                                                z8 = z3;
                                                                j5 = -1;
                                                                j8 = j4;
                                                                j9 = j11;
                                                                strIconCompatParcelizer = str2;
                                                                jAudioAttributesImplApi21Parcelizer = 0;
                                                            }
                                                        }
                                                        _acceptjsonformatvisitor2 = _acceptjsonformatvisitor;
                                                        readVar3 = readVar;
                                                        arrayList11 = arrayList3;
                                                        i2 = i;
                                                        str6 = str2;
                                                        arrayList10 = arrayList;
                                                        strIconCompatParcelizer2 = str4;
                                                        j12 = j3;
                                                        zRemoteActionCompatParcelizer = z;
                                                        str7 = str3;
                                                        arrayList12 = arrayList6;
                                                        enumSerializer2 = enumSerializer;
                                                    }
                                                    readVar = readVar3;
                                                    arrayList = arrayList10;
                                                    j = j12;
                                                }
                                                str7 = str3;
                                            }
                                            strIconCompatParcelizer2 = str4;
                                        }
                                    }
                                    enumSerializer2 = enumSerializer;
                                    _acceptjsonformatvisitor2 = _acceptjsonformatvisitor;
                                    arrayList11 = arrayList5;
                                    zRemoteActionCompatParcelizer = z;
                                    str6 = str2;
                                    str7 = str3;
                                }
                                i = i2;
                                arrayList3 = arrayList5;
                                arrayList2 = arrayList4;
                                enumSerializer2 = enumSerializer;
                                _acceptjsonformatvisitor2 = _acceptjsonformatvisitor;
                                arrayList11 = arrayList3;
                                i2 = i;
                                str6 = str2;
                                j12 = j;
                                readVar3 = readVar;
                                arrayList10 = arrayList;
                                strIconCompatParcelizer2 = str4;
                                zRemoteActionCompatParcelizer = z;
                                str7 = str3;
                                arrayList12 = arrayList2;
                            }
                            arrayList11 = arrayList5;
                            zRemoteActionCompatParcelizer = z;
                            str7 = str3;
                        }
                        arrayList12 = arrayList4;
                    }
                }
                arrayList11 = arrayList5;
                arrayList12 = arrayList4;
            }
        }
        int i9 = i2;
        _acceptJsonFormatVisitor.read readVar5 = readVar3;
        ArrayList arrayList15 = arrayList10;
        ArrayList arrayList16 = arrayList12;
        ArrayList arrayList17 = arrayList11;
        boolean z10 = zRemoteActionCompatParcelizer;
        HashMap map3 = new HashMap();
        int i10 = 0;
        while (i10 < arrayList15.size()) {
            ArrayList arrayList18 = arrayList15;
            _acceptJsonFormatVisitor.IconCompatParcelizer iconCompatParcelizer = (_acceptJsonFormatVisitor.IconCompatParcelizer) arrayList18.get(i10);
            long size = iconCompatParcelizer.RemoteActionCompatParcelizer;
            if (size == -1) {
                size = (jWrite + ((long) arrayList8.size())) - (arrayList16.isEmpty() ? 1L : 0L);
            }
            int size2 = iconCompatParcelizer.IconCompatParcelizer;
            if (size2 == -1 && j7 != C.TIME_UNSET) {
                size2 = (arrayList16.isEmpty() ? ((_acceptJsonFormatVisitor.write) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(arrayList8)).RemoteActionCompatParcelizer : arrayList16).size() - 1;
            }
            map3.put(iconCompatParcelizer.read, new _acceptJsonFormatVisitor.IconCompatParcelizer(iconCompatParcelizer.read, size, size2));
            i10++;
            arrayList15 = arrayList18;
        }
        if (readVar5 != null) {
            arrayList16.add(readVar5);
        }
        return new _acceptJsonFormatVisitor(i9, str, arrayList17, j6, z10, jIconCompatParcelizer, z6, i3, jWrite, iAudioAttributesCompatParcelizer, jAudioAttributesCompatParcelizer, j7, z5, z7, jIconCompatParcelizer != 0, drmInitDataRemoteActionCompatParcelizer, arrayList8, arrayList16, AudioAttributesCompatParcelizer2, map3);
    }

    private static DrmInitData RemoteActionCompatParcelizer(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            schemeDataArr2[i] = schemeDataArr[i].IconCompatParcelizer(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    private static String RemoteActionCompatParcelizer(long j, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int RemoteActionCompatParcelizer(String str) {
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        ?? r0 = zRemoteActionCompatParcelizer;
        if (RemoteActionCompatParcelizer(str, onCommand)) {
            r0 = (zRemoteActionCompatParcelizer ? 1 : 0) | 2;
        }
        return RemoteActionCompatParcelizer(str, AudioAttributesCompatParcelizer) ? r0 | 4 : r0;
    }

    private static int write(String str, Map<String, String> map) {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, RatingCompat, map);
        if (TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
            return 0;
        }
        String[] strArrAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, ",");
        int i = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(strArrAudioAttributesCompatParcelizer, "public.accessibility.describes-video") ? 512 : 0;
        if (LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(strArrAudioAttributesCompatParcelizer, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(strArrAudioAttributesCompatParcelizer, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(strArrAudioAttributesCompatParcelizer, "public.easy-to-read") ? i | 8192 : i;
    }

    private static DrmInitData.SchemeData write(String str, String str2, Map<String, String> map) throws SchemaAware {
        String strIconCompatParcelizer = IconCompatParcelizer(str, onPrepare, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strWrite = write(str, MediaSessionCompatToken, map);
            return new DrmInitData.SchemeData(JsonMapFormatVisitor.IconCompatParcelizer, MimeTypes.VIDEO_MP4, Base64.decode(strWrite.substring(strWrite.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(JsonMapFormatVisitor.IconCompatParcelizer, "hls", LaissezFaireSubTypeValidator.IconCompatParcelizer(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strIconCompatParcelizer)) {
            return null;
        }
        String strWrite2 = write(str, MediaSessionCompatToken, map);
        return new DrmInitData.SchemeData(JsonMapFormatVisitor.RemoteActionCompatParcelizer, MimeTypes.VIDEO_MP4, appendCompletedChunk.write(JsonMapFormatVisitor.RemoteActionCompatParcelizer, Base64.decode(strWrite2.substring(strWrite2.indexOf(44)), 0)));
    }

    private static _acceptJsonFormatVisitor.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(String str) {
        double dIconCompatParcelizer = IconCompatParcelizer(str, MediaBrowserCompatSearchResultReceiver);
        long j = C.TIME_UNSET;
        long j2 = dIconCompatParcelizer == -9.223372036854776E18d ? -9223372036854775807L : (long) (dIconCompatParcelizer * 1000000.0d);
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, MediaBrowserCompatMediaItem);
        double dIconCompatParcelizer2 = IconCompatParcelizer(str, onMediaButtonEvent);
        long j3 = dIconCompatParcelizer2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dIconCompatParcelizer2 * 1000000.0d);
        double dIconCompatParcelizer3 = IconCompatParcelizer(str, onSetPlaybackSpeed);
        if (dIconCompatParcelizer3 != -9.223372036854776E18d) {
            j = (long) (dIconCompatParcelizer3 * 1000000.0d);
        }
        return new _acceptJsonFormatVisitor.AudioAttributesCompatParcelizer(j2, zRemoteActionCompatParcelizer, j3, j, RemoteActionCompatParcelizer(str, MediaBrowserCompatItemReceiver));
    }

    private static String IconCompatParcelizer(String str) {
        if ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) {
            return C.CENC_TYPE_cenc;
        }
        return C.CENC_TYPE_cbcs;
    }

    private static int AudioAttributesCompatParcelizer(String str, Pattern pattern) throws SchemaAware {
        return Integer.parseInt(write(str, pattern, (Map<String, String>) Collections.emptyMap()));
    }

    private static int AudioAttributesImplApi26Parcelizer(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1)));
        }
        return -1;
    }

    private static long write(String str, Pattern pattern) throws SchemaAware {
        return Long.parseLong(write(str, pattern, (Map<String, String>) Collections.emptyMap()));
    }

    private static long MediaBrowserCompatCustomActionResultReceiver(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Long.parseLong((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1)));
        }
        return -1L;
    }

    private static long AudioAttributesImplApi21Parcelizer(String str, Pattern pattern) throws SchemaAware {
        return new BigDecimal(write(str, pattern, (Map<String, String>) Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static double read(String str, Pattern pattern) throws SchemaAware {
        return Double.parseDouble(write(str, pattern, (Map<String, String>) Collections.emptyMap()));
    }

    private static String write(String str, Pattern pattern, Map<String, String> map) throws SchemaAware {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, pattern, map);
        if (strRemoteActionCompatParcelizer != null) {
            return strRemoteActionCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder("Couldn't match ");
        sb.append(pattern.pattern());
        sb.append(" in ");
        sb.append(str);
        throw SchemaAware.AudioAttributesCompatParcelizer(sb.toString(), null);
    }

    private static String RemoteActionCompatParcelizer(String str, Pattern pattern, Map<String, String> map) {
        return IconCompatParcelizer(str, pattern, null, map);
    }

    private static String IconCompatParcelizer(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : AudioAttributesCompatParcelizer(str2, map);
    }

    private static double IconCompatParcelizer(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Double.parseDouble((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1)));
        }
        return -9.223372036854776E18d;
    }

    private static String AudioAttributesCompatParcelizer(String str, Map<String, String> map) {
        Matcher matcher = PlaybackStateCompat.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static boolean RemoteActionCompatParcelizer(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    private static Pattern read(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("=(NO|YES)");
        return Pattern.compile(sb.toString());
    }

    static class AudioAttributesCompatParcelizer {
        private final BufferedReader AudioAttributesCompatParcelizer;
        private final Queue<String> RemoteActionCompatParcelizer;
        private String read;

        public AudioAttributesCompatParcelizer(Queue<String> queue, BufferedReader bufferedReader) {
            this.RemoteActionCompatParcelizer = queue;
            this.AudioAttributesCompatParcelizer = bufferedReader;
        }

        public final boolean AudioAttributesCompatParcelizer() throws IOException {
            String strTrim;
            if (this.read != null) {
                return true;
            }
            if (!this.RemoteActionCompatParcelizer.isEmpty()) {
                this.read = (String) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.poll());
                return true;
            }
            do {
                String line = this.AudioAttributesCompatParcelizer.readLine();
                this.read = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.read = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public final String RemoteActionCompatParcelizer() throws IOException {
            if (AudioAttributesCompatParcelizer()) {
                String str = this.read;
                this.read = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }
}
