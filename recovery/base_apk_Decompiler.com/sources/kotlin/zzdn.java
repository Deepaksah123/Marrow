package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import java.util.List;
import java.util.Locale;
import kotlin.switchAndReturnNext;
import kotlin.zzea;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdn {
    public static final void write(final zzdz zzdzVar, final String str, final boolean z, final boolean z2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getAnswerMap<? super zzea, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        boolean z3;
        String str2;
        boolean z4;
        int i3;
        int i4;
        boolean z5;
        final boolean z6;
        toMagicModuleMetaRepoModel.write(zzdzVar, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(396830682);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(zzdzVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i5 = i2;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((74899 & i5) != 74898, i5 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(396830682, i5, -1, "com.marrow2.ui.qbank.score.compose.ScoreContent (ScoreContent.kt:51)");
            }
            final Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            String str3 = singleArgCreatorDefaultsToProperties.read(R.string.msg_module_already_rated, _handleunrecognizedcharacterescapeWrite, 6);
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
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
            RemoteActionCompatParcelizer(getcreatedondatems, _handleunrecognizedcharacterescapeWrite, (i5 >> 12) & 14);
            _handleOddName _handleoddname = onInflate.read(setVerticalAlign.IconCompatParcelizer(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), setVerticalAlign.write(0, _handleunrecognizedcharacterescapeWrite, 0, 1), false, null, false, 14, null));
            withTypeHandler withtypehandler2 = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandler2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState2 = DrawerLayoutSavedState.INSTANCE;
            if (!zzdzVar.getRead() || zzdzVar.getAudioAttributesImplBaseParcelizer() == null) {
                z3 = false;
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1648971636);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1651596034);
                z3 = false;
                zzci.read(zzdzVar.getAudioAttributesImplBaseParcelizer(), _handleunrecognizedcharacterescapeWrite, 0);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            if (zzdzVar.IconCompatParcelizer().isEmpty()) {
                str2 = str3;
                z4 = z3;
                i3 = i5;
                i4 = 6;
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1648971636);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1651738417);
                List<PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException> listIconCompatParcelizer = zzdzVar.IconCompatParcelizer();
                boolean read = zzdzVar.getRead();
                boolean mediaBrowserCompatCustomActionResultReceiver = zzdzVar.getMediaBrowserCompatCustomActionResultReceiver();
                int i6 = i5 & 458752;
                boolean z7 = i6 == 131072;
                Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if (z7 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new getCreatedOnDateMs() { // from class: o.zzdm
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return zzdn.write(getanswermap);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                }
                getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause;
                boolean z8 = i6 == 131072;
                Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                if (z8 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause2 = new getAnswerMap() { // from class: o.zzdp
                        private static final byte[] $$a = {TarConstants.LF_BLK, -62, -101, -125, 19, 10, 3, -20, 6, -5};
                        private static final int $$b = 178;
                        private static int write = 0;
                        private static int IconCompatParcelizer = 1;

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
                            /*
                                int r6 = r6 + 4
                                int r7 = r7 * 39
                                int r7 = 114 - r7
                                byte[] r0 = kotlin.zzdp.$$a
                                int r8 = r8 * 4
                                int r1 = r8 + 4
                                byte[] r1 = new byte[r1]
                                int r8 = r8 + 3
                                r2 = 0
                                if (r0 != 0) goto L16
                                r3 = r8
                                r4 = r2
                                goto L2e
                            L16:
                                r3 = r2
                            L17:
                                int r6 = r6 + 1
                                byte r4 = (byte) r7
                                r1[r3] = r4
                                if (r3 != r8) goto L26
                                java.lang.String r6 = new java.lang.String
                                r6.<init>(r1, r2)
                                r9[r2] = r6
                                return
                            L26:
                                int r3 = r3 + 1
                                r4 = r0[r6]
                                r5 = r3
                                r3 = r7
                                r7 = r4
                                r4 = r5
                            L2e:
                                int r7 = -r7
                                int r3 = r3 + r7
                                int r7 = r3 + 6
                                r3 = r4
                                goto L17
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.zzdp.a(short, int, int, java.lang.Object[]):void");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:32:0x027f A[PHI: r2
                          0x027f: PHI (r2v35 int) = (r2v34 int), (r2v106 int) binds: [B:31:0x027d, B:28:0x0277] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:66:0x05eb  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public static java.lang.Object[] write(int r34, int r35, int r36) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instruction units count: 2175
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kotlin.zzdp.write(int, int, int):java.lang.Object[]");
                        }

                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return zzdn.RemoteActionCompatParcelizer(getanswermap, (String) obj);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
                }
                str2 = str3;
                i4 = 6;
                z4 = false;
                i3 = i5;
                zzdi.IconCompatParcelizer(listIconCompatParcelizer, read, mediaBrowserCompatCustomActionResultReceiver, z, getcreatedondatems2, (getAnswerMap) objOnPause2, _handleunrecognizedcharacterescapeWrite, (i5 << 3) & 7168);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(40.0f)), _handleunrecognizedcharacterescapeWrite, i4);
            int i7 = i3;
            int i8 = i7 & 458752;
            boolean z9 = i8 == 131072 ? true : z4;
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z9 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.zzdr
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzdn.AudioAttributesCompatParcelizer(getanswermap);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = drawerLayoutSavedState2.AudioAttributesCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(240.0f)), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer());
            zzcc zzccVar = zzcc.IconCompatParcelizer;
            CloseImageView.AudioAttributesCompatParcelizer((getCreatedOnDateMs) objOnPause3, _handleoddnameAudioAttributesCompatParcelizer, false, null, null, null, null, null, null, zzcc.write(), _handleunrecognizedcharacterescapeWrite, C.ENCODING_PCM_32BIT, TarConstants.XSTAR_MAGIC_OFFSET);
            if (str != null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1652784326);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescapeWrite, i4);
                boolean z10 = i8 == 131072 ? true : z4;
                Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
                if (z10 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause4 = new getCreatedOnDateMs() { // from class: o.zzdq
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return zzdn.MediaBrowserCompatCustomActionResultReceiver(getanswermap);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
                }
                z5 = true;
                CloseImageView.AudioAttributesCompatParcelizer((getCreatedOnDateMs) objOnPause4, drawerLayoutSavedState2.AudioAttributesCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(240.0f)), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer()), false, null, null, null, null, CleverTapInstanceConfig.write.AudioAttributesCompatParcelizer(enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi21Parcelizer(), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(), 0L, 0L, _handleunrecognizedcharacterescapeWrite, CleverTapInstanceConfig.IconCompatParcelizer << 12, 12), null, multiplyFft.AudioAttributesCompatParcelizer(-616272693, true, new getModuleData() { // from class: o.zzdo
                    @Override // kotlin.getModuleData
                    public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                        return zzdn.read(zzdzVar, (getViewLifecycleOwnerLiveData) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                    }
                }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, C.ENCODING_PCM_32BIT, 380);
            } else {
                z5 = true;
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1648971636);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescapeWrite, i4);
            int i9 = i7 & 7168;
            boolean z11 = i9 == 2048 ? z5 : z4;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
            final String str4 = str2;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str4);
            boolean z12 = i8 == 131072 ? z5 : z4;
            Object objOnPause5 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z12 || (zIconCompatParcelizer | z11 | zAudioAttributesCompatParcelizer)) || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                z6 = z2;
                objOnPause5 = new getCreatedOnDateMs() { // from class: o.retainAll
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzdn.AudioAttributesCompatParcelizer(z6, context, str4, getanswermap);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause5);
            } else {
                z6 = z2;
            }
            getCreatedOnDateMs getcreatedondatems3 = (getCreatedOnDateMs) objOnPause5;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer2 = drawerLayoutSavedState2.AudioAttributesCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(240.0f)), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer());
            boolean z13 = i9 == 2048 ? z5 : z4;
            Object objOnPause6 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z13 || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause6 = new getAnswerMap() { // from class: o.zzdv
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zzdn.IconCompatParcelizer(z6, (validateAppend) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause6);
            }
            _handleOddName _handleoddnameIconCompatParcelizer = expand.IconCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer2, (getAnswerMap) objOnPause6);
            zzcc zzccVar2 = zzcc.IconCompatParcelizer;
            CloseImageView.RemoteActionCompatParcelizer(getcreatedondatems3, _handleoddnameIconCompatParcelizer, false, null, null, null, null, null, null, zzcc.read(), _handleunrecognizedcharacterescapeWrite, C.ENCODING_PCM_32BIT, TarConstants.XSTAR_MAGIC_OFFSET);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(24.0f)), _handleunrecognizedcharacterescapeWrite, i4);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzdt
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzdn.RemoteActionCompatParcelizer(zzdzVar, str, z, z2, getcreatedondatems, getanswermap, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getAnswerMap getanswermap) {
        getanswermap.invoke(zzea.read.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getAnswerMap getanswermap, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        getanswermap.invoke(new zzea.AudioAttributesImplApi26Parcelizer(str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getAnswerMap getanswermap) {
        getanswermap.invoke(zzea.AudioAttributesImplBaseParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(getAnswerMap getanswermap) {
        getanswermap.invoke(zzea.IconCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(zzdz zzdzVar, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        String str;
        toMagicModuleMetaRepoModel.write(getviewlifecycleownerlivedata, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-616272693, i, -1, "com.marrow2.ui.qbank.score.compose.ScoreContent.<anonymous>.<anonymous>.<anonymous> (ScoreContent.kt:109)");
            }
            if (zzdzVar.getAudioAttributesImplApi21Parcelizer()) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1605469685);
                str = singleArgCreatorDefaultsToProperties.read(R.string.btn_watch_next_video, _handleunrecognizedcharacterescape, 6);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1605572884);
                str = singleArgCreatorDefaultsToProperties.read(R.string.btn_solve_next_module, _handleunrecognizedcharacterescape, 6);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            String upperCase = str.toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            _copyCurrentStringValue.IconCompatParcelizer(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, _handleunrecognizedcharacterescape, 0, 0, 131070);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(boolean z, Context context, String str, getAnswerMap getanswermap) {
        if (z) {
            CmcdConfigurationRequestConfig.read(context, str, 0);
        } else {
            getanswermap.invoke(zzea.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(boolean z, validateAppend validateappend) {
        toMagicModuleMetaRepoModel.write(validateappend, "");
        validateappend.MediaBrowserCompatItemReceiver(z ? 0.4f : 1.0f);
        return getShowPopup.INSTANCE;
    }

    private static final void RemoteActionCompatParcelizer(final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(91819812);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(91819812, i2, -1, "com.marrow2.ui.qbank.score.compose.ScoreToolbar (ScoreContent.kt:144)");
            }
            _handleOddName _handleoddnameWrite = getParentFragment.write(onCreateOptionsMenu.read(getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null), onDestroy.RemoteActionCompatParcelizer(onPrimaryNavigationFragmentChanged.write(onCreateView.INSTANCE, _handleunrecognizedcharacterescapeWrite, 6), onOptionsItemSelected.AudioAttributesCompatParcelizer(onOptionsItemSelected.INSTANCE.AudioAttributesImplApi26Parcelizer(), onOptionsItemSelected.INSTANCE.MediaBrowserCompatItemReceiver()))), assignParameter.IconCompatParcelizer(12.0f), assignParameter.IconCompatParcelizer(8.0f));
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.IconCompatParcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 54);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameWrite);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_close, _handleunrecognizedcharacterescapeWrite, 6);
            switchAndReturnNext.Companion companion = switchAndReturnNext.INSTANCE;
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            switchAndReturnNext switchandreturnnextIconCompatParcelizer$default = switchAndReturnNext.Companion.IconCompatParcelizer$default(companion, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri(), 0, 2, null);
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            ViewFactoryHolder.write(isannotationbundleRemoteActionCompatParcelizer, null, getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(getParentFragment.IconCompatParcelizer(isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(24.0f)), assignParameter.IconCompatParcelizer(4.0f)), false, null, null, null, getcreatedondatems, 15, null), null, null, BitmapDescriptorFactory.HUE_RED, switchandreturnnextIconCompatParcelizer$default, _handleunrecognizedcharacterescape2, isAnnotationBundle.read | 48, 56);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzdj
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzdn.IconCompatParcelizer(getcreatedondatems, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(zzdz zzdzVar, String str, boolean z, boolean z2, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(zzdzVar, str, z, z2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getAnswerMap<? super zzea, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
