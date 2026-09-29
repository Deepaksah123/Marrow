package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class getSignInAccount {
    public static final void AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final boolean z, final boolean z2, final boolean z3, final String str, final getAnswerMap<? super String, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        _handleOddName _handleoddname2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1636773562);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z3) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 8388608 : 4194304;
        }
        int i5 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((4793491 & i5) != 4793490, i5 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname2 = _handleoddname;
        } else {
            _handleOddName _handleoddname3 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1636773562, i5, -1, "com.marrow2.ui.dialogs.feedbackReport.SubmitStageLayout (SubmitStageLayout.kt:51)");
            }
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescapeWrite, 48);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname3);
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
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 48);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            _handleOddName _handleoddname4 = _handleoddname3;
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            fromAccountAndScopes fromaccountandscopes = fromAccountAndScopes.IconCompatParcelizer;
            _handleoddname2 = _handleoddname4;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            JacksonInjectValue.IconCompatParcelizer(getcreatedondatems, null, false, null, fromAccountAndScopes.IconCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, ((i5 >> 18) & 14) | CpioConstants.C_ISBLK, 14);
            _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(R.string.feedback_dialog_title, _handleunrecognizedcharacterescape2, 6), null, enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).getRemoteActionCompatParcelizer(), _handleunrecognizedcharacterescape2, 0, 0, 65530);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(10.0f)), _handleunrecognizedcharacterescape2, 6);
            if (z) {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(1423321753);
                String str2 = singleArgCreatorDefaultsToProperties.read(R.string.factual_error, _handleunrecognizedcharacterescape2, 6);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                _copyCurrentStringValue.IconCompatParcelizer(str2, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape2, 0, 0, 65530);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(6.0f)), _handleunrecognizedcharacterescape2, 6);
            } else {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(1420470962);
            }
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            if (z2) {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(1423632404);
                String str3 = singleArgCreatorDefaultsToProperties.read(R.string.confusing_question, _handleunrecognizedcharacterescape2, 6);
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                _copyCurrentStringValue.IconCompatParcelizer(str3, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape2, 0, 0, 65530);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(6.0f)), _handleunrecognizedcharacterescape2, 6);
            } else {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(1420470962);
            }
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            if (z3) {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(1423943768);
                String str4 = singleArgCreatorDefaultsToProperties.read(R.string.inadequate_exp, _handleunrecognizedcharacterescape2, 6);
                MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
                _copyCurrentStringValue.IconCompatParcelizer(str4, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape2, 0, 0, 65530);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(6.0f)), _handleunrecognizedcharacterescape2, 6);
            } else {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(1420470962);
            }
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(6.0f)), _handleunrecognizedcharacterescape2, 6);
            AudioAttributesCompatParcelizer(str, getanswermap, _handleunrecognizedcharacterescape2, (i5 >> 12) & 126);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(24.0f)), _handleunrecognizedcharacterescape2, 6);
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = addName.AudioAttributesCompatParcelizer(drawerLayoutSavedState.AudioAttributesCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(200.0f), assignParameter.IconCompatParcelizer(40.0f)), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer()), str.length() > 0 ? 1.0f : 0.5f);
            HorizontalSquareImageView horizontalSquareImageViewAudioAttributesCompatParcelizer = CleverTapInstanceConfig.write.AudioAttributesCompatParcelizer(enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(), enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(), 0L, 0L, _handleunrecognizedcharacterescape2, CleverTapInstanceConfig.IconCompatParcelizer << 12, 12);
            boolean z4 = (i5 & 57344) == 16384;
            boolean z5 = (i5 & 29360128) == 8388608;
            Object objOnPause = _handleunrecognizedcharacterescape2.onPause();
            if ((z4 | z5) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.GoogleSignInStatusCodes
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return getSignInAccount.write(str, getcreatedondatems2);
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause);
            }
            getCreatedOnDateMs getcreatedondatems3 = (getCreatedOnDateMs) objOnPause;
            fromAccountAndScopes fromaccountandscopes2 = fromAccountAndScopes.IconCompatParcelizer;
            CloseImageView.AudioAttributesCompatParcelizer(getcreatedondatems3, _handleoddnameAudioAttributesCompatParcelizer, false, null, null, null, null, horizontalSquareImageViewAudioAttributesCompatParcelizer, null, fromAccountAndScopes.AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape2, C.ENCODING_PCM_32BIT, 380);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f)), _handleunrecognizedcharacterescape2, 6);
            String str5 = singleArgCreatorDefaultsToProperties.read(R.string.text_feedback_report_error_disclaimer, _handleunrecognizedcharacterescape2, 6);
            MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str5, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesImplApi26Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape2, 0, 0, 65530);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname5 = _handleoddname2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.SignInAccount
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getSignInAccount.read(_handleoddname5, z, z2, z3, str, getanswermap, getcreatedondatems, getcreatedondatems2, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str, getCreatedOnDateMs getcreatedondatems) {
        if (str.length() > 0) {
            getcreatedondatems.invoke();
        }
        return getShowPopup.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 ??, still in use, count: 1, list:
          (r6v4 ?? I:java.lang.Object) from 0x02a9: INVOKE (r12v1 ?? I:o._handleUnrecognizedCharacterEscape), (r6v4 ?? I:java.lang.Object) INTERFACE call: o._handleUnrecognizedCharacterEscape.RemoteActionCompatParcelizer(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:435)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private static void AudioAttributesCompatParcelizer(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 ??, still in use, count: 1, list:
          (r6v4 ?? I:java.lang.Object) from 0x02a9: INVOKE (r12v1 ?? I:o._handleUnrecognizedCharacterEscape), (r6v4 ?? I:java.lang.Object) INTERFACE call: o._handleUnrecognizedCharacterEscape.RemoteActionCompatParcelizer(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:435)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r65v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    private static final boolean AudioAttributesCompatParcelizer(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String read(InputAccessor<String> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(InputAccessor<findProperty> inputAccessor, long j) {
        inputAccessor.write(findProperty.AudioAttributesCompatParcelizer(j));
    }

    private static final long write(InputAccessor<findProperty> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().getIconCompatParcelizer();
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ InputAccessor<String> AudioAttributesCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int read;
        private /* synthetic */ InputAccessor<findProperty> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getSignInAccount.read(this.AudioAttributesCompatParcelizer))) {
                getSignInAccount.write(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer);
                getSignInAccount.IconCompatParcelizer(this.write, getValueInstantiator.IconCompatParcelizer(this.RemoteActionCompatParcelizer.length()));
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(String str, InputAccessor<String> inputAccessor, InputAccessor<findProperty> inputAccessor2, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = inputAccessor;
            this.write = inputAccessor2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ secondaryCount write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            secondaryCount.RemoteActionCompatParcelizer$default(this.write, 0, 1, null);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(secondaryCount secondarycount, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.write = secondarycount;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static final void RemoteActionCompatParcelizer(InputAccessor<Boolean> inputAccessor) {
        write(inputAccessor, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(String str, int i, getAnswerMap getanswermap, InputAccessor inputAccessor, InputAccessor inputAccessor2, InputAccessor inputAccessor3, hasValueTypeDeserializer hasvaluetypedeserializer) {
        toMagicModuleMetaRepoModel.write(hasvaluetypedeserializer, "");
        String strAudioAttributesCompatParcelizer = hasvaluetypedeserializer.AudioAttributesCompatParcelizer();
        int length = str.length();
        int length2 = strAudioAttributesCompatParcelizer.length();
        int iAudioAttributesImplBaseParcelizer = findProperty.AudioAttributesImplBaseParcelizer(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer());
        if (length2 <= i) {
            write((InputAccessor<String>) inputAccessor, strAudioAttributesCompatParcelizer);
            IconCompatParcelizer(inputAccessor2, hasvaluetypedeserializer.getAudioAttributesCompatParcelizer());
            getanswermap.invoke(strAudioAttributesCompatParcelizer);
            if (length2 < i) {
                write((InputAccessor<Boolean>) inputAccessor3, false);
            }
        } else if (length2 < length) {
            write((InputAccessor<String>) inputAccessor, strAudioAttributesCompatParcelizer);
            IconCompatParcelizer(inputAccessor2, hasvaluetypedeserializer.getAudioAttributesCompatParcelizer());
            getanswermap.invoke(strAudioAttributesCompatParcelizer);
            if (strAudioAttributesCompatParcelizer.length() < i) {
                write((InputAccessor<Boolean>) inputAccessor3, false);
            }
        } else {
            if (length < i) {
                String strRemoteActionCompatParcelizer = TestGroupLSModel.RemoteActionCompatParcelizer(strAudioAttributesCompatParcelizer, i);
                int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(iAudioAttributesImplBaseParcelizer, i);
                write((InputAccessor<String>) inputAccessor, strRemoteActionCompatParcelizer);
                IconCompatParcelizer(inputAccessor2, getValueInstantiator.IconCompatParcelizer(iRemoteActionCompatParcelizer));
                getanswermap.invoke(strRemoteActionCompatParcelizer);
            }
            RemoteActionCompatParcelizer(inputAccessor3);
        }
        return getShowPopup.INSTANCE;
    }

    private static final void write(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(InputAccessor<String> inputAccessor, String str) {
        inputAccessor.write(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str, getAnswerMap getanswermap, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(str, getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, boolean z, boolean z2, boolean z3, String str, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, z, z2, z3, str, getanswermap, getcreatedondatems, getcreatedondatems2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
