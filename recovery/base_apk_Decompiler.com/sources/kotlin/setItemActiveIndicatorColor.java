package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.concurrent.TimeUnit;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class setItemActiveIndicatorColor {
    /* JADX WARN: Removed duplicated region for block: B:194:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void read(kotlin._handleOddName r45, final int r46, final int r47, final long r48, final boolean r50, final int r51, kotlin.setSingleLine r52, final int r53, final int r54, kotlin._handleUnrecognizedCharacterEscape r55, final int r56, final int r57) {
        /*
            Method dump skipped, instruction units count: 1943
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setItemActiveIndicatorColor.read(o._handleOddName, int, int, long, boolean, int, o.setSingleLine, int, int, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplApi21Parcelizer(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    private static final int MediaBrowserCompatItemReceiver(InputAccessor<Integer> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaMetadataCompat(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ InputAccessor<Boolean> read;
        private /* synthetic */ InputAccessor<Integer> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (setItemActiveIndicatorColor.AudioAttributesImplApi21Parcelizer(this.read)) {
                    this.RemoteActionCompatParcelizer = 1;
                    if (setCountry.IconCompatParcelizer(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
                return getShowPopup.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            setItemActiveIndicatorColor.AudioAttributesCompatParcelizer(this.write, -1);
            setItemActiveIndicatorColor.RemoteActionCompatParcelizer(this.read, false);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(InputAccessor<Boolean> inputAccessor, InputAccessor<Integer> inputAccessor2, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.read = inputAccessor;
            this.write = inputAccessor2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.read, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ InputAccessor<Boolean> AudioAttributesCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (setItemActiveIndicatorColor.MediaMetadataCompat(this.AudioAttributesCompatParcelizer)) {
                    this.write = 1;
                    if (setCountry.IconCompatParcelizer(4000L, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
                return getShowPopup.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            setItemActiveIndicatorColor.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, false);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(InputAccessor<Boolean> inputAccessor, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(InputAccessor inputAccessor) {
        AudioAttributesCompatParcelizer((InputAccessor<Boolean>) inputAccessor, true);
        return getShowPopup.INSTANCE;
    }

    private static final String MediaBrowserCompatCustomActionResultReceiver(InputAccessor<String> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(InputAccessor inputAccessor, setSupportImageTintMode setsupportimagetintmode, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(setsupportimagetintmode, "");
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-226632084, i, -1, "com.marrow2.ui.test.testplay.ui.TestProgressLayout.<anonymous>.<anonymous> (TestProgressLayout.kt:187)");
        }
        _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
        MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
        _handleOddName _handleoddnameIconCompatParcelizer = getParentFragment.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer$default, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getMediaBrowserCompatMediaItem(), null, 2, null), assignParameter.IconCompatParcelizer(20.0f));
        int iWrite = assignIndexes.INSTANCE.write();
        _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.auto_submit_messsage, new Object[]{Integer.valueOf(MediaBrowserCompatItemReceiver(inputAccessor))}, _handleunrecognizedcharacterescape, 6), _handleoddnameIconCompatParcelizer, enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, assignIndexes.write(iWrite), 0L, 0, false, 0, 0, null, TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 0, 65016);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    private static void IconCompatParcelizer(final setSingleLine setsingleline, final int i, final int i2, final int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i4) {
        int i5;
        toMagicModuleMetaRepoModel.write(setsingleline, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1123671633);
        if ((i4 & 6) == 0) {
            i5 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setsingleline) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 32 : 16;
        }
        if ((i4 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i3) ? 2048 : 1024;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i5 & 1171) != 1170, i5 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1123671633, i5, -1, "com.marrow2.ui.test.testplay.ui.GroupDetailTooltip (TestProgressLayout.kt:207)");
            }
            bufferMapProperty buffermapproperty = (bufferMapProperty) _handleunrecognizedcharacterescapeWrite.write(getDefaultNullValueSerializer.IconCompatParcelizer());
            Pair pair = new Pair(Float.valueOf(buffermapproperty.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(20.0f))), Float.valueOf(buffermapproperty.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(40.0f))));
            float fFloatValue = ((Number) pair.RemoteActionCompatParcelizer()).floatValue();
            int iFloatValue = (int) ((Number) pair.read()).floatValue();
            long j = -1;
            popOrNull.AudioAttributesCompatParcelizer(null, hasReferringProperties.read((((long) ((int) fFloatValue)) << 32) | (((long) iFloatValue) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))), null, null, multiplyFft.AudioAttributesCompatParcelizer(-384275796, true, new MagicModuleSubmissionRequestBody() { // from class: o.setItemActiveIndicatorMarginHorizontal
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setItemActiveIndicatorColor.IconCompatParcelizer(i, i3, i2, setsingleline, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, CpioConstants.C_ISBLK, 13);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setItemActiveIndicatorEnabled
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setItemActiveIndicatorColor.RemoteActionCompatParcelizer(setsingleline, i, i2, i3, i4, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(final int i, final int i2, final int i3, final setSingleLine setsingleline, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i4) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i4 & 3) != 2, i4 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-384275796, i4, -1, "com.marrow2.ui.test.testplay.ui.GroupDetailTooltip.<anonymous> (TestProgressLayout.kt:212)");
            }
            _handleOddName _handleoddnameAudioAttributesImplApi26Parcelizer = isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(252.0f));
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameAudioAttributesImplApi26Parcelizer);
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
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            long j = -1;
            VideoRendererEventListenerEventDispatcherExternalSyntheticLambda0.AudioAttributesCompatParcelizer(_writeString.RemoteActionCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), BitmapDescriptorFactory.HUE_RED), assignParameter.IconCompatParcelizer(14.0f), 0L, getReferencedType.AudioAttributesCompatParcelizer((((j - ((j >> 63) << 32)) | (((long) 0) << 32)) & ((long) Float.floatToRawIntBits(10.0f))) | (((long) Float.floatToRawIntBits(-56.0f)) << 32)), _handleunrecognizedcharacterescape, 54, 4);
            Nulls.AudioAttributesCompatParcelizer(null, setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f)), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), 0L, null, BitmapDescriptorFactory.HUE_RED, multiplyFft.AudioAttributesCompatParcelizer(889980474, true, new MagicModuleSubmissionRequestBody() { // from class: o.setItemActiveIndicatorShapeAppearance
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setItemActiveIndicatorColor.AudioAttributesCompatParcelizer(i, i2, i3, setsingleline, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 1572864, 57);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(int i, int i2, int i3, setSingleLine setsingleline, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i4) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i4 & 3) != 2, i4 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(889980474, i4, -1, "com.marrow2.ui.test.testplay.ui.GroupDetailTooltip.<anonymous>.<anonymous>.<anonymous> (TestProgressLayout.kt:227)");
            }
            _handleOddName _handleoddnameWrite = getParentFragment.write(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(20.0f), assignParameter.IconCompatParcelizer(16.0f));
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.read(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 6);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            String strRemoteActionCompatParcelizer = singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.part_test_detail, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(TimeUnit.SECONDS.toMinutes(setsingleline.getAudioAttributesCompatParcelizer()))}, _handleunrecognizedcharacterescape, 6);
            deserializeWithObjectId deserializewithobjectidAudioAttributesCompatParcelizer = TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            int iAudioAttributesImplBaseParcelizer = assignIndexes.INSTANCE.AudioAttributesImplBaseParcelizer();
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(strRemoteActionCompatParcelizer, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, assignIndexes.write(iAudioAttributesImplBaseParcelizer), 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesCompatParcelizer, _handleunrecognizedcharacterescape, 0, 0, 65018);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(InputAccessor<Integer> inputAccessor, int i) {
        inputAccessor.write(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(setSingleLine setsingleline, int i, int i2, int i3, int i4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(setsingleline, i, i2, i3, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i4 | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, int i, int i2, long j, boolean z, int i3, setSingleLine setsingleline, int i4, int i5, int i6, int i7, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(_handleoddname, i, i2, j, z, i3, setsingleline, i4, i5, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i6 | 1), i7);
        return getShowPopup.INSTANCE;
    }
}
