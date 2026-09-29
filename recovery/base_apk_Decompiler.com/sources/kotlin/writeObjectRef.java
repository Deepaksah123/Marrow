package kotlin;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.getSystemGestureInsets;
import kotlin.getTappableElementInsets;
import kotlin.isVisible;
import kotlin.setOverriddenInsets;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016"}, d2 = {"Lo/writeObjectRef;", "", "Lo/assignParameter;", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(FFFFFFLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "Lo/inset;", "Lo/parseDouble;", "RemoteActionCompatParcelizer", "(ZLo/inset;Lo/_handleUnrecognizedCharacterEscape;I)Lo/parseDouble;", "read", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "F", "MediaBrowserCompatItemReceiver", "write", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class writeObjectRef {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float read;

    private writeObjectRef(float f, float f2, float f3, float f4, float f5, float f6) {
        this.RemoteActionCompatParcelizer = f;
        this.write = f2;
        this.read = f3;
        this.IconCompatParcelizer = f4;
        this.AudioAttributesCompatParcelizer = f5;
        this.AudioAttributesImplApi26Parcelizer = f6;
    }

    public final parseDouble<assignParameter> RemoteActionCompatParcelizer(boolean z, inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-1763481333);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1763481333, i, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:655)");
        }
        if (insetVar == null) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(167751211);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = available.RemoteActionCompatParcelizer$default(assignParameter.read(this.RemoteActionCompatParcelizer), null, 2, null);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            InputAccessor inputAccessor = (InputAccessor) objOnPause;
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            return inputAccessor;
        }
        _handleunrecognizedcharacterescape.IconCompatParcelizer(167824247);
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        parseDouble<assignParameter> parsedouble = read(z, insetVar, _handleunrecognizedcharacterescape, i & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedouble;
    }

    private final parseDouble<assignParameter> read(boolean z, inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        float f;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1421890746, i, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:666)");
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = _qbuf.write();
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objOnPause;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(insetVar)) || (i & 48) == 32;
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if (z3 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = (MagicModuleSubmissionRequestBody) new read(insetVar, snapshotStateList, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        StreamReadException.IconCompatParcelizer(insetVar, (MagicModuleSubmissionRequestBody) objOnPause2, _handleunrecognizedcharacterescape, (i >> 3) & 14);
        isRound isround = (isRound) IntermediateLoginResponseBody.MediaMetadataCompat((List) snapshotStateList);
        if (!z) {
            f = this.AudioAttributesImplApi26Parcelizer;
        } else if (isround instanceof setOverriddenInsets.read) {
            f = this.write;
        } else if (isround instanceof isVisible.read) {
            f = this.IconCompatParcelizer;
        } else if (isround instanceof getTappableElementInsets.RemoteActionCompatParcelizer) {
            f = this.read;
        } else {
            f = isround instanceof getSystemGestureInsets.AudioAttributesCompatParcelizer ? this.AudioAttributesCompatParcelizer : this.RemoteActionCompatParcelizer;
        }
        float f2 = f;
        Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause3 = new LinearLayoutCompat(assignParameter.read(f2), hitCount.write(assignParameter.INSTANCE), null, null, 12, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
        }
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objOnPause3;
        assignParameter assignparameter = assignParameter.read(f2);
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(linearLayoutCompat);
        boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(f2);
        boolean z4 = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z)) || (i & 6) == 4;
        if ((((i & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) <= 256 || !_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(this)) && (i & RendererCapabilities.MODE_SUPPORT_MASK) != 256) {
            z2 = false;
        }
        boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(isround);
        Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
        if ((zIconCompatParcelizer | zIconCompatParcelizer2 | z4 | z2 | zIconCompatParcelizer3) || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause4 = (MagicModuleSubmissionRequestBody) new RemoteActionCompatParcelizer(linearLayoutCompat, f2, z, this, isround, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
        }
        StreamReadException.IconCompatParcelizer(assignparameter, (MagicModuleSubmissionRequestBody) objOnPause4, _handleunrecognizedcharacterescape, 0);
        parseDouble<assignParameter> parsedouble = linearLayoutCompat.read();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return parsedouble;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ SnapshotStateList<isRound> IconCompatParcelizer;
        int read;
        final /* synthetic */ inset write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<isRound> newNumberOtpResendRequestAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer();
                final SnapshotStateList<isRound> snapshotStateList = this.IconCompatParcelizer;
                this.read = 1;
                if (newNumberOtpResendRequestAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.writeObjectRef.read.5
                    @Override // kotlin.getValidationToken
                    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                    public final Object IconCompatParcelizer(isRound isround, SampleVideos<? super getShowPopup> sampleVideos) {
                        if (isround instanceof isVisible.read) {
                            snapshotStateList.add(isround);
                        } else if (isround instanceof isVisible.IconCompatParcelizer) {
                            snapshotStateList.remove(((isVisible.IconCompatParcelizer) isround).getWrite());
                        } else if (isround instanceof getTappableElementInsets.RemoteActionCompatParcelizer) {
                            snapshotStateList.add(isround);
                        } else if (isround instanceof getTappableElementInsets.AudioAttributesCompatParcelizer) {
                            snapshotStateList.remove(((getTappableElementInsets.AudioAttributesCompatParcelizer) isround).getRemoteActionCompatParcelizer());
                        } else if (isround instanceof setOverriddenInsets.read) {
                            snapshotStateList.add(isround);
                        } else if (isround instanceof setOverriddenInsets.write) {
                            snapshotStateList.remove(((setOverriddenInsets.write) isround).getRead());
                        } else if (isround instanceof setOverriddenInsets.IconCompatParcelizer) {
                            snapshotStateList.remove(((setOverriddenInsets.IconCompatParcelizer) isround).getRemoteActionCompatParcelizer());
                        } else if (isround instanceof getSystemGestureInsets.AudioAttributesCompatParcelizer) {
                            snapshotStateList.add(isround);
                        } else if (isround instanceof getSystemGestureInsets.IconCompatParcelizer) {
                            snapshotStateList.remove(((getSystemGestureInsets.IconCompatParcelizer) isround).getIconCompatParcelizer());
                        } else if (isround instanceof getSystemGestureInsets.write) {
                            snapshotStateList.remove(((getSystemGestureInsets.write) isround).getAudioAttributesCompatParcelizer());
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(inset insetVar, SnapshotStateList<isRound> snapshotStateList, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.write = insetVar;
            this.IconCompatParcelizer = snapshotStateList;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.write, this.IconCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ float AudioAttributesCompatParcelizer;
        final /* synthetic */ writeObjectRef AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ isRound IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        final /* synthetic */ LinearLayoutCompat<assignParameter, setHoverListener> read;
        final /* synthetic */ boolean write;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        
            if (r6.read.read(kotlin.assignParameter.read(r6.AudioAttributesCompatParcelizer), r6) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
        
            if (kotlin.writeObjectFieldValueSeparator.IconCompatParcelizer(r6.read, r6.AudioAttributesCompatParcelizer, r3, r6.IconCompatParcelizer, r6) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c3, code lost:
        
            return r0;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.RemoteActionCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L17:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto Lc4
            L1c:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                o.LinearLayoutCompat<o.assignParameter, o.setHoverListener> r7 = r6.read
                java.lang.Object r7 = r7.write()
                o.assignParameter r7 = (kotlin.assignParameter) r7
                float r7 = r7.getRemoteActionCompatParcelizer()
                float r1 = r6.AudioAttributesCompatParcelizer
                boolean r7 = kotlin.assignParameter.IconCompatParcelizer(r7, r1)
                if (r7 != 0) goto Lc4
                boolean r7 = r6.write
                if (r7 != 0) goto L4c
                o.LinearLayoutCompat<o.assignParameter, o.setHoverListener> r7 = r6.read
                float r1 = r6.AudioAttributesCompatParcelizer
                o.assignParameter r1 = kotlin.assignParameter.read(r1)
                r2 = r6
                o.SampleVideos r2 = (kotlin.SampleVideos) r2
                r6.RemoteActionCompatParcelizer = r3
                java.lang.Object r6 = r7.read(r1, r2)
                if (r6 != r0) goto Lc4
                goto Lc3
            L4c:
                o.LinearLayoutCompat<o.assignParameter, o.setHoverListener> r7 = r6.read
                java.lang.Object r7 = r7.write()
                o.assignParameter r7 = (kotlin.assignParameter) r7
                float r7 = r7.getRemoteActionCompatParcelizer()
                o.writeObjectRef r1 = r6.AudioAttributesImplApi21Parcelizer
                float r1 = kotlin.writeObjectRef.IconCompatParcelizer(r1)
                boolean r1 = kotlin.assignParameter.IconCompatParcelizer(r7, r1)
                r3 = 0
                if (r1 == 0) goto L74
                o.setOverriddenInsets$read r7 = new o.setOverriddenInsets$read
                o.getReferencedType$RemoteActionCompatParcelizer r1 = kotlin.getReferencedType.INSTANCE
                long r4 = r1.write()
                r7.<init>(r4, r3)
                r3 = r7
                o.isRound r3 = (kotlin.isRound) r3
                goto Lb2
            L74:
                o.writeObjectRef r1 = r6.AudioAttributesImplApi21Parcelizer
                float r1 = kotlin.writeObjectRef.RemoteActionCompatParcelizer(r1)
                boolean r1 = kotlin.assignParameter.IconCompatParcelizer(r7, r1)
                if (r1 == 0) goto L89
                o.isVisible$read r7 = new o.isVisible$read
                r7.<init>()
                r3 = r7
                o.isRound r3 = (kotlin.isRound) r3
                goto Lb2
            L89:
                o.writeObjectRef r1 = r6.AudioAttributesImplApi21Parcelizer
                float r1 = kotlin.writeObjectRef.AudioAttributesCompatParcelizer(r1)
                boolean r1 = kotlin.assignParameter.IconCompatParcelizer(r7, r1)
                if (r1 == 0) goto L9e
                o.getTappableElementInsets$RemoteActionCompatParcelizer r7 = new o.getTappableElementInsets$RemoteActionCompatParcelizer
                r7.<init>()
                r3 = r7
                o.isRound r3 = (kotlin.isRound) r3
                goto Lb2
            L9e:
                o.writeObjectRef r1 = r6.AudioAttributesImplApi21Parcelizer
                float r1 = kotlin.writeObjectRef.read(r1)
                boolean r7 = kotlin.assignParameter.IconCompatParcelizer(r7, r1)
                if (r7 == 0) goto Lb2
                o.getSystemGestureInsets$AudioAttributesCompatParcelizer r7 = new o.getSystemGestureInsets$AudioAttributesCompatParcelizer
                r7.<init>()
                r3 = r7
                o.isRound r3 = (kotlin.isRound) r3
            Lb2:
                o.LinearLayoutCompat<o.assignParameter, o.setHoverListener> r7 = r6.read
                float r1 = r6.AudioAttributesCompatParcelizer
                o.isRound r4 = r6.IconCompatParcelizer
                r5 = r6
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r6.RemoteActionCompatParcelizer = r2
                java.lang.Object r6 = kotlin.writeObjectFieldValueSeparator.IconCompatParcelizer(r7, r1, r3, r4, r5)
                if (r6 != r0) goto Lc4
            Lc3:
                return r0
            Lc4:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.writeObjectRef.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(LinearLayoutCompat<assignParameter, setHoverListener> linearLayoutCompat, float f, boolean z, writeObjectRef writeobjectref, isRound isround, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = linearLayoutCompat;
            this.AudioAttributesCompatParcelizer = f;
            this.write = z;
            this.AudioAttributesImplApi21Parcelizer = writeobjectref;
            this.IconCompatParcelizer = isround;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.read, this.AudioAttributesCompatParcelizer, this.write, this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof writeObjectRef)) {
            return false;
        }
        writeObjectRef writeobjectref = (writeObjectRef) p0;
        return assignParameter.IconCompatParcelizer(this.RemoteActionCompatParcelizer, writeobjectref.RemoteActionCompatParcelizer) && assignParameter.IconCompatParcelizer(this.write, writeobjectref.write) && assignParameter.IconCompatParcelizer(this.read, writeobjectref.read) && assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, writeobjectref.IconCompatParcelizer) && assignParameter.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, writeobjectref.AudioAttributesImplApi26Parcelizer);
    }

    public final int hashCode() {
        int iAudioAttributesCompatParcelizer = assignParameter.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        int iAudioAttributesCompatParcelizer2 = assignParameter.AudioAttributesCompatParcelizer(this.write);
        return (((((((iAudioAttributesCompatParcelizer * 31) + iAudioAttributesCompatParcelizer2) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.read)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
    }

    public /* synthetic */ writeObjectRef(float f, float f2, float f3, float f4, float f5, float f6, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2, f3, f4, f5, f6);
    }
}
