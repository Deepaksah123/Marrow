package kotlin;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.marrow2.ui.review_components.ui.pagers.ReviewPagerViewModel;
import java.util.List;
import kotlin.withFieldVisibility;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzki {
    public static final void IconCompatParcelizer(_handleOddName _handleoddname, final List<String> list, final int i, final String str, final zzhs zzhsVar, final boolean z, final boolean z2, final getAnswerMap<? super Integer, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2, final int i3) {
        _handleOddName _handleoddname2;
        int i4;
        _handleOddName _handleoddname3;
        int i5;
        int i6;
        int i7;
        boolean z3;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1077149488);
        int i8 = i3 & 1;
        if (i8 != 0) {
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
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(zzhsVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 8388608 : 4194304;
        }
        if (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i4 & 4793491) != 4793490, i4 & 1)) {
            _handleOddName _handleoddname4 = i8 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1077149488, i4, -1, "com.marrow2.ui.review_components.ui.pagers.McqHorizontalPagerNativeWrapper (McqHorizontalPagerNativeWrapper.kt:38)");
            }
            JDK14Util jDK14Util = JDK14Util.INSTANCE;
            TypeResolutionContext typeResolutionContextIconCompatParcelizer = JDK14Util.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 6);
            if (typeResolutionContextIconCompatParcelizer == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            int i9 = i4;
            _handleOddName _handleoddname5 = _handleoddname4;
            final ReviewPagerViewModel reviewPagerViewModel = (ReviewPagerViewModel) JDK14UtilRawTypeName.IconCompatParcelizer(toMagicModuleMetaDataUcModel.write(ReviewPagerViewModel.class), typeResolutionContextIconCompatParcelizer, null, typeResolutionContextIconCompatParcelizer instanceof anyExplicitsWithoutIgnoral ? ((anyExplicitsWithoutIgnoral) typeResolutionContextIconCompatParcelizer).getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE, _handleunrecognizedcharacterescapeWrite, 0);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(reviewPagerViewModel);
            int i10 = i9 & 896;
            boolean z4 = i10 == 256;
            read readVarOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zIconCompatParcelizer | z4) || readVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                readVarOnPause = new read(reviewPagerViewModel, i, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(readVarOnPause);
            }
            StreamReadException.IconCompatParcelizer(Integer.valueOf(i), (MagicModuleSubmissionRequestBody) readVarOnPause, _handleunrecognizedcharacterescapeWrite, (i9 >> 6) & 14);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname5);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            _handleoddname3 = _handleoddname5;
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
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(reviewPagerViewModel);
            boolean z5 = i10 == 256;
            boolean z6 = (i9 & 7168) == 2048;
            boolean z7 = (57344 & i9) == 16384;
            boolean z8 = (458752 & i9) == 131072;
            boolean z9 = (29360128 & i9) == 8388608;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (((zIconCompatParcelizer2 | z5 | z6 | z7 | z8) || z9) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                i5 = i10;
                i6 = i9;
                i7 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                z3 = false;
                objOnPause = new getAnswerMap() { // from class: o.zzkh
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zzki.AudioAttributesCompatParcelizer(reviewPagerViewModel, i, str, zzhsVar, z, getanswermap, (Context) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            } else {
                i6 = i9;
                i5 = i10;
                i7 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                z3 = false;
            }
            getAnswerMap getanswermap2 = (getAnswerMap) objOnPause;
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list);
            boolean z10 = (i6 & 3670016) == i7 ? true : z3;
            boolean z11 = i5 != 256 ? z3 : true;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zIconCompatParcelizer3 | z10 | z11) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getAnswerMap() { // from class: o.zzkj
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zzki.RemoteActionCompatParcelizer(i, list, z2, (ViewPager2) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            AtomicLongDeserializer.AudioAttributesCompatParcelizer(getanswermap2, null, (getAnswerMap) objOnPause2, _handleunrecognizedcharacterescapeWrite, 0, 2);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname6 = _handleoddname3;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzkk
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzki.IconCompatParcelizer(_handleoddname6, list, i, str, zzhsVar, z, z2, getanswermap, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ ReviewPagerViewModel write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            this.write.write(this.IconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(ReviewPagerViewModel reviewPagerViewModel, int i, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.write = reviewPagerViewModel;
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.write, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewPager2 AudioAttributesCompatParcelizer(ReviewPagerViewModel reviewPagerViewModel, int i, String str, zzhs zzhsVar, boolean z, getAnswerMap getanswermap, Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        reviewPagerViewModel.write(i);
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setAdapter(new zzkl(str, zzhsVar, z, reviewPagerViewModel.read()));
        viewPager2.AudioAttributesCompatParcelizer(new IconCompatParcelizer(reviewPagerViewModel, getanswermap));
        return viewPager2;
    }

    public static final class IconCompatParcelizer extends ViewPager2.write {
        private /* synthetic */ getAnswerMap<Integer, getShowPopup> IconCompatParcelizer;
        private /* synthetic */ ReviewPagerViewModel RemoteActionCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(ReviewPagerViewModel reviewPagerViewModel, getAnswerMap<? super Integer, getShowPopup> getanswermap) {
            this.RemoteActionCompatParcelizer = reviewPagerViewModel;
            this.IconCompatParcelizer = getanswermap;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.write
        public final void RemoteActionCompatParcelizer(int i) {
            this.RemoteActionCompatParcelizer.write(i);
            this.IconCompatParcelizer.invoke(Integer.valueOf(i));
            super.RemoteActionCompatParcelizer(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(int i, List list, boolean z, ViewPager2 viewPager2) {
        toMagicModuleMetaRepoModel.write(viewPager2, "");
        RecyclerView.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = viewPager2.RemoteActionCompatParcelizer();
        zzkl zzklVar = iconCompatParcelizerRemoteActionCompatParcelizer instanceof zzkl ? (zzkl) iconCompatParcelizerRemoteActionCompatParcelizer : null;
        if (zzklVar != null) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzklVar.RemoteActionCompatParcelizer(), list)) {
                zzklVar.RemoteActionCompatParcelizer().clear();
                zzklVar.RemoteActionCompatParcelizer().addAll(list);
                zzklVar.notifyDataSetChanged();
            }
            zzklVar.AudioAttributesCompatParcelizer().write(Boolean.valueOf(z));
        }
        if (viewPager2.read() != i) {
            viewPager2.setCurrentItem(i, false);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, List list, int i, String str, zzhs zzhsVar, boolean z, boolean z2, getAnswerMap getanswermap, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(_handleoddname, (List<String>) list, i, str, zzhsVar, z, z2, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }
}
