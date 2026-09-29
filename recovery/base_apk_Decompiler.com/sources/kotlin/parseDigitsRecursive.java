package kotlin;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.parseDigitsRecursive;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001d\b\u0004\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0000H ¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0000H ¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0015H ¢\u0006\u0004\b\u0014\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH ¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0018\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\n\u001a\u00020\u00058\u0011@\u0011X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u0017\u0010\"R2\u0010\r\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0017@QX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\u0014\u0010&R$\u0010\u0013\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u001c8Q@QX\u0090\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001e\"\u0004\b\u0014\u0010(R\u0014\u0010\u0017\u001a\u00020)8'X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\"\u0010\u0014\u001a\u00020)8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010+\"\u0004\b\u0017\u0010.R\u0016\u00100\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010/R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\f8!X \u0004¢\u0006\u0006\u001a\u0004\b\u0011\u00101R\"\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\f8!X \u0004¢\u0006\u0006\u001a\u0004\b2\u00101\u0082\u0001\u00044567"}, d2 = {"Lo/parseDigitsRecursive;", "", "", "Lo/SnapshotId;", "p0", "Lo/toChars;", "p1", "<init>", "(JLo/toChars;)V", "", "write", "()V", "Lkotlin/Function1;", "IconCompatParcelizer", "(Lo/getAnswerMap;)Lo/parseDigitsRecursive;", "onPause", "()Lo/parseDigitsRecursive;", "AudioAttributesImplApi26Parcelizer", "(Lo/parseDigitsRecursive;)V", "AudioAttributesCompatParcelizer", "read", "Lo/tryMatch;", "(Lo/tryMatch;)V", "RemoteActionCompatParcelizer", "handleMediaPlayPauseIfPendingOnHandler", "onAddQueueItem", "onPlayFromMediaId", "onMediaButtonEvent", "", "onFastForward", "()I", "Lo/toChars;", "onCommand", "()Lo/toChars;", "(Lo/toChars;)V", "J", "onCustomAction", "()J", "(J)V", "MediaBrowserCompatMediaItem", "(I)V", "", "MediaBrowserCompatSearchResultReceiver", "()Z", "Z", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "(Z)V", "I", "AudioAttributesImplBaseParcelizer", "()Lo/getAnswerMap;", "MediaMetadataCompat", "AudioAttributesImplApi21Parcelizer", "Lo/ParseDigitsTaskCharSequence;", "Lo/JavaFloatBitsFromByteArray;", "Lo/appendDigit;", "Lo/detectEncoding;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class parseDigitsRecursive {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int write = 8;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private long IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private toChars write;

    public abstract void AudioAttributesCompatParcelizer(parseDigitsRecursive p0);

    public abstract getAnswerMap<Object, getShowPopup> AudioAttributesImplApi26Parcelizer();

    public abstract parseDigitsRecursive IconCompatParcelizer(getAnswerMap<Object, getShowPopup> p0);

    public int MediaBrowserCompatMediaItem() {
        return 0;
    }

    public abstract boolean MediaBrowserCompatSearchResultReceiver();

    public abstract getAnswerMap<Object, getShowPopup> MediaMetadataCompat();

    public abstract void RemoteActionCompatParcelizer();

    public abstract void read(parseDigitsRecursive p0);

    public abstract void read(tryMatch p0);

    private parseDigitsRecursive(long j, toChars tochars) {
        this.write = tochars;
        this.IconCompatParcelizer = j;
        this.AudioAttributesImplBaseParcelizer = j != toChars3.read ? toChars3.IconCompatParcelizer(j, getWrite()) : -1;
    }

    public void RemoteActionCompatParcelizer(toChars tochars) {
        this.write = tochars;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public toChars getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public void read(long j) {
        this.IconCompatParcelizer = j;
    }

    public void read(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public void write() {
        this.read = true;
        synchronized (toChars3.MediaBrowserCompatMediaItem()) {
            onMediaButtonEvent();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public parseDigitsRecursive onPause() {
        parseDigitsRecursive parsedigitsrecursive = (parseDigitsRecursive) toChars3.RatingCompat.AudioAttributesCompatParcelizer();
        toChars3.RatingCompat.IconCompatParcelizer(this);
        return parsedigitsrecursive;
    }

    public void AudioAttributesImplApi26Parcelizer(parseDigitsRecursive p0) {
        toChars3.RatingCompat.IconCompatParcelizer(p0);
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.read = z;
    }

    public void AudioAttributesCompatParcelizer() {
        toChars3.AudioAttributesImplBaseParcelizer = toChars3.AudioAttributesImplBaseParcelizer.read(getIconCompatParcelizer());
    }

    public void onAddQueueItem() {
        onMediaButtonEvent();
    }

    public final void onPlayFromMediaId() {
        if (this.read) {
            getInputCodeUtf8JsNames.write("Cannot use a disposed snapshot");
        }
    }

    public final void onMediaButtonEvent() {
        int i = this.AudioAttributesImplBaseParcelizer;
        if (i >= 0) {
            toChars3.read(i);
            this.AudioAttributesImplBaseParcelizer = -1;
        }
    }

    public final int onFastForward() {
        int i = this.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesImplBaseParcelizer = -1;
        return i;
    }

    /* JADX INFO: renamed from: o.parseDigitsRecursive$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJM\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\f\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\f\u0010\u0014J-\u0010\b\u001a\u00020\u00172\u001e\u0010\u0006\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\b\u0010\u0018J!\u0010\u0012\u001a\u00020\u00172\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0012\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0003R\u0011\u0010\u001c\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\f\u0010\u001bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b"}, d2 = {"Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lkotlin/Function1;", "", "p0", "Lo/parseDigitsRecursive;", "RemoteActionCompatParcelizer", "(Lo/getAnswerMap;)Lo/parseDigitsRecursive;", "p1", "Lo/ParseDigitsTaskCharSequence;", "AudioAttributesCompatParcelizer", "(Lo/getAnswerMap;Lo/getAnswerMap;)Lo/ParseDigitsTaskCharSequence;", "T", "Lkotlin/Function0;", "p2", "(Lo/getAnswerMap;Lo/getAnswerMap;Lo/getCreatedOnDateMs;)Ljava/lang/Object;", "read", "(Lo/parseDigitsRecursive;)Lo/parseDigitsRecursive;", "(Lo/parseDigitsRecursive;Lo/parseDigitsRecursive;Lo/getAnswerMap;)V", "Lkotlin/Function2;", "", "Lo/parseDigitsIterative;", "(Lo/MagicModuleSubmissionRequestBody;)Lo/parseDigitsIterative;", "(Lo/getAnswerMap;)Lo/parseDigitsIterative;", "write", "()Lo/parseDigitsRecursive;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final parseDigitsRecursive AudioAttributesCompatParcelizer() {
            return toChars3.MediaBrowserCompatSearchResultReceiver();
        }

        public final parseDigitsRecursive RemoteActionCompatParcelizer(getAnswerMap<Object, getShowPopup> p0) {
            return toChars3.MediaBrowserCompatSearchResultReceiver().IconCompatParcelizer(p0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ParseDigitsTaskCharSequence AudioAttributesCompatParcelizer$default(Companion companion, getAnswerMap getanswermap, getAnswerMap getanswermap2, int i, Object obj) {
            if ((i & 1) != 0) {
                getanswermap = null;
            }
            if ((i & 2) != 0) {
                getanswermap2 = null;
            }
            return companion.AudioAttributesCompatParcelizer(getanswermap, getanswermap2);
        }

        public final ParseDigitsTaskCharSequence AudioAttributesCompatParcelizer(getAnswerMap<Object, getShowPopup> p0, getAnswerMap<Object, getShowPopup> p1) {
            ParseDigitsTaskCharSequence parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer;
            parseDigitsRecursive parsedigitsrecursiveMediaBrowserCompatSearchResultReceiver = toChars3.MediaBrowserCompatSearchResultReceiver();
            ParseDigitsTaskCharSequence parseDigitsTaskCharSequence = parsedigitsrecursiveMediaBrowserCompatSearchResultReceiver instanceof ParseDigitsTaskCharSequence ? (ParseDigitsTaskCharSequence) parsedigitsrecursiveMediaBrowserCompatSearchResultReceiver : null;
            if (parseDigitsTaskCharSequence == null || (parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer = parseDigitsTaskCharSequence.AudioAttributesCompatParcelizer(p0, p1)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            return parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer;
        }

        public final parseDigitsRecursive IconCompatParcelizer() {
            return (parseDigitsRecursive) toChars3.RatingCompat.AudioAttributesCompatParcelizer();
        }

        public final parseDigitsRecursive read(parseDigitsRecursive p0) {
            if (p0 instanceof constructReader) {
                constructReader constructreader = (constructReader) p0;
                if (constructreader.getAudioAttributesImplApi21Parcelizer() == multiplyConjugateInto.IconCompatParcelizer()) {
                    constructreader.AudioAttributesCompatParcelizer((getAnswerMap<Object, getShowPopup>) null);
                    return p0;
                }
            }
            if (p0 instanceof detectEncoding) {
                detectEncoding detectencoding = (detectEncoding) p0;
                if (detectencoding.read() == multiplyConjugateInto.IconCompatParcelizer()) {
                    detectencoding.read((getAnswerMap<Object, getShowPopup>) null);
                    return p0;
                }
            }
            parseDigitsRecursive parsedigitsrecursive = toChars3.read$default(p0, (getAnswerMap) null, false, 6, (Object) null);
            parsedigitsrecursive.onPause();
            return parsedigitsrecursive;
        }

        public final void AudioAttributesCompatParcelizer(parseDigitsRecursive p0, parseDigitsRecursive p1, getAnswerMap<Object, getShowPopup> p2) {
            if (p0 == p1) {
                if (p0 instanceof constructReader) {
                    ((constructReader) p0).AudioAttributesCompatParcelizer(p2);
                    return;
                } else {
                    if (p0 instanceof detectEncoding) {
                        ((detectEncoding) p0).read(p2);
                        return;
                    }
                    throw new IllegalStateException("Non-transparent snapshot was reused: ".concat(String.valueOf(p0)).toString());
                }
            }
            p1.AudioAttributesImplApi26Parcelizer(p0);
            p1.write();
        }

        public final parseDigitsIterative RemoteActionCompatParcelizer(final MagicModuleSubmissionRequestBody<? super Set<? extends Object>, ? super parseDigitsRecursive, getShowPopup> p0) {
            toChars3.RemoteActionCompatParcelizer((getAnswerMap<? super toChars, ? extends Object>) toChars3.IconCompatParcelizer);
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                toChars3.write = IntermediateLoginResponseBody.read((Collection<? extends MagicModuleSubmissionRequestBody<? super Set<? extends Object>, ? super parseDigitsRecursive, getShowPopup>>) toChars3.write, p0);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            return new parseDigitsIterative() { // from class: o.append8Digits
                @Override // kotlin.parseDigitsIterative
                public final void read() {
                    parseDigitsRecursive.Companion.read(p0);
                }
            };
        }

        public final void write() {
            toChars3.MediaBrowserCompatSearchResultReceiver().RemoteActionCompatParcelizer();
        }

        public final <T> T AudioAttributesCompatParcelizer(getAnswerMap<Object, getShowPopup> p0, getAnswerMap<Object, getShowPopup> p1, getCreatedOnDateMs<? extends T> p2) {
            constructReader constructreader;
            if (p0 != null || p1 != null) {
                parseDigitsRecursive parsedigitsrecursive = (parseDigitsRecursive) toChars3.RatingCompat.AudioAttributesCompatParcelizer();
                if (parsedigitsrecursive instanceof constructReader) {
                    constructReader constructreader2 = (constructReader) parsedigitsrecursive;
                    if (constructreader2.getAudioAttributesImplApi21Parcelizer() == multiplyConjugateInto.IconCompatParcelizer()) {
                        getAnswerMap<Object, getShowPopup> getanswermapRatingCompat = constructreader2.RatingCompat();
                        getAnswerMap<Object, getShowPopup> getanswermapMediaMetadataCompat = constructreader2.MediaMetadataCompat();
                        try {
                            ((constructReader) parsedigitsrecursive).AudioAttributesCompatParcelizer(toChars3.read$default((getAnswerMap) p0, (getAnswerMap) getanswermapRatingCompat, false, 4, (Object) null));
                            ((constructReader) parsedigitsrecursive).write(toChars3.IconCompatParcelizer(p1, getanswermapMediaMetadataCompat));
                            return p2.invoke();
                        } finally {
                            constructreader2.AudioAttributesCompatParcelizer(getanswermapRatingCompat);
                            constructreader2.write(getanswermapMediaMetadataCompat);
                        }
                    }
                }
                if (parsedigitsrecursive == null || (parsedigitsrecursive instanceof ParseDigitsTaskCharSequence)) {
                    constructreader = new constructReader(parsedigitsrecursive instanceof ParseDigitsTaskCharSequence ? (ParseDigitsTaskCharSequence) parsedigitsrecursive : null, p0, p1, true, false);
                } else {
                    if (p0 == null) {
                        return p2.invoke();
                    }
                    constructreader = parsedigitsrecursive.IconCompatParcelizer(p0);
                }
                try {
                    parseDigitsRecursive parsedigitsrecursiveOnPause = constructreader.onPause();
                    try {
                        return p2.invoke();
                    } finally {
                        constructreader.AudioAttributesImplApi26Parcelizer(parsedigitsrecursiveOnPause);
                    }
                } finally {
                    constructreader.write();
                }
            }
            return p2.invoke();
        }

        public final parseDigitsIterative read(final getAnswerMap<Object, getShowPopup> p0) {
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                toChars3.MediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.read((Collection<? extends getAnswerMap<Object, getShowPopup>>) toChars3.MediaBrowserCompatItemReceiver, p0);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            toChars3.MediaDescriptionCompat();
            return new parseDigitsIterative() { // from class: o.lowDigits
                @Override // kotlin.parseDigitsIterative
                public final void read() {
                    parseDigitsRecursive.Companion.IconCompatParcelizer(p0);
                }
            };
        }

        public final void read() {
            boolean zMediaDescriptionCompat;
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                zMediaDescriptionCompat = toChars3.RemoteActionCompatParcelizer.MediaDescriptionCompat();
            }
            if (zMediaDescriptionCompat) {
                toChars3.MediaDescriptionCompat();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void read(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody) {
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                toChars3.write = IntermediateLoginResponseBody.write(toChars3.write, magicModuleSubmissionRequestBody);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(getAnswerMap getanswermap) {
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                toChars3.MediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.write((Iterable<? extends getAnswerMap>) toChars3.MediaBrowserCompatItemReceiver, getanswermap);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            toChars3.MediaDescriptionCompat();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final void handleMediaPlayPauseIfPendingOnHandler() {
        synchronized (toChars3.MediaBrowserCompatMediaItem()) {
            AudioAttributesCompatParcelizer();
            onAddQueueItem();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public /* synthetic */ parseDigitsRecursive(long j, toChars tochars, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, tochars);
    }
}
