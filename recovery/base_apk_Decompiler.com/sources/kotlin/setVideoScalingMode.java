package kotlin;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._skipWSOrEnd;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aå\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182#\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$21\u0010%\u001a-\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010&¢\u0006\u0002\b)¢\u0006\u0002\b*H\u0001¢\u0006\u0004\b+\u0010,\u001a\u0081\u0001\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u0004\u001a\u00020\u000521\u0010%\u001a-\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010&¢\u0006\u0002\b)¢\u0006\u0002\b*2#\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001a2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120.H\u0003¢\u0006\u0002\u00101\u001a\u0014\u00102\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u00063"}, d2 = {"Pager", "", "modifier", "Landroidx/compose/ui/Modifier;", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "beyondViewportPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "pageContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Pager-eLwUrMk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "rememberPagerItemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "pageCount", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "dragDirectionDetector", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setVideoScalingMode {
    public static final void read(final _handleOddName _handleoddname, final ApicFrame apicFrame, final getReturnTransition getreturntransition, final boolean z, final superDispatchKeyEvent superdispatchkeyevent, final performClickableSpanAction performclickablespanaction, final boolean z2, final setLastHorizontalStyle setlasthorizontalstyle, int i, float f, final canUpdateMediaItem canupdatemediaitem, final DatabindException databindException, final getAnswerMap<? super Integer, ? extends Object> getanswermap, final _skipWSOrEnd.write writeVar, final _skipWSOrEnd.read readVar, final getInsetsIgnoringVisibility getinsetsignoringvisibility, final getMagicModuleStat<? super setOutputBuffer, ? super Integer, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmagicmodulestat, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final int i7;
        final float f2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3;
        int i8;
        _handleOddName.Companion companionWrite;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-572816025);
        if ((i2 & 6) == 0) {
            i5 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(apicFrame) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getreturntransition) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(superdispatchkeyevent.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(performclickablespanaction) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setlasthorizontalstyle) ? 8388608 : 4194304;
        }
        int i9 = i4 & 256;
        if (i9 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 67108864 : 33554432;
        }
        int i10 = i4 & 512;
        if (i10 != 0) {
            i5 |= C.ENCODING_PCM_32BIT;
        } else if ((i2 & C.ENCODING_PCM_32BIT) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(f) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(canupdatemediaitem) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(databindException) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(writeVar) ? 2048 : 1024;
        }
        if ((i3 & CpioConstants.C_ISBLK) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(readVar) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getinsetsignoringvisibility) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getmagicmodulestat) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i11 = i6;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(((i5 & 306783379) == 306783378 && (599187 & i11) == 599186) ? false : true, i5 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            i7 = i;
            f2 = f;
        } else {
            int i12 = i9 != 0 ? 0 : i;
            float fIconCompatParcelizer = i10 != 0 ? assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED) : f;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-572816025, i5, i11, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
            }
            if (i12 < 0) {
                getRootStableInsets.RemoteActionCompatParcelizer("beyondViewportPageCount should be greater than or equal to 0, you selected ".concat(String.valueOf(i12)));
            }
            int i13 = i5 & 112;
            boolean z3 = i13 == 32;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z3 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.DashMediaSourceFactory
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Integer.valueOf(setVideoScalingMode.IconCompatParcelizer(apicFrame));
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause;
            int i14 = i5 >> 3;
            int i15 = i14 & 14;
            int i16 = i11 >> 15;
            int i17 = i5;
            int i18 = i12;
            getCreatedOnDateMs<disable> getcreatedondatemsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(apicFrame, getmagicmodulestat, getanswermap, getcreatedondatems, _handleunrecognizedcharacterescapeWrite, i15 | (i16 & 112) | (i11 & 896));
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescapeWrite;
                objOnPause2 = StreamReadException.RemoteActionCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescape3);
                _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(objOnPause2);
            } else {
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescapeWrite;
            }
            TopUserCompanion topUserCompanion = (TopUserCompanion) objOnPause2;
            boolean z4 = i13 == 32;
            Object objOnPause3 = _handleunrecognizedcharacterescape3.onPause();
            if (z4 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.getLiveEdgeOffsetUs
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Integer.valueOf(setVideoScalingMode.read(apicFrame));
                    }
                };
                _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(objOnPause3);
            }
            getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause3;
            int i19 = i17 >> 9;
            int i20 = i11 << 15;
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = _handleunrecognizedcharacterescape3;
            addAnalyticsListener addanalyticslistenerRemoteActionCompatParcelizer = C0203setPlayerId.RemoteActionCompatParcelizer(getcreatedondatemsRemoteActionCompatParcelizer, apicFrame, getreturntransition, z, superdispatchkeyevent, i18, fIconCompatParcelizer, canupdatemediaitem, writeVar, readVar, getinsetsignoringvisibility, topUserCompanion, getcreatedondatems2, _handleunrecognizedcharacterescape4, ((i11 << 21) & 29360128) | (i19 & 3670016) | (i17 & 65520) | (i19 & 458752) | (234881024 & i20) | (1879048192 & i20), i16 & 14);
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape4;
            getPauseAtEndOfMediaItems getpauseatendofmediaitemsRemoteActionCompatParcelizer = setUseSensorRotation.RemoteActionCompatParcelizer(apicFrame, superdispatchkeyevent == superDispatchKeyEvent.write, _handleunrecognizedcharacterescape2, i15);
            boolean z5 = i13 == 32;
            boolean z6 = (i17 & 458752) == 131072;
            Object objOnPause4 = _handleunrecognizedcharacterescape2.onPause();
            if ((z5 | z6) || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new TextInformationFrame(performclickablespanaction, apicFrame);
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause4);
            }
            TextInformationFrame textInformationFrame = (TextInformationFrame) objOnPause4;
            MotionTelltales motionTelltales = (MotionTelltales) _handleunrecognizedcharacterescape2.write(Barrier.AudioAttributesCompatParcelizer());
            boolean z7 = i13 == 32;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape2.AudioAttributesCompatParcelizer(motionTelltales);
            Object objOnPause5 = _handleunrecognizedcharacterescape2.onPause();
            if ((z7 | zAudioAttributesCompatParcelizer) || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new maybeThrowSourceInfoRefreshError(apicFrame, motionTelltales);
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause5);
            }
            maybeThrowSourceInfoRefreshError maybethrowsourceinforefresherror = (maybeThrowSourceInfoRefreshError) objOnPause5;
            if (z2) {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-853822717);
                i8 = i18;
                companionWrite = isAbandoned.write(_handleOddName.INSTANCE, updateLiveConfiguration.IconCompatParcelizer(apicFrame, i8, _handleunrecognizedcharacterescape2, i15 | ((i17 >> 21) & 112)), apicFrame.getOnSetShuffleMode(), z, superdispatchkeyevent);
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                i8 = i18;
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-853392933);
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                companionWrite = _handleOddName.INSTANCE;
            }
            int i21 = i8;
            C0155Metadata.IconCompatParcelizer(getcreatedondatemsRemoteActionCompatParcelizer, objectIdResolverInstance.AudioAttributesCompatParcelizer$default(IconCompatParcelizer(MotionEffect.AudioAttributesCompatParcelizer(HlsTrackMetadataEntryVariantInfo.AudioAttributesCompatParcelizer(getPreloadConfiguration.read(_handleoddname.AudioAttributesCompatParcelizer(apicFrame.getSetSessionImpl()).AudioAttributesCompatParcelizer(apicFrame.getOnSetPlaybackSpeed()), getcreatedondatemsRemoteActionCompatParcelizer, getpauseatendofmediaitemsRemoteActionCompatParcelizer, superdispatchkeyevent, z2, z, _handleunrecognizedcharacterescape2, ((i17 << 6) & 458752) | (i14 & 7168) | ((i17 >> 6) & 57344)), apicFrame, superdispatchkeyevent == superDispatchKeyEvent.write, topUserCompanion, z2).AudioAttributesCompatParcelizer(companionWrite), apicFrame, superdispatchkeyevent, setlasthorizontalstyle, z2, z, textInformationFrame, apicFrame.getOnPrepare(), maybethrowsourceinforefresherror), apicFrame), databindException, null, 2, null), apicFrame.getOnPrepareFromUri(), addanalyticslistenerRemoteActionCompatParcelizer, _handleunrecognizedcharacterescape2, 0, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            i7 = i21;
            f2 = fIconCompatParcelizer;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.createTimelineForOnDemand
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setVideoScalingMode.write(_handleoddname, apicFrame, getreturntransition, z, superdispatchkeyevent, performclickablespanaction, z2, setlasthorizontalstyle, i7, f2, canupdatemediaitem, databindException, getanswermap, writeVar, readVar, getinsetsignoringvisibility, getmagicmodulestat, i2, i3, i4, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IconCompatParcelizer(ApicFrame apicFrame) {
        return apicFrame.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int read(ApicFrame apicFrame) {
        return apicFrame.write();
    }

    private static final getCreatedOnDateMs<disable> RemoteActionCompatParcelizer(final ApicFrame apicFrame, getMagicModuleStat<? super setOutputBuffer, ? super Integer, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmagicmodulestat, getAnswerMap<? super Integer, ? extends Object> getanswermap, final getCreatedOnDateMs<Integer> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1052364153, i, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:257)");
        }
        final parseDouble parsedouble = _qbuf.read(getmagicmodulestat, _handleunrecognizedcharacterescape, (i >> 3) & 14);
        final parseDouble parsedouble2 = _qbuf.read(getanswermap, _handleunrecognizedcharacterescape, (i >> 6) & 14);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(apicFrame)) || (i & 6) == 4;
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(parsedouble);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(parsedouble2);
        if ((((i & 7168) ^ 3072) <= 2048 || !_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getcreatedondatems)) && (i & 3072) != 2048) {
            z = false;
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z2 | zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | z) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            final parseDouble parsedoubleIconCompatParcelizer = _qbuf.IconCompatParcelizer(_qbuf.read(), new getCreatedOnDateMs() { // from class: o.findClosestPrecedingSegment
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return setVideoScalingMode.write(parsedouble, parsedouble2, getcreatedondatems);
                }
            });
            objOnPause = (ResponseErrorCompanion) new r8lambdaUFY5mAmNSw5Bop5Ye76bF6DmHgA(_qbuf.IconCompatParcelizer(_qbuf.read(), new getCreatedOnDateMs() { // from class: o.getLiveWindowDefaultStartPositionUs
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return setVideoScalingMode.RemoteActionCompatParcelizer(parsedoubleIconCompatParcelizer, apicFrame);
                }
            })) { // from class: o.setVideoScalingMode.RemoteActionCompatParcelizer
                @Override // kotlin.r8lambdaUFY5mAmNSw5Bop5Ye76bF6DmHgA, kotlin.ResponseErrorCompanion
                public final Object read() {
                    return ((parseDouble) this.AudioAttributesImplApi26Parcelizer).getRemoteActionCompatParcelizer();
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        ResponseErrorCompanion responseErrorCompanion = (ResponseErrorCompanion) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return responseErrorCompanion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final disableInternal write(parseDouble parsedouble, parseDouble parsedouble2, getCreatedOnDateMs getcreatedondatems) {
        return new disableInternal((getMagicModuleStat) parsedouble.getRemoteActionCompatParcelizer(), (getAnswerMap) parsedouble2.getRemoteActionCompatParcelizer(), ((Number) getcreatedondatems.invoke()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final disable RemoteActionCompatParcelizer(parseDouble parsedouble, ApicFrame apicFrame) {
        disableInternal disableinternal = (disableInternal) parsedouble.getRemoteActionCompatParcelizer();
        return new disable(apicFrame, disableinternal, new replaceMediaItems(apicFrame.onPlayFromMediaId(), disableinternal));
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements PointerInputEventHandler {
        final /* synthetic */ ApicFrame write;

        /* JADX INFO: renamed from: o.setVideoScalingMode$IconCompatParcelizer$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ ApicFrame AudioAttributesCompatParcelizer;
            int IconCompatParcelizer;
            final /* synthetic */ handleBadMerge RemoteActionCompatParcelizer;

            /* JADX INFO: renamed from: o.setVideoScalingMode$IconCompatParcelizer$3$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class AnonymousClass5 extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> {
                final /* synthetic */ ApicFrame AudioAttributesCompatParcelizer;
                Object IconCompatParcelizer;
                private /* synthetic */ Object RemoteActionCompatParcelizer;
                Object read;
                int write;

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
                
                    if (r11 != r0) goto L12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
                
                    if (r11 == r0) goto L26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006a -> B:17:0x006d). Please report as a decompilation issue!!! */
                @Override // kotlin.getMonthName
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                        int r1 = r10.write
                        r2 = 2
                        r3 = 0
                        r4 = 1
                        if (r1 == 0) goto L2f
                        if (r1 == r4) goto L27
                        if (r1 != r2) goto L1f
                        java.lang.Object r1 = r10.read
                        o.getArrayBuilders r1 = (kotlin.getArrayBuilders) r1
                        java.lang.Object r4 = r10.IconCompatParcelizer
                        o.getArrayBuilders r4 = (kotlin.getArrayBuilders) r4
                        java.lang.Object r5 = r10.RemoteActionCompatParcelizer
                        o.getConstructorDetector r5 = (kotlin.getConstructorDetector) r5
                        kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                        goto L6d
                    L1f:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L27:
                        java.lang.Object r1 = r10.RemoteActionCompatParcelizer
                        o.getConstructorDetector r1 = (kotlin.getConstructorDetector) r1
                        kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                        goto L46
                    L2f:
                        kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                        java.lang.Object r11 = r10.RemoteActionCompatParcelizer
                        r1 = r11
                        o.getConstructorDetector r1 = (kotlin.getConstructorDetector) r1
                        o._shapeForToken r11 = kotlin._shapeForToken.IconCompatParcelizer
                        r5 = r10
                        o.SampleVideos r5 = (kotlin.SampleVideos) r5
                        r10.RemoteActionCompatParcelizer = r1
                        r10.write = r4
                        java.lang.Object r11 = kotlin.isSpanStillValid.RemoteActionCompatParcelizer(r1, r3, r11, r5)
                        if (r11 == r0) goto Lad
                    L46:
                        o.getArrayBuilders r11 = (kotlin.getArrayBuilders) r11
                        o.ApicFrame r4 = r10.AudioAttributesCompatParcelizer
                        o.getReferencedType$RemoteActionCompatParcelizer r5 = kotlin.getReferencedType.INSTANCE
                        long r5 = r5.write()
                        r4.IconCompatParcelizer(r5)
                        r4 = 0
                        r5 = r1
                        r1 = r4
                        r4 = r11
                    L57:
                        if (r1 != 0) goto L99
                        o._shapeForToken r11 = kotlin._shapeForToken.IconCompatParcelizer
                        r6 = r10
                        o.SampleVideos r6 = (kotlin.SampleVideos) r6
                        r10.RemoteActionCompatParcelizer = r5
                        r10.IconCompatParcelizer = r4
                        r10.read = r1
                        r10.write = r2
                        java.lang.Object r11 = r5.read(r11, r6)
                        if (r11 != r0) goto L6d
                        goto Lad
                    L6d:
                        o.DeserializationContext r11 = (kotlin.DeserializationContext) r11
                        java.util.List r6 = r11.AudioAttributesCompatParcelizer()
                        r7 = r6
                        java.util.Collection r7 = (java.util.Collection) r7
                        int r7 = r7.size()
                        r8 = r3
                    L7b:
                        if (r8 >= r7) goto L8d
                        java.lang.Object r9 = r6.get(r8)
                        o.getArrayBuilders r9 = (kotlin.getArrayBuilders) r9
                        boolean r9 = kotlin.bufferAsCopyOfValue.RemoteActionCompatParcelizer(r9)
                        if (r9 != 0) goto L8a
                        goto L57
                    L8a:
                        int r8 = r8 + 1
                        goto L7b
                    L8d:
                        java.util.List r11 = r11.AudioAttributesCompatParcelizer()
                        java.lang.Object r11 = r11.get(r3)
                        r1 = r11
                        o.getArrayBuilders r1 = (kotlin.getArrayBuilders) r1
                        goto L57
                    L99:
                        o.ApicFrame r10 = r10.AudioAttributesCompatParcelizer
                        long r0 = r1.getRead()
                        long r2 = r4.getRead()
                        long r0 = kotlin.getReferencedType.AudioAttributesCompatParcelizer(r0, r2)
                        r10.IconCompatParcelizer(r0)
                        o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
                        return r10
                    Lad:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.setVideoScalingMode.IconCompatParcelizer.AnonymousClass3.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(ApicFrame apicFrame, SampleVideos<? super AnonymousClass5> sampleVideos) {
                    super(2, sampleVideos);
                    this.AudioAttributesCompatParcelizer = apicFrame;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.AudioAttributesCompatParcelizer, sampleVideos);
                    anonymousClass5.RemoteActionCompatParcelizer = obj;
                    return anonymousClass5;
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public final Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AnonymousClass5) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.IconCompatParcelizer = 1;
                    if (setOnHierarchyChangeListener.IconCompatParcelizer(this.RemoteActionCompatParcelizer, new AnonymousClass5(this.AudioAttributesCompatParcelizer, null), this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(handleBadMerge handlebadmerge, ApicFrame apicFrame, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = handlebadmerge;
                this.AudioAttributesCompatParcelizer = apicFrame;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass3(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            Object objIconCompatParcelizer = College.IconCompatParcelizer(new AnonymousClass3(handlebadmerge, this.write, null), sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(ApicFrame apicFrame) {
            this.write = apicFrame;
        }
    }

    private static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, ApicFrame apicFrame) {
        return _handleoddname.AudioAttributesCompatParcelizer(hasSomeOfFeatures.IconCompatParcelizer(_handleOddName.INSTANCE, apicFrame, new IconCompatParcelizer(apicFrame)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleOddName _handleoddname, ApicFrame apicFrame, getReturnTransition getreturntransition, boolean z, superDispatchKeyEvent superdispatchkeyevent, performClickableSpanAction performclickablespanaction, boolean z2, setLastHorizontalStyle setlasthorizontalstyle, int i, float f, canUpdateMediaItem canupdatemediaitem, DatabindException databindException, getAnswerMap getanswermap, _skipWSOrEnd.write writeVar, _skipWSOrEnd.read readVar, getInsetsIgnoringVisibility getinsetsignoringvisibility, getMagicModuleStat getmagicmodulestat, int i2, int i3, int i4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i5) {
        read(_handleoddname, apicFrame, getreturntransition, z, superdispatchkeyevent, performclickablespanaction, z2, setlasthorizontalstyle, i, f, canupdatemediaitem, databindException, getanswermap, writeVar, readVar, getinsetsignoringvisibility, getmagicmodulestat, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), _appendEscaped.RemoteActionCompatParcelizer(i3), i4);
        return getShowPopup.INSTANCE;
    }
}
