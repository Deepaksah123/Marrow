package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.List;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjh {
    public static final void read(_handleOddName _handleoddname, final int i, final int i2, final List<? extends List<String>> list, final getAnswerMap<? super Integer, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i3, final int i4) {
        _handleOddName _handleoddname2;
        int i5;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1271113030);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i3 & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i5 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i3;
        } else {
            _handleoddname2 = _handleoddname;
            i5 = i3;
        }
        if ((i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 2048 : 1024;
        }
        if ((i3 & CpioConstants.C_ISBLK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 16384 : 8192;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i5 & 9347) != 9346, i5 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            _handleOddName.Companion companion = i6 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1271113030, i5, -1, "com.marrow2.ui.review_components.ui.pagers.ScrollableLazyTabLayout (BookmarkTabMainLayout.kt:36)");
            }
            final setSharedElementReturnTransition setsharedelementreturntransitionWrite = shouldShowRequestPermissionRationale.write(i2 <= 0 ? 0 : i2, 0, _handleunrecognizedcharacterescapeWrite, 0, 2);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setsharedelementreturntransitionWrite);
            boolean z = (i5 & 896) == 256;
            RemoteActionCompatParcelizer remoteActionCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zAudioAttributesCompatParcelizer | z) || remoteActionCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                remoteActionCompatParcelizerOnPause = new RemoteActionCompatParcelizer(setsharedelementreturntransitionWrite, i2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(remoteActionCompatParcelizerOnPause);
            }
            StreamReadException.IconCompatParcelizer(Integer.valueOf(i2), (MagicModuleSubmissionRequestBody) remoteActionCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, (i5 >> 6) & 14);
            _handleOddName.Companion companion2 = _handleOddName.INSTANCE;
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, companion2);
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
            DrawerLayout.IconCompatParcelizer(companion, null, false, multiplyFft.AudioAttributesCompatParcelizer(779391250, true, new getModuleData() { // from class: o.zzjj
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return zzjh.AudioAttributesCompatParcelizer(setsharedelementreturntransitionWrite, list, i2, getanswermap, (setDrawerShadow) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, (i5 & 14) | 3072, 6);
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(1.0f));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            updatePositions.read(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameAudioAttributesCompatParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), null, 2, null), 0L, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescapeWrite, 0, 14);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = companion;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname3 = _handleoddname2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzjn
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzjh.RemoteActionCompatParcelizer(_handleoddname3, i, i2, list, getanswermap, i3, i4, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ setSharedElementReturnTransition IconCompatParcelizer;
        private int read;
        private /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                int iAudioAttributesImplApi21Parcelizer = this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer();
                int i2 = this.write;
                if (iAudioAttributesImplApi21Parcelizer != i2) {
                    this.read = 1;
                    if (setSharedElementReturnTransition.RemoteActionCompatParcelizer$default(this.IconCompatParcelizer, i2, 0, this, 2, null) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
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
        RemoteActionCompatParcelizer(setSharedElementReturnTransition setsharedelementreturntransition, int i, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = setsharedelementreturntransition;
            this.write = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setSharedElementReturnTransition setsharedelementreturntransition, final List list, final int i, final getAnswerMap getanswermap, setDrawerShadow setdrawershadow, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        int i3;
        toMagicModuleMetaRepoModel.write(setdrawershadow, "");
        if ((i2 & 6) == 0) {
            i3 = i2 | (_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setdrawershadow) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i3 & 19) != 18, i3 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(779391250, i3, -1, "com.marrow2.ui.review_components.ui.pagers.ScrollableLazyTabLayout.<anonymous>.<anonymous> (BookmarkTabMainLayout.kt:47)");
            }
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            getReturnTransition getreturntransitionWrite$default = getParentFragment.write$default(VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.RemoteActionCompatParcelizer(assignParameter.read(setdrawershadow.write()), assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescape, 48, 12), BitmapDescriptorFactory.HUE_RED, 2, null);
            _handleOddName.Companion companion2 = companion;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(list);
            boolean zRemoteActionCompatParcelizer = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zIconCompatParcelizer | zRemoteActionCompatParcelizer | zAudioAttributesCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.zzjk
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zzjh.RemoteActionCompatParcelizer(list, i, getanswermap, (setReenterTransition) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            performContextItemSelected.AudioAttributesCompatParcelizer(companion2, setsharedelementreturntransition, getreturntransitionWrite$default, false, null, null, null, false, null, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape, 6, TarConstants.SPARSELEN_GNU_SPARSE);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final List list, final int i, final getAnswerMap getanswermap, setReenterTransition setreentertransition) {
        toMagicModuleMetaRepoModel.write(setreentertransition, "");
        setReenterTransition.RemoteActionCompatParcelizer$default(setreentertransition, list.size(), new getAnswerMap() { // from class: o.zzbW
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return zzjh.IconCompatParcelizer(list, ((Integer) obj).intValue());
            }
        }, null, multiplyFft.IconCompatParcelizer(1799385062, true, new getMagicModuleStat() { // from class: o.zzjl
            @Override // kotlin.getMagicModuleStat
            public final Object write(Object obj, Object obj2, Object obj3, Object obj4) {
                return zzjh.RemoteActionCompatParcelizer(list, i, getanswermap, (performDestroy) obj, ((Integer) obj2).intValue(), (_handleUnrecognizedCharacterEscape) obj3, ((Integer) obj4).intValue());
            }
        }), 4, null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(List list, int i) {
        return list.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(List list, int i, final getAnswerMap getanswermap, performDestroy performdestroy, final int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        int i4;
        toMagicModuleMetaRepoModel.write(performdestroy, "");
        if ((i3 & 48) == 0) {
            i4 = i3 | (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i2) ? 32 : 16);
        } else {
            i4 = i3;
        }
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i4 & 145) != 144, i4 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1799385062, i4, -1, "com.marrow2.ui.review_components.ui.pagers.ScrollableLazyTabLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookmarkTabMainLayout.kt:60)");
            }
            _handleOddName _handleoddnameWrite$default = getParentFragment.write$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f), BitmapDescriptorFactory.HUE_RED, 2, null);
            int i5 = i2 * 5;
            int size = ((List) list.get(i2)).size();
            StringBuilder sb = new StringBuilder();
            sb.append(i5 + 1);
            sb.append(" - ");
            sb.append(i5 + size);
            sb.append(" ");
            String string = sb.toString();
            boolean z = i2 == i;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap);
            boolean z2 = (i4 & 112) == 32;
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | z2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.zzjf
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzjh.read(getanswermap, i2);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            RemoteActionCompatParcelizer(_handleoddnameWrite$default, string, z, (getCreatedOnDateMs<getShowPopup>) objOnPause, _handleunrecognizedcharacterescape, 6, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getAnswerMap getanswermap, int i) {
        getanswermap.invoke(Integer.valueOf(i));
        return getShowPopup.INSTANCE;
    }

    private static void RemoteActionCompatParcelizer(_handleOddName _handleoddname, final String str, final boolean z, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname3;
        long onSetPlaybackSpeed;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1517164080);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 2048 : 1024;
        }
        int i5 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i5 & 1171) != 1170, i5 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleOddName _handleoddname4 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1517164080, i5, -1, "com.marrow2.ui.review_components.ui.pagers.BookmarkTabsLayout (BookmarkTabMainLayout.kt:87)");
            }
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            final long onPrepareFromUri = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleoddname4, assignParameter.IconCompatParcelizer(40.0f), BitmapDescriptorFactory.HUE_RED, 2, (Object) null);
            boolean z2 = (i5 & 7168) == 2048;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z2 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.zzjp
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzjh.RemoteActionCompatParcelizer(getcreatedondatems);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(_handleoddnameIconCompatParcelizer$default, false, null, null, null, (getCreatedOnDateMs) objOnPause, 15, null);
            boolean z3 = (i5 & 896) == 256;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(onPrepareFromUri);
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z3 | zIconCompatParcelizer) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getAnswerMap() { // from class: o.zzjq
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zzjh.write(z, onPrepareFromUri, (_reportInvalidChar) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = WriterBasedJsonGenerator.RemoteActionCompatParcelizer(_handleoddnameRemoteActionCompatParcelizer$default, (getAnswerMap) objOnPause2);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.read(), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescapeWrite, 54);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleOddName _handleoddnameWrite$default = getParentFragment.write$default(_handleoddname4, assignParameter.IconCompatParcelizer(8.0f), BitmapDescriptorFactory.HUE_RED, 2, null);
            deserializeWithObjectId deserializewithobjectidAudioAttributesCompatParcelizer = TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
            if (z) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1739088775);
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                onSetPlaybackSpeed = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1739089998);
                MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
                onSetPlaybackSpeed = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed();
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName _handleoddname5 = _handleoddname4;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _copyCurrentStringValue.IconCompatParcelizer(str, _handleoddnameWrite$default, onSetPlaybackSpeed, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesCompatParcelizer, _handleunrecognizedcharacterescape2, (i5 >> 3) & 14, 0, 65528);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname3 = _handleoddname5;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzjo
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzjh.AudioAttributesCompatParcelizer(_handleoddname3, str, z, getcreatedondatems, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final parseMediumName write(final boolean z, final long j, _reportInvalidChar _reportinvalidchar) {
        toMagicModuleMetaRepoModel.write(_reportinvalidchar, "");
        return _reportinvalidchar.write(new getAnswerMap() { // from class: o.zzjm
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return zzjh.AudioAttributesCompatParcelizer(z, j, (findSetterInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(boolean z, long j, findSetterInfo findsetterinfo) {
        toMagicModuleMetaRepoModel.write(findsetterinfo, "");
        if (z) {
            long j2 = -1;
            long j3 = -1;
            findSetterInfo.read$default(findsetterinfo, j, getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) findsetterinfo.MediaBrowserCompatCustomActionResultReceiver()) - findsetterinfo.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(3.0f)))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))))), calloc.write((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (findsetterinfo.MediaBrowserCompatCustomActionResultReceiver() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(findsetterinfo.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(3.0f)))) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))))), BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, String str, boolean z, getCreatedOnDateMs getcreatedondatems, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(_handleoddname, str, z, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, int i, int i2, List list, getAnswerMap getanswermap, int i3, int i4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(_handleoddname, i, i2, list, getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1), i4);
        return getShowPopup.INSTANCE;
    }
}
