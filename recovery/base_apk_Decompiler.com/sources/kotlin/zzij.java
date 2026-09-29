package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzij {

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[onDisplayInfoChanged.values().length];
            try {
                iArr[onDisplayInfoChanged.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onDisplayInfoChanged.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onDisplayInfoChanged.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onDisplayInfoChanged.write.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public static final void RemoteActionCompatParcelizer(_handleOddName _handleoddname, final onDisplayInfoChanged ondisplayinfochanged, final String str, final boolean z, final MagicModuleSubmissionRequestBody<? super onDisplayInfoChanged, ? super String, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(676800954);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(ondisplayinfochanged.ordinal()) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 16384 : 8192;
        }
        int i5 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i5 & 9363) != 9362, i5 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            _handleOddName _handleoddname3 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(676800954, i5, -1, "com.marrow2.ui.review_components.ui.misc.BookmarkTooltip (BookmarkTooltip.kt:37)");
            }
            _buildPath.write(_compare.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescapeWrite, _compare.write << 3, 1), multiplyFft.AudioAttributesCompatParcelizer(-696111771, true, new getModuleData() { // from class: o.zzio
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return zzij.IconCompatParcelizer(magicModuleSubmissionRequestBody, str, (getMatchingIndex) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _buildPath.read(false, false, null, _handleunrecognizedcharacterescapeWrite, 0, 7), _handleoddname3, null, false, false, false, multiplyFft.AudioAttributesCompatParcelizer(-1105129091, true, new MagicModuleSubmissionRequestBody() { // from class: o.zzin
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzij.RemoteActionCompatParcelizer(ondisplayinfochanged, z, magicModuleSubmissionRequestBody, str, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, ((i5 << 9) & 7168) | 100663344, PsExtractor.VIDEO_STREAM_MASK);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname3;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname4 = _handleoddname2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzis
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzij.read(_handleoddname4, ondisplayinfochanged, str, z, magicModuleSubmissionRequestBody, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final String str, getMatchingIndex getmatchingindex, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(getmatchingindex, "");
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-696111771, i, -1, "com.marrow2.ui.review_components.ui.misc.BookmarkTooltip.<anonymous> (BookmarkTooltip.kt:42)");
        }
        long j = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).read();
        float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(1.0f);
        MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
        setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui = getLocalLifecycleOwner.read(fIconCompatParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
        Nulls.AudioAttributesCompatParcelizer(null, setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f)), j, 0L, setuncaughtexceptionhandlerui, assignParameter.IconCompatParcelizer(2.0f), multiplyFft.AudioAttributesCompatParcelizer(-1319619679, true, new MagicModuleSubmissionRequestBody() { // from class: o.zziq
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return zzij.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody, str, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 1769472, 9);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, String str) {
        magicModuleSubmissionRequestBody.invoke(onDisplayInfoChanged.AudioAttributesCompatParcelizer, str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, String str) {
        magicModuleSubmissionRequestBody.invoke(onDisplayInfoChanged.IconCompatParcelizer, str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, String str) {
        magicModuleSubmissionRequestBody.invoke(onDisplayInfoChanged.write, str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final onDisplayInfoChanged ondisplayinfochanged, boolean z, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        final long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1105129091, i, -1, "com.marrow2.ui.review_components.ui.misc.BookmarkTooltip.<anonymous> (BookmarkTooltip.kt:76)");
            }
            int i2 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[ondisplayinfochanged.ordinal()];
            if (i2 == 1) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1172130801);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else if (i2 == 2) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1172128310);
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else if (i2 == 3) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1172126039);
                MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromMediaId();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                if (i2 != 4) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-1172133330);
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                    throw new RenewEligibleCreator();
                }
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1172123668);
                MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSeekTo();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            int i3 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[ondisplayinfochanged.ordinal()];
            final int i4 = R.drawable.bookmark_rv;
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    i4 = R.drawable.star_rv;
                } else {
                    if (i3 != 4) {
                        throw new RenewEligibleCreator();
                    }
                    i4 = R.drawable.help_rv;
                }
            }
            if (z) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1975700491);
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody);
                boolean zRemoteActionCompatParcelizer = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(ondisplayinfochanged.ordinal());
                boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(str);
                Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                if ((zAudioAttributesCompatParcelizer | zRemoteActionCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new getCreatedOnDateMs() { // from class: o.zzik
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return zzij.IconCompatParcelizer(magicModuleSubmissionRequestBody, ondisplayinfochanged, str);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                }
                CloseImageView.RemoteActionCompatParcelizer((getCreatedOnDateMs) objOnPause, companion, false, null, null, null, null, null, null, multiplyFft.AudioAttributesCompatParcelizer(-2072075995, true, new getModuleData() { // from class: o.zzim
                    @Override // kotlin.getModuleData
                    public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                        return zzij.RemoteActionCompatParcelizer(ondisplayinfochanged, i4, r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, (getViewLifecycleOwnerLiveData) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                    }
                }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 805306416, TarConstants.XSTAR_MAGIC_OFFSET);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1974843713);
                _handleOddName _handleoddnameIconCompatParcelizer = getParentFragment.IconCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(5.0f));
                boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody);
                boolean zRemoteActionCompatParcelizer2 = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(ondisplayinfochanged.ordinal());
                boolean zAudioAttributesCompatParcelizer4 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(str);
                Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
                if ((zAudioAttributesCompatParcelizer3 | zRemoteActionCompatParcelizer2 | zAudioAttributesCompatParcelizer4) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause2 = new getCreatedOnDateMs() { // from class: o.zzil
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return zzij.read(magicModuleSubmissionRequestBody, ondisplayinfochanged, str);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
                }
                value.read(getDefaultSetterInfo.RemoteActionCompatParcelizer(i4, _handleunrecognizedcharacterescape, 0), null, getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(_handleoddnameIconCompatParcelizer, false, null, null, null, (getCreatedOnDateMs) objOnPause2, 15, null), r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 0);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, onDisplayInfoChanged ondisplayinfochanged, String str) {
        magicModuleSubmissionRequestBody.invoke(ondisplayinfochanged == onDisplayInfoChanged.read ? onDisplayInfoChanged.AudioAttributesCompatParcelizer : onDisplayInfoChanged.read, str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(onDisplayInfoChanged ondisplayinfochanged, int i, long j, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        toMagicModuleMetaRepoModel.write(getviewlifecycleownerlivedata, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 17) != 16, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-2072075995, i2, -1, "com.marrow2.ui.review_components.ui.misc.BookmarkTooltip.<anonymous>.<anonymous> (BookmarkTooltip.kt:96)");
            }
            String str = singleArgCreatorDefaultsToProperties.read(ondisplayinfochanged == onDisplayInfoChanged.read ? R.string.bookmark : R.string.bookmarked_string, _handleunrecognizedcharacterescape, 0);
            deserializeWithObjectId deserializewithobjectidMediaBrowserCompatItemReceiver = TypeKt.MediaBrowserCompatItemReceiver(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidMediaBrowserCompatItemReceiver, _handleunrecognizedcharacterescape, 0, 0, 65530);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(10.0f)), _handleunrecognizedcharacterescape, 6);
            value.read(getDefaultSetterInfo.RemoteActionCompatParcelizer(i, _handleunrecognizedcharacterescape, 0), null, null, j, _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 4);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, onDisplayInfoChanged ondisplayinfochanged, String str) {
        magicModuleSubmissionRequestBody.invoke(ondisplayinfochanged == onDisplayInfoChanged.read ? onDisplayInfoChanged.AudioAttributesCompatParcelizer : onDisplayInfoChanged.read, str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1319619679, i, -1, "com.marrow2.ui.review_components.ui.misc.BookmarkTooltip.<anonymous>.<anonymous> (BookmarkTooltip.kt:48)");
            }
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), _handleunrecognizedcharacterescape, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(str);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.zzig
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzij.RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, str);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            zzip zzipVar = zzip.read;
            JacksonInjectValue.IconCompatParcelizer((getCreatedOnDateMs) objOnPause, null, false, null, zzip.IconCompatParcelizer(), _handleunrecognizedcharacterescape, CpioConstants.C_ISBLK, 14);
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody);
            boolean zAudioAttributesCompatParcelizer4 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(str);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer3 | zAudioAttributesCompatParcelizer4) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.zzih
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzij.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody, str);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            zzip zzipVar2 = zzip.read;
            JacksonInjectValue.IconCompatParcelizer((getCreatedOnDateMs) objOnPause2, null, false, null, zzip.RemoteActionCompatParcelizer(), _handleunrecognizedcharacterescape, CpioConstants.C_ISBLK, 14);
            boolean zAudioAttributesCompatParcelizer5 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody);
            boolean zAudioAttributesCompatParcelizer6 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(str);
            Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer5 | zAudioAttributesCompatParcelizer6) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.zzii
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzij.MediaBrowserCompatCustomActionResultReceiver(magicModuleSubmissionRequestBody, str);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
            }
            zzip zzipVar3 = zzip.read;
            JacksonInjectValue.IconCompatParcelizer((getCreatedOnDateMs) objOnPause3, null, false, null, zzip.write(), _handleunrecognizedcharacterescape, CpioConstants.C_ISBLK, 14);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, onDisplayInfoChanged ondisplayinfochanged, String str, boolean z, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(_handleoddname, ondisplayinfochanged, str, z, (MagicModuleSubmissionRequestBody<? super onDisplayInfoChanged, ? super String, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
