package kotlin;

import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin._handleOddName;
import kotlin.requestLocationUpdates;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class requestLocationUpdates {

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[zzhs.values().length];
            try {
                iArr[zzhs.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zzhs.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            write = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write(kotlin._handleOddName r39, final java.util.List<kotlin.createNotificationChannel> r40, final int r41, final kotlin.zzhs r42, final kotlin.getAnswerMap<? super java.lang.Integer, kotlin.getShowPopup> r43, final kotlin.MagicModuleSubmissionRequestBody<? super kotlin.onDisplayInfoChanged, ? super java.lang.String, kotlin.getShowPopup> r44, kotlin._handleUnrecognizedCharacterEscape r45, final int r46, final int r47) {
        /*
            Method dump skipped, instruction units count: 1238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.requestLocationUpdates.write(o._handleOddName, java.util.List, int, o.zzhs, o.getAnswerMap, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(InputAccessor<Integer> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().intValue();
    }

    private static final int IconCompatParcelizer(InputAccessor<Integer> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List IconCompatParcelizer(List list, InputAccessor inputAccessor) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((InputAccessor<Integer>) inputAccessor);
        if (iRemoteActionCompatParcelizer <= 0) {
            StringBuilder sb = new StringBuilder("Step must be positive, was: ");
            sb.append(iRemoteActionCompatParcelizer);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        int i = 0;
        int i2 = saveMagicModuleTimeline.read(0, size - 1, iRemoteActionCompatParcelizer);
        if (i2 >= 0) {
            while (true) {
                int iRemoteActionCompatParcelizer2 = getQues.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer((InputAccessor<Integer>) inputAccessor) + i, list.size());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i + 1);
                sb2.append(" - ");
                sb2.append(iRemoteActionCompatParcelizer2);
                arrayList.add(sb2.toString());
                if (i == i2) {
                    break;
                }
                i += iRemoteActionCompatParcelizer;
            }
        }
        return arrayList;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ setSharedElementReturnTransition AudioAttributesCompatParcelizer;
        private /* synthetic */ InputAccessor<Integer> RemoteActionCompatParcelizer;
        private int read;
        private /* synthetic */ InputAccessor<Integer> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                final setSharedElementReturnTransition setsharedelementreturntransition = this.AudioAttributesCompatParcelizer;
                NewNumberOtpResendRequest newNumberOtpResendRequestIconCompatParcelizer = _qbuf.IconCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getNotificationResponsiveness
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return requestLocationUpdates.IconCompatParcelizer.write(setsharedelementreturntransition);
                    }
                });
                final setSharedElementReturnTransition setsharedelementreturntransition2 = this.AudioAttributesCompatParcelizer;
                final InputAccessor<Integer> inputAccessor = this.RemoteActionCompatParcelizer;
                final InputAccessor<Integer> inputAccessor2 = this.write;
                this.read = 1;
                if (newNumberOtpResendRequestIconCompatParcelizer.write(new getValidationToken() { // from class: o.requestLocationUpdates.IconCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((List) obj2);
                    }

                    private Object read(List<? extends performPrimaryNavigationFragmentChanged> list) {
                        performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged;
                        if (!list.isEmpty() && (performprimarynavigationfragmentchanged = (performPrimaryNavigationFragmentChanged) IntermediateLoginResponseBody.MediaMetadataCompat((List) list)) != null) {
                            int iconCompatParcelizer = performprimarynavigationfragmentchanged.getIconCompatParcelizer();
                            setSharedElementReturnTransition setsharedelementreturntransition3 = setsharedelementreturntransition2;
                            InputAccessor<Integer> inputAccessor3 = inputAccessor;
                            InputAccessor<Integer> inputAccessor4 = inputAccessor2;
                            if (setsharedelementreturntransition3.AudioAttributesImplApi21Parcelizer() != 0) {
                                requestLocationUpdates.read(inputAccessor4, iconCompatParcelizer / requestLocationUpdates.RemoteActionCompatParcelizer(inputAccessor3));
                            } else {
                                return getShowPopup.INSTANCE;
                            }
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
        public static final List write(setSharedElementReturnTransition setsharedelementreturntransition) {
            return setsharedelementreturntransition.MediaDescriptionCompat().AudioAttributesImplBaseParcelizer();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(setSharedElementReturnTransition setsharedelementreturntransition, InputAccessor<Integer> inputAccessor, InputAccessor<Integer> inputAccessor2, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = setsharedelementreturntransition;
            this.RemoteActionCompatParcelizer = inputAccessor;
            this.write = inputAccessor2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ setSharedElementReturnTransition IconCompatParcelizer;
        private int read;
        private /* synthetic */ int write;

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        
            if (kotlin.setSharedElementReturnTransition.IconCompatParcelizer$default(r9.IconCompatParcelizer, 0, 0, r9, 2, (java.lang.Object) null) == r0) goto L20;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r9.read
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L55
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L36
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                int r4 = r9.write
                if (r4 < 0) goto L36
                o.setSharedElementReturnTransition r10 = r9.IconCompatParcelizer
                r6 = r9
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r9.read = r3
                r5 = 0
                r7 = 2
                r8 = 0
                r3 = r10
                java.lang.Object r10 = kotlin.setSharedElementReturnTransition.IconCompatParcelizer$default(r3, r4, r5, r6, r7, r8)
                if (r10 == r0) goto L54
            L36:
                int r10 = r9.write
                r1 = -1
                if (r10 != r1) goto L55
                o.setSharedElementReturnTransition r10 = r9.IconCompatParcelizer
                int r10 = r10.AudioAttributesImplApi21Parcelizer()
                if (r10 == 0) goto L55
                o.setSharedElementReturnTransition r3 = r9.IconCompatParcelizer
                r6 = r9
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r9.read = r2
                r4 = 0
                r5 = 0
                r7 = 2
                r8 = 0
                java.lang.Object r9 = kotlin.setSharedElementReturnTransition.IconCompatParcelizer$default(r3, r4, r5, r6, r7, r8)
                if (r9 != r0) goto L55
            L54:
                return r0
            L55:
                o.getShowPopup r9 = kotlin.getShowPopup.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o.requestLocationUpdates.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(int i, setSharedElementReturnTransition setsharedelementreturntransition, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.write = i;
            this.IconCompatParcelizer = setsharedelementreturntransition;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.write, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(parseDouble parsedouble, final TopUserCompanion topUserCompanion, final setSharedElementReturnTransition setsharedelementreturntransition, final InputAccessor inputAccessor, final InputAccessor inputAccessor2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        boolean z = true;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(326865016, i, -1, "com.marrow2.ui.review_components.ui.ReviewMcqListing.<anonymous>.<anonymous> (ReviewMcqListing.kt:144)");
            }
            int i2 = 0;
            for (Object obj : RemoteActionCompatParcelizer((parseDouble<? extends List<String>>) parsedouble)) {
                if (i2 < 0) {
                    IntermediateLoginResponseBody.read();
                }
                final String str = (String) obj;
                boolean z2 = IconCompatParcelizer(inputAccessor2) == i2 ? z : false;
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                long onPrepareFromUri = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                long onSetPlaybackSpeed = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed();
                boolean zRemoteActionCompatParcelizer = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i2);
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(topUserCompanion);
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setsharedelementreturntransition);
                boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(inputAccessor);
                Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                if ((zRemoteActionCompatParcelizer | zIconCompatParcelizer | zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    final int i3 = i2;
                    objOnPause = new getCreatedOnDateMs() { // from class: o.getExpirationTime
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return requestLocationUpdates.read(i3, topUserCompanion, inputAccessor2, setsharedelementreturntransition, inputAccessor);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                }
                bindItem.AudioAttributesCompatParcelizer(z2, (getCreatedOnDateMs) objOnPause, null, false, multiplyFft.AudioAttributesCompatParcelizer(-490433084, z, new MagicModuleSubmissionRequestBody() { // from class: o.getLatitude
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj2, Object obj3) {
                        return requestLocationUpdates.write(str, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
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
                _validJsonValueList.AudioAttributesCompatParcelizer(-490433084, i, -1, "com.marrow2.ui.review_components.ui.ReviewMcqListing.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReviewMcqListing.kt:147)");
            }
            _copyCurrentStringValue.IconCompatParcelizer(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ setSharedElementReturnTransition IconCompatParcelizer;
        private /* synthetic */ InputAccessor<Integer> read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setSharedElementReturnTransition setsharedelementreturntransition = this.IconCompatParcelizer;
                int i2 = this.AudioAttributesCompatParcelizer;
                int iRemoteActionCompatParcelizer = requestLocationUpdates.RemoteActionCompatParcelizer(this.read);
                this.write = 1;
                if (setSharedElementReturnTransition.IconCompatParcelizer$default(setsharedelementreturntransition, i2 * iRemoteActionCompatParcelizer, 0, this, 2, (Object) null) == objIconCompatParcelizer) {
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
        AudioAttributesCompatParcelizer(setSharedElementReturnTransition setsharedelementreturntransition, int i, InputAccessor<Integer> inputAccessor, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = setsharedelementreturntransition;
            this.AudioAttributesCompatParcelizer = i;
            this.read = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(int i, TopUserCompanion topUserCompanion, InputAccessor inputAccessor, setSharedElementReturnTransition setsharedelementreturntransition, InputAccessor inputAccessor2) {
        read((InputAccessor<Integer>) inputAccessor, i);
        C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new AudioAttributesCompatParcelizer(setsharedelementreturntransition, i, inputAccessor2, null), 3);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(setSharedElementReturnTransition setsharedelementreturntransition, final List list, final int i, final getAnswerMap getanswermap, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, setDrawerShadow setdrawershadow, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
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
                _validJsonValueList.AudioAttributesCompatParcelizer(484866707, i3, -1, "com.marrow2.ui.review_components.ui.ReviewMcqListing.<anonymous>.<anonymous> (ReviewMcqListing.kt:181)");
            }
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            getReturnTransition getreturntransitionWrite$default = getParentFragment.write$default(VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.RemoteActionCompatParcelizer(assignParameter.read(setdrawershadow.write()), assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescape, 48, 12), BitmapDescriptorFactory.HUE_RED, 2, null);
            _handleOddName.Companion companion2 = companion;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(list);
            boolean zRemoteActionCompatParcelizer = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zIconCompatParcelizer | zRemoteActionCompatParcelizer | zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.removeGeofences
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return requestLocationUpdates.write(list, i, getanswermap, magicModuleSubmissionRequestBody, (setReenterTransition) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            performContextItemSelected.write(companion2, setsharedelementreturntransition, getreturntransitionWrite$default, false, null, null, null, false, null, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape, 6, TarConstants.SPARSELEN_GNU_SPARSE);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final List list, final int i, final getAnswerMap getanswermap, final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, setReenterTransition setreentertransition) {
        toMagicModuleMetaRepoModel.write(setreentertransition, "");
        setReenterTransition.RemoteActionCompatParcelizer$default(setreentertransition, list.size(), new getAnswerMap() { // from class: o.onLocationResult
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return requestLocationUpdates.RemoteActionCompatParcelizer(list, ((Integer) obj).intValue());
            }
        }, null, multiplyFft.IconCompatParcelizer(1670467505, true, new getMagicModuleStat() { // from class: o.checkLocationSettings
            @Override // kotlin.getMagicModuleStat
            public final Object write(Object obj, Object obj2, Object obj3, Object obj4) {
                return requestLocationUpdates.IconCompatParcelizer(list, i, getanswermap, magicModuleSubmissionRequestBody, (performDestroy) obj, ((Integer) obj2).intValue(), (_handleUnrecognizedCharacterEscape) obj3, ((Integer) obj4).intValue());
            }
        }), 4, null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(List list, int i) {
        return ((createNotificationChannel) list.get(i)).getIconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(List list, int i, getAnswerMap getanswermap, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, performDestroy performdestroy, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
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
                _validJsonValueList.AudioAttributesCompatParcelizer(1670467505, i4, -1, "com.marrow2.ui.review_components.ui.ReviewMcqListing.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReviewMcqListing.kt:194)");
            }
            zzjd.RemoteActionCompatParcelizer((_handleOddName) null, i2, (createNotificationChannel) list.get(i2), i == i2, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, (MagicModuleSubmissionRequestBody<? super onDisplayInfoChanged, ? super String, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, i4 & 112, 1);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape, 6);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(InputAccessor<Integer> inputAccessor, int i) {
        inputAccessor.write(Integer.valueOf(i));
    }

    private static final List<String> RemoteActionCompatParcelizer(parseDouble<? extends List<String>> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, List list, int i, zzhs zzhsVar, getAnswerMap getanswermap, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(_handleoddname, list, i, zzhsVar, getanswermap, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }
}
