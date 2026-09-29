package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a®\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0013\b\u0002\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0013\b\u0002\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0013\b\u0002\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0084\u0001\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000b2\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u00062\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\"\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e¨\u0006\u001f"}, d2 = {"Scaffold", "", "modifier", "Landroidx/compose/ui/Modifier;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material3/FabPosition;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ScaffoldLayout", "fabPosition", "snackbar", "fab", "ScaffoldLayout-FMILGgc", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getValueAsString {
    private static final float AudioAttributesCompatParcelizer = assignParameter.IconCompatParcelizer(16.0f);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(kotlin._handleOddName r31, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r32, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r33, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r34, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r35, int r36, long r37, long r39, kotlin.onCreateView r41, final kotlin.getModuleData<? super kotlin.getReturnTransition, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r42, kotlin._handleUnrecognizedCharacterEscape r43, final int r44, final int r45) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getValueAsString.AudioAttributesCompatParcelizer(o._handleOddName, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, int, long, long, o.onCreateView, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(writeRootValueSeparator writerootvalueseparator, onCreateView oncreateview, onCreateView oncreateview2) {
        writerootvalueseparator.read(onDestroy.AudioAttributesCompatParcelizer(oncreateview, oncreateview2));
        return getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ getModuleData<getReturnTransition, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer;
        final /* synthetic */ writeRootValueSeparator IconCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> MediaBrowserCompatItemReceiver;
        final /* synthetic */ int RemoteActionCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> read;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> write;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            IconCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(848889571, i, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:104)");
                }
                getValueAsString.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.read, this.IconCompatParcelizer, this.write, _handleunrecognizedcharacterescape, 0);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    return;
                }
                return;
            }
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }

        /* JADX WARN: Multi-variable type inference failed */
        write(int i, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, getModuleData<? super getReturnTransition, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody3, writeRootValueSeparator writerootvalueseparator, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody4) {
            this.RemoteActionCompatParcelizer = i;
            this.MediaBrowserCompatItemReceiver = magicModuleSubmissionRequestBody;
            this.AudioAttributesCompatParcelizer = getmoduledata;
            this.MediaBrowserCompatCustomActionResultReceiver = magicModuleSubmissionRequestBody2;
            this.read = magicModuleSubmissionRequestBody3;
            this.IconCompatParcelizer = writerootvalueseparator;
            this.write = magicModuleSubmissionRequestBody4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(final int i, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, final getModuleData<? super getReturnTransition, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody3, final onCreateView oncreateview, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2) {
        int i3;
        int i4;
        int i5;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-280287501);
        if ((i2 & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getmoduledata) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody2) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(oncreateview) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 599187) != 599186, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-280287501, i3, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:137)");
            }
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new read();
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            final read readVar = (read) objOnPause;
            boolean z = (i3 & 112) == 32;
            FastIntegerMathUInt128 fastIntegerMathUInt128OnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z || fastIntegerMathUInt128OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                fastIntegerMathUInt128OnPause = multiplyFft.IconCompatParcelizer(605195056, true, new AudioAttributesImplApi21Parcelizer(magicModuleSubmissionRequestBody));
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(fastIntegerMathUInt128OnPause);
            }
            final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody5 = (MagicModuleSubmissionRequestBody) fastIntegerMathUInt128OnPause;
            boolean z2 = (i3 & 7168) == 2048;
            FastIntegerMathUInt128 fastIntegerMathUInt128OnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z2 || fastIntegerMathUInt128OnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                fastIntegerMathUInt128OnPause2 = multiplyFft.IconCompatParcelizer(418899191, true, new MediaBrowserCompatItemReceiver(magicModuleSubmissionRequestBody2));
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(fastIntegerMathUInt128OnPause2);
            }
            final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody6 = (MagicModuleSubmissionRequestBody) fastIntegerMathUInt128OnPause2;
            boolean z3 = (57344 & i3) == 16384;
            FastIntegerMathUInt128 fastIntegerMathUInt128OnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z3 || fastIntegerMathUInt128OnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                fastIntegerMathUInt128OnPause3 = multiplyFft.IconCompatParcelizer(338600263, true, new RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody3));
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(fastIntegerMathUInt128OnPause3);
            }
            final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody7 = (MagicModuleSubmissionRequestBody) fastIntegerMathUInt128OnPause3;
            boolean z4 = (i3 & 896) == 256;
            FastIntegerMathUInt128 fastIntegerMathUInt128OnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z4 || fastIntegerMathUInt128OnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                fastIntegerMathUInt128OnPause4 = multiplyFft.IconCompatParcelizer(-1776388365, true, new IconCompatParcelizer(getmoduledata, readVar));
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(fastIntegerMathUInt128OnPause4);
            }
            final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody8 = (MagicModuleSubmissionRequestBody) fastIntegerMathUInt128OnPause4;
            boolean z5 = (3670016 & i3) == 1048576;
            FastIntegerMathUInt128 fastIntegerMathUInt128OnPause5 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z5 || fastIntegerMathUInt128OnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                fastIntegerMathUInt128OnPause5 = multiplyFft.IconCompatParcelizer(-1731662488, true, new AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody4));
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(fastIntegerMathUInt128OnPause5);
            }
            final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody9 = (MagicModuleSubmissionRequestBody) fastIntegerMathUInt128OnPause5;
            boolean z6 = (458752 & i3) == 131072;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody5);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody6);
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody7);
            boolean z7 = (i3 & 14) == 4;
            boolean zAudioAttributesCompatParcelizer4 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody9);
            boolean zAudioAttributesCompatParcelizer5 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody8);
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (((z6 | zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | zAudioAttributesCompatParcelizer3 | z7 | zAudioAttributesCompatParcelizer4) || zAudioAttributesCompatParcelizer5) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                i4 = 1;
                i5 = 0;
                objOnPause2 = new MagicModuleSubmissionRequestBody() { // from class: o.nextFieldName
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return getValueAsString.write(oncreateview, magicModuleSubmissionRequestBody5, magicModuleSubmissionRequestBody6, magicModuleSubmissionRequestBody7, i, magicModuleSubmissionRequestBody9, readVar, magicModuleSubmissionRequestBody8, (getNodeType) obj, (PropertyValueAny) obj2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            } else {
                i4 = 1;
                i5 = 0;
            }
            fieldNames.read(null, (MagicModuleSubmissionRequestBody) objOnPause2, _handleunrecognizedcharacterescapeWrite, i5, i4);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.isNaN
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getValueAsString.AudioAttributesCompatParcelizer(i, magicModuleSubmissionRequestBody, getmoduledata, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, oncreateview, magicModuleSubmissionRequestBody4, i2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\bR+\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00018G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\t\u0010\f\"\u0004\b\n\u0010\r"}, d2 = {"Lo/getValueAsString$read;", "Lo/getReturnTransition;", "Lo/tryToResolveUnresolved;", "p0", "Lo/assignParameter;", "read", "(Lo/tryToResolveUnresolved;)F", "IconCompatParcelizer", "()F", "RemoteActionCompatParcelizer", "write", "Lo/InputAccessor;", "()Lo/getReturnTransition;", "(Lo/getReturnTransition;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements getReturnTransition {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final InputAccessor IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)), null, 2, null);

        read() {
        }

        public final getReturnTransition RemoteActionCompatParcelizer() {
            return (getReturnTransition) this.IconCompatParcelizer.getRemoteActionCompatParcelizer();
        }

        public final void write(getReturnTransition getreturntransition) {
            this.IconCompatParcelizer.write(getreturntransition);
        }

        @Override // kotlin.getReturnTransition
        public final float read(tryToResolveUnresolved p0) {
            return RemoteActionCompatParcelizer().read(p0);
        }

        @Override // kotlin.getReturnTransition
        /* JADX INFO: renamed from: IconCompatParcelizer */
        public final float getRead() {
            return RemoteActionCompatParcelizer().getRead();
        }

        @Override // kotlin.getReturnTransition
        public final float RemoteActionCompatParcelizer(tryToResolveUnresolved p0) {
            return RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(p0);
        }

        @Override // kotlin.getReturnTransition
        /* JADX INFO: renamed from: read */
        public final float getRemoteActionCompatParcelizer() {
            return RemoteActionCompatParcelizer().getRemoteActionCompatParcelizer();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi21Parcelizer implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            read(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(605195056, i, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:158)");
                }
                MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody = this.AudioAttributesCompatParcelizer;
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescape.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
                } else {
                    _handleunrecognizedcharacterescape.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
                NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                    _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                    _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
                }
                NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescape, 0);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    return;
                }
                return;
            }
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesImplApi21Parcelizer(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatItemReceiver implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer;

        public final void RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(418899191, i, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:159)");
                }
                MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody = this.AudioAttributesCompatParcelizer;
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescape.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
                } else {
                    _handleunrecognizedcharacterescape.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
                NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                    _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                    _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
                }
                NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescape, 0);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    return;
                }
                return;
            }
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        MediaBrowserCompatItemReceiver(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer;

        public final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(338600263, i, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:160)");
                }
                MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody = this.AudioAttributesCompatParcelizer;
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescape.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
                } else {
                    _handleunrecognizedcharacterescape.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
                NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                    _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                    _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
                }
                NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescape, 0);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    return;
                }
                return;
            }
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            IconCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ read RemoteActionCompatParcelizer;
        final /* synthetic */ getModuleData<getReturnTransition, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> read;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            read(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(-1776388365, i, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:162)");
                }
                getModuleData<getReturnTransition, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> getmoduledata = this.read;
                read readVar = this.RemoteActionCompatParcelizer;
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescape.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
                } else {
                    _handleunrecognizedcharacterescape.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
                NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                    _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                    _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
                }
                NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                getmoduledata.AudioAttributesCompatParcelizer(readVar, _handleunrecognizedcharacterescape, 6);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    return;
                }
                return;
            }
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }

        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(getModuleData<? super getReturnTransition, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, read readVar) {
            this.read = getmoduledata;
            this.RemoteActionCompatParcelizer = readVar;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> write;

        public final void RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(-1731662488, i, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:163)");
                }
                MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody = this.write;
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescape.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
                } else {
                    _handleunrecognizedcharacterescape.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
                NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                    _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                    _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
                }
                NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescape, 0);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    return;
                }
                return;
            }
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
            this.write = magicModuleSubmissionRequestBody;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final withHandlersFrom write(final onCreateView oncreateview, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, int i, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, read readVar, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody5, final getNodeType getnodetype, PropertyValueAny propertyValueAny) {
        int iIconCompatParcelizer;
        int iIconCompatParcelizer2;
        JsonParseException jsonParseException;
        Integer numValueOf;
        float fB_;
        float fB_2;
        int iIntValue;
        int iconCompatParcelizer;
        int iRemoteActionCompatParcelizer;
        final int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(propertyValueAny.getRead());
        final int iAudioAttributesImplApi21Parcelizer = PropertyValueAny.AudioAttributesImplApi21Parcelizer(propertyValueAny.getRead());
        long jAudioAttributesCompatParcelizer$default = PropertyValueAny.AudioAttributesCompatParcelizer$default(propertyValueAny.getRead(), 0, 0, 0, 0, 10, null);
        getNodeType getnodetype2 = getnodetype;
        int iRemoteActionCompatParcelizer2 = oncreateview.RemoteActionCompatParcelizer(getnodetype2, getnodetype.getAudioAttributesCompatParcelizer());
        int iWrite = oncreateview.write(getnodetype2, getnodetype.getAudioAttributesCompatParcelizer());
        int iRemoteActionCompatParcelizer3 = oncreateview.RemoteActionCompatParcelizer(getnodetype2);
        final _parser _parserVarWrite = ((isTypeOrSuperTypeOf) IntermediateLoginResponseBody.RatingCompat((List) getnodetype.IconCompatParcelizer(readBinaryValue.AudioAttributesCompatParcelizer, magicModuleSubmissionRequestBody))).write(jAudioAttributesCompatParcelizer$default);
        int i2 = (-iRemoteActionCompatParcelizer2) - iWrite;
        int i3 = -iRemoteActionCompatParcelizer3;
        final _parser _parserVarWrite2 = ((isTypeOrSuperTypeOf) IntermediateLoginResponseBody.RatingCompat((List) getnodetype.IconCompatParcelizer(readBinaryValue.IconCompatParcelizer, magicModuleSubmissionRequestBody2))).write(PropertyValueBuffer.IconCompatParcelizer(jAudioAttributesCompatParcelizer$default, i2, i3));
        final _parser _parserVarWrite3 = ((isTypeOrSuperTypeOf) IntermediateLoginResponseBody.RatingCompat((List) getnodetype.IconCompatParcelizer(readBinaryValue.read, magicModuleSubmissionRequestBody3))).write(PropertyValueBuffer.IconCompatParcelizer(jAudioAttributesCompatParcelizer$default, i2, i3));
        if (_parserVarWrite3.getRead() == 0 && _parserVarWrite3.getRemoteActionCompatParcelizer() == 0) {
            jsonParseException = null;
        } else {
            int read2 = _parserVarWrite3.getRead();
            int remoteActionCompatParcelizer = _parserVarWrite3.getRemoteActionCompatParcelizer();
            if (canReadObjectId.write(i, canReadObjectId.INSTANCE.RemoteActionCompatParcelizer())) {
                if (getnodetype.getAudioAttributesCompatParcelizer() == tryToResolveUnresolved.write) {
                    iIconCompatParcelizer = getnodetype.IconCompatParcelizer(AudioAttributesCompatParcelizer);
                    iIconCompatParcelizer2 = iIconCompatParcelizer + iRemoteActionCompatParcelizer2;
                }
                iIconCompatParcelizer2 = ((iAudioAttributesImplBaseParcelizer - getnodetype.IconCompatParcelizer(AudioAttributesCompatParcelizer)) - read2) - iWrite;
            } else if (canReadObjectId.write(i, canReadObjectId.INSTANCE.IconCompatParcelizer()) || canReadObjectId.write(i, canReadObjectId.INSTANCE.read())) {
                if (getnodetype.getAudioAttributesCompatParcelizer() != tryToResolveUnresolved.write) {
                    iIconCompatParcelizer = getnodetype.IconCompatParcelizer(AudioAttributesCompatParcelizer);
                    iIconCompatParcelizer2 = iIconCompatParcelizer + iRemoteActionCompatParcelizer2;
                }
                iIconCompatParcelizer2 = ((iAudioAttributesImplBaseParcelizer - getnodetype.IconCompatParcelizer(AudioAttributesCompatParcelizer)) - read2) - iWrite;
            } else {
                iIconCompatParcelizer2 = (((iAudioAttributesImplBaseParcelizer - read2) + iRemoteActionCompatParcelizer2) - iWrite) / 2;
            }
            jsonParseException = new JsonParseException(iIconCompatParcelizer2, read2, remoteActionCompatParcelizer);
        }
        final _parser _parserVarWrite4 = ((isTypeOrSuperTypeOf) IntermediateLoginResponseBody.RatingCompat((List) getnodetype.IconCompatParcelizer(readBinaryValue.RemoteActionCompatParcelizer, magicModuleSubmissionRequestBody4))).write(jAudioAttributesCompatParcelizer$default);
        int i4 = 0;
        boolean z = _parserVarWrite4.getRead() == 0 && _parserVarWrite4.getRemoteActionCompatParcelizer() == 0;
        if (jsonParseException != null) {
            if (z || canReadObjectId.write(i, canReadObjectId.INSTANCE.read())) {
                iconCompatParcelizer = jsonParseException.getIconCompatParcelizer() + getnodetype.IconCompatParcelizer(AudioAttributesCompatParcelizer);
                iRemoteActionCompatParcelizer = oncreateview.RemoteActionCompatParcelizer(getnodetype2);
            } else {
                iconCompatParcelizer = _parserVarWrite4.getRemoteActionCompatParcelizer() + jsonParseException.getIconCompatParcelizer();
                iRemoteActionCompatParcelizer = getnodetype.IconCompatParcelizer(AudioAttributesCompatParcelizer);
            }
            numValueOf = Integer.valueOf(iconCompatParcelizer + iRemoteActionCompatParcelizer);
        } else {
            numValueOf = null;
        }
        int remoteActionCompatParcelizer2 = _parserVarWrite2.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer2 != 0) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                Integer numValueOf2 = Integer.valueOf(_parserVarWrite4.getRemoteActionCompatParcelizer());
                if (z) {
                    numValueOf2 = null;
                }
                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : oncreateview.RemoteActionCompatParcelizer(getnodetype2);
            }
            i4 = iIntValue + remoteActionCompatParcelizer2;
        }
        final int i5 = i4;
        getReturnTransition getreturntransition = onDestroy.read(oncreateview, getnodetype2);
        if (_parserVarWrite.getRead() == 0 && _parserVarWrite.getRemoteActionCompatParcelizer() == 0) {
            fB_ = getreturntransition.getRead();
        } else {
            fB_ = getnodetype.b_(_parserVarWrite.getRemoteActionCompatParcelizer());
        }
        if (z) {
            fB_2 = getreturntransition.getRemoteActionCompatParcelizer();
        } else {
            fB_2 = getnodetype.b_(_parserVarWrite4.getRemoteActionCompatParcelizer());
        }
        readVar.write(getParentFragment.read(getParentFragment.write(getreturntransition, getnodetype.getAudioAttributesCompatParcelizer()), fB_, getParentFragment.read(getreturntransition, getnodetype.getAudioAttributesCompatParcelizer()), fB_2));
        final _parser _parserVarWrite5 = ((isTypeOrSuperTypeOf) IntermediateLoginResponseBody.RatingCompat((List) getnodetype.IconCompatParcelizer(readBinaryValue.write, magicModuleSubmissionRequestBody5))).write(jAudioAttributesCompatParcelizer$default);
        final JsonParseException jsonParseException2 = jsonParseException;
        final Integer num = numValueOf;
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(getnodetype, iAudioAttributesImplBaseParcelizer, iAudioAttributesImplApi21Parcelizer, null, new getAnswerMap() { // from class: o.isExpectedNumberIntToken
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getValueAsString.read(_parserVarWrite5, _parserVarWrite, _parserVarWrite2, iAudioAttributesImplBaseParcelizer, oncreateview, getnodetype, iAudioAttributesImplApi21Parcelizer, i5, _parserVarWrite4, jsonParseException2, _parserVarWrite3, num, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_parser _parserVar, _parser _parserVar2, _parser _parserVar3, int i, onCreateView oncreateview, getNodeType getnodetype, int i2, int i3, _parser _parserVar4, JsonParseException jsonParseException, _parser _parserVar5, Integer num, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar2, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        int read2 = _parserVar3.getRead();
        getNodeType getnodetype2 = getnodetype;
        _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar3, (((i - read2) + oncreateview.RemoteActionCompatParcelizer(getnodetype2, getnodetype.getAudioAttributesCompatParcelizer())) - oncreateview.write(getnodetype2, getnodetype.getAudioAttributesCompatParcelizer())) / 2, i2 - i3, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar4, 0, i2 - _parserVar4.getRemoteActionCompatParcelizer(), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        if (jsonParseException != null) {
            int write2 = jsonParseException.getWrite();
            toMagicModuleMetaRepoModel.write(num);
            _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar5, write2, i2 - num.intValue(), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(int i, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getModuleData getmoduledata, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, onCreateView oncreateview, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        RemoteActionCompatParcelizer(i, magicModuleSubmissionRequestBody, getmoduledata, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, oncreateview, magicModuleSubmissionRequestBody4, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, int i, long j, long j2, onCreateView oncreateview, getModuleData getmoduledata, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i4) {
        AudioAttributesCompatParcelizer(_handleoddname, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody2, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody3, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody4, i, j, j2, oncreateview, (getModuleData<? super getReturnTransition, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) getmoduledata, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }
}
