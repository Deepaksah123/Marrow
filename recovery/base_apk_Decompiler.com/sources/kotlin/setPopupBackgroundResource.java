package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._parser;
import kotlin.setLayoutInflater;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0018J#\u0010!\u001a\u00020 *\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u0018R\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\"\u0004\b&\u0010'R4\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b(\u0010)\"\u0004\b#\u0010*R4\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b+\u0010)\"\u0004\b\u0017\u0010*R4\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b,\u0010)\"\u0004\b!\u0010*R\"\u0010\u0017\u001a\u00020\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010-\u001a\u0004\b!\u0010.\"\u0004\b\u001c\u0010/R\"\u00103\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u00100\u001a\u0004\b#\u00101\"\u0004\b\u0017\u00102R\"\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b3\u00104\"\u0004\b\u0017\u00105R\u001c\u0010+\u001a\u00020\u00138\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b&\u00107\"\u0004\b#\u00108R\u0016\u0010:\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00109R\u0016\u0010;\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010>\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u001f8\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\b:\u0010<\"\u0004\b\u0017\u0010=R\u0018\u0010(\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b!\u0010@R\u0013\u0010,\u001a\u0004\u0018\u00010?8G¢\u0006\u0006\u001a\u0004\b&\u0010AR,\u0010G\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060D0B8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010FR,\u0010E\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0D0B8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010F"}, d2 = {"Lo/setPopupBackgroundResource;", "Lo/setLastBaselineToBottomHeight;", "Lo/setLayoutInflater;", "Lo/setDropDownHorizontalOffset;", "p0", "Lo/setLayoutInflater$IconCompatParcelizer;", "Lo/getKey;", "Lo/MenuPopupWindowMenuDropDownListView;", "p1", "Lo/hasReferringProperties;", "p2", "p3", "Lo/setDropDownVerticalOffset;", "p4", "Lo/setDropDownWidth;", "p5", "Lkotlin/Function0;", "", "p6", "Lo/setCompoundDrawablesRelativeWithIntrinsicBounds;", "p7", "<init>", "(Lo/setLayoutInflater;Lo/setLayoutInflater$IconCompatParcelizer;Lo/setLayoutInflater$IconCompatParcelizer;Lo/setLayoutInflater$IconCompatParcelizer;Lo/setDropDownVerticalOffset;Lo/setDropDownWidth;Lo/getCreatedOnDateMs;Lo/setCompoundDrawablesRelativeWithIntrinsicBounds;)V", "AudioAttributesCompatParcelizer", "(Lo/setDropDownHorizontalOffset;J)J", "", "c_", "()V", "RemoteActionCompatParcelizer", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "write", "onCustomAction", "Lo/setLayoutInflater;", "IconCompatParcelizer", "(Lo/setLayoutInflater;)V", "MediaMetadataCompat", "Lo/setLayoutInflater$IconCompatParcelizer;", "(Lo/setLayoutInflater$IconCompatParcelizer;)V", "AudioAttributesImplApi26Parcelizer", "RatingCompat", "Lo/setDropDownVerticalOffset;", "()Lo/setDropDownVerticalOffset;", "(Lo/setDropDownVerticalOffset;)V", "Lo/setDropDownWidth;", "()Lo/setDropDownWidth;", "(Lo/setDropDownWidth;)V", "AudioAttributesImplBaseParcelizer", "Lo/getCreatedOnDateMs;", "(Lo/getCreatedOnDateMs;)V", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setCompoundDrawablesRelativeWithIntrinsicBounds;", "(Lo/setCompoundDrawablesRelativeWithIntrinsicBounds;)V", "Z", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "J", "(J)V", "MediaBrowserCompatSearchResultReceiver", "Lo/_skipWSOrEnd;", "Lo/_skipWSOrEnd;", "()Lo/_skipWSOrEnd;", "Lkotlin/Function1;", "Lo/setLayoutInflater$write;", "Lo/SwitchCompat;", "MediaBrowserCompatMediaItem", "Lo/getAnswerMap;", "MediaDescriptionCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setPopupBackgroundResource extends setLastBaselineToBottomHeight {
    private setDropDownVerticalOffset AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<hasReferringProperties, MenuPopupWindowMenuDropDownListView> write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private getCreatedOnDateMs<Boolean> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private setCompoundDrawablesRelativeWithIntrinsicBounds AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<getKey, MenuPopupWindowMenuDropDownListView> read;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<hasReferringProperties, MenuPopupWindowMenuDropDownListView> IconCompatParcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private setLayoutInflater<setDropDownHorizontalOffset> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public _skipWSOrEnd MediaMetadataCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private setDropDownWidth AudioAttributesImplBaseParcelizer;
    private long AudioAttributesImplApi21Parcelizer = AppCompatMultiAutoCompleteTextView.AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private long MediaBrowserCompatSearchResultReceiver = PropertyValueBuffer.read$default(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final getAnswerMap<setLayoutInflater.write<setDropDownHorizontalOffset>, SwitchCompat<getKey>> MediaDescriptionCompat = new AnonymousClass10();

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final getAnswerMap<setLayoutInflater.write<setDropDownHorizontalOffset>, SwitchCompat<hasReferringProperties>> MediaBrowserCompatMediaItem = new AnonymousClass7();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[setDropDownHorizontalOffset.values().length];
            try {
                iArr[setDropDownHorizontalOffset.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setDropDownHorizontalOffset.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setDropDownHorizontalOffset.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            read = iArr;
        }
    }

    public setPopupBackgroundResource(setLayoutInflater<setDropDownHorizontalOffset> setlayoutinflater, setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<getKey, MenuPopupWindowMenuDropDownListView> iconCompatParcelizer, setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<hasReferringProperties, MenuPopupWindowMenuDropDownListView> iconCompatParcelizer2, setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<hasReferringProperties, MenuPopupWindowMenuDropDownListView> iconCompatParcelizer3, setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth, getCreatedOnDateMs<Boolean> getcreatedondatems, setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds) {
        this.RemoteActionCompatParcelizer = setlayoutinflater;
        this.read = iconCompatParcelizer;
        this.write = iconCompatParcelizer2;
        this.IconCompatParcelizer = iconCompatParcelizer3;
        this.AudioAttributesCompatParcelizer = setdropdownverticaloffset;
        this.AudioAttributesImplBaseParcelizer = setdropdownwidth;
        this.MediaBrowserCompatCustomActionResultReceiver = getcreatedondatems;
        this.AudioAttributesImplApi26Parcelizer = setcompounddrawablesrelativewithintrinsicbounds;
    }

    public final void IconCompatParcelizer(setLayoutInflater<setDropDownHorizontalOffset> setlayoutinflater) {
        this.RemoteActionCompatParcelizer = setlayoutinflater;
    }

    public final void write(setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<getKey, MenuPopupWindowMenuDropDownListView> iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<hasReferringProperties, MenuPopupWindowMenuDropDownListView> iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public final void read(setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<hasReferringProperties, MenuPopupWindowMenuDropDownListView> iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(setDropDownVerticalOffset setdropdownverticaloffset) {
        this.AudioAttributesCompatParcelizer = setdropdownverticaloffset;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final setDropDownVerticalOffset getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(setDropDownWidth setdropdownwidth) {
        this.AudioAttributesImplBaseParcelizer = setdropdownwidth;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final setDropDownWidth getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(getCreatedOnDateMs<Boolean> getcreatedondatems) {
        this.MediaBrowserCompatCustomActionResultReceiver = getcreatedondatems;
    }

    public final void write(setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds) {
        this.AudioAttributesImplApi26Parcelizer = setcompounddrawablesrelativewithintrinsicbounds;
    }

    private final void AudioAttributesCompatParcelizer(long j) {
        this.MediaBrowserCompatItemReceiver = true;
        this.MediaBrowserCompatSearchResultReceiver = j;
    }

    public final _skipWSOrEnd IconCompatParcelizer() {
        _skipWSOrEnd remoteActionCompatParcelizer;
        _skipWSOrEnd remoteActionCompatParcelizer2;
        if (this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer().IconCompatParcelizer(setDropDownHorizontalOffset.read, setDropDownHorizontalOffset.IconCompatParcelizer)) {
            AppCompatImageView iconCompatParcelizer = this.AudioAttributesCompatParcelizer.getWrite().getIconCompatParcelizer();
            if (iconCompatParcelizer != null && (remoteActionCompatParcelizer2 = iconCompatParcelizer.getRemoteActionCompatParcelizer()) != null) {
                return remoteActionCompatParcelizer2;
            }
            AppCompatImageView iconCompatParcelizer2 = this.AudioAttributesImplBaseParcelizer.getAudioAttributesCompatParcelizer().getIconCompatParcelizer();
            if (iconCompatParcelizer2 != null) {
                return iconCompatParcelizer2.getRemoteActionCompatParcelizer();
            }
            return null;
        }
        AppCompatImageView iconCompatParcelizer3 = this.AudioAttributesImplBaseParcelizer.getAudioAttributesCompatParcelizer().getIconCompatParcelizer();
        if (iconCompatParcelizer3 != null && (remoteActionCompatParcelizer = iconCompatParcelizer3.getRemoteActionCompatParcelizer()) != null) {
            return remoteActionCompatParcelizer;
        }
        AppCompatImageView iconCompatParcelizer4 = this.AudioAttributesCompatParcelizer.getWrite().getIconCompatParcelizer();
        if (iconCompatParcelizer4 != null) {
            return iconCompatParcelizer4.getRemoteActionCompatParcelizer();
        }
        return null;
    }

    /* JADX INFO: renamed from: o.setPopupBackgroundResource$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/setLayoutInflater$write;", "Lo/setDropDownHorizontalOffset;", "Lo/SwitchCompat;", "Lo/getKey;", "RemoteActionCompatParcelizer", "(Lo/setLayoutInflater$write;)Lo/SwitchCompat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass10 extends MagicModuleUseCase implements getAnswerMap<setLayoutInflater.write<setDropDownHorizontalOffset>, SwitchCompat<getKey>> {
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final SwitchCompat<getKey> invoke(setLayoutInflater.write<setDropDownHorizontalOffset> writeVar) {
            setNavigationOnClickListener setnavigationonclicklistenerAudioAttributesCompatParcelizer = null;
            if (writeVar.IconCompatParcelizer(setDropDownHorizontalOffset.read, setDropDownHorizontalOffset.IconCompatParcelizer)) {
                AppCompatImageView iconCompatParcelizer = setPopupBackgroundResource.this.getAudioAttributesCompatParcelizer().getWrite().getIconCompatParcelizer();
                if (iconCompatParcelizer != null) {
                    setnavigationonclicklistenerAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer();
                }
            } else if (!writeVar.IconCompatParcelizer(setDropDownHorizontalOffset.IconCompatParcelizer, setDropDownHorizontalOffset.write)) {
                setnavigationonclicklistenerAudioAttributesCompatParcelizer = AppCompatRatingBar.read;
            } else {
                AppCompatImageView iconCompatParcelizer2 = setPopupBackgroundResource.this.getAudioAttributesImplBaseParcelizer().getAudioAttributesCompatParcelizer().getIconCompatParcelizer();
                if (iconCompatParcelizer2 != null) {
                    setnavigationonclicklistenerAudioAttributesCompatParcelizer = iconCompatParcelizer2.AudioAttributesCompatParcelizer();
                }
            }
            return setnavigationonclicklistenerAudioAttributesCompatParcelizer == null ? AppCompatRatingBar.read : setnavigationonclicklistenerAudioAttributesCompatParcelizer;
        }

        AnonymousClass10() {
            super(1);
        }
    }

    public final long AudioAttributesCompatParcelizer(setDropDownHorizontalOffset p0, long p1) {
        getAnswerMap<getKey, getKey> getanswermap;
        getAnswerMap<getKey, getKey> getanswermap2;
        int i = WhenMappings.read[p0.ordinal()];
        if (i != 1) {
            if (i == 2) {
                AppCompatImageView iconCompatParcelizer = this.AudioAttributesCompatParcelizer.getWrite().getIconCompatParcelizer();
                if (iconCompatParcelizer != null && (getanswermap = iconCompatParcelizer.read()) != null) {
                    return getanswermap.invoke(getKey.AudioAttributesCompatParcelizer(p1)).getRemoteActionCompatParcelizer();
                }
            } else {
                if (i != 3) {
                    throw new RenewEligibleCreator();
                }
                AppCompatImageView iconCompatParcelizer2 = this.AudioAttributesImplBaseParcelizer.getAudioAttributesCompatParcelizer().getIconCompatParcelizer();
                if (iconCompatParcelizer2 != null && (getanswermap2 = iconCompatParcelizer2.read()) != null) {
                    return getanswermap2.invoke(getKey.AudioAttributesCompatParcelizer(p1)).getRemoteActionCompatParcelizer();
                }
            }
        }
        return p1;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void c_() {
        super.c_();
        this.MediaBrowserCompatItemReceiver = false;
        this.AudioAttributesImplApi21Parcelizer = AppCompatMultiAutoCompleteTextView.AudioAttributesCompatParcelizer();
    }

    public final long RemoteActionCompatParcelizer(setDropDownHorizontalOffset p0, long p1) {
        if (this.MediaMetadataCompat != null && IconCompatParcelizer() != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, IconCompatParcelizer())) {
            int i = WhenMappings.read[p0.ordinal()];
            if (i == 1) {
                return hasReferringProperties.INSTANCE.write();
            }
            if (i == 2) {
                return hasReferringProperties.INSTANCE.write();
            }
            if (i != 3) {
                throw new RenewEligibleCreator();
            }
            AppCompatImageView iconCompatParcelizer = this.AudioAttributesImplBaseParcelizer.getAudioAttributesCompatParcelizer().getIconCompatParcelizer();
            if (iconCompatParcelizer != null) {
                long remoteActionCompatParcelizer = iconCompatParcelizer.read().invoke(getKey.AudioAttributesCompatParcelizer(p1)).getRemoteActionCompatParcelizer();
                _skipWSOrEnd _skipwsorendIconCompatParcelizer = IconCompatParcelizer();
                toMagicModuleMetaRepoModel.write(_skipwsorendIconCompatParcelizer);
                long jIconCompatParcelizer = _skipwsorendIconCompatParcelizer.IconCompatParcelizer(p1, remoteActionCompatParcelizer, tryToResolveUnresolved.write);
                _skipWSOrEnd _skipwsorend = this.MediaMetadataCompat;
                toMagicModuleMetaRepoModel.write(_skipwsorend);
                return hasReferringProperties.IconCompatParcelizer(jIconCompatParcelizer, _skipwsorend.IconCompatParcelizer(p1, remoteActionCompatParcelizer, tryToResolveUnresolved.write));
            }
            return hasReferringProperties.INSTANCE.write();
        }
        return hasReferringProperties.INSTANCE.write();
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        parseDouble<hasReferringProperties> parsedoubleAudioAttributesCompatParcelizer;
        parseDouble<hasReferringProperties> parsedoubleAudioAttributesCompatParcelizer2;
        if (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() == this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer()) {
            this.MediaMetadataCompat = null;
        } else if (this.MediaMetadataCompat == null) {
            _skipWSOrEnd _skipwsorendIconCompatParcelizer = IconCompatParcelizer();
            if (_skipwsorendIconCompatParcelizer == null) {
                _skipwsorendIconCompatParcelizer = _skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver();
            }
            this.MediaMetadataCompat = _skipwsorendIconCompatParcelizer;
        }
        if (withcontentvaluehandler.r_()) {
            _parser _parserVarWrite = istypeorsupertypeof.write(j);
            long j2 = -1;
            long j3 = getKey.read((((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) _parserVarWrite.getRemoteActionCompatParcelizer())) | (((long) _parserVarWrite.getRead()) << 32));
            this.AudioAttributesImplApi21Parcelizer = j3;
            AudioAttributesCompatParcelizer(j);
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, (int) (j3 >> 32), (int) j3, null, new AnonymousClass5(_parserVarWrite), 4, null);
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver.invoke().booleanValue()) {
            getAnswerMap<validateAppend, getShowPopup> getanswermapAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
            _parser _parserVarWrite2 = istypeorsupertypeof.write(j);
            long j4 = -1;
            long remoteActionCompatParcelizer = getKey.read((((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32))) & ((long) _parserVarWrite2.getRemoteActionCompatParcelizer())) | (((long) _parserVarWrite2.getRead()) << 32));
            long j5 = AppCompatMultiAutoCompleteTextView.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer) ? this.AudioAttributesImplApi21Parcelizer : remoteActionCompatParcelizer;
            setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<getKey, MenuPopupWindowMenuDropDownListView> iconCompatParcelizer = this.read;
            parseDouble<getKey> parsedoubleAudioAttributesCompatParcelizer3 = iconCompatParcelizer != null ? iconCompatParcelizer.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat, new AnonymousClass3(j5)) : null;
            if (parsedoubleAudioAttributesCompatParcelizer3 != null) {
                remoteActionCompatParcelizer = parsedoubleAudioAttributesCompatParcelizer3.getRemoteActionCompatParcelizer().getRemoteActionCompatParcelizer();
            }
            long jWrite = PropertyValueBuffer.write(j, remoteActionCompatParcelizer);
            setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<hasReferringProperties, MenuPopupWindowMenuDropDownListView> iconCompatParcelizer2 = this.write;
            long jWrite2 = (iconCompatParcelizer2 == null || (parsedoubleAudioAttributesCompatParcelizer2 = iconCompatParcelizer2.AudioAttributesCompatParcelizer(AnonymousClass1.IconCompatParcelizer, new AnonymousClass8(j5))) == null) ? hasReferringProperties.INSTANCE.write() : parsedoubleAudioAttributesCompatParcelizer2.getRemoteActionCompatParcelizer().getWrite();
            setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<hasReferringProperties, MenuPopupWindowMenuDropDownListView> iconCompatParcelizer3 = this.IconCompatParcelizer;
            long jWrite3 = (iconCompatParcelizer3 == null || (parsedoubleAudioAttributesCompatParcelizer = iconCompatParcelizer3.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem, new AnonymousClass9(j5))) == null) ? hasReferringProperties.INSTANCE.write() : parsedoubleAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer().getWrite();
            _skipWSOrEnd _skipwsorend = this.MediaMetadataCompat;
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, (int) (jWrite >> 32), (int) jWrite, null, new AnonymousClass2(_parserVarWrite2, hasReferringProperties.AudioAttributesCompatParcelizer(_skipwsorend != null ? _skipwsorend.IconCompatParcelizer(j5, jWrite, tryToResolveUnresolved.write) : hasReferringProperties.INSTANCE.write(), jWrite3), jWrite2, getanswermapAudioAttributesCompatParcelizer), 4, null);
        }
        _parser _parserVarWrite3 = istypeorsupertypeof.write(j);
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite3.getRead(), _parserVarWrite3.getRemoteActionCompatParcelizer(), null, new AnonymousClass4(_parserVarWrite3), 4, null);
    }

    /* JADX INFO: renamed from: o.setPopupBackgroundResource$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "RemoteActionCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
        final /* synthetic */ _parser $RemoteActionCompatParcelizer;

        public final void RemoteActionCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
            _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, this.$RemoteActionCompatParcelizer, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
            RemoteActionCompatParcelizer(iconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(_parser _parserVar) {
            super(1);
            this.$RemoteActionCompatParcelizer = _parserVar;
        }
    }

    /* JADX INFO: renamed from: o.setPopupBackgroundResource$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/setDropDownHorizontalOffset;", "p0", "Lo/getKey;", "read", "(Lo/setDropDownHorizontalOffset;)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<setDropDownHorizontalOffset, getKey> {
        final /* synthetic */ long $RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getKey invoke(setDropDownHorizontalOffset setdropdownhorizontaloffset) {
            return getKey.AudioAttributesCompatParcelizer(read(setdropdownhorizontaloffset));
        }

        public final long read(setDropDownHorizontalOffset setdropdownhorizontaloffset) {
            return setPopupBackgroundResource.this.AudioAttributesCompatParcelizer(setdropdownhorizontaloffset, this.$RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(long j) {
            super(1);
            this.$RemoteActionCompatParcelizer = j;
        }
    }

    /* JADX INFO: renamed from: o.setPopupBackgroundResource$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/setLayoutInflater$write;", "Lo/setDropDownHorizontalOffset;", "Lo/SwitchCompat;", "Lo/hasReferringProperties;", "write", "(Lo/setLayoutInflater$write;)Lo/SwitchCompat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<setLayoutInflater.write<setDropDownHorizontalOffset>, SwitchCompat<hasReferringProperties>> {
        public static final AnonymousClass1 IconCompatParcelizer = new AnonymousClass1();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final SwitchCompat<hasReferringProperties> invoke(setLayoutInflater.write<setDropDownHorizontalOffset> writeVar) {
            return AppCompatRatingBar.write;
        }

        AnonymousClass1() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.setPopupBackgroundResource$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/setDropDownHorizontalOffset;", "p0", "Lo/hasReferringProperties;", "read", "(Lo/setDropDownHorizontalOffset;)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass8 extends MagicModuleUseCase implements getAnswerMap<setDropDownHorizontalOffset, hasReferringProperties> {
        final /* synthetic */ long $RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ hasReferringProperties invoke(setDropDownHorizontalOffset setdropdownhorizontaloffset) {
            return hasReferringProperties.write(read(setdropdownhorizontaloffset));
        }

        public final long read(setDropDownHorizontalOffset setdropdownhorizontaloffset) {
            return setPopupBackgroundResource.this.RemoteActionCompatParcelizer(setdropdownhorizontaloffset, this.$RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(long j) {
            super(1);
            this.$RemoteActionCompatParcelizer = j;
        }
    }

    /* JADX INFO: renamed from: o.setPopupBackgroundResource$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/setDropDownHorizontalOffset;", "p0", "Lo/hasReferringProperties;", "RemoteActionCompatParcelizer", "(Lo/setDropDownHorizontalOffset;)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass9 extends MagicModuleUseCase implements getAnswerMap<setDropDownHorizontalOffset, hasReferringProperties> {
        final /* synthetic */ long $write;

        public final long RemoteActionCompatParcelizer(setDropDownHorizontalOffset setdropdownhorizontaloffset) {
            return setPopupBackgroundResource.this.write(setdropdownhorizontaloffset, this.$write);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ hasReferringProperties invoke(setDropDownHorizontalOffset setdropdownhorizontaloffset) {
            return hasReferringProperties.write(RemoteActionCompatParcelizer(setdropdownhorizontaloffset));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(long j) {
            super(1);
            this.$write = j;
        }
    }

    /* JADX INFO: renamed from: o.setPopupBackgroundResource$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "RemoteActionCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
        final /* synthetic */ long $AudioAttributesCompatParcelizer;
        final /* synthetic */ long $IconCompatParcelizer;
        final /* synthetic */ getAnswerMap<validateAppend, getShowPopup> $RemoteActionCompatParcelizer;
        final /* synthetic */ _parser $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
            RemoteActionCompatParcelizer(iconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
            _parser _parserVar = this.$read;
            int iIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(this.$IconCompatParcelizer);
            int iIconCompatParcelizer2 = hasReferringProperties.IconCompatParcelizer(this.$AudioAttributesCompatParcelizer);
            iconCompatParcelizer.read(_parserVar, iIconCompatParcelizer2 + iIconCompatParcelizer, hasReferringProperties.AudioAttributesCompatParcelizer(this.$IconCompatParcelizer) + hasReferringProperties.AudioAttributesCompatParcelizer(this.$AudioAttributesCompatParcelizer), BitmapDescriptorFactory.HUE_RED, this.$RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(_parser _parserVar, long j, long j2, getAnswerMap<? super validateAppend, getShowPopup> getanswermap) {
            super(1);
            this.$read = _parserVar;
            this.$IconCompatParcelizer = j;
            this.$AudioAttributesCompatParcelizer = j2;
            this.$RemoteActionCompatParcelizer = getanswermap;
        }
    }

    /* JADX INFO: renamed from: o.setPopupBackgroundResource$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "AudioAttributesCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
        final /* synthetic */ _parser $RemoteActionCompatParcelizer;

        public final void AudioAttributesCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
            _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, this.$RemoteActionCompatParcelizer, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
            AudioAttributesCompatParcelizer(iconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(_parser _parserVar) {
            super(1);
            this.$RemoteActionCompatParcelizer = _parserVar;
        }
    }

    /* JADX INFO: renamed from: o.setPopupBackgroundResource$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/setLayoutInflater$write;", "Lo/setDropDownHorizontalOffset;", "Lo/SwitchCompat;", "Lo/hasReferringProperties;", "IconCompatParcelizer", "(Lo/setLayoutInflater$write;)Lo/SwitchCompat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass7 extends MagicModuleUseCase implements getAnswerMap<setLayoutInflater.write<setDropDownHorizontalOffset>, SwitchCompat<hasReferringProperties>> {
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final SwitchCompat<hasReferringProperties> invoke(setLayoutInflater.write<setDropDownHorizontalOffset> writeVar) {
            SwitchCompat<hasReferringProperties> switchCompat;
            SwitchCompat<hasReferringProperties> switchCompat2;
            if (writeVar.IconCompatParcelizer(setDropDownHorizontalOffset.read, setDropDownHorizontalOffset.IconCompatParcelizer)) {
                AppCompatToggleButton read = setPopupBackgroundResource.this.getAudioAttributesCompatParcelizer().getWrite().getRead();
                return (read == null || (switchCompat2 = read.read()) == null) ? AppCompatRatingBar.write : switchCompat2;
            }
            if (!writeVar.IconCompatParcelizer(setDropDownHorizontalOffset.IconCompatParcelizer, setDropDownHorizontalOffset.write)) {
                return AppCompatRatingBar.write;
            }
            AppCompatToggleButton read2 = setPopupBackgroundResource.this.getAudioAttributesImplBaseParcelizer().getAudioAttributesCompatParcelizer().getRead();
            return (read2 == null || (switchCompat = read2.read()) == null) ? AppCompatRatingBar.write : switchCompat;
        }

        AnonymousClass7() {
            super(1);
        }
    }

    public final long write(setDropDownHorizontalOffset p0, long p1) {
        getAnswerMap<getKey, hasReferringProperties> getanswermapAudioAttributesCompatParcelizer;
        getAnswerMap<getKey, hasReferringProperties> getanswermapAudioAttributesCompatParcelizer2;
        AppCompatToggleButton read = this.AudioAttributesCompatParcelizer.getWrite().getRead();
        long jWrite = (read == null || (getanswermapAudioAttributesCompatParcelizer2 = read.AudioAttributesCompatParcelizer()) == null) ? hasReferringProperties.INSTANCE.write() : getanswermapAudioAttributesCompatParcelizer2.invoke(getKey.AudioAttributesCompatParcelizer(p1)).getWrite();
        AppCompatToggleButton read2 = this.AudioAttributesImplBaseParcelizer.getAudioAttributesCompatParcelizer().getRead();
        long jWrite2 = (read2 == null || (getanswermapAudioAttributesCompatParcelizer = read2.AudioAttributesCompatParcelizer()) == null) ? hasReferringProperties.INSTANCE.write() : getanswermapAudioAttributesCompatParcelizer.invoke(getKey.AudioAttributesCompatParcelizer(p1)).getWrite();
        int i = WhenMappings.read[p0.ordinal()];
        if (i == 1) {
            return hasReferringProperties.INSTANCE.write();
        }
        if (i == 2) {
            return jWrite;
        }
        if (i == 3) {
            return jWrite2;
        }
        throw new RenewEligibleCreator();
    }
}
