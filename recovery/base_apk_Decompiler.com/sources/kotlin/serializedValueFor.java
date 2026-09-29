package kotlin;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.isCollectionMapOrArray;
import kotlin.nonNullString;
import kotlin.withTimeZone;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class serializedValueFor implements findConstructor {
    private static final byte[] AudioAttributesCompatParcelizer;
    private static final byte[] IconCompatParcelizer;
    private static final UUID MediaBrowserCompatCustomActionResultReceiver;
    private static final Map<String, Integer> RemoteActionCompatParcelizer;
    private static final byte[] read;
    private static final byte[] write;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private long MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int[] MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private long MediaSessionCompatQueueItem;
    private final AsPropertyTypeDeserializer MediaSessionCompatResultReceiverWrapper;
    private int MediaSessionCompatToken;
    private boolean ParcelableVolumeInfo;
    private final boolean PlaybackStateCompat;
    private long PlaybackStateCompatCustomAction;
    private int RatingCompat;
    private boolean ResultReceiver;
    private final AsPropertyTypeDeserializer _init_lambda2;
    private final withTimeZone.IconCompatParcelizer _init_lambda3;
    private final buildCheckerIfNeeded _init_lambda5;
    private final AsPropertyTypeDeserializer accessaddObserverForBackInvoker;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private long onAddQueueItem;
    private AsDeductionTypeDeserializer onCommand;
    private int onCustomAction;
    private read onFastForward;
    private long onMediaButtonEvent;
    private AsDeductionTypeDeserializer onPause;
    private long onPlay;
    private long onPlayFromMediaId;
    private ByteBuffer onPlayFromSearch;
    private final AsPropertyTypeDeserializer onPlayFromUri;
    private findRawSuperTypes onPrepare;
    private final AsPropertyTypeDeserializer onPrepareFromMediaId;
    private boolean onPrepareFromSearch;
    private final boolean onPrepareFromUri;
    private final AsPropertyTypeDeserializer onRemoveQueueItem;
    private final ExceptionUtil onRemoveQueueItemAt;
    private final AsPropertyTypeDeserializer onRewind;
    private int onSeekTo;
    private int onSetCaptioningEnabled;
    private int onSetPlaybackSpeed;
    private boolean onSetRating;
    private int onSetRepeatMode;
    private boolean onSetShuffleMode;
    private boolean onSkipToNext;
    private boolean onSkipToPrevious;
    private final AsPropertyTypeDeserializer onSkipToQueueItem;
    private final AsPropertyTypeDeserializer onStop;
    private long r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private boolean r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private long r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private final AsPropertyTypeDeserializer r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private final SparseArray<read> r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    private byte setSessionImpl;

    protected static int AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
            case 136:
            case TarConstants.PREFIXLEN /* 155 */:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case TarArchiveEntry.DEFAULT_DIR_MODE /* 16877 */:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected static boolean write(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    static {
        new getClassDescription() { // from class: o.EnumValues
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return serializedValueFor.MediaBrowserCompatCustomActionResultReceiver();
            }
        };
        write = new byte[]{TarConstants.LF_LINK, 10, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 58, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 58, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 44, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 32, 45, 45, 62, 32, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 58, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 58, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 44, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 10};
        AudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        read = new byte[]{68, 105, 97, 108, 111, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 117, 101, 58, 32, TarConstants.LF_NORMAL, 58, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 58, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 58, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 44, TarConstants.LF_NORMAL, 58, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 58, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 58, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 44};
        IconCompatParcelizer = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 58, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 58, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 46, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 32, 45, 45, 62, 32, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 58, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 58, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 46, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 10};
        MediaBrowserCompatCustomActionResultReceiver = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        RemoteActionCompatParcelizer = Collections.unmodifiableMap(map);
    }

    static /* synthetic */ findConstructor[] MediaBrowserCompatCustomActionResultReceiver() {
        return new findConstructor[]{new serializedValueFor(withTimeZone.IconCompatParcelizer.AudioAttributesCompatParcelizer, 2)};
    }

    @Deprecated
    public serializedValueFor() {
        this(new isFromIntValue(), 2, withTimeZone.IconCompatParcelizer.AudioAttributesCompatParcelizer);
    }

    public serializedValueFor(withTimeZone.IconCompatParcelizer iconCompatParcelizer, int i) {
        this(new isFromIntValue(), i, iconCompatParcelizer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private serializedValueFor(ExceptionUtil exceptionUtil, int i, withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = -1L;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = C.TIME_UNSET;
        this.onPlayFromMediaId = C.TIME_UNSET;
        this.onMediaButtonEvent = C.TIME_UNSET;
        this.onPlay = -1L;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = -1L;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = C.TIME_UNSET;
        this.onRemoveQueueItemAt = exceptionUtil;
        exceptionUtil.RemoteActionCompatParcelizer(new RemoteActionCompatParcelizer(this, 0 == true ? 1 : 0));
        this._init_lambda3 = iconCompatParcelizer;
        this.PlaybackStateCompat = (i & 1) == 0;
        this.onPrepareFromUri = (i & 2) == 0;
        this._init_lambda5 = new buildCheckerIfNeeded();
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = new SparseArray<>();
        this.onSkipToQueueItem = new AsPropertyTypeDeserializer(4);
        this.accessaddObserverForBackInvoker = new AsPropertyTypeDeserializer(ByteBuffer.allocate(4).putInt(-1).array());
        this.MediaSessionCompatResultReceiverWrapper = new AsPropertyTypeDeserializer(4);
        this.onRewind = new AsPropertyTypeDeserializer(noTypeInfoBuilder.AudioAttributesCompatParcelizer);
        this.onRemoveQueueItem = new AsPropertyTypeDeserializer(4);
        this.onStop = new AsPropertyTypeDeserializer();
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = new AsPropertyTypeDeserializer();
        this.onPlayFromUri = new AsPropertyTypeDeserializer(8);
        this.onPrepareFromMediaId = new AsPropertyTypeDeserializer();
        this._init_lambda2 = new AsPropertyTypeDeserializer();
        this.MediaDescriptionCompat = new int[1];
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        return new constructFromName().read(closeonfailandthrowasioe);
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.onPrepare = findrawsupertypes;
        if (this.onPrepareFromUri) {
            findrawsupertypes = new _appendNativeIds(findrawsupertypes, this._init_lambda3);
        }
        this.onPrepare = findrawsupertypes;
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = C.TIME_UNSET;
        this.RatingCompat = 0;
        this.onRemoveQueueItemAt.write();
        this._init_lambda5.AudioAttributesCompatParcelizer();
        MediaBrowserCompatItemReceiver();
        for (int i = 0; i < this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.size(); i++) {
            this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.valueAt(i).read();
        }
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        this.onPrepareFromSearch = false;
        boolean z = true;
        while (z && !this.onPrepareFromSearch) {
            z = this.onRemoveQueueItemAt.read(closeonfailandthrowasioe);
            if (z && RemoteActionCompatParcelizer(isjacksonstdimpl, closeonfailandthrowasioe.IconCompatParcelizer())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.size(); i++) {
            this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.valueAt(i).RemoteActionCompatParcelizer();
        }
        return -1;
    }

    protected final void RemoteActionCompatParcelizer(int i, long j, long j2) throws SchemaAware {
        AudioAttributesImplApi21Parcelizer();
        if (i == 160) {
            this.MediaBrowserCompatMediaItem = false;
            this.MediaBrowserCompatItemReceiver = 0L;
            return;
        }
        if (i == 174) {
            this.onFastForward = new read();
            return;
        }
        if (i == 187) {
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = false;
            return;
        }
        if (i == 19899) {
            this.MediaSessionCompatToken = -1;
            this.MediaSessionCompatQueueItem = -1L;
            return;
        }
        if (i == 20533) {
            MediaBrowserCompatItemReceiver(i).onCustomAction = true;
            return;
        }
        if (i == 21968) {
            MediaBrowserCompatItemReceiver(i).handleMediaPlayPauseIfPendingOnHandler = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (j3 != -1 && j3 != j) {
                throw SchemaAware.RemoteActionCompatParcelizer("Multiple Segment elements not supported", null);
            }
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = j;
            this.PlaybackStateCompatCustomAction = j2;
            return;
        }
        if (i == 475249515) {
            this.onPause = new AsDeductionTypeDeserializer();
            this.onCommand = new AsDeductionTypeDeserializer();
        } else {
            if (i != 524531317 || this.ResultReceiver) {
                return;
            }
            if (this.PlaybackStateCompat && this.onPlay != -1) {
                this.ParcelableVolumeInfo = true;
            } else {
                this.onPrepare.read(new isCollectionMapOrArray.write(this.onMediaButtonEvent));
                this.ResultReceiver = true;
            }
        }
    }

    protected final void RemoteActionCompatParcelizer(int i) throws SchemaAware {
        AudioAttributesImplApi21Parcelizer();
        if (i == 160) {
            if (this.RatingCompat != 2) {
                return;
            }
            read readVar = this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.get(this.onCustomAction);
            if (this.MediaBrowserCompatItemReceiver > 0 && "A_OPUS".equals(readVar.read)) {
                this._init_lambda2.AudioAttributesCompatParcelizer(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.MediaBrowserCompatItemReceiver).array());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.MediaBrowserCompatSearchResultReceiver; i3++) {
                i2 += this.MediaDescriptionCompat[i3];
            }
            int i4 = 0;
            while (i4 < this.MediaBrowserCompatSearchResultReceiver) {
                long j = this.onAddQueueItem;
                long j2 = (readVar.RatingCompat * i4) / 1000;
                int i5 = this.AudioAttributesImplApi26Parcelizer;
                if (i4 == 0 && !this.MediaBrowserCompatMediaItem) {
                    i5 |= 1;
                }
                int i6 = this.MediaDescriptionCompat[i4];
                int i7 = i2 - i6;
                read(readVar, j + j2, i5, i6, i7);
                i4++;
                i2 = i7;
            }
            this.RatingCompat = 0;
            return;
        }
        if (i == 174) {
            read readVar2 = (read) buildTypeSerializer.AudioAttributesCompatParcelizer(this.onFastForward);
            if (readVar2.read == null) {
                throw SchemaAware.RemoteActionCompatParcelizer("CodecId is missing in TrackEntry element", null);
            }
            if (write(readVar2.read)) {
                readVar2.AudioAttributesCompatParcelizer(this.onPrepare, readVar2.onPrepare);
                this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.put(readVar2.onPrepare, readVar2);
            }
            this.onFastForward = null;
            return;
        }
        if (i == 19899) {
            int i8 = this.MediaSessionCompatToken;
            if (i8 != -1) {
                long j3 = this.MediaSessionCompatQueueItem;
                if (j3 != -1) {
                    if (i8 == 475249515) {
                        this.onPlay = j3;
                        return;
                    }
                    return;
                }
            }
            throw SchemaAware.RemoteActionCompatParcelizer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            IconCompatParcelizer(i);
            if (this.onFastForward.onCustomAction) {
                if (this.onFastForward.AudioAttributesImplBaseParcelizer == null) {
                    throw SchemaAware.RemoteActionCompatParcelizer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                this.onFastForward.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new DrmInitData(new DrmInitData.SchemeData(JsonMapFormatVisitor.read, MimeTypes.VIDEO_WEBM, this.onFastForward.AudioAttributesImplBaseParcelizer.read));
                return;
            }
            return;
        }
        if (i == 28032) {
            IconCompatParcelizer(i);
            if (this.onFastForward.onCustomAction && this.onFastForward.onStop != null) {
                throw SchemaAware.RemoteActionCompatParcelizer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 == C.TIME_UNSET) {
                this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = 1000000L;
            }
            long j4 = this.onPlayFromMediaId;
            if (j4 != C.TIME_UNSET) {
                this.onMediaButtonEvent = read(j4);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.size() == 0) {
                throw SchemaAware.RemoteActionCompatParcelizer("No valid tracks were found", null);
            }
            this.onPrepare.RemoteActionCompatParcelizer();
        } else if (i == 475249515) {
            if (!this.ResultReceiver) {
                this.onPrepare.read(read(this.onPause, this.onCommand));
                this.ResultReceiver = true;
            }
            this.onPause = null;
            this.onCommand = null;
        }
    }

    protected final void AudioAttributesCompatParcelizer(int i, long j) throws SchemaAware {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw SchemaAware.RemoteActionCompatParcelizer(sb2.toString(), null);
        }
        switch (i) {
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
                MediaBrowserCompatItemReceiver(i).MediaSessionCompatQueueItem = (int) j;
                return;
            case 136:
                MediaBrowserCompatItemReceiver(i).onCommand = j == 1;
                return;
            case TarConstants.PREFIXLEN /* 155 */:
                this.AudioAttributesImplBaseParcelizer = read(j);
                return;
            case 159:
                MediaBrowserCompatItemReceiver(i).IconCompatParcelizer = (int) j;
                return;
            case 176:
                MediaBrowserCompatItemReceiver(i).MediaSessionCompatResultReceiverWrapper = (int) j;
                return;
            case 179:
                read(i);
                this.onPause.AudioAttributesCompatParcelizer(read(j));
                return;
            case 186:
                MediaBrowserCompatItemReceiver(i).onFastForward = (int) j;
                return;
            case 215:
                MediaBrowserCompatItemReceiver(i).onPrepare = (int) j;
                return;
            case 231:
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = read(j);
                return;
            case 238:
                this.AudioAttributesImplApi21Parcelizer = (int) j;
                return;
            case 241:
                if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) {
                    return;
                }
                read(i);
                this.onCommand.AudioAttributesCompatParcelizer(j);
                this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = true;
                return;
            case 251:
                this.MediaBrowserCompatMediaItem = true;
                return;
            case 16871:
                MediaBrowserCompatItemReceiver(i).r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw SchemaAware.RemoteActionCompatParcelizer(sb3.toString(), null);
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw SchemaAware.RemoteActionCompatParcelizer(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw SchemaAware.RemoteActionCompatParcelizer(sb5.toString(), null);
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw SchemaAware.RemoteActionCompatParcelizer(sb6.toString(), null);
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw SchemaAware.RemoteActionCompatParcelizer(sb7.toString(), null);
            case 21420:
                this.MediaSessionCompatQueueItem = j + this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                return;
            case 21432:
                int i2 = (int) j;
                IconCompatParcelizer(i);
                if (i2 == 0) {
                    this.onFastForward.onSkipToPrevious = 0;
                    return;
                }
                if (i2 == 1) {
                    this.onFastForward.onSkipToPrevious = 2;
                    return;
                } else if (i2 == 3) {
                    this.onFastForward.onSkipToPrevious = 1;
                    return;
                } else {
                    if (i2 == 15) {
                        this.onFastForward.onSkipToPrevious = 3;
                        return;
                    }
                    return;
                }
            case 21680:
                MediaBrowserCompatItemReceiver(i).MediaBrowserCompatSearchResultReceiver = (int) j;
                return;
            case 21682:
                MediaBrowserCompatItemReceiver(i).MediaBrowserCompatMediaItem = (int) j;
                return;
            case 21690:
                MediaBrowserCompatItemReceiver(i).MediaMetadataCompat = (int) j;
                return;
            case 21930:
                MediaBrowserCompatItemReceiver(i).onAddQueueItem = j == 1;
                return;
            case 21938:
                IconCompatParcelizer(i);
                this.onFastForward.handleMediaPlayPauseIfPendingOnHandler = true;
                this.onFastForward.RemoteActionCompatParcelizer = (int) j;
                return;
            case 21998:
                MediaBrowserCompatItemReceiver(i).onPause = (int) j;
                return;
            case 22186:
                MediaBrowserCompatItemReceiver(i).AudioAttributesCompatParcelizer = j;
                return;
            case 22203:
                MediaBrowserCompatItemReceiver(i).onSkipToNext = j;
                return;
            case 25188:
                MediaBrowserCompatItemReceiver(i).write = (int) j;
                return;
            case 30114:
                this.MediaBrowserCompatItemReceiver = j;
                return;
            case 30321:
                IconCompatParcelizer(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.onFastForward.onSkipToQueueItem = 0;
                    return;
                }
                if (i3 == 1) {
                    this.onFastForward.onSkipToQueueItem = 1;
                    return;
                } else if (i3 == 2) {
                    this.onFastForward.onSkipToQueueItem = 2;
                    return;
                } else {
                    if (i3 == 3) {
                        this.onFastForward.onSkipToQueueItem = 3;
                        return;
                    }
                    return;
                }
            case 2352003:
                MediaBrowserCompatItemReceiver(i).RatingCompat = (int) j;
                return;
            case 2807729:
                this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        IconCompatParcelizer(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.onFastForward.AudioAttributesImplApi21Parcelizer = 2;
                            return;
                        } else {
                            if (i4 == 2) {
                                this.onFastForward.AudioAttributesImplApi21Parcelizer = 1;
                                return;
                            }
                            return;
                        }
                    case 21946:
                        IconCompatParcelizer(i);
                        int iAudioAttributesCompatParcelizer = keyFormat.AudioAttributesCompatParcelizer((int) j);
                        if (iAudioAttributesCompatParcelizer != -1) {
                            this.onFastForward.AudioAttributesImplApi26Parcelizer = iAudioAttributesCompatParcelizer;
                            return;
                        }
                        return;
                    case 21947:
                        IconCompatParcelizer(i);
                        this.onFastForward.handleMediaPlayPauseIfPendingOnHandler = true;
                        int iWrite = keyFormat.write((int) j);
                        if (iWrite != -1) {
                            this.onFastForward.MediaBrowserCompatCustomActionResultReceiver = iWrite;
                            return;
                        }
                        return;
                    case 21948:
                        MediaBrowserCompatItemReceiver(i).onMediaButtonEvent = (int) j;
                        return;
                    case 21949:
                        MediaBrowserCompatItemReceiver(i).onPlayFromMediaId = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void write(int i, double d) throws SchemaAware {
        if (i == 181) {
            MediaBrowserCompatItemReceiver(i).setSessionImpl = (int) d;
            return;
        }
        if (i == 17545) {
            this.onPlayFromMediaId = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                MediaBrowserCompatItemReceiver(i).onRemoveQueueItem = (float) d;
                break;
            case 21970:
                MediaBrowserCompatItemReceiver(i).onSetCaptioningEnabled = (float) d;
                break;
            case 21971:
                MediaBrowserCompatItemReceiver(i).onPrepareFromUri = (float) d;
                break;
            case 21972:
                MediaBrowserCompatItemReceiver(i).onRewind = (float) d;
                break;
            case 21973:
                MediaBrowserCompatItemReceiver(i).onSeekTo = (float) d;
                break;
            case 21974:
                MediaBrowserCompatItemReceiver(i).onRemoveQueueItemAt = (float) d;
                break;
            case 21975:
                MediaBrowserCompatItemReceiver(i).ParcelableVolumeInfo = (float) d;
                break;
            case 21976:
                MediaBrowserCompatItemReceiver(i).MediaSessionCompatToken = (float) d;
                break;
            case 21977:
                MediaBrowserCompatItemReceiver(i).onPlay = (float) d;
                break;
            case 21978:
                MediaBrowserCompatItemReceiver(i).onPrepareFromMediaId = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        MediaBrowserCompatItemReceiver(i).onSetPlaybackSpeed = (float) d;
                        break;
                    case 30324:
                        MediaBrowserCompatItemReceiver(i).onSetRepeatMode = (float) d;
                        break;
                    case 30325:
                        MediaBrowserCompatItemReceiver(i).onSetShuffleMode = (float) d;
                        break;
                }
                break;
        }
    }

    protected final void AudioAttributesCompatParcelizer(int i, String str) throws SchemaAware {
        if (i == 134) {
            MediaBrowserCompatItemReceiver(i).read = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                MediaBrowserCompatItemReceiver(i).onPrepareFromSearch = str;
                return;
            } else {
                if (i == 2274716) {
                    MediaBrowserCompatItemReceiver(i).ResultReceiver = str;
                    return;
                }
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
    }

    protected final void read(int i, int i2, closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        read readVar;
        int i3;
        read readVar2;
        read readVar3;
        long j;
        int i4;
        int i5;
        int i6;
        Throwable th = null;
        int i7 = 1;
        int i8 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.RatingCompat == 2) {
                    RemoteActionCompatParcelizer(this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.get(this.onCustomAction), this.AudioAttributesImplApi21Parcelizer, closeonfailandthrowasioe, i2);
                    return;
                }
                return;
            }
            if (i == 16877) {
                read(MediaBrowserCompatItemReceiver(i), closeonfailandthrowasioe, i2);
                return;
            }
            if (i == 16981) {
                IconCompatParcelizer(i);
                this.onFastForward.onStop = new byte[i2];
                closeonfailandthrowasioe.IconCompatParcelizer(this.onFastForward.onStop, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr = new byte[i2];
                closeonfailandthrowasioe.IconCompatParcelizer(bArr, 0, i2);
                MediaBrowserCompatItemReceiver(i).AudioAttributesImplBaseParcelizer = new nonNullString.AudioAttributesCompatParcelizer(1, bArr, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(), (byte) 0);
                closeonfailandthrowasioe.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(), 4 - i2, i2);
                this.MediaSessionCompatResultReceiverWrapper.MediaBrowserCompatCustomActionResultReceiver(0);
                this.MediaSessionCompatToken = (int) this.MediaSessionCompatResultReceiverWrapper.onMediaButtonEvent();
                return;
            }
            if (i == 25506) {
                IconCompatParcelizer(i);
                this.onFastForward.MediaBrowserCompatItemReceiver = new byte[i2];
                closeonfailandthrowasioe.IconCompatParcelizer(this.onFastForward.MediaBrowserCompatItemReceiver, 0, i2);
                return;
            } else {
                if (i == 30322) {
                    IconCompatParcelizer(i);
                    this.onFastForward.onSetRating = new byte[i2];
                    closeonfailandthrowasioe.IconCompatParcelizer(this.onFastForward.onSetRating, 0, i2);
                    return;
                }
                throw SchemaAware.RemoteActionCompatParcelizer("Unexpected id: ".concat(String.valueOf(i)), null);
            }
        }
        if (this.RatingCompat == 0) {
            this.onCustomAction = (int) this._init_lambda5.write(closeonfailandthrowasioe, false, true, 8);
            this.handleMediaPlayPauseIfPendingOnHandler = this._init_lambda5.RemoteActionCompatParcelizer();
            this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
            this.RatingCompat = 1;
            this.onSkipToQueueItem.write(0);
        }
        read readVar4 = this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.get(this.onCustomAction);
        if (readVar4 == null) {
            closeonfailandthrowasioe.IconCompatParcelizer(i2 - this.handleMediaPlayPauseIfPendingOnHandler);
            this.RatingCompat = 0;
            return;
        }
        if (this.RatingCompat == 1) {
            RemoteActionCompatParcelizer(closeonfailandthrowasioe, 3);
            int i9 = (this.onSkipToQueueItem.RemoteActionCompatParcelizer()[2] & 6) >> 1;
            if (i9 == 0) {
                this.MediaBrowserCompatSearchResultReceiver = 1;
                int[] iArrIconCompatParcelizer = IconCompatParcelizer(this.MediaDescriptionCompat, 1);
                this.MediaDescriptionCompat = iArrIconCompatParcelizer;
                iArrIconCompatParcelizer[0] = (i2 - this.handleMediaPlayPauseIfPendingOnHandler) - 3;
            } else {
                int i10 = 4;
                RemoteActionCompatParcelizer(closeonfailandthrowasioe, 4);
                int i11 = (this.onSkipToQueueItem.RemoteActionCompatParcelizer()[3] & 255) + 1;
                this.MediaBrowserCompatSearchResultReceiver = i11;
                int[] iArrIconCompatParcelizer2 = IconCompatParcelizer(this.MediaDescriptionCompat, i11);
                this.MediaDescriptionCompat = iArrIconCompatParcelizer2;
                if (i9 == 2) {
                    int i12 = this.handleMediaPlayPauseIfPendingOnHandler;
                    int i13 = this.MediaBrowserCompatSearchResultReceiver;
                    Arrays.fill(iArrIconCompatParcelizer2, 0, i13, ((i2 - i12) - 4) / i13);
                } else {
                    if (i9 != 1) {
                        if (i9 == 3) {
                            int i14 = 0;
                            int i15 = 0;
                            while (true) {
                                int i16 = this.MediaBrowserCompatSearchResultReceiver - i7;
                                if (i14 < i16) {
                                    this.MediaDescriptionCompat[i14] = i8;
                                    int i17 = i10 + 1;
                                    RemoteActionCompatParcelizer(closeonfailandthrowasioe, i17);
                                    if (this.onSkipToQueueItem.RemoteActionCompatParcelizer()[i10] == 0) {
                                        throw SchemaAware.RemoteActionCompatParcelizer("No valid varint length mask found", th);
                                    }
                                    int i18 = i8;
                                    while (true) {
                                        if (i18 >= 8) {
                                            readVar3 = readVar4;
                                            j = 0;
                                            i10 = i17;
                                            break;
                                        }
                                        int i19 = i7 << (7 - i18);
                                        if ((this.onSkipToQueueItem.RemoteActionCompatParcelizer()[i10] & i19) != 0) {
                                            int i20 = i17 + i18;
                                            RemoteActionCompatParcelizer(closeonfailandthrowasioe, i20);
                                            j = (~i19) & this.onSkipToQueueItem.RemoteActionCompatParcelizer()[i10] & 255;
                                            while (i17 < i20) {
                                                j = (j << 8) | ((long) (this.onSkipToQueueItem.RemoteActionCompatParcelizer()[i17] & 255));
                                                i17++;
                                                readVar4 = readVar4;
                                            }
                                            readVar3 = readVar4;
                                            if (i14 > 0) {
                                                j -= (1 << ((i18 * 7) + 6)) - 1;
                                            }
                                            i10 = i20;
                                        } else {
                                            i18++;
                                            i7 = 1;
                                        }
                                    }
                                    if (j < -2147483648L || j > 2147483647L) {
                                        break;
                                    }
                                    int i21 = (int) j;
                                    int[] iArr = this.MediaDescriptionCompat;
                                    if (i14 != 0) {
                                        i21 += iArr[i14 - 1];
                                    }
                                    iArr[i14] = i21;
                                    i15 += i21;
                                    i14++;
                                    readVar4 = readVar3;
                                    th = null;
                                    i7 = 1;
                                    i8 = 0;
                                } else {
                                    readVar2 = readVar4;
                                    this.MediaDescriptionCompat[i16] = ((i2 - this.handleMediaPlayPauseIfPendingOnHandler) - i10) - i15;
                                    break;
                                }
                            }
                            throw SchemaAware.RemoteActionCompatParcelizer("EBML lacing sample size out of range.", null);
                        }
                        throw SchemaAware.RemoteActionCompatParcelizer("Unexpected lacing value: ".concat(String.valueOf(i9)), null);
                    }
                    int i22 = 0;
                    int i23 = 0;
                    while (true) {
                        i4 = this.MediaBrowserCompatSearchResultReceiver - 1;
                        if (i22 >= i4) {
                            break;
                        }
                        this.MediaDescriptionCompat[i22] = 0;
                        while (true) {
                            i5 = i10 + 1;
                            RemoteActionCompatParcelizer(closeonfailandthrowasioe, i5);
                            int i24 = this.onSkipToQueueItem.RemoteActionCompatParcelizer()[i10] & 255;
                            int[] iArr2 = this.MediaDescriptionCompat;
                            i6 = iArr2[i22] + i24;
                            iArr2[i22] = i6;
                            if (i24 != 255) {
                                break;
                            } else {
                                i10 = i5;
                            }
                        }
                        i23 += i6;
                        i22++;
                        i10 = i5;
                    }
                    this.MediaDescriptionCompat[i4] = ((i2 - this.handleMediaPlayPauseIfPendingOnHandler) - i10) - i23;
                }
            }
            readVar2 = readVar4;
            this.onAddQueueItem = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + read((this.onSkipToQueueItem.RemoteActionCompatParcelizer()[0] << 8) | (this.onSkipToQueueItem.RemoteActionCompatParcelizer()[1] & 255));
            readVar = readVar2;
            this.AudioAttributesImplApi26Parcelizer = (readVar.MediaSessionCompatQueueItem == 2 || (i == 163 && (this.onSkipToQueueItem.RemoteActionCompatParcelizer()[2] & 128) == 128)) ? 1 : 0;
            this.RatingCompat = 2;
            this.MediaMetadataCompat = 0;
            i3 = 163;
        } else {
            readVar = readVar4;
            i3 = 163;
        }
        if (i == i3) {
            while (true) {
                int i25 = this.MediaMetadataCompat;
                if (i25 < this.MediaBrowserCompatSearchResultReceiver) {
                    read(readVar, ((long) ((this.MediaMetadataCompat * readVar.RatingCompat) / 1000)) + this.onAddQueueItem, this.AudioAttributesImplApi26Parcelizer, write(closeonfailandthrowasioe, readVar, this.MediaDescriptionCompat[i25], false), 0);
                    this.MediaMetadataCompat++;
                } else {
                    this.RatingCompat = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i26 = this.MediaMetadataCompat;
                if (i26 >= this.MediaBrowserCompatSearchResultReceiver) {
                    return;
                }
                int[] iArr3 = this.MediaDescriptionCompat;
                iArr3[i26] = write(closeonfailandthrowasioe, readVar, iArr3[i26], true);
                this.MediaMetadataCompat++;
            }
        }
    }

    private static void read(read readVar, closeOnFailAndThrowAsIOE closeonfailandthrowasioe, int i) throws IOException {
        if (readVar.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw == 1685485123 || readVar.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw == 1685480259) {
            readVar.MediaDescriptionCompat = new byte[i];
            closeonfailandthrowasioe.IconCompatParcelizer(readVar.MediaDescriptionCompat, 0, i);
        } else {
            closeonfailandthrowasioe.IconCompatParcelizer(i);
        }
    }

    private void RemoteActionCompatParcelizer(read readVar, int i, closeOnFailAndThrowAsIOE closeonfailandthrowasioe, int i2) throws IOException {
        if (i == 4 && "V_VP9".equals(readVar.read)) {
            this._init_lambda2.write(i2);
            closeonfailandthrowasioe.IconCompatParcelizer(this._init_lambda2.RemoteActionCompatParcelizer(), 0, i2);
        } else {
            closeonfailandthrowasioe.IconCompatParcelizer(i2);
        }
    }

    private void IconCompatParcelizer(int i) throws SchemaAware {
        if (this.onFastForward != null) {
            return;
        }
        StringBuilder sb = new StringBuilder("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
    }

    private void read(int i) throws SchemaAware {
        if (this.onPause == null || this.onCommand == null) {
            StringBuilder sb = new StringBuilder("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
        }
    }

    private read MediaBrowserCompatItemReceiver(int i) throws SchemaAware {
        IconCompatParcelizer(i);
        return this.onFastForward;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void read(o.serializedValueFor.read r13, long r14, int r16, int r17, int r18) {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            o.nameOf r2 = r1.PlaybackStateCompat
            r3 = 1
            if (r2 == 0) goto L19
            o.nameOf r4 = r1.PlaybackStateCompat
            o.nonNullString r5 = r1.onPlayFromSearch
            o.nonNullString$AudioAttributesCompatParcelizer r11 = r1.AudioAttributesImplBaseParcelizer
            r6 = r14
            r8 = r16
            r9 = r17
            r10 = r18
            r4.write(r5, r6, r8, r9, r10, r11)
            goto Lc4
        L19:
            java.lang.String r2 = "S_TEXT/UTF8"
            java.lang.String r4 = r1.read
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L37
            java.lang.String r2 = r1.read
            java.lang.String r4 = "S_TEXT/ASS"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L37
            java.lang.String r2 = r1.read
            java.lang.String r4 = "S_TEXT/WEBVTT"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L53
        L37:
            int r2 = r0.MediaBrowserCompatSearchResultReceiver
            java.lang.String r4 = "MatroskaExtractor"
            if (r2 <= r3) goto L43
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            kotlin.prune.RemoteActionCompatParcelizer(r4, r2)
            goto L53
        L43:
            long r5 = r0.AudioAttributesImplBaseParcelizer
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L56
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            kotlin.prune.RemoteActionCompatParcelizer(r4, r2)
        L53:
            r2 = r17
            goto L97
        L56:
            java.lang.String r2 = r1.read
            long r4 = r0.AudioAttributesImplBaseParcelizer
            o.AsPropertyTypeDeserializer r6 = r0.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8
            byte[] r6 = r6.RemoteActionCompatParcelizer()
            AudioAttributesCompatParcelizer(r2, r4, r6)
            o.AsPropertyTypeDeserializer r2 = r0.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8
            int r2 = r2.write()
        L69:
            o.AsPropertyTypeDeserializer r4 = r0.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8
            int r4 = r4.read()
            if (r2 >= r4) goto L84
            o.AsPropertyTypeDeserializer r4 = r0.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8
            byte[] r4 = r4.RemoteActionCompatParcelizer()
            r4 = r4[r2]
            if (r4 != 0) goto L81
            o.AsPropertyTypeDeserializer r4 = r0.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8
            r4.AudioAttributesCompatParcelizer(r2)
            goto L84
        L81:
            int r2 = r2 + 1
            goto L69
        L84:
            o.nonNullString r2 = r1.onPlayFromSearch
            o.AsPropertyTypeDeserializer r4 = r0.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8
            int r5 = r4.read()
            r2.RemoteActionCompatParcelizer(r4, r5)
            o.AsPropertyTypeDeserializer r2 = r0.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8
            int r2 = r2.read()
            int r2 = r17 + r2
        L97:
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r4 = r16 & r4
            if (r4 == 0) goto Lb7
            int r4 = r0.MediaBrowserCompatSearchResultReceiver
            if (r4 <= r3) goto La8
            o.AsPropertyTypeDeserializer r4 = r0._init_lambda2
            r5 = 0
            r4.write(r5)
            goto Lb7
        La8:
            o.AsPropertyTypeDeserializer r4 = r0._init_lambda2
            int r4 = r4.read()
            o.nonNullString r5 = r1.onPlayFromSearch
            o.AsPropertyTypeDeserializer r6 = r0._init_lambda2
            r7 = 2
            r5.IconCompatParcelizer(r6, r4, r7)
            int r2 = r2 + r4
        Lb7:
            r9 = r2
            o.nonNullString r5 = r1.onPlayFromSearch
            o.nonNullString$AudioAttributesCompatParcelizer r11 = r1.AudioAttributesImplBaseParcelizer
            r6 = r14
            r8 = r16
            r10 = r18
            r5.IconCompatParcelizer(r6, r8, r9, r10, r11)
        Lc4:
            r0.onPrepareFromSearch = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializedValueFor.read(o.serializedValueFor$read, long, int, int, int):void");
    }

    private void RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, int i) throws IOException {
        if (this.onSkipToQueueItem.read() >= i) {
            return;
        }
        if (this.onSkipToQueueItem.AudioAttributesCompatParcelizer() < i) {
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = this.onSkipToQueueItem;
            asPropertyTypeDeserializer.IconCompatParcelizer(Math.max(asPropertyTypeDeserializer.AudioAttributesCompatParcelizer() << 1, i));
        }
        closeonfailandthrowasioe.IconCompatParcelizer(this.onSkipToQueueItem.RemoteActionCompatParcelizer(), this.onSkipToQueueItem.read(), i - this.onSkipToQueueItem.read());
        this.onSkipToQueueItem.AudioAttributesCompatParcelizer(i);
    }

    private int write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, read readVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(readVar.read)) {
            read(closeonfailandthrowasioe, write, i);
            return AudioAttributesImplApi26Parcelizer();
        }
        if ("S_TEXT/ASS".equals(readVar.read)) {
            read(closeonfailandthrowasioe, read, i);
            return AudioAttributesImplApi26Parcelizer();
        }
        if ("S_TEXT/WEBVTT".equals(readVar.read)) {
            read(closeonfailandthrowasioe, IconCompatParcelizer, i);
            return AudioAttributesImplApi26Parcelizer();
        }
        nonNullString nonnullstring = readVar.onPlayFromSearch;
        if (!this.onSetRating) {
            if (readVar.onCustomAction) {
                this.AudioAttributesImplApi26Parcelizer &= -1073741825;
                if (!this.onSkipToNext) {
                    closeonfailandthrowasioe.IconCompatParcelizer(this.onSkipToQueueItem.RemoteActionCompatParcelizer(), 0, 1);
                    this.onSeekTo++;
                    if ((this.onSkipToQueueItem.RemoteActionCompatParcelizer()[0] & 128) == 128) {
                        throw SchemaAware.RemoteActionCompatParcelizer("Extension bit is set in signal byte", null);
                    }
                    this.setSessionImpl = this.onSkipToQueueItem.RemoteActionCompatParcelizer()[0];
                    this.onSkipToNext = true;
                }
                byte b = this.setSessionImpl;
                if ((b & 1) == 1) {
                    boolean z2 = (b & 2) == 2;
                    this.AudioAttributesImplApi26Parcelizer |= 1073741824;
                    if (!this.onSetShuffleMode) {
                        closeonfailandthrowasioe.IconCompatParcelizer(this.onPlayFromUri.RemoteActionCompatParcelizer(), 0, 8);
                        this.onSeekTo += 8;
                        this.onSetShuffleMode = true;
                        this.onSkipToQueueItem.RemoteActionCompatParcelizer()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.onSkipToQueueItem.MediaBrowserCompatCustomActionResultReceiver(0);
                        nonnullstring.IconCompatParcelizer(this.onSkipToQueueItem, 1, 1);
                        this.onSetCaptioningEnabled++;
                        this.onPlayFromUri.MediaBrowserCompatCustomActionResultReceiver(0);
                        nonnullstring.IconCompatParcelizer(this.onPlayFromUri, 8, 1);
                        this.onSetCaptioningEnabled += 8;
                    }
                    if (z2) {
                        if (!this.onSkipToPrevious) {
                            closeonfailandthrowasioe.IconCompatParcelizer(this.onSkipToQueueItem.RemoteActionCompatParcelizer(), 0, 1);
                            this.onSeekTo++;
                            this.onSkipToQueueItem.MediaBrowserCompatCustomActionResultReceiver(0);
                            this.onSetRepeatMode = this.onSkipToQueueItem.onPlayFromMediaId();
                            this.onSkipToPrevious = true;
                        }
                        int i3 = this.onSetRepeatMode << 2;
                        this.onSkipToQueueItem.write(i3);
                        closeonfailandthrowasioe.IconCompatParcelizer(this.onSkipToQueueItem.RemoteActionCompatParcelizer(), 0, i3);
                        this.onSeekTo += i3;
                        short s = (short) ((this.onSetRepeatMode / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.onPlayFromSearch;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.onPlayFromSearch = ByteBuffer.allocate(i4);
                        }
                        this.onPlayFromSearch.position(0);
                        this.onPlayFromSearch.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.onSetRepeatMode;
                            if (i5 >= i2) {
                                break;
                            }
                            int iOnPrepareFromSearch = this.onSkipToQueueItem.onPrepareFromSearch();
                            if (i5 % 2 == 0) {
                                this.onPlayFromSearch.putShort((short) (iOnPrepareFromSearch - i6));
                            } else {
                                this.onPlayFromSearch.putInt(iOnPrepareFromSearch - i6);
                            }
                            i5++;
                            i6 = iOnPrepareFromSearch;
                        }
                        int i7 = (i - this.onSeekTo) - i6;
                        if (i2 % 2 == 1) {
                            this.onPlayFromSearch.putInt(i7);
                        } else {
                            this.onPlayFromSearch.putShort((short) i7);
                            this.onPlayFromSearch.putInt(0);
                        }
                        this.onPrepareFromMediaId.IconCompatParcelizer(this.onPlayFromSearch.array(), i4);
                        nonnullstring.IconCompatParcelizer(this.onPrepareFromMediaId, i4, 1);
                        this.onSetCaptioningEnabled += i4;
                    }
                }
            } else if (readVar.onStop != null) {
                this.onStop.IconCompatParcelizer(readVar.onStop, readVar.onStop.length);
            }
            if (readVar.read(z)) {
                this.AudioAttributesImplApi26Parcelizer |= 268435456;
                this._init_lambda2.write(0);
                int i8 = (this.onStop.read() + i) - this.onSeekTo;
                this.onSkipToQueueItem.write(4);
                this.onSkipToQueueItem.RemoteActionCompatParcelizer()[0] = (byte) (i8 >>> 24);
                this.onSkipToQueueItem.RemoteActionCompatParcelizer()[1] = (byte) (i8 >> 16);
                this.onSkipToQueueItem.RemoteActionCompatParcelizer()[2] = (byte) (i8 >> 8);
                this.onSkipToQueueItem.RemoteActionCompatParcelizer()[3] = (byte) i8;
                nonnullstring.IconCompatParcelizer(this.onSkipToQueueItem, 4, 2);
                this.onSetCaptioningEnabled += 4;
            }
            this.onSetRating = true;
        }
        int i9 = i + this.onStop.read();
        if ("V_MPEG4/ISO/AVC".equals(readVar.read) || "V_MPEGH/ISO/HEVC".equals(readVar.read)) {
            byte[] bArrRemoteActionCompatParcelizer = this.onRemoveQueueItem.RemoteActionCompatParcelizer();
            bArrRemoteActionCompatParcelizer[0] = 0;
            bArrRemoteActionCompatParcelizer[1] = 0;
            bArrRemoteActionCompatParcelizer[2] = 0;
            int i10 = readVar.onPlayFromUri;
            int i11 = readVar.onPlayFromUri;
            while (this.onSeekTo < i9) {
                int i12 = this.onSetPlaybackSpeed;
                if (i12 == 0) {
                    RemoteActionCompatParcelizer(closeonfailandthrowasioe, bArrRemoteActionCompatParcelizer, 4 - i11, i10);
                    this.onSeekTo += i10;
                    this.onRemoveQueueItem.MediaBrowserCompatCustomActionResultReceiver(0);
                    this.onSetPlaybackSpeed = this.onRemoveQueueItem.onPrepareFromSearch();
                    this.onRewind.MediaBrowserCompatCustomActionResultReceiver(0);
                    nonnullstring.RemoteActionCompatParcelizer(this.onRewind, 4);
                    this.onSetCaptioningEnabled += 4;
                } else {
                    int iWrite = write(closeonfailandthrowasioe, nonnullstring, i12);
                    this.onSeekTo += iWrite;
                    this.onSetCaptioningEnabled += iWrite;
                    this.onSetPlaybackSpeed -= iWrite;
                }
            }
        } else {
            if (readVar.PlaybackStateCompat != null) {
                buildTypeSerializer.write(this.onStop.read() == 0);
                readVar.PlaybackStateCompat.read(closeonfailandthrowasioe);
            }
            while (true) {
                int i13 = this.onSeekTo;
                if (i13 >= i9) {
                    break;
                }
                int iWrite2 = write(closeonfailandthrowasioe, nonnullstring, i9 - i13);
                this.onSeekTo += iWrite2;
                this.onSetCaptioningEnabled += iWrite2;
            }
        }
        if ("A_VORBIS".equals(readVar.read)) {
            this.accessaddObserverForBackInvoker.MediaBrowserCompatCustomActionResultReceiver(0);
            nonnullstring.RemoteActionCompatParcelizer(this.accessaddObserverForBackInvoker, 4);
            this.onSetCaptioningEnabled += 4;
        }
        return AudioAttributesImplApi26Parcelizer();
    }

    private int AudioAttributesImplApi26Parcelizer() {
        int i = this.onSetCaptioningEnabled;
        MediaBrowserCompatItemReceiver();
        return i;
    }

    private void MediaBrowserCompatItemReceiver() {
        this.onSeekTo = 0;
        this.onSetCaptioningEnabled = 0;
        this.onSetPlaybackSpeed = 0;
        this.onSetRating = false;
        this.onSkipToNext = false;
        this.onSkipToPrevious = false;
        this.onSetRepeatMode = 0;
        this.setSessionImpl = (byte) 0;
        this.onSetShuffleMode = false;
        this.onStop.write(0);
    }

    private void read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.AudioAttributesCompatParcelizer() < length) {
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.AudioAttributesCompatParcelizer(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.RemoteActionCompatParcelizer(), 0, bArr.length);
        }
        closeonfailandthrowasioe.IconCompatParcelizer(this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.RemoteActionCompatParcelizer(), bArr.length, i);
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.MediaBrowserCompatCustomActionResultReceiver(0);
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.AudioAttributesCompatParcelizer(length);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void AudioAttributesCompatParcelizer(java.lang.String r5, long r6, byte[] r8) {
        /*
            r5.hashCode()
            int r0 = r5.hashCode()
            r1 = 738597099(0x2c0618eb, float:1.9056378E-12)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L2e
            r1 = 1045209816(0x3e4ca2d8, float:0.19983995)
            if (r0 == r1) goto L24
            r1 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r0 == r1) goto L1a
            goto L38
        L1a:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L38
            r5 = r3
            goto L39
        L24:
            java.lang.String r0 = "S_TEXT/WEBVTT"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L38
            r5 = r4
            goto L39
        L2e:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L38
            r5 = r2
            goto L39
        L38:
            r5 = -1
        L39:
            if (r5 == 0) goto L59
            r0 = 1000(0x3e8, double:4.94E-321)
            if (r5 == r4) goto L50
            if (r5 != r3) goto L4a
            java.lang.String r5 = "%02d:%02d:%02d,%03d"
            byte[] r5 = read(r6, r5, r0)
            r6 = 19
            goto L63
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L50:
            java.lang.String r5 = "%02d:%02d:%02d.%03d"
            byte[] r5 = read(r6, r5, r0)
            r6 = 25
            goto L63
        L59:
            java.lang.String r5 = "%01d:%02d:%02d:%02d"
            r0 = 10000(0x2710, double:4.9407E-320)
            byte[] r5 = read(r6, r5, r0)
            r6 = 21
        L63:
            int r7 = r5.length
            java.lang.System.arraycopy(r5, r2, r8, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializedValueFor.AudioAttributesCompatParcelizer(java.lang.String, long, byte[]):void");
    }

    private static byte[] read(long j, String str, long j2) {
        buildTypeSerializer.IconCompatParcelizer(j != C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        return LaissezFaireSubTypeValidator.IconCompatParcelizer(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    private void RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, byte[] bArr, int i, int i2) throws IOException {
        int iMin = Math.min(i2, this.onStop.IconCompatParcelizer());
        closeonfailandthrowasioe.IconCompatParcelizer(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.onStop.write(bArr, i, iMin);
        }
    }

    private int write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, nonNullString nonnullstring, int i) throws IOException {
        int iIconCompatParcelizer = this.onStop.IconCompatParcelizer();
        if (iIconCompatParcelizer > 0) {
            int iMin = Math.min(i, iIconCompatParcelizer);
            nonnullstring.RemoteActionCompatParcelizer(this.onStop, iMin);
            return iMin;
        }
        return nonnullstring.AudioAttributesCompatParcelizer(closeonfailandthrowasioe, i, false);
    }

    private isCollectionMapOrArray read(AsDeductionTypeDeserializer asDeductionTypeDeserializer, AsDeductionTypeDeserializer asDeductionTypeDeserializer2) {
        int i;
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == -1 || this.onMediaButtonEvent == C.TIME_UNSET || asDeductionTypeDeserializer == null || asDeductionTypeDeserializer.read() == 0 || asDeductionTypeDeserializer2 == null || asDeductionTypeDeserializer2.read() != asDeductionTypeDeserializer.read()) {
            return new isCollectionMapOrArray.write(this.onMediaButtonEvent);
        }
        int i2 = asDeductionTypeDeserializer.read();
        int[] iArrCopyOf = new int[i2];
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        long[] jArrCopyOf3 = new long[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jArrCopyOf3[i4] = asDeductionTypeDeserializer.read(i4);
            jArrCopyOf[i4] = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + asDeductionTypeDeserializer2.read(i4);
        }
        while (true) {
            i = i2 - 1;
            if (i3 >= i) {
                break;
            }
            int i5 = i3 + 1;
            iArrCopyOf[i3] = (int) (jArrCopyOf[i5] - jArrCopyOf[i3]);
            jArrCopyOf2[i3] = jArrCopyOf3[i5] - jArrCopyOf3[i3];
            i3 = i5;
        }
        iArrCopyOf[i] = (int) ((this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + this.PlaybackStateCompatCustomAction) - jArrCopyOf[i]);
        long j = this.onMediaButtonEvent - jArrCopyOf3[i];
        jArrCopyOf2[i] = j;
        if (j <= 0) {
            prune.RemoteActionCompatParcelizer("MatroskaExtractor", "Discarding last cue point with unexpected duration: ".concat(String.valueOf(j)));
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i);
        }
        return new _failGetClassMethods(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    private boolean RemoteActionCompatParcelizer(isJacksonStdImpl isjacksonstdimpl, long j) {
        if (this.ParcelableVolumeInfo) {
            this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = j;
            isjacksonstdimpl.AudioAttributesCompatParcelizer = this.onPlay;
            this.ParcelableVolumeInfo = false;
            return true;
        }
        if (this.ResultReceiver) {
            long j2 = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
            if (j2 != -1) {
                isjacksonstdimpl.AudioAttributesCompatParcelizer = j2;
                this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = -1L;
                return true;
            }
        }
        return false;
    }

    private long read(long j) throws SchemaAware {
        long j2 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (j2 == C.TIME_UNSET) {
            throw SchemaAware.RemoteActionCompatParcelizer("Can't scale timecode prior to timecodeScale being set.", null);
        }
        return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j, j2, 1000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean write(java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializedValueFor.write(java.lang.String):boolean");
    }

    private static int[] IconCompatParcelizer(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length << 1, i)];
    }

    private void AudioAttributesImplApi21Parcelizer() {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.onPrepare);
    }

    final class RemoteActionCompatParcelizer implements enums {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(serializedValueFor serializedvaluefor, byte b) {
            this();
        }

        @Override // kotlin.enums
        public final int read(int i) {
            return serializedValueFor.AudioAttributesCompatParcelizer(i);
        }

        @Override // kotlin.enums
        public final boolean AudioAttributesCompatParcelizer(int i) {
            return serializedValueFor.write(i);
        }

        @Override // kotlin.enums
        public final void write(int i, long j, long j2) throws SchemaAware {
            serializedValueFor.this.RemoteActionCompatParcelizer(i, j, j2);
        }

        @Override // kotlin.enums
        public final void write(int i) throws SchemaAware {
            serializedValueFor.this.RemoteActionCompatParcelizer(i);
        }

        @Override // kotlin.enums
        public final void write(int i, long j) throws SchemaAware {
            serializedValueFor.this.AudioAttributesCompatParcelizer(i, j);
        }

        @Override // kotlin.enums
        public final void read(int i, double d) throws SchemaAware {
            serializedValueFor.this.write(i, d);
        }

        @Override // kotlin.enums
        public final void IconCompatParcelizer(int i, String str) throws SchemaAware {
            serializedValueFor.this.AudioAttributesCompatParcelizer(i, str);
        }

        @Override // kotlin.enums
        public final void AudioAttributesCompatParcelizer(int i, int i2, closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
            serializedValueFor.this.read(i, i2, closeonfailandthrowasioe);
        }
    }

    protected static final class read {
        public nonNullString.AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer;
        public byte[] MediaBrowserCompatItemReceiver;
        public DrmInitData MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        public byte[] MediaDescriptionCompat;
        public int MediaSessionCompatQueueItem;
        public nameOf PlaybackStateCompat;
        public int RatingCompat;
        public boolean onAddQueueItem;
        public boolean onCustomAction;
        public int onPause;
        public nonNullString onPlayFromSearch;
        public int onPlayFromUri;
        public int onPrepare;
        public String onPrepareFromSearch;
        public byte[] onStop;
        private int r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
        public String read;
        public int MediaSessionCompatResultReceiverWrapper = -1;
        public int onFastForward = -1;
        public int RemoteActionCompatParcelizer = -1;
        public int MediaBrowserCompatSearchResultReceiver = -1;
        public int MediaMetadataCompat = -1;
        public int MediaBrowserCompatMediaItem = 0;
        public int onSkipToQueueItem = -1;
        public float onSetPlaybackSpeed = BitmapDescriptorFactory.HUE_RED;
        public float onSetRepeatMode = BitmapDescriptorFactory.HUE_RED;
        public float onSetShuffleMode = BitmapDescriptorFactory.HUE_RED;
        public byte[] onSetRating = null;
        public int onSkipToPrevious = -1;
        public boolean handleMediaPlayPauseIfPendingOnHandler = false;
        public int MediaBrowserCompatCustomActionResultReceiver = -1;
        public int AudioAttributesImplApi26Parcelizer = -1;
        public int AudioAttributesImplApi21Parcelizer = -1;
        public int onMediaButtonEvent = 1000;
        public int onPlayFromMediaId = 200;
        public float onRemoveQueueItem = -1.0f;
        public float onSetCaptioningEnabled = -1.0f;
        public float onPrepareFromUri = -1.0f;
        public float onRewind = -1.0f;
        public float onSeekTo = -1.0f;
        public float onRemoveQueueItemAt = -1.0f;
        public float ParcelableVolumeInfo = -1.0f;
        public float MediaSessionCompatToken = -1.0f;
        public float onPlay = -1.0f;
        public float onPrepareFromMediaId = -1.0f;
        public int IconCompatParcelizer = 1;
        public int write = -1;
        public int setSessionImpl = 8000;
        public long AudioAttributesCompatParcelizer = 0;
        public long onSkipToNext = 0;
        public boolean onCommand = true;
        private String ResultReceiver = "eng";

        protected read() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:104:0x018e  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x03cf  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x03e6  */
        /* JADX WARN: Removed duplicated region for block: B:186:0x03e8  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x03f4  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x0406  */
        /* JADX WARN: Removed duplicated region for block: B:237:0x04dc  */
        /* JADX WARN: Removed duplicated region for block: B:257:0x0533  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void AudioAttributesCompatParcelizer(kotlin.findRawSuperTypes r19, int r20) throws kotlin.SchemaAware {
            /*
                Method dump skipped, instruction units count: 1610
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.serializedValueFor.read.AudioAttributesCompatParcelizer(o.findRawSuperTypes, int):void");
        }

        public final void RemoteActionCompatParcelizer() {
            nameOf nameof = this.PlaybackStateCompat;
            if (nameof != null) {
                nameof.AudioAttributesCompatParcelizer(this.onPlayFromSearch, this.AudioAttributesImplBaseParcelizer);
            }
        }

        public final void read() {
            nameOf nameof = this.PlaybackStateCompat;
            if (nameof != null) {
                nameof.IconCompatParcelizer();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean read(boolean z) {
            return "A_OPUS".equals(this.read) ? z : this.onPause > 0;
        }

        private byte[] write() {
            if (this.onRemoveQueueItem == -1.0f || this.onSetCaptioningEnabled == -1.0f || this.onPrepareFromUri == -1.0f || this.onRewind == -1.0f || this.onSeekTo == -1.0f || this.onRemoveQueueItemAt == -1.0f || this.ParcelableVolumeInfo == -1.0f || this.MediaSessionCompatToken == -1.0f || this.onPlay == -1.0f || this.onPrepareFromMediaId == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.onRemoveQueueItem * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.onSetCaptioningEnabled * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.onPrepareFromUri * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.onRewind * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.onSeekTo * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.onRemoveQueueItemAt * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.ParcelableVolumeInfo * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.MediaSessionCompatToken * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.onPlay + 0.5f));
            byteBufferOrder.putShort((short) (this.onPrepareFromMediaId + 0.5f));
            byteBufferOrder.putShort((short) this.onMediaButtonEvent);
            byteBufferOrder.putShort((short) this.onPlayFromMediaId);
            return bArr;
        }

        private static Pair<String, List<byte[]>> IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws SchemaAware {
            try {
                asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(16);
                long jRatingCompat = asPropertyTypeDeserializer.RatingCompat();
                if (jRatingCompat == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_DIVX, null);
                }
                if (jRatingCompat == 859189832) {
                    return new Pair<>(MimeTypes.VIDEO_H263, null);
                }
                if (jRatingCompat == 826496599) {
                    byte[] bArrRemoteActionCompatParcelizer = asPropertyTypeDeserializer.RemoteActionCompatParcelizer();
                    for (int iWrite = asPropertyTypeDeserializer.write() + 20; iWrite < bArrRemoteActionCompatParcelizer.length - 4; iWrite++) {
                        if (bArrRemoteActionCompatParcelizer[iWrite] == 0 && bArrRemoteActionCompatParcelizer[iWrite + 1] == 0 && bArrRemoteActionCompatParcelizer[iWrite + 2] == 1 && bArrRemoteActionCompatParcelizer[iWrite + 3] == 15) {
                            return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArrRemoteActionCompatParcelizer, iWrite, bArrRemoteActionCompatParcelizer.length)));
                        }
                    }
                    throw SchemaAware.RemoteActionCompatParcelizer("Failed to find FourCC VC1 initialization data", null);
                }
                prune.RemoteActionCompatParcelizer("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw SchemaAware.RemoteActionCompatParcelizer("Error parsing FourCC private data", null);
            }
        }

        private static List<byte[]> RemoteActionCompatParcelizer(byte[] bArr) throws SchemaAware {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw SchemaAware.RemoteActionCompatParcelizer("Error parsing vorbis codec private", null);
                }
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    i = bArr[i4] & 255;
                    if (i != 255) {
                        break;
                    }
                    i3 += 255;
                    i4++;
                }
                int i5 = i4 + 1;
                int i6 = i3 + i;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5] & 255;
                    if (i2 != 255) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                if (bArr[i8] != 1) {
                    throw SchemaAware.RemoteActionCompatParcelizer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i9 = i8 + i6;
                if (bArr[i9] != 3) {
                    throw SchemaAware.RemoteActionCompatParcelizer("Error parsing vorbis codec private", null);
                }
                int i10 = i9 + i7 + i2;
                if (bArr[i10] != 5) {
                    throw SchemaAware.RemoteActionCompatParcelizer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i10];
                System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw SchemaAware.RemoteActionCompatParcelizer("Error parsing vorbis codec private", null);
            }
        }

        private static boolean read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws SchemaAware {
            try {
                int iOnCustomAction = asPropertyTypeDeserializer.onCustomAction();
                if (iOnCustomAction == 1) {
                    return true;
                }
                if (iOnCustomAction != 65534) {
                    return false;
                }
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(24);
                if (asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler() == serializedValueFor.MediaBrowserCompatCustomActionResultReceiver.getMostSignificantBits()) {
                    return asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler() == serializedValueFor.MediaBrowserCompatCustomActionResultReceiver.getLeastSignificantBits();
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw SchemaAware.RemoteActionCompatParcelizer("Error parsing MS/ACM codec private", null);
            }
        }

        private byte[] IconCompatParcelizer(String str) throws SchemaAware {
            byte[] bArr = this.MediaBrowserCompatItemReceiver;
            if (bArr != null) {
                return bArr;
            }
            throw SchemaAware.RemoteActionCompatParcelizer("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
        }
    }
}
