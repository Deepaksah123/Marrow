package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00000\n2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f"}, d2 = {"Lo/checkValue;", "", "Lo/releaseTokenBuffer;", "p0", "<init>", "(Lo/releaseTokenBuffer;)V", "Lo/_closeInput;", "Lo/setTextAppearance;", "Lo/getFilter;", "p1", "Lo/AppCompatButton;", "RemoteActionCompatParcelizer", "(Lo/_closeInput;Lo/setTextAppearance;)Lo/AppCompatButton;", "write", "Lo/releaseTokenBuffer;", "()Lo/releaseTokenBuffer;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class checkValue {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final releaseTokenBuffer IconCompatParcelizer;

    public checkValue(releaseTokenBuffer releasetokenbuffer) {
        this.IconCompatParcelizer = releasetokenbuffer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final releaseTokenBuffer getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer RemoteActionCompatParcelizer(checkValue checkvalue, getFilter getfilter) {
        return Integer.valueOf(checkvalue.IconCompatParcelizer.IconCompatParcelizer(getfilter.getWrite()));
    }

    private static final void write(setEncoding setencoding, int i) {
        while (setencoding.getOnCommand() >= 0 && setencoding.getMediaBrowserCompatCustomActionResultReceiver() <= i) {
            setencoding.onCommand();
            setencoding.RemoteActionCompatParcelizer();
        }
    }

    private static final void read(setEncoding setencoding, int i) {
        write(setencoding, i);
        while (setencoding.getAudioAttributesImplApi26Parcelizer() != i && !setencoding.RatingCompat()) {
            if (i < _validJsonValueList.RemoteActionCompatParcelizer(setencoding)) {
                setencoding.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            } else {
                setencoding.onAddQueueItem();
            }
        }
        if (setencoding.getAudioAttributesImplApi26Parcelizer() != i) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Unexpected slot table structure");
        }
        setencoding.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    public final AppCompatButton<getFilter, checkValue> RemoteActionCompatParcelizer(_closeInput<?> p0, setTextAppearance<getFilter> p1) {
        Object[] objArr = p1.IconCompatParcelizer;
        int i = p1.RemoteActionCompatParcelizer;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= i) {
                break;
            }
            if (this.IconCompatParcelizer.read(((getFilter) objArr[i3]).getWrite())) {
                i3++;
            } else {
                setDropDownBackgroundResource setdropdownbackgroundresource = new setDropDownBackgroundResource(i2, i4, null);
                Object[] objArr2 = p1.IconCompatParcelizer;
                int i5 = p1.RemoteActionCompatParcelizer;
                for (int i6 = 0; i6 < i5; i6++) {
                    Object obj = objArr2[i6];
                    if (this.IconCompatParcelizer.read(((getFilter) obj).getWrite())) {
                        setdropdownbackgroundresource.AudioAttributesCompatParcelizer(obj);
                    }
                }
                p1 = setdropdownbackgroundresource;
            }
        }
        setTextAppearance settextappearanceRemoteActionCompatParcelizer = SegmentedStringWriter.RemoteActionCompatParcelizer(p1, new getAnswerMap() { // from class: o.findChildOf
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj2) {
                return checkValue.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, (getFilter) obj2);
            }
        });
        if (settextappearanceRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
            return setAutoSizeTextTypeUniformWithPresetSizes.AudioAttributesCompatParcelizer();
        }
        setKeyListener setkeylistener = setAutoSizeTextTypeUniformWithPresetSizes.read();
        setEncoding setencodingOnAddQueueItem = this.IconCompatParcelizer.onAddQueueItem();
        try {
            Object[] objArr3 = settextappearanceRemoteActionCompatParcelizer.IconCompatParcelizer;
            int i7 = settextappearanceRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            for (int i8 = 0; i8 < i7; i8++) {
                getFilter getfilter = (getFilter) objArr3[i8];
                int i9 = setencodingOnAddQueueItem.read(getfilter.getWrite());
                int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = setencodingOnAddQueueItem.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i9);
                write(setencodingOnAddQueueItem, iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                read(setencodingOnAddQueueItem, iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                setencodingOnAddQueueItem.write(i9 - setencodingOnAddQueueItem.getAudioAttributesImplApi26Parcelizer());
                setkeylistener.RemoteActionCompatParcelizer(getfilter, _validJsonValueList.RemoteActionCompatParcelizer(getfilter.getRead(), getfilter, setencodingOnAddQueueItem, p0));
            }
            write(setencodingOnAddQueueItem, Integer.MAX_VALUE);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            setencodingOnAddQueueItem.read(true);
            return setkeylistener;
        } catch (Throwable th) {
            setencodingOnAddQueueItem.read(false);
            throw th;
        }
    }
}
