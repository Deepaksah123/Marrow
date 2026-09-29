package kotlin;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0018¢\u0006\u0004\b\u0012\u0010\u0019J\u001b\u0010\u0012\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u0012\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020 H\u0000¢\u0006\u0004\b\u0016\u0010!J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001f\u0010#R\u001c\u0010\u001f\u001a\u00020\u00048\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\"\u0010%R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u0016\u0010(\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010&\u001a\u0002028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u00103R\u0016\u0010-\u001a\u0002048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u00105"}, d2 = {"Lo/_readBinary;", "Lo/_writeCustomStringSegment2;", "Lo/EnumFeature;", "Lo/_verifyLongName;", "Lo/_writeRawSegment;", "p0", "Lo/typeIdResolverInstance;", "p1", "Landroid/view/View;", "p2", "Lo/getAttributes;", "p3", "", "p4", "<init>", "(Lo/_writeRawSegment;Lo/typeIdResolverInstance;Landroid/view/View;Lo/getAttributes;Ljava/lang/String;)V", "Lo/_findSymbol2;", "", "RemoteActionCompatParcelizer", "(Lo/_findSymbol2;Lo/_findSymbol2;)V", "Lo/namingStrategyInstance;", "Lo/valueInstantiators;", "read", "(Lo/namingStrategyInstance;Lo/valueInstantiators;)V", "Landroid/view/ViewStructure;", "(Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "(Landroid/util/SparseArray;)V", "write", "(Lo/namingStrategyInstance;)V", "IconCompatParcelizer", "", "(Lo/namingStrategyInstance;I)V", "AudioAttributesCompatParcelizer", "()V", "Lo/_writeRawSegment;", "()Lo/_writeRawSegment;", "AudioAttributesImplApi21Parcelizer", "Lo/typeIdResolverInstance;", "AudioAttributesImplBaseParcelizer", "Landroid/view/View;", "Lo/getAttributes;", "Ljava/lang/String;", "Landroid/graphics/Rect;", "AudioAttributesImplApi26Parcelizer", "Landroid/graphics/Rect;", "Landroid/view/autofill/AutofillId;", "MediaBrowserCompatItemReceiver", "Landroid/view/autofill/AutofillId;", "Lo/setBackgroundDrawable;", "Lo/setBackgroundDrawable;", "", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _readBinary extends _writeCustomStringSegment2 implements EnumFeature, _verifyLongName {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private setBackgroundDrawable AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final typeIdResolverInstance read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private Rect AudioAttributesImplBaseParcelizer = new Rect();

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final View RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;
    private AutofillId MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getAttributes AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private _writeRawSegment IconCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[MutableCoercionConfig.values().length];
            try {
                iArr[MutableCoercionConfig.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MutableCoercionConfig.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public _readBinary(_writeRawSegment _writerawsegment, typeIdResolverInstance typeidresolverinstance, View view, getAttributes getattributes, String str) {
        this.IconCompatParcelizer = _writerawsegment;
        this.read = typeidresolverinstance;
        this.RemoteActionCompatParcelizer = view;
        this.AudioAttributesCompatParcelizer = getattributes;
        this.write = str;
        view.setImportantForAutofill(1);
        findFormatDefaults findformatdefaultsWrite = getDefaultInclusion.write(view);
        AutofillId autofillIdAudioAttributesCompatParcelizer = findformatdefaultsWrite != null ? findformatdefaultsWrite.AudioAttributesCompatParcelizer() : null;
        if (autofillIdAudioAttributesCompatParcelizer != null) {
            this.MediaBrowserCompatItemReceiver = autofillIdAudioAttributesCompatParcelizer;
            this.AudioAttributesImplApi21Parcelizer = new setBackgroundDrawable(0, 1, null);
        } else {
            reportWrongTokenException.write("Required value was null.");
            throw new PlanDetailsCreator();
        }
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final _writeRawSegment getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin._verifyLongName
    public final void RemoteActionCompatParcelizer(_findSymbol2 p0, _findSymbol2 p1) {
        namingStrategyInstance namingstrategyinstanceMediaBrowserCompatItemReceiver;
        C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp;
        namingStrategyInstance namingstrategyinstanceMediaBrowserCompatItemReceiver2;
        C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp2;
        if (p0 != null && (namingstrategyinstanceMediaBrowserCompatItemReceiver2 = collectLongDefaults.MediaBrowserCompatItemReceiver(p0)) != null && (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp2 = namingstrategyinstanceMediaBrowserCompatItemReceiver2.accessgetReportFullyDrawnExecutorp()) != null && _parseUnsignedNumber.write(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp2)) {
            this.IconCompatParcelizer.write(this.RemoteActionCompatParcelizer, namingstrategyinstanceMediaBrowserCompatItemReceiver2.getIconCompatParcelizer());
        }
        if (p1 == null || (namingstrategyinstanceMediaBrowserCompatItemReceiver = collectLongDefaults.MediaBrowserCompatItemReceiver(p1)) == null || (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp = namingstrategyinstanceMediaBrowserCompatItemReceiver.accessgetReportFullyDrawnExecutorp()) == null || !_parseUnsignedNumber.write(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp)) {
            return;
        }
        int iMediaBrowserCompatItemReceiver = namingstrategyinstanceMediaBrowserCompatItemReceiver.getIconCompatParcelizer();
        this.AudioAttributesCompatParcelizer.getRead().read(iMediaBrowserCompatItemReceiver, new AnonymousClass5(iMediaBrowserCompatItemReceiver));
    }

    /* JADX INFO: renamed from: o._readBinary$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "p0", "p1", "p2", "p3", "", "IconCompatParcelizer", "(IIII)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getMagicModuleStat<Integer, Integer, Integer, Integer, getShowPopup> {
        final /* synthetic */ int $write;

        @Override // kotlin.getMagicModuleStat
        public final /* synthetic */ getShowPopup write(Integer num, Integer num2, Integer num3, Integer num4) {
            IconCompatParcelizer(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(int i, int i2, int i3, int i4) {
            _readBinary.this.getIconCompatParcelizer().RemoteActionCompatParcelizer(_readBinary.this.RemoteActionCompatParcelizer, this.$write, new Rect(i, i2, i3, i4));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(int i) {
            super(4);
            this.$write = i;
        }
    }

    @Override // kotlin.EnumFeature
    public final void read(namingStrategyInstance p0, C0216valueInstantiators p1) {
        Boolean bool;
        AbstractDeserializer abstractDeserializer;
        AbstractDeserializer abstractDeserializer2;
        C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp = p0.accessgetReportFullyDrawnExecutorp();
        int iMediaBrowserCompatItemReceiver = p0.getIconCompatParcelizer();
        String iconCompatParcelizer = (p1 == null || (abstractDeserializer2 = (AbstractDeserializer) withDeserializerModifier.read(p1, _this.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver())) == null) ? null : abstractDeserializer2.getIconCompatParcelizer();
        String iconCompatParcelizer2 = (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp == null || (abstractDeserializer = (AbstractDeserializer) withDeserializerModifier.read(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp, _this.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver())) == null) ? null : abstractDeserializer.getIconCompatParcelizer();
        boolean z = false;
        if (iconCompatParcelizer != iconCompatParcelizer2) {
            if (iconCompatParcelizer == null) {
                this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, iMediaBrowserCompatItemReceiver, true);
            } else if (iconCompatParcelizer2 == null) {
                this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, iMediaBrowserCompatItemReceiver, false);
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((_writeQuotedRaw) withDeserializerModifier.read(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp, _this.INSTANCE.write()), _writeQuotedRaw.INSTANCE.read())) {
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, iMediaBrowserCompatItemReceiver, _outputMultiByteChar.INSTANCE.RemoteActionCompatParcelizer(iconCompatParcelizer2));
            }
        }
        MutableCoercionConfig mutableCoercionConfig = p1 != null ? (MutableCoercionConfig) withDeserializerModifier.read(p1, _this.INSTANCE.onSetRepeatMode()) : null;
        MutableCoercionConfig mutableCoercionConfig2 = c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp != null ? (MutableCoercionConfig) withDeserializerModifier.read(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp, _this.INSTANCE.onSetRepeatMode()) : null;
        if (mutableCoercionConfig != mutableCoercionConfig2) {
            if (mutableCoercionConfig == null) {
                this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, iMediaBrowserCompatItemReceiver, true);
            } else if (mutableCoercionConfig2 == null) {
                this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, iMediaBrowserCompatItemReceiver, false);
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((_writeQuotedRaw) withDeserializerModifier.read(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp, _this.INSTANCE.write()), _writeQuotedRaw.INSTANCE.IconCompatParcelizer())) {
                int i = WhenMappings.IconCompatParcelizer[mutableCoercionConfig2.ordinal()];
                if (i == 1) {
                    bool = Boolean.TRUE;
                } else {
                    bool = i != 2 ? null : Boolean.FALSE;
                }
                if (bool != null) {
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, iMediaBrowserCompatItemReceiver, _outputMultiByteChar.INSTANCE.AudioAttributesCompatParcelizer(bool.booleanValue()));
                }
            }
        }
        _writeStringSegment _writestringsegment = p1 != null ? (_writeStringSegment) withDeserializerModifier.read(p1, _this.INSTANCE.AudioAttributesImplApi21Parcelizer()) : null;
        _writeStringSegment _writestringsegment2 = c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp != null ? (_writeStringSegment) withDeserializerModifier.read(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp, _this.INSTANCE.AudioAttributesImplApi21Parcelizer()) : null;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_writestringsegment, _writestringsegment2)) {
            if (_writestringsegment == null) {
                this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, iMediaBrowserCompatItemReceiver, true);
            } else if (_writestringsegment2 == null) {
                this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, iMediaBrowserCompatItemReceiver, false);
            } else {
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, iMediaBrowserCompatItemReceiver, ((_outputRawMultiByteChar) _writestringsegment2).getRemoteActionCompatParcelizer());
            }
        }
        boolean z2 = p1 != null && _parseUnsignedNumber.AudioAttributesCompatParcelizer(p1);
        if (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp != null && _parseUnsignedNumber.AudioAttributesCompatParcelizer(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp)) {
            z = true;
        }
        if (z2 != z) {
            if (z) {
                this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(iMediaBrowserCompatItemReceiver);
            } else {
                this.AudioAttributesImplApi21Parcelizer.read(iMediaBrowserCompatItemReceiver);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(ViewStructure p0) {
        _outputMultiByteChar _outputmultibytechar = _outputMultiByteChar.INSTANCE;
        namingStrategyInstance namingstrategyinstanceIconCompatParcelizer = this.read.IconCompatParcelizer();
        _writeSegmentedRaw.RemoteActionCompatParcelizer(p0, namingstrategyinstanceIconCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.write, this.AudioAttributesCompatParcelizer);
        setDropDownBackgroundResource setdropdownbackgroundresourceIconCompatParcelizer = setSupportCompoundDrawablesTintMode.IconCompatParcelizer((ViewStructure) namingstrategyinstanceIconCompatParcelizer, p0);
        while (setdropdownbackgroundresourceIconCompatParcelizer.AudioAttributesImplBaseParcelizer()) {
            setDropDownBackgroundResource setdropdownbackgroundresource = setdropdownbackgroundresourceIconCompatParcelizer;
            Object objAudioAttributesCompatParcelizer = setdropdownbackgroundresourceIconCompatParcelizer.AudioAttributesCompatParcelizer(setdropdownbackgroundresource.RemoteActionCompatParcelizer - 1);
            toMagicModuleMetaRepoModel.read(objAudioAttributesCompatParcelizer, "");
            ViewStructure viewStructure = (ViewStructure) objAudioAttributesCompatParcelizer;
            Object objAudioAttributesCompatParcelizer2 = setdropdownbackgroundresourceIconCompatParcelizer.AudioAttributesCompatParcelizer(setdropdownbackgroundresource.RemoteActionCompatParcelizer - 1);
            toMagicModuleMetaRepoModel.read(objAudioAttributesCompatParcelizer2, "");
            List<namingStrategyInstance> listOnPrepareFromSearch = ((namingStrategyInstance) objAudioAttributesCompatParcelizer2).onPrepareFromSearch();
            int size = listOnPrepareFromSearch.size();
            for (int i = 0; i < size; i++) {
                namingStrategyInstance namingstrategyinstance = listOnPrepareFromSearch.get(i);
                if (!namingstrategyinstance.getAddOnUserLeaveHintListener() && namingstrategyinstance.AudioAttributesImplApi26Parcelizer() && namingstrategyinstance.MediaDescriptionCompat()) {
                    C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp = namingstrategyinstance.accessgetReportFullyDrawnExecutorp();
                    if (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp == null || !_parseUnsignedNumber.AudioAttributesImplApi26Parcelizer(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp)) {
                        setdropdownbackgroundresourceIconCompatParcelizer.AudioAttributesCompatParcelizer(namingstrategyinstance);
                        setdropdownbackgroundresourceIconCompatParcelizer.AudioAttributesCompatParcelizer(viewStructure);
                    } else {
                        ViewStructure viewStructureAudioAttributesCompatParcelizer = _outputmultibytechar.AudioAttributesCompatParcelizer(viewStructure, _outputmultibytechar.IconCompatParcelizer(viewStructure, 1));
                        _writeSegmentedRaw.RemoteActionCompatParcelizer(viewStructureAudioAttributesCompatParcelizer, namingstrategyinstance, this.MediaBrowserCompatItemReceiver, this.write, this.AudioAttributesCompatParcelizer);
                        setdropdownbackgroundresourceIconCompatParcelizer.AudioAttributesCompatParcelizer(namingstrategyinstance);
                        setdropdownbackgroundresourceIconCompatParcelizer.AudioAttributesCompatParcelizer(viewStructureAudioAttributesCompatParcelizer);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o._readBinary$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "p0", "p1", "p2", "p3", "", "AudioAttributesCompatParcelizer", "(IIII)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getMagicModuleStat<Integer, Integer, Integer, Integer, getShowPopup> {
        final /* synthetic */ namingStrategyInstance $IconCompatParcelizer;

        @Override // kotlin.getMagicModuleStat
        public final /* synthetic */ getShowPopup write(Integer num, Integer num2, Integer num3, Integer num4) {
            AudioAttributesCompatParcelizer(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4) {
            _readBinary.this.AudioAttributesImplBaseParcelizer.set(i, i2, i3, i4);
            _readBinary.this.getIconCompatParcelizer().AudioAttributesCompatParcelizer(_readBinary.this.RemoteActionCompatParcelizer, this.$IconCompatParcelizer.getIconCompatParcelizer(), _readBinary.this.AudioAttributesImplBaseParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(namingStrategyInstance namingstrategyinstance) {
            super(4);
            this.$IconCompatParcelizer = namingstrategyinstance;
        }
    }

    public final void write(namingStrategyInstance p0) {
        this.AudioAttributesCompatParcelizer.getRead().read(p0.getIconCompatParcelizer(), new AnonymousClass4(p0));
    }

    public final void IconCompatParcelizer(namingStrategyInstance p0) {
        C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp = p0.accessgetReportFullyDrawnExecutorp();
        if (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp == null || !_parseUnsignedNumber.AudioAttributesCompatParcelizer(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp)) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(p0.getIconCompatParcelizer());
        this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, p0.getIconCompatParcelizer(), true);
    }

    public final void read(namingStrategyInstance p0, int p1) {
        if (this.AudioAttributesImplApi21Parcelizer.read(p1)) {
            this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, p1, false);
        }
        C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp = p0.accessgetReportFullyDrawnExecutorp();
        if (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp == null || !_parseUnsignedNumber.AudioAttributesCompatParcelizer(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp)) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(p0.getIconCompatParcelizer());
        this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, p0.getIconCompatParcelizer(), true);
    }

    public final void read(namingStrategyInstance p0) {
        if (this.AudioAttributesImplApi21Parcelizer.read(p0.getIconCompatParcelizer())) {
            this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, p0.getIconCompatParcelizer(), false);
        }
    }

    public final void AudioAttributesCompatParcelizer(namingStrategyInstance p0) {
        if (this.AudioAttributesImplApi21Parcelizer.read(p0.getIconCompatParcelizer())) {
            this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, p0.getIconCompatParcelizer(), false);
        }
    }

    public final void IconCompatParcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer() && this.AudioAttributesImplApi26Parcelizer) {
            this.IconCompatParcelizer.IconCompatParcelizer();
            this.AudioAttributesImplApi26Parcelizer = false;
        }
        if (this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer()) {
            this.AudioAttributesImplApi26Parcelizer = true;
        }
    }

    public final void RemoteActionCompatParcelizer(SparseArray<AutofillValue> p0) {
        C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp;
        getAnswerMap getanswermap;
        getAnswerMap getanswermap2;
        int size = p0.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = p0.keyAt(i);
            AutofillValue autofillValue = p0.get(iKeyAt);
            namingStrategyInstance namingstrategyinstanceWrite = this.read.write(iKeyAt);
            if (namingstrategyinstanceWrite != null && (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp = namingstrategyinstanceWrite.accessgetReportFullyDrawnExecutorp()) != null) {
                defaultFeatures defaultfeatures = (defaultFeatures) withDeserializerModifier.read(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp, withAbstractTypeResolver.INSTANCE.RatingCompat());
                if (defaultfeatures != null && (getanswermap2 = (getAnswerMap) defaultfeatures.RemoteActionCompatParcelizer()) != null) {
                }
                defaultFeatures defaultfeatures2 = (defaultFeatures) withDeserializerModifier.read(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp, withAbstractTypeResolver.INSTANCE.MediaDescriptionCompat());
                if (defaultfeatures2 != null && (getanswermap = (getAnswerMap) defaultfeatures2.RemoteActionCompatParcelizer()) != null) {
                }
            }
        }
    }
}
