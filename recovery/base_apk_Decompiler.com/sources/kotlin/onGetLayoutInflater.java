package kotlin;

import kotlin.Metadata;
import kotlin.isCancelable;
import kotlin.onDismiss;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u00172\b\u0010\u0006\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u000b\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u000b\u0010#R\u001a\u0010\u0018\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001dR\u0014\u0010\u0014\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010\u000e\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001dR\u0014\u0010&\u001a\u00020\u001e8\u0000X\u0081D¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010*\u001a\u00020\u00048\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b*\u0010%\"\u0004\b\u0018\u0010+R\u001c\u0010,\u001a\u00020\u00048\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\u000b\u0010%\"\u0004\b&\u0010+R\u0018\u0010'\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010-\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u00100R\u0018\u0010$\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0018\u0010(\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u00100R\u0018\u0010!\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u00102R,\u00105\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u0001038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u00104"}, d2 = {"Lo/onGetLayoutInflater;", "", "Lo/onDismiss$RemoteActionCompatParcelizer;", "p0", "", "p1", "p2", "<init>", "(Lo/onDismiss$RemoteActionCompatParcelizer;II)V", "", "Lo/setShowingForActionMode;", "RemoteActionCompatParcelizer", "(ZII)Lo/setShowingForActionMode;", "Lo/isCancelable$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "(ZII)Lo/isCancelable$RemoteActionCompatParcelizer;", "Lo/hasHandlers;", "Lo/PropertyValueAny;", "p3", "", "write", "(Lo/hasHandlers;Lo/hasHandlers;ZJ)V", "Lo/onStart;", "Lo/isTypeOrSuperTypeOf;", "IconCompatParcelizer", "(Lo/onStart;Lo/isTypeOrSuperTypeOf;Lo/isTypeOrSuperTypeOf;J)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "MediaBrowserCompatSearchResultReceiver", "Lo/onDismiss$RemoteActionCompatParcelizer;", "()Lo/onDismiss$RemoteActionCompatParcelizer;", "MediaBrowserCompatCustomActionResultReceiver", "I", "read", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem", "Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "(I)V", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "Lo/isTypeOrSuperTypeOf;", "Lo/_parser;", "Lo/_parser;", "RatingCompat", "Lo/setShowingForActionMode;", "Lkotlin/Function2;", "Lo/MagicModuleSubmissionRequestBody;", "MediaDescriptionCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class onGetLayoutInflater {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private MagicModuleSubmissionRequestBody<? super Boolean, ? super Integer, ? extends isTypeOrSuperTypeOf> MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private _parser AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private isTypeOrSuperTypeOf AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private isTypeOrSuperTypeOf MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final onDismiss.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private setShowingForActionMode MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private _parser MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private setShowingForActionMode RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final String read = "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.";
    private int MediaBrowserCompatItemReceiver = -1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[onDismiss.RemoteActionCompatParcelizer.values().length];
            try {
                iArr[onDismiss.RemoteActionCompatParcelizer.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onDismiss.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onDismiss.RemoteActionCompatParcelizer.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onDismiss.RemoteActionCompatParcelizer.write.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    public onGetLayoutInflater(onDismiss.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, int i2) {
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        this.IconCompatParcelizer = i;
        this.write = i2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final onDismiss.RemoteActionCompatParcelizer getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        int i = this.MediaBrowserCompatItemReceiver;
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException(this.read);
    }

    public final void IconCompatParcelizer(int i) {
        this.MediaBrowserCompatItemReceiver = i;
    }

    public final void read(int i) {
        this.AudioAttributesImplApi26Parcelizer = i;
    }

    public final setShowingForActionMode RemoteActionCompatParcelizer(boolean p0, int p1, int p2) {
        int i = WhenMappings.AudioAttributesCompatParcelizer[this.RemoteActionCompatParcelizer.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new RenewEligibleCreator();
                }
                if (p0) {
                    return this.MediaBrowserCompatSearchResultReceiver;
                }
                if (p1 + 1 < this.IconCompatParcelizer || p2 < this.write) {
                    return null;
                }
                return this.RatingCompat;
            }
            if (p0) {
                return this.MediaBrowserCompatSearchResultReceiver;
            }
        }
        return null;
    }

    public final isCancelable.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(boolean p0, int p1, int p2) {
        isTypeOrSuperTypeOf istypeorsupertypeofInvoke;
        setShowingForActionMode setshowingforactionmode;
        _parser _parserVar;
        isTypeOrSuperTypeOf istypeorsupertypeof;
        _parser _parserVar2;
        int i = WhenMappings.AudioAttributesCompatParcelizer[this.RemoteActionCompatParcelizer.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i != 3 && i != 4) {
            throw new RenewEligibleCreator();
        }
        if (p0) {
            MagicModuleSubmissionRequestBody<? super Boolean, ? super Integer, ? extends isTypeOrSuperTypeOf> magicModuleSubmissionRequestBody = this.MediaDescriptionCompat;
            if (magicModuleSubmissionRequestBody == null || (istypeorsupertypeofInvoke = magicModuleSubmissionRequestBody.invoke(Boolean.TRUE, Integer.valueOf(AudioAttributesCompatParcelizer()))) == null) {
                istypeorsupertypeofInvoke = this.AudioAttributesImplApi21Parcelizer;
            }
            setshowingforactionmode = this.MediaBrowserCompatSearchResultReceiver;
            if (this.MediaDescriptionCompat == null) {
                _parserVar = this.AudioAttributesImplBaseParcelizer;
                _parserVar2 = _parserVar;
                istypeorsupertypeof = istypeorsupertypeofInvoke;
            }
            istypeorsupertypeof = istypeorsupertypeofInvoke;
            _parserVar2 = null;
        } else {
            if (p1 < this.IconCompatParcelizer - 1 || p2 < this.write) {
                istypeorsupertypeofInvoke = null;
            } else {
                MagicModuleSubmissionRequestBody<? super Boolean, ? super Integer, ? extends isTypeOrSuperTypeOf> magicModuleSubmissionRequestBody2 = this.MediaDescriptionCompat;
                if (magicModuleSubmissionRequestBody2 == null || (istypeorsupertypeofInvoke = magicModuleSubmissionRequestBody2.invoke(Boolean.FALSE, Integer.valueOf(AudioAttributesCompatParcelizer()))) == null) {
                    istypeorsupertypeofInvoke = this.MediaBrowserCompatCustomActionResultReceiver;
                }
            }
            setshowingforactionmode = this.RatingCompat;
            if (this.MediaDescriptionCompat == null) {
                _parserVar = this.MediaBrowserCompatMediaItem;
                _parserVar2 = _parserVar;
                istypeorsupertypeof = istypeorsupertypeofInvoke;
            }
            istypeorsupertypeof = istypeorsupertypeofInvoke;
            _parserVar2 = null;
        }
        if (istypeorsupertypeof == null) {
            return null;
        }
        toMagicModuleMetaRepoModel.write(setshowingforactionmode);
        return new isCancelable.RemoteActionCompatParcelizer(istypeorsupertypeof, _parserVar2, setshowingforactionmode.read(), false, 8, null);
    }

    public final void write(hasHandlers p0, hasHandlers p1, boolean p2, long p3) {
        long jAudioAttributesCompatParcelizer = getNextTransition.AudioAttributesCompatParcelizer(p3, p2 ? getAnimatingAway.read : getAnimatingAway.RemoteActionCompatParcelizer);
        if (p0 != null) {
            int iWrite = dismissNow.write(p0, p2, PropertyValueAny.AudioAttributesImplApi21Parcelizer(jAudioAttributesCompatParcelizer));
            this.MediaBrowserCompatSearchResultReceiver = setShowingForActionMode.RemoteActionCompatParcelizer(setShowingForActionMode.write(iWrite, dismissNow.AudioAttributesCompatParcelizer(p0, p2, iWrite)));
            this.AudioAttributesImplApi21Parcelizer = p0 instanceof isTypeOrSuperTypeOf ? (isTypeOrSuperTypeOf) p0 : null;
            this.AudioAttributesImplBaseParcelizer = null;
        }
        if (p1 != null) {
            int iWrite2 = dismissNow.write(p1, p2, PropertyValueAny.AudioAttributesImplApi21Parcelizer(jAudioAttributesCompatParcelizer));
            this.RatingCompat = setShowingForActionMode.RemoteActionCompatParcelizer(setShowingForActionMode.write(iWrite2, dismissNow.AudioAttributesCompatParcelizer(p1, p2, iWrite2)));
            this.MediaBrowserCompatCustomActionResultReceiver = p1 instanceof isTypeOrSuperTypeOf ? (isTypeOrSuperTypeOf) p1 : null;
            this.MediaBrowserCompatMediaItem = null;
        }
    }

    public final void IconCompatParcelizer(final onStart p0, isTypeOrSuperTypeOf p1, isTypeOrSuperTypeOf p2, long p3) {
        getAnimatingAway getanimatingaway = p0.IconCompatParcelizer() ? getAnimatingAway.read : getAnimatingAway.RemoteActionCompatParcelizer;
        long j = getNextTransition.read(getNextTransition.write$default(getNextTransition.AudioAttributesCompatParcelizer(p3, getanimatingaway), 0, 0, 0, 0, 10, null), getanimatingaway);
        if (p1 != null) {
            dismissNow.write(p1, p0, j, new getAnswerMap() { // from class: o.onDetach
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return onGetLayoutInflater.IconCompatParcelizer(this.write, p0, (_parser) obj);
                }
            });
            this.AudioAttributesImplApi21Parcelizer = p1;
        }
        if (p2 != null) {
            dismissNow.write(p2, p0, j, new getAnswerMap() { // from class: o.onHasView
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return onGetLayoutInflater.read(this.RemoteActionCompatParcelizer, p0, (_parser) obj);
                }
            });
            this.MediaBrowserCompatCustomActionResultReceiver = p2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(onGetLayoutInflater ongetlayoutinflater, onStart onstart, _parser _parserVar) {
        int iIconCompatParcelizer;
        int iWrite;
        if (_parserVar != null) {
            iIconCompatParcelizer = onstart.IconCompatParcelizer(_parserVar);
            iWrite = onstart.write(_parserVar);
        } else {
            iIconCompatParcelizer = 0;
            iWrite = 0;
        }
        ongetlayoutinflater.MediaBrowserCompatSearchResultReceiver = setShowingForActionMode.RemoteActionCompatParcelizer(setShowingForActionMode.write(iIconCompatParcelizer, iWrite));
        ongetlayoutinflater.AudioAttributesImplBaseParcelizer = _parserVar;
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(onGetLayoutInflater ongetlayoutinflater, onStart onstart, _parser _parserVar) {
        int iIconCompatParcelizer;
        int iWrite;
        if (_parserVar != null) {
            iIconCompatParcelizer = onstart.IconCompatParcelizer(_parserVar);
            iWrite = onstart.write(_parserVar);
        } else {
            iIconCompatParcelizer = 0;
            iWrite = 0;
        }
        ongetlayoutinflater.RatingCompat = setShowingForActionMode.RemoteActionCompatParcelizer(setShowingForActionMode.write(iIconCompatParcelizer, iWrite));
        ongetlayoutinflater.MediaBrowserCompatMediaItem = _parserVar;
        return getShowPopup.INSTANCE;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof onGetLayoutInflater)) {
            return false;
        }
        onGetLayoutInflater ongetlayoutinflater = (onGetLayoutInflater) p0;
        return this.RemoteActionCompatParcelizer == ongetlayoutinflater.RemoteActionCompatParcelizer && this.IconCompatParcelizer == ongetlayoutinflater.IconCompatParcelizer && this.write == ongetlayoutinflater.write;
    }

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("onGetLayoutInflater(RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
