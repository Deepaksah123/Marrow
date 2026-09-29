package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\f\u0010\u0014J\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u000e\u0010\u0014J\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u000e\u0010\u0016J\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0010\u0010\u0016J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\f\u0010\u0016J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0014J\u001b\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u0018¢\u0006\u0004\b\n\u0010\u0019J\u0015\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018¢\u0006\u0004\b\u0010\u0010\u001aJ\u001d\u0010\u0017\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u001bH\u0002¢\u0006\u0004\b\u0017\u0010\u001cJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0003J\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u000e\u0010\u001eR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010#R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R$\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R$\u0010+\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001b\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010.R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010/"}, d2 = {"Lo/toFftVector;", "Lo/allocConcatBuffer;", "<init>", "()V", "", "Lo/allocReadIOBuffer;", "p0", "Lo/expectComma;", "p1", "", "RemoteActionCompatParcelizer", "(Ljava/util/Set;Lo/expectComma;)V", "IconCompatParcelizer", "Lo/constructReadConstrainedTextBuffer;", "read", "(Lo/constructReadConstrainedTextBuffer;)V", "AudioAttributesCompatParcelizer", "Lkotlin/Function0;", "(Lo/getCreatedOnDateMs;)V", "Lo/_getByteArrayBuilder;", "(Lo/_getByteArrayBuilder;)V", "Lo/rawReference;", "(Lo/rawReference;)V", "write", "Lo/setButtonDrawable;", "(Lo/setButtonDrawable;)V", "()Lo/setButtonDrawable;", "Lo/UTF32Reader;", "(Lo/UTF32Reader;)V", "", "(Ljava/lang/Object;)V", "Ljava/util/Set;", "MediaBrowserCompatSearchResultReceiver", "Lo/expectComma;", "AudioAttributesImplBaseParcelizer", "Lo/UTF32Reader;", "Lo/setEmojiCompatEnabled;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setEmojiCompatEnabled;", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "Lo/setKeyListener;", "Lo/ifft;", "AudioAttributesImplApi26Parcelizer", "Lo/setKeyListener;", "Lo/parseLong;", "Ljava/util/ArrayList;", "Lo/setButtonDrawable;", "MediaDescriptionCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class toFftVector implements allocConcatBuffer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private setButtonDrawable<constructReadConstrainedTextBuffer> MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private setEmojiCompatEnabled<_getByteArrayBuilder> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private setKeyListener<rawReference, ifft> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final UTF32Reader<constructReadConstrainedTextBuffer> read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private ArrayList<UTF32Reader<constructReadConstrainedTextBuffer>> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private setEmojiCompatEnabled<constructReadConstrainedTextBuffer> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final UTF32Reader<getCreatedOnDateMs<getShowPopup>> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private expectComma write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final UTF32Reader<Object> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private Set<allocReadIOBuffer> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private UTF32Reader<constructReadConstrainedTextBuffer> IconCompatParcelizer;

    public toFftVector() {
        UTF32Reader<constructReadConstrainedTextBuffer> uTF32Reader = new UTF32Reader<>(new constructReadConstrainedTextBuffer[16], 0);
        this.read = uTF32Reader;
        this.RemoteActionCompatParcelizer = setSupportAllCaps.AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer = uTF32Reader;
        this.AudioAttributesImplApi21Parcelizer = new UTF32Reader<>(new Object[16], 0);
        this.AudioAttributesImplBaseParcelizer = new UTF32Reader<>(new getCreatedOnDateMs[16], 0);
    }

    public final void RemoteActionCompatParcelizer(Set<allocReadIOBuffer> p0, expectComma p1) {
        IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer = p0;
        this.write = p1;
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer = null;
        this.write = null;
        this.read.RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        this.IconCompatParcelizer = this.read;
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.MediaBrowserCompatItemReceiver = null;
        this.AudioAttributesImplApi26Parcelizer = null;
    }

    @Override // kotlin.allocConcatBuffer
    public final void read(constructReadConstrainedTextBuffer p0) {
        this.IconCompatParcelizer.read(p0);
        this.RemoteActionCompatParcelizer.write(p0);
    }

    @Override // kotlin.allocConcatBuffer
    public final void AudioAttributesCompatParcelizer(constructReadConstrainedTextBuffer p0) {
        if (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(p0)) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0);
            if (!this.IconCompatParcelizer.IconCompatParcelizer(p0) && !this.read.IconCompatParcelizer(p0)) {
                AudioAttributesCompatParcelizer(p0, this.read);
            }
            Set<allocReadIOBuffer> set = this.AudioAttributesCompatParcelizer;
            if (set != null) {
                set.add(p0.getWrite());
                return;
            }
            return;
        }
        setButtonDrawable<constructReadConstrainedTextBuffer> setbuttondrawable = this.MediaDescriptionCompat;
        if (setbuttondrawable == null || !setbuttondrawable.RemoteActionCompatParcelizer(p0)) {
            read((Object) p0);
        }
    }

    @Override // kotlin.allocConcatBuffer
    public final void AudioAttributesCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0) {
        this.AudioAttributesImplBaseParcelizer.read(p0);
    }

    @Override // kotlin.allocConcatBuffer
    public final void IconCompatParcelizer(_getByteArrayBuilder p0) {
        read((Object) p0);
    }

    @Override // kotlin.allocConcatBuffer
    public final void read(_getByteArrayBuilder p0) {
        setEmojiCompatEnabled<_getByteArrayBuilder> setemojicompatenabledAudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setemojicompatenabledAudioAttributesCompatParcelizer == null) {
            setemojicompatenabledAudioAttributesCompatParcelizer = setSupportAllCaps.AudioAttributesCompatParcelizer();
            this.MediaBrowserCompatCustomActionResultReceiver = setemojicompatenabledAudioAttributesCompatParcelizer;
        }
        setemojicompatenabledAudioAttributesCompatParcelizer.IconCompatParcelizer(p0);
        read((Object) p0);
    }

    @Override // kotlin.allocConcatBuffer
    public final void read(rawReference p0) {
        Set<allocReadIOBuffer> set = this.AudioAttributesCompatParcelizer;
        if (set == null) {
            return;
        }
        ifft ifftVar = new ifft(set);
        setKeyListener<rawReference, ifft> setkeylistener = this.MediaBrowserCompatItemReceiver;
        if (setkeylistener == null) {
            setkeylistener = setAutoSizeTextTypeUniformWithPresetSizes.read();
            this.MediaBrowserCompatItemReceiver = setkeylistener;
        }
        setkeylistener.RemoteActionCompatParcelizer(p0, ifftVar);
        this.IconCompatParcelizer.read(new constructReadConstrainedTextBuffer(ifftVar, -1));
    }

    @Override // kotlin.allocConcatBuffer
    public final void AudioAttributesCompatParcelizer(rawReference p0) {
        setKeyListener<rawReference, ifft> setkeylistener = this.MediaBrowserCompatItemReceiver;
        ifft ifftVarAudioAttributesImplApi26Parcelizer = setkeylistener != null ? setkeylistener.AudioAttributesImplApi26Parcelizer(p0) : null;
        if (ifftVarAudioAttributesImplApi26Parcelizer != null) {
            ArrayList<UTF32Reader<constructReadConstrainedTextBuffer>> arrayListIconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
            if (arrayListIconCompatParcelizer == null) {
                arrayListIconCompatParcelizer = parseLong.IconCompatParcelizer(null, 1, null);
                this.AudioAttributesImplApi26Parcelizer = arrayListIconCompatParcelizer;
            }
            parseLong.write(arrayListIconCompatParcelizer, this.IconCompatParcelizer);
            this.IconCompatParcelizer = ifftVarAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin.allocConcatBuffer
    public final void IconCompatParcelizer(rawReference p0) {
        UTF32Reader<constructReadConstrainedTextBuffer> uTF32Reader;
        setKeyListener<rawReference, ifft> setkeylistener = this.MediaBrowserCompatItemReceiver;
        if (setkeylistener == null || setkeylistener.AudioAttributesImplApi26Parcelizer(p0) == null) {
            return;
        }
        ArrayList<UTF32Reader<constructReadConstrainedTextBuffer>> arrayList = this.AudioAttributesImplApi26Parcelizer;
        if (arrayList != null && (uTF32Reader = (UTF32Reader) parseLong.AudioAttributesImplBaseParcelizer(arrayList)) != null) {
            this.IconCompatParcelizer = uTF32Reader;
        }
        setkeylistener.IconCompatParcelizer(p0);
    }

    public final void RemoteActionCompatParcelizer() {
        Set<allocReadIOBuffer> set = this.AudioAttributesCompatParcelizer;
        if (set == null) {
            return;
        }
        this.MediaDescriptionCompat = null;
        if (this.AudioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer() != 0) {
            Object objIconCompatParcelizer = multiplyConjugate.INSTANCE.IconCompatParcelizer("Compose:onForgotten");
            try {
                setEmojiCompatEnabled<_getByteArrayBuilder> setemojicompatenabled = this.MediaBrowserCompatCustomActionResultReceiver;
                for (int audioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer() - 1; audioAttributesCompatParcelizer >= 0; audioAttributesCompatParcelizer--) {
                    Object obj = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer[audioAttributesCompatParcelizer];
                    if (obj instanceof constructReadConstrainedTextBuffer) {
                        try {
                            allocReadIOBuffer write = ((constructReadConstrainedTextBuffer) obj).getWrite();
                            set.remove(write);
                            write.IconCompatParcelizer();
                        } catch (Throwable th) {
                            expectComma expectcomma = this.write;
                            if (expectcomma != null) {
                                expectcomma.IconCompatParcelizer(th, obj);
                            }
                            throw th;
                        }
                    }
                    if (obj instanceof _getByteArrayBuilder) {
                        if (setemojicompatenabled != null && setemojicompatenabled.RemoteActionCompatParcelizer((_getByteArrayBuilder) obj)) {
                            ((_getByteArrayBuilder) obj).write();
                        } else {
                            ((_getByteArrayBuilder) obj).AudioAttributesCompatParcelizer();
                        }
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            } finally {
            }
        }
        if (this.read.getAudioAttributesCompatParcelizer() != 0) {
            Object objIconCompatParcelizer2 = multiplyConjugate.INSTANCE.IconCompatParcelizer("Compose:onRemembered");
            try {
                write(this.read);
                getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
            } finally {
            }
        }
    }

    public final void write(_getByteArrayBuilder p0) {
        if (this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(p0)) {
            p0.AudioAttributesCompatParcelizer();
        }
    }

    public final void RemoteActionCompatParcelizer(setButtonDrawable<constructReadConstrainedTextBuffer> p0) {
        this.MediaDescriptionCompat = p0;
    }

    public final setButtonDrawable<constructReadConstrainedTextBuffer> AudioAttributesCompatParcelizer() {
        if (!this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
            return null;
        }
        setEmojiCompatEnabled<constructReadConstrainedTextBuffer> setemojicompatenabled = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = setSupportAllCaps.AudioAttributesCompatParcelizer();
        this.read.RemoteActionCompatParcelizer();
        return setemojicompatenabled;
    }

    private final void write(UTF32Reader<constructReadConstrainedTextBuffer> p0) {
        Set<allocReadIOBuffer> set = this.AudioAttributesCompatParcelizer;
        if (set != null) {
            constructReadConstrainedTextBuffer[] constructreadconstrainedtextbufferArr = p0.IconCompatParcelizer;
            int audioAttributesCompatParcelizer = p0.getAudioAttributesCompatParcelizer();
            for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
                constructReadConstrainedTextBuffer constructreadconstrainedtextbuffer = constructreadconstrainedtextbufferArr[i];
                allocReadIOBuffer write = constructreadconstrainedtextbuffer.getWrite();
                set.remove(write);
                try {
                    write.o_();
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                } catch (Throwable th) {
                    expectComma expectcomma = this.write;
                    if (expectcomma != null) {
                        expectcomma.IconCompatParcelizer(th, constructreadconstrainedtextbuffer);
                    }
                    throw th;
                }
            }
        }
    }

    public final void write() {
        if (this.AudioAttributesImplBaseParcelizer.getAudioAttributesCompatParcelizer() != 0) {
            Object objIconCompatParcelizer = multiplyConjugate.INSTANCE.IconCompatParcelizer("Compose:sideeffects");
            try {
                UTF32Reader<getCreatedOnDateMs<getShowPopup>> uTF32Reader = this.AudioAttributesImplBaseParcelizer;
                getCreatedOnDateMs<getShowPopup>[] getcreatedondatemsArr = uTF32Reader.IconCompatParcelizer;
                int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
                for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
                    getcreatedondatemsArr[i].invoke();
                }
                this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            } finally {
                multiplyConjugate.INSTANCE.write(objIconCompatParcelizer);
            }
        }
    }

    public final void read() {
        Set<allocReadIOBuffer> set = this.AudioAttributesCompatParcelizer;
        if (set == null || set.isEmpty()) {
            return;
        }
        Object objIconCompatParcelizer = multiplyConjugate.INSTANCE.IconCompatParcelizer("Compose:abandons");
        try {
            Iterator<allocReadIOBuffer> it = set.iterator();
            while (it.hasNext()) {
                allocReadIOBuffer next = it.next();
                it.remove();
                next.AudioAttributesCompatParcelizer();
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        } finally {
            multiplyConjugate.INSTANCE.write(objIconCompatParcelizer);
        }
    }

    private final void read(Object p0) {
        this.AudioAttributesImplApi21Parcelizer.read(p0);
    }

    private static final boolean AudioAttributesCompatParcelizer(constructReadConstrainedTextBuffer constructreadconstrainedtextbuffer, UTF32Reader<constructReadConstrainedTextBuffer> uTF32Reader) {
        constructReadConstrainedTextBuffer[] constructreadconstrainedtextbufferArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            allocReadIOBuffer write = constructreadconstrainedtextbufferArr[i].getWrite();
            if (write instanceof ifft) {
                UTF32Reader<constructReadConstrainedTextBuffer> uTF32ReaderRemoteActionCompatParcelizer = ((ifft) write).RemoteActionCompatParcelizer();
                if (uTF32ReaderRemoteActionCompatParcelizer.IconCompatParcelizer(constructreadconstrainedtextbuffer) || AudioAttributesCompatParcelizer(constructreadconstrainedtextbuffer, uTF32ReaderRemoteActionCompatParcelizer)) {
                    return true;
                }
            }
        }
        return false;
    }
}
