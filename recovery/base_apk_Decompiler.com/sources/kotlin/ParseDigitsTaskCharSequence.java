package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.charsToString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\n\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011BI\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0011\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0014\u001a\u00020\u00012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0011\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH\u0010¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u0011\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\tH\u0010¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u0017JG\u0010\u0014\u001a\u00020\u00132\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020!0 2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010$J\u000f\u0010\u001a\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001a\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0000¢\u0006\u0004\b\u001b\u0010%J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020&H\u0000¢\u0006\u0004\b\u0014\u0010'J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020(H\u0000¢\u0006\u0004\b\u0011\u0010)J\u000f\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010\u0017J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0011\u0010+J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020!H\u0010¢\u0006\u0004\b\u001a\u0010,R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0011X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0011X\u0091\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0014\u0010\u0016\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0010R\"\u0010\u0014\u001a\u00020&8\u0011@\u0011X\u0091\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b\u001a\u0010'R*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0011@\u0011X\u0091\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b6\u00108\"\u0004\b\u001a\u00109R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010:8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u001a\u0010;R\u001c\u0010-\u001a\u00020\u00058\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b<\u0010?R\u001c\u0010A\u001a\u00020(8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b<\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010=\u001a\u00020&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u00103R\"\u00106\u001a\u00020\u000e8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bA\u0010C\u001a\u0004\b=\u0010\u0010\"\u0004\b\u001a\u0010D"}, d2 = {"Lo/ParseDigitsTaskCharSequence;", "Lo/parseDigitsRecursive;", "", "Lo/SnapshotId;", "p0", "Lo/toChars;", "p1", "Lkotlin/Function1;", "", "", "p2", "p3", "<init>", "(JLo/toChars;Lo/getAnswerMap;Lo/getAnswerMap;)V", "", "MediaDescriptionCompat", "()Z", "AudioAttributesCompatParcelizer", "(Lo/getAnswerMap;Lo/getAnswerMap;)Lo/ParseDigitsTaskCharSequence;", "Lo/charsToString;", "IconCompatParcelizer", "()Lo/charsToString;", "write", "()V", "(Lo/getAnswerMap;)Lo/parseDigitsRecursive;", "(Lo/parseDigitsRecursive;)V", "read", "RemoteActionCompatParcelizer", "onAddQueueItem", "onPrepareFromMediaId", "onPlayFromUri", "onPlay", "Lo/setEmojiCompatEnabled;", "Lo/tryMatch;", "", "Lo/reportWeirdUCS4;", "(JLo/setEmojiCompatEnabled;Ljava/util/Map;Lo/toChars;)Lo/charsToString;", "(J)V", "", "(I)V", "", "([I)V", "onPrepare", "(Lo/toChars;)V", "(Lo/tryMatch;)V", "AudioAttributesImplApi26Parcelizer", "Lo/getAnswerMap;", "RatingCompat", "()Lo/getAnswerMap;", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "I", "MediaBrowserCompatMediaItem", "()I", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setEmojiCompatEnabled;", "()Lo/setEmojiCompatEnabled;", "(Lo/setEmojiCompatEnabled;)V", "", "Ljava/util/List;", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/toChars;", "()Lo/toChars;", "[I", "MediaBrowserCompatItemReceiver", "()[I", "Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ParseDigitsTaskCharSequence extends parseDigitsRecursive {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private toChars AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getAnswerMap<Object, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private int[] MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private setEmojiCompatEnabled<tryMatch> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final getAnswerMap<Object, getShowPopup> read;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public List<? extends tryMatch> AudioAttributesImplBaseParcelizer;
    private static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(null);
    public static final int RemoteActionCompatParcelizer = 8;
    private static final int[] IconCompatParcelizer = new int[0];

    @Override // kotlin.parseDigitsRecursive
    public boolean MediaBrowserCompatSearchResultReceiver() {
        return false;
    }

    public ParseDigitsTaskCharSequence(long j, toChars tochars, getAnswerMap<Object, getShowPopup> getanswermap, getAnswerMap<Object, getShowPopup> getanswermap2) {
        super(j, tochars, null);
        this.RemoteActionCompatParcelizer = getanswermap;
        this.read = getanswermap2;
        this.AudioAttributesImplApi26Parcelizer = toChars.INSTANCE.read();
        this.MediaBrowserCompatItemReceiver = IconCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = 1;
    }

    @Override // kotlin.parseDigitsRecursive
    /* JADX INFO: renamed from: RatingCompat, reason: merged with bridge method [inline-methods] */
    public getAnswerMap<Object, getShowPopup> AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.parseDigitsRecursive
    public getAnswerMap<Object, getShowPopup> MediaMetadataCompat() {
        return this.read;
    }

    public boolean MediaDescriptionCompat() {
        setEmojiCompatEnabled<tryMatch> setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        return setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver != null && setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer();
    }

    public ParseDigitsTaskCharSequence AudioAttributesCompatParcelizer(getAnswerMap<Object, getShowPopup> p0, getAnswerMap<Object, getShowPopup> p1) {
        getAnswerMap<Object, getShowPopup> getanswermap;
        getAnswerMap<Object, getShowPopup> getanswermap2;
        Map<child, rootDetector> mapIconCompatParcelizer;
        JavaFloatBitsFromCharSequence javaFloatBitsFromCharSequence;
        onPlayFromMediaId();
        onPlayFromUri();
        ParseDigitsTaskCharSequence parseDigitsTaskCharSequence = this;
        AbstractFloatValueParser abstractFloatValueParser = DupDetector.read;
        if (abstractFloatValueParser != null) {
            Pair<rootDetector, Map<child, rootDetector>> pairAudioAttributesCompatParcelizer = DupDetector.AudioAttributesCompatParcelizer(abstractFloatValueParser, parseDigitsTaskCharSequence, false, p0, p1);
            rootDetector rootdetectorWrite = pairAudioAttributesCompatParcelizer.write();
            getAnswerMap<Object, getShowPopup> getanswermapWrite = rootdetectorWrite.write();
            getanswermap2 = rootdetectorWrite.read();
            mapIconCompatParcelizer = pairAudioAttributesCompatParcelizer.IconCompatParcelizer();
            getanswermap = getanswermapWrite;
        } else {
            getanswermap = p0;
            getanswermap2 = p1;
            mapIconCompatParcelizer = null;
        }
        RemoteActionCompatParcelizer(getIconCompatParcelizer());
        synchronized (toChars3.MediaBrowserCompatMediaItem()) {
            long j = toChars3.AudioAttributesImplApi21Parcelizer;
            toChars3.AudioAttributesImplApi21Parcelizer++;
            toChars3.AudioAttributesImplBaseParcelizer = toChars3.AudioAttributesImplBaseParcelizer.write(j);
            toChars write = getWrite();
            RemoteActionCompatParcelizer(write.write(j));
            javaFloatBitsFromCharSequence = new JavaFloatBitsFromCharSequence(j, toChars3.IconCompatParcelizer(write, getIconCompatParcelizer() + 1, j), toChars3.read$default((getAnswerMap) getanswermap, (getAnswerMap) AudioAttributesImplApi26Parcelizer(), false, 4, (Object) null), toChars3.IconCompatParcelizer(getanswermap2, MediaMetadataCompat()), this);
        }
        if (!getMediaBrowserCompatCustomActionResultReceiver() && !getRead()) {
            long iconCompatParcelizer = getIconCompatParcelizer();
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                long j2 = toChars3.AudioAttributesImplApi21Parcelizer;
                toChars3.AudioAttributesImplApi21Parcelizer++;
                read(j2);
                toChars3.AudioAttributesImplBaseParcelizer = toChars3.AudioAttributesImplBaseParcelizer.write(getIconCompatParcelizer());
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            RemoteActionCompatParcelizer(toChars3.IconCompatParcelizer(getWrite(), iconCompatParcelizer + 1, getIconCompatParcelizer()));
        }
        JavaFloatBitsFromCharSequence javaFloatBitsFromCharSequence2 = javaFloatBitsFromCharSequence;
        if (abstractFloatValueParser != null) {
            DupDetector.RemoteActionCompatParcelizer(abstractFloatValueParser, parseDigitsTaskCharSequence, javaFloatBitsFromCharSequence2, mapIconCompatParcelizer);
        }
        return javaFloatBitsFromCharSequence2;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kotlin.charsToString IconCompatParcelizer() {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ParseDigitsTaskCharSequence.IconCompatParcelizer():o.charsToString");
    }

    @Override // kotlin.parseDigitsRecursive
    public void write() {
        if (getRead()) {
            return;
        }
        super.write();
        ParseDigitsTaskCharSequence parseDigitsTaskCharSequence = this;
        read(parseDigitsTaskCharSequence);
        DupDetector.write(parseDigitsTaskCharSequence);
    }

    @Override // kotlin.parseDigitsRecursive
    public parseDigitsRecursive IconCompatParcelizer(getAnswerMap<Object, getShowPopup> p0) {
        getAnswerMap<Object, getShowPopup> getanswermap;
        Map<child, rootDetector> mapIconCompatParcelizer;
        JavaFloatBitsFromByteArray javaFloatBitsFromByteArray;
        onPlayFromMediaId();
        onPlayFromUri();
        long iconCompatParcelizer = getIconCompatParcelizer();
        ParseDigitsTaskCharSequence parseDigitsTaskCharSequence = this instanceof JavaDoubleBitsFromCharArray ? null : this;
        AbstractFloatValueParser abstractFloatValueParser = DupDetector.read;
        if (abstractFloatValueParser != null) {
            Pair<rootDetector, Map<child, rootDetector>> pairAudioAttributesCompatParcelizer = DupDetector.AudioAttributesCompatParcelizer(abstractFloatValueParser, parseDigitsTaskCharSequence, true, p0, null);
            rootDetector rootdetectorWrite = pairAudioAttributesCompatParcelizer.write();
            getAnswerMap<Object, getShowPopup> getanswermapWrite = rootdetectorWrite.write();
            rootdetectorWrite.read();
            mapIconCompatParcelizer = pairAudioAttributesCompatParcelizer.IconCompatParcelizer();
            getanswermap = getanswermapWrite;
        } else {
            getanswermap = p0;
            mapIconCompatParcelizer = null;
        }
        RemoteActionCompatParcelizer(getIconCompatParcelizer());
        synchronized (toChars3.MediaBrowserCompatMediaItem()) {
            long j = toChars3.AudioAttributesImplApi21Parcelizer;
            toChars3.AudioAttributesImplApi21Parcelizer++;
            toChars3.AudioAttributesImplBaseParcelizer = toChars3.AudioAttributesImplBaseParcelizer.write(j);
            javaFloatBitsFromByteArray = new JavaFloatBitsFromByteArray(j, toChars3.IconCompatParcelizer(getWrite(), iconCompatParcelizer + 1, j), toChars3.read$default((getAnswerMap) getanswermap, (getAnswerMap) AudioAttributesImplApi26Parcelizer(), false, 4, (Object) null), this);
        }
        if (!getMediaBrowserCompatCustomActionResultReceiver() && !getRead()) {
            long iconCompatParcelizer2 = getIconCompatParcelizer();
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                long j2 = toChars3.AudioAttributesImplApi21Parcelizer;
                toChars3.AudioAttributesImplApi21Parcelizer++;
                read(j2);
                toChars3.AudioAttributesImplBaseParcelizer = toChars3.AudioAttributesImplBaseParcelizer.write(getIconCompatParcelizer());
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            RemoteActionCompatParcelizer(toChars3.IconCompatParcelizer(getWrite(), iconCompatParcelizer2 + 1, getIconCompatParcelizer()));
        }
        JavaFloatBitsFromByteArray javaFloatBitsFromByteArray2 = javaFloatBitsFromByteArray;
        if (abstractFloatValueParser != null) {
            DupDetector.RemoteActionCompatParcelizer(abstractFloatValueParser, parseDigitsTaskCharSequence, javaFloatBitsFromByteArray2, mapIconCompatParcelizer);
        }
        return javaFloatBitsFromByteArray2;
    }

    @Override // kotlin.parseDigitsRecursive
    public void AudioAttributesCompatParcelizer(parseDigitsRecursive p0) {
        this.AudioAttributesImplApi21Parcelizer++;
    }

    @Override // kotlin.parseDigitsRecursive
    public void read(parseDigitsRecursive p0) {
        if (this.AudioAttributesImplApi21Parcelizer <= 0) {
            getInputCodeUtf8JsNames.write("no pending nested snapshots");
        }
        int i = this.AudioAttributesImplApi21Parcelizer - 1;
        this.AudioAttributesImplApi21Parcelizer = i;
        if (i != 0 || this.MediaBrowserCompatCustomActionResultReceiver) {
            return;
        }
        onPlay();
    }

    @Override // kotlin.parseDigitsRecursive
    public void RemoteActionCompatParcelizer() {
        if (this.MediaBrowserCompatCustomActionResultReceiver || getRead()) {
            return;
        }
        read();
    }

    @Override // kotlin.parseDigitsRecursive
    public void AudioAttributesCompatParcelizer() {
        toChars3.AudioAttributesImplBaseParcelizer = toChars3.AudioAttributesImplBaseParcelizer.read(getIconCompatParcelizer()).RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
    }

    @Override // kotlin.parseDigitsRecursive
    public void onAddQueueItem() {
        onPrepare();
        super.onAddQueueItem();
    }

    private final void onPrepareFromMediaId() {
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            getInputCodeUtf8JsNames.read("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void onPlayFromUri() {
        if (!this.MediaBrowserCompatCustomActionResultReceiver || ((parseDigitsRecursive) this).AudioAttributesImplBaseParcelizer >= 0) {
            return;
        }
        getInputCodeUtf8JsNames.read("Unsupported operation on a disposed or applied snapshot");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void onPlay() {
        /*
            r17 = this;
            r0 = r17
            o.setEmojiCompatEnabled r1 = r17.MediaBrowserCompatCustomActionResultReceiver()
            if (r1 == 0) goto L83
            r17.onPrepareFromMediaId()
            r2 = 0
            r0.read(r2)
            long r2 = r17.getIconCompatParcelizer()
            o.setButtonDrawable r1 = (kotlin.setButtonDrawable) r1
            java.lang.Object[] r4 = r1.write
            long[] r1 = r1.AudioAttributesCompatParcelizer
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L83
            r6 = 0
            r7 = r6
        L20:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L7e
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L3a:
            if (r12 >= r10) goto L7c
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L78
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            o.tryMatch r13 = (kotlin.tryMatch) r13
            o.reportWeirdUCS4 r13 = r13.getRemoteActionCompatParcelizer()
        L50:
            if (r13 == 0) goto L78
            long r14 = r13.getIconCompatParcelizer()
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L6c
            o.toChars r14 = r0.AudioAttributesImplApi26Parcelizer
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            long r15 = r13.getIconCompatParcelizer()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            boolean r14 = kotlin.IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(r14, r15)
            if (r14 == 0) goto L73
        L6c:
            long r14 = kotlin.toChars3.AudioAttributesImplApi21Parcelizer()
            r13.write(r14)
        L73:
            o.reportWeirdUCS4 r13 = r13.getWrite()
            goto L50
        L78:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3a
        L7c:
            if (r10 != r11) goto L83
        L7e:
            if (r7 == r5) goto L83
            int r7 = r7 + 1
            goto L20
        L83:
            r17.handleMediaPlayPauseIfPendingOnHandler()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ParseDigitsTaskCharSequence.onPlay():void");
    }

    public final charsToString IconCompatParcelizer(long p0, setEmojiCompatEnabled<tryMatch> p1, Map<reportWeirdUCS4, ? extends reportWeirdUCS4> p2, toChars p3) {
        toChars tochars;
        long[] jArr;
        Object[] objArr;
        int i;
        toChars tochars2;
        long[] jArr2;
        Object[] objArr2;
        int i2;
        reportWeirdUCS4 reportweirducs4;
        reportWeirdUCS4 reportweirducs4IconCompatParcelizer;
        long j = p0;
        toChars tocharsAudioAttributesImplBaseParcelizer = getWrite().write(getIconCompatParcelizer()).AudioAttributesImplBaseParcelizer(this.AudioAttributesImplApi26Parcelizer);
        setEmojiCompatEnabled<tryMatch> setemojicompatenabled = p1;
        Object[] objArr3 = setemojicompatenabled.write;
        long[] jArr3 = setemojicompatenabled.AudioAttributesCompatParcelizer;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        ArrayList arrayListAudioAttributesCompatParcelizer = null;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr3[i3];
                ArrayList arrayList2 = arrayList;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j2 & 255) < 128) {
                            tryMatch trymatch = (tryMatch) objArr3[(i3 << 3) + i6];
                            jArr2 = jArr3;
                            reportWeirdUCS4 remoteActionCompatParcelizer = trymatch.getRemoteActionCompatParcelizer();
                            objArr2 = objArr3;
                            reportWeirdUCS4 reportweirducs42 = toChars3.read(remoteActionCompatParcelizer, j, p3);
                            if (reportweirducs42 == null || (reportweirducs4 = toChars3.read(remoteActionCompatParcelizer, getIconCompatParcelizer(), tocharsAudioAttributesImplBaseParcelizer)) == null || reportweirducs4.getIconCompatParcelizer() == toDecimal.RemoteActionCompatParcelizer(1) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(reportweirducs42, reportweirducs4)) {
                                tochars2 = tocharsAudioAttributesImplBaseParcelizer;
                            } else {
                                i2 = length;
                                tochars2 = tocharsAudioAttributesImplBaseParcelizer;
                                reportWeirdUCS4 reportweirducs43 = toChars3.read(remoteActionCompatParcelizer, getIconCompatParcelizer(), getWrite());
                                if (reportweirducs43 == null) {
                                    toChars3.handleMediaPlayPauseIfPendingOnHandler();
                                    throw new PlanDetailsCreator();
                                }
                                if (p2 == null || (reportweirducs4IconCompatParcelizer = p2.get(reportweirducs42)) == null) {
                                    reportweirducs4IconCompatParcelizer = trymatch.IconCompatParcelizer(reportweirducs4, reportweirducs42, reportweirducs43);
                                }
                                if (reportweirducs4IconCompatParcelizer == null) {
                                    return new charsToString.IconCompatParcelizer(this);
                                }
                                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(reportweirducs4IconCompatParcelizer, reportweirducs43)) {
                                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(reportweirducs4IconCompatParcelizer, reportweirducs42)) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        ArrayList arrayList3 = arrayList2;
                                        arrayList3.add(setAction.write(trymatch, reportweirducs42.RemoteActionCompatParcelizer(getIconCompatParcelizer())));
                                        if (arrayListAudioAttributesCompatParcelizer == null) {
                                            arrayListAudioAttributesCompatParcelizer = new ArrayList();
                                        }
                                        arrayListAudioAttributesCompatParcelizer.add(trymatch);
                                        arrayList2 = arrayList3;
                                    } else {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        ArrayList arrayList4 = arrayList2;
                                        arrayList4.add(!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(reportweirducs4IconCompatParcelizer, reportweirducs4) ? setAction.write(trymatch, reportweirducs4IconCompatParcelizer) : setAction.write(trymatch, reportweirducs4.RemoteActionCompatParcelizer(getIconCompatParcelizer())));
                                        arrayList2 = arrayList4;
                                    }
                                }
                                j2 >>= 8;
                                i6++;
                                i4 = 8;
                                length = i2;
                                jArr3 = jArr2;
                                objArr3 = objArr2;
                                tocharsAudioAttributesImplBaseParcelizer = tochars2;
                                j = p0;
                            }
                        } else {
                            tochars2 = tocharsAudioAttributesImplBaseParcelizer;
                            jArr2 = jArr3;
                            objArr2 = objArr3;
                        }
                        i2 = length;
                        j2 >>= 8;
                        i6++;
                        i4 = 8;
                        length = i2;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        tocharsAudioAttributesImplBaseParcelizer = tochars2;
                        j = p0;
                    }
                    tochars = tocharsAudioAttributesImplBaseParcelizer;
                    jArr = jArr3;
                    objArr = objArr3;
                    i = length;
                    int i7 = i4;
                    arrayList = arrayList2;
                    if (i5 != i7) {
                        break;
                    }
                } else {
                    tochars = tocharsAudioAttributesImplBaseParcelizer;
                    jArr = jArr3;
                    objArr = objArr3;
                    i = length;
                    arrayList = arrayList2;
                }
                if (i3 == i) {
                    break;
                }
                i3++;
                length = i;
                jArr3 = jArr;
                objArr3 = objArr;
                tocharsAudioAttributesImplBaseParcelizer = tochars;
                j = p0;
            }
        }
        if (arrayList != null) {
            read();
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                Pair pair = (Pair) arrayList.get(i8);
                tryMatch trymatch2 = (tryMatch) pair.RemoteActionCompatParcelizer();
                reportWeirdUCS4 reportweirducs44 = (reportWeirdUCS4) pair.read();
                reportweirducs44.write(p0);
                synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                    reportweirducs44.RemoteActionCompatParcelizer(trymatch2.getRemoteActionCompatParcelizer());
                    trymatch2.RemoteActionCompatParcelizer(reportweirducs44);
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
            }
        }
        if (arrayListAudioAttributesCompatParcelizer != null) {
            int size2 = arrayListAudioAttributesCompatParcelizer.size();
            for (int i9 = 0; i9 < size2; i9++) {
                p1.AudioAttributesCompatParcelizer(arrayListAudioAttributesCompatParcelizer.get(i9));
            }
            List<? extends tryMatch> list = this.AudioAttributesImplBaseParcelizer;
            if (list != null) {
                arrayListAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) list, (Iterable) arrayListAudioAttributesCompatParcelizer);
            }
            this.AudioAttributesImplBaseParcelizer = arrayListAudioAttributesCompatParcelizer;
        }
        return charsToString.RemoteActionCompatParcelizer.INSTANCE;
    }

    public final void IconCompatParcelizer(int p0) {
        if (p0 >= 0) {
            this.MediaBrowserCompatItemReceiver = getOrderDetails.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, p0);
        }
    }

    public final void AudioAttributesCompatParcelizer(int[] p0) {
        if (p0.length == 0) {
            return;
        }
        int[] iArr = this.MediaBrowserCompatItemReceiver;
        if (iArr.length != 0) {
            p0 = getOrderDetails.RemoteActionCompatParcelizer(iArr, p0);
        }
        this.MediaBrowserCompatItemReceiver = p0;
    }

    private final void onPrepare() {
        int length = this.MediaBrowserCompatItemReceiver.length;
        for (int i = 0; i < length; i++) {
            toChars3.read(this.MediaBrowserCompatItemReceiver[i]);
        }
    }

    @Override // kotlin.parseDigitsRecursive
    public void read(tryMatch p0) {
        setEmojiCompatEnabled<tryMatch> setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver == null) {
            setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver = setSupportAllCaps.AudioAttributesCompatParcelizer();
            read(setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver);
        }
        setemojicompatenabledMediaBrowserCompatCustomActionResultReceiver.write(p0);
    }

    @Override // kotlin.parseDigitsRecursive
    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.parseDigitsRecursive
    public void read(int i) {
        this.IconCompatParcelizer = i;
    }

    public setEmojiCompatEnabled<tryMatch> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesCompatParcelizer;
    }

    public void read(setEmojiCompatEnabled<tryMatch> setemojicompatenabled) {
        this.AudioAttributesCompatParcelizer = setemojicompatenabled;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final toChars getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int[] getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void read(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/ParseDigitsTaskCharSequence$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "IconCompatParcelizer", "[I", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final void read() {
        RemoteActionCompatParcelizer(getIconCompatParcelizer());
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        if (getMediaBrowserCompatCustomActionResultReceiver() || getRead()) {
            return;
        }
        long iconCompatParcelizer = getIconCompatParcelizer();
        synchronized (toChars3.MediaBrowserCompatMediaItem()) {
            long j = toChars3.AudioAttributesImplApi21Parcelizer;
            toChars3.AudioAttributesImplApi21Parcelizer++;
            read(j);
            toChars3.AudioAttributesImplBaseParcelizer = toChars3.AudioAttributesImplBaseParcelizer.write(getIconCompatParcelizer());
            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        }
        RemoteActionCompatParcelizer(toChars3.IconCompatParcelizer(getWrite(), iconCompatParcelizer + 1, getIconCompatParcelizer()));
    }

    public final void RemoteActionCompatParcelizer(long p0) {
        synchronized (toChars3.MediaBrowserCompatMediaItem()) {
            this.AudioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi26Parcelizer.write(p0);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void AudioAttributesCompatParcelizer(toChars p0) {
        synchronized (toChars3.MediaBrowserCompatMediaItem()) {
            this.AudioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer(p0);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }
}
