package kotlin;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\f2\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u000f\u001a\u00020\u00012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0011\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\r\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\r\u0010\u0017J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0012"}, d2 = {"Lo/JavaDoubleBitsFromCharArray;", "Lo/ParseDigitsTaskCharSequence;", "", "Lo/SnapshotId;", "p0", "Lo/toChars;", "p1", "<init>", "(JLo/toChars;)V", "Lkotlin/Function1;", "", "", "Lo/parseDigitsRecursive;", "IconCompatParcelizer", "(Lo/getAnswerMap;)Lo/parseDigitsRecursive;", "AudioAttributesCompatParcelizer", "(Lo/getAnswerMap;Lo/getAnswerMap;)Lo/ParseDigitsTaskCharSequence;", "RemoteActionCompatParcelizer", "()V", "", "(Lo/parseDigitsRecursive;)Ljava/lang/Void;", "write", "Lo/charsToString;", "()Lo/charsToString;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaDoubleBitsFromCharArray extends ParseDigitsTaskCharSequence {
    public JavaDoubleBitsFromCharArray(long j, toChars tochars) {
        super(j, tochars, null, new getAnswerMap() { // from class: o.JavaFloatParser
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return JavaDoubleBitsFromCharArray.write(obj);
            }
        });
    }

    @Override // kotlin.ParseDigitsTaskCharSequence, kotlin.parseDigitsRecursive
    public final void RemoteActionCompatParcelizer() {
        toChars3.MediaDescriptionCompat();
    }

    @Override // kotlin.ParseDigitsTaskCharSequence, kotlin.parseDigitsRecursive
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final Void read(parseDigitsRecursive p0) {
        flog2pow10.IconCompatParcelizer();
        throw new PlanDetailsCreator();
    }

    @Override // kotlin.ParseDigitsTaskCharSequence, kotlin.parseDigitsRecursive
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final Void AudioAttributesCompatParcelizer(parseDigitsRecursive p0) {
        flog2pow10.IconCompatParcelizer();
        throw new PlanDetailsCreator();
    }

    @Override // kotlin.ParseDigitsTaskCharSequence
    public final charsToString IconCompatParcelizer() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer implements getAnswerMap<toChars, ParseDigitsTaskCharSequence> {
        final /* synthetic */ getAnswerMap<Object, getShowPopup> AudioAttributesCompatParcelizer;
        final /* synthetic */ getAnswerMap<Object, getShowPopup> write;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final ParseDigitsTaskCharSequence invoke(toChars tochars) {
            long j;
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                j = toChars3.AudioAttributesImplApi21Parcelizer;
                toChars3.AudioAttributesImplApi21Parcelizer++;
            }
            return new ParseDigitsTaskCharSequence(j, tochars, this.write, this.AudioAttributesCompatParcelizer);
        }

        AudioAttributesCompatParcelizer(getAnswerMap<Object, getShowPopup> getanswermap, getAnswerMap<Object, getShowPopup> getanswermap2) {
            this.write = getanswermap;
            this.AudioAttributesCompatParcelizer = getanswermap2;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements getAnswerMap<toChars, appendDigit> {
        final /* synthetic */ getAnswerMap<Object, getShowPopup> read;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final appendDigit invoke(toChars tochars) {
            long j;
            synchronized (toChars3.MediaBrowserCompatMediaItem()) {
                j = toChars3.AudioAttributesImplApi21Parcelizer;
                toChars3.AudioAttributesImplApi21Parcelizer++;
            }
            return new appendDigit(j, tochars, this.read);
        }

        IconCompatParcelizer(getAnswerMap<Object, getShowPopup> getanswermap) {
            this.read = getanswermap;
        }
    }

    @Override // kotlin.ParseDigitsTaskCharSequence, kotlin.parseDigitsRecursive
    public final parseDigitsRecursive IconCompatParcelizer(getAnswerMap<Object, getShowPopup> p0) {
        Map<child, rootDetector> mapIconCompatParcelizer;
        AbstractFloatValueParser abstractFloatValueParser = DupDetector.read;
        if (abstractFloatValueParser != null) {
            Pair<rootDetector, Map<child, rootDetector>> pairAudioAttributesCompatParcelizer = DupDetector.AudioAttributesCompatParcelizer(abstractFloatValueParser, null, true, p0, null);
            rootDetector rootdetectorWrite = pairAudioAttributesCompatParcelizer.write();
            getAnswerMap<Object, getShowPopup> getanswermapWrite = rootdetectorWrite.write();
            rootdetectorWrite.read();
            mapIconCompatParcelizer = pairAudioAttributesCompatParcelizer.IconCompatParcelizer();
            p0 = getanswermapWrite;
        } else {
            mapIconCompatParcelizer = null;
        }
        appendDigit appenddigit = (appendDigit) toChars3.read(new IconCompatParcelizer(p0));
        if (abstractFloatValueParser != null) {
            DupDetector.RemoteActionCompatParcelizer(abstractFloatValueParser, null, appenddigit, mapIconCompatParcelizer);
        }
        return appenddigit;
    }

    @Override // kotlin.ParseDigitsTaskCharSequence
    public final ParseDigitsTaskCharSequence AudioAttributesCompatParcelizer(getAnswerMap<Object, getShowPopup> p0, getAnswerMap<Object, getShowPopup> p1) {
        getAnswerMap<Object, getShowPopup> getanswermap;
        Map<child, rootDetector> mapIconCompatParcelizer;
        AbstractFloatValueParser abstractFloatValueParser = DupDetector.read;
        if (abstractFloatValueParser != null) {
            Pair<rootDetector, Map<child, rootDetector>> pairAudioAttributesCompatParcelizer = DupDetector.AudioAttributesCompatParcelizer(abstractFloatValueParser, null, false, p0, p1);
            rootDetector rootdetectorWrite = pairAudioAttributesCompatParcelizer.write();
            getAnswerMap<Object, getShowPopup> getanswermapWrite = rootdetectorWrite.write();
            getAnswerMap<Object, getShowPopup> getanswermap2 = rootdetectorWrite.read();
            mapIconCompatParcelizer = pairAudioAttributesCompatParcelizer.IconCompatParcelizer();
            p0 = getanswermapWrite;
            getanswermap = getanswermap2;
        } else {
            getanswermap = p1;
            mapIconCompatParcelizer = null;
        }
        ParseDigitsTaskCharSequence parseDigitsTaskCharSequence = (ParseDigitsTaskCharSequence) toChars3.read(new AudioAttributesCompatParcelizer(p0, getanswermap));
        if (abstractFloatValueParser != null) {
            DupDetector.RemoteActionCompatParcelizer(abstractFloatValueParser, null, parseDigitsTaskCharSequence, mapIconCompatParcelizer);
        }
        return parseDigitsTaskCharSequence;
    }

    @Override // kotlin.ParseDigitsTaskCharSequence, kotlin.parseDigitsRecursive
    public final void write() {
        synchronized (toChars3.MediaBrowserCompatMediaItem()) {
            onMediaButtonEvent();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(Object obj) {
        synchronized (toChars3.MediaBrowserCompatMediaItem()) {
            List list = toChars3.MediaBrowserCompatItemReceiver;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((getAnswerMap) list.get(i)).invoke(obj);
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        return getShowPopup.INSTANCE;
    }
}
