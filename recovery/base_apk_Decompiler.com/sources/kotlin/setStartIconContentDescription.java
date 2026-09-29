package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow.designsystem.theme.TypeKt;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin._handleOddName;
import kotlin._skipWSOrEnd;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes4.dex */
public final class setStartIconContentDescription {

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[anyIgnorals.read.values().length];
            try {
                iArr[anyIgnorals.read.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[anyIgnorals.read.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[anyIgnorals.read.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public static final class RemoteActionCompatParcelizer implements _wrapError {
        private /* synthetic */ findAccess RemoteActionCompatParcelizer;
        final /* synthetic */ hasGetter read;

        public RemoteActionCompatParcelizer(hasGetter hasgetter, findAccess findaccess) {
            this.read = hasgetter;
            this.RemoteActionCompatParcelizer = findaccess;
        }

        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
            this.read.getLifecycle().AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
    }

    public static final void write(final _handleOddName _handleoddname, final List<FabTransformationSheetBehavior> list, final MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1999207745);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (i4 != 0) {
                _handleoddname = _handleOddName.INSTANCE;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1999207745, i3, -1, "com.marrow2.ui.video.landing.composable.DeckContainerUi (DeckContaierUi.kt:72)");
            }
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(1899863359, true, new MagicModuleSubmissionRequestBody() { // from class: o.setStartIconTintMode
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setStartIconContentDescription.read(_handleoddname, list, magicModuleSubmissionRequestBody, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        final _handleOddName _handleoddname2 = _handleoddname;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.TextInputLayoutSavedState
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setStartIconContentDescription.IconCompatParcelizer(_handleoddname2, list, magicModuleSubmissionRequestBody, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x043d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void RemoteActionCompatParcelizer(kotlin._handleOddName r33, final kotlin.FabTransformationSheetBehavior r34, final kotlin.MagicModuleSubmissionRequestBody<? super java.lang.String, ? super java.lang.String, kotlin.getShowPopup> r35, kotlin._handleUnrecognizedCharacterEscape r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 1119
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setStartIconContentDescription.RemoteActionCompatParcelizer(o._handleOddName, o.FabTransformationSheetBehavior, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float read(nextTokenToRead nexttokentoread) {
        return nexttokentoread.AudioAttributesCompatParcelizer();
    }

    private static final int IconCompatParcelizer(hasMoreBytes hasmorebytes) {
        return hasmorebytes.IconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError AudioAttributesCompatParcelizer(hasGetter hasgetter, final InputAccessor inputAccessor, StreamConstraintsException streamConstraintsException) {
        toMagicModuleMetaRepoModel.write(streamConstraintsException, "");
        findAccess findaccess = new findAccess() { // from class: o.setSuffixText
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter2, anyIgnorals.read readVar) {
                setStartIconContentDescription.RemoteActionCompatParcelizer(inputAccessor, hasgetter2, readVar);
            }
        };
        hasgetter.getLifecycle().IconCompatParcelizer(findaccess);
        return new RemoteActionCompatParcelizer(hasgetter, findaccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(InputAccessor inputAccessor, hasGetter hasgetter, anyIgnorals.read readVar) {
        toMagicModuleMetaRepoModel.write(hasgetter, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        int i = IconCompatParcelizer.IconCompatParcelizer[readVar.ordinal()];
        boolean z = true;
        if (i != 1) {
            z = (i == 2 || i == 3) ? false : read((InputAccessor<Boolean>) inputAccessor);
        }
        write((InputAccessor<Boolean>) inputAccessor, z);
    }

    private static final boolean write(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ float AudioAttributesCompatParcelizer;
        private float AudioAttributesImplApi21Parcelizer;
        private float AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ float AudioAttributesImplBaseParcelizer;
        private /* synthetic */ InputAccessor<Boolean> IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ LinearLayoutCompat<Float, setHoverListener> MediaBrowserCompatItemReceiver;
        private long MediaMetadataCompat;
        private int RatingCompat;
        private /* synthetic */ InputAccessor<Boolean> RemoteActionCompatParcelizer;
        private /* synthetic */ nextTokenToRead read;
        private /* synthetic */ int write;

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00d5, code lost:
        
            if (kotlin.LinearLayoutCompat.AudioAttributesCompatParcelizer$default(r22.MediaBrowserCompatItemReceiver, kotlin.QBankStatsResponse.write(r2), kotlin.setVerticalGravity.RemoteActionCompatParcelizer$default(r22.write, 0, kotlin.setShowText.RemoteActionCompatParcelizer(), 2, (java.lang.Object) null), null, null, r22, 12, null) != r1) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[PHI: r2 r7 r8
          0x0080: PHI (r2v9 int) = (r2v11 int), (r2v15 int) binds: [B:18:0x007e, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x0080: PHI (r7v7 float) = (r7v9 float), (r7v11 float) binds: [B:18:0x007e, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x0080: PHI (r8v4 float) = (r8v5 float), (r8v7 float) binds: [B:18:0x007e, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d5 -> B:29:0x00d8). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setStartIconContentDescription.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(float f, float f2, LinearLayoutCompat<Float, setHoverListener> linearLayoutCompat, int i, InputAccessor<Boolean> inputAccessor, nextTokenToRead nexttokentoread, InputAccessor<Boolean> inputAccessor2, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = f;
            this.AudioAttributesImplBaseParcelizer = f2;
            this.MediaBrowserCompatItemReceiver = linearLayoutCompat;
            this.write = i;
            this.RemoteActionCompatParcelizer = inputAccessor;
            this.read = nexttokentoread;
            this.IconCompatParcelizer = inputAccessor2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver, this.write, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(nextTokenToRead nexttokentoread, getKey getkey) {
        IconCompatParcelizer(nexttokentoread, (int) (getkey.getRemoteActionCompatParcelizer() >> 32));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(LinearLayoutCompat linearLayoutCompat, float f, long j, Paint paint, float f2, float f3, nextTokenToRead nexttokentoread, InputAccessor inputAccessor, findSerializer findserializer) {
        toMagicModuleMetaRepoModel.write(findserializer, "");
        findserializer.write();
        if (read(nexttokentoread) > BitmapDescriptorFactory.HUE_RED && write((InputAccessor<Boolean>) inputAccessor)) {
            findSerializer findserializer2 = findserializer;
            IconCompatParcelizer(findserializer2, ((Number) linearLayoutCompat.MediaBrowserCompatCustomActionResultReceiver()).floatValue(), f, Float.intBitsToFloat((int) findserializer.MediaBrowserCompatCustomActionResultReceiver()), j, paint);
            float fFloatValue = ((Number) linearLayoutCompat.MediaBrowserCompatCustomActionResultReceiver()).floatValue();
            IconCompatParcelizer(findserializer2, fFloatValue + f + f2, f3, Float.intBitsToFloat((int) findserializer.MediaBrowserCompatCustomActionResultReceiver()), j, paint);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, FabTransformationSheetBehavior fabTransformationSheetBehavior) {
        String str = fabTransformationSheetBehavior.read();
        if (str == null) {
            str = "";
        }
        String strAudioAttributesCompatParcelizer = fabTransformationSheetBehavior.AudioAttributesCompatParcelizer();
        magicModuleSubmissionRequestBody.invoke(str, strAudioAttributesCompatParcelizer != null ? strAudioAttributesCompatParcelizer : "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    public static final getShowPopup AudioAttributesCompatParcelizer(hasMoreBytes hasmorebytes, FabTransformationSheetBehavior fabTransformationSheetBehavior, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        ?? r13;
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-417990557, i, -1, "com.marrow2.ui.video.landing.composable.DeckContainerCard.<anonymous> (DeckContaierUi.kt:221)");
            }
            _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _handleOddName _handleoddnameIconCompatParcelizer = getParentFragment.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(companion, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnMediaButtonEvent(), null, 2, null), assignParameter.IconCompatParcelizer(12.0f));
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), readVarMediaBrowserCompatCustomActionResultReceiver, _handleunrecognizedcharacterescape, 48);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameIconCompatParcelizer);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            if (IconCompatParcelizer(hasmorebytes) == -1) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1843918205);
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1835459173);
                ViewFactoryHolder.write(getDefaultSetterInfo.RemoteActionCompatParcelizer(IconCompatParcelizer(hasmorebytes), _handleunrecognizedcharacterescape, 0), null, isAdded.AudioAttributesImplBaseParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(getview.IconCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem()), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(8.0f), BitmapDescriptorFactory.HUE_RED, 11, null), assignParameter.IconCompatParcelizer(24.0f)), null, null, BitmapDescriptorFactory.HUE_RED, null, _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 120);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = getViewLifecycleOwnerLiveData.RemoteActionCompatParcelizer$default(getview, _handleOddName.INSTANCE, 1.0f, false, 2, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameRemoteActionCompatParcelizer$default);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver2 = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName.Companion companion2 = _handleOddName.INSTANCE;
            withTypeHandler withtypehandlerIconCompatParcelizer2 = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), readVarMediaBrowserCompatCustomActionResultReceiver2, _handleunrecognizedcharacterescape, 48);
            int iHashCode3 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion2);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer3 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer3);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape6 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape6, withtypehandlerIconCompatParcelizer2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape6, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape6, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape6, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape6, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview2 = getView.INSTANCE;
            String strAudioAttributesImplBaseParcelizer = fabTransformationSheetBehavior.AudioAttributesImplBaseParcelizer();
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            C0208streamReadConstraints.write(strAudioAttributesImplBaseParcelizer, getview2.RemoteActionCompatParcelizer(_handleOddName.INSTANCE, 1.0f, false), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSkipToNext(), null, 0L, null, null, null, 0L, null, null, 0L, paramName.INSTANCE.read(), false, 1, 0, null, TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 24960, 110584);
            if (fabTransformationSheetBehavior.RemoteActionCompatParcelizer().length() <= 0 || fabTransformationSheetBehavior.write().length() != 0) {
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape;
                r13 = 0;
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-1103365155);
            } else {
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape;
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-1093970109);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(10.0f)), _handleunrecognizedcharacterescape2, 6);
                r13 = 0;
                read(fabTransformationSheetBehavior.RemoteActionCompatParcelizer(), _handleunrecognizedcharacterescape2, 0);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (fabTransformationSheetBehavior.write().length() <= 0) {
                i2 = 6;
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescape2;
                _handleunrecognizedcharacterescape3.IconCompatParcelizer(-658695495);
            } else {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-649051736);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f)), _handleunrecognizedcharacterescape2, 6);
                _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver3 = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
                _handleOddName.Companion companion3 = _handleOddName.INSTANCE;
                withTypeHandler withtypehandlerIconCompatParcelizer3 = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), readVarMediaBrowserCompatCustomActionResultReceiver3, _handleunrecognizedcharacterescape2, 48);
                int iHashCode4 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, r13));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler4 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer4 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, companion3);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer4 = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescape.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescape2.read(getcreatedondatemsIconCompatParcelizer4);
                } else {
                    _handleunrecognizedcharacterescape.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape7 = NumberOutput.read(_handleunrecognizedcharacterescape);
                NumberOutput.write(_handleunrecognizedcharacterescape7, withtypehandlerIconCompatParcelizer3, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape7, _getchardescHandleMediaPlayPauseIfPendingOnHandler4, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape7, Integer.valueOf(iHashCode4), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape7, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape7, _handleoddnameRemoteActionCompatParcelizer4, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                getView getview3 = getView.INSTANCE;
                String strWrite = fabTransformationSheetBehavior.write();
                MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
                C0208streamReadConstraints.write(strWrite, getview3.RemoteActionCompatParcelizer(_handleOddName.INSTANCE, 1.0f, r13), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), null, 0L, null, null, null, 0L, null, null, 0L, paramName.INSTANCE.read(), false, 1, 0, null, TypeKt.AudioAttributesImplApi26Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 24960, 110584);
                if (fabTransformationSheetBehavior.RemoteActionCompatParcelizer().length() <= 0) {
                    _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescape;
                    i2 = 6;
                    _handleunrecognizedcharacterescape3.IconCompatParcelizer(1195111320);
                } else {
                    _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescape;
                    _handleunrecognizedcharacterescape3.IconCompatParcelizer(1205371762);
                    i2 = 6;
                    isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(10.0f)), _handleunrecognizedcharacterescape3, 6);
                    read(fabTransformationSheetBehavior.RemoteActionCompatParcelizer(), _handleunrecognizedcharacterescape3, 0);
                }
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            _handleOddName _handleoddnameIconCompatParcelizer2 = getParentFragment.IconCompatParcelizer(isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f)), assignParameter.IconCompatParcelizer(4.0f));
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_arrow_next_topic, _handleunrecognizedcharacterescape3, i2);
            MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
            currentToken.IconCompatParcelizer(isannotationbundleRemoteActionCompatParcelizer, null, _handleoddnameIconCompatParcelizer2, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), _handleunrecognizedcharacterescape, isAnnotationBundle.read | 432, 0);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final void read(final String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(488230720);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(488230720, i2, -1, "com.marrow2.ui.video.landing.composable.BadgeChip (DeckContaierUi.kt:285)");
            }
            setShowFastForwardButton setshowfastforwardbuttonRemoteActionCompatParcelizer = setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(2.0f));
            float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            setOnAnimationStop.read(null, setshowfastforwardbuttonRemoteActionCompatParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRepeatMode(), 0L, null, fIconCompatParcelizer, multiplyFft.AudioAttributesCompatParcelizer(-1907283715, true, new MagicModuleSubmissionRequestBody() { // from class: o.setSuffixTextColor
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setStartIconContentDescription.AudioAttributesCompatParcelizer(str, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 1769472, 25);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setSuffixTextAppearance
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setStartIconContentDescription.write(str, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1907283715, i, -1, "com.marrow2.ui.video.landing.composable.BadgeChip.<anonymous> (DeckContaierUi.kt:291)");
            }
            String upperCase = str.toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            C0208streamReadConstraints.write(upperCase, getParentFragment.write(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(6.0f), assignParameter.IconCompatParcelizer(2.0f)), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getMediaSessionCompatResultReceiverWrapper(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesImplApi21Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 0, 131064);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final void IconCompatParcelizer(findSetterInfo findsetterinfo, float f, float f2, float f3, long j, Paint paint) {
        float f4 = 0.2f * f3;
        removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = writeIndentation.write();
        removesoftrefsclearedbygcWrite.IconCompatParcelizer(f + f4, BitmapDescriptorFactory.HUE_RED);
        float f5 = f2 + f;
        removesoftrefsclearedbygcWrite.write(f5 + f4, BitmapDescriptorFactory.HUE_RED);
        removesoftrefsclearedbygcWrite.write(f5 - f4, f3);
        removesoftrefsclearedbygcWrite.write(f - f4, f3);
        removesoftrefsclearedbygcWrite.read();
        JsonParserDelegate jsonParserDelegateIconCompatParcelizer = findsetterinfo.getIconCompatParcelizer().IconCompatParcelizer();
        paint.setColor(RequestPayload.IconCompatParcelizer(j));
        Canvas canvasRemoteActionCompatParcelizer = balloc.RemoteActionCompatParcelizer(jsonParserDelegateIconCompatParcelizer);
        if (removesoftrefsclearedbygcWrite instanceof getCurrentSegment) {
            canvasRemoteActionCompatParcelizer.drawPath(((getCurrentSegment) removesoftrefsclearedbygcWrite).getRemoteActionCompatParcelizer(), paint);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, List list, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1899863359, i, -1, "com.marrow2.ui.video.landing.composable.DeckContainerUi.<anonymous> (DeckContaierUi.kt:74)");
            }
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddname);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-647841511);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RemoteActionCompatParcelizer((_handleOddName) null, (FabTransformationSheetBehavior) it.next(), (MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, 0, 1);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final void IconCompatParcelizer(nextTokenToRead nexttokentoread, float f) {
        nexttokentoread.write(f);
    }

    private static final void write(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(validateAppend validateappend) {
        toMagicModuleMetaRepoModel.write(validateappend, "");
        validateappend.write(setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(8.0f)));
        validateappend.RatingCompat(assignParameter.IconCompatParcelizer(4.0f));
        validateappend.IconCompatParcelizer(true);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(str, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, FabTransformationSheetBehavior fabTransformationSheetBehavior, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(_handleoddname, fabTransformationSheetBehavior, (MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, List list, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(_handleoddname, list, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
