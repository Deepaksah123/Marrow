package kotlin;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.List;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class MaterialCalendarGridView {
    public static final void read(_handleOddName _handleoddname, final int i, final List<String> list, final String str, readBlockToCache readblocktocache, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final MagicModuleSubmissionRequestBody<? super String, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, final getAnswerMap<? super String, getShowPopup> getanswermap, final MagicModuleSubmissionRequestBody<? super String, ? super Boolean, getShowPopup> magicModuleSubmissionRequestBody2, final getAnswerMap<? super Integer, getShowPopup> getanswermap2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2, final int i3) {
        _handleOddName _handleoddname2;
        int i4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final readBlockToCache readblocktocache2;
        boolean z;
        int i5;
        int i6;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody2, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1253697637);
        int i7 = i3 & 1;
        if (i7 != 0) {
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
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 2048 : 1024;
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i4 |= CpioConstants.C_ISBLK;
        } else if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(readblocktocache == null ? -1 : readblocktocache.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap2) ? 536870912 : 268435456;
        }
        if (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((306783379 & i4) != 306783378, i4 & 1)) {
            _handleOddName _handleoddname3 = i7 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            readBlockToCache readblocktocache3 = i8 != 0 ? readBlockToCache.AudioAttributesImplApi26Parcelizer : readblocktocache;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1253697637, i4, -1, "com.marrow2.ui.test.testplay.ui.McqPagerView (McqPagerView.kt:37)");
            }
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = setStartTime.RemoteActionCompatParcelizer(Integer.valueOf(i));
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            final getResolutionSize getresolutionsize = (getResolutionSize) objOnPause;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getresolutionsize);
            int i9 = i4 & 112;
            boolean z2 = i9 == 32;
            write writeVarOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z2 | zIconCompatParcelizer) || writeVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                writeVarOnPause = new write(getresolutionsize, i, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(writeVarOnPause);
            }
            StreamReadException.IconCompatParcelizer(Integer.valueOf(i), (MagicModuleSubmissionRequestBody) writeVarOnPause, _handleunrecognizedcharacterescapeWrite, (i4 >> 3) & 14);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname3);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            _handleOddName _handleoddname4 = _handleoddname3;
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            boolean z3 = (i4 & 7168) == 2048;
            boolean z4 = (57344 & i4) == 16384;
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getresolutionsize);
            boolean z5 = (458752 & i4) == 131072;
            boolean z6 = (3670016 & i4) == 1048576;
            boolean z7 = (29360128 & i4) == 8388608;
            boolean z8 = (234881024 & i4) == 67108864;
            boolean z9 = (i4 & 1879048192) == 536870912;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (((z3 | z4 | zIconCompatParcelizer2 | z5 | z6 | z7 | z8) || z9) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                z = false;
                final readBlockToCache readblocktocache4 = readblocktocache3;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                i5 = 32;
                i6 = i9;
                getAnswerMap getanswermap3 = new getAnswerMap() { // from class: o.Month
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return MaterialCalendarGridView.IconCompatParcelizer(str, readblocktocache4, getresolutionsize, getcreatedondatems, magicModuleSubmissionRequestBody, getanswermap, magicModuleSubmissionRequestBody2, getanswermap2, (Context) obj);
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(getanswermap3);
                objOnPause2 = getanswermap3;
            } else {
                i6 = i9;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                i5 = 32;
                z = false;
            }
            getAnswerMap getanswermap4 = (getAnswerMap) objOnPause2;
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape2.IconCompatParcelizer(list);
            boolean z10 = i6 != i5 ? z : true;
            Object objOnPause3 = _handleunrecognizedcharacterescape2.onPause();
            if ((z10 | zIconCompatParcelizer3) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getAnswerMap() { // from class: o.setDividerColor
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return MaterialCalendarGridView.RemoteActionCompatParcelizer(i, list, (ViewPager2) obj);
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause3);
            }
            AtomicLongDeserializer.AudioAttributesCompatParcelizer(getanswermap4, null, (getAnswerMap) objOnPause3, _handleunrecognizedcharacterescape2, 0, 2);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname4;
            readblocktocache2 = readblocktocache3;
        } else {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            readblocktocache2 = readblocktocache;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname5 = _handleoddname2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setDividerInsetEndResource
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return MaterialCalendarGridView.write(_handleoddname5, i, list, str, readblocktocache2, getcreatedondatems, magicModuleSubmissionRequestBody, getanswermap, magicModuleSubmissionRequestBody2, getanswermap2, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ getResolutionSize<Integer> RemoteActionCompatParcelizer;
        private /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer.write(QBankStatsResponse.RemoteActionCompatParcelizer(this.write));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(getResolutionSize<Integer> getresolutionsize, int i, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = getresolutionsize;
            this.write = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.RemoteActionCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewPager2 IconCompatParcelizer(String str, readBlockToCache readblocktocache, getResolutionSize getresolutionsize, getCreatedOnDateMs getcreatedondatems, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getAnswerMap getanswermap, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, getAnswerMap getanswermap2, Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.setAdapter(new SmoothCalendarLayoutManager(str, readblocktocache, getresolutionsize, getcreatedondatems, magicModuleSubmissionRequestBody, getanswermap, magicModuleSubmissionRequestBody2));
        viewPager2.AudioAttributesCompatParcelizer(new AudioAttributesCompatParcelizer(getanswermap2));
        return viewPager2;
    }

    public static final class AudioAttributesCompatParcelizer extends ViewPager2.write {
        private /* synthetic */ getAnswerMap<Integer, getShowPopup> RemoteActionCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(getAnswerMap<? super Integer, getShowPopup> getanswermap) {
            this.RemoteActionCompatParcelizer = getanswermap;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.write
        public final void RemoteActionCompatParcelizer(int i) {
            this.RemoteActionCompatParcelizer.invoke(Integer.valueOf(i));
            super.RemoteActionCompatParcelizer(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(int i, List list, ViewPager2 viewPager2) {
        toMagicModuleMetaRepoModel.write(viewPager2, "");
        RecyclerView.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = viewPager2.RemoteActionCompatParcelizer();
        SmoothCalendarLayoutManager smoothCalendarLayoutManager = iconCompatParcelizerRemoteActionCompatParcelizer instanceof SmoothCalendarLayoutManager ? (SmoothCalendarLayoutManager) iconCompatParcelizerRemoteActionCompatParcelizer : null;
        if (smoothCalendarLayoutManager != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(smoothCalendarLayoutManager.IconCompatParcelizer(), list)) {
            smoothCalendarLayoutManager.IconCompatParcelizer().clear();
            smoothCalendarLayoutManager.IconCompatParcelizer().addAll(list);
            smoothCalendarLayoutManager.notifyDataSetChanged();
        }
        if (viewPager2.read() != i) {
            if (Math.abs(viewPager2.read() - i) > 1) {
                viewPager2.setCurrentItem(i, false);
            } else {
                viewPager2.setCurrentItem(i, true);
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleOddName _handleoddname, int i, List list, String str, readBlockToCache readblocktocache, getCreatedOnDateMs getcreatedondatems, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getAnswerMap getanswermap, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, getAnswerMap getanswermap2, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(_handleoddname, i, (List<String>) list, str, readblocktocache, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (MagicModuleSubmissionRequestBody<? super String, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, (getAnswerMap<? super String, getShowPopup>) getanswermap, (MagicModuleSubmissionRequestBody<? super String, ? super Boolean, getShowPopup>) magicModuleSubmissionRequestBody2, (getAnswerMap<? super Integer, getShowPopup>) getanswermap2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }
}
