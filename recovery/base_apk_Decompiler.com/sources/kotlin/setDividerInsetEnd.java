package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.getSupportFragmentManager;
import kotlin.setDividerInsetEnd;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class setDividerInsetEnd {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List RemoteActionCompatParcelizer(List list) {
        return list;
    }

    public static final void IconCompatParcelizer(_handleOddName _handleoddname, final boolean z, final long j, final List<setMoney> list, final int i, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getAnswerMap<? super Integer, getShowPopup> getanswermap, final getAnswerMap<? super AppMeasurementDynamiteService, getShowPopup> getanswermap2, setSingleLine setsingleline, final List<setSingleLine> list2, final MagicModuleSubmissionRequestBody<? super setSingleLine, ? super AppMeasurementConditionalUserProperty, getShowPopup> magicModuleSubmissionRequestBody, final getAnswerMap<? super String, getShowPopup> getanswermap3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        _handleOddName _handleoddname2;
        final setSingleLine setsingleline2;
        quoteAsUTF8 quoteasutf8;
        int i7;
        InputAccessor inputAccessor;
        InputAccessor inputAccessor2;
        int iWrite;
        InputAccessor inputAccessor3;
        InputAccessor inputAccessor4;
        setSingleLine setsingleline3;
        String strIconCompatParcelizer;
        SampleVideos sampleVideos;
        IconCompatParcelizer iconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(getanswermap3, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1460146499);
        int i8 = i4 & 1;
        if (i8 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap2) ? 8388608 : 4194304;
        }
        int i9 = i4 & 256;
        if (i9 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setsingleline) ? 67108864 : 33554432;
        }
        if ((i2 & C.ENCODING_PCM_32BIT) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list2) ? 536870912 : 268435456;
        }
        int i10 = i5;
        if ((i3 & 6) == 0) {
            i6 = i3 | (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap3) ? 32 : 16;
        }
        int i11 = i6;
        if (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(((i10 & 306783379) == 306783378 && (i11 & 19) == 18) ? false : true, i10 & 1)) {
            _handleOddName _handleoddname3 = i8 != 0 ? _handleOddName.INSTANCE : _handleoddname;
            setSingleLine setsingleline4 = i9 != 0 ? null : setsingleline;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1460146499, i10, i11, "com.marrow2.ui.test.testplay.ui.QuestionReviewBottomSheet (QuestionReviewBottomSheet.kt:50)");
            }
            int i12 = i10 & 458752;
            boolean z2 = i12 == 131072;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z2 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.setDividerThicknessResource
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setDividerInsetEnd.IconCompatParcelizer(getcreatedondatems);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            MediaSessionCompatToken.write(true, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescapeWrite, 6, 0);
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                quoteasutf8 = null;
                objOnPause2 = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            } else {
                quoteasutf8 = null;
            }
            InputAccessor inputAccessor5 = (InputAccessor) objOnPause2;
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, quoteasutf8, 2, quoteasutf8);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            InputAccessor inputAccessor6 = (InputAccessor) objOnPause3;
            final MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer2 = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
            final ArrayList arrayList = new ArrayList();
            if (setsingleline4 == null) {
                iconCompatParcelizer2.AudioAttributesCompatParcelizer = i;
                i7 = i11;
                inputAccessor2 = inputAccessor6;
                inputAccessor = inputAccessor5;
                int i13 = saveMagicModuleTimeline.read(0, list.size() - 1, 30);
                if (i13 >= 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 30;
                        int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(i15, list.size());
                        StringBuilder sb = new StringBuilder();
                        sb.append(i14 + 1);
                        sb.append(" - ");
                        sb.append(iRemoteActionCompatParcelizer);
                        arrayList.add(sb.toString());
                        if (i14 == i13) {
                            break;
                        } else {
                            i14 = i15;
                        }
                    }
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                iWrite = 0;
            } else {
                i7 = i11;
                inputAccessor = inputAccessor5;
                inputAccessor2 = inputAccessor6;
                iconCompatParcelizer2.AudioAttributesCompatParcelizer = setsingleline4.getRead() + i;
                iWrite = getQues.write(list2.indexOf(setsingleline4), 0);
                List<setSingleLine> list3 = list2;
                ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((setSingleLine) it.next()).getRemoteActionCompatParcelizer());
                }
                arrayList.addAll(arrayList2);
            }
            Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                InputAccessor inputAccessorRemoteActionCompatParcelizer$default = available.RemoteActionCompatParcelizer$default(Integer.valueOf(iWrite), null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(inputAccessorRemoteActionCompatParcelizer$default);
                objOnPause4 = inputAccessorRemoteActionCompatParcelizer$default;
            }
            final InputAccessor inputAccessor7 = (InputAccessor) objOnPause4;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(list);
            Object objOnPause5 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = _qbuf.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.setDividerThickness
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setDividerInsetEnd.RemoteActionCompatParcelizer(arrayList);
                    }
                });
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause5);
            }
            final parseDouble parsedouble = (parseDouble) objOnPause5;
            final onActivityPostCreated onactivitypostcreatedIconCompatParcelizer = onActivityPrePaused.IconCompatParcelizer(0, 0, _handleunrecognizedcharacterescapeWrite, 0, 3);
            if (setsingleline4 == null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-202572841);
                boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(onactivitypostcreatedIconCompatParcelizer);
                Object objOnPause6 = _handleunrecognizedcharacterescapeWrite.onPause();
                if (zAudioAttributesCompatParcelizer2 || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    sampleVideos = null;
                    iconCompatParcelizer = new IconCompatParcelizer(onactivitypostcreatedIconCompatParcelizer, inputAccessor7, null);
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(iconCompatParcelizer);
                } else {
                    iconCompatParcelizer = objOnPause6;
                    sampleVideos = null;
                }
                StreamReadException.IconCompatParcelizer(onactivitypostcreatedIconCompatParcelizer, (MagicModuleSubmissionRequestBody) iconCompatParcelizer, _handleunrecognizedcharacterescapeWrite, 0);
                StreamReadException.IconCompatParcelizer(list, new AudioAttributesCompatParcelizer(onactivitypostcreatedIconCompatParcelizer, iconCompatParcelizer2, sampleVideos), _handleunrecognizedcharacterescapeWrite, (i10 >> 9) & 14);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-205978625);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            Object objOnPause7 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause7 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause7 = StreamReadException.RemoteActionCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescapeWrite);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause7);
            }
            final TopUserCompanion topUserCompanion = (TopUserCompanion) objOnPause7;
            _handleOddName _handleoddnameIconCompatParcelizer$default = getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.IconCompatParcelizer$default(_handleoddname3, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null);
            _handleOddName _handleoddname4 = _handleoddname3;
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer$default);
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
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(56.0f)), BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default);
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
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = setdrawerelevation.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.AudioAttributesImplApi26Parcelizer());
            boolean z3 = i12 == 131072;
            Object objOnPause8 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z3 || objOnPause8 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause8 = new getCreatedOnDateMs() { // from class: o.ExtendedFloatingActionButton
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setDividerInsetEnd.read(getcreatedondatems);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause8);
            }
            ChipGroupLayoutParams chipGroupLayoutParams = ChipGroupLayoutParams.AudioAttributesCompatParcelizer;
            JacksonInjectValue.IconCompatParcelizer((getCreatedOnDateMs) objOnPause8, _handleoddnameAudioAttributesCompatParcelizer, false, null, ChipGroupLayoutParams.AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, CpioConstants.C_ISBLK, 12);
            boolean z4 = (i10 & 896) == 256;
            Object objOnPause9 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z4 || objOnPause9 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause9 = available.RemoteActionCompatParcelizer$default(parseEac3SupplementalProperties.RemoteActionCompatParcelizer(j), null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause9);
            }
            InputAccessor inputAccessor8 = (InputAccessor) objOnPause9;
            if (z) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(954492427);
                _handleOddName _handleoddnameAudioAttributesCompatParcelizer2 = setdrawerelevation.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer());
                if (j > 0) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(862077744);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    strIconCompatParcelizer = IconCompatParcelizer((InputAccessor<String>) inputAccessor8);
                } else {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(862078508);
                    strIconCompatParcelizer = singleArgCreatorDefaultsToProperties.read(R.string.zero_timer_text, _handleunrecognizedcharacterescapeWrite, 6);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                }
                String str = strIconCompatParcelizer;
                deserializeWithObjectId deserializewithobjectidAudioAttributesCompatParcelizer = TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                _copyCurrentStringValue.IconCompatParcelizer(str, _handleoddnameAudioAttributesCompatParcelizer2, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesCompatParcelizer, _handleunrecognizedcharacterescapeWrite, 0, 0, 65528);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(949865987);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            updatePositions.read(null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescapeWrite, 0, 13);
            if (AudioAttributesCompatParcelizer((parseDouble<? extends List<String>>) parsedouble).size() > 1) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-333600456);
                int iAudioAttributesCompatParcelizer = lambdadecodeBitmap1.AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer(inputAccessor7), AudioAttributesCompatParcelizer((parseDouble<? extends List<String>>) parsedouble).size(), "question_review_sheet", _handleunrecognizedcharacterescapeWrite, RendererCapabilities.MODE_SUPPORT_MASK);
                float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(8.0f);
                long j2 = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read();
                MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
                long onPrepareFromUri = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
                ChipGroupLayoutParams chipGroupLayoutParams2 = ChipGroupLayoutParams.AudioAttributesCompatParcelizer;
                final setSingleLine setsingleline5 = setsingleline4;
                final InputAccessor inputAccessor9 = inputAccessor;
                acceptsPaddingOnRead.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, (_handleOddName) null, j2, onPrepareFromUri, fIconCompatParcelizer, (getModuleData<? super List<_reportBase64UnexpectedPadding>, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) null, ChipGroupLayoutParams.read(), multiplyFft.AudioAttributesCompatParcelizer(-2134609356, true, new MagicModuleSubmissionRequestBody() { // from class: o.setDividerInsetStartResource
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return setDividerInsetEnd.RemoteActionCompatParcelizer(parsedouble, setsingleline5, topUserCompanion, onactivitypostcreatedIconCompatParcelizer, magicModuleSubmissionRequestBody, list2, inputAccessor7, inputAccessor9, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 14180352, 34);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-338735575);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(16.0f)), _handleunrecognizedcharacterescapeWrite, 6);
            _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.text_test_currently_attending, new Object[]{Integer.valueOf(iconCompatParcelizer2.AudioAttributesCompatParcelizer + 1)}, _handleunrecognizedcharacterescapeWrite, 6), isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.write()), 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesImplApi26Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescapeWrite, 48, 0, 65016);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescapeWrite, 6);
            _handleOddName _handleoddname5 = DrawerLayoutLayoutParams.read$default(drawerLayoutSavedState, isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
            withTypeHandler withtypehandlerWrite2 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode3 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname5);
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
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation2 = setDrawerElevation.INSTANCE;
            final setSingleLine setsingleline6 = setsingleline4;
            _handleoddname2 = _handleoddname4;
            getSupportLoaderManager.write(new getSupportFragmentManager.read(3), isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), onactivitypostcreatedIconCompatParcelizer, getParentFragment.write(assignParameter.IconCompatParcelizer(34.0f), assignParameter.IconCompatParcelizer(4.0f)), false, null, null, null, false, null, new getAnswerMap() { // from class: o.setExtended
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setDividerInsetEnd.RemoteActionCompatParcelizer(list, iconCompatParcelizer2, setsingleline6, getanswermap, getcreatedondatems, (startWakefulService) obj);
                }
            }, _handleunrecognizedcharacterescapeWrite, 3120, 0, AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
            boolean zAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(inputAccessor);
            RemoteActionCompatParcelizer remoteActionCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (remoteActionCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                inputAccessor3 = inputAccessor;
                remoteActionCompatParcelizerOnPause = new RemoteActionCompatParcelizer(inputAccessor3, null);
                _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescapeWrite;
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(remoteActionCompatParcelizerOnPause);
            } else {
                _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescapeWrite;
                inputAccessor3 = inputAccessor;
            }
            StreamReadException.IconCompatParcelizer(Boolean.valueOf(zAudioAttributesImplBaseParcelizer), (MagicModuleSubmissionRequestBody) remoteActionCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 0);
            if (AudioAttributesImplBaseParcelizer(inputAccessor3)) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1494852170);
                RemoteActionCompatParcelizer(setdrawerelevation2.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.AudioAttributesCompatParcelizer()), singleArgCreatorDefaultsToProperties.read(R.string.part_not_available, _handleunrecognizedcharacterescapeWrite, 6), Integer.valueOf(R.drawable.ic_info_revamp), _handleunrecognizedcharacterescapeWrite, RendererCapabilities.MODE_SUPPORT_MASK, 0);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1486199884);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            boolean zMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(inputAccessor2);
            write writeVarOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (writeVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                inputAccessor4 = inputAccessor2;
                writeVarOnPause = new write(inputAccessor4, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(writeVarOnPause);
            } else {
                inputAccessor4 = inputAccessor2;
            }
            StreamReadException.IconCompatParcelizer(Boolean.valueOf(zMediaBrowserCompatCustomActionResultReceiver), (MagicModuleSubmissionRequestBody) writeVarOnPause, _handleunrecognizedcharacterescapeWrite, 0);
            if (MediaBrowserCompatCustomActionResultReceiver(inputAccessor4)) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1495432149);
                RemoteActionCompatParcelizer(setdrawerelevation2.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.AudioAttributesCompatParcelizer()), singleArgCreatorDefaultsToProperties.read(R.string.testCannotSubmitMessage, _handleunrecognizedcharacterescapeWrite, 6), (Integer) null, _handleunrecognizedcharacterescapeWrite, 0, 4);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1486199884);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            _handleOddName _handleoddnameWrite = getParentFragment.write(addName.AudioAttributesCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null), (setsingleline6 == null || getDisplaySizeV16.RemoteActionCompatParcelizer(list2, setsingleline6)) ? 1.0f : 0.4f), assignParameter.IconCompatParcelizer(16.0f), assignParameter.IconCompatParcelizer(8.0f));
            withTypeHandler withtypehandlerWrite3 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode4 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler4 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer4 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameWrite);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer4 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer4);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandlerWrite3, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler4, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode4), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer4, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation3 = setDrawerElevation.INSTANCE;
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            getReturnTransition getreturntransitionWrite$default = getParentFragment.write$default(BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), 1, null);
            boolean z5 = (234881024 & i10) == 67108864;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list2);
            boolean z6 = i12 == 131072;
            boolean z7 = (i10 & 29360128) == 8388608;
            boolean z8 = (i7 & 112) == 32;
            Object objOnPause10 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (((z7 | z5 | zIconCompatParcelizer | z6) || z8) || objOnPause10 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                setsingleline3 = setsingleline6;
                final InputAccessor inputAccessor10 = inputAccessor4;
                objOnPause10 = new getCreatedOnDateMs() { // from class: o.setShrinkMotionSpec
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setDividerInsetEnd.write(setsingleline6, list2, getcreatedondatems, getanswermap2, getanswermap3, inputAccessor10);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause10);
            } else {
                setsingleline3 = setsingleline6;
            }
            getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause10;
            ChipGroupLayoutParams chipGroupLayoutParams3 = ChipGroupLayoutParams.AudioAttributesCompatParcelizer;
            CloseImageView.AudioAttributesCompatParcelizer(getcreatedondatems2, _handleoddnameRemoteActionCompatParcelizer$default2, false, null, null, null, null, null, getreturntransitionWrite$default, ChipGroupLayoutParams.RemoteActionCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 905969712, 252);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            setsingleline2 = setsingleline3;
        } else {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            _handleoddname2 = _handleoddname;
            setsingleline2 = setsingleline;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname6 = _handleoddname2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setExtendMotionSpecResource
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setDividerInsetEnd.read(_handleoddname6, z, j, list, i, getcreatedondatems, getanswermap, getanswermap2, setsingleline2, list2, magicModuleSubmissionRequestBody, getanswermap3, i2, i3, i4, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplBaseParcelizer(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaBrowserCompatCustomActionResultReceiver(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    private static final int AudioAttributesImplApi21Parcelizer(InputAccessor<Integer> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().intValue();
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ onActivityPostCreated AudioAttributesCompatParcelizer;
        private /* synthetic */ InputAccessor<Integer> read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                final onActivityPostCreated onactivitypostcreated = this.AudioAttributesCompatParcelizer;
                NewNumberOtpResendRequest newNumberOtpResendRequestIconCompatParcelizer = _qbuf.IconCompatParcelizer(new getCreatedOnDateMs() { // from class: o.ExtendedFloatingActionButtonExtendedFloatingActionButtonBehavior
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Integer.valueOf(setDividerInsetEnd.IconCompatParcelizer.RemoteActionCompatParcelizer(onactivitypostcreated));
                    }
                });
                final onActivityPostCreated onactivitypostcreated2 = this.AudioAttributesCompatParcelizer;
                final InputAccessor<Integer> inputAccessor = this.read;
                this.write = 1;
                if (newNumberOtpResendRequestIconCompatParcelizer.write(new getValidationToken() { // from class: o.setDividerInsetEnd.IconCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read();
                    }

                    private Object read() {
                        if (onactivitypostcreated2.AudioAttributesImplBaseParcelizer() != 0) {
                            setDividerInsetEnd.RemoteActionCompatParcelizer(inputAccessor, onactivitypostcreated2.AudioAttributesImplBaseParcelizer() / 30);
                            return getShowPopup.INSTANCE;
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final int RemoteActionCompatParcelizer(onActivityPostCreated onactivitypostcreated) {
            return onactivitypostcreated.AudioAttributesImplBaseParcelizer();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(onActivityPostCreated onactivitypostcreated, InputAccessor<Integer> inputAccessor, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = onactivitypostcreated;
            this.read = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ onActivityPostCreated RemoteActionCompatParcelizer;
        private /* synthetic */ MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (onActivityPostCreated.write$default(this.RemoteActionCompatParcelizer, this.read.AudioAttributesCompatParcelizer, 0, this, 2, null) == objIconCompatParcelizer) {
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
        AudioAttributesCompatParcelizer(onActivityPostCreated onactivitypostcreated, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = onactivitypostcreated;
            this.read = iconCompatParcelizer;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    private static final String IconCompatParcelizer(InputAccessor<String> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(parseDouble parsedouble, final setSingleLine setsingleline, final TopUserCompanion topUserCompanion, final onActivityPostCreated onactivitypostcreated, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final List list, final InputAccessor inputAccessor, final InputAccessor inputAccessor2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        boolean z = true;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-2134609356, i, -1, "com.marrow2.ui.test.testplay.ui.QuestionReviewBottomSheet.<anonymous>.<anonymous> (QuestionReviewBottomSheet.kt:141)");
            }
            int i2 = 0;
            for (Object obj : AudioAttributesCompatParcelizer((parseDouble<? extends List<String>>) parsedouble)) {
                if (i2 < 0) {
                    IntermediateLoginResponseBody.read();
                }
                final String str = (String) obj;
                boolean z2 = AudioAttributesImplApi21Parcelizer(inputAccessor) == i2 ? z : false;
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                long onPrepareFromUri = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                long onSetPlaybackSpeed = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed();
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setsingleline);
                boolean zRemoteActionCompatParcelizer = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i2);
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(topUserCompanion);
                boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(onactivitypostcreated);
                boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody);
                boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(list);
                Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                if ((zAudioAttributesCompatParcelizer | zRemoteActionCompatParcelizer | zIconCompatParcelizer | zAudioAttributesCompatParcelizer2 | zAudioAttributesCompatParcelizer3 | zIconCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    final int i3 = i2;
                    objOnPause = new getCreatedOnDateMs() { // from class: o.setDividerInsetStart
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return setDividerInsetEnd.AudioAttributesCompatParcelizer(setsingleline, i3, topUserCompanion, magicModuleSubmissionRequestBody, list, inputAccessor, onactivitypostcreated, inputAccessor2);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                }
                bindItem.AudioAttributesCompatParcelizer(z2, (getCreatedOnDateMs) objOnPause, null, false, multiplyFft.AudioAttributesCompatParcelizer(1241581184, z, new MagicModuleSubmissionRequestBody() { // from class: o.MaterialDividerItemDecoration
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj2, Object obj3) {
                        return setDividerInsetEnd.write(str, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                    }
                }, _handleunrecognizedcharacterescape, 54), null, null, onPrepareFromUri, onSetPlaybackSpeed, _handleunrecognizedcharacterescape, CpioConstants.C_ISBLK, 108);
                i2++;
                z = z;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1241581184, i, -1, "com.marrow2.ui.test.testplay.ui.QuestionReviewBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuestionReviewBottomSheet.kt:144)");
            }
            _copyCurrentStringValue.IconCompatParcelizer(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int IconCompatParcelizer;
        private /* synthetic */ onActivityPostCreated RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                onActivityPostCreated onactivitypostcreated = this.RemoteActionCompatParcelizer;
                int i2 = this.IconCompatParcelizer;
                this.write = 1;
                if (onActivityPostCreated.write$default(onactivitypostcreated, i2 * 30, 0, this, 2, null) == objIconCompatParcelizer) {
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
        read(onActivityPostCreated onactivitypostcreated, int i, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = onactivitypostcreated;
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setSingleLine setsingleline, int i, TopUserCompanion topUserCompanion, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, List list, InputAccessor inputAccessor, onActivityPostCreated onactivitypostcreated, InputAccessor inputAccessor2) {
        if (setsingleline == null) {
            RemoteActionCompatParcelizer((InputAccessor<Integer>) inputAccessor, i);
            C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new read(onactivitypostcreated, i, null), 3);
        } else if (AudioAttributesImplApi21Parcelizer(inputAccessor) != i) {
            magicModuleSubmissionRequestBody.invoke(list.get(i), AppMeasurementConditionalUserProperty.IconCompatParcelizer);
            read((InputAccessor<Boolean>) inputAccessor2, true);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final List list, final MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, final setSingleLine setsingleline, final getAnswerMap getanswermap, final getCreatedOnDateMs getcreatedondatems, startWakefulService startwakefulservice) {
        toMagicModuleMetaRepoModel.write(startwakefulservice, "");
        startWakefulService.IconCompatParcelizer$default(startwakefulservice, list.size(), null, null, null, multiplyFft.IconCompatParcelizer(-77131397, true, new getMagicModuleStat() { // from class: o.setExtendMotionSpec
            @Override // kotlin.getMagicModuleStat
            public final Object write(Object obj, Object obj2, Object obj3, Object obj4) {
                return setDividerInsetEnd.IconCompatParcelizer(list, iconCompatParcelizer, setsingleline, getanswermap, getcreatedondatems, (FragmentContainerView) obj, ((Integer) obj2).intValue(), (_handleUnrecognizedCharacterEscape) obj3, ((Integer) obj4).intValue());
            }
        }), 14, null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(List list, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, final setSingleLine setsingleline, final getAnswerMap getanswermap, final getCreatedOnDateMs getcreatedondatems, FragmentContainerView fragmentContainerView, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        int i3;
        toMagicModuleMetaRepoModel.write(fragmentContainerView, "");
        if ((i2 & 48) == 0) {
            i3 = i2 | (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i3 & 145) != 144, i3 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-77131397, i3, -1, "com.marrow2.ui.test.testplay.ui.QuestionReviewBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuestionReviewBottomSheet.kt:188)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer = getParentFragment.IconCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f));
            int read2 = ((setMoney) list.get(i)).getRead();
            boolean audioAttributesCompatParcelizer = ((setMoney) list.get(i)).getAudioAttributesCompatParcelizer();
            boolean iconCompatParcelizer2 = ((setMoney) list.get(i)).getIconCompatParcelizer();
            boolean z = ((setMoney) list.get(i)).getRead() == iconCompatParcelizer.AudioAttributesCompatParcelizer;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setsingleline);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap);
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getcreatedondatems);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | zAudioAttributesCompatParcelizer3) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.setAnimateShowBeforeLayout
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setDividerInsetEnd.AudioAttributesCompatParcelizer(setsingleline, getanswermap, getcreatedondatems, ((Integer) obj).intValue());
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            IconCompatParcelizer(_handleoddnameIconCompatParcelizer, read2 + 1, audioAttributesCompatParcelizer, iconCompatParcelizer2, z, (getAnswerMap<? super Integer, getShowPopup>) objOnPause, _handleunrecognizedcharacterescape, 6, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setSingleLine setsingleline, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, int i) {
        if (setsingleline != null) {
            i -= setsingleline.getRead();
        }
        getanswermap.invoke(Integer.valueOf(i));
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ InputAccessor<Boolean> RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (!setDividerInsetEnd.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer)) {
                    return getShowPopup.INSTANCE;
                }
                this.IconCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(4000L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            setDividerInsetEnd.read(this.RemoteActionCompatParcelizer, false);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(InputAccessor<Boolean> inputAccessor, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ InputAccessor<Boolean> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (!setDividerInsetEnd.MediaBrowserCompatCustomActionResultReceiver(this.write)) {
                    return getShowPopup.INSTANCE;
                }
                this.AudioAttributesCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(4000L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            setDividerInsetEnd.RemoteActionCompatParcelizer(this.write, false);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(InputAccessor<Boolean> inputAccessor, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.write = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(setSingleLine setsingleline, List list, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, getAnswerMap getanswermap2, InputAccessor inputAccessor) {
        if (setsingleline == null || getDisplaySizeV16.RemoteActionCompatParcelizer((List<setSingleLine>) list, setsingleline)) {
            getcreatedondatems.invoke();
            getanswermap.invoke(AppMeasurementDynamiteService.IconCompatParcelizer);
        } else {
            getanswermap2.invoke("review_test_sheet");
            RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor, true);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(final kotlin._handleOddName r18, final java.lang.String r19, java.lang.Integer r20, kotlin._handleUnrecognizedCharacterEscape r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setDividerInsetEnd.RemoteActionCompatParcelizer(o._handleOddName, java.lang.String, java.lang.Integer, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(Integer num, String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1869601562, i, -1, "com.marrow2.ui.test.testplay.ui.ShowCustomToast.<anonymous> (QuestionReviewBottomSheet.kt:260)");
            }
            _handleOddName _handleoddnameWrite = getParentFragment.write(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f), assignParameter.IconCompatParcelizer(16.0f));
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), _handleunrecognizedcharacterescape, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            if (num == null) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(444774315);
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(444774316);
                isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(num.intValue(), _handleunrecognizedcharacterescape, 0);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                value.read(isannotationbundleRemoteActionCompatParcelizer, null, getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(4.0f), assignParameter.IconCompatParcelizer(10.0f), BitmapDescriptorFactory.HUE_RED, 9, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getPlaybackStateCompat(), _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 0);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str, getParentFragment.write$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getPlaybackStateCompat(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 48, 0, 65528);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static void IconCompatParcelizer(_handleOddName _handleoddname, final int i, final boolean z, final boolean z2, final boolean z3, final getAnswerMap<? super Integer, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2, final int i3) {
        _handleOddName _handleoddname2;
        int i4;
        _handleOddName _handleoddname3;
        long jMediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(136179382);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i2 & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i4 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i2;
        } else {
            _handleoddname2 = _handleoddname;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((74899 & i4) != 74898, i4 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleoddname3 = i5 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(136179382, i4, -1, "com.marrow2.ui.test.testplay.ui.AnswerSingleGridLayout (QuestionReviewBottomSheet.kt:285)");
            }
            if (z3) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2019378627);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                jMediaBrowserCompatSearchResultReceiver = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
            } else if (z2) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2019380293);
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                jMediaBrowserCompatSearchResultReceiver = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromSearch();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2019381629);
                jMediaBrowserCompatSearchResultReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver();
            }
            long j = jMediaBrowserCompatSearchResultReceiver;
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            boolean z4 = (458752 & i4) == 131072;
            boolean z5 = (i4 & 112) == 32;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z4 | z5) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.setCompatElevation
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setDividerInsetEnd.read(getanswermap, i);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            setOnAnimationStop.RemoteActionCompatParcelizer((getCreatedOnDateMs) objOnPause, _handleoddname3, false, null, j, 0L, null, BitmapDescriptorFactory.HUE_RED, null, multiplyFft.AudioAttributesCompatParcelizer(1467669776, true, new MagicModuleSubmissionRequestBody() { // from class: o.FloatingActionButton
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setDividerInsetEnd.write(z, z3, i, z2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, ((i4 << 3) & 112) | C.ENCODING_PCM_32BIT, 492);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname4 = _handleoddname3;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setDividerColorResource
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setDividerInsetEnd.write(_handleoddname4, i, z, z2, z3, getanswermap, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getAnswerMap getanswermap, int i) {
        getanswermap.invoke(Integer.valueOf(i - 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(boolean z, boolean z2, int i, boolean z3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        long jMediaBrowserCompatItemReceiver;
        long onRewind;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1467669776, i2, -1, "com.marrow2.ui.test.testplay.ui.AnswerSingleGridLayout.<anonymous> (QuestionReviewBottomSheet.kt:292)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer = getParentFragment.IconCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(16.0f));
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.read(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescape, 54);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameIconCompatParcelizer);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            if (z) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-807178047);
                _handleOddName _handleoddnameAudioAttributesImplBaseParcelizer = isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(16.0f));
                isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.star, _handleunrecognizedcharacterescape, 6);
                if (z2) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-1550050660);
                    MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                    onRewind = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward();
                } else {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-1550049350);
                    MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                    onRewind = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnRewind();
                }
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                value.read(isannotationbundleRemoteActionCompatParcelizer, null, _handleoddnameAudioAttributesImplBaseParcelizer, onRewind, _handleunrecognizedcharacterescape, isAnnotationBundle.read | 432, 0);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape, 6);
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-819141226);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            deserializeWithObjectId audioAttributesCompatParcelizer = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).getAudioAttributesCompatParcelizer();
            if (z2) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1550040228);
                MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
                jMediaBrowserCompatItemReceiver = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward();
            } else if (z3) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1550038479);
                MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
                jMediaBrowserCompatItemReceiver = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getMediaSessionCompatResultReceiverWrapper();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1550037451);
                jMediaBrowserCompatItemReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver();
            }
            long j = jMediaBrowserCompatItemReceiver;
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            _copyCurrentStringValue.IconCompatParcelizer(String.valueOf(i), null, j, 0L, null, null, null, 0L, null, null, 0L, paramName.INSTANCE.IconCompatParcelizer(), false, 1, 0, null, audioAttributesCompatParcelizer, _handleunrecognizedcharacterescape, 0, 3120, 55290);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(InputAccessor<Integer> inputAccessor, int i) {
        inputAccessor.write(Integer.valueOf(i));
    }

    private static final List<String> AudioAttributesCompatParcelizer(parseDouble<? extends List<String>> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleOddName _handleoddname, int i, boolean z, boolean z2, boolean z3, getAnswerMap getanswermap, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(_handleoddname, i, z, z2, z3, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, boolean z, long j, List list, int i, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, getAnswerMap getanswermap2, setSingleLine setsingleline, List list2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getAnswerMap getanswermap3, int i2, int i3, int i4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(_handleoddname, z, j, (List<setMoney>) list, i, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, (getAnswerMap<? super AppMeasurementDynamiteService, getShowPopup>) getanswermap2, setsingleline, (List<setSingleLine>) list2, (MagicModuleSubmissionRequestBody<? super setSingleLine, ? super AppMeasurementConditionalUserProperty, getShowPopup>) magicModuleSubmissionRequestBody, (getAnswerMap<? super String, getShowPopup>) getanswermap3, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), _appendEscaped.RemoteActionCompatParcelizer(i3), i4);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, String str, Integer num, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(_handleoddname, str, num, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
