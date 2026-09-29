package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin.zznc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\tj\u0002\b\u0012j\u0002\b\u000bj\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u0014j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u000ej\u0002\b\u001cj\u0002\b\u001d"}, d2 = {"Lo/AllocatorAllocationNode;", "", "Lo/BandwidthMeter;", "p0", "", "p1", "<init>", "(Ljava/lang/String;ILo/BandwidthMeter;Ljava/util/List;)V", "", "IconCompatParcelizer", "()Z", "write", "handleMediaPlayPauseIfPendingOnHandler", "Lo/BandwidthMeter;", "RemoteActionCompatParcelizer", "()Lo/BandwidthMeter;", "onAddQueueItem", "Ljava/util/List;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;", "read", "MediaDescriptionCompat", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatMediaItem", "RatingCompat", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AllocatorAllocationNode {
    public static final AllocatorAllocationNode AudioAttributesCompatParcelizer;
    public static final AllocatorAllocationNode AudioAttributesImplApi21Parcelizer;
    public static final AllocatorAllocationNode AudioAttributesImplApi26Parcelizer;
    public static final AllocatorAllocationNode AudioAttributesImplBaseParcelizer;
    public static final AllocatorAllocationNode IconCompatParcelizer;
    public static final AllocatorAllocationNode MediaBrowserCompatCustomActionResultReceiver;
    public static final AllocatorAllocationNode MediaBrowserCompatItemReceiver;
    public static final AllocatorAllocationNode MediaBrowserCompatMediaItem;
    public static final AllocatorAllocationNode MediaBrowserCompatSearchResultReceiver;
    private static int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1;
    public static final AllocatorAllocationNode MediaDescriptionCompat;
    private static final /* synthetic */ getMagicModuleSavedMcqCount MediaMetadataCompat;
    public static final AllocatorAllocationNode RatingCompat;
    public static final AllocatorAllocationNode RemoteActionCompatParcelizer;
    private static final /* synthetic */ AllocatorAllocationNode[] onCommand;
    private static int onCustomAction = 0;
    private static int onFastForward = 1;
    private static int onMediaButtonEvent;
    public static final AllocatorAllocationNode read;
    public static final AllocatorAllocationNode write;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final BandwidthMeter write;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final List<AllocatorAllocationNode> read;

    private AllocatorAllocationNode(String str, int i, BandwidthMeter bandwidthMeter, List list) {
        this.write = bandwidthMeter;
        this.read = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ AllocatorAllocationNode(String str, int i, BandwidthMeter bandwidthMeter, List list, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i2 & 2) != 0) {
            int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 91;
            onCustomAction = i3 % 128;
            if (i3 % 2 != 0) {
                list = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                int i4 = 46 / 0;
            } else {
                list = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            int i5 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            int i6 = i5 & 111;
            int i7 = (i6 - (~((i5 ^ 111) | i6))) - 1;
            onCustomAction = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
        }
        this(str, i, bandwidthMeter, list);
    }

    public final BandwidthMeter RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 & 53;
        int i4 = (i2 ^ 53) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        BandwidthMeter bandwidthMeter = this.write;
        if (i6 == 0) {
            int i7 = 76 / 0;
        }
        return bandwidthMeter;
    }

    public final List<AllocatorAllocationNode> AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 ^ 91;
        int i4 = (((i2 & 91) | i3) << 1) - i3;
        int i5 = i4 % 128;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<AllocatorAllocationNode> list = this.read;
        int i6 = i5 & 125;
        int i7 = i5 | 125;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        onCustomAction = i8 % 128;
        int i9 = i8 % 2;
        return list;
    }

    static {
        AllocatorAllocationNode allocatorAllocationNode = new AllocatorAllocationNode("USER_SYNC", 0, BandwidthMeter.AudioAttributesCompatParcelizer, null, 2, null);
        MediaDescriptionCompat = allocatorAllocationNode;
        AllocatorAllocationNode allocatorAllocationNode2 = new AllocatorAllocationNode("SUBJECT_SYNC", 1, BandwidthMeter.read, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(allocatorAllocationNode));
        MediaBrowserCompatItemReceiver = allocatorAllocationNode2;
        IconCompatParcelizer = new AllocatorAllocationNode("FEATURE_CARD_SYNC", 2, BandwidthMeter.read, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(allocatorAllocationNode));
        AudioAttributesCompatParcelizer = new AllocatorAllocationNode("COURSE_CONFIG_SYNC", 3, BandwidthMeter.read, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(allocatorAllocationNode));
        write = new AllocatorAllocationNode("LESSON_SYNC", 4, BandwidthMeter.read, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(allocatorAllocationNode));
        MediaBrowserCompatMediaItem = new AllocatorAllocationNode("TEST_SYNC", 5, BandwidthMeter.write, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(allocatorAllocationNode));
        RatingCompat = new AllocatorAllocationNode("TRACK_USER_SYNC", 6, BandwidthMeter.write, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(allocatorAllocationNode));
        AudioAttributesImplApi21Parcelizer = new AllocatorAllocationNode("PEARL_SYNC", 7, BandwidthMeter.write, IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new AllocatorAllocationNode[]{allocatorAllocationNode, allocatorAllocationNode2}));
        read = new AllocatorAllocationNode("MCQ_BOOKMARK_SYNC", 8, BandwidthMeter.write, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(allocatorAllocationNode));
        MediaBrowserCompatSearchResultReceiver = new AllocatorAllocationNode("VIDEO_TIMELINE_BOOKMARK_SYNC", 9, BandwidthMeter.write, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(allocatorAllocationNode));
        AudioAttributesImplApi26Parcelizer = new AllocatorAllocationNode("PEARL_BOOKMARK_SYNC", 10, BandwidthMeter.write, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(allocatorAllocationNode));
        RemoteActionCompatParcelizer = new AllocatorAllocationNode("CROSS_DEVICE_SYNC", 11, BandwidthMeter.write, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(allocatorAllocationNode));
        MediaBrowserCompatCustomActionResultReceiver = new AllocatorAllocationNode("SCHEMA_SYNC", 12, BandwidthMeter.write, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(allocatorAllocationNode));
        AllocatorAllocationNode allocatorAllocationNode3 = new AllocatorAllocationNode("NON_DEFAULT_EDITION_SYNC", 13, BandwidthMeter.write, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(allocatorAllocationNode));
        int i = onFastForward;
        int i2 = ((i | 95) << 1) - (i ^ 95);
        onMediaButtonEvent = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplBaseParcelizer = allocatorAllocationNode3;
        AllocatorAllocationNode[] allocatorAllocationNodeArrAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        if (i3 != 0) {
            onCommand = allocatorAllocationNodeArrAudioAttributesImplBaseParcelizer;
            MediaMetadataCompat = getMagicModuleTimeline.IconCompatParcelizer(allocatorAllocationNodeArrAudioAttributesImplBaseParcelizer);
            int i4 = 21 / 0;
        } else {
            onCommand = allocatorAllocationNodeArrAudioAttributesImplBaseParcelizer;
            MediaMetadataCompat = getMagicModuleTimeline.IconCompatParcelizer(allocatorAllocationNodeArrAudioAttributesImplBaseParcelizer);
        }
        int i5 = onMediaButtonEvent + 113;
        onFastForward = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r5 = kotlin.AllocatorAllocationNode.onCustomAction;
        r2 = ((r5 & 78) + (r5 | 78)) - 1;
        kotlin.AllocatorAllocationNode.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r5 == kotlin.BandwidthMeter.read) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r5 == kotlin.BandwidthMeter.read) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r5 = kotlin.AllocatorAllocationNode.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        r1 = r5 ^ 1;
        r5 = ((r5 & 1) | r1) << 1;
        r1 = -r1;
        r2 = ((r5 | r1) << 1) - (r5 ^ r1);
        r5 = r2 % 128;
        kotlin.AllocatorAllocationNode.onCustomAction = r5;
        r2 = r2 % 2;
        r1 = r5 ^ 55;
        r5 = ((((r5 & 55) | r1) << 1) - (~(-r1))) - 1;
        kotlin.AllocatorAllocationNode.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean IconCompatParcelizer() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.AllocatorAllocationNode.onCustomAction
            r2 = r1 & (-108(0xffffffffffffff94, float:NaN))
            int r3 = ~r1
            r3 = r3 & 107(0x6b, float:1.5E-43)
            r2 = r2 | r3
            r1 = r1 & 107(0x6b, float:1.5E-43)
            r3 = 1
            int r1 = r1 << r3
            int r2 = r2 + r1
            int r1 = r2 % 128
            kotlin.AllocatorAllocationNode.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r1
            int r2 = r2 % r0
            r1 = 0
            o.BandwidthMeter r5 = r5.write
            if (r2 != 0) goto L22
            o.BandwidthMeter r2 = kotlin.BandwidthMeter.read
            r4 = 61
            int r4 = r4 / r1
            if (r5 != r2) goto L48
            goto L26
        L22:
            o.BandwidthMeter r2 = kotlin.BandwidthMeter.read
            if (r5 != r2) goto L48
        L26:
            int r5 = kotlin.AllocatorAllocationNode.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            r1 = r5 ^ 1
            r5 = r5 & r3
            r5 = r5 | r1
            int r5 = r5 << r3
            int r1 = -r1
            r2 = r5 | r1
            int r2 = r2 << r3
            r5 = r5 ^ r1
            int r2 = r2 - r5
            int r5 = r2 % 128
            kotlin.AllocatorAllocationNode.onCustomAction = r5
            int r2 = r2 % r0
            r1 = r5 ^ 55
            r5 = r5 & 55
            r5 = r5 | r1
            int r5 = r5 << r3
            int r1 = -r1
            int r1 = ~r1
            int r5 = r5 - r1
            int r5 = r5 - r3
            int r1 = r5 % 128
            kotlin.AllocatorAllocationNode.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r1
            int r5 = r5 % r0
            return r3
        L48:
            int r5 = kotlin.AllocatorAllocationNode.onCustomAction
            r2 = r5 & 78
            r5 = r5 | 78
            int r2 = r2 + r5
            int r2 = r2 - r3
            int r5 = r2 % 128
            kotlin.AllocatorAllocationNode.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r5
            int r2 = r2 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AllocatorAllocationNode.IconCompatParcelizer():boolean");
    }

    public final boolean write() {
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = ((i2 & 114) + (i2 | 114)) - 1;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        if (this.write == BandwidthMeter.AudioAttributesCompatParcelizer) {
            int i5 = onCustomAction;
            int i6 = (((i5 | 122) << 1) - (i5 ^ 122)) - 1;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = (-2) - ((onCustomAction + 120) ^ (-1));
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ AllocatorAllocationNode[] AudioAttributesImplBaseParcelizer() {
        AllocatorAllocationNode allocatorAllocationNode;
        AllocatorAllocationNode allocatorAllocationNode2;
        AllocatorAllocationNode allocatorAllocationNode3;
        AllocatorAllocationNode allocatorAllocationNode4;
        char c;
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i3 = i2 | 115;
        int i4 = (i3 << 1) - (i3 & (~(i2 & 115)));
        onCustomAction = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        AllocatorAllocationNode allocatorAllocationNode5 = MediaDescriptionCompat;
        AllocatorAllocationNode allocatorAllocationNode6 = MediaBrowserCompatItemReceiver;
        AllocatorAllocationNode allocatorAllocationNode7 = IconCompatParcelizer;
        AllocatorAllocationNode allocatorAllocationNode8 = AudioAttributesCompatParcelizer;
        AllocatorAllocationNode allocatorAllocationNode9 = write;
        AllocatorAllocationNode allocatorAllocationNode10 = MediaBrowserCompatMediaItem;
        AllocatorAllocationNode allocatorAllocationNode11 = RatingCompat;
        AllocatorAllocationNode allocatorAllocationNode12 = AudioAttributesImplApi21Parcelizer;
        AllocatorAllocationNode allocatorAllocationNode13 = read;
        AllocatorAllocationNode allocatorAllocationNode14 = MediaBrowserCompatSearchResultReceiver;
        int i5 = (i2 & 70) + (i2 | 70);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        int i7 = i6 % 128;
        onCustomAction = i7;
        if (i6 % 2 != 0) {
            allocatorAllocationNode = AudioAttributesImplApi26Parcelizer;
            allocatorAllocationNode2 = RemoteActionCompatParcelizer;
            allocatorAllocationNode3 = MediaBrowserCompatCustomActionResultReceiver;
            allocatorAllocationNode4 = AudioAttributesImplBaseParcelizer;
            int i8 = 93 / 0;
        } else {
            allocatorAllocationNode = AudioAttributesImplApi26Parcelizer;
            allocatorAllocationNode2 = RemoteActionCompatParcelizer;
            allocatorAllocationNode3 = MediaBrowserCompatCustomActionResultReceiver;
            allocatorAllocationNode4 = AudioAttributesImplBaseParcelizer;
        }
        int i9 = i7 & 97;
        int i10 = -(-((i7 ^ 97) | i9));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        int i12 = i11 % 128;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i12;
        int i13 = i11 % 2;
        AllocatorAllocationNode[] allocatorAllocationNodeArr = new AllocatorAllocationNode[14];
        allocatorAllocationNodeArr[0] = allocatorAllocationNode5;
        allocatorAllocationNodeArr[1] = allocatorAllocationNode6;
        allocatorAllocationNodeArr[2] = allocatorAllocationNode7;
        int i14 = i12 & 33;
        int i15 = -(-((i12 ^ 33) | i14));
        int i16 = (i14 & i15) + (i14 | i15);
        int i17 = i16 % 128;
        onCustomAction = i17;
        if (i16 % 2 != 0) {
            allocatorAllocationNodeArr[5] = allocatorAllocationNode8;
            allocatorAllocationNodeArr[2] = allocatorAllocationNode9;
            allocatorAllocationNodeArr[4] = allocatorAllocationNode10;
            c = '\t';
        } else {
            allocatorAllocationNodeArr[3] = allocatorAllocationNode8;
            allocatorAllocationNodeArr[4] = allocatorAllocationNode9;
            allocatorAllocationNodeArr[5] = allocatorAllocationNode10;
            c = 6;
        }
        allocatorAllocationNodeArr[c] = allocatorAllocationNode11;
        allocatorAllocationNodeArr[7] = allocatorAllocationNode12;
        allocatorAllocationNodeArr[8] = allocatorAllocationNode13;
        int i18 = ((i17 & (-126)) | ((~i17) & 125)) + ((i17 & 125) << 1);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i18 % 128;
        int i19 = i18 % 2;
        allocatorAllocationNodeArr[9] = allocatorAllocationNode14;
        allocatorAllocationNodeArr[10] = allocatorAllocationNode;
        allocatorAllocationNodeArr[11] = allocatorAllocationNode2;
        zznc.AnonymousClass4.IconCompatParcelizer();
        zznc.AnonymousClass4.IconCompatParcelizer();
        allocatorAllocationNodeArr[12] = allocatorAllocationNode3;
        allocatorAllocationNodeArr[13] = allocatorAllocationNode4;
        int i20 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 61;
        onCustomAction = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 80 / 0;
        }
        return allocatorAllocationNodeArr;
    }

    public static getMagicModuleSavedMcqCount<AllocatorAllocationNode> read() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i3 = i2 & 125;
        int i4 = (i2 ^ 125) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        onCustomAction = i6;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getMagicModuleSavedMcqCount<AllocatorAllocationNode> getmagicmodulesavedmcqcount = MediaMetadataCompat;
        int i7 = i6 | 73;
        int i8 = i7 << 1;
        int i9 = -((~(i6 & 73)) & i7);
        int i10 = (i8 & i9) + (i9 | i8);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i10 % 128;
        int i11 = i10 % 2;
        return getmagicmodulesavedmcqcount;
    }

    public static AllocatorAllocationNode valueOf(String str) {
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 & 69;
        int i4 = ((i2 ^ 69) | i3) << 1;
        int i5 = -((i2 | 69) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i6 % 128;
        int i7 = i6 % 2;
        AllocatorAllocationNode allocatorAllocationNode = (AllocatorAllocationNode) Enum.valueOf(AllocatorAllocationNode.class, str);
        int i8 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i9 = i8 & 3;
        int i10 = (i8 ^ 3) | i9;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        onCustomAction = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 86 / 0;
        }
        return allocatorAllocationNode;
    }

    public static AllocatorAllocationNode[] values() {
        AllocatorAllocationNode[] allocatorAllocationNodeArr;
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = (i2 & 17) + (i2 | 17);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        AllocatorAllocationNode[] allocatorAllocationNodeArr2 = onCommand;
        if (i4 == 0) {
            allocatorAllocationNodeArr = (AllocatorAllocationNode[]) allocatorAllocationNodeArr2.clone();
            int i5 = 51 / 0;
        } else {
            allocatorAllocationNodeArr = (AllocatorAllocationNode[]) allocatorAllocationNodeArr2.clone();
        }
        int i6 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 29;
        onCustomAction = i6 % 128;
        int i7 = i6 % 2;
        return allocatorAllocationNodeArr;
    }
}
