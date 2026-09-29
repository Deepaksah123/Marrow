package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.setLayoutInflater;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R2\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0019\"\u0004\b\u0018\u0010\u001aR\"\u0010\u0016\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u0012\u0010\u001d\"\u0004\b\u0014\u0010\u001eR\"\u0010\u0014\u001a\u00020\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0016\u0010 \"\u0004\b\u0018\u0010!"}, d2 = {"Lo/setBaselineAligned;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/addKeySerializers;", "Lo/setLayoutInflater;", "Lo/setDropDownHorizontalOffset;", "p0", "Lo/setLayoutInflater$IconCompatParcelizer;", "Lo/switchToNext;", "Lo/setAppSearchData;", "p1", "Lo/setDropDownVerticalOffset;", "p2", "Lo/setDropDownWidth;", "p3", "<init>", "(Lo/setLayoutInflater;Lo/setLayoutInflater$IconCompatParcelizer;Lo/setDropDownVerticalOffset;Lo/setDropDownWidth;)V", "Lo/findSerializer;", "", "write", "(Lo/findSerializer;)V", "AudioAttributesCompatParcelizer", "Lo/setLayoutInflater;", "read", "(Lo/setLayoutInflater;)V", "RemoteActionCompatParcelizer", "Lo/setLayoutInflater$IconCompatParcelizer;", "(Lo/setLayoutInflater$IconCompatParcelizer;)V", "IconCompatParcelizer", "Lo/setDropDownVerticalOffset;", "()Lo/setDropDownVerticalOffset;", "(Lo/setDropDownVerticalOffset;)V", "Lo/setDropDownWidth;", "()Lo/setDropDownWidth;", "(Lo/setDropDownWidth;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setBaselineAligned extends _handleOddName.IconCompatParcelizer implements addKeySerializers {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private setLayoutInflater<setDropDownHorizontalOffset> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private setDropDownWidth AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<switchToNext, setAppSearchData> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private setDropDownVerticalOffset read;

    public setBaselineAligned(setLayoutInflater<setDropDownHorizontalOffset> setlayoutinflater, setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<switchToNext, setAppSearchData> iconCompatParcelizer, setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth) {
        this.RemoteActionCompatParcelizer = setlayoutinflater;
        this.IconCompatParcelizer = iconCompatParcelizer;
        this.read = setdropdownverticaloffset;
        this.AudioAttributesCompatParcelizer = setdropdownwidth;
    }

    public final void read(setLayoutInflater<setDropDownHorizontalOffset> setlayoutinflater) {
        this.RemoteActionCompatParcelizer = setlayoutinflater;
    }

    public final void RemoteActionCompatParcelizer(setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<switchToNext, setAppSearchData> iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(setDropDownVerticalOffset setdropdownverticaloffset) {
        this.read = setdropdownverticaloffset;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final setDropDownVerticalOffset getRead() {
        return this.read;
    }

    public final void RemoteActionCompatParcelizer(setDropDownWidth setdropdownwidth) {
        this.AudioAttributesCompatParcelizer = setdropdownwidth;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final setDropDownWidth getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.addKeySerializers
    public final void write(findSerializer findserializer) {
        long jAudioAttributesCompatParcelizer;
        findserializer.write();
        parseDouble<switchToNext> parsedoubleAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(new AnonymousClass4(), new AnonymousClass5());
        if (switchToNext.RemoteActionCompatParcelizer(parsedoubleAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer().getIconCompatParcelizer()) == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        setDecorPadding audioAttributesCompatParcelizer = this.read.getWrite().getAudioAttributesCompatParcelizer();
        if (audioAttributesCompatParcelizer == null) {
            audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer();
        }
        if (audioAttributesCompatParcelizer != null && audioAttributesCompatParcelizer.getIconCompatParcelizer()) {
            isAbstract isabstractAudioAttributesImplApi21Parcelizer = collectLongDefaults.AudioAttributesImplApi21Parcelizer(this);
            isAbstract isabstractRemoteActionCompatParcelizer = isabstractAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
            if (isabstractRemoteActionCompatParcelizer == null) {
                jAudioAttributesCompatParcelizer = calloc.INSTANCE.AudioAttributesCompatParcelizer();
            } else {
                long jWrite = isabstractRemoteActionCompatParcelizer.write();
                long j = -1;
                jAudioAttributesCompatParcelizer = calloc.write((((long) Float.floatToRawIntBits((int) jWrite)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits((int) (jWrite >> 32))) << 32));
            }
            findSetterInfo.read$default(findserializer, parsedoubleAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer().getIconCompatParcelizer(), getReferencedType.AudioAttributesCompatParcelizer((-9223372034707292160L) ^ hasRawClass.read(isabstractAudioAttributesImplApi21Parcelizer)), jAudioAttributesCompatParcelizer, BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
            return;
        }
        findSetterInfo.read$default(findserializer, parsedoubleAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer().getIconCompatParcelizer(), 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 126, null);
    }

    /* JADX INFO: renamed from: o.setBaselineAligned$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/setDropDownHorizontalOffset;", "p0", "Lo/switchToNext;", "IconCompatParcelizer", "(Lo/setDropDownHorizontalOffset;)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<setDropDownHorizontalOffset, switchToNext> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ switchToNext invoke(setDropDownHorizontalOffset setdropdownhorizontaloffset) {
            return switchToNext.write(IconCompatParcelizer(setdropdownhorizontaloffset));
        }

        public final long IconCompatParcelizer(setDropDownHorizontalOffset setdropdownhorizontaloffset) {
            int i = setBaselineAligned$5$RemoteActionCompatParcelizer$WhenMappings.IconCompatParcelizer[setdropdownhorizontaloffset.ordinal()];
            if (i == 1) {
                setDecorPadding audioAttributesCompatParcelizer = setBaselineAligned.this.getRead().getWrite().getAudioAttributesCompatParcelizer();
                if (audioAttributesCompatParcelizer != null) {
                    return audioAttributesCompatParcelizer.getWrite();
                }
                setDecorPadding audioAttributesCompatParcelizer2 = setBaselineAligned.this.getAudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer();
                return audioAttributesCompatParcelizer2 != null ? audioAttributesCompatParcelizer2.getRemoteActionCompatParcelizer() : switchToNext.INSTANCE.AudioAttributesImplBaseParcelizer();
            }
            if (i == 2) {
                setDecorPadding audioAttributesCompatParcelizer3 = setBaselineAligned.this.getRead().getWrite().getAudioAttributesCompatParcelizer();
                return audioAttributesCompatParcelizer3 != null ? audioAttributesCompatParcelizer3.getRemoteActionCompatParcelizer() : switchToNext.INSTANCE.AudioAttributesImplBaseParcelizer();
            }
            if (i != 3) {
                throw new RenewEligibleCreator();
            }
            setDecorPadding audioAttributesCompatParcelizer4 = setBaselineAligned.this.getAudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer();
            return audioAttributesCompatParcelizer4 != null ? audioAttributesCompatParcelizer4.getWrite() : switchToNext.INSTANCE.AudioAttributesImplBaseParcelizer();
        }

        AnonymousClass5() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.setBaselineAligned$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/setLayoutInflater$write;", "Lo/setDropDownHorizontalOffset;", "Lo/SwitchCompat;", "Lo/switchToNext;", "read", "(Lo/setLayoutInflater$write;)Lo/SwitchCompat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<setLayoutInflater.write<setDropDownHorizontalOffset>, SwitchCompat<switchToNext>> {
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final SwitchCompat<switchToNext> invoke(setLayoutInflater.write<setDropDownHorizontalOffset> writeVar) {
            SwitchCompat<switchToNext> switchCompatIconCompatParcelizer;
            SwitchCompat<switchToNext> switchCompatIconCompatParcelizer2;
            if (writeVar.IconCompatParcelizer(setDropDownHorizontalOffset.read, setDropDownHorizontalOffset.IconCompatParcelizer)) {
                setDecorPadding audioAttributesCompatParcelizer = setBaselineAligned.this.getRead().getWrite().getAudioAttributesCompatParcelizer();
                return (audioAttributesCompatParcelizer == null || (switchCompatIconCompatParcelizer2 = audioAttributesCompatParcelizer.IconCompatParcelizer()) == null) ? AppCompatRatingBar.IconCompatParcelizer : switchCompatIconCompatParcelizer2;
            }
            if (!writeVar.IconCompatParcelizer(setDropDownHorizontalOffset.IconCompatParcelizer, setDropDownHorizontalOffset.write)) {
                return AppCompatRatingBar.IconCompatParcelizer;
            }
            setDecorPadding audioAttributesCompatParcelizer2 = setBaselineAligned.this.getAudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer();
            return (audioAttributesCompatParcelizer2 == null || (switchCompatIconCompatParcelizer = audioAttributesCompatParcelizer2.IconCompatParcelizer()) == null) ? AppCompatRatingBar.IconCompatParcelizer : switchCompatIconCompatParcelizer;
        }

        AnonymousClass4() {
            super(1);
        }
    }
}
