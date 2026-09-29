package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.List;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class setActiveIndicatorWidth {
    public static final void AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final List<String> list, final Integer num, final getAnswerMap<? super Integer, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleOddName _handleoddname3;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-373253908);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(num) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 16384 : 8192;
        }
        int i5 = i3;
        boolean z = false;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i5 & 9363) != 9362, i5 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleOddName _handleoddname4 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-373253908, i5, -1, "com.marrow2.ui.test.testplay.ui.McqTestOptionsLayout (TestOption.kt:28)");
            }
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname4);
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
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(272622439);
            int size = list.size();
            int i6 = 0;
            while (i6 < size) {
                if (i6 != 0) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2081322639);
                    isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(12.0f)), _handleunrecognizedcharacterescapeWrite, 6);
                } else {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(95350300);
                }
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                int i7 = i6 + 1;
                read((_handleOddName) null, i7, list.get(i6), (num == null || num.intValue() != i7) ? z : true, getanswermap, getcreatedondatems, _handleunrecognizedcharacterescapeWrite, (i5 << 3) & 516096, 1);
                i5 = i5;
                i6 = i7;
                _handleoddname4 = _handleoddname4;
                z = z;
            }
            _handleoddname3 = _handleoddname4;
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname5 = _handleoddname3;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setIconTintList
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setActiveIndicatorWidth.AudioAttributesCompatParcelizer(_handleoddname5, list, num, getanswermap, getcreatedondatems, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    private static void read(_handleOddName _handleoddname, final int i, final String str, final boolean z, final getAnswerMap<? super Integer, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2, final int i3) {
        _handleOddName _handleoddname2;
        int i4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        long jMediaBrowserCompatSearchResultReceiver;
        final InputAccessor inputAccessor;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1230707072);
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
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((74899 & i4) != 74898, i4 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            _handleOddName _handleoddname3 = i5 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1230707072, i4, -1, "com.marrow2.ui.test.testplay.ui.McqTestOption (TestOption.kt:53)");
            }
            int i6 = i4 & 112;
            boolean z2 = i6 == 32;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z2 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = available.RemoteActionCompatParcelizer$default(Character.valueOf(isAccessibilityFocused.write(i - 1)), null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            InputAccessor inputAccessor2 = (InputAccessor) objOnPause;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = available.RemoteActionCompatParcelizer$default(0L, null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            final InputAccessor inputAccessor3 = (InputAccessor) objOnPause2;
            if (z) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1593473262);
                jMediaBrowserCompatSearchResultReceiver = switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(), 0.3f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1593471833);
                jMediaBrowserCompatSearchResultReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver();
            }
            long j = jMediaBrowserCompatSearchResultReceiver;
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            setShowFastForwardButton setshowfastforwardbuttonRemoteActionCompatParcelizer = setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f));
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleoddname3, BitmapDescriptorFactory.HUE_RED, 1, null);
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = isConsumed.RemoteActionCompatParcelizer();
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            hashCode hashcode = (hashCode) objOnPause3;
            boolean z3 = (i4 & 7168) == 2048;
            boolean z4 = (458752 & i4) == 131072;
            boolean z5 = (i4 & 57344) == 16384;
            boolean z6 = i6 == 32;
            Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (((z3 | z4 | z5) || z6) || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                inputAccessor = inputAccessor2;
                getCreatedOnDateMs getcreatedondatems2 = new getCreatedOnDateMs() { // from class: o.setItemPaddingTop
                    private /* synthetic */ long AudioAttributesCompatParcelizer = 300;

                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setActiveIndicatorWidth.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, z, getcreatedondatems, getanswermap, i, inputAccessor3);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((Object) getcreatedondatems2);
                objOnPause4 = getcreatedondatems2;
            } else {
                inputAccessor = inputAccessor2;
            }
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleoddname2 = _handleoddname3;
            Nulls.AudioAttributesCompatParcelizer(getLocalSavedStateRegistryOwner.IconCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer$default, hashcode, null, false, null, null, (getCreatedOnDateMs) objOnPause4, 28, null), setshowfastforwardbuttonRemoteActionCompatParcelizer, j, 0L, null, BitmapDescriptorFactory.HUE_RED, multiplyFft.AudioAttributesCompatParcelizer(1036175548, true, new MagicModuleSubmissionRequestBody() { // from class: o.setItemRippleColor
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setActiveIndicatorWidth.IconCompatParcelizer(str, inputAccessor, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescape2, 1572864, 56);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        final _handleOddName _handleoddname4 = _handleoddname2;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setItemPaddingBottom
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setActiveIndicatorWidth.read(_handleoddname4, i, str, z, getanswermap, getcreatedondatems, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    private static final char RemoteActionCompatParcelizer(InputAccessor<Character> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().charValue();
    }

    private static final long AudioAttributesCompatParcelizer(InputAccessor<Long> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(long j, boolean z, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, int i, InputAccessor inputAccessor) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - AudioAttributesCompatParcelizer(inputAccessor) < j) {
            return getShowPopup.INSTANCE;
        }
        RemoteActionCompatParcelizer(inputAccessor, jCurrentTimeMillis);
        if (z) {
            getcreatedondatems.invoke();
        } else {
            getanswermap.invoke(Integer.valueOf(i));
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(String str, InputAccessor inputAccessor, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1036175548, i, -1, "com.marrow2.ui.test.testplay.ui.McqTestOption.<anonymous> (TestOption.kt:80)");
            }
            _handleOddName _handleoddnameWrite = getParentFragment.write(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(12.0f), assignParameter.IconCompatParcelizer(20.0f));
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescape, 48);
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
            char cRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(inputAccessor);
            StringBuilder sb = new StringBuilder();
            sb.append(cRemoteActionCompatParcelizer);
            sb.append(")");
            String string = sb.toString();
            deserializeWithObjectId deserializewithobjectidAudioAttributesCompatParcelizer = TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(string, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesCompatParcelizer, _handleunrecognizedcharacterescape, 0, 0, 65530);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape, 6);
            _copyCurrentStringValue.IconCompatParcelizer(str, null, enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).getMediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescape, 0, 0, 65530);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final void RemoteActionCompatParcelizer(InputAccessor<Long> inputAccessor, long j) {
        inputAccessor.write(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, int i, String str, boolean z, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(_handleoddname, i, str, z, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, List list, Integer num, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, (List<String>) list, num, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
