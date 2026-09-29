package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.ApicFrame;
import kotlin.Metadata;
import kotlin.getCurrentTrackSelections;
import kotlin.parseDigitsRecursive;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B)\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0011\u0010\u0014J\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\nJ2\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015H\u0086@¢\u0006\u0004\b\u000e\u0010\u0016J\u0010\u0010\u000b\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000b\u0010\u0017J<\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00182\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\fJ)\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00132\b\b\u0002\u0010\u0007\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u000b\u0010 J\u0017\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u000b\u0010!J\u0013\u0010\u000e\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\"J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020&H\u0002¢\u0006\u0004\b\u000e\u0010'J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020&H\u0002¢\u0006\u0004\b\u000e\u0010(J\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020&H\u0002¢\u0006\u0004\b\u000e\u0010)J\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010+R\u001e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010,R\"\u0010\u001c\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001f8\u0000@BX\u0080\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0014\u0010\u000e\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010.R+\u0010\u0011\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020/8A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b\u000e\u00104R\u0014\u0010\u000b\u001a\u0002058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R$\u0010:\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010.R$\u0010=\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010.R\u001c\u0010B\u001a\u00020>8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u00103R\u001c\u0010E\u001a\u00020>8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u00103R\u0016\u0010F\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010GR\u0014\u0010K\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001e\u0010;\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0000@BX\u0081\u000e¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0016\u0010L\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u00109R\u0016\u0010<\u001a\u00020\u00138\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0016\u0010M\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u00109R\u0018\u0010P\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010OR\u0016\u0010R\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bQ\u0010,R\u001c\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001f0S8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u00101R\u0011\u0010A\u001a\u00020&8G¢\u0006\u0006\u001a\u0004\bM\u0010VR\u0014\u0010W\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010.R\u0014\u0010C\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010.R\"\u0010\\\u001a\u00020X8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b<\u0010Y\u001a\u0004\b;\u0010Z\"\u0004\b\u001c\u0010[R\u0014\u0010D\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010.R\u001c\u0010?\u001a\u00020\u00028\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bU\u00109\u001a\u0004\bU\u0010.R\u0014\u0010^\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010]R\u001a\u0010b\u001a\u00020_8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bR\u0010`\u001a\u0004\bL\u0010aR\u0011\u0010T\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b=\u0010.R+\u0010f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\b\u001e\u0010.\"\u0004\b\u001c\u0010eR+\u0010h\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010d\u001a\u0004\b\u000e\u0010.\"\u0004\b\u001e\u0010eR\u0015\u00102\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\bi\u0010jR\u0015\u00106\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\bk\u0010jR\u0011\u0010$\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bK\u0010]R\u001a\u0010c\u001a\u00020l8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bb\u0010m\u001a\u0004\bh\u0010nR\u0014\u0010H\u001a\u00020o8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\\\u0010pR\u0014\u0010I\u001a\u00020q8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010rR\u001a\u0010k\u001a\u00020s8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bB\u0010t\u001a\u0004\bE\u0010uR\u001a\u00100\u001a\u00020v8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b=\u0010w\u001a\u0004\bB\u0010xR\u001a\u0010i\u001a\u00020y8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bE\u0010z\u001a\u0004\b:\u0010{R/\u0010g\u001a\u0004\u0018\u00010|2\b\u0010\u0003\u001a\u0004\u0018\u00010|8A@CX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b$\u00101\u001a\u0004\b^\u0010}\"\u0004\b\u000e\u0010~R\u001d\u0010\u0082\u0001\u001a\u00020\u007f8\u0001X\u0081\u0004¢\u0006\u000e\n\u0005\b2\u0010\u0080\u0001\u001a\u0005\bH\u0010\u0081\u0001R\u001e\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b^\u0010@\"\u0004\b\u0011\u00104R\u001e\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0001X\u0081\u0004¢\u0006\u000e\n\u0005\bf\u0010\u0086\u0001\u001a\u0005\bb\u0010\u0087\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0089\u00018AX\u0080\u0084\u0002¢\u0006\u0007\u001a\u0005\b\\\u0010\u008a\u0001R\u001c\u0010Q\u001a\u00030\u008c\u00018\u0001X\u0081\u0004¢\u0006\r\n\u0004\bh\u00101\u001a\u0005\bf\u0010\u008d\u0001R\u001d\u0010\u008e\u0001\u001a\u00030\u008c\u00018\u0001X\u0081\u0004¢\u0006\r\n\u0004\bW\u00101\u001a\u0005\bP\u0010\u008d\u0001R\u0015\u0010\u008f\u0001\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010%R-\u0010\u0091\u0001\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138G@CX\u0087\u008e\u0002¢\u0006\u0013\n\u0004\bL\u00101\u001a\u0004\b\u001c\u0010%\"\u0005\b\u000e\u0010\u0090\u0001R-\u0010\u0092\u0001\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138G@CX\u0087\u008e\u0002¢\u0006\u0013\n\u0004\b:\u00101\u001a\u0004\b\u0011\u0010%\"\u0005\b\u000b\u0010\u0090\u0001R\u001b\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bP\u00101R\u001b\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u00101R\u0015\u0010\u0095\u0001\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010%"}, d2 = {"Lo/ApicFrame;", "Lo/getNoBackupFilesDir;", "", "p0", "", "p1", "Lo/setPriority;", "p2", "<init>", "(IFLo/setPriority;)V", "(IF)V", "write", "(F)F", "", "IconCompatParcelizer", "(IFLo/SampleVideos;)Ljava/lang/Object;", "Lo/checkSelfPermission;", "read", "(Lo/checkSelfPermission;I)V", "", "(IFZ)V", "Lo/setOrientation;", "(IFLo/setOrientation;Lo/SampleVideos;)Ljava/lang/Object;", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/Flow;", "Lkotlin/Function2;", "Lo/SampleVideos;", "", "AudioAttributesCompatParcelizer", "(Lo/Flow;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "Lo/removeEventListener;", "(Lo/removeEventListener;ZZ)V", "(Lo/removeEventListener;)V", "(I)I", "(F)Z", "onSeekTo", "()Z", "Lo/addDrmEventListener;", "(FLo/addDrmEventListener;)V", "(Lo/addDrmEventListener;)V", "(ZLo/addDrmEventListener;)I", "Lo/disable;", "(Lo/disable;I)I", "Z", "Lo/removeEventListener;", "()I", "Lo/getReferencedType;", "onSetShuffleMode", "Lo/InputAccessor;", "onRewind", "()J", "(J)V", "Lo/setDefaultStereoMode;", "onRemoveQueueItem", "Lo/setDefaultStereoMode;", "RatingCompat", "I", "AudioAttributesImplBaseParcelizer", "MediaMetadataCompat", "MediaBrowserCompatMediaItem", "AudioAttributesImplApi21Parcelizer", "", "onFastForward", "J", "onCustomAction", "MediaBrowserCompatCustomActionResultReceiver", "onPause", "onPlay", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "F", "onRemoveQueueItemAt", "onSetRating", "Lo/getNoBackupFilesDir;", "MediaDescriptionCompat", "MediaBrowserCompatSearchResultReceiver", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "onCommand", "onSkipToPrevious", "handleMediaPlayPauseIfPendingOnHandler", "Lo/InputAccessor;", "onPrepareFromMediaId", "onAddQueueItem", "()Lo/addDrmEventListener;", "onMediaButtonEvent", "Lo/bufferMapProperty;", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "(Lo/bufferMapProperty;)V", "onPlayFromMediaId", "()F", "onPlayFromUri", "Lo/hashCode;", "Lo/hashCode;", "()Lo/hashCode;", "onPrepare", "onPrepareFromUri", "Lo/hasMoreBytes;", "(I)V", "onPlayFromSearch", "onSetRepeatMode", "onPrepareFromSearch", "onSetPlaybackSpeed", "Lo/parseDouble;", "onSetCaptioningEnabled", "Lo/getCurrentTrackSelections;", "Lo/getCurrentTrackSelections;", "()Lo/getCurrentTrackSelections;", "Lo/ApicFrame$IconCompatParcelizer;", "Lo/ApicFrame$IconCompatParcelizer;", "Lo/ApicFrame$write;", "Lo/ApicFrame$write;", "Lo/onPrimaryPlaylistRefreshed;", "Lo/onPrimaryPlaylistRefreshed;", "()Lo/onPrimaryPlaylistRefreshed;", "Lo/deliverCancellation;", "Lo/deliverCancellation;", "()Lo/deliverCancellation;", "Lo/isLoadInBackgroundCanceled;", "Lo/isLoadInBackgroundCanceled;", "()Lo/isLoadInBackgroundCanceled;", "Lo/getPathReference;", "()Lo/getPathReference;", "(Lo/getPathReference;)V", "Lo/getLocalizedMessage;", "Lo/getLocalizedMessage;", "()Lo/getLocalizedMessage;", "setSessionImpl", "Lo/PropertyValueAny;", "onSkipToQueueItem", "Lo/getAudioComponent;", "Lo/getAudioComponent;", "()Lo/getAudioComponent;", "onSkipToNext", "Lo/newEncryptedObject;", "()Lo/newEncryptedObject;", "onStop", "Lo/setAuxEffectInfo;", "()Lo/InputAccessor;", "PlaybackStateCompat", "MediaSessionCompatQueueItem", "(Z)V", "ParcelableVolumeInfo", "MediaSessionCompatToken", "MediaSessionCompatResultReceiverWrapper", "ResultReceiver", "r8lambdaKUbBm7ckfqTc9QCgukC86fguu4"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ApicFrame implements getNoBackupFilesDir {
    public removeEventListener AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final deliverCancellation onSetShuffleMode;
    private float AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final InputAccessor MediaSessionCompatToken;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final write onSetRating;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final onPrimaryPlaylistRefreshed onSetCaptioningEnabled;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final isLoadInBackgroundCanceled onSetPlaybackSpeed;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private bufferMapProperty onPlayFromMediaId;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final InputAccessor ParcelableVolumeInfo;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private getCurrentTrackSelections.RemoteActionCompatParcelizer onCommand;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private int AudioAttributesImplBaseParcelizer;
    public boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final hashCode onPrepare;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private int onFastForward;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final InputAccessor<Boolean> MediaSessionCompatResultReceiverWrapper;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final InputAccessor<Boolean> ResultReceiver;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private long MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final InputAccessor<getShowPopup> PlaybackStateCompat;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private long MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private int MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final IconCompatParcelizer onRemoveQueueItemAt;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final getAudioComponent onSkipToNext;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private long onSkipToQueueItem;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private final getCurrentTrackSelections onPrepareFromUri;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private InputAccessor<removeEventListener> onAddQueueItem;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final InputAccessor<getShowPopup> onSkipToPrevious;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private final hasMoreBytes onPlayFromSearch;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private final setDefaultStereoMode write;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private float RatingCompat;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private final getLocalizedMessage setSessionImpl;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private final InputAccessor onSetRepeatMode;

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from kotlin metadata */
    private final parseDouble onRemoveQueueItem;

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from kotlin metadata */
    private final parseDouble onRewind;

    /* JADX INFO: renamed from: onSetRating, reason: from kotlin metadata */
    private final getNoBackupFilesDir MediaDescriptionCompat;

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from kotlin metadata */
    private final hasMoreBytes onPrepareFromSearch;

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from kotlin metadata */
    private final InputAccessor read;

    /* JADX INFO: renamed from: onSkipToPrevious, reason: from kotlin metadata */
    private boolean handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public int MediaMetadataCompat;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi21Parcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return ApicFrame.RemoteActionCompatParcelizer(ApicFrame.this, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        float read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return ApicFrame.this.IconCompatParcelizer(0, BitmapDescriptorFactory.HUE_RED, null, this);
        }
    }

    public abstract int write();

    public ApicFrame(int i, float f, setPriority setpriority) {
        double d = f;
        Boolean bool = Boolean.FALSE;
        if (-0.5d > d || d > 0.5d) {
            StringBuilder sb = new StringBuilder("currentPageOffsetFraction ");
            sb.append(f);
            sb.append(" is not within the range -0.5 to 0.5");
            getRootStableInsets.RemoteActionCompatParcelizer(sb.toString());
        }
        this.read = available.RemoteActionCompatParcelizer$default(getReferencedType.read(getReferencedType.INSTANCE.write()), null, 2, null);
        setDefaultStereoMode setdefaultstereomode = new setDefaultStereoMode(i, f, this);
        this.write = setdefaultstereomode;
        this.AudioAttributesImplBaseParcelizer = i;
        this.MediaBrowserCompatCustomActionResultReceiver = Long.MAX_VALUE;
        this.MediaDescriptionCompat = C0193obtainAndCheckReceiverPermission.IconCompatParcelizer(new getAnswerMap() { // from class: o.VorbisComment
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Float.valueOf(ApicFrame.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, ((Float) obj).floatValue()));
            }
        });
        this.MediaBrowserCompatMediaItem = true;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
        this.onAddQueueItem = _qbuf.RemoteActionCompatParcelizer(GeobFrame.read(), _qbuf.AudioAttributesCompatParcelizer());
        this.onPlayFromMediaId = GeobFrame.RemoteActionCompatParcelizer;
        this.onPrepare = isConsumed.RemoteActionCompatParcelizer();
        this.onPlayFromSearch = _appendByte.RemoteActionCompatParcelizer(-1);
        this.onPrepareFromSearch = _appendByte.RemoteActionCompatParcelizer(i);
        this.onRewind = _qbuf.IconCompatParcelizer(_qbuf.RemoteActionCompatParcelizer(), new getCreatedOnDateMs() { // from class: o.IcyInfo
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Integer.valueOf(ApicFrame.AudioAttributesCompatParcelizer(this.read));
            }
        });
        this.onRemoveQueueItem = _qbuf.IconCompatParcelizer(_qbuf.RemoteActionCompatParcelizer(), new getCreatedOnDateMs() { // from class: o.BinaryFrame
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Integer.valueOf(ApicFrame.MediaBrowserCompatCustomActionResultReceiver(this.write));
            }
        });
        getCurrentTrackSelections getcurrenttrackselections = new getCurrentTrackSelections(setpriority, new getAnswerMap() { // from class: o.CommentFrame
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ApicFrame.IconCompatParcelizer(this.write, (setForegroundMode) obj);
            }
        });
        this.onPrepareFromUri = getcurrenttrackselections;
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        this.onRemoveQueueItemAt = iconCompatParcelizer;
        this.onSetRating = new write();
        this.onSetCaptioningEnabled = new onPrimaryPlaylistRefreshed(iconCompatParcelizer, getcurrenttrackselections, new getCreatedOnDateMs() { // from class: o.ChapterTocFrame
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Integer.valueOf(ApicFrame.write(this.RemoteActionCompatParcelizer));
            }
        });
        this.onSetShuffleMode = new deliverCancellation();
        this.onSetPlaybackSpeed = new isLoadInBackgroundCanceled();
        this.onSetRepeatMode = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
        this.setSessionImpl = new read();
        this.onSkipToQueueItem = PropertyValueBuffer.read$default(0, 0, 0, 0, 15, null);
        this.onSkipToNext = new getAudioComponent();
        setdefaultstereomode.getMediaBrowserCompatItemReceiver();
        this.onSkipToPrevious = setAuxEffectInfo.AudioAttributesCompatParcelizer(null, 1, null);
        this.PlaybackStateCompat = setAuxEffectInfo.AudioAttributesCompatParcelizer(null, 1, null);
        this.ParcelableVolumeInfo = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.MediaSessionCompatToken = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.MediaSessionCompatResultReceiverWrapper = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.ResultReceiver = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
    }

    public /* synthetic */ ApicFrame(int i, float f, setPriority setpriority, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f, (i2 & 4) != 0 ? null : setpriority);
    }

    public ApicFrame(int i, float f) {
        this(i, f, null);
    }

    public final void IconCompatParcelizer(long j) {
        this.read.write(getReferencedType.read(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long onRewind() {
        return ((getReferencedType) this.read.getRemoteActionCompatParcelizer()).getWrite();
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final int getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final long getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: onPlay, reason: from getter */
    public final long getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AudioAttributesCompatParcelizer(ApicFrame apicFrame, float f) {
        return apicFrame.write(f);
    }

    private final float write(float p0) {
        removeEventListener removeeventlistener;
        long jAudioAttributesCompatParcelizer = EventMessage.AudioAttributesCompatParcelizer(this);
        float f = this.AudioAttributesImplApi26Parcelizer + p0;
        long jIconCompatParcelizer = getOnline.IconCompatParcelizer(f);
        this.AudioAttributesImplApi26Parcelizer = f - jIconCompatParcelizer;
        if (Math.abs(p0) < 1.0E-4f) {
            return p0;
        }
        long j = jIconCompatParcelizer + jAudioAttributesCompatParcelizer;
        long jAudioAttributesCompatParcelizer2 = getQues.AudioAttributesCompatParcelizer(j, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver);
        boolean z = j != jAudioAttributesCompatParcelizer2;
        long j2 = jAudioAttributesCompatParcelizer2 - jAudioAttributesCompatParcelizer;
        float f2 = j2;
        this.RatingCompat = f2;
        if (Math.abs(j2) != 0) {
            this.MediaSessionCompatResultReceiverWrapper.write(Boolean.valueOf(f2 > BitmapDescriptorFactory.HUE_RED));
            this.ResultReceiver.write(Boolean.valueOf(f2 < BitmapDescriptorFactory.HUE_RED));
        }
        int i = (int) j2;
        int i2 = -i;
        removeEventListener removeeventlistenerRemoteActionCompatParcelizer = this.onAddQueueItem.getRemoteActionCompatParcelizer().RemoteActionCompatParcelizer(i2);
        if (removeeventlistenerRemoteActionCompatParcelizer != null && (removeeventlistener = this.AudioAttributesCompatParcelizer) != null) {
            removeEventListener removeeventlistenerRemoteActionCompatParcelizer2 = removeeventlistener != null ? removeeventlistener.RemoteActionCompatParcelizer(i2) : null;
            if (removeeventlistenerRemoteActionCompatParcelizer2 != null) {
                this.AudioAttributesCompatParcelizer = removeeventlistenerRemoteActionCompatParcelizer2;
            } else {
                removeeventlistenerRemoteActionCompatParcelizer = null;
            }
        }
        if (removeeventlistenerRemoteActionCompatParcelizer != null) {
            write(removeeventlistenerRemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer, true);
            setAuxEffectInfo.AudioAttributesCompatParcelizer(this.onSkipToPrevious);
            this.MediaBrowserCompatSearchResultReceiver++;
        } else {
            this.write.IconCompatParcelizer(i);
            getPathReference getpathreferenceOnPlayFromUri = onPlayFromUri();
            if (getpathreferenceOnPlayFromUri != null) {
                getpathreferenceOnPlayFromUri.MediaBrowserCompatSearchResultReceiver();
            }
            this.MediaMetadataCompat++;
        }
        return (z ? Long.valueOf(j2) : Float.valueOf(p0)).floatValue();
    }

    public final addDrmEventListener MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onAddQueueItem.getRemoteActionCompatParcelizer();
    }

    public final int onMediaButtonEvent() {
        return this.onAddQueueItem.getRemoteActionCompatParcelizer().getRemoteActionCompatParcelizer();
    }

    public final int onFastForward() {
        return this.onAddQueueItem.getRemoteActionCompatParcelizer().getAudioAttributesCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty) {
        this.onPlayFromMediaId = buffermapproperty;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final bufferMapProperty getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    public final int onPause() {
        return onFastForward() + onMediaButtonEvent();
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final int getOnFastForward() {
        return this.onFastForward;
    }

    public final float onPrepareFromMediaId() {
        return Math.min(this.onPlayFromMediaId.AudioAttributesCompatParcelizer(GeobFrame.IconCompatParcelizer()), onFastForward() / 2.0f) / onFastForward();
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final hashCode getOnPrepare() {
        return this.onPrepare;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    private final void AudioAttributesCompatParcelizer(int i) {
        this.onPlayFromSearch.read(i);
    }

    private final int RemoteActionCompatParcelizer() {
        return this.onPlayFromSearch.IconCompatParcelizer();
    }

    private final int IconCompatParcelizer() {
        return this.onPrepareFromSearch.IconCompatParcelizer();
    }

    private final void RemoteActionCompatParcelizer(int i) {
        this.onPrepareFromSearch.read(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesCompatParcelizer(ApicFrame apicFrame) {
        if (apicFrame.AudioAttributesImplApi26Parcelizer()) {
            return apicFrame.IconCompatParcelizer();
        }
        return apicFrame.AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int MediaBrowserCompatCustomActionResultReceiver(kotlin.ApicFrame r2) {
        /*
            boolean r0 = r2.AudioAttributesImplApi26Parcelizer()
            if (r0 == 0) goto L34
            int r0 = r2.RemoteActionCompatParcelizer()
            r1 = -1
            if (r0 == r1) goto L12
            int r0 = r2.RemoteActionCompatParcelizer()
            goto L38
        L12:
            float r0 = r2.MediaDescriptionCompat()
            float r0 = java.lang.Math.abs(r0)
            float r1 = r2.onPrepareFromMediaId()
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L34
            boolean r0 = r2.handleMediaPlayPauseIfPendingOnHandler()
            if (r0 == 0) goto L31
            int r0 = r2.AudioAttributesImplBaseParcelizer
            int r0 = r0 + 1
            goto L38
        L31:
            int r0 = r2.AudioAttributesImplBaseParcelizer
            goto L38
        L34:
            int r0 = r2.AudioAttributesImplApi21Parcelizer()
        L38:
            int r2 = r2.IconCompatParcelizer(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ApicFrame.MediaBrowserCompatCustomActionResultReceiver(o.ApicFrame):int");
    }

    public final float MediaDescriptionCompat() {
        return this.write.IconCompatParcelizer();
    }

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from getter */
    public final getCurrentTrackSelections getOnPrepareFromUri() {
        return this.onPrepareFromUri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(ApicFrame apicFrame, setForegroundMode setforegroundmode) {
        parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
        parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
        getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
        parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
        try {
            setforegroundmode.IconCompatParcelizer(apicFrame.AudioAttributesImplBaseParcelizer);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
            return getShowPopup.INSTANCE;
        } catch (Throwable th) {
            companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
            throw th;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/ApicFrame$IconCompatParcelizer;", "Lo/onContentChanged;", "Lo/bufferMapProperty;", "", "p0", "read", "(Lo/bufferMapProperty;I)I", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements onContentChanged {
        @Override // kotlin.onContentChanged
        public final int AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, int i) {
            return 0;
        }

        IconCompatParcelizer() {
        }

        @Override // kotlin.onContentChanged
        public final int read(bufferMapProperty buffermapproperty, int i) {
            return ApicFrame.this.getOnFastForward();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u0001"}, d2 = {"Lo/ApicFrame$write;", "Lo/setPaddingTop;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements setPaddingTop {
        write() {
        }
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final onPrimaryPlaylistRefreshed getOnSetCaptioningEnabled() {
        return this.onSetCaptioningEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int write(ApicFrame apicFrame) {
        return apicFrame.write();
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final deliverCancellation getOnSetShuffleMode() {
        return this.onSetShuffleMode;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final isLoadInBackgroundCanceled getOnSetPlaybackSpeed() {
        return this.onSetPlaybackSpeed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(getPathReference getpathreference) {
        this.onSetRepeatMode.write(getpathreference);
    }

    public final getPathReference onPlayFromUri() {
        return (getPathReference) this.onSetRepeatMode.getRemoteActionCompatParcelizer();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/ApicFrame$read;", "Lo/getLocalizedMessage;", "Lo/getPathReference;", "p0", "", "IconCompatParcelizer", "(Lo/getPathReference;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements getLocalizedMessage {
        read() {
        }

        @Override // kotlin.getLocalizedMessage
        public final void IconCompatParcelizer(getPathReference p0) {
            ApicFrame.this.IconCompatParcelizer(p0);
        }
    }

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from getter */
    public final getLocalizedMessage getSetSessionImpl() {
        return this.setSessionImpl;
    }

    public final void read(long j) {
        this.onSkipToQueueItem = j;
    }

    /* JADX INFO: renamed from: onPrepare, reason: from getter */
    public final getAudioComponent getOnSkipToNext() {
        return this.onSkipToNext;
    }

    public final newEncryptedObject onPlayFromMediaId() {
        return this.write.getMediaBrowserCompatItemReceiver().getRemoteActionCompatParcelizer();
    }

    public final InputAccessor<getShowPopup> onPlayFromSearch() {
        return this.onSkipToPrevious;
    }

    public static /* synthetic */ Object IconCompatParcelizer$default(ApicFrame apicFrame, int i, float f, SampleVideos sampleVideos, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        return apicFrame.IconCompatParcelizer(i, f, sampleVideos);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<checkSelfPermission, SampleVideos<? super getShowPopup>, Object> {
        int IconCompatParcelizer;
        final /* synthetic */ float read;
        final /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (ApicFrame.this.write(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            float f = this.read;
            double d = f;
            if (-0.5d > d || d > 0.5d) {
                StringBuilder sb = new StringBuilder("pageOffsetFraction ");
                sb.append(f);
                sb.append(" is not within the range -0.5 to 0.5");
                getRootStableInsets.RemoteActionCompatParcelizer(sb.toString());
            }
            ApicFrame.this.read(ApicFrame.this.IconCompatParcelizer(this.write), this.read, true);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi26Parcelizer(float f, int i, SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = f;
            this.write = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return ApicFrame.this.new AudioAttributesImplApi26Parcelizer(this.read, this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(checkSelfPermission checkselfpermission, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(checkselfpermission, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final Object IconCompatParcelizer(int i, float f, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer$default = getNoBackupFilesDir.AudioAttributesCompatParcelizer$default(this, null, new AudioAttributesImplApi26Parcelizer(f, i, null), sampleVideos, 1, null);
        return objAudioAttributesCompatParcelizer$default == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    public final void read(checkSelfPermission checkselfpermission, int i) {
        AudioAttributesCompatParcelizer(IconCompatParcelizer(i));
    }

    public final void read(int p0, float p1, boolean p2) {
        if (this.write.AudioAttributesCompatParcelizer() != p0 || this.write.IconCompatParcelizer() != p1) {
            this.onSetCaptioningEnabled.read();
        }
        this.write.write(p0, p1);
        if (p2) {
            getPathReference getpathreferenceOnPlayFromUri = onPlayFromUri();
            if (getpathreferenceOnPlayFromUri != null) {
                getpathreferenceOnPlayFromUri.MediaBrowserCompatSearchResultReceiver();
                return;
            }
            return;
        }
        setAuxEffectInfo.AudioAttributesCompatParcelizer(this.PlaybackStateCompat);
    }

    public final InputAccessor<getShowPopup> onCommand() {
        return this.PlaybackStateCompat;
    }

    public static /* synthetic */ void IconCompatParcelizer$default(ApicFrame apicFrame, int i, float f, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        apicFrame.IconCompatParcelizer(i, f);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (createFilesDir.read$default(ApicFrame.this, null, this, 1, null) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return ApicFrame.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void IconCompatParcelizer(int p0, float p1) {
        if (AudioAttributesImplApi26Parcelizer()) {
            C0201setMcqCount.IconCompatParcelizer(this.onAddQueueItem.getRemoteActionCompatParcelizer().getOnCommand(), null, null, new MediaBrowserCompatCustomActionResultReceiver(null), 3);
        }
        read(p0, p1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        if (kotlin.getNoBackupFilesDir.AudioAttributesCompatParcelizer$default(r11, null, r3, r4, 1, null) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(int r12, float r13, kotlin.setOrientation<java.lang.Float> r14, kotlin.SampleVideos<? super kotlin.getShowPopup> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof o.ApicFrame.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r15
            o.ApicFrame$RemoteActionCompatParcelizer r0 = (o.ApicFrame.RemoteActionCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.AudioAttributesCompatParcelizer
            int r15 = r15 + r2
            r0.AudioAttributesCompatParcelizer = r15
            goto L19
        L14:
            o.ApicFrame$RemoteActionCompatParcelizer r0 = new o.ApicFrame$RemoteActionCompatParcelizer
            r0.<init>(r15)
        L19:
            r4 = r0
            java.lang.Object r15 = r4.IconCompatParcelizer
            java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
            int r1 = r4.AudioAttributesCompatParcelizer
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L44
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.SdkPayloadData.IconCompatParcelizer(r15)
            goto Lb8
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            float r13 = r4.read
            int r12 = r4.RemoteActionCompatParcelizer
            java.lang.Object r14 = r4.write
            o.setOrientation r14 = (kotlin.setOrientation) r14
            kotlin.SdkPayloadData.IconCompatParcelizer(r15)
        L42:
            r9 = r14
            goto L6d
        L44:
            kotlin.SdkPayloadData.IconCompatParcelizer(r15)
            int r15 = r11.AudioAttributesImplApi21Parcelizer()
            if (r12 != r15) goto L55
            float r15 = r11.MediaDescriptionCompat()
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 == 0) goto L5b
        L55:
            int r15 = r11.write()
            if (r15 != 0) goto L5e
        L5b:
            o.getShowPopup r11 = kotlin.getShowPopup.INSTANCE
            return r11
        L5e:
            r4.write = r14
            r4.RemoteActionCompatParcelizer = r12
            r4.read = r13
            r4.AudioAttributesCompatParcelizer = r3
            java.lang.Object r15 = r11.write(r4)
            if (r15 != r0) goto L42
            goto Lb7
        L6d:
            double r14 = (double) r13
            r5 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r1 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r1 > 0) goto L7a
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 <= 0) goto L90
        L7a:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "pageOffsetFraction "
            r14.<init>(r15)
            r14.append(r13)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            kotlin.getRootStableInsets.RemoteActionCompatParcelizer(r14)
        L90:
            int r7 = r11.IconCompatParcelizer(r12)
            int r12 = r11.onPause()
            float r12 = (float) r12
            r1 = r11
            o.getNoBackupFilesDir r1 = (kotlin.getNoBackupFilesDir) r1
            o.ApicFrame$AudioAttributesCompatParcelizer r14 = new o.ApicFrame$AudioAttributesCompatParcelizer
            float r8 = r13 * r12
            r10 = 0
            r5 = r14
            r6 = r11
            r5.<init>(r7, r8, r9, r10)
            r3 = r14
            o.MagicModuleSubmissionRequestBody r3 = (kotlin.MagicModuleSubmissionRequestBody) r3
            r11 = 0
            r4.write = r11
            r4.AudioAttributesCompatParcelizer = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r11 = kotlin.getNoBackupFilesDir.AudioAttributesCompatParcelizer$default(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto Lb8
        Lb7:
            return r0
        Lb8:
            o.getShowPopup r11 = kotlin.getShowPopup.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ApicFrame.IconCompatParcelizer(int, float, o.setOrientation, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object IconCompatParcelizer$default(ApicFrame apicFrame, int i, float f, setOrientation setorientation, SampleVideos sampleVideos, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            setorientation = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
        }
        return apicFrame.IconCompatParcelizer(i, f, setorientation, sampleVideos);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<checkSelfPermission, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ setOrientation<Float> IconCompatParcelizer;
        final /* synthetic */ int RemoteActionCompatParcelizer;
        int read;
        final /* synthetic */ float write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getAudioSessionId getaudiosessionid = AppInfoTable.read(ApicFrame.this, (checkSelfPermission) this.AudioAttributesImplApi21Parcelizer);
                int i2 = this.RemoteActionCompatParcelizer;
                float f = this.write;
                setOrientation<Float> setorientation = this.IconCompatParcelizer;
                final ApicFrame apicFrame = ApicFrame.this;
                this.read = 1;
                if (GeobFrame.read(getaudiosessionid, i2, f, setorientation, new MagicModuleSubmissionRequestBody() { // from class: o.ChapterFrame
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj2, Object obj3) {
                        return ApicFrame.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(apicFrame, (checkSelfPermission) obj2, ((Integer) obj3).intValue());
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(ApicFrame apicFrame, checkSelfPermission checkselfpermission, int i) {
            apicFrame.read(checkselfpermission, i);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(int i, float f, setOrientation<Float> setorientation, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = i;
            this.write = f;
            this.IconCompatParcelizer = setorientation;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = ApicFrame.this.new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, this.IconCompatParcelizer, sampleVideos);
            audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer = obj;
            return audioAttributesCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(checkSelfPermission checkselfpermission, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(checkselfpermission, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object write(SampleVideos<? super getShowPopup> sampleVideos) {
        if (this.onAddQueueItem.getRemoteActionCompatParcelizer() == GeobFrame.read()) {
            Object objRemoteActionCompatParcelizer = this.onSetPlaybackSpeed.RemoteActionCompatParcelizer(sampleVideos);
            return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r8.AudioAttributesCompatParcelizer(r6, r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object RemoteActionCompatParcelizer(kotlin.ApicFrame r5, kotlin.Flow r6, kotlin.MagicModuleSubmissionRequestBody<? super kotlin.checkSelfPermission, ? super kotlin.SampleVideos<? super kotlin.getShowPopup>, ? extends java.lang.Object> r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            boolean r0 = r8 instanceof o.ApicFrame.AudioAttributesImplApi21Parcelizer
            if (r0 == 0) goto L14
            r0 = r8
            o.ApicFrame$AudioAttributesImplApi21Parcelizer r0 = (o.ApicFrame.AudioAttributesImplApi21Parcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.AudioAttributesCompatParcelizer
            int r8 = r8 + r2
            r0.AudioAttributesCompatParcelizer = r8
            goto L19
        L14:
            o.ApicFrame$AudioAttributesImplApi21Parcelizer r0 = new o.ApicFrame$AudioAttributesImplApi21Parcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.IconCompatParcelizer
            o.ApicFrame r5 = (kotlin.ApicFrame) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L7b
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            java.lang.Object r5 = r0.write
            r7 = r5
            o.MagicModuleSubmissionRequestBody r7 = (kotlin.MagicModuleSubmissionRequestBody) r7
            java.lang.Object r5 = r0.read
            r6 = r5
            o.Flow r6 = (kotlin.Flow) r6
            java.lang.Object r5 = r0.IconCompatParcelizer
            o.ApicFrame r5 = (kotlin.ApicFrame) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L5c
        L4b:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            r0.IconCompatParcelizer = r5
            r0.read = r6
            r0.write = r7
            r0.AudioAttributesCompatParcelizer = r4
            java.lang.Object r8 = r5.write(r0)
            if (r8 == r1) goto L82
        L5c:
            boolean r8 = r5.AudioAttributesImplApi26Parcelizer()
            if (r8 != 0) goto L69
            int r8 = r5.AudioAttributesImplApi21Parcelizer()
            r5.RemoteActionCompatParcelizer(r8)
        L69:
            o.getNoBackupFilesDir r8 = r5.MediaDescriptionCompat
            r0.IconCompatParcelizer = r5
            r2 = 0
            r0.read = r2
            r0.write = r2
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r6 = r8.AudioAttributesCompatParcelizer(r6, r7, r0)
            if (r6 != r1) goto L7b
            goto L82
        L7b:
            r6 = -1
            r5.AudioAttributesCompatParcelizer(r6)
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ApicFrame.RemoteActionCompatParcelizer(o.ApicFrame, o.Flow, o.MagicModuleSubmissionRequestBody, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.getNoBackupFilesDir
    public float RemoteActionCompatParcelizer(float p0) {
        return this.MediaDescriptionCompat.RemoteActionCompatParcelizer(p0);
    }

    @Override // kotlin.getNoBackupFilesDir
    public boolean AudioAttributesImplApi26Parcelizer() {
        return this.MediaDescriptionCompat.AudioAttributesImplApi26Parcelizer();
    }

    private final void IconCompatParcelizer(boolean z) {
        this.ParcelableVolumeInfo.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getNoBackupFilesDir
    public final boolean AudioAttributesCompatParcelizer() {
        return ((Boolean) this.ParcelableVolumeInfo.getRemoteActionCompatParcelizer()).booleanValue();
    }

    private final void write(boolean z) {
        this.MediaSessionCompatToken.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getNoBackupFilesDir
    public final boolean read() {
        return ((Boolean) this.MediaSessionCompatToken.getRemoteActionCompatParcelizer()).booleanValue();
    }

    public boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.MediaSessionCompatResultReceiverWrapper.getRemoteActionCompatParcelizer().booleanValue();
    }

    public static /* synthetic */ void write$default(ApicFrame apicFrame, removeEventListener removeeventlistener, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        apicFrame.write(removeeventlistener, z, z2);
    }

    public final void write(removeEventListener p0, boolean p1, boolean p2) {
        this.onPrepareFromUri.write(p0.RatingCompat().size());
        this.onFastForward = p0.getAudioAttributesCompatParcelizer() + p0.getRemoteActionCompatParcelizer();
        if (!p1 && this.RemoteActionCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = p0;
            return;
        }
        if (p1) {
            this.RemoteActionCompatParcelizer = true;
        }
        if (p2) {
            this.write.AudioAttributesCompatParcelizer(p0.getMediaBrowserCompatSearchResultReceiver());
        } else {
            this.write.AudioAttributesCompatParcelizer(p0);
            if (getDesignInfoListui_tooling.AudioAttributesImplApi21Parcelizer) {
                if (this.MediaBrowserCompatMediaItem) {
                    this.onSetCaptioningEnabled.read(p0);
                }
            } else {
                IconCompatParcelizer(p0);
            }
        }
        this.onAddQueueItem.write(p0);
        IconCompatParcelizer(p0.getMediaMetadataCompat());
        write(p0.MediaBrowserCompatMediaItem());
        getMediaItem mediaBrowserCompatItemReceiver = p0.getMediaBrowserCompatItemReceiver();
        if (mediaBrowserCompatItemReceiver != null) {
            this.AudioAttributesImplBaseParcelizer = mediaBrowserCompatItemReceiver.getWrite();
        }
        this.AudioAttributesImplApi21Parcelizer = p0.getMediaBrowserCompatMediaItem();
        write(p0);
        this.MediaBrowserCompatCustomActionResultReceiver = GeobFrame.RemoteActionCompatParcelizer((addDrmEventListener) p0, write());
        this.MediaBrowserCompatItemReceiver = getQues.AudioAttributesCompatParcelizer(GeobFrame.read(p0, write()), this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private final void write(removeEventListener p0) {
        parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
        parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
        getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
        parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
        try {
            if (this.MediaBrowserCompatMediaItem) {
                if (p0.getAudioAttributesImplApi26Parcelizer() >= write()) {
                    return;
                }
                if (Math.abs(this.RatingCompat) <= 0.5f) {
                    return;
                }
                if (AudioAttributesCompatParcelizer(this.RatingCompat)) {
                    if (getDesignInfoListui_tooling.AudioAttributesImplApi21Parcelizer) {
                        this.onSetCaptioningEnabled.AudioAttributesCompatParcelizer(this.RatingCompat, p0);
                    } else {
                        IconCompatParcelizer(this.RatingCompat, p0);
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
            }
        } finally {
            companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int IconCompatParcelizer(int i) {
        if (write() > 0) {
            return getQues.write(i, 0, write() - 1);
        }
        return 0;
    }

    private final boolean AudioAttributesCompatParcelizer(float p0) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getIconCompatParcelizer() == superDispatchKeyEvent.write) {
            if (Math.signum(p0) == Math.signum(-Float.intBitsToFloat((int) onRewind()))) {
                return true;
            }
        } else if (Math.signum(p0) == Math.signum(-Float.intBitsToFloat((int) (onRewind() >> 32)))) {
            return true;
        }
        return onSeekTo();
    }

    public final boolean onSeekTo() {
        return ((int) Float.intBitsToFloat((int) (onRewind() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) onRewind())) == 0;
    }

    private final void IconCompatParcelizer(float p0, addDrmEventListener p1) {
        getCurrentTrackSelections.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        getCurrentTrackSelections.RemoteActionCompatParcelizer remoteActionCompatParcelizer2;
        getCurrentTrackSelections.RemoteActionCompatParcelizer remoteActionCompatParcelizer3;
        if (!this.MediaBrowserCompatMediaItem || p1.RatingCompat().isEmpty()) {
            return;
        }
        boolean z = p0 > BitmapDescriptorFactory.HUE_RED;
        int iIconCompatParcelizer = IconCompatParcelizer(z, p1);
        if (iIconCompatParcelizer < 0 || iIconCompatParcelizer >= write()) {
            return;
        }
        if (iIconCompatParcelizer != this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            if (this.handleMediaPlayPauseIfPendingOnHandler != z && (remoteActionCompatParcelizer3 = this.onCommand) != null) {
                remoteActionCompatParcelizer3.AudioAttributesCompatParcelizer();
            }
            this.handleMediaPlayPauseIfPendingOnHandler = z;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iIconCompatParcelizer;
            this.onCommand = getCurrentTrackSelections.AudioAttributesCompatParcelizer$default(this.onPrepareFromUri, iIconCompatParcelizer, this.onSkipToQueueItem, null, 4, null);
        }
        if (z) {
            if ((((createPeriod) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) p1.RatingCompat())).getMediaBrowserCompatMediaItem() + (p1.getAudioAttributesCompatParcelizer() + p1.getRemoteActionCompatParcelizer())) - p1.getAudioAttributesImplApi21Parcelizer() >= p0 || (remoteActionCompatParcelizer2 = this.onCommand) == null) {
                return;
            }
            remoteActionCompatParcelizer2.write();
            return;
        }
        if (p1.getMediaBrowserCompatCustomActionResultReceiver() - ((createPeriod) IntermediateLoginResponseBody.RatingCompat((List) p1.RatingCompat())).getMediaBrowserCompatMediaItem() >= (-p0) || (remoteActionCompatParcelizer = this.onCommand) == null) {
            return;
        }
        remoteActionCompatParcelizer.write();
    }

    private final void IconCompatParcelizer(addDrmEventListener p0) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == -1 || p0.RatingCompat().isEmpty()) {
            return;
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, p0)) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
            getCurrentTrackSelections.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onCommand;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            }
            this.onCommand = null;
        }
    }

    private final int IconCompatParcelizer(boolean p0, addDrmEventListener p1) {
        if (p0) {
            int audioAttributesImplApi26Parcelizer = p1.getAudioAttributesImplApi26Parcelizer() + 1;
            if (audioAttributesImplApi26Parcelizer < 0) {
                return Integer.MAX_VALUE;
            }
            return ((createPeriod) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) p1.RatingCompat())).getWrite() + audioAttributesImplApi26Parcelizer;
        }
        return (((createPeriod) IntermediateLoginResponseBody.RatingCompat((List) p1.RatingCompat())).getWrite() - p1.getAudioAttributesImplApi26Parcelizer()) - 1;
    }

    public final int IconCompatParcelizer(disable p0, int p1) {
        return this.write.RemoteActionCompatParcelizer(p0, p1);
    }

    public ApicFrame() {
        this(0, BitmapDescriptorFactory.HUE_RED, null, 7, null);
    }

    @Override // kotlin.getNoBackupFilesDir
    public Object AudioAttributesCompatParcelizer(Flow flow, MagicModuleSubmissionRequestBody<? super checkSelfPermission, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
        return RemoteActionCompatParcelizer(this, flow, magicModuleSubmissionRequestBody, sampleVideos);
    }
}
