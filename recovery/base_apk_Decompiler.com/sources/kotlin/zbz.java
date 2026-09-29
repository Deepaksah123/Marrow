package kotlin;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.List;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zbz {
    public static final void RemoteActionCompatParcelizer(_handleOddName _handleoddname, final List<String> list, final int i, final int i2, final boolean z, final getAnswerMap<? super Integer, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i3, final int i4) {
        _handleOddName _handleoddname2;
        int i5;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname3;
        long jMediaBrowserCompatSearchResultReceiver;
        long jMediaBrowserCompatItemReceiver;
        long mediaSessionCompatResultReceiverWrapper;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1719512044);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i3 & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i5 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i3;
        } else {
            _handleoddname2 = _handleoddname;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i2) ? 2048 : 1024;
        }
        if ((i3 & CpioConstants.C_ISBLK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i7 = i5;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((74899 & i7) != 74898, i7 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleOddName _handleoddname4 = i6 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            int i8 = -1;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1719512044, i7, -1, "com.marrow2.ui.qbank.play.ui.McqQBankOptionsLayout (QBankOption.kt:31)");
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(909520155);
            int i9 = 0;
            for (int size = list.size(); i9 < size; size = size) {
                if (i9 != 0) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1144628803);
                    isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(12.0f)), _handleunrecognizedcharacterescapeWrite, 6);
                } else {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1122542024);
                }
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                int i10 = i + 1;
                boolean z2 = i == i9;
                boolean z3 = i10 == i2;
                boolean z4 = i10 != i2;
                boolean z5 = i != i8 && i9 + 1 == i2;
                if (z2 && z3) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1144645033);
                    MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                    jMediaBrowserCompatSearchResultReceiver = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromSearch();
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                } else if (z2 && z4) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1144647654);
                    MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                    jMediaBrowserCompatSearchResultReceiver = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromMediaId();
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                } else if (z5) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1144649961);
                    MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
                    jMediaBrowserCompatSearchResultReceiver = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromSearch();
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1144651905);
                    jMediaBrowserCompatSearchResultReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver();
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                }
                int i11 = i9 + 1;
                String str = list.get(i9);
                boolean z6 = i != -1;
                if (z2 && z4) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1144663050);
                    MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
                    jMediaBrowserCompatItemReceiver = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward();
                } else if ((z2 && z3) || z5) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1144666303);
                    MarrowTheme marrowTheme5 = MarrowTheme.INSTANCE;
                    jMediaBrowserCompatItemReceiver = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getMediaSessionCompatResultReceiverWrapper();
                } else {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1144667331);
                    jMediaBrowserCompatItemReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver();
                }
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                if (z2 && z4) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1144670506);
                    MarrowTheme marrowTheme6 = MarrowTheme.INSTANCE;
                    mediaSessionCompatResultReceiverWrapper = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward();
                } else if (z5 || (z2 && z3)) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1144673759);
                    MarrowTheme marrowTheme7 = MarrowTheme.INSTANCE;
                    mediaSessionCompatResultReceiverWrapper = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getMediaSessionCompatResultReceiverWrapper();
                } else {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1144674734);
                    MarrowTheme marrowTheme8 = MarrowTheme.INSTANCE;
                    mediaSessionCompatResultReceiverWrapper = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating();
                }
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                long j = jMediaBrowserCompatItemReceiver;
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = _handleunrecognizedcharacterescapeWrite;
                IconCompatParcelizer((_handleOddName) null, i11, str, jMediaBrowserCompatSearchResultReceiver, z6, mediaSessionCompatResultReceiverWrapper, j, z, getanswermap, _handleunrecognizedcharacterescape4, (i7 << 9) & 264241152, 1);
                i9 = i11;
                _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape4;
                i7 = i7;
                i8 = -1;
                _handleoddname4 = _handleoddname4;
            }
            _handleOddName _handleoddname5 = _handleoddname4;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname3 = _handleoddname5;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzbc
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zbz.RemoteActionCompatParcelizer(_handleoddname3, list, i, i2, z, getanswermap, i3, i4, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static void IconCompatParcelizer(_handleOddName _handleoddname, final int i, final String str, final long j, final boolean z, long j2, long j3, final boolean z2, final getAnswerMap<? super Integer, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2, final int i3) {
        int i4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname2;
        long j4;
        final long j5;
        long onSetRating;
        long jMediaBrowserCompatItemReceiver;
        _handleOddName _handleoddname3;
        long j6;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-214752532);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= ((i3 & 32) == 0 && _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j2)) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= ((i3 & 64) == 0 && _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j3)) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 67108864 : 33554432;
        }
        if (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i4 & 38347923) != 38347922, i4 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepare();
            if ((i2 & 1) != 0 && !_handleunrecognizedcharacterescapeWrite.onFastForward()) {
                _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                }
                _handleoddname3 = _handleoddname;
                j4 = j2;
                j6 = j3;
            } else {
                _handleOddName.Companion companion = i5 != 0 ? _handleOddName.INSTANCE : _handleoddname;
                if ((i3 & 32) != 0) {
                    MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                    onSetRating = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating();
                    i4 &= -458753;
                } else {
                    onSetRating = j2;
                }
                if ((i3 & 64) != 0) {
                    jMediaBrowserCompatItemReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver();
                    i4 &= -3670017;
                } else {
                    jMediaBrowserCompatItemReceiver = j3;
                }
                _handleoddname3 = companion;
                j6 = jMediaBrowserCompatItemReceiver;
                j4 = onSetRating;
            }
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-214752532, i4, -1, "com.marrow2.ui.qbank.play.ui.McqQBankOption (QBankOption.kt:75)");
            }
            int i6 = i4 & 112;
            boolean z3 = i6 == 32;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z3 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = available.RemoteActionCompatParcelizer$default(Character.valueOf(isAccessibilityFocused.write(i - 1)), null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            final InputAccessor inputAccessor = (InputAccessor) objOnPause;
            Object systemService = ((Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer())).getSystemService("vibrator");
            toMagicModuleMetaRepoModel.read(systemService, "");
            Vibrator vibrator = (Vibrator) systemService;
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            int i7 = i4;
            if (!switchToNext.RemoteActionCompatParcelizer(j, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromMediaId()) || !z2) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1805827510);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1809220832);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(vibrator);
                RemoteActionCompatParcelizer remoteActionCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if (zIconCompatParcelizer || remoteActionCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    remoteActionCompatParcelizerOnPause = new RemoteActionCompatParcelizer(vibrator, null);
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(remoteActionCompatParcelizerOnPause);
                }
                StreamReadException.IconCompatParcelizer(getshowpopup, (MagicModuleSubmissionRequestBody) remoteActionCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 6);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            setShowFastForwardButton setshowfastforwardbuttonRemoteActionCompatParcelizer = setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f));
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleoddname3, BitmapDescriptorFactory.HUE_RED, 1, null);
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = isConsumed.RemoteActionCompatParcelizer();
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            hashCode hashcode = (hashCode) objOnPause2;
            boolean z4 = (i7 & 57344) == 16384;
            boolean z5 = (i7 & 234881024) == 67108864;
            boolean z6 = i6 == 32;
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z4 | z5 | z6) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.zby
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zbz.RemoteActionCompatParcelizer(z, getanswermap, i);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            final long j7 = j4;
            final long j8 = j6;
            _handleoddname2 = _handleoddname3;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            Nulls.AudioAttributesCompatParcelizer(getLocalSavedStateRegistryOwner.IconCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer$default, hashcode, null, false, null, null, (getCreatedOnDateMs) objOnPause3, 28, null), setshowfastforwardbuttonRemoteActionCompatParcelizer, j, 0L, null, BitmapDescriptorFactory.HUE_RED, multiplyFft.AudioAttributesCompatParcelizer(1384448304, true, new MagicModuleSubmissionRequestBody() { // from class: o.zbx
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zbz.AudioAttributesCompatParcelizer(j7, str, j8, inputAccessor, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescape2, ((i7 >> 3) & 896) | 1572864, 56);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            j5 = j6;
        } else {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname2 = _handleoddname;
            j4 = j2;
            j5 = j3;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final long j9 = j4;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzbf
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zbz.IconCompatParcelizer(_handleoddname2, i, str, j, z, j9, j5, z2, getanswermap, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    private static final char IconCompatParcelizer(InputAccessor<Character> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().charValue();
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Vibrator AudioAttributesCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            this.AudioAttributesCompatParcelizer.vibrate(VibrationEffect.createOneShot(100L, -1));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(Vibrator vibrator, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = vibrator;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(boolean z, getAnswerMap getanswermap, int i) {
        if (!z) {
            getanswermap.invoke(Integer.valueOf(i - 1));
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(long j, String str, long j2, InputAccessor inputAccessor, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1384448304, i, -1, "com.marrow2.ui.qbank.play.ui.McqQBankOption.<anonymous> (QBankOption.kt:104)");
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
            char cIconCompatParcelizer = IconCompatParcelizer(inputAccessor);
            StringBuilder sb = new StringBuilder();
            sb.append(cIconCompatParcelizer);
            sb.append(")");
            _copyCurrentStringValue.IconCompatParcelizer(sb.toString(), null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 0, 65530);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape, 6);
            _copyCurrentStringValue.IconCompatParcelizer(str, null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).getMediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescape, 0, 0, 65530);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, int i, String str, long j, boolean z, long j2, long j3, boolean z2, getAnswerMap getanswermap, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(_handleoddname, i, str, j, z, j2, j3, z2, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, List list, int i, int i2, boolean z, getAnswerMap getanswermap, int i3, int i4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(_handleoddname, (List<String>) list, i, i2, z, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1), i4);
        return getShowPopup.INSTANCE;
    }
}
