package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;
import kotlin.setOutlineMasksAndMattes;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¢\u0001\u0010\u0000\u001a\u00020\u00012\u000e\b\b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0013\b\b\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0015\b\b\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\b\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\b\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0081\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u00012\u000e\b\b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0013\b\b\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0015\b\b\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\b\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0081\b¢\u0006\u0004\b\u0015\u0010\u0016\u001ax\u0010\u0017\u001a\u00020\u00012\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a;\u0010\u001a\u001a\u00020\u0001*\u00020\u001b2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0002\u0010\u001c\u001a2\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\"\u0010#\"\u000e\u0010$\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0004\n\u0002\u0010(\"\u0010\u0010)\u001a\u00020'X\u0082\u0004¢\u0006\u0004\n\u0002\u0010(\"\u0010\u0010*\u001a\u00020'X\u0082\u0004¢\u0006\u0004\n\u0002\u0010(¨\u0006+"}, d2 = {"AlertDialogImpl", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialogImpl-0nD-MI0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;I)V", "buttons", "AlertDialogImpl-SxpAMN0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;I)V", "AlertDialogContent", "AlertDialogContent-WMdw5o4", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "AlertDialogBaselineLayout", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AlertDialogFlowRow", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "content", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TitlePadding", "TextPadding", "TitleBaselineDistanceFromTop", "Landroidx/compose/ui/unit/TextUnit;", "J", "TextBaselineDistanceFromTitle", "TextBaselineDistanceFromTop", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setOutlineMasksAndMattes {
    private static final _handleOddName AudioAttributesCompatParcelizer = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(24.0f), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(24.0f), BitmapDescriptorFactory.HUE_RED, 10, null);
    private static final _handleOddName read = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(24.0f), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(24.0f), assignParameter.IconCompatParcelizer(28.0f), 2, null);
    private static final long write = setResolver.RemoteActionCompatParcelizer(40);
    private static final long IconCompatParcelizer = setResolver.RemoteActionCompatParcelizer(36);
    private static final long RemoteActionCompatParcelizer = setResolver.RemoteActionCompatParcelizer(38);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class IconCompatParcelizer implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> read;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            write(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
        public static final class write implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
            final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer;
            final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> read;

            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
                read(_handleunrecognizedcharacterescape, num.intValue());
                return getShowPopup.INSTANCE;
            }

            public final void read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
                if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                    _handleunrecognizedcharacterescape.onPrepareFromSearch();
                    return;
                }
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(-1975681962, i, -1, "androidx.compose.material.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:153)");
                }
                MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody = this.AudioAttributesCompatParcelizer;
                if (magicModuleSubmissionRequestBody == null) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(690531395);
                } else {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-254819458);
                    magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescape, 0);
                }
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                this.read.invoke(_handleunrecognizedcharacterescape, 0);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public write(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2) {
                this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
                this.read = magicModuleSubmissionRequestBody2;
            }
        }

        public final void write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-309297447, i, -1, "androidx.compose.material.AlertDialogImpl.<anonymous> (AlertDialog.kt:151)");
            }
            _handleOddName _handleoddnameWrite = getParentFragment.write(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(8.0f), assignParameter.IconCompatParcelizer(2.0f));
            MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody = this.read;
            MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBody2 = this.RemoteActionCompatParcelizer;
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameWrite);
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
            setOutlineMasksAndMattes.read(assignParameter.IconCompatParcelizer(8.0f), assignParameter.IconCompatParcelizer(12.0f), multiplyFft.AudioAttributesCompatParcelizer(-1975681962, true, new write(magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2), _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 438);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IconCompatParcelizer(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2) {
            this.read = magicModuleSubmissionRequestBody;
            this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody2;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class write implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ findAndAddVirtualProperties AudioAttributesCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ long IconCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> MediaBrowserCompatItemReceiver;
        final /* synthetic */ _handleOddName RemoteActionCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> read;
        final /* synthetic */ long write;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-488319269, i, -1, "androidx.compose.material.AlertDialogImpl.<anonymous> (AlertDialog.kt:181)");
            }
            setOutlineMasksAndMattes.IconCompatParcelizer(this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.write, _handleunrecognizedcharacterescape, 0, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public write(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleOddName _handleoddname, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody3, findAndAddVirtualProperties findandaddvirtualproperties, long j, long j2) {
            this.read = magicModuleSubmissionRequestBody;
            this.RemoteActionCompatParcelizer = _handleoddname;
            this.AudioAttributesImplApi21Parcelizer = magicModuleSubmissionRequestBody2;
            this.MediaBrowserCompatItemReceiver = magicModuleSubmissionRequestBody3;
            this.AudioAttributesCompatParcelizer = findandaddvirtualproperties;
            this.IconCompatParcelizer = j;
            this.write = j2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IconCompatParcelizer(final kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r27, kotlin._handleOddName r28, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r29, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r30, kotlin.findAndAddVirtualProperties r31, long r32, long r34, kotlin._handleUnrecognizedCharacterEscape r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOutlineMasksAndMattes.IconCompatParcelizer(o.MagicModuleSubmissionRequestBody, o._handleOddName, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.findAndAddVirtualProperties, long, long, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1737550099, i, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:213)");
            }
            resetAsNaN.write(AccessToken.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(Float.valueOf(GraphRequestParcelableResourceWithMimeType.INSTANCE.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 6))), multiplyFft.AudioAttributesCompatParcelizer(-1654653485, true, new MagicModuleSubmissionRequestBody() { // from class: o.setRepeatCount
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setOutlineMasksAndMattes.MediaBrowserCompatItemReceiver(magicModuleSubmissionRequestBody, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, ContentReference.write | 48);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1654653485, i, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:214)");
            }
            _copyCurrentStringValue.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, 6).getAudioAttributesImplBaseParcelizer(), magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1265552690, i, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:222)");
            }
            resetAsNaN.write(AccessToken.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(Float.valueOf(GraphRequestParcelableResourceWithMimeType.INSTANCE.read(_handleunrecognizedcharacterescape, 6))), multiplyFft.AudioAttributesCompatParcelizer(-2126650894, true, new MagicModuleSubmissionRequestBody() { // from class: o.setMinProgress
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setOutlineMasksAndMattes.MediaBrowserCompatCustomActionResultReceiver(magicModuleSubmissionRequestBody, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, ContentReference.write | 48);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-2126650894, i, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:225)");
            }
            _copyCurrentStringValue.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, 6).getMediaBrowserCompatItemReceiver(), magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public static final void write(final DrawerLayoutLayoutParams drawerLayoutLayoutParams, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1213983107);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(drawerLayoutLayoutParams) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody2) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 147) != 146, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1213983107, i2, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:247)");
            }
            _handleOddName _handleoddname = drawerLayoutLayoutParams.read(_handleOddName.INSTANCE, 1.0f, false);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (audioAttributesCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                audioAttributesCompatParcelizerOnPause = AudioAttributesCompatParcelizer.IconCompatParcelizer;
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerOnPause);
            }
            withTypeHandler withtypehandler = (withTypeHandler) audioAttributesCompatParcelizerOnPause;
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            if (magicModuleSubmissionRequestBody == null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1809237538);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1809237539);
                _handleOddName _handleoddnameAudioAttributesCompatParcelizer = drawerLayoutLayoutParams.AudioAttributesCompatParcelizer(isEnumType.IconCompatParcelizer(AudioAttributesCompatParcelizer, "title"), _skipWSOrEnd.INSTANCE.RatingCompat());
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iAudioAttributesCompatParcelizer2 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameAudioAttributesCompatParcelizer);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer2);
                } else {
                    _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
                NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer2 = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                if (_handleunrecognizedcharacterescape3.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer2))) {
                    _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer2));
                    _handleunrecognizedcharacterescape3.read(Integer.valueOf(iAudioAttributesCompatParcelizer2), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer2);
                }
                NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescapeWrite, 0);
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            if (magicModuleSubmissionRequestBody2 == null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1809370342);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1809370343);
                _handleOddName _handleoddnameAudioAttributesCompatParcelizer2 = drawerLayoutLayoutParams.AudioAttributesCompatParcelizer(isEnumType.IconCompatParcelizer(read, "text"), _skipWSOrEnd.INSTANCE.RatingCompat());
                withTypeHandler withtypehandlerWrite2 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iAudioAttributesCompatParcelizer3 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameAudioAttributesCompatParcelizer2);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer3 = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer3);
                } else {
                    _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
                NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerWrite2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer3 = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                if (_handleunrecognizedcharacterescape4.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer3))) {
                    _handleunrecognizedcharacterescape4.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer3));
                    _handleunrecognizedcharacterescape4.read(Integer.valueOf(iAudioAttributesCompatParcelizer3), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer3);
                }
                NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation2 = setDrawerElevation.INSTANCE;
                magicModuleSubmissionRequestBody2.invoke(_handleunrecognizedcharacterescapeWrite, 0);
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setMinAndMaxProgress
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setOutlineMasksAndMattes.read(drawerLayoutLayoutParams, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer implements withTypeHandler {
        public static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer();

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(_parser _parserVar, int i, _parser _parserVar2, int i2, _parser.IconCompatParcelizer iconCompatParcelizer) {
            if (_parserVar != null) {
                _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, 0, i, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            }
            if (_parserVar2 != null) {
                _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar2, 0, i2, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
        @Override // kotlin.withTypeHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.withHandlersFrom AudioAttributesCompatParcelizer(kotlin.withContentValueHandler r17, java.util.List<? extends kotlin.isTypeOrSuperTypeOf> r18, long r19) {
            /*
                Method dump skipped, instruction units count: 330
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setOutlineMasksAndMattes.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(o.withContentValueHandler, java.util.List, long):o.withHandlersFrom");
        }

        AudioAttributesCompatParcelizer() {
        }
    }

    public static final void read(final float f, final float f2, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1271829505);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(f2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 147) != 146, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1271829505, i2, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:349)");
            }
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            RemoteActionCompatParcelizer remoteActionCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z | z2) || remoteActionCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                remoteActionCompatParcelizerOnPause = new RemoteActionCompatParcelizer(f, f2);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(remoteActionCompatParcelizerOnPause);
            }
            withTypeHandler withtypehandler = (withTypeHandler) remoteActionCompatParcelizerOnPause;
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, companion);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf(((((((i2 >> 6) & 14) << 6) & 896) | 6) >> 6) & 14));
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setSpeed
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setOutlineMasksAndMattes.AudioAttributesCompatParcelizer(f, f2, magicModuleSubmissionRequestBody, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements withTypeHandler {
        final /* synthetic */ float AudioAttributesCompatParcelizer;
        final /* synthetic */ float RemoteActionCompatParcelizer;

        @Override // kotlin.withTypeHandler
        public final withHandlersFrom AudioAttributesCompatParcelizer(final withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
            int iMax;
            MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer;
            MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer2;
            ArrayList arrayList;
            ArrayList arrayList2;
            float f;
            MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer3;
            List<? extends isTypeOrSuperTypeOf> list2 = list;
            final ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer4 = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
            MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer5 = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
            ArrayList arrayList6 = new ArrayList();
            MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer6 = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
            MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer7 = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
            long j2 = PropertyValueBuffer.read$default(0, PropertyValueAny.AudioAttributesImplBaseParcelizer(j), 0, 0, 13, null);
            float f2 = this.RemoteActionCompatParcelizer;
            float f3 = this.AudioAttributesCompatParcelizer;
            int size = list2.size();
            int i = 0;
            while (i < size) {
                _parser _parserVarWrite = list2.get(i).write(j2);
                int i2 = i;
                int i3 = size;
                float f4 = f3;
                float f5 = f2;
                long j3 = j2;
                MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer8 = iconCompatParcelizer7;
                if (IconCompatParcelizer(arrayList6, iconCompatParcelizer6, withcontentvaluehandler, f2, j, _parserVarWrite)) {
                    iconCompatParcelizer = iconCompatParcelizer6;
                    iconCompatParcelizer2 = iconCompatParcelizer5;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                } else {
                    iconCompatParcelizer = iconCompatParcelizer6;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    iconCompatParcelizer2 = iconCompatParcelizer5;
                    read(arrayList3, iconCompatParcelizer5, withcontentvaluehandler, f4, arrayList6, arrayList4, iconCompatParcelizer8, arrayList7, iconCompatParcelizer4, iconCompatParcelizer);
                }
                if (arrayList2.isEmpty()) {
                    f = f5;
                    iconCompatParcelizer3 = iconCompatParcelizer;
                } else {
                    iconCompatParcelizer3 = iconCompatParcelizer;
                    f = f5;
                    iconCompatParcelizer3.AudioAttributesCompatParcelizer += withcontentvaluehandler.IconCompatParcelizer(f);
                }
                arrayList2.add(_parserVarWrite);
                iconCompatParcelizer3.AudioAttributesCompatParcelizer += _parserVarWrite.getRead();
                iconCompatParcelizer8.AudioAttributesCompatParcelizer = Math.max(iconCompatParcelizer8.AudioAttributesCompatParcelizer, _parserVarWrite.getRemoteActionCompatParcelizer());
                f2 = f;
                iconCompatParcelizer7 = iconCompatParcelizer8;
                iconCompatParcelizer6 = iconCompatParcelizer3;
                arrayList6 = arrayList2;
                size = i3;
                f3 = f4;
                j2 = j3;
                arrayList5 = arrayList;
                iconCompatParcelizer5 = iconCompatParcelizer2;
                i = i2 + 1;
                list2 = list;
            }
            MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer9 = iconCompatParcelizer7;
            MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer10 = iconCompatParcelizer5;
            final ArrayList arrayList8 = arrayList5;
            MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer11 = iconCompatParcelizer6;
            ArrayList arrayList9 = arrayList6;
            if (!arrayList9.isEmpty()) {
                read(arrayList3, iconCompatParcelizer10, withcontentvaluehandler, this.AudioAttributesCompatParcelizer, arrayList9, arrayList4, iconCompatParcelizer9, arrayList8, iconCompatParcelizer4, iconCompatParcelizer11);
            }
            if (PropertyValueAny.AudioAttributesImplBaseParcelizer(j) != Integer.MAX_VALUE) {
                iMax = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
            } else {
                iMax = Math.max(iconCompatParcelizer4.AudioAttributesCompatParcelizer, PropertyValueAny.MediaBrowserCompatItemReceiver(j));
            }
            int iMax2 = Math.max(iconCompatParcelizer10.AudioAttributesCompatParcelizer, PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j));
            final float f6 = this.RemoteActionCompatParcelizer;
            final int i4 = iMax;
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, iMax, iMax2, null, new getAnswerMap() { // from class: o.setUseCompositionFrameRate
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setOutlineMasksAndMattes.RemoteActionCompatParcelizer.IconCompatParcelizer(arrayList3, withcontentvaluehandler, f6, i4, arrayList8, (_parser.IconCompatParcelizer) obj);
                }
            }, 4, null);
        }

        private static final boolean IconCompatParcelizer(List<_parser> list, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, withContentValueHandler withcontentvaluehandler, float f, long j, _parser _parserVar) {
            if (list.isEmpty()) {
                return true;
            }
            return (iconCompatParcelizer.AudioAttributesCompatParcelizer + withcontentvaluehandler.IconCompatParcelizer(f)) + _parserVar.getRead() <= PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
        }

        private static final void read(List<List<_parser>> list, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, withContentValueHandler withcontentvaluehandler, float f, List<_parser> list2, List<Integer> list3, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer2, List<Integer> list4, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer3, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer4) {
            if (!list.isEmpty()) {
                iconCompatParcelizer.AudioAttributesCompatParcelizer += withcontentvaluehandler.IconCompatParcelizer(f);
            }
            list.add(0, IntermediateLoginResponseBody.onPlay(list2));
            list3.add(Integer.valueOf(iconCompatParcelizer2.AudioAttributesCompatParcelizer));
            list4.add(Integer.valueOf(iconCompatParcelizer.AudioAttributesCompatParcelizer));
            iconCompatParcelizer.AudioAttributesCompatParcelizer += iconCompatParcelizer2.AudioAttributesCompatParcelizer;
            iconCompatParcelizer3.AudioAttributesCompatParcelizer = Math.max(iconCompatParcelizer3.AudioAttributesCompatParcelizer, iconCompatParcelizer4.AudioAttributesCompatParcelizer);
            list2.clear();
            iconCompatParcelizer4.AudioAttributesCompatParcelizer = 0;
            iconCompatParcelizer2.AudioAttributesCompatParcelizer = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup IconCompatParcelizer(List list, withContentValueHandler withcontentvaluehandler, float f, int i, List list2, _parser.IconCompatParcelizer iconCompatParcelizer) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                List list3 = (List) list.get(i2);
                int size2 = list3.size();
                int[] iArr = new int[size2];
                int i3 = 0;
                while (i3 < size2) {
                    iArr[i3] = ((_parser) list3.get(i3)).getRead() + (i3 < IntermediateLoginResponseBody.write(list3) ? withcontentvaluehandler.IconCompatParcelizer(f) : 0);
                    i3++;
                }
                int[] iArr2 = new int[size2];
                WindowInsetsCompatImpl30.INSTANCE.write().write(withcontentvaluehandler, i, iArr, iArr2);
                int size3 = list3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, (_parser) list3.get(i4), iArr2[i4], ((Number) list2.get(i2)).intValue(), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
                }
            }
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(float f, float f2) {
            this.RemoteActionCompatParcelizer = f;
            this.AudioAttributesCompatParcelizer = f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        FastIntegerMathUInt128 fastIntegerMathUInt128AudioAttributesCompatParcelizer;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(802957984, i, -1, "androidx.compose.material.AlertDialogContent.<anonymous> (AlertDialog.kt:208)");
            }
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            FastIntegerMathUInt128 fastIntegerMathUInt128AudioAttributesCompatParcelizer2 = null;
            if (magicModuleSubmissionRequestBody == null) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-97968969);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                fastIntegerMathUInt128AudioAttributesCompatParcelizer = null;
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-97968968);
                fastIntegerMathUInt128AudioAttributesCompatParcelizer = multiplyFft.AudioAttributesCompatParcelizer(1737550099, true, new MagicModuleSubmissionRequestBody() { // from class: o.setRenderMode
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return setOutlineMasksAndMattes.write(magicModuleSubmissionRequestBody, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }, _handleunrecognizedcharacterescape, 54);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (magicModuleSubmissionRequestBody2 == null) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-97547524);
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-97547523);
                fastIntegerMathUInt128AudioAttributesCompatParcelizer2 = multiplyFft.AudioAttributesCompatParcelizer(1265552690, true, new MagicModuleSubmissionRequestBody() { // from class: o.setSafeMode
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return setOutlineMasksAndMattes.AudioAttributesImplApi26Parcelizer(magicModuleSubmissionRequestBody2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }, _handleunrecognizedcharacterescape, 54);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            write(drawerLayoutSavedState, fastIntegerMathUInt128AudioAttributesCompatParcelizer, fastIntegerMathUInt128AudioAttributesCompatParcelizer2, _handleunrecognizedcharacterescape, 6);
            magicModuleSubmissionRequestBody3.invoke(_handleunrecognizedcharacterescape, 0);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(DrawerLayoutLayoutParams drawerLayoutLayoutParams, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        write(drawerLayoutLayoutParams, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleOddName _handleoddname, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, findAndAddVirtualProperties findandaddvirtualproperties, long j, long j2, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        IconCompatParcelizer(magicModuleSubmissionRequestBody, _handleoddname, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, findandaddvirtualproperties, j, j2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(float f, float f2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        read(f, f2, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
