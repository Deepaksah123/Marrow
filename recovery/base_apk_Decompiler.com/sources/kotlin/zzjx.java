package kotlin;

import android.content.Context;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.getTestPattern;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjx {
    private static final float IconCompatParcelizer = assignParameter.IconCompatParcelizer(500.0f);

    public static final void IconCompatParcelizer(final _handleOddName _handleoddname, final List<String> list, final int i, final String str, final boolean z, final zzhs zzhsVar, final boolean z2, final getAnswerMap<? super Integer, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        int i4;
        Object objRemoteActionCompatParcelizer$default;
        int i5;
        final InputAccessor inputAccessor;
        int i6;
        zzjr zzjrVar;
        TopUserCompanion topUserCompanion;
        int i7;
        final InputAccessor inputAccessor2;
        final InputAccessor inputAccessor3;
        final InputAccessor inputAccessor4;
        toMagicModuleMetaRepoModel.write(_handleoddname, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-147407358);
        if ((i2 & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(zzhsVar.ordinal()) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 8388608 : 4194304;
        }
        int i8 = i3;
        if (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((4793491 & i8) != 4793490, i8 & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-147407358, i8, -1, "com.marrow2.ui.review_components.ui.pagers.McqHorizontalGridNativeWrapper (McqHorizontaGridNativeWrapper.kt:79)");
            }
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(list);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                InputAccessor inputAccessorRemoteActionCompatParcelizer$default = available.RemoteActionCompatParcelizer$default(IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Iterable) list), null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(inputAccessorRemoteActionCompatParcelizer$default);
                objOnPause = inputAccessorRemoteActionCompatParcelizer$default;
            }
            InputAccessor inputAccessor5 = (InputAccessor) objOnPause;
            boolean z3 = (i8 & 896) == 256;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z3 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                i4 = 2;
                objRemoteActionCompatParcelizer$default = available.RemoteActionCompatParcelizer$default(Integer.valueOf(i / 5), null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer$default);
            } else {
                objRemoteActionCompatParcelizer$default = objOnPause2;
                i4 = 2;
            }
            InputAccessor inputAccessor6 = (InputAccessor) objRemoteActionCompatParcelizer$default;
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = available.RemoteActionCompatParcelizer$default(Boolean.TRUE, null, i4, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            final InputAccessor inputAccessor7 = (InputAccessor) objOnPause3;
            Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new zzjr();
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
            }
            zzjr zzjrVar2 = (zzjr) objOnPause4;
            Object objOnPause5 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = StreamReadException.RemoteActionCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescapeWrite);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause5);
            }
            TopUserCompanion topUserCompanion2 = (TopUserCompanion) objOnPause5;
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            if (read(inputAccessor5).size() > 1) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2069593644);
                if (zzhsVar == zzhs.RemoteActionCompatParcelizer) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2069780791);
                    _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(12.0f), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), BitmapDescriptorFactory.HUE_RED, 10, null);
                    List<List<String>> list2 = read(inputAccessor5);
                    int iWrite = write((InputAccessor<Integer>) inputAccessor6);
                    boolean z4 = (i8 & 29360128) == 8388608;
                    Object objOnPause6 = _handleunrecognizedcharacterescapeWrite.onPause();
                    if (z4 || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause6 = new getAnswerMap() { // from class: o.zzjz
                            @Override // kotlin.getAnswerMap
                            public final Object invoke(Object obj) {
                                return zzjx.IconCompatParcelizer(getanswermap, ((Integer) obj).intValue());
                            }
                        };
                        _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause6);
                    }
                    i5 = 1;
                    i7 = 0;
                    i6 = i8;
                    topUserCompanion = topUserCompanion2;
                    zzjrVar = zzjrVar2;
                    zzjh.read(_handleoddnameAudioAttributesCompatParcelizer$default, i, iWrite, list2, (getAnswerMap) objOnPause6, _handleunrecognizedcharacterescapeWrite, ((i8 >> 3) & 112) | 6, 0);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    inputAccessor = inputAccessor6;
                    inputAccessor2 = inputAccessor5;
                    _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescapeWrite;
                } else {
                    i5 = 1;
                    i6 = i8;
                    zzjrVar = zzjrVar2;
                    topUserCompanion = topUserCompanion2;
                    i7 = 0;
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2070279054);
                    int iAudioAttributesCompatParcelizer = lambdadecodeBitmap1.AudioAttributesCompatParcelizer(write((InputAccessor<Integer>) inputAccessor6), read(inputAccessor5).size(), "mcq_grid_pager", _handleunrecognizedcharacterescapeWrite, RendererCapabilities.MODE_SUPPORT_MASK);
                    float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(8.0f);
                    long j = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read();
                    MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                    inputAccessor = inputAccessor6;
                    inputAccessor2 = inputAccessor5;
                    acceptsPaddingOnRead.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, (_handleOddName) null, j, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri(), fIconCompatParcelizer, (getModuleData<? super List<_reportBase64UnexpectedPadding>, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) null, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) null, multiplyFft.AudioAttributesCompatParcelizer(48160013, true, new MagicModuleSubmissionRequestBody() { // from class: o.zzka
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        public final Object invoke(Object obj, Object obj2) {
                            return zzjx.IconCompatParcelizer(inputAccessor2, getanswermap, inputAccessor, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                        }
                    }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 12607488, 98);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                }
            } else {
                i5 = 1;
                inputAccessor = inputAccessor6;
                i6 = i8;
                zzjrVar = zzjrVar2;
                topUserCompanion = topUserCompanion2;
                i7 = 0;
                inputAccessor2 = inputAccessor5;
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(2065609462);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, i5, null);
            int i9 = (i6 & 7168) == 2048 ? i5 : i7;
            int i10 = (458752 & i6) == 131072 ? i5 : i7;
            int i11 = (57344 & i6) == 16384 ? i5 : i7;
            int i12 = (29360128 & i6) == 8388608 ? i5 : i7;
            final zzjr zzjrVar3 = zzjrVar;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(zzjrVar3);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(topUserCompanion);
            Object objOnPause7 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((i9 | i10 | i11 | i12 | (zIconCompatParcelizer ? 1 : 0) | (zIconCompatParcelizer2 ? 1 : 0)) != 0 || objOnPause7 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                inputAccessor3 = inputAccessor;
                inputAccessor4 = inputAccessor2;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                final TopUserCompanion topUserCompanion3 = topUserCompanion;
                objOnPause7 = new getAnswerMap() { // from class: o.zzkc
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zzjx.write(str, zzhsVar, z, getanswermap, inputAccessor7, zzjrVar3, topUserCompanion3, (Context) obj);
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause7);
            } else {
                inputAccessor3 = inputAccessor;
                inputAccessor4 = inputAccessor2;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            }
            getAnswerMap getanswermap2 = (getAnswerMap) objOnPause7;
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape2.AudioAttributesCompatParcelizer(inputAccessor4);
            int i13 = (i6 & 3670016) == 1048576 ? 1 : i7;
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape2.AudioAttributesCompatParcelizer(inputAccessor3);
            Object objOnPause8 = _handleunrecognizedcharacterescape2.onPause();
            if (((zAudioAttributesCompatParcelizer3 ? 1 : 0) | (zAudioAttributesCompatParcelizer2 ? 1 : 0) | i13) != 0 || objOnPause8 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause8 = new getAnswerMap() { // from class: o.zzkf
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zzjx.RemoteActionCompatParcelizer(z2, inputAccessor4, inputAccessor3, (ViewPager2) obj);
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause8);
            }
            AtomicLongDeserializer.AudioAttributesCompatParcelizer(getanswermap2, _handleoddnameIconCompatParcelizer$default, (getAnswerMap) objOnPause8, _handleunrecognizedcharacterescape2, 48, 0);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzkg
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzjx.RemoteActionCompatParcelizer(_handleoddname, list, i, str, z, zzhsVar, z2, getanswermap, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    private static final List<List<String>> read(InputAccessor<List<List<String>>> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    private static final int write(InputAccessor<Integer> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getAnswerMap getanswermap, int i) {
        getanswermap.invoke(Integer.valueOf(i * 5));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(InputAccessor inputAccessor, final getAnswerMap getanswermap, InputAccessor inputAccessor2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        boolean z = true;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(48160013, i, -1, "com.marrow2.ui.review_components.ui.pagers.McqHorizontalGridNativeWrapper.<anonymous>.<anonymous> (McqHorizontaGridNativeWrapper.kt:120)");
            }
            final int i2 = 0;
            for (Object obj : read(inputAccessor)) {
                if (i2 < 0) {
                    IntermediateLoginResponseBody.read();
                }
                final List list = (List) obj;
                boolean z2 = write((InputAccessor<Integer>) inputAccessor2) == i2 ? z : false;
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                long onPrepareFromUri = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                long onSetPlaybackSpeed = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed();
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap);
                boolean zRemoteActionCompatParcelizer = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i2);
                Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                if ((zAudioAttributesCompatParcelizer | zRemoteActionCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new getCreatedOnDateMs() { // from class: o.zzke
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return zzjx.AudioAttributesCompatParcelizer(getanswermap, i2);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                }
                bindItem.AudioAttributesCompatParcelizer(z2, (getCreatedOnDateMs) objOnPause, null, false, multiplyFft.AudioAttributesCompatParcelizer(195298382, z, new MagicModuleSubmissionRequestBody() { // from class: o.zzkd
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj2, Object obj3) {
                        return zzjx.RemoteActionCompatParcelizer(i2, list, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
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
    public static final getShowPopup RemoteActionCompatParcelizer(int i, List list, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(195298382, i2, -1, "com.marrow2.ui.review_components.ui.pagers.McqHorizontalGridNativeWrapper.<anonymous>.<anonymous>.<anonymous>.<anonymous> (McqHorizontaGridNativeWrapper.kt:122)");
            }
            int i3 = i * 5;
            int size = list.size();
            StringBuilder sb = new StringBuilder();
            sb.append(i3 + 1);
            sb.append(" - ");
            sb.append(i3 + size);
            sb.append(" ");
            _copyCurrentStringValue.IconCompatParcelizer(sb.toString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getAnswerMap getanswermap, int i) {
        getanswermap.invoke(Integer.valueOf(i * 5));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewPager2 write(String str, zzhs zzhsVar, boolean z, getAnswerMap getanswermap, InputAccessor inputAccessor, zzjr zzjrVar, TopUserCompanion topUserCompanion, Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setAdapter(new zzju(str, zzhsVar, z, getanswermap, inputAccessor));
        viewPager2.AudioAttributesCompatParcelizer(new read(getanswermap, zzjrVar, inputAccessor, topUserCompanion));
        return viewPager2;
    }

    public static final class read extends ViewPager2.write {
        private /* synthetic */ getAnswerMap<Integer, getShowPopup> AudioAttributesCompatParcelizer;
        private /* synthetic */ TopUserCompanion IconCompatParcelizer;
        private /* synthetic */ InputAccessor<Boolean> read;
        private /* synthetic */ zzjr write;

        /* JADX WARN: Multi-variable type inference failed */
        read(getAnswerMap<? super Integer, getShowPopup> getanswermap, zzjr zzjrVar, InputAccessor<Boolean> inputAccessor, TopUserCompanion topUserCompanion) {
            this.AudioAttributesCompatParcelizer = getanswermap;
            this.write = zzjrVar;
            this.read = inputAccessor;
            this.IconCompatParcelizer = topUserCompanion;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.write
        public final void RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer.invoke(Integer.valueOf(i * 5));
            super.RemoteActionCompatParcelizer(i);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.write
        public final void AudioAttributesCompatParcelizer(int i) {
            super.AudioAttributesCompatParcelizer(i);
            setPassingYear setpassingyearRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer();
            if (setpassingyearRemoteActionCompatParcelizer != null) {
                setpassingyearRemoteActionCompatParcelizer.RemoteActionCompatParcelizer((CancellationException) null);
            }
            if (i != 0) {
                this.read.write(Boolean.FALSE);
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = jElapsedRealtime - this.write.IconCompatParcelizer() < 350;
            this.write.IconCompatParcelizer(jElapsedRealtime);
            this.write.write(C0201setMcqCount.IconCompatParcelizer(this.IconCompatParcelizer, null, null, new write(z, this.read, null), 3));
        }

        static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ InputAccessor<Boolean> AudioAttributesCompatParcelizer;
            private int RemoteActionCompatParcelizer;
            private /* synthetic */ boolean write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.RemoteActionCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    getTestPattern.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getTestPattern.read;
                    long j = this.write ? 250L : 60L;
                    this.RemoteActionCompatParcelizer = 1;
                    if (setCountry.RemoteActionCompatParcelizer(getUserSubmissionTimestamp.read(j, isAnonymous.RemoteActionCompatParcelizer), this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                this.AudioAttributesCompatParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            write(boolean z, InputAccessor<Boolean> inputAccessor, SampleVideos<? super write> sampleVideos) {
                super(2, sampleVideos);
                this.write = z;
                this.AudioAttributesCompatParcelizer = inputAccessor;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new write(this.write, this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(boolean z, InputAccessor inputAccessor, InputAccessor inputAccessor2, ViewPager2 viewPager2) {
        toMagicModuleMetaRepoModel.write(viewPager2, "");
        RecyclerView.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = viewPager2.RemoteActionCompatParcelizer();
        zzju zzjuVar = iconCompatParcelizerRemoteActionCompatParcelizer instanceof zzju ? (zzju) iconCompatParcelizerRemoteActionCompatParcelizer : null;
        if (zzjuVar != null) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzjuVar.AudioAttributesCompatParcelizer(), read(inputAccessor))) {
                zzjuVar.AudioAttributesCompatParcelizer().clear();
                zzjuVar.AudioAttributesCompatParcelizer().addAll(read(inputAccessor));
                zzjuVar.notifyDataSetChanged();
            }
            zzjuVar.IconCompatParcelizer().write(Boolean.valueOf(z));
        }
        if (viewPager2.read() != write((InputAccessor<Integer>) inputAccessor2)) {
            viewPager2.setCurrentItem(write((InputAccessor<Integer>) inputAccessor2), false);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1337632030);
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i != 0, i & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1337632030, i, -1, "com.marrow2.ui.review_components.ui.pagers.PendingMcqPlaceholder (McqHorizontaGridNativeWrapper.kt:277)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), IconCompatParcelizer, BitmapDescriptorFactory.HUE_RED, 2, (Object) null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), false);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            JsonIdentityReference.read(null, 0L, BitmapDescriptorFactory.HUE_RED, 0L, 0, _handleunrecognizedcharacterescapeWrite, 0, 31);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzkb
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzjx.read(i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, List list, int i, String str, boolean z, zzhs zzhsVar, boolean z2, getAnswerMap getanswermap, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(_handleoddname, list, i, str, z, zzhsVar, z2, getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
