package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;
import kotlin.bindItem;
import kotlin.setLayoutInflater;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0087\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u007f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aw\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\n¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a:\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\nH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a7\u0010!\u001a\u00020\u00012\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\n2\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\nH\u0003¢\u0006\u0002\u0010\"\u001a\u001c\u0010#\u001a\u00020\u0001*\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002\u001aD\u0010)\u001a\u00020\u0001*\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020(2\u0006\u0010'\u001a\u00020(2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020(H\u0002\"\u0010\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103\"\u0010\u00104\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103\"\u000e\u00105\u001a\u00020(X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020(X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020(X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u00108\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103\"\u0010\u00109\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103\"\u0010\u0010:\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103\"\u0010\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0004\n\u0002\u0010=\"\u0010\u0010>\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103¨\u0006?²\u0006\n\u0010@\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"Tab", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "text", "Landroidx/compose/runtime/Composable;", "icon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContentColor", "Tab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "LeadingIconTab", "LeadingIconTab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Tab-EVJuX4I", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TabTransition", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabBaselineLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "placeTextOrIcon", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "textOrIconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "tabHeight", "", "placeTextAndIcon", "density", "Landroidx/compose/ui/unit/Density;", "textPlaceable", "iconPlaceable", "tabWidth", "firstBaseline", "lastBaseline", "SmallTabHeight", "Landroidx/compose/ui/unit/Dp;", "F", "LargeTabHeight", "TabFadeInAnimationDuration", "TabFadeInAnimationDelay", "TabFadeOutAnimationDuration", "HorizontalTextPadding", "SingleLineTextBaselineWithIcon", "DoubleLineTextBaselineWithIcon", "IconDistanceFromBaseline", "Landroidx/compose/ui/unit/TextUnit;", "J", "TextDistanceFromLeadingIcon", "material", TtmlNode.ATTR_TTS_COLOR}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class bindItem {
    private static final float AudioAttributesImplApi26Parcelizer = assignParameter.IconCompatParcelizer(48.0f);
    private static final float RemoteActionCompatParcelizer = assignParameter.IconCompatParcelizer(72.0f);
    private static final float read = assignParameter.IconCompatParcelizer(16.0f);
    private static final float IconCompatParcelizer = assignParameter.IconCompatParcelizer(14.0f);
    private static final float AudioAttributesCompatParcelizer = assignParameter.IconCompatParcelizer(6.0f);
    private static final long write = setResolver.RemoteActionCompatParcelizer(20);
    private static final float AudioAttributesImplApi21Parcelizer = assignParameter.IconCompatParcelizer(8.0f);

    /* JADX WARN: Removed duplicated region for block: B:140:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(final boolean r29, final kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r30, kotlin._handleOddName r31, boolean r32, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r33, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r34, kotlin.hashCode r35, long r36, long r38, kotlin._handleUnrecognizedCharacterEscape r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.bindItem.AudioAttributesCompatParcelizer(boolean, o.getCreatedOnDateMs, o._handleOddName, boolean, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.hashCode, long, long, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1101313667, i, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
            }
            deserializeWithObjectId mediaBrowserCompatMediaItem = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, 6).getMediaBrowserCompatMediaItem();
            _copyCurrentStringValue.RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem.IconCompatParcelizer((16777212 & 1) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.read() : 0L, (16777212 & 2) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() : 0L, (16777212 & 4) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer() : null, (16777212 & 8) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.getWrite() : null, (16777212 & 16) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.getRead() : null, (16777212 & 32) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.getAudioAttributesImplBaseParcelizer() : null, (16777212 & 64) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver() : null, (16777212 & 128) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver() : 0L, (16777212 & 256) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer() : null, (16777212 & 512) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.getAudioAttributesImplApi26Parcelizer() : null, (16777212 & 1024) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.getMediaBrowserCompatMediaItem() : null, (16777212 & 2048) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.getMediaDescriptionCompat() : 0L, (16777212 & 4096) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.getMediaMetadataCompat() : null, (16777212 & 8192) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.getMediaBrowserCompatSearchResultReceiver() : null, (16777212 & 16384) != 0 ? mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.getOnCustomAction() : null, (16777212 & 32768) != 0 ? mediaBrowserCompatMediaItem.read.getWrite() : assignIndexes.INSTANCE.write(), (16777212 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? mediaBrowserCompatMediaItem.read.getIconCompatParcelizer() : 0, (16777212 & 131072) != 0 ? mediaBrowserCompatMediaItem.read.getRead() : 0L, (16777212 & 262144) != 0 ? mediaBrowserCompatMediaItem.read.getAudioAttributesCompatParcelizer() : null, (16777212 & 524288) != 0 ? mediaBrowserCompatMediaItem.write : null, (16777212 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? mediaBrowserCompatMediaItem.read.getAudioAttributesImplApi21Parcelizer() : null, (16777212 & 2097152) != 0 ? mediaBrowserCompatMediaItem.read.getAudioAttributesImplApi26Parcelizer() : 0, (16777212 & 4194304) != 0 ? mediaBrowserCompatMediaItem.read.getMediaBrowserCompatCustomActionResultReceiver() : 0, (16777212 & 8388608) != 0 ? mediaBrowserCompatMediaItem.read.getAudioAttributesImplBaseParcelizer() : null), magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, DrawerLayoutLayoutParams drawerLayoutLayoutParams, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1088373601, i, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
            }
            AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IconCompatParcelizer(final boolean r26, final kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r27, kotlin._handleOddName r28, boolean r29, kotlin.hashCode r30, long r31, long r33, final kotlin.getModuleData<? super kotlin.DrawerLayoutLayoutParams, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r35, kotlin._handleUnrecognizedCharacterEscape r36, final int r37, final int r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.bindItem.IconCompatParcelizer(boolean, o.getCreatedOnDateMs, o._handleOddName, boolean, o.hashCode, long, long, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, boolean z, hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z2, getCreatedOnDateMs getcreatedondatems, getModuleData getmoduledata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-652402312, i, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:236)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(setResizeMode.AudioAttributesCompatParcelizer(_handleoddname, z, hashcode, setparentlayoutdirection, z2, C0184keyDeserializers.write(C0184keyDeserializers.INSTANCE.MediaBrowserCompatItemReceiver()), getcreatedondatems), BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.read(), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescape, 54);
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameRemoteActionCompatParcelizer$default);
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
            getmoduledata.AudioAttributesCompatParcelizer(DrawerLayoutSavedState.INSTANCE, _handleunrecognizedcharacterescape, 6);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final void read(final long j, final long j2, final boolean z, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) throws Throwable {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1841653376);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 2048 : 1024;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 1171) != 1170, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1841653376, i2, -1, "androidx.compose.material.TabTransition (Tab.kt:266)");
            }
            int i3 = i2 >> 6;
            setLayoutInflater setlayoutinflaterAudioAttributesCompatParcelizer = setCardElevation.AudioAttributesCompatParcelizer(Boolean.valueOf(z), (String) null, _handleunrecognizedcharacterescapeWrite, i3 & 14, 2);
            getModuleData getmoduledata = new getModuleData() { // from class: o.ObjectIdGeneratorsNone
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return bindItem.write((setLayoutInflater.write) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            };
            boolean zBooleanValue = ((Boolean) setlayoutinflaterAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer()).booleanValue();
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(90393475);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(90393475, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:282)");
            }
            long j3 = zBooleanValue ? j : j2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            findImplicitPropertyName findimplicitpropertyname = switchToNext.read(j3);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(findimplicitpropertyname);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = (evictionCount) Function1.write(switchToNext.INSTANCE).invoke(findimplicitpropertyname);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            evictionCount evictioncount = (evictionCount) objOnPause;
            boolean zBooleanValue2 = ((Boolean) setlayoutinflaterAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()).booleanValue();
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(90393475);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(90393475, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:282)");
            }
            long j4 = zBooleanValue2 ? j : j2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            switchToNext switchtonextWrite = switchToNext.write(j4);
            boolean zBooleanValue3 = ((Boolean) setlayoutinflaterAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer()).booleanValue();
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(90393475);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(90393475, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:282)");
            }
            long j5 = zBooleanValue3 ? j : j2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            parseDouble parsedoubleAudioAttributesCompatParcelizer = setCardElevation.AudioAttributesCompatParcelizer(setlayoutinflaterAudioAttributesCompatParcelizer, switchtonextWrite, switchToNext.write(j5), (SwitchCompat) getmoduledata.AudioAttributesCompatParcelizer(setlayoutinflaterAudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), _handleunrecognizedcharacterescapeWrite, 0), evictioncount, "ColorAnimation", _handleunrecognizedcharacterescapeWrite, 0);
            resetAsNaN.AudioAttributesCompatParcelizer(new ContentReference[]{R.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(switchToNext.write(switchToNext.AudioAttributesCompatParcelizer$default(read(parsedoubleAudioAttributesCompatParcelizer), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null))), AccessToken.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(Float.valueOf(switchToNext.RemoteActionCompatParcelizer(read(parsedoubleAudioAttributesCompatParcelizer))))}, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescapeWrite, (i3 & 112) | ContentReference.write);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.PropertyAccessor
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return bindItem.IconCompatParcelizer(j, j2, z, magicModuleSubmissionRequestBody, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwitchCompat write(setLayoutInflater.write writeVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        safeSizeOf safesizeofRemoteActionCompatParcelizer$default;
        _handleunrecognizedcharacterescape.IconCompatParcelizer(297582231);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(297582231, i, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:271)");
        }
        if (writeVar.IconCompatParcelizer(Boolean.FALSE, Boolean.TRUE)) {
            safesizeofRemoteActionCompatParcelizer$default = setVerticalGravity.RemoteActionCompatParcelizer(150, 100, setShowText.read());
        } else {
            safesizeofRemoteActionCompatParcelizer$default = setVerticalGravity.RemoteActionCompatParcelizer$default(100, 0, setShowText.read(), 2, (Object) null);
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return safesizeofRemoteActionCompatParcelizer$default;
    }

    private static final void AudioAttributesCompatParcelizer(final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1466813041);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody2) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1466813041, i2, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:297)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            boolean z2 = (i2 & 112) == 32;
            IconCompatParcelizer iconCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z | z2) || iconCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                iconCompatParcelizerOnPause = new IconCompatParcelizer(magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(iconCompatParcelizerOnPause);
            }
            withTypeHandler withtypehandler = (withTypeHandler) iconCompatParcelizerOnPause;
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
            if (magicModuleSubmissionRequestBody != null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1044948645);
                _handleOddName _handleoddnameWrite$default = getParentFragment.write$default(isEnumType.IconCompatParcelizer(_handleOddName.INSTANCE, "text"), read, BitmapDescriptorFactory.HUE_RED, 2, null);
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iAudioAttributesCompatParcelizer2 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameWrite$default);
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
                magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf(i3));
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1057560344);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            if (magicModuleSubmissionRequestBody2 != null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1044815097);
                _handleOddName _handleoddnameIconCompatParcelizer = isEnumType.IconCompatParcelizer(_handleOddName.INSTANCE, "icon");
                withTypeHandler withtypehandlerWrite2 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iAudioAttributesCompatParcelizer3 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer);
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
                magicModuleSubmissionRequestBody2.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf((i2 >> 3) & 14));
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1057560344);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.asBoolean
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return bindItem.read(magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements withTypeHandler {
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer;

        @Override // kotlin.withTypeHandler
        public final withHandlersFrom AudioAttributesCompatParcelizer(final withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
            final _parser _parserVarWrite;
            final _parser _parserVarWrite2;
            if (this.RemoteActionCompatParcelizer != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    isTypeOrSuperTypeOf istypeorsupertypeof = list.get(i);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isEnumType.IconCompatParcelizer(istypeorsupertypeof), (Object) "text")) {
                        _parserVarWrite = istypeorsupertypeof.write(PropertyValueAny.AudioAttributesCompatParcelizer$default(j, 0, 0, 0, 0, 11, null));
                    }
                }
                ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer("Collection contains no element matching the predicate.");
                throw new PlanDetailsCreator();
            }
            _parserVarWrite = null;
            if (this.IconCompatParcelizer != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    isTypeOrSuperTypeOf istypeorsupertypeof2 = list.get(i2);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isEnumType.IconCompatParcelizer(istypeorsupertypeof2), (Object) "icon")) {
                        _parserVarWrite2 = istypeorsupertypeof2.write(j);
                    }
                }
                ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer("Collection contains no element matching the predicate.");
                throw new PlanDetailsCreator();
            }
            _parserVarWrite2 = null;
            final int iMax = Math.max(_parserVarWrite != null ? _parserVarWrite.getRead() : 0, _parserVarWrite2 != null ? _parserVarWrite2.getRead() : 0);
            final int iIconCompatParcelizer = withcontentvaluehandler.IconCompatParcelizer((_parserVarWrite == null || _parserVarWrite2 == null) ? bindItem.AudioAttributesImplApi26Parcelizer : bindItem.RemoteActionCompatParcelizer);
            final Integer numValueOf = _parserVarWrite != null ? Integer.valueOf(_parserVarWrite.AudioAttributesCompatParcelizer(wrongTokenException.RemoteActionCompatParcelizer())) : null;
            final Integer numValueOf2 = _parserVarWrite != null ? Integer.valueOf(_parserVarWrite.AudioAttributesCompatParcelizer(wrongTokenException.IconCompatParcelizer())) : null;
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, iMax, iIconCompatParcelizer, null, new getAnswerMap() { // from class: o._reportInvalidBase64
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return bindItem.IconCompatParcelizer.read(_parserVarWrite, _parserVarWrite2, withcontentvaluehandler, iMax, iIconCompatParcelizer, numValueOf, numValueOf2, (_parser.IconCompatParcelizer) obj);
                }
            }, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(_parser _parserVar, _parser _parserVar2, withContentValueHandler withcontentvaluehandler, int i, int i2, Integer num, Integer num2, _parser.IconCompatParcelizer iconCompatParcelizer) {
            if (_parserVar != null && _parserVar2 != null) {
                toMagicModuleMetaRepoModel.write(num);
                int iIntValue = num.intValue();
                toMagicModuleMetaRepoModel.write(num2);
                bindItem.write(iconCompatParcelizer, withcontentvaluehandler, _parserVar, _parserVar2, i, i2, iIntValue, num2.intValue());
            } else if (_parserVar != null) {
                bindItem.write(iconCompatParcelizer, _parserVar, i2);
            } else if (_parserVar2 != null) {
                bindItem.write(iconCompatParcelizer, _parserVar2, i2);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2) {
            this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
            this.IconCompatParcelizer = magicModuleSubmissionRequestBody2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(_parser.IconCompatParcelizer iconCompatParcelizer, _parser _parserVar, int i) {
        _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, 0, (i - _parserVar.getRemoteActionCompatParcelizer()) / 2, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(_parser.IconCompatParcelizer iconCompatParcelizer, bufferMapProperty buffermapproperty, _parser _parserVar, _parser _parserVar2, int i, int i2, int i3, int i4) {
        float f;
        if (i3 == i4) {
            f = IconCompatParcelizer;
        } else {
            f = AudioAttributesCompatParcelizer;
        }
        int iIconCompatParcelizer = buffermapproperty.IconCompatParcelizer(f);
        int iIconCompatParcelizer2 = buffermapproperty.IconCompatParcelizer(Base64Variant.write.RemoteActionCompatParcelizer());
        int remoteActionCompatParcelizer = _parserVar2.getRemoteActionCompatParcelizer();
        int iA_ = buffermapproperty.a_(write);
        int i5 = (i2 - i4) - (iIconCompatParcelizer + iIconCompatParcelizer2);
        _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, (i - _parserVar.getRead()) / 2, i5, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar2, (i - _parserVar2.getRead()) / 2, i5 - ((remoteActionCompatParcelizer + iA_) - i3), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
    }

    private static final long read(parseDouble<switchToNext> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().getIconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(long j, long j2, boolean z, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) throws Throwable {
        read(j, j2, z, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(boolean z, getCreatedOnDateMs getcreatedondatems, _handleOddName _handleoddname, boolean z2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, hashCode hashcode, long j, long j2, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        AudioAttributesCompatParcelizer(z, getcreatedondatems, _handleoddname, z2, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, hashcode, j, j2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(boolean z, getCreatedOnDateMs getcreatedondatems, _handleOddName _handleoddname, boolean z2, hashCode hashcode, long j, long j2, getModuleData getmoduledata, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) throws Throwable {
        IconCompatParcelizer(z, getcreatedondatems, _handleoddname, z2, hashcode, j, j2, getmoduledata, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
