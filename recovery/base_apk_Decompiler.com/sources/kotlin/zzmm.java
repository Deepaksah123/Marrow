package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzmm {
    public static final void write(_handleOddName _handleoddname, final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleOddName _handleoddname3;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(117717287);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((599187 & i3) != 599186, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleOddName _handleoddname4 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(117717287, i3, -1, "com.marrow2.ui.schema.detail.ui.SchemaDetailTopBarLayout (SchemaDetailTopBarLayout.kt:28)");
            }
            MediaSessionCompatQueueItem mediaSessionCompatQueueItem = MediaSessionCompatQueueItem.INSTANCE;
            int i5 = MediaSessionCompatQueueItem.AudioAttributesCompatParcelizer;
            onSetShuffleMode onsetshufflemodeRemoteActionCompatParcelizer = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite);
            final onSetRating iconCompatParcelizer = onsetshufflemodeRemoteActionCompatParcelizer != null ? onsetshufflemodeRemoteActionCompatParcelizer.getIconCompatParcelizer() : null;
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleoddname4, BitmapDescriptorFactory.HUE_RED, 1, null);
            float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _handleoddname3 = _handleoddname4;
            pushChargedEvent.write(multiplyFft.AudioAttributesCompatParcelizer(1647954155, true, new MagicModuleSubmissionRequestBody() { // from class: o.zzmt
                private static final byte[] $$a = {115, -66, -117, -68, -19, -10, -3, 20, -6, 5};
                private static final int $$b = 71;
                private static int write = 0;
                private static int AudioAttributesCompatParcelizer = 1;

                /* JADX WARN: Removed duplicated region for block: B:77:0x06cb  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0707  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x070c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public static java.lang.Object[] IconCompatParcelizer(int r37, int r38, int r39) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 2409
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.zzmt.IconCompatParcelizer(int, int, int):java.lang.Object[]");
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void a(byte r7, int r8, int r9, java.lang.Object[] r10) {
                    /*
                        int r7 = r7 + 4
                        int r8 = r8 * 39
                        int r8 = 114 - r8
                        byte[] r0 = kotlin.zzmt.$$a
                        int r9 = r9 * 4
                        int r9 = r9 + 4
                        byte[] r1 = new byte[r9]
                        r2 = 0
                        if (r0 != 0) goto L15
                        r3 = r8
                        r4 = r2
                        r8 = r7
                        goto L2c
                    L15:
                        r3 = r2
                    L16:
                        int r7 = r7 + 1
                        int r4 = r3 + 1
                        byte r5 = (byte) r8
                        r1[r3] = r5
                        if (r4 != r9) goto L27
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        r10[r2] = r7
                        return
                    L27:
                        r3 = r0[r7]
                        r6 = r8
                        r8 = r7
                        r7 = r6
                    L2c:
                        int r7 = r7 + r3
                        int r7 = r7 + 6
                        r3 = r4
                        r6 = r8
                        r8 = r7
                        r7 = r6
                        goto L16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.zzmt.a(byte, int, int, java.lang.Object[]):void");
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzmm.write(str, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleoddnameRemoteActionCompatParcelizer$default, multiplyFft.AudioAttributesCompatParcelizer(-1047864083, true, new MagicModuleSubmissionRequestBody() { // from class: o.zzmu
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzmm.RemoteActionCompatParcelizer(iconCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), multiplyFft.AudioAttributesCompatParcelizer(-608423274, true, new getModuleData() { // from class: o.zzmr
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return zzmm.IconCompatParcelizer(z3, z4, z2, z, getcreatedondatems, (getViewLifecycleOwnerLiveData) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer(), 0L, fIconCompatParcelizer, _handleunrecognizedcharacterescapeWrite, 1576326, 32);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname5 = _handleoddname3;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzmq
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzmm.IconCompatParcelizer(_handleoddname5, str, z, z2, z3, z4, getcreatedondatems, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1647954155, i, -1, "com.marrow2.ui.schema.detail.ui.SchemaDetailTopBarLayout.<anonymous> (SchemaDetailTopBarLayout.kt:38)");
            }
            deserializeWithObjectId audioAttributesCompatParcelizer = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).getAudioAttributesCompatParcelizer();
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward(), 0L, null, null, null, 0L, null, null, 0L, paramName.INSTANCE.read(), false, 0, 0, null, audioAttributesCompatParcelizer, _handleunrecognizedcharacterescape, 0, 48, 63482);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final onSetRating onsetrating, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1047864083, i, -1, "com.marrow2.ui.schema.detail.ui.SchemaDetailTopBarLayout.<anonymous> (SchemaDetailTopBarLayout.kt:41)");
            }
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(onsetrating);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.zzms
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzmm.write(onsetrating);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            zzln zzlnVar = zzln.write;
            JacksonInjectValue.IconCompatParcelizer((getCreatedOnDateMs) objOnPause, null, false, null, zzln.AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape, CpioConstants.C_ISBLK, 14);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(onSetRating onsetrating) {
        if (onsetrating != null) {
            onsetrating.RemoteActionCompatParcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(boolean z, boolean z2, boolean z3, boolean z4, getCreatedOnDateMs getcreatedondatems, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(getviewlifecycleownerlivedata, "");
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-608423274, i, -1, "com.marrow2.ui.schema.detail.ui.SchemaDetailTopBarLayout.<anonymous> (SchemaDetailTopBarLayout.kt:51)");
            }
            if (z || z2) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-777523444);
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-579208144);
                onVisibilityChanged.AudioAttributesCompatParcelizer(null, z3, z4, 0L, 0L, getcreatedondatems, _handleunrecognizedcharacterescape, 0, 25);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, String str, boolean z, boolean z2, boolean z3, boolean z4, getCreatedOnDateMs getcreatedondatems, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(_handleoddname, str, z, z2, z3, z4, getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
