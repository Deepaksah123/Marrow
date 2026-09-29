package kotlin;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.TypeKt;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes3.dex */
public final class StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8 {
    public static final void AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final List<Character> list, final getAnswerMap<? super Character, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname3;
        InputAccessor inputAccessor;
        boolean z;
        int i4;
        final InputAccessor inputAccessor2;
        final InputAccessor inputAccessor3;
        _handleOddName _handleoddname4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1067692494);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i;
        } else {
            _handleoddname2 = _handleoddname;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 256 : 128;
        }
        int i6 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i6 & 147) != 146, i6 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            if (i5 != 0) {
                _handleoddname2 = _handleOddName.INSTANCE;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1067692494, i6, -1, "com.marrow2.core.common_composables.AlphabetScrollBarLayout (AlphabetScrollBarLayout.kt:42)");
            }
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = available.RemoteActionCompatParcelizer$default(Float.valueOf(BitmapDescriptorFactory.HUE_RED), null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            InputAccessor inputAccessor4 = (InputAccessor) objOnPause;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = available.RemoteActionCompatParcelizer$default(-1, null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            InputAccessor inputAccessor5 = (InputAccessor) objOnPause2;
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = available.RemoteActionCompatParcelizer$default("", null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            final InputAccessor inputAccessor6 = (InputAccessor) objOnPause3;
            String strIconCompatParcelizer = IconCompatParcelizer(inputAccessor6);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (audioAttributesCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                audioAttributesCompatParcelizerOnPause = new AudioAttributesCompatParcelizer(inputAccessor6, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerOnPause);
            }
            StreamReadException.IconCompatParcelizer(strIconCompatParcelizer, (MagicModuleSubmissionRequestBody) audioAttributesCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 0);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname2);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            final setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            if (IconCompatParcelizer(inputAccessor6).length() <= 0) {
                inputAccessor = inputAccessor6;
                z = true;
                i4 = i6;
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(430565274);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(432821795);
                ((depositSchemaProperty) _handleunrecognizedcharacterescapeWrite.write(getDefaultNullValueSerializer.MediaBrowserCompatItemReceiver())).AudioAttributesCompatParcelizer(isNonStaticInnerClass.INSTANCE.AudioAttributesImplApi21Parcelizer());
                inputAccessor = inputAccessor6;
                z = true;
                i4 = i6;
                setOnAnimationStop.read(isAdded.AudioAttributesImplBaseParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(setdrawerelevation.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.MediaMetadataCompat()), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(26.0f), BitmapDescriptorFactory.HUE_RED, 11, null), assignParameter.IconCompatParcelizer(40.0f)), null, enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(), 0L, null, assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED), multiplyFft.AudioAttributesCompatParcelizer(-344459702, true, new MagicModuleSubmissionRequestBody() { // from class: o.StyledPlayerControlViewLayoutManagerExternalSyntheticLambda6
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.IconCompatParcelizer(setdrawerelevation, inputAccessor6, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 1769472, 26);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(setdrawerelevation.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.MediaMetadataCompat()), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(6.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list);
            int i7 = i4 & 896;
            boolean z2 = i7 == 256 ? z : false;
            RemoteActionCompatParcelizer remoteActionCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zIconCompatParcelizer || z2) || remoteActionCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                inputAccessor2 = inputAccessor;
                inputAccessor3 = inputAccessor4;
                _handleoddname4 = _handleoddname2;
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescapeWrite;
                remoteActionCompatParcelizerOnPause = new RemoteActionCompatParcelizer(list, getanswermap, inputAccessor3, inputAccessor5, inputAccessor2);
                _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(remoteActionCompatParcelizerOnPause);
            } else {
                inputAccessor3 = inputAccessor4;
                _handleoddname4 = _handleoddname2;
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescapeWrite;
                inputAccessor2 = inputAccessor;
            }
            _handleOddName _handleoddnameIconCompatParcelizer = hasSomeOfFeatures.IconCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer$default, getshowpopup, (PointerInputEventHandler) remoteActionCompatParcelizerOnPause);
            Object objOnPause4 = _handleunrecognizedcharacterescape3.onPause();
            if (objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getAnswerMap() { // from class: o.StyledPlayerControlViewLayoutManagerExternalSyntheticLambda7
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.IconCompatParcelizer(inputAccessor3, (isAbstract) obj);
                    }
                };
                _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(objOnPause4);
            }
            _handleOddName _handleoddnameWrite = getNullAccessPattern.write(_handleoddnameIconCompatParcelizer, (getAnswerMap) objOnPause4);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape3, 0);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape3.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, _handleoddnameWrite);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape3.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape3.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape3.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape3.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescape3.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescape3);
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleunrecognizedcharacterescape3.IconCompatParcelizer(-1478705433);
            int i8 = 0;
            for (Object obj : list) {
                if (i8 < 0) {
                    IntermediateLoginResponseBody.read();
                }
                final char cCharValue = ((Character) obj).charValue();
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                boolean z3 = i7 == 256 ? z : false;
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape3.AudioAttributesCompatParcelizer(cCharValue);
                Object objOnPause5 = _handleunrecognizedcharacterescape3.onPause();
                if ((z3 | zAudioAttributesCompatParcelizer) || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause5 = new getCreatedOnDateMs() { // from class: o.StyledPlayerControlViewLayoutManagerExternalSyntheticLambda9
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.write(getanswermap, cCharValue, inputAccessor2);
                        }
                    };
                    _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(objOnPause5);
                }
                _handleOddName _handleoddnameWrite$default = getParentFragment.write$default(getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(companion, false, null, null, null, (getCreatedOnDateMs) objOnPause5, 15, null), assignParameter.IconCompatParcelizer(4.0f), BitmapDescriptorFactory.HUE_RED, 2, null);
                deserializeWithObjectId deserializewithobjectidAudioAttributesImplBaseParcelizer = TypeKt.AudioAttributesImplBaseParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer));
                long jAudioAttributesImplApi26Parcelizer = enabled.INSTANCE.write(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer();
                String strValueOf = String.valueOf(cCharValue);
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape6 = _handleunrecognizedcharacterescape3;
                _copyCurrentStringValue.IconCompatParcelizer(strValueOf, _handleoddnameWrite$default, jAudioAttributesImplApi26Parcelizer, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesImplBaseParcelizer, _handleunrecognizedcharacterescape6, 0, 0, 65528);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f)), _handleunrecognizedcharacterescape6, 6);
                i8++;
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescape6;
                inputAccessor2 = inputAccessor2;
                i7 = i7;
            }
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape3;
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname3 = _handleoddname4;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.StyledPlayerControlViewLayoutManager1
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.AudioAttributesCompatParcelizer(_handleoddname3, list, getanswermap, i, i2, (_handleUnrecognizedCharacterEscape) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AudioAttributesCompatParcelizer(InputAccessor<Float> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(InputAccessor<Integer> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().intValue();
    }

    private static final String IconCompatParcelizer(InputAccessor<String> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ InputAccessor<String> AudioAttributesCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (setCountry.IconCompatParcelizer(200L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, "");
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(InputAccessor<String> inputAccessor, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(writeReplace writereplace, InputAccessor inputAccessor, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-344459702, i, -1, "com.marrow2.core.common_composables.AlphabetScrollBarLayout.<anonymous>.<anonymous> (AlphabetScrollBarLayout.kt:73)");
            }
            _copyCurrentStringValue.IconCompatParcelizer(IconCompatParcelizer(inputAccessor), writereplace.AudioAttributesCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(6.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer()), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.write()), 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).getRemoteActionCompatParcelizer(), _handleunrecognizedcharacterescape, 0, 0, 65016);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer implements PointerInputEventHandler {
        private /* synthetic */ InputAccessor<String> AudioAttributesCompatParcelizer;
        private /* synthetic */ getAnswerMap<Character, getShowPopup> IconCompatParcelizer;
        private /* synthetic */ List<Character> RemoteActionCompatParcelizer;
        private /* synthetic */ InputAccessor<Integer> read;
        private /* synthetic */ InputAccessor<Float> write;

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(final handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            List<Character> list = this.RemoteActionCompatParcelizer;
            if (list == null || list.isEmpty()) {
                return getShowPopup.INSTANCE;
            }
            final MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer();
            final int onCustomAction = ((int) handlebadmerge.getOnCustomAction()) / this.RemoteActionCompatParcelizer.size();
            getAnswerMap getanswermap = new getAnswerMap() { // from class: o.onAnimationEnd
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.RemoteActionCompatParcelizer.IconCompatParcelizer(remoteActionCompatParcelizer, (getReferencedType) obj);
                }
            };
            getCreatedOnDateMs getcreatedondatems = new getCreatedOnDateMs() { // from class: o.StyledPlayerControlViewLayoutManager3
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.RemoteActionCompatParcelizer.write(remoteActionCompatParcelizer);
                }
            };
            final List<Character> list2 = this.RemoteActionCompatParcelizer;
            final getAnswerMap<Character, getShowPopup> getanswermap2 = this.IconCompatParcelizer;
            final InputAccessor<Float> inputAccessor = this.write;
            final InputAccessor<Integer> inputAccessor2 = this.read;
            final InputAccessor<String> inputAccessor3 = this.AudioAttributesCompatParcelizer;
            Object objRemoteActionCompatParcelizer$default = setConstraintSet.RemoteActionCompatParcelizer$default(handlebadmerge, getanswermap, getcreatedondatems, null, new MagicModuleSubmissionRequestBody() { // from class: o.onAnimationStart
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, list2, handlebadmerge, onCustomAction, getanswermap2, inputAccessor, inputAccessor2, inputAccessor3, (getArrayBuilders) obj, ((Float) obj2).floatValue());
                }
            }, sampleVideos, 4, null);
            return objRemoteActionCompatParcelizer$default == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer$default : getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup IconCompatParcelizer(MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getReferencedType getreferencedtype) {
            remoteActionCompatParcelizer.read = Float.intBitsToFloat((int) getreferencedtype.getWrite());
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup write(MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            remoteActionCompatParcelizer.read = BitmapDescriptorFactory.HUE_RED;
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer, List list, handleBadMerge handlebadmerge, int i, getAnswerMap getanswermap, InputAccessor inputAccessor, InputAccessor inputAccessor2, InputAccessor inputAccessor3, getArrayBuilders getarraybuilders, float f) {
            int iRemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(getarraybuilders, "");
            bufferAsCopyOfValue.IconCompatParcelizer(getarraybuilders);
            remoteActionCompatParcelizer.read += f;
            int size = list.size() - 1;
            if (((int) handlebadmerge.getOnCustomAction()) + StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.AudioAttributesCompatParcelizer(inputAccessor) >= Float.intBitsToFloat((int) getarraybuilders.getRead())) {
                if (StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.AudioAttributesCompatParcelizer(inputAccessor) > Float.intBitsToFloat((int) getarraybuilders.getRead()) || (iRemoteActionCompatParcelizer = getOnline.RemoteActionCompatParcelizer((remoteActionCompatParcelizer.read - StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.AudioAttributesCompatParcelizer(inputAccessor)) / i)) < 0) {
                    size = 0;
                } else if (iRemoteActionCompatParcelizer <= size) {
                    size = iRemoteActionCompatParcelizer;
                }
            }
            StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.read(inputAccessor2, size);
            char cCharValue = ((Character) list.get(StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.RemoteActionCompatParcelizer(inputAccessor2))).charValue();
            getanswermap.invoke(Character.valueOf(cCharValue));
            StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.IconCompatParcelizer((InputAccessor<String>) inputAccessor3, String.valueOf(cCharValue));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(List<Character> list, getAnswerMap<? super Character, getShowPopup> getanswermap, InputAccessor<Float> inputAccessor, InputAccessor<Integer> inputAccessor2, InputAccessor<String> inputAccessor3) {
            this.RemoteActionCompatParcelizer = list;
            this.IconCompatParcelizer = getanswermap;
            this.write = inputAccessor;
            this.read = inputAccessor2;
            this.AudioAttributesCompatParcelizer = inputAccessor3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(InputAccessor inputAccessor, isAbstract isabstract) {
        toMagicModuleMetaRepoModel.write(isabstract, "");
        isAbstract isabstractRemoteActionCompatParcelizer = isabstract.RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(inputAccessor, isabstractRemoteActionCompatParcelizer != null ? Float.intBitsToFloat((int) hasRawClass.read(isabstractRemoteActionCompatParcelizer)) : BitmapDescriptorFactory.HUE_RED);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getAnswerMap getanswermap, char c, InputAccessor inputAccessor) {
        getanswermap.invoke(Character.valueOf(c));
        IconCompatParcelizer((InputAccessor<String>) inputAccessor, String.valueOf(c));
        return getShowPopup.INSTANCE;
    }

    private static final void RemoteActionCompatParcelizer(InputAccessor<Float> inputAccessor, float f) {
        inputAccessor.write(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(InputAccessor<Integer> inputAccessor, int i) {
        inputAccessor.write(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(InputAccessor<String> inputAccessor, String str) {
        inputAccessor.write(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, List list, getAnswerMap getanswermap, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, (List<Character>) list, (getAnswerMap<? super Character, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
